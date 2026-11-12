package id.wanz.tunnel

import com.jcraft.jsch.SocketFactory
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.io.SequenceInputStream
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.Socket
import java.security.MessageDigest
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.Base64
import java.util.Collections
import java.util.IdentityHashMap
import javax.net.ssl.SNIHostName
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocket
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

/**
 * Membuat koneksi transport ke server SSH.
 *
 * - ssh : TCP biasa
 * - tls : TCP + TLS/SNI (mis. stunnel)
 * - ws  : TCP + HTTP WebSocket
 * - wss : TCP + TLS/SNI + WebSocket
 *
 * Proxy/payload HTTP tetap didukung dan dijalankan sebelum lapisan TLS/WS.
 * Payload dengan [split] / [delay_split] dikirim per potongan seperti HTTP
 * Custom; untuk SSH langsung, preamble HTTP (301/101) dilewati sampai banner
 * SSH ditemukan.
 */
class TransportSocketFactory(
    private val cfg: Profile,
    /**
     * Dipanggil tepat setelah socket dibuat (sebelum connect). Saat VPN aktif,
     * TunnelService memakai ini untuk `VpnService.protect()` agar koneksi SSH
     * tidak ikut masuk ke TUN (kalau ikut, terjadi loop: VPN → SOCKS → SSH → VPN).
     */
    private val protect: ((Socket) -> Boolean)? = null,
    /**
     * Dipanggil sebelum connect untuk mengikat socket ke jaringan fisik
     * (Wi-Fi/seluler). Ini pengaman kedua kalau protect() tidak tersedia,
     * misalnya saat masih ada sesi VPN lama yang belum turun.
     */
    private val bind: ((Socket) -> Boolean)? = null,
    /**
     * Resolver DNS untuk endpoint SSH/proxy. Saat VPN aktif, resolusi harus
     * memakai jaringan di bawah VPN, bukan DNS yang sudah dialihkan ke TUN.
     */
    private val resolve: ((String) -> Array<InetAddress>)? = null
) : SocketFactory {
    private data class Streams(val input: InputStream, val output: OutputStream)

    private val socketStreams = Collections.synchronizedMap(IdentityHashMap<Socket, Streams>())
    private val random = SecureRandom()

    override fun createSocket(host: String, port: Int): Socket {
        val targetHost = cfg.host.ifBlank { host }.trim()
        val targetPort = cfg.port.takeIf { it in 1..65535 } ?: port

        val requested = cfg.transport.lowercase()
        // Payload gaya HTTP Custom — baik yang memakai [split] maupun tidak —
        // sudah melakukan upgrade HTTP/WebSocket sendiri. Payload asli dari log
        // HTTP Custom contoh:
        //   GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n
        //   PATCH / HTTP/1.1\r\nHost: <server>\r\nUpgrade: websocket\r\n\r\n
        // Kalau transport WS/WSS dipilih, handshake WS tambahan dari app justru
        // ditolak server (301) dan banner SSH tidak pernah datang. Jadi begitu
        // payload memuat upgrade, pakai mode SSH langsung (raw).
        val payloadDoesUpgrade = SPLIT_MARKER.containsMatchIn(cfg.payload) ||
            UPGRADE_LINE.containsMatchIn(cfg.payload)
        val transport = if (payloadDoesUpgrade && (requested == "ws" || requested == "wss")) {
            TunnelLog.add(
                "TRANSPORT",
                "Payload sudah memuat upgrade HTTP → handshake WS bawaan dilewati" +
                    if (requested == "wss") " (TLS juga tidak dipakai: payload dikirim polos seperti di HTTP Custom)"
                    else " (server cukup satu upgrade)"
            )
            "ssh"
        } else {
            requested
        }

        return try {
            connectRaw(host, port, transport)
        } catch (e: Exception) {
            // Jaring pengaman untuk perangkat nyata: server/proxy kadang
            // menolak handshake WS bawaan (301/400) padahal koneksi SSH
            // mentah lewat payload tetap bisa. Coba ulang sekali sebagai
            // SSH langsung sebelum menyerah.
            if ((requested == "ws" || requested == "wss") && transport != "ssh") {
                TunnelLog.add(
                    "TRANSPORT",
                    "Transport WS gagal (${e.message ?: e.javaClass.simpleName}) → coba ulang sebagai SSH langsung"
                )
                connectRaw(host, port, "ssh")
            } else {
                throw e
            }
        }
    }

    private fun resolveEndpoint(host: String): InetAddress {
        TunnelLog.add("RESOLVE", "Resolve $host…")
        val list = try {
            resolve?.invoke(host)?.takeIf { it.isNotEmpty() } ?: InetAddress.getAllByName(host)
        } catch (e: Exception) {
            throw IOException("Gagal resolve $host: ${e.message ?: e.javaClass.simpleName}", e)
        }
        // Utamakan IPv4: VPN kita IPv4-only (sama seperti HTTP Custom).
        val address = list.firstOrNull { it is java.net.Inet4Address } ?: list.first()
        val family = if (address is java.net.Inet4Address) "IPv4" else "IPv6"
        TunnelLog.add("RESOLVE", "$host → ${address.hostAddress} ($family)")
        return address
    }

    private fun connectRaw(host: String, port: Int, transport: String): Socket {
        val targetHost = cfg.host.ifBlank { host }.trim()
        val targetPort = cfg.port.takeIf { it in 1..65535 } ?: port

        val proxyHost = cfg.proxy.substringBefore(":").trim()
        val proxyPort = cfg.proxy.substringAfter(":", "").trim().toIntOrNull() ?: 8080
        val viaProxy = proxyHost.isNotEmpty()
        val endpointHost = if (viaProxy) proxyHost else targetHost
        val endpointPort = if (viaProxy) proxyPort else targetPort

        val base = Socket()
        val mode = if (viaProxy) "proxy/edge" else "server"
        TunnelLog.add("TRANSPORT", "Membuka $mode $endpointHost:$endpointPort")
        try {
            // Socket SSH tidak boleh masuk ke TUN. Saat VPN aktif, protect()
            // wajib dipanggil sebelum connect(); bind ke jaringan fisik
            // menjadi cadangan bila protect() tidak tersedia.
            protect?.invoke(base)
            bind?.invoke(base)
            val address = resolveEndpoint(endpointHost)
            TunnelLog.add(
                "SOCKET",
                "Set timeout ${CONNECT_TIMEOUT_MS} ms • socket ${address.hostAddress}:$endpointPort"
            )
            base.connect(InetSocketAddress(address, endpointPort), CONNECT_TIMEOUT_MS)
            base.tcpNoDelay = true
            TunnelLog.add("SOCKET", "Tersambung ke ${address.hostAddress}:$endpointPort (TCP)")

            val rawSsh = transport == "ssh"
            if (viaProxy || cfg.payload.isNotBlank()) {
                val payloadInput = sendPayload(base, targetHost, targetPort, viaProxy, rawSsh)
                if (payloadInput != null) {
                    socketStreams[base] = Streams(payloadInput, base.getOutputStream())
                }
            }

            return when (transport) {
                "tls" -> tls(base, targetHost, targetPort)
                "ws", "wss" -> {
                    val sock = if (transport == "wss") tls(base, targetHost, targetPort) else base
                    val streams = webSocket(sock, targetHost, targetPort)
                    socketStreams[sock] = streams
                    sock
                }
                else -> base
            }
        } catch (e: Exception) {
            TunnelLog.add("TRANSPORT", "Gagal membuka $endpointHost:$endpointPort: ${e.message ?: e.javaClass.simpleName}")
            try { base.close() } catch (_: Exception) {}
            throw e
        }
    }

    override fun getInputStream(socket: Socket): InputStream =
        socketStreams[socket]?.input ?: socket.getInputStream()

    override fun getOutputStream(socket: Socket): OutputStream =
        socketStreams[socket]?.output ?: socket.getOutputStream()

    /**
     * Kirim payload. Bila ada [split]/[delay_split], potongan dikirim terpisah.
     * Untuk SSH langsung, preamble HTTP (mis. 301 + body + 101) dilewati
     * sampai banner SSH ditemukan, lalu banner itu dikembalikan sebagai awal
     * InputStream agar JSch bisa langsung memakai koneksi.
     */
    private fun sendPayload(
        sock: Socket,
        host: String,
        port: Int,
        viaProxy: Boolean,
        rawSsh: Boolean
    ): InputStream? {
        val template = cfg.payload.ifBlank {
            if (viaProxy) "CONNECT [host_port] HTTP/1.1[crlf]Host: [host_port][crlf][crlf]" else ""
        }
        if (template.isBlank()) return null

        val request = template
            .replace("\r\n", "\n")
            .replace("\n", "\r\n")
            .replace("[host_port]", "$host:$port")
            .replace("[host]", host)
            .replace("[port]", "$port")
            .replace("[crlf]", "\r\n")
            .replace("[crlr]", "\n\r")
            .replace("[cr]", "\r")
            .replace("[lf]", "\n")
            .replace("\\r", "\r")
            .replace("\\n", "\n")

        val chunks = splitPayload(request)
        val output = sock.getOutputStream()
        TunnelLog.add("PAYLOAD", "Mengirim payload dalam ${chunks.size} bagian")
        chunks.forEachIndexed { index, chunk ->
            if (index > 0 && chunk.delayBeforeMs > 0) Thread.sleep(chunk.delayBeforeMs)
            if (chunk.text.isEmpty()) return@forEachIndexed
            output.write(chunk.text.toByteArray(Charsets.ISO_8859_1))
            output.flush()
            TunnelLog.add(
                "PAYLOAD",
                "Bagian ${index + 1}/${chunks.size} terkirim (${chunk.text.length} char, jeda ${chunk.delayBeforeMs}ms)"
            )
        }

        if (rawSsh) {
            // Mode SSH mentah (termasuk payload HTTP Custom): server bisa
            // mengirim beberapa respons HTTP (301/200/101) sebelum banner SSH.
            // Lewati semuanya sampai banner ditemukan, lalu teruskan sisa
            // stream ke JSch.
            TunnelLog.add("PAYLOAD", "Menunggu banner SSH dari server…")
            return readUntilSshBanner(sock)
        }

        sock.soTimeout = HANDSHAKE_TIMEOUT_MS
        val head = readHeader(sock.getInputStream(), 8192)
        sock.soTimeout = 0
        val statusLine = head.lineSequence().firstOrNull().orEmpty()
        val code = statusLine.split(' ').getOrNull(1)?.toIntOrNull() ?: 0
        TunnelLog.add("PAYLOAD", "Respons HTTP: $statusLine")
        if (code !in 200..299 && code != 101) {
            throw IOException("Proxy menolak: $statusLine")
        }
        return null
    }

    internal data class PayloadChunk(val text: String, val delayBeforeMs: Long)

    /**
     * Meniru HTTPS Custom persis: payload dipecah berdasarkan penanda
     * [split] / [delay] / [delay_split] / [split_delay].
     *
     * - [split]       : potongan dikirim langsung tanpa jeda (back-to-back).
     * - [delay]       : jeda 1 detik setelah tiap potongan kecuali terakhir.
     * - [delay_split] : sama, jeda 1 detik.
     * - [split_delay] : sama, jeda 1 detik.
     *
     * Referensi: C1935.run() di HTTP Custom (smali) — semua Thread.sleep
     * memakai 0x3e8 = 1000 ms, dan [split] polos TIDAK tidur.
     */
    internal fun splitPayload(payload: String): List<PayloadChunk> {
        val marker = SPLIT_MARKER
        if (!marker.containsMatchIn(payload)) return listOf(PayloadChunk(payload, 0L))

        val chunks = ArrayList<PayloadChunk>()
        var start = 0
        marker.findAll(payload).forEach { match ->
            chunks.add(PayloadChunk(payload.substring(start, match.range.first), 0L))
            start = match.range.last + 1
        }
        chunks.add(PayloadChunk(payload.substring(start), 0L))

        // Tanpa penanda jeda → kirim langsung (seperti [split] HTTP Custom).
        val delayMarker = Regex("\\[(?:delay|delay_split|split_delay)\\]", RegexOption.IGNORE_CASE)
        if (!delayMarker.containsMatchIn(payload)) return chunks

        // HTTP Custom: tulis potongan → flush → tidur 1 dtk (kecuali terakhir).
        // Artinya jeda terjadi SEBELUM potongan ke-2 dst. Oleskan jeda ke
        // semua potongan kecuali pertama; sender tidur hanya jika index > 0.
        return chunks.mapIndexed { index, chunk ->
            if (index > 0) chunk.copy(delayBeforeMs = DELAY_SPLIT_MS) else chunk
        }
    }

    private fun readUntilSshBanner(sock: Socket): InputStream {
        val input = sock.getInputStream()
        val buffer = ByteArrayOutputStream()
        sock.soTimeout = SSH_BANNER_TIMEOUT_MS
        try {
            val chunk = ByteArray(8192)
            while (true) {
                val n = input.read(chunk)
                if (n < 0) throw EOFException("Koneksi ditutup sebelum banner SSH")
                buffer.write(chunk, 0, n)
                val data = buffer.toByteArray()
                val index = findSshBanner(data)
                if (index >= 0) {
                    val banner = String(data, index, minOf(data.size - index, 96), Charsets.ISO_8859_1)
                        .lineSequence().firstOrNull()?.trim().orEmpty()
                    TunnelLog.add("SSH", "Banner diterima: $banner")
                    val prefix = data.copyOfRange(index, data.size)
                    return SequenceInputStream(ByteArrayInputStream(prefix), input)
                }
                if (data.size > MAX_PREAMBLE_BYTES) {
                    TunnelLog.add("SSH", "Preamble HTTP terlalu panjang (${data.size} byte)")
                    throw IOException("Respons HTTP sebelum SSH terlalu panjang")
                }
            }
        } finally {
            sock.soTimeout = 0
        }
    }

    private fun findSshBanner(data: ByteArray): Int {
        for (i in 0..data.size - SSH_PREFIX.size) {
            if (i > 0 && data[i - 1] != '\n'.code.toByte()) continue
            var match = true
            for (j in SSH_PREFIX.indices) {
                if (data[i + j] != SSH_PREFIX[j]) {
                    match = false
                    break
                }
            }
            if (match) return i
        }
        return -1
    }

    private fun tls(base: Socket, host: String, port: Int): SSLSocket {
        val context = SSLContext.getInstance("TLS")
        if (cfg.strictTls) {
            context.init(null, null, null)
        } else {
            context.init(null, arrayOf<TrustManager>(trustAll), SecureRandom())
        }

        val serverName = cfg.sni.ifBlank { host }
        TunnelLog.add("TLS", "Handshake TLS dengan SNI $serverName${if (cfg.strictTls) " (verifikasi ketat)" else ""}")
        val factory = context.socketFactory
        // Peer host = SNI supaya verifikasi sertifikat (jika strict) memakai nama SNI.
        val ssl = factory.createSocket(base, serverName, port, true) as SSLSocket
        val params = ssl.sslParameters
        try {
            params.serverNames = listOf(SNIHostName(serverName))
        } catch (_: Exception) {
            // Server name berupa IP atau tidak valid: tetap lanjut tanpa SNI.
        }
        if (cfg.strictTls) params.endpointIdentificationAlgorithm = "HTTPS"
        ssl.sslParameters = params
        ssl.startHandshake()
        TunnelLog.add("TLS", "Handshake TLS selesai (${ssl.session.protocol})")
        return ssl
    }

    private fun webSocket(sock: Socket, targetHost: String, targetPort: Int): Streams {
        val serverName = cfg.sni.ifBlank { targetHost }
        val wsHost = cfg.wsHost.ifBlank {
            if (targetPort == 80 || targetPort == 443) serverName else "$serverName:$targetPort"
        }
        val path = cfg.wsPath.ifBlank { "/" }.let { if (it.startsWith("/")) it else "/$it" }
        val key = ByteArray(16).also { random.nextBytes(it) }
        val keyText = Base64.getEncoder().encodeToString(key)

        val request = buildString {
            append("GET ").append(path).append(" HTTP/1.1\r\n")
            append("Host: ").append(wsHost).append("\r\n")
            append("User-Agent: WanzTunnel/2.0\r\n")
            append("Upgrade: websocket\r\n")
            append("Connection: Upgrade\r\n")
            append("Sec-WebSocket-Key: ").append(keyText).append("\r\n")
            append("Sec-WebSocket-Version: 13\r\n")
            append("\r\n")
        }

        sock.soTimeout = HANDSHAKE_TIMEOUT_MS
        TunnelLog.add("WS", "Handshake WebSocket GET $path (Host: $wsHost)")
        sock.getOutputStream().apply {
            write(request.toByteArray(Charsets.ISO_8859_1))
            flush()
        }
        val head = readHeader(sock.getInputStream(), 16384)
        sock.soTimeout = 0

        val lines = head.split("\r\n")
        val code = lines.firstOrNull()?.split(' ')?.getOrNull(1)?.toIntOrNull() ?: 0
        if (code != 101) {
            val line = lines.firstOrNull()
            val tip = if (cfg.payload.isNotBlank()) {
                " • payload kustom terdeteksi: coba transport 'SSH langsung'"
            } else ""
            TunnelLog.add("WS", "WebSocket ditolak: $line$tip")
            throw IOException("WebSocket ditolak: $line")
        }
        TunnelLog.add("WS", "WebSocket tersambung (101 Switching Protocols)")

        val accept = lines.firstOrNull { it.startsWith("Sec-WebSocket-Accept:", true) }
            ?.substringAfter(':')?.trim()
        if (!accept.isNullOrEmpty()) {
            val expected = Base64.getEncoder().encodeToString(
                MessageDigest.getInstance("SHA-1")
                    .digest((keyText + WS_GUID).toByteArray(Charsets.ISO_8859_1))
            )
            if (accept != expected) throw IOException("WebSocket accept tidak valid")
        }

        val out = WebSocketOutputStream(sock.getOutputStream())
        val input = WebSocketInputStream(sock.getInputStream(), out)
        return Streams(input, out)
    }

    private fun readHeader(input: InputStream, limit: Int): String {
        val sb = StringBuilder()
        while (true) {
            val b = input.read()
            if (b < 0) throw EOFException("Koneksi ditutup saat handshake")
            sb.append(b.toChar())
            if (sb.length > limit) throw IOException("Header terlalu panjang")
            if (sb.endsWith("\r\n\r\n") || sb.endsWith("\n\n")) return sb.toString()
        }
    }

    companion object {
        private const val CONNECT_TIMEOUT_MS = 20_000
        private const val HANDSHAKE_TIMEOUT_MS = 15_000
        private const val SSH_BANNER_TIMEOUT_MS = 20_000
        private const val MAX_PREAMBLE_BYTES = 1024 * 1024
        private const val DELAY_SPLIT_MS = 1_000L
        private const val WS_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
        private val SSH_PREFIX = "SSH-".toByteArray(Charsets.ISO_8859_1)

        /** Penanda split HTTP Custom: [split], [delay], [delay_split], [split_delay]. */
        internal val SPLIT_MARKER = Regex(
            "\\[(?:split|delay|delay_split|split_delay)\\]",
            RegexOption.IGNORE_CASE
        )

        /**
         * Header upgrade di payload, mis. `Upgrade: websocket`. Ditulis sebagai
         * ekspresi: payload dari log HTTP Custom memakai `\r\n` harfiah, jadi
         * pembandingnya tidak boleh mengandalkan CRLF asli.
         */
        internal val UPGRADE_LINE = Regex(
            "upgrade:[^\\\\\\r\\n]*websocket",
            RegexOption.IGNORE_CASE
        )

        private val trustAll = object : X509TrustManager {
            override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
            override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {}
            override fun getAcceptedIssuers(): Array<X509Certificate> = emptyArray()
        }
    }
}

private class WebSocketOutputStream(private val out: OutputStream) : OutputStream() {
    private val lock = Any()
    private val random = SecureRandom()
    private var closed = false

    override fun write(b: Int) = write(byteArrayOf(b.toByte()), 0, 1)

    override fun write(b: ByteArray, off: Int, len: Int) {
        if (len == 0) return
        synchronized(lock) {
            if (closed) throw IOException("WebSocket sudah ditutup")
            frame(OP_BINARY, b, off, len)
        }
    }

    override fun flush() {
        out.flush()
    }

    override fun close() {
        synchronized(lock) {
            if (closed) return
            closed = true
            try { frame(OP_CLOSE, ByteArray(0), 0, 0) } catch (_: Exception) {}
            try { out.flush() } catch (_: Exception) {}
        }
    }

    fun sendControl(opcode: Int, payload: ByteArray) {
        synchronized(lock) {
            if (!closed) frame(opcode, payload, 0, payload.size)
        }
    }

    private fun frame(opcode: Int, b: ByteArray, off: Int, len: Int) {
        out.write(0x80 or opcode)
        when {
            len < 126 -> out.write(0x80 or len)
            len <= 0xFFFF -> {
                out.write(0x80 or 126)
                out.write((len ushr 8) and 0xFF)
                out.write(len and 0xFF)
            }
            else -> {
                out.write(0x80 or 127)
                val value = len.toLong()
                for (i in 7 downTo 0) out.write(((value ushr (8 * i)) and 0xFF).toInt())
            }
        }
        val mask = ByteArray(4)
        random.nextBytes(mask)
        out.write(mask)
        val masked = ByteArray(len)
        for (i in 0 until len) {
            masked[i] = (b[off + i].toInt() xor mask[i and 3].toInt()).toByte()
        }
        out.write(masked)
    }

    companion object {
        const val OP_BINARY = 0x2
        const val OP_CLOSE = 0x8
        const val OP_PING = 0x9
        const val OP_PONG = 0xA
    }
}

private class WebSocketInputStream(
    private val input: InputStream,
    private val output: WebSocketOutputStream
) : InputStream() {
    private var buffer = ByteArray(0)
    private var position = 0
    private var eof = false
    private var fragment: ByteArrayOutputStream? = null

    override fun read(): Int {
        val one = ByteArray(1)
        val n = read(one, 0, 1)
        return if (n < 0) -1 else one[0].toInt() and 0xFF
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        if (len == 0) return 0
        if (position >= buffer.size && !fill()) return -1
        val n = minOf(len, buffer.size - position)
        System.arraycopy(buffer, position, b, off, n)
        position += n
        return n
    }

    override fun available(): Int = buffer.size - position

    private fun fill(): Boolean {
        if (eof) return false
        while (true) {
            val first = readByte()
            if (first < 0) { eof = true; return false }
            val second = readByte()
            if (second < 0) { eof = true; return false }

            val fin = (first and 0x80) != 0
            val opcode = first and 0x0F
            val masked = (second and 0x80) != 0
            var length = (second and 0x7F).toLong()

            if (length == 126L) {
                length = ((readByte() shl 8) or readByte()).toLong()
            } else if (length == 127L) {
                var value = 0L
                repeat(8) { value = (value shl 8) or readByte().toLong() }
                length = value
            }
            if (length < 0 || length > MAX_FRAME) throw IOException("Frame WebSocket terlalu besar")

            val mask = if (masked) readBytes(4) else null
            val payload = readBytes(length.toInt())
            if (mask != null) {
                for (i in payload.indices) {
                    payload[i] = (payload[i].toInt() xor mask[i and 3].toInt()).toByte()
                }
            }

            when (opcode) {
                0x0, 0x1, 0x2 -> {
                    if (opcode == 0x0) {
                        val f = fragment ?: throw IOException("Continuation tanpa frame awal")
                        f.write(payload)
                        if (fin) {
                            setBuffer(f.toByteArray())
                            fragment = null
                            return true
                        }
                    } else if (!fin) {
                        fragment = ByteArrayOutputStream().apply { write(payload) }
                    } else {
                        fragment = null
                        setBuffer(payload)
                        return true
                    }
                }
                0x8 -> {
                    try { output.sendControl(WebSocketOutputStream.OP_CLOSE, payload) } catch (_: Exception) {}
                    eof = true
                    return false
                }
                0x9 -> output.sendControl(WebSocketOutputStream.OP_PONG, payload)
                0xA -> Unit
                else -> Unit
            }
        }
    }

    private fun setBuffer(data: ByteArray) {
        buffer = data
        position = 0
    }

    private fun readByte(): Int = input.read()

    private fun readBytes(length: Int): ByteArray {
        if (length < 0) throw IOException("Panjang frame tidak valid")
        val data = ByteArray(length)
        var offset = 0
        while (offset < length) {
            val n = input.read(data, offset, length - offset)
            if (n < 0) throw EOFException("WebSocket terputus")
            offset += n
        }
        return data
    }

    override fun close() {
        eof = true
    }

    companion object {
        private const val MAX_FRAME = 16 * 1024 * 1024
    }
}
