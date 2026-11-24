package id.wanz.tunnel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test

/** Uji validasi konfigurasi SlowDNS (murni Kotlin, tanpa perangkat). */
class SlowDnsTest {

    @Test
    fun typesMatchHttpCustomOptions() {
        // HTTP Custom 8.1.5 menawarkan pilihan tipe berikut
        // (slowdns_type_* di strings.xml): FT/ST/RX/VX menggantikan
        // CNAME/MX/NS/SRV.
        assertEquals(
            listOf("AUTO", "NULL", "TXT", "FT", "ST", "RX", "VX"),
            SlowDns.TYPES
        )
    }

    @Test
    fun typeNormalizationAcceptsAnyCase() {
        assertEquals("AUTO", SlowDns.normalizeType("auto"))
        assertEquals("NULL", SlowDns.normalizeType("null"))
        assertEquals("TXT", SlowDns.normalizeType(" txt "))
        assertEquals("FT", SlowDns.normalizeType("ft"))
        assertEquals("ST", SlowDns.normalizeType("st"))
        assertEquals("RX", SlowDns.normalizeType("rx"))
        assertEquals("VX", SlowDns.normalizeType("VX"))
        // Tipe lama masih dikenali agar profil lama tidak rusak.
        assertEquals("SRV", SlowDns.normalizeType("SRV"))
        // Nilai tak dikenal dan kosong jatuh ke AUTO (kalibrasi).
        assertEquals("AUTO", SlowDns.normalizeType("AXFR"))
        assertEquals("AUTO", SlowDns.normalizeType(""))
        assertEquals("AUTO", SlowDns.normalizeType(null))
    }

    @Test
    fun modeNormalizationAndValidation() {
        assertEquals("STANDARD", SlowDns.normalizeMode("standard"))
        assertEquals("COMPACT", SlowDns.normalizeMode(" compact "))
        assertEquals("STANDARD", SlowDns.normalizeMode("ngawur"))
        assertEquals("STANDARD", SlowDns.normalizeMode(null))
        // Mode hanya boleh COMPACT untuk tipe FT.
        val base = Profile(
            id = 1,
            slowdns = true,
            slowdnsDomain = "t.example.com",
            slowdnsPubkey = "ab".repeat(32),
            slowdnsType = SlowDns.TYPE_FT,
            slowdnsMode = SlowDns.MODE_COMPACT
        )
        assertNull(SlowDns.validate(base))
        assertNotNull(
            SlowDns.validate(base.copy(slowdnsType = SlowDns.TYPE_TXT))
        )
        assertNull(SlowDns.validate(base.copy(slowdnsMode = SlowDns.MODE_STANDARD)))
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
