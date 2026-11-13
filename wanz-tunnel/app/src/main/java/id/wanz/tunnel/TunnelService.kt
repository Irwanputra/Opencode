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
import android.os.PowerManager
import android.telephony.TelephonyManager
import android.util.Log
import com.jcraft.jsch.ChannelDirectTCPIP
import com.jcraft.jsch.JSch
import com.jcraft.jsch.Session
import com.jcraft.jsch.UserInfo
import hev.htproxy.TProxyService
import java.io.DataInputStream
import java.io.File
import java.io.IOException
import java.net.Inet4Address
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.NetworkInterface
import java.net.ServerSocket
import java.net.Socket
import java.security.MessageDigest
import java.util.Base64
import java.util.Locale
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

        /** Waktu mulai terhubung (epoch ms); 0 = belum terhubung. */
        @Volatile var connectedAt: Long = 0L

        /**
         * Penghitung trafik sesi, diambil dari counter perangkat. Karena TUN
         * membawa seluruh lalu lintas aplikasi, selisih counter ini adalah
         * trafik yang benar-benar lewat tunnel.
         */
        @Volatile private var rxBase = 0L
        @Volatile private var txBase = 0L

        private fun deviceRx(): Long = android.net.TrafficStats.getTotalRxBytes()

        private fun deviceTx(): Long = android.net.TrafficStats.getTotalTxBytes()

        /** Byte yang diterima sejak tunnel naik; 0 saat belum terhubung. */
        fun sessionRx(): Long =
            if (connectedAt == 0L) 0L else (deviceRx() - rxBase).coerceAtLeast(0L)

        /** Byte yang dikirim sejak tunnel naik; 0 saat belum terhubung. */
        fun sessionTx(): Long =
            if (connectedAt == 0L) 0L else (deviceTx() - txBase).coerceAtLeast(0L)

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
    /** Jaringan di bawah VPN (Wi-Fi/seluler); dipakai untuk resolve endpoint SSH. */
    @Volatile private var underlyingNetwork: Network? = null
    private val pingStop = AtomicBoolean(false)
    @Volatile private var pingThread: Thread? = null
    private val pool = Executors.newCachedThreadPool()
    private val main = Handler(Looper.getMainLooper())

    /** WakeLock partial agar koneksi tetap hidup saat layar mati. */
    private var wakeLock: PowerManager.WakeLock? = null

    private fun acquireWakeLock() {
        if (wakeLock?.isHeld == true) return
        try {
            val pm = getSystemService(PowerManager::class.java)
            wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "WanzTunnel:tunnel").apply {
                setReferenceCounted(false)
                // Timeout panjang sekadar pengaman; dilepas saat service mati.
                acquire(10 * 60 * 60 * 1000L)
            }
            TunnelLog.add(TunnelLog.OK, "WakeLock aktif (partial, 10 jam)")
        } catch (e: Exception) {
            TunnelLog.add("WARN", "WakeLock gagal: ${e.message ?: e.javaClass.simpleName}")
        }
    }

    private fun releaseWakeLock() {
        val lock = wakeLock
        wakeLock = null
        try {
            if (lock?.isHeld == true) {
                lock.release()
                TunnelLog.add("INFO", "WakeLock dilepas")
            }
        } catch (_: Exception) {
        }
    }

    private val cb = object : ConnectivityManager.NetworkCallback() {
        override fun onAvailable(n: Network) {
            if (isVpnNetwork(n)) return
            underlyingNetwork = n
            if (running) connect()
        }

        override fun onLost(n: Network) {
            if (n == underlyingNetwork) underlyingNetwork = null
            if (!running || isVpnNetwork(n)) return
            // Mode tunggal VPN: selama TUN terpasang, hilangnya jaringan fisik
            // akan memicu onAvailable jaringan baru dan menyambung ulang.
            if (tunFd != null) return
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
        override fun showMessage(m: String?) {
            // Server message/banner dari server SSH. Banyak server mengirim
            // HTML berwarna (font color=...); ubah jadi ANSI supaya tampil
            // berwarna tanpa tag. Banner ANSI murni tetap lewat apa adanya.
            val raw = m?.trim().orEmpty()
            if (raw.isNotEmpty()) {
                TunnelLog.add(TunnelLog.BANNER, "Server Message: ${ServerBanner.toAnsi(raw)}")
            }
        }
    }

    private fun set(s: String) {
        status = s
        if (s.startsWith("Terhubung")) {
            if (connectedAt == 0L) {
                connectedAt = System.currentTimeMillis()
                rxBase = deviceRx()
                txBase = deviceTx()
            }
        } else {
            connectedAt = 0L
            rxBase = 0L
            txBase = 0L
        }
        TunnelLog.add("STATUS", s)
        onStatus?.invoke()
    }

    override fun onStartCommand(i: Intent?, f: Int, id: Int): Int {
        if (i?.action == ACTION_STOP) {
            TunnelLog.add("INFO", "Stop diminta pengguna")
            running = false
            set("Terputus")
            shut()
            stopVpn()
            releaseWakeLock()
            stopSelf()
            return START_NOT_STICKY
        }

        if (i?.action == ACTION_PING) {
            foreground()
            if (running) pool.execute { doPing(manual = true) }
            return START_NOT_STICKY
        }

        if (!running) {
            TunnelLog.add(TunnelLog.OK, "Wanz Tunnel v${BuildConfig.VERSION_NAME} • SSH tunnel + VPN")
            logEnvironment()
            TunnelLog.add("INFO", "Layanan tunnel dimulai (foreground)")
            acquireWakeLock()
            val profileId = i?.getLongExtra(EXTRA_PROFILE, 0L) ?: 0L
            profile = ProfileStore(this).get(profileId)
            pingMs = -1
            pingAt = 0L
            connectedAt = 0L
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
        releaseWakeLock()
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
        releaseWakeLock()
        pool.shutdownNow()
        set("Terputus")
        TunnelLog.add("INFO", "Layanan tunnel berhenti")
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
        val mode = "Tunnel aktif • VPN"
        val n = Notification.Builder(this, "w")
            .setSmallIcon(android.R.drawable.ic_lock_lock)
            .setContentTitle("Wanz Tunnel")
            .setContentText(mode)
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
        SlowDnsTunnel.stop()
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
                TunnelLog.add("INFO", "Profil \"${p.name}\" • ${p.user}@${p.host}:${p.port}")
                TunnelLog.add(
                    "INFO",
                    "Transport ${p.transport.uppercase()} • payload " +
                        (if (p.usePayload && p.payload.isNotBlank()) "aktif (${p.payload.length} char)" else "nonaktif") +
                        " • proxy " + p.proxy.ifBlank { "langsung" }
                )
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
                TunnelLog.add(TunnelLog.OK, "SOCKS5 lokal siap • 127.0.0.1:$port")

                val mode = "VPN"
                set("Menyiapkan VPN…")
                main.post { startVpn(p) }
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
                TunnelLog.add("WARN", "Hanya data seluler aktif. Wi-Fi terdeteksi, koneksi ditolak.")
                set("Gagal: Hanya data seluler (Wi-Fi aktif)")
                running = false
                stopSelf()
                return false
            }
        }
        if (p.blockRoot && isRooted()) {
            TunnelLog.add("WARN", "Blokir root aktif. Akses root terdeteksi, koneksi ditolak.")
            set("Gagal: Perangkat ter-root (Blokir root aktif)")
            running = false
            stopSelf()
            return false
        }
        return true
    }

    /**
     * Header bergaya HTTP Custom: perangkat, sistem, jaringan, dan IP lokal.
     * Semua dibaca nyata dari sistem; kalau tidak tersedia, ditulis apa adanya.
     */
    private fun logEnvironment() {
        val device = Build.MANUFACTURER.replaceFirstChar { it.uppercase(Locale.US) } +
            " ${Build.MODEL}"
        TunnelLog.add("INFO", "Perangkat: $device")
        TunnelLog.add(
            "INFO",
            "Sistem: Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT}) • " +
                "ABI ${Build.SUPPORTED_ABIS.firstOrNull() ?: "?"}"
        )
        val cm = getSystemService(ConnectivityManager::class.java)
        val caps = cm.getNetworkCapabilities(cm.activeNetwork)
        val net = when {
            caps == null -> "tidak ada"
            caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> "Wi-Fi"
            caps.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> "seluler"
            caps.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> "Ethernet"
            caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN) -> "VPN"
            else -> "lainnya"
        }
        val operator = try {
            getSystemService(TelephonyManager::class.java)
                ?.networkOperatorName?.trim().orEmpty()
        } catch (_: Exception) {
            ""
        }
        val ip = localIpv4()
        TunnelLog.add(
            "INFO",
            "Jaringan: $net • IP lokal $ip" + if (operator.isNotBlank()) " • operator $operator" else ""
        )
    }

    /** IPv4 non-loopback pertama (menghindari alamat virtual TUN 198.18.x.x). */
    private fun localIpv4(): String = try {
        NetworkInterface.getNetworkInterfaces().asSequence()
            .filter { it.isUp && !it.isLoopback }
            .flatMap { it.inetAddresses.asSequence() }
            .filterIsInstance<Inet4Address>()
            .firstOrNull { !it.isLoopbackAddress && !it.isLinkLocalAddress && !it.hostAddress!!.startsWith("198.18.") }
            ?.hostAddress ?: "tidak diketahui"
    } catch (_: Exception) {
        "tidak diketahui"
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
        TunnelLog.add("STATUS", "Mencoba ulang dalam 5 detik…")
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
        // SlowDNS: nyalakan terowongan DNS lebih dulu. SSH lalu masuk ke
        // listener lokal 127.0.0.1:<port> milik pustaka native dan diteruskan
        // lewat DNS ke server (upstream ditentukan server SlowDNS).
        var slowDnsPort = -1
        if (p.slowdns) {
            val cfgErr = SlowDns.validate(p)
            if (cfgErr != null) throw IOException(cfgErr)
            SlowDnsTunnel.stop()
            slowDnsPort = SlowDnsTunnel.startAndWait(p, timeoutMs = 20_000)
        }
        TunnelLog.add("SSH", "Login ${p.user}@${p.host}:${p.port} • transport ${p.transport.uppercase()}")
        TunnelLog.add("SSH", "Autentikasi: password, keyboard-interactive • timeout 20000 ms")
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
        if (slowDnsPort > 0) {
            // SSH berjalan di atas terowongan SlowDNS (loopback → DNS).
            // Socket loopback tidak masuk TUN, jadi tidak perlu protect().
            TunnelLog.add(SlowDns.TAG, "SSH melalui listener SlowDNS 127.0.0.1:$slowDnsPort")
            s.setSocketFactory(SlowDnsSocketFactory(slowDnsPort))
        } else {
            // Penting untuk mode VPN: socket SSH harus di-protect supaya tidak
            // masuk kembali ke TUN (loop VPN → SOCKS → SSH → VPN). Resolusi nama
            // endpoint juga dilakukan lewat jaringan dasar, bukan DNS VPN.
            s.setSocketFactory(
                TransportSocketFactory(
                    // "Pakai payload" bisa dimatikan dari layar utama tanpa
                    // menghapus teks payload yang sudah ditulis.
                    p.copy(payload = if (p.usePayload) p.payload else ""),
                    protect = { socket -> protectFromVpn(socket) },
                    bind = { socket -> bindOffVpn(socket) },
                    resolve = { host -> resolveOnUnderlying(host) }
                )
            )
        }
        s.connect(20_000)
        logHostKey(s)
        TunnelLog.add(TunnelLog.OK, "Autentikasi berhasil • ${p.user}@${p.host}")
        TunnelLog.add("INFO", "Kanal SSH siap • ${s.serverVersion}")
        return s
    }

    /** Fingerprint kunci host (MD5 `aa:bb:…` dan SHA-256 base64) untuk log. */
    private fun logHostKey(s: Session) {
        try {
            val hk = s.hostKey ?: return
            val raw = Base64.getDecoder().decode(hk.key)
            val md5 = MessageDigest.getInstance("MD5").digest(raw)
            val sha = MessageDigest.getInstance("SHA-256").digest(raw)
            TunnelLog.add("SSH", "Kunci host: ${hk.type}")
            TunnelLog.add(
                "SSH",
                "Fingerprint MD5: " + md5.joinToString(":") { String.format(Locale.US, "%02x", it) }
            )
            TunnelLog.add(
                "SSH",
                "Fingerprint SHA256: " + Base64.getEncoder().withoutPadding().encodeToString(sha)
            )
        } catch (e: Exception) {
            TunnelLog.add("WARN", "Fingerprint kunci host gagal: ${e.message ?: e.javaClass.simpleName}")
        }
    }

    private fun protectFromVpn(socket: Socket): Boolean = try {
        protect(socket)
    } catch (_: Exception) {
        false
    }

    /** Jaringan fisik (Wi-Fi/seluler) di bawah VPN. */
    private fun physicalNetwork(): Network? {
        val cm = getSystemService(ConnectivityManager::class.java)
        fun usable(n: Network): Boolean {
            val caps = cm.getNetworkCapabilities(n) ?: return false
            return caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET) &&
                !caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN)
        }
        underlyingNetwork?.let { if (usable(it)) return it }
        return cm.allNetworks.firstOrNull { usable(it) }
    }

    private fun bindOffVpn(socket: Socket): Boolean {
        val n = physicalNetwork() ?: return false
        return try {
            n.bindSocket(socket)
            true
        } catch (_: Exception) {
            false
        }
    }

    private fun resolveOnUnderlying(host: String): Array<InetAddress> {
        val n = physicalNetwork()
        if (n != null) {
            try {
                return n.getAllByName(host)
            } catch (e: Exception) {
                TunnelLog.add(
                    "WARN",
                    "Resolve via jaringan dasar gagal (${e.message ?: e.javaClass.simpleName}); memakai resolver sistem"
                )
            }
        }
        return InetAddress.getAllByName(host)
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
            // Tidak dilog per koneksi: trafik aplikasi bisa puluhan CONNECT
            // per detik dan membanjiri tab LOG (permintaan pemakai).

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
            set("Terhubung • VPN")
            return
        }
        try {
            val builder = Builder()
            builder.setSession("Wanz Tunnel")
            // HTTP Custom memakai MTU 1500 (0x5dc), bukan 8500.
            builder.setMtu(VpnConfig.MTU)
            builder.setBlocking(false)
            // IPv4-only, sama seperti HTTP Custom. Tanpa alamat/route IPv6:
            // route ::/0 di perangkat nyata sering membuat trafik memilih
            // jalur IPv6 yang tidak bisa diteruskan SOCKS/SSH.
            builder.addAddress(VpnConfig.VPN_ADDRESS, 32)
            builder.addRoute("0.0.0.0", 0)
            // SSH hanya meneruskan TCP, jadi DNS tidak boleh dikirim sebagai
            // UDP biasa. Selalu pakai mapped-DNS, apa pun pilihan di Settings.
            builder.addDnsServer(VpnConfig.MAPPED_DNS)
            // Sengaja TIDAK addDisallowedApplication: socket SSH di-protect
            // satu per satu (lihat dial()), sehingga app ini bisa ikut menguji
            // jalur VPN secara nyata lewat verifyVpn().
            builder.setConfigureIntent(
                PendingIntent.getActivity(
                    this, 2, Intent(this, MainActivity::class.java), PendingIntent.FLAG_IMMUTABLE
                )
            )

            val fd = builder.establish() ?: throw IOException("TUN tidak bisa dibuat")
            tunFd = fd

            val conf = File(cacheDir, "hev-socks5-tunnel.conf")
            conf.writeText(
                VpnConfig.hevConfig(p.socksPort, mappedDns = true),
                Charsets.UTF_8
            )
            TunnelLog.add(
                TunnelLog.OK,
                "TUN siap: MTU ${VpnConfig.MTU} • IPv4-only • DNS mapped ${VpnConfig.MAPPED_DNS}"
            )

            if (!TProxyService.TProxyStartService(conf.absolutePath, fd.fd)) {
                throw IOException("tun2socks gagal dijalankan")
            }
            Log.d(TAG, "tun2socks aktif, SOCKS ${p.socksPort}")
            TunnelLog.add(TunnelLog.OK, "tun2socks aktif • SOCKS 127.0.0.1:${p.socksPort}")
            set("Terhubung • VPN")
            verifyVpn(p)
        } catch (t: Throwable) {
            Log.e(TAG, "Gagal VPN", t)
            stopVpn()
            set("Gagal VPN: ${t.message ?: t.javaClass.simpleName}")
            stopSelf()
        }
    }

    /**
     * Uji internet sungguhan dari dalam app. Karena app tidak di-disallow dari
     * VPN (socket SSH sudah di-protect), socket uji di sini benar-benar masuk
     * ke TUN → hev-socks5-tunnel → SOCKS5 → SSH. Hasilnya masuk log, jadi
     * kalau perangkat masih gagal kita tahu apakah DNS atau TCP yang bermasalah.
     */
    private fun verifyVpn(p: Profile) {
        pool.execute {
            // Beri waktu Android memasang rute VPN.
            try { Thread.sleep(1_500) } catch (_: InterruptedException) { return@execute }
            if (!running || tunFd == null) return@execute

            var dnsOk = false
            try {
                val addrs = InetAddress.getAllByName("example.org")
                dnsOk = addrs.isNotEmpty()
                TunnelLog.add(
                    "VPN",
                    "Uji DNS: example.org → " + addrs.joinToString(", ") { it.hostAddress ?: "?" }
                )
            } catch (e: Exception) {
                TunnelLog.add(
                    "WARN",
                    "Uji DNS lewat VPN gagal: ${e.message ?: e.javaClass.simpleName}"
                )
            }

            val (host, port) = parsePingTarget(p.pingTarget.ifBlank { "1.1.1.1:443" })
            var tcpOk = false
            // Beberapa perangkat butuh waktu lebih untuk mengaktifkan tun.
            repeat(3) { attempt ->
                if (tcpOk || !running || tunFd == null) return@repeat
                try {
                    Socket().use { s ->
                        s.connect(InetSocketAddress(host, port), 7_000)
                        tcpOk = true
                    }
                } catch (e: Exception) {
                    if (attempt == 2) {
                        TunnelLog.add(
                            "WARN",
                            "Uji TCP lewat VPN gagal ($host:$port): ${e.message ?: e.javaClass.simpleName}"
                        )
                    } else {
                        try { Thread.sleep(2_000) } catch (_: InterruptedException) { return@execute }
                    }
                }
            }

            if (!running || tunFd == null) return@execute
            if (tcpOk && dnsOk) {
                TunnelLog.add(
                    TunnelLog.OK,
                    "Internet OK • trafik aplikasi lewat tunnel (TCP $host:$port + DNS)"
                )
                set("Terhubung • VPN • internet OK")
            } else {
                set("Terhubung • VPN • internet gagal")
            }
        }
    }

    private fun stopVpn() {
        val fd = tunFd ?: return
        tunFd = null
        try { TProxyService.TProxyStopService() } catch (_: Throwable) {}
        try { fd.close() } catch (_: Exception) {}
    }
}
