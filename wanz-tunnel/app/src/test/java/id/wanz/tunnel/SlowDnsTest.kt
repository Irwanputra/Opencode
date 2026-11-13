package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

/** Uji validasi konfigurasi SlowDNS (murni Kotlin, tanpa perangkat). */
class SlowDnsTest {

    @Test
    fun typesMatchHttpCustomOptions() {
        // HTTP Custom 8.0.22-Patch 2 menawarkan pilihan tipe berikut
        // (slowdns_mode_auto + slowdns_type_* di strings.xml).
        assertEquals(
            listOf("AUTO", "NULL", "TXT", "CNAME", "MX", "NS", "SRV"),
            SlowDns.TYPES
        )
    }

    @Test
    fun typeNormalizationAcceptsAnyCase() {
        assertEquals("AUTO", SlowDns.normalizeType("auto"))
        assertEquals("NULL", SlowDns.normalizeType("null"))
        assertEquals("TXT", SlowDns.normalizeType(" txt "))
        assertEquals("SRV", SlowDns.normalizeType("SRV"))
        // Nilai tak dikenal dan kosong jatuh ke AUTO (kalibrasi).
        assertEquals("AUTO", SlowDns.normalizeType("AXFR"))
        assertEquals("AUTO", SlowDns.normalizeType(""))
        assertEquals("AUTO", SlowDns.normalizeType(null))
    }

    @Test
    fun pubkeyMustBe64HexCharacters() {
        assertNull(SlowDns.validatePubkey("a".repeat(64)))
        assertNotNull(SlowDns.validatePubkey("a".repeat(63)))
        assertNotNull(SlowDns.validatePubkey("a".repeat(65)))
        assertNotNull(SlowDns.validatePubkey(""))
        // 'g' dan simbol lain bukan heksadesimal.
        assertNotNull(SlowDns.validatePubkey("g".repeat(64)))
        assertNotNull(SlowDns.validatePubkey("0123456789abcdef".repeat(4) + "!"))
    }

    @Test
    fun resolverValidation() {
        assertNull(SlowDns.validateResolver("8.8.8.8"))
        assertNull(SlowDns.validateResolver("1.1.1.1:53"))
        assertNull(SlowDns.validateResolver("udp://9.9.9.9:5353"))
        assertNotNull(SlowDns.validateResolver(""))
        assertNotNull(SlowDns.validateResolver(":53"))
        assertNotNull(SlowDns.validateResolver("1.1.1.1:70000"))
        assertNotNull(SlowDns.validateResolver("1.1.1.1:nol"))
    }

    @Test
    fun resolverNormalization() {
        assertEquals("8.8.8.8:53", SlowDns.normalizeResolver("8.8.8.8"))
        assertEquals("8.8.8.8:53", SlowDns.normalizeResolver(" 8.8.8.8 "))
        assertEquals("1.1.1.1:5353", SlowDns.normalizeResolver("udp://1.1.1.1:5353"))
        assertEquals("1.1.1.1:53", SlowDns.normalizeResolver("udp://1.1.1.1"))
        assertEquals("8.8.8.8:53", SlowDns.normalizeResolver(""))
    }

    @Test
    fun profileValidationOnlyWhenEnabled() {
        val base = Profile(
            id = 1,
            slowdns = true,
            slowdnsResolver = "8.8.8.8",
            slowdnsDomain = "t.example.com",
            slowdnsPubkey = "ab".repeat(32)
        )
        assertNull(SlowDns.validate(base))
        // Domain tanpa titik / terlalu pendek ditolak.
        assertNotNull(SlowDns.validate(base.copy(slowdnsDomain = "domain")))
        assertNotNull(SlowDns.validate(base.copy(slowdnsDomain = "")))
        // Pubkey salah ditolak.
        assertNotNull(SlowDns.validate(base.copy(slowdnsPubkey = "zz")))
        // Resolver salah ditolak.
        assertNotNull(SlowDns.validate(base.copy(slowdnsResolver = "")))
        // Saat nonaktif, konfigurasi kosong tidak masalah.
        assertNull(SlowDns.validate(base.copy(slowdns = false, slowdnsDomain = "")))
    }
}
