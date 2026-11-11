package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.net.InetAddress
import java.net.ServerSocket
import java.security.MessageDigest
import java.util.Base64

class TransportSocketFactoryTest {
    @Test
    fun webSocketHandshakeAndEcho() {
        val server = ServerSocket(0, 1, InetAddress.getByName("127.0.0.1"))
        val port = server.localPort

        Thread {
            try {
                server.accept().use { s ->
                    val input = s.getInputStream()
                    val header = readHeader(input)
                    val key = header.lines()
                        .first { it.startsWith("Sec-WebSocket-Key:", true) }
                        .substringAfter(':').trim()
                    val accept = Base64.getEncoder().encodeToString(
                        MessageDigest.getInstance("SHA-1")
                            .digest((key + GUID).toByteArray(Charsets.ISO_8859_1))
                    )
                    s.getOutputStream().write(
                        ("HTTP/1.1 101 Switching Protocols\r\n" +
                            "Upgrade: websocket\r\n" +
                            "Connection: Upgrade\r\n" +
                            "Sec-WebSocket-Accept: $accept\r\n\r\n")
                            .toByteArray(Charsets.ISO_8859_1)
                    )
                    s.getOutputStream().flush()

                    val first = input.read()
                    val second = input.read()
                    var length = second and 0x7F
                    if (length == 126) length = (input.read() shl 8) or input.read()
                    val mask = ByteArray(4)
                    readFully(input, mask)
                    val payload = ByteArray(length)
                    readFully(input, payload)
                    for (i in payload.indices) {
                        payload[i] = (payload[i].toInt() xor mask[i and 3].toInt()).toByte()
                    }

                    val out = s.getOutputStream()
                    out.write(0x82)
                    out.write(payload.size)
                    out.write(payload)
                    out.flush()
                    Thread.sleep(200)
                }
            } catch (_: Exception) {
            }
        }.apply { isDaemon = true }.start()

        val cfg = Profile(
            id = 1,
            name = "test",
            host = "127.0.0.1",
            port = port,
            transport = "ws",
            wsPath = "/ssh",
            strictTls = false
        )
        val factory = TransportSocketFactory(cfg)
        val socket = factory.createSocket("127.0.0.1", port)
        try {
            val out = factory.getOutputStream(socket)
            val input = factory.getInputStream(socket)
            out.write("hello".toByteArray(Charsets.UTF_8))
            out.flush()
            val response = ByteArray(5)
            readFully(input, response)
            assertEquals("hello", String(response, Charsets.UTF_8))
        } finally {
            socket.close()
            server.close()
        }
    }

    @Test
    fun splitPayloadChunksAndSkipsHttpPreamble() {
        val server = ServerSocket(0, 1, InetAddress.getByName("127.0.0.1"))
        val port = server.localPort
        val received = ByteArrayOutputStream()

        Thread {
            try {
                server.accept().use { s ->
                    val input = s.getInputStream()
                    // Baca payload sampai potongan setelah [split] tiba.
                    while (!received.toString("ISO-8859-1").contains("HTTP/ 69\r\n\r\n")) {
                        val b = input.read()
                        if (b < 0) break
                        received.write(b)
                    }
                    val out = s.getOutputStream()
                    out.write(
                        ("HTTP/1.1 301 Moved Permanently\r\n" +
                            "Content-Length: 9\r\n\r\n" +
                            "301 BODY!" +
                            "HTTP/1.1 101 Switching Protocols\r\n" +
                            "Upgrade: websocket\r\n\r\n" +
                            "SSH-2.0-test\r\nKEXDATA")
                            .toByteArray(Charsets.ISO_8859_1)
                    )
                    out.flush()
                    Thread.sleep(300)
                }
            } catch (_: Exception) {
            }
        }.apply { isDaemon = true }.start()

        val payload = "GET / HTTP/1.1[crlf]Host: bug.test[crlf][crlf]" +
            "PATCH / HTTP/1.1[crlf]Host: [host][crlf][crlf]" +
            "[split]HTTP/ 69[crlf][crlf]"
        val cfg = Profile(
            id = 1,
            name = "test",
            host = "127.0.0.1",
            port = port,
            transport = "ssh",
            payload = payload
        )
        val factory = TransportSocketFactory(cfg)
        val socket = factory.createSocket("127.0.0.1", port)
        try {
            val input = factory.getInputStream(socket)
            val expected = "SSH-2.0-test\r\nKEXDATA"
            val response = ByteArray(expected.length)
            readFully(input, response)
            assertEquals(expected, String(response, Charsets.ISO_8859_1))

            val sent = received.toString("ISO-8859-1")
            assertTrue(sent.startsWith("GET / HTTP/1.1\r\nHost: bug.test\r\n\r\n"))
            assertTrue(sent.contains("PATCH / HTTP/1.1\r\nHost: 127.0.0.1\r\n\r\n"))
            assertTrue(sent.endsWith("HTTP/ 69\r\n\r\n"))
        } finally {
            socket.close()
            server.close()
        }
    }

    @Test
    fun splitPayloadKeepsChunkOrderAndDelays() {
        val cfg = Profile(id = 1, name = "test", host = "127.0.0.1", port = 22)
        val chunks = TransportSocketFactory(cfg).splitPayload(
            "first[split]second[delay_split]third"
        )
        assertEquals(3, chunks.size)
        assertEquals("first", chunks[0].text)
        assertEquals(0L, chunks[0].delayBeforeMs)
        assertEquals("second", chunks[1].text)
        assertEquals(100L, chunks[1].delayBeforeMs)
        assertEquals("third", chunks[2].text)
        assertEquals(1_000L, chunks[2].delayBeforeMs)
    }

    private fun readHeader(input: InputStream): String {
        val sb = StringBuilder()
        while (true) {
            val b = input.read()
            if (b < 0) error("closed")
            sb.append(b.toChar())
            if (sb.endsWith("\r\n\r\n")) return sb.toString()
        }
    }

    private fun readFully(input: InputStream, data: ByteArray) {
        var offset = 0
        while (offset < data.size) {
            val n = input.read(data, offset, data.size - offset)
            if (n < 0) error("closed")
            offset += n
        }
    }

    companion object {
        private const val GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
    }
}
