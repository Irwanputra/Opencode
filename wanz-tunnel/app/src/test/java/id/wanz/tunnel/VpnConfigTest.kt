package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class VpnConfigTest {
    @Test
    fun topLevelKeysHaveNoIndentAndMapdnsIsNested() {
        val cfg = VpnConfig.hevConfig(socksPort = 1080, mappedDns = true)
        val lines = cfg.lines().filter { it.isNotEmpty() }

        // Semua key level atas harus di kolom 0.
        assertEquals("tunnel:", lines[0])
        val socks5 = lines.indexOf("socks5:")
        val mapdns = lines.indexOf("mapdns:")
        val misc = lines.indexOf("misc:")
        assertTrue("socks5 harus setelah tunnel", socks5 > 0)
        assertTrue("mapdns harus ada", mapdns > socks5)
        assertTrue("misc harus setelah mapdns", misc > mapdns)

        // Anak mapdns harus tepat 2 spasi, bukan 0/16.
        val mapdnsChildren = lines.subList(mapdns + 1, misc)
        assertEquals(5, mapdnsChildren.size)
        mapdnsChildren.forEach { line ->
            assertTrue(
                "indentasi mapdns salah: '$line'",
                line.startsWith("  ") && !line.startsWith("   ")
            )
        }
        assertTrue(mapdnsChildren.any { it == "  address: 198.18.0.2" })
        assertTrue(mapdnsChildren.any { it == "  cache-size: 10000" })

        // Tidak boleh ada key level atas lain yang ikut ter-indent.
        listOf("tunnel:", "socks5:", "mapdns:", "misc:").forEach { key ->
            assertTrue("key '$key' harus tanpa indentasi", cfg.lines().contains(key))
        }
    }

    @Test
    fun mappedDnsDisabledOmitsBlockButKeepsOthers() {
        val cfg = VpnConfig.hevConfig(socksPort = 1084, mappedDns = false)
        assertFalse(cfg.contains("mapdns:"))
        assertFalse(cfg.contains("198.18.0.2"))
        assertTrue(cfg.contains("  port: 1084"))
        assertTrue(cfg.contains("misc:"))
        // Tidak ada baris yang ter-indent lebih dari 2 spasi.
        cfg.lines().filter { it.isNotBlank() }.forEach { line ->
            val indent = line.takeWhile { it == ' ' }.length
            assertTrue("indentasi aneh pada '$line'", indent <= 2)
        }
    }

    @Test
    fun portIsClampedToValidRange() {
        assertTrue(VpnConfig.hevConfig(80, true).contains("  port: 1024"))
        assertTrue(VpnConfig.hevConfig(70000, true).contains("  port: 65535"))
    }
}
