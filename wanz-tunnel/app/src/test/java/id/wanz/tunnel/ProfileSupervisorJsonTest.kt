package id.wanz.tunnel

import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Setelan pengawas koneksi gaya HTTP Custom 8.x (ping watchdog, sambung
 * ulang berjangka, keep-alive SSH) harus utuh lewat JSON, punya nilai
 * bawaan untuk config lama, dan dijepit ke rentang wajar.
 */
class ProfileSupervisorJsonTest {

    @Test
    fun supervisorFieldsSurviveJsonRoundTrip() {
        val p = Profile(
            id = 5,
            name = "Watchdog",
            pingTimeoutSec = 7,
            pingFailReset = 4,
            pingUrl = "http://connectivitycheck.gstatic.com/generate_204",
            reconnectDelaySec = 15,
            maxReconnect = 10,
            sshKeepAliveSec = 45
        )
        val back = ProfileStore.fromJson(JSONObject(ProfileStore.toJson(p).toString()))
        assertEquals(7, back.pingTimeoutSec)
        assertEquals(4, back.pingFailReset)
        assertEquals("http://connectivitycheck.gstatic.com/generate_204", back.pingUrl)
        assertEquals(15, back.reconnectDelaySec)
        assertEquals(10, back.maxReconnect)
        assertEquals(45, back.sshKeepAliveSec)
    }

    @Test
    fun legacyJsonWithoutSupervisorKeysGetsDefaults() {
        val legacy = JSONObject().apply {
            put("id", 2)
            put("host", "10.0.0.1")
            put("user", "u")
            put("pass", "p")
        }
        val p = ProfileStore.fromJson(legacy)
        assertEquals(5, p.pingTimeoutSec)
        assertEquals(3, p.pingFailReset)
        assertEquals("", p.pingUrl)
        assertEquals(5, p.reconnectDelaySec)
        assertEquals(0, p.maxReconnect)
        assertEquals(30, p.sshKeepAliveSec)
        assertTrue(p.autoPing)
        assertTrue(p.autoReconnect)
    }

    @Test
    fun outOfRangeValuesAreClamped() {
        val json = ProfileStore.toJson(Profile(id = 1)).apply {
            put("pingTimeoutSec", 999)
            put("pingFailReset", 0)
            put("reconnectDelaySec", -3)
            put("maxReconnect", -10)
            put("sshKeepAliveSec", 100000)
        }
        val p = ProfileStore.fromJson(json)
        assertEquals(60, p.pingTimeoutSec)
        assertEquals(1, p.pingFailReset)
        assertEquals(1, p.reconnectDelaySec)
        assertEquals(0, p.maxReconnect)
        assertEquals(600, p.sshKeepAliveSec)
    }
}
