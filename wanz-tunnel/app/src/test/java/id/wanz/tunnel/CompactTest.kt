package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class CompactTest {

    @Test
    fun readsHostPortUserPass() {
        val cfg = Compact.parse("id3-1forcr.zivpn.site:80@trial2264:Kpu7cDXX")
        assertEquals("id3-1forcr.zivpn.site", cfg?.host)
        assertEquals(80, cfg?.port)
        assertEquals("trial2264", cfg?.user)
        assertEquals("Kpu7cDXX", cfg?.pass)
    }

    @Test
    fun portAndPassAreOptional() {
        val noPort = Compact.parse("contoh.com@demo")
        assertEquals("contoh.com", noPort?.host)
        assertNull(noPort?.port)
        assertEquals("demo", noPort?.user)
        assertEquals("", noPort?.pass)

        val hostOnly = Compact.parse("contoh.com:443")
        assertEquals("contoh.com", hostOnly?.host)
        assertEquals(443, hostOnly?.port)
        assertNull(hostOnly?.user)
    }

    @Test
    fun readsBracketedIpv6() {
        val cfg = Compact.parse("[2001:db8::1]:443@user:secret")
        assertEquals("2001:db8::1", cfg?.host)
        assertEquals(443, cfg?.port)
        assertEquals("user", cfg?.user)
        assertEquals("secret", cfg?.pass)
    }

    @Test
    fun formatsBackToTheSameLine() {
        val p = Profile(host = "contoh.com", port = 8080, user = "demo", pass = "rahasia")
        assertEquals("contoh.com:8080@demo:rahasia", Compact.format(p))

        val ipv6 = Profile(host = "2001:db8::1", port = 443, user = "u", pass = "p")
        assertEquals("[2001:db8::1]:443@u:p", Compact.format(ipv6))
    }

    @Test
    fun applyKeepsValuesMissingFromTheLine() {
        val p = Profile(host = "lama.com", port = 22, user = "lama", pass = "lama")
        val cfg = Compact.parse("baru.com")!!
        val updated = Compact.apply(p, cfg)
        assertEquals("baru.com", updated.host)
        assertEquals(22, updated.port)
        assertEquals("lama", updated.user)
        assertEquals("lama", updated.pass)
    }
}
