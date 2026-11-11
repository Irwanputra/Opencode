package id.wanz.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.ConnectivityManager
import android.net.Network
import android.os.Build
import android.os.IBinder
import com.jcraft.jsch.ChannelDirectTCPIP
import com.jcraft.jsch.JSch
import com.jcraft.jsch.Proxy
import com.jcraft.jsch.Session
import com.jcraft.jsch.SocketFactory
import com.jcraft.jsch.UserInfo
import java.io.DataInputStream
import java.io.File
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Tunnel SSH -> SOCKS5 lokal (127.0.0.1:1080).
 * Hemat baterai: tanpa polling, tanpa wake lock, tanpa kompresi.
 * Koneksi ulang hanya dipicu event (jaringan berganti / lalu lintas gagal).
 */
class TunnelService : Service() {
    companion object {
        @Volatile var running = false
        @Volatile var status = "Terputus"
        @Volatile var onStatus: (() -> Unit)? = null
        const val PORT = 1080
    }

    private val busy = AtomicBoolean(false)
    @Volatile private var session: Session? = null
    @Volatile private var server: ServerSocket? = null
    private val pool = Executors.newCachedThreadPool()

    private val cb = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(n: Network) { if (running) connect() }
        override fun onLost(n: Network) { if (running) set("Menunggu jaringan…") }
    }

    // Trust-on-first-use: kunci host disimpan saat pertama, ditolak jika berubah.
    private val ui = object : UserInfo {
        override fun getPassphrase(): String? = null
        override fun getPassword(): String? = null
        override fun promptPassword(m: String?) = false
        override fun promptPassphrase(m: String?) = false
        override fun promptYesNo(m: String?) = m?.contains("CHANGED") != true
        override fun showMessage(m: String?) {}
    }

    private fun set(s: String) { status = s; onStatus?.invoke() }

    override fun onBind(i: Intent?): IBinder? = null

    override fun onStartCommand(i: Intent?, f: Int, id: Int): Int {
        if (i?.action == "stop") { stopSelf(); return START_NOT_STICKY }
        foreground()
        if (!running) {
            running = true
            set("Menunggu jaringan…")
            getSystemService(ConnectivityManager::class.java).registerDefaultNetworkCallback(cb)
        }
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        running = false
        try { getSystemService(ConnectivityManager::class.java).unregisterNetworkCallback(cb) } catch (_: Exception) {}
        shut()
        pool.shutdownNow()
        set("Terputus")
    }

    private fun foreground() {
        getSystemService(NotificationManager::class.java)
            .createNotificationChannel(NotificationChannel("w", "Wanz Tunnel", NotificationManager.IMPORTANCE_MIN))
        val open = PendingIntent.getActivity(this, 0, Intent(this, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE)
        val stop = PendingIntent.getService(this, 1, Intent(this, TunnelService::class.java).setAction("stop"), PendingIntent.FLAG_IMMUTABLE)
        val n = Notification.Builder(this, "w")
            .setSmallIcon(android.R.drawable.ic_lock_lock)
            .setContentTitle("Wanz Tunnel")
            .setContentText("Tunnel SSH aktif")
            .setContentIntent(open)
            .addAction(Notification.Action.Builder(0, "Putuskan", stop).build())
            .build()
        if (Build.VERSION.SDK_INT >= 34) startForeground(1, n, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
        else startForeground(1, n)
    }

    private fun shut() {
        try { server?.close() } catch (_: Exception) {}
        try { session?.disconnect() } catch (_: Exception) {}
        server = null; session = null
    }

    private fun connect() {
        if (!busy.compareAndSet(false, true)) return
        Thread {
            var srv: ServerSocket? = null
            try {
                shut()
                set("Menghubungkan…")
                val s = dial()
                srv = ServerSocket(PORT, 64, InetAddress.getByName("127.0.0.1"))
                session = s; server = srv
                set("Terhubung, SOCKS5 127.0.0.1:$PORT")
                busy.set(false)
                while (true) { val c = srv.accept(); pool.execute { socks(c, s) } }
            } catch (e: Exception) {
                if (srv == null) busy.set(false)
                if (running && srv?.isClosed != true) set("Gagal: ${e.message}")
            }
        }.start()
    }

    private fun dial(): Session {
        val p = getSharedPreferences("cfg", MODE_PRIVATE)
        fun g(k: String) = p.getString(k, "")!!.trim()
        val host = g("host")
        val port = g("port").toIntOrNull() ?: 22
        val js = JSch().apply { setKnownHosts(File(filesDir, "known_hosts").path) }
        val s = js.getSession(g("user"), host, port)
        s.setPassword(p.getString("pass", "") ?: "")
        s.userInfo = ui
        s.setConfig("StrictHostKeyChecking", "ask")
        s.setConfig("PreferredAuthentications", "password,keyboard-interactive")
        s.setServerAliveInterval(120_000)
        s.setServerAliveCountMax(3)
        val proxy = g("proxy")
        val payload = p.getString("payload", "")!!.trim()
        if (proxy.isNotEmpty() || payload.isNotEmpty()) {
            val ph = proxy.substringBefore(":").ifEmpty { host }
            val pp = proxy.substringAfter(":", "").toIntOrNull() ?: (if (proxy.isEmpty()) port else 8080)
            s.setProxy(PayloadProxy(ph, pp, payload))
        }
        s.connect(20_000)
        return s
    }

    /** SOCKS5 (CONNECT saja, tanpa auth) -> kanal direct-tcpip SSH. DNS diselesaikan di sisi server. */
    private fun socks(c: Socket, s: Session) {
        try {
            c.tcpNoDelay = true
            val d = DataInputStream(c.getInputStream())
            val o = c.getOutputStream()
            if (d.readUnsignedByte() != 5) throw IOException()
            d.readFully(ByteArray(d.readUnsignedByte()))
            o.write(byteArrayOf(5, 0))
            val h = ByteArray(4); d.readFully(h)
            if (h[1].toInt() != 1) throw IOException()
            val host = when (h[3].toInt()) {
                1 -> InetAddress.getByAddress(ByteArray(4).also { d.readFully(it) }).hostAddress
                4 -> InetAddress.getByAddress(ByteArray(16).also { d.readFully(it) }).hostAddress
                3 -> String(ByteArray(d.readUnsignedByte()).also { d.readFully(it) })
                else -> throw IOException()
            }
            val port = d.readUnsignedShort()
            o.write(byteArrayOf(5, 0, 0, 1, 0, 0, 0, 0, 0, 0))
            val ch = s.openChannel("direct-tcpip") as ChannelDirectTCPIP
            ch.setHost(host); ch.setPort(port)
            ch.setInputStream(c.getInputStream()); ch.setOutputStream(o)
            ch.connect(10_000)
        } catch (e: Exception) {
            try { c.close() } catch (_: Exception) {}
            if (running && s === session && !s.isConnected) { set("Terputus, menyambung ulang…"); connect() }
        }
    }
}

/**
 * Mengirim payload HTTP ke proxy (atau langsung ke server SSH bila proxy kosong),
 * membaca balasan header, lalu menyerahkan soket ke SSH.
 * Placeholder: [host_port] [host] [port] [crlf] [cr] [lf]
 */
class PayloadProxy(private val ph: String, private val pp: Int, private val payload: String) : Proxy {
    private var sock: Socket? = null

    override fun connect(sf: SocketFactory?, host: String, port: Int, timeout: Int) {
        val s = Socket()
        s.connect(InetSocketAddress(ph, pp), if (timeout > 0) timeout else 15_000)
        s.tcpNoDelay = true
        sock = s
        val tpl = payload.ifEmpty { "CONNECT [host_port] HTTP/1.1[crlf]Host: [host_port][crlf][crlf]" }
        val req = tpl.replace("\r\n", "\n").replace("\n", "\r\n")
            .replace("[host_port]", "$host:$port").replace("[host]", host).replace("[port]", "$port")
            .replace("[crlf]", "\r\n").replace("[cr]", "\r").replace("[lf]", "\n")
            .replace("\\r", "\r").replace("\\n", "\n")
        s.getOutputStream().apply { write(req.toByteArray(Charsets.ISO_8859_1)); flush() }
        s.soTimeout = 15_000
        val ins = s.getInputStream()
        val head = StringBuilder()
        while (!head.endsWith("\r\n\r\n")) {
            val b = ins.read()
            if (b < 0) throw IOException("Proxy menutup koneksi")
            head.append(b.toChar())
            if (head.length > 8192) throw IOException("Balasan proxy terlalu panjang")
        }
        s.soTimeout = 0
        val code = head.split(' ').getOrNull(1)?.toIntOrNull() ?: 0
        if (code !in 200..299 && code != 101) throw IOException("Proxy menolak: ${head.lineSequence().first()}")
    }

    override fun getInputStream(): InputStream = sock!!.getInputStream()
    override fun getOutputStream(): OutputStream = sock!!.getOutputStream()
    override fun getSocket(): Socket? = sock
    override fun close() { try { sock?.close() } catch (_: Exception) {} }
}
