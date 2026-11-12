package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class LogAndPingTest {
    @Test
    fun logLevelDerivedFromTagAndMessage() {
        TunnelLog.clear()
        TunnelLog.add("PING", "38 ms")
        TunnelLog.add("STATUS", "Gagal: Connection refused")
        TunnelLog.add("TRANSPORT", "Membuka proxy/edge 104.17.70.206:80")
        TunnelLog.add("WARN", "Hanya data seluler aktif")

        val entries = TunnelLog.all()
        assertEquals(4, entries.size)
        assertEquals(TunnelLog.PING, entries[0].level)
        assertEquals(TunnelLog.ERROR, entries[1].level)
        assertEquals(TunnelLog.INFO, entries[2].level)
        assertEquals(TunnelLog.WARN, entries[3].level)
    }

    @Test
    fun logLineLooksLikeHttpCustom() {
        TunnelLog.clear()
        TunnelLog.add("PING", "42 ms")
        val line = TunnelLog.all().single().line()
        // Format: "HH:mm:ss  [PING]  42 ms"
        assertTrue(line, Regex("^\\d{2}:\\d{2}:\\d{2}  \\[PING]  42 ms$").matches(line))
    }

    @Test
    fun pingTargetParsing() {
        assertEquals("1.1.1.1" to 443, TunnelService.parsePingTarget("1.1.1.1:443"))
        assertEquals("1.1.1.1" to 443, TunnelService.parsePingTarget(""))
        assertEquals("cloudflare.com" to 80, TunnelService.parsePingTarget("cloudflare.com:80"))
        assertEquals("1.1.1.1" to 443, TunnelService.parsePingTarget("1.1.1.1:99999"))
        assertEquals("1.1.1.1" to 443, TunnelService.parsePingTarget("1.1.1.1"))
    }

    @Test
    fun okAndBannerLevels() {
        TunnelLog.clear()
        TunnelLog.add(TunnelLog.OK, "Autentikasi berhasil")
        TunnelLog.add(TunnelLog.BANNER, "SSH-2.0-dropbear_2019.78")
        val entries = TunnelLog.all()
        assertEquals(2, entries.size)
        assertEquals(TunnelLog.OK, entries[0].level)
        assertEquals(TunnelLog.BANNER, entries[1].level)
    }

    @Test
    fun lineStripsAnsiEscape() {
        TunnelLog.clear()
        TunnelLog.add(TunnelLog.BANNER, "\u001B[1;32mServer Message:\u001B[0m welcome")
        val line = TunnelLog.all().single().line()
        assertTrue(line, !line.contains("\u001B"))
        assertTrue(line, line.endsWith("Server Message: welcome"))
        assertTrue(line, Regex("^\\d{2}:\\d{2}:\\d{2}  \\[BANNER]  ").containsMatchIn(line))
    }

    @Test
    fun lineKeepsNewlinesButDropsControlChars() {
        TunnelLog.clear()
        TunnelLog.add("INFO", "baris1\nbaris2\u0000\u001B[31mx")
        val line = TunnelLog.all().single().line()
        assertTrue(line, line.contains("baris1\nbaris2x"))
    }
}
