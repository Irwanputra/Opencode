package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class HtmlBannerTest {
    @Test
    fun plainTextPassesThrough() {
        assertEquals("SSH-2.0-dropbear_2019.78", ServerBanner.toAnsi("SSH-2.0-dropbear_2019.78"))
        assertEquals("", ServerBanner.toAnsi(""))
    }

    @Test
    fun fontColorBecomesTruecolorAnsi() {
        val out = ServerBanner.toAnsi("<font color='#FF8A00'><b>➤ Sunek VPN</b></font>")
        assertEquals("\u001B[38;2;255;138;0m\u001B[1m➤ Sunek VPN\u001B[22m\u001B[39m", out)
    }

    @Test
    fun brBecomesNewlineAndPTagStripped() {
        val html = "<p style=\"text-align:center\"><b><br><br><font color='#00E5FF'><b>➤ Akun VPN</b></font><br>"
        val out = ServerBanner.toAnsi(html)
        assertFalse(out, out.contains('<'))
        assertTrue(out, out.contains("➤ Akun VPN"))
        assertTrue(out, out.contains("\u001B[38;2;0;229;255m"))
    }

    @Test
    fun entitiesDecoded() {
        assertEquals("a > b & c", ServerBanner.toAnsi("a > b & c"))
    }

    @Test
    fun logLineFromHtmlBannerIsPlain() {
        TunnelLog.clear()
        val raw = "<br><font color='#FF8A00'><b>┌────◆────┐</b></font><br>"
        TunnelLog.add(TunnelLog.BANNER, "Server Message: ${ServerBanner.toAnsi(raw)}")
        val line = TunnelLog.all().single().line()
        assertFalse(line, line.contains('\u001B'))
        assertFalse(line, line.contains('<'))
        assertTrue(line, line.contains("Server Message: ┌────◆────┐"))
    }

    @Test
    fun ansiBannerUntouched() {
        assertEquals("\u001B[1;32mok\u001B[0m", ServerBanner.toAnsi("\u001B[1;32mok\u001B[0m"))
    }
}
