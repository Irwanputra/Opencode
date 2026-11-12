package id.wanz.tunnel

import org.junit.Test
import java.io.InputStream

class TempLiveTest {
    @Test
    fun livePayload() {
        val template = "GET / HTTP/1.1[crlf]Host: edu.ruangguru.com[crlf][crlf]" +
            "PATCH / HTTP/1.1[crlf]Host: [host][crlf]Upgrade: websocket[crlf][crlf]" +
            "[split]HTTP/ 69[crlf][crlf]"
        val p = Profile(
            host = "bansos.sunekvpn.cc.cd",
            port = 80,
            user = "sunek-coolmaxx",
            pass = "Coolmaxx",
            transport = "ssh",
            payload = template,
            usePayload = true
        )
        val factory = TransportSocketFactory(p)
        val socket = factory.createSocket(p.host, p.port)
        socket.soTimeout = 15_000
        val input: InputStream = factory.getInputStream(socket)
        val buf = ByteArray(2048)
        val n = try { input.read(buf) } catch (e: Exception) { -1 }
        println("=== BYTES $n ===")
        if (n > 0) println(String(buf, 0, n, Charsets.ISO_8859_1))
        println("=== LOG ===")
        println(TunnelLog.all().joinToString("\n") { it.line() })
        socket.close()
    }
}
