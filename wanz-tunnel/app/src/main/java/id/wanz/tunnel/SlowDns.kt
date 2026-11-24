package id.wanz.tunnel

import com.jcraft.jsch.SocketFactory
import id.wanz.slowdns.Logger
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket

/** Alias singkat kelas binding native (gomobile, paket id.wanz.slowdns). */
private typealias NativeSlowDns = id.wanz.slowdns.Slowdns

/**
 * Konfigurasi & validasi SlowDNS, mengikuti pilihan pada HTTP Custom 8.1.5.
 *
 * Tipe record query (label HC 8.1.5):
 * - AUTO : kalibrasi otomatis, coba NULL → TXT → RX → VX → tipe lama
 * - NULL : tipe "licin", jarang disentuh resolver (favorit HTTP Custom)
 * - TXT  : cara klasik dnstt
 * - FT   : Full TXT — mode Standard atau Compact (padding diperkecil)
 * - ST   : Short TXT — menuntut server yang mendukung mode ST
 * - RX   : jawaban lewat record HTTPS (RFC 9460)
 * - VX   : jawaban lewat record SVCB (RFC 9460)
 * Tipe lama CNAME/MX/NS/SRV masih diterima native untuk profil lama.
 */
object SlowDns {
    const val TYPE_AUTO = "AUTO"
    const val TYPE_NULL = "NULL"
    const val TYPE_TXT = "TXT"
    const val TYPE_FT = "FT"
    const val TYPE_ST = "ST"
    const val TYPE_RX = "RX"
    const val TYPE_VX = "VX"
    // Tipe lama — tidak lagi tampil di UI, tetapi masih dinormalisasi.
    const val TYPE_CNAME = "CNAME"
    const val TYPE_MX = "MX"
    const val TYPE_NS = "NS"
    const val TYPE_SRV = "SRV"

    val TYPES = listOf(TYPE_AUTO, TYPE_NULL, TYPE_TXT, TYPE_FT, TYPE_ST, TYPE_RX, TYPE_VX)

    /** Mode untuk tipe FT: Standard (default) atau Compact. */
    const val MODE_STANDARD = "STANDARD"
    const val MODE_COMPACT = "COMPACT"

    /** Varian handshake HC (HTTP Custom 8.1.5). */
    const val MODE_HC = "HC"
    const val MODE_HC_PLAIN = "HC-PLAIN"
    const val MODE_HC_TXTSHORT = "HC-TXTSHORT"
    const val MODE_HC_LIMITS = "HC-LIMITS"
    const val MODE_HC_CALIB = "HC-CALIB"
    const val MODE_HC_CALIBTXT = "HC-CALIBTXT"

    val MODES = listOf(
        MODE_STANDARD, MODE_COMPACT,
        MODE_HC, MODE_HC_PLAIN, MODE_HC_TXTSHORT,
        MODE_HC_LIMITS, MODE_HC_CALIB, MODE_HC_CALIBTXT,
    )

    /** Deskripsi singkat tipe, tampil di pemilih tipe. */
    fun typeDescription(type: String): String? = when (normalizeType(type)) {
        TYPE_ST -> "Memerlukan server yang mendukung mode ST (Short TXT)."
        TYPE_FT -> "Full TXT: pilih Standard atau Compact."
        TYPE_RX -> "Jawaban lewat record HTTPS (RX)."
        TYPE_VX -> "Jawaban lewat record SVCB (VX)."
        TYPE_NULL -> "Tipe licin, paling tahan cache resolver."
        TYPE_TXT -> "Cara klasik dnstt."
        else -> null
    }

    /** Tag log khusus SlowDNS. */
    const val TAG = "SLOWDNS"

    /** Terima nama tipe apa pun (huruf besar/kecil); default AUTO. */
    fun normalizeType(value: String?): String =
        TYPES.firstOrNull { it.equals(value?.trim(), ignoreCase = true) }
            // Tipe lama tetap dikenali agar profil lama tidak rusak.
            ?: listOf(TYPE_CNAME, TYPE_MX, TYPE_NS, TYPE_SRV)
                .firstOrNull { it.equals(value?.trim(), ignoreCase = true) }
            ?: TYPE_AUTO

    /** Terima nama mode (STANDARD/COMPACT); default STANDARD. */
    fun normalizeMode(value: String?): String =
        MODES.firstOrNull { it.equals(value?.trim(), ignoreCase = true) } ?: MODE_STANDARD

    /**
     * Periksa konfigurasi sebelum dipakai menyambung.
     * @return null bila valid, atau pesan galat siap tampilkan.
     */
    fun validate(p: Profile): String? {
        if (!p.slowdns) return null
        val domain = p.slowdnsDomain.trim()
        if (domain.length < 4 || !domain.contains('.')) {
            return "Isi domain tunnel SlowDNS, contoh: tunnel.domain.com"
        }
        validatePubkey(p.slowdnsPubkey)?.let { return it }
        validateResolver(p.slowdnsResolver)?.let { return it }
        if (p.slowdnsQname != 0 && p.slowdnsQname !in 64..255) {
            return "Batas QNAME harus 0 (default) atau 64–255 byte"
        }
        if (p.slowdnsEdns != 0 && p.slowdnsEdns !in 512..4096) {
            return "Batas EDNS0 harus 0 (default) atau 512–4096 byte"
        }
        if (p.slowdnsWindow != 0 && p.slowdnsWindow !in 8..128) {
            return "KCP Window harus 0 (default) atau 8–128"
        }
        if (p.slowdnsSessions !in 1..8) {
            return "Jumlah sesi SlowDNS harus 1–8"
        }
        // Mode FT Compact hanya berlaku untuk tipe FT.
        val mode = normalizeMode(p.slowdnsMode)
        if (mode == MODE_COMPACT && normalizeType(p.slowdnsType) != TYPE_FT) {
            return "Mode FT Compact hanya berlaku untuk tipe FT"
        }
        return null
    }

    /** Public key server Noise_NK: tepat 64 karakter heksadesimal (32 byte). */
    fun validatePubkey(hex: String): String? {
        val key = hex.trim()
        if (key.length != 64) return "Public key SlowDNS harus 64 karakter heksadesimal"
        if (key.any { Character.digit(it, 16) < 0 }) {
            return "Public key SlowDNS hanya boleh berisi 0-9 dan a-f"
        }
        return null
    }

    /**
     * Resolver boleh:
     * - "host" atau "host:port" / "udp://host[:port]" — DNS biasa
     * - "https://…" — DNS over HTTPS (DoH)
     * - "tls://host[:port]" atau "dot://host[:port]" — DNS over TLS (DoT)
     */
    fun validateResolver(resolver: String): String? {
        val r = resolver.trim()
        if (r.isEmpty()) return "Isi alamat DNS resolver untuk SlowDNS"
        val lower = r.lowercase()
        if (lower.startsWith("https://")) {
            if (r.length <= "https://".length || !r.substringAfter("://").contains('.')) {
                return "Alamat DoH tidak valid (contoh: https://dns.google/dns-query)"
            }
            return null
        }
        val raw = when {
            lower.startsWith("tls://") -> r.substring(6)
            lower.startsWith("dot://") -> r.substring(6)
            lower.startsWith("udp://") -> r.substring(6)
            else -> r
        }.trim().removeSuffix("/")
        if (raw.isEmpty()) return "Alamat DNS resolver SlowDNS tidak valid"
        val host = raw.substringBefore(':').trim()
        if (host.isEmpty()) return "Alamat DNS resolver SlowDNS tidak valid"
        val port = raw.substringAfter(':', "").trim()
        if (port.isNotEmpty() && port.toIntOrNull() !in 1..65535) {
            return "Port DNS resolver SlowDNS tidak valid"
        }
        return null
    }

    /** Resolver siap pakai untuk pustaka native (skema dipertahankan). */
    fun normalizeResolver(resolver: String): String {
        val r = resolver.trim()
        if (r.isEmpty()) return "8.8.8.8:53"
        val lower = r.lowercase()
        if (lower.startsWith("https://")) return r
        if (lower.startsWith("tls://") || lower.startsWith("dot://")) {
            return "tls://" + r.substring(6).trim().removeSuffix("/")
        }
        val raw = if (lower.startsWith("udp://")) r.substring(6).trim() else r
        return if (raw.contains(':')) raw else "$raw:53"
    }
}

/**
 * Jembatan ke pustaka native slowdns.aar (Go via gomobile). Semua panggilan
 * native dikumpulkan di sini supaya mudah dimatikan/dinyalakan dan log-nya
 * masuk tab LOG aplikasi.
 */
object SlowDnsTunnel {

    /** Hasil probe pustaka native; null = belum dicek. */
    @Volatile private var nativeProbe: Boolean? = null

    /**
     * true bila pustaka native SlowDNS (libgojni.so, gomobile) tersedia untuk
     * ABI perangkat. Dicek dengan memuat pustakanya langsung supaya perangkat
     * atau emulator tanpa ABI tersebut tidak crash saat menyentuh kelas
     * binding.
     */
    fun nativeAvailable(): Boolean {
        nativeProbe?.let { return it }
        val ok = try {
            System.loadLibrary("gojni")
            true
        } catch (t: Throwable) {
            TunnelLog.add(
                TunnelLog.WARN,
                "SlowDNS tidak tersedia: pustaka native tidak ada untuk ABI ini"
            )
            false
        }
        nativeProbe = ok
        return ok
    }

    /** Penerima log dari pustaka native → TunnelLog. */
    private val logger = object : Logger {
        override fun log(msg: String?) {
            val line = msg?.trim().orEmpty()
            if (line.isEmpty()) return
            val level = when {
                line.contains("siap", ignoreCase = true) -> TunnelLog.OK
                line.contains("kalibrasi", ignoreCase = true) -> SlowDns.TAG
                line.startsWith("SlowDNS send:", ignoreCase = true) ||
                    line.contains("gagal", ignoreCase = true) ||
                    line.contains("berhenti", ignoreCase = true) -> TunnelLog.WARN
                else -> SlowDns.TAG
            }
            TunnelLog.add(level, line)
        }
    }

    /**
     * Menerjemahkan pesan galat native (Inggris, gaya HTTP Custom 8.1.5)
     * menjadi pesan Indonesia yang konsisten dengan UI.
     */
    private fun mapNativeError(msg: String?): String {
        val m = msg ?: return "SlowDNS gagal dimulai"
        return when {
            m.contains("Use a public DNS resolver", ignoreCase = true) ->
                "Gunakan DNS resolver publik (mis. 8.8.8.8), bukan resolver lokal/privat"
            m.contains("Could not verify the server", ignoreCase = true) ->
                "Tidak bisa memverifikasi server SlowDNS. Perbarui aplikasi dan paket server"
            m.contains("Timed out while opening a session", ignoreCase = true) ->
                "Timeout membuka sesi SlowDNS"
            m.contains("QNAME limit is too small", ignoreCase = true) ->
                "Batas QNAME terlalu kecil untuk domain dan tipe ini. Naikkan di setelan SlowDNS"
            m.contains("mode ST", ignoreCase = true) || m.contains("ST mode", ignoreCase = true) ->
                "Server tidak mendukung mode ST (Short TXT)"
            else -> m
        }
    }

    /**
     * Nyalakan terowongan SlowDNS dan tunggu sesi terbentuk.
     * @param protect dipanggil dengan fd socket resolver agar tidak masuk
     *   kembali ke VPN (VpnService.protect) — tanpa ini query DNS akan
     *   berputar lewat TUN dan terowongan diam setelah VPN menyala.
     * @return port TCP lokal (127.0.0.1:port) tempat SSH harus menyambung.
     * @throws IOException bila konfigurasi/sesi gagal.
     */
    fun startAndWait(p: Profile, timeoutMs: Int, protect: ((Int) -> Boolean)? = null): Int {
        if (!nativeAvailable()) {
            throw IOException(
                "SlowDNS tidak tersedia: pustaka native tidak ada untuk ABI perangkat ini"
            )
        }
        val type = SlowDns.normalizeType(p.slowdnsType)
        val mode = SlowDns.normalizeMode(p.slowdnsMode)
        TunnelLog.add(
            SlowDns.TAG,
            "Menyalakan SlowDNS • ${SlowDns.normalizeResolver(p.slowdnsResolver)} • " +
                "${p.slowdnsDomain.trim()} • tipe $type" +
                (if (type == SlowDns.TYPE_FT) " • mode $mode" else "")
        )
        try {
            NativeSlowDns.setSocketProtector(
                protect?.let { fn ->
                    object : id.wanz.slowdns.SocketProtector {
                        override fun protect(fd: Long): Boolean = fn(fd.toInt())
                    }
                }
            )
        } catch (e: Exception) {
            TunnelLog.add(TunnelLog.WARN, "SlowDNS: proteksi socket tidak tersedia: ${e.message}")
        }
        try {
            // Port 0 = pilih otomatis; 0 pada batas lain = default dnstt.
            NativeSlowDns.start(
                SlowDns.normalizeResolver(p.slowdnsResolver),
                p.slowdnsDomain.trim(),
                p.slowdnsPubkey.trim(),
                type,
                mode,
                0L,
                p.slowdnsWindow.toLong(),
                p.slowdnsQname.toLong(),
                p.slowdnsEdns.toLong(),
                p.slowdnsSessions.toLong(),
                p.slowdnsMultiLogin,
                p.slowdnsCalibrate,
                logger
            )
        } catch (e: Exception) {
            throw IOException(
                "SlowDNS gagal dimulai: ${mapNativeError(e.message ?: e.javaClass.simpleName)}",
                e
            )
        }
        val port = NativeSlowDns.listenPort().toInt()
        try {
            NativeSlowDns.waitReady(timeoutMs.toLong())
        } catch (e: Exception) {
            stop()
            throw IOException(
                "Sesi SlowDNS tidak siap: ${mapNativeError(e.message ?: e.javaClass.simpleName)}",
                e
            )
        }
        return port
    }

    /** Matikan terowongan bila berjalan; aman dipanggil berkali-kali. */
    fun stop() {
        if (!nativeAvailable()) return
        try {
            NativeSlowDns.stop()
        } catch (_: Throwable) {
            // Pustaka native bisa saja tidak ada (ABI lain); biarkan senyap.
        }
        try {
            NativeSlowDns.setSocketProtector(null)
        } catch (_: Throwable) {
        }
    }
}

/**
 * SocketFactory untuk JSch saat SlowDNS aktif: koneksi SSH masuk ke listener
 * lokal 127.0.0.1:<port> milik pustaka native, lalu diteruskan lewat
 * terowongan DNS ke server. Endpoint asli tidak dipakai — server SlowDNS-lah
 * yang menentukan tujuan upstream.
 */
class SlowDnsSocketFactory(private val listenPort: Int) : SocketFactory {

    private fun open(): Socket = Socket().apply {
        tcpNoDelay = true
        connect(
            InetSocketAddress(InetAddress.getByName("127.0.0.1"), listenPort),
            20_000
        )
    }

    override fun createSocket(host: String, port: Int): Socket = open()

    override fun getInputStream(socket: Socket): InputStream = socket.getInputStream()

    override fun getOutputStream(socket: Socket): OutputStream = socket.getOutputStream()
}
