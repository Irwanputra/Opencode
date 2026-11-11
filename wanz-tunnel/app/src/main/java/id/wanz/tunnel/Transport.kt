package id.wanz.tunnel

import com.jcraft.jsch.SocketFactory
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.io.SequenceInputStream
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
class TransportSocketFactory(private val cfg: Profile) : SocketFactory {
    private data class Streams(val input: InputStream, val output: OutputStream)

    private val socketStreams = Collections.synchronizedMap(IdentityHashMap<Socket, Streams>())
    private val random = SecureRandom()

    override fun createSocket(host: String, port: Int): Socket {
        val targetHost = cfg.host.ifBlank { host }.trim()
        val targetPort = cfg.port.takeIf { it in 1..65535 } ?: port

        val proxyHost = cfg.proxy.substringBefore(":").trim()
        val proxyPort = cfg.proxy.substringAfter(":", "").trim().toIntOrNull() ?: 8080
        val viaProxy = proxyHost.isNotEmpty()
        val endpointHost = if (viaProxy) proxyHost else targetHost
        val endpointPort = if (viaProxy) proxyPort else targetPort

        val base = Socket()
        try {
            base.connect(InetSocketAddress(endpointHost, endpointPort), CONNECT_TIMEOUT_MS)
            base.tcpNoDelay = true

            val rawSsh = cfg.transport.equals("ssh", true)
            if (viaProxy || cfg.payload.isNotBlank()) {
                val payloadInput = sendPayload(base, targetHost, targetPort, viaProxy, rawSsh)
                if (payloadInput != null) {
                    socketStreams[base] = Streams(payloadInput, base.getOutputStream())
                }
            }

            return when (cfg.transport.lowercase()) {
                "tls" -> tls(base, targetHost, targetPort)
                "ws", "wss" -> {
                    val sock = if (cfg.transport.equals("wss", true)) tls(base, targetHost, targetPort) else base
                    val streams = webSocket(sock, targetHost, targetPort)
                    socketStreams[sock] = streams
                    sock
                }
                else -> base
            }
        } catch (e: Exception) {
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
            .replace("[cr]", "\r")
            .replace("[lf]", "\n")
            .replace("\\r", "\r")
            .replace("\\n", "\n")

        val chunks = splitPayload(request)
        val output = sock.getOutputStream()
        chunks.forEachIndexed { index, chunk ->
            if (index > 0 && chunk.delayBeforeMs > 0) Thread.sleep(chunk.delayBeforeMs)
            if (chunk.text.isEmpty()) return@forEachIndexed
            output.write(chunk.text.toByteArray(Charsets.ISO_8859_1))
            output.flush()
        }

        if (chunks.size > 1) {
            // Payload HTTP Custom: server bisa mengirim beberapa respons HTTP
            // sebelum banner SSH. Hanya mode SSH langsung yang bisa melewati
            // preamble seperti ini; TLS/WS memakai handshake-nya sendiri.
            return if (rawSsh) readUntilSshBanner(sock) else null
        }

        sock.soTimeout = HANDSHAKE_TIMEOUT_MS
        val head = readHeader(sock.getInputStream(), 8192)
        sock.soTimeout = 0
        val code = head.lineSequence().firstOrNull()
            ?.split(' ')?.getOrNull(1)?.toIntOrNull() ?: 0
        if (code !in 200..299 && code != 101) {
            throw IOException("Proxy menolak: ${head.lineSequence().firstOrNull()}")
        }
        return null
    }

    internal data class PayloadChunk(val text: String, val delayBeforeMs: Long)

    internal fun splitPayload(payload: String): List<PayloadChunk> {
        val marker = Regex("\\[(delay_)?split\\]", RegexOption.IGNORE_CASE)
        if (!marker.containsMatchIn(payload)) return listOf(PayloadChunk(payload, 0L))

        val chunks = ArrayList<PayloadChunk>()
        var start = 0
        var delay = 0L
        marker.findAll(payload).forEach { match ->
            chunks.add(PayloadChunk(payload.substring(start, match.range.first), delay))
            delay = if (match.groupValues[1].isNotEmpty()) DELAY_SPLIT_MS else SPLIT_MS
            start = match.range.last + 1
        }
        chunks.add(PayloadChunk(payload.substring(start), delay))
        return chunks
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
                    val prefix = data.copyOfRange(index, data.size)
                    return SequenceInputStream(ByteArrayInputStream(prefix), input)
                }
                if (data.size > MAX_PREAMBLE_BYTES) {
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
        sock.getOutputStream().apply {
            write(request.toByteArray(Charsets.ISO_8859_1))
            flush()
        }
        val head = readHeader(sock.getInputStream(), 16384)
        sock.soTimeout = 0

        val lines = head.split("\r\n")
        val code = lines.firstOrNull()?.split(' ')?.getOrNull(1)?.toIntOrNull() ?: 0
        if (code != 101) {
            throw IOException("WebSocket ditolak: ${lines.firstOrNull()}")
        }

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
        private const val SPLIT_MS = 100L
        private const val DELAY_SPLIT_MS = 1_000L
        private const val WS_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
        private val SSH_PREFIX = "SSH-".toByteArray(Charsets.ISO_8859_1)

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
