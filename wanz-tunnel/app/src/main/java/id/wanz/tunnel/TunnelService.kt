package id.wanz.tunnel

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.ServiceInfo
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.VpnService
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.ParcelFileDescriptor
import android.util.Log
import com.jcraft.jsch.ChannelDirectTCPIP
import com.jcraft.jsch.JSch
import com.jcraft.jsch.Session
import com.jcraft.jsch.UserInfo
import hev.htproxy.TProxyService
import java.io.DataInputStream
import java.io.File
import java.io.IOException
import java.net.InetAddress
import java.net.ServerSocket
import java.net.Socket
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicBoolean

/**
 * Menjalankan SSH tunnel, SOCKS5 lokal, dan (opsional) VpnService + tun2socks.
 *
 * Mode proxy : hanya membuka SOCKS5 di 127.0.0.1:<port>.
 * Mode VPN   : membuat TUN, lalu hev-socks5-tunnel mengarahkan seluruh TCP
 *              aplikasi ke SOCKS5 lokal tersebut. DNS memakai mapped-DNS
 *              sehingga nama domain tetap diselesaikan di sisi server SSH.
 */
class TunnelService : VpnService() {
    companion object {
        private const val TAG = "WanzTunnel"

        @Volatile var running = false
        @Volatile var status = "Terputus"
        @Volatile var onStatus: (() -> Unit)? = null

        /** Hasil ping terakhir (ms); -1 = belum/timeout. */
        @Volatile var pingMs: Int = -1
        @Volatile var pingAt: Long = 0L

        const val ACTION_START = "start"
        const val ACTION_STOP = "stop"
        const val ACTION_PING = "ping"
        const val EXTRA_PROFILE = "profileId"

        /** "host:port" → Pair(host, port); default 443 bila port tidak valid. */
        internal fun parsePingTarget(target: String): Pair<String, Int> {
            val t = target.trim().ifBlank { "1.1.1.1:443" }
            val host = t.substringBeforeLast(':', t).trim().ifBlank { "1.1.1.1" }
            val port = t.substringAfterLast(':', "443").trim().toIntOrNull()
                ?.takeIf { it in 1..65535 } ?: 443
            return host to port
        }
    }

    private val busy = AtomicBoolean(false)
    @Volatile private var session: Session? = null
    @Volatile private var server: ServerSocket? = null
    @Volatile private var profile: Profile? = null
    @Volatile private var tunFd: ParcelFileDescriptor? = null
    private val pingStop = AtomicBoolean(false)
    @Volatile private var pingThread: Thread? = null
    private val pool = Executors.newCachedThreadPool()
    private val main = Handler(Looper.getMainLooper())

    private val cb = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(n: Network) {
            if (running && !isVpnNetwork(n)) connect()
        }

        override fun onLost(n: Network) {
            if (!running || isVpnNetwork(n)) return
            if (profile?.vpn == true && tunFd != null) return
            set("Menunggu jaringan…")
        }
    }

    private fun isVpnNetwork(n: Network): Boolean {
        val cm = getSystemService(ConnectivityManager::class.java)
        return cm.getNetworkCapabilities(n)
            ?.hasTransport(NetworkCapabilities.TRANSPORT_VPN) == true
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

    private fun set(s: String) {
        status = s
        TunnelLog.add("STATUS", s)
        onStatus?.invoke()
    }

    override fun onStartCommand(i: Intent?, f: Int, id: Int): Int {
        if (i?.action == ACTION_STOP) {
            running = false
            set("Terputus")
            shut()
            stopVpn()
            stopSelf()
            return START_NOT_STICKY
        }

        if (i?.action == ACTION_PING) {
            foreground()
            if (running) pool.execute { doPing(manual = true) }
            return START_NOT_STICKY
        }

        if (!running) {
            TunnelLog.add(
                "INFO",
                "Perangkat: ${Build.MANUFACTURER} ${Build.MODEL} • Android ${Build.VERSION.RELEASE} " +
                    "(API ${Build.VERSION.SDK_INT}) • ABI ${Build.SUPPORTED_ABIS.joinToString(",")}"
            )
            val profileId = i?.getLongExtra(EXTRA_PROFILE, 0L) ?: 0L
            profile = ProfileStore(this).get(profileId)
            pingMs = -1
            pingAt = 0L
            running = true
            foreground()
            set("Menunggu jaringan…")
            getSystemService(ConnectivityManager::class.java).registerDefaultNetworkCallback(cb)
            connect()
        } else {
            foreground()
        }
        return START_NOT_STICKY
    }

    override fun onRevoke() {
        set("VPN dicabut")
        stopSelf()
        super.onRevoke()
    }

    override fun onDestroy() {
        running = false
        stopPing()
        try {
            getSystemService(ConnectivityManager::class.java).unregisterNetworkCallback(cb)
        } catch (_: Exception) {
        }
        main.removeCallbacksAndMessages(null)
        shut()
        stopVpn()
        pool.shutdownNow()
        set("Terputus")
        super.onDestroy()
    }

    private fun foreground() {
        val manager = getSystemService(NotificationManager::class.java)
        manager.createNotificationChannel(
            NotificationChannel("w", "Wanz Tunnel", NotificationManager.IMPORTANCE_MIN)
        )
        val open = PendingIntent.getActivity(
            this, 0, Intent(this, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE
        )
        val stop = PendingIntent.getService(
            this, 1,
            Intent(this, TunnelService::class.java).setAction(ACTION_STOP),
            PendingIntent.FLAG_IMMUTABLE
        )
        val mode = if (profile?.vpn == true) "VPN + SOCKS5" else "SOCKS5"
        val n = Notification.Builder(this, "w")
            .setSmallIcon(android.R.drawable.ic_lock_lock)
            .setContentTitle("Wanz Tunnel")
            .setContentText("Tunnel aktif • $mode")
            .setContentIntent(open)
            .addAction(
                Notification.Action.Builder(
                    android.R.drawable.ic_menu_close_clear_cancel, "Putuskan", stop
                ).build()
            )
            .build()
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(1, n, ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE)
        } else {
            startForeground(1, n)
        }
    }

    private fun shut() {
        stopPing()
        try { server?.close() } catch (_: Exception) {}
        try { session?.disconnect() } catch (_: Exception) {}
        server = null
        session = null
    }

    private fun connect() {
        if (!busy.compareAndSet(false, true)) return
        val p = profile ?: run { busy.set(false); return }
        Thread {
            var srv: ServerSocket? = null
            var s: Session? = null
            try {
                shut()
                set("Menghubungkan…")
                if (!policiesOk(p)) {
                    busy.set(false)
                    return@Thread
                }
                s = dial(p)
                val port = p.socksPort.coerceIn(1024, 65535)
                srv = ServerSocket(port, 64, InetAddress.getByName("127.0.0.1"))
                session = s
                server = srv
                busy.set(false)
                TunnelLog.add("SOCKS", "SOCKS5 siap di 127.0.0.1:$port")

                val mode = if (p.vpn) "VPN" else "SOCKS5 127.0.0.1:$port"
                set("Terhubung • $mode")
                if (p.vpn) main.post { startVpn(p) }
                startPing(p)

                while (true) {
                    val c = srv.accept()
                    pool.execute { socks(c, s) }
                }
            } catch (e: Exception) {
                if (srv == null) busy.set(false)
                try { s?.disconnect() } catch (_: Exception) {}
                if (running && srv?.isClosed != true) {
                    set("Gagal: ${e.message ?: e.javaClass.simpleName}")
                    if (p.autoReconnect) scheduleRetry() else set("Terputus")
                }
            }
        }.start()
    }

    /**
     * Kebijakan bergaya HTTP Custom: hanya data seluler & blokir root.
     * Mengembalikan false bila koneksi harus dibatalkan.
     */
    private fun policiesOk(p: Profile): Boolean {
        if (p.onlyMobileData) {
            val cm = getSystemService(ConnectivityManager::class.java)
            val caps = cm.getNetworkCapabilities(cm.activeNetwork)
            val onWifi = caps?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true ||
                caps?.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) == true
            if (onWifi) {
                TunnelLog.add("WARN", "Hanya data seluler aktif — Wi-Fi terdeteksi, koneksi ditolak")
                set("Gagal: Hanya data seluler (Wi-Fi aktif)")
                running = false
                stopSelf()
                return false
            }
        }
        if (p.blockRoot && isRooted()) {
            TunnelLog.add("WARN", "Blokir root aktif — akses root terdeteksi, koneksi ditolak")
            set("Gagal: Perangkat ter-root (Blokir root aktif)")
            running = false
            stopSelf()
            return false
        }
        return true
    }

    private fun isRooted(): Boolean {
        val paths = arrayOf(
            "/system/bin/su", "/system/xbin/su", "/sbin/su", "/su/bin/su",
            "/system/app/Superuser.apk", "/system/xbin/daemonsu"
        )
        if (paths.any { File(it).exists() }) return true
        return try {
            val proc = Runtime.getRuntime().exec(arrayOf("which", "su"))
            val found = proc.inputStream.bufferedReader().readText().trim().isNotEmpty()
            proc.destroy()
            found
        } catch (_: Exception) {
            false
        }
    }

    private fun scheduleRetry() {
        TunnelLog.add("STATUS", "Mencoba ulang dalam 5 detik...")
        main.postDelayed({
            if (running) connect()
        }, 5_000)
    }

    // ---------------------------------------------------------------- ping

    private fun startPing(p: Profile) {
        if (!p.autoPing) return
        stopPing()
        pingStop.set(false)
        val intervalMs = p.pingInterval.coerceIn(5, 300) * 1000L
        TunnelLog.add("PING", "Auto ping aktif tiap ${p.pingInterval.coerceIn(5, 300)} dtk → ${p.pingTarget}")
        pingThread = Thread {
            // Ping pertama langsung agar angkanya cepat muncul.
            if (!pingStop.get() && running) doPing(manual = false)
            while (!pingStop.get() && running) {
                try {
                    Thread.sleep(intervalMs)
                } catch (_: InterruptedException) {
                    break
                }
                if (pingStop.get() || !running) break
                doPing(manual = false)
            }
        }.apply {
            isDaemon = true
            name = "wanz-ping"
            start()
        }
    }

    private fun stopPing() {
        pingStop.set(true)
        pingThread?.interrupt()
        pingThread = null
    }

    private fun doPing(manual: Boolean) {
        val p = profile ?: return
        if (!running) return
        val s = session ?: return
        val (host, port) = parsePingTarget(p.pingTarget.ifBlank { "1.1.1.1:443" })
        val ms = channelPing(s, host, port)
        if (!running) return
        if (ms >= 0) {
            pingMs = ms
            pingAt = System.currentTimeMillis()
            TunnelLog.add("PING", "$ms ms" + if (manual) " (manual)" else "")
        } else {
            pingMs = -1
            pingAt = System.currentTimeMillis()
            TunnelLog.add("PING", "timeout" + if (manual) " (manual)" else "")
        }
        onStatus?.invoke()
    }

    /**
     * Ukur RTT end-to-end lewat kanal SSH: buka direct-tcpip ke target lalu
     * tutup lagi. Ini mengukur jalur server SSH sebenarnya (bukan ICMP lokal)
     * tanpa mengotori log dengan entri SOCKS.
     */
    private fun channelPing(s: Session, host: String, port: Int): Int {
        var ch: ChannelDirectTCPIP? = null
        return try {
            val start = System.nanoTime()
            ch = s.openChannel("direct-tcpip") as ChannelDirectTCPIP
            ch.setHost(host)
            ch.setPort(port)
            ch.connect(8_000)
            ((System.nanoTime() - start) / 1_000_000L).toInt()
        } catch (_: Exception) {
            -1
        } finally {
            try { ch?.disconnect() } catch (_: Exception) {}
        }
    }

    private fun dial(p: Profile): Session {
        TunnelLog.add(
            "SSH",
            "Login ${p.user}@${p.host}:${p.port} • transport ${p.transport.uppercase()}"
        )
        val js = JSch().apply {
            setKnownHosts(File(filesDir, "known_hosts").path)
        }
        val s = js.getSession(p.user.trim(), p.host.trim(), p.port.takeIf { it in 1..65535 } ?: 22)
        s.setPassword(p.pass)
        s.userInfo = ui
        s.setConfig("StrictHostKeyChecking", "ask")
        s.setConfig("PreferredAuthentications", "password,keyboard-interactive")
        s.setServerAliveInterval(120_000)
        s.setServerAliveCountMax(3)
        s.setSocketFactory(TransportSocketFactory(p))
        s.connect(20_000)
        TunnelLog.add("SSH", "Autentikasi SSH berhasil")
        return s
    }

    /**
     * SOCKS5 (CONNECT saja) -> kanal direct-tcpip SSH.
     * Balasan sukses baru dikirim setelah kanal SSH benar-benar tersambung.
     */
    private fun socks(c: Socket, s: Session) {
        var channel: ChannelDirectTCPIP? = null
        try {
            c.tcpNoDelay = true
            val d = DataInputStream(c.getInputStream())
            val o = c.getOutputStream()

            if (d.readUnsignedByte() != 5) throw IOException("Bukan SOCKS5")
            d.readFully(ByteArray(d.readUnsignedByte()))
            o.write(byteArrayOf(5, 0))
            o.flush()

            val h = ByteArray(4)
            d.readFully(h)
            if (h[1].toInt() != 1) {
                // UDP ASSOCIATE tidak didukung: tolak dengan "command not supported".
                o.write(byteArrayOf(5, 7, 0, 1, 0, 0, 0, 0, 0, 0))
                o.flush()
                c.close()
                return
            }
            val host = when (h[3].toInt()) {
                1 -> InetAddress.getByAddress(ByteArray(4).also { d.readFully(it) }).hostAddress
                4 -> InetAddress.getByAddress(ByteArray(16).also { d.readFully(it) }).hostAddress
                3 -> String(ByteArray(d.readUnsignedByte()).also { d.readFully(it) }, Charsets.UTF_8)
                else -> throw IOException("Alamat tidak dikenal")
            }
            val port = d.readUnsignedShort()
            Log.d(TAG, "SOCKS CONNECT $host:$port")
            TunnelLog.add("SOCKS", "CONNECT $host:$port")

            channel = s.openChannel("direct-tcpip") as ChannelDirectTCPIP
            channel.setHost(host)
            channel.setPort(port)
            channel.setInputStream(c.getInputStream())
            channel.setOutputStream(o)
            channel.connect(10_000)

            // Sukses: baru kirim setelah channel SSH tersambung.
            o.write(byteArrayOf(5, 0, 0, 1, 0, 0, 0, 0, 0, 0))
            o.flush()
        } catch (e: Exception) {
            Log.w(TAG, "SOCKS gagal: ${e.message}")
            try {
                val o = c.getOutputStream()
                o.write(byteArrayOf(5, 1, 0, 1, 0, 0, 0, 0, 0, 0))
                o.flush()
            } catch (_: Exception) {
            }
            try { channel?.disconnect() } catch (_: Exception) {}
            try { c.close() } catch (_: Exception) {}
            if (running && s === session && !s.isConnected) {
                set("Terputus, menyambung ulang…")
                connect()
            }
        }
    }

    private fun startVpn(p: Profile) {
        if (!running) return
        if (tunFd != null) {
            set("Terhubung • VPN + SOCKS5 127.0.0.1:${p.socksPort}")
            return
        }
        try {
            val builder = Builder()
            builder.setSession("Wanz Tunnel")
            builder.setMtu(8500)
            builder.setBlocking(false)
            builder.addAddress("198.18.0.1", 32)
            builder.addAddress("fc00::1", 128)
            builder.addRoute("0.0.0.0", 0)
            builder.addRoute("::", 0)
            val dns = if (p.mappedDns) "198.18.0.2" else p.dnsServer.ifBlank { "1.1.1.1" }
            builder.addDnsServer(dns)
            try {
                builder.addDisallowedApplication(packageName)
            } catch (_: Exception) {
            }
            builder.setConfigureIntent(
                PendingIntent.getActivity(
                    this, 2, Intent(this, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE
                )
            )

            val fd = builder.establish() ?: throw IOException("TUN tidak bisa dibuat")
            tunFd = fd

            val conf = File(cacheDir, "hev-socks5-tunnel.conf")
            val mapDns = if (p.mappedDns) {
                """
                  mapdns:
                    address: 198.18.0.2
                    port: 53
                    network: 240.0.0.0
                    netmask: 240.0.0.0
                    cache-size: 10000
                """.trimIndent()
            } else {
                ""
            }
            conf.writeText(
                """
                tunnel:
                  mtu: 8500
                  icmp: 'reply'
                socks5:
                  port: ${p.socksPort.coerceIn(1024, 65535)}
                  address: '127.0.0.1'
                  udp: 'off'
                $mapDns
                misc:
                  task-stack-size: 86016
                  connect-timeout: 10000
                  log-level: warn
                """.trimIndent(),
                Charsets.UTF_8
            )

            if (!TProxyService.TProxyStartService(conf.absolutePath, fd.fd)) {
                throw IOException("tun2socks gagal dijalankan")
            }
            Log.d(TAG, "tun2socks aktif, SOCKS ${p.socksPort}")
            set("Terhubung • VPN + SOCKS5 127.0.0.1:${p.socksPort}")
        } catch (t: Throwable) {
            Log.e(TAG, "Gagal VPN", t)
            stopVpn()
            set("Gagal VPN: ${t.message ?: t.javaClass.simpleName}")
            stopSelf()
        }
    }

    private fun stopVpn() {
        val fd = tunFd ?: return
        tunFd = null
        try { TProxyService.TProxyStopService() } catch (_: Throwable) {}
        try { fd.close() } catch (_: Exception) {}
    }
}
