package id.wanz.tunnel

import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/** Simpan-baca SlowDNS pada JSON profil harus utuh dan punya nilai bawaan. */
class ProfileSlowDnsJsonTest {

    @Test
    fun slowDnsFieldsSurviveJsonRoundTrip() {
        val p = Profile(
            id = 3,
            name = "Server DNS",
            slowdns = true,
            slowdnsResolver = "1.1.1.1:53",
            slowdnsDomain = "t.example.com",
            slowdnsPubkey = "ab".repeat(32),
            slowdnsType = "NULL"
        )
        val back = ProfileStore.fromJson(JSONObject(ProfileStore.toJson(p).toString()))
        assertTrue(back.slowdns)
        assertEquals("1.1.1.1:53", back.slowdnsResolver)
        assertEquals("t.example.com", back.slowdnsDomain)
        assertEquals("ab".repeat(32), back.slowdnsPubkey)
        assertEquals("NULL", back.slowdnsType)
        // Field lama tetap ikut tersimpan.
        assertEquals(3L, back.id)
        assertEquals("Server DNS", back.name)
    }

    @Test
    fun legacyJsonWithoutSlowDnsKeysGetsDefaults() {
        val legacy = JSONObject().apply {
            put("id", 9)
            put("name", "Lama")
            put("host", "10.0.0.1")
            put("port", 22)
            put("user", "u")
            put("pass", "p")
        }
        val p = ProfileStore.fromJson(legacy)
        assertFalse(p.slowdns)
        assertEquals("8.8.8.8", p.slowdnsResolver)
        assertEquals("", p.slowdnsDomain)
        assertEquals("", p.slowdnsPubkey)
        assertEquals("AUTO", p.slowdnsType)
    }

    @Test
    fun unknownTypeFallsBackToAuto() {
        val json = ProfileStore.toJson(Profile(id = 1))
            .put("slowdns", true)
            .put("slowdnsType", "NGAWUR")
        assertEquals("AUTO", ProfileStore.fromJson(json).slowdnsType)
    }
}
