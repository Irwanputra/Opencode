package id.wanz.tunnel

import android.content.Context
import org.json.JSONArray
import org.json.JSONObject

/**
 * Satu konfigurasi server/tunnel.
 *
 * transport: ssh | tls | ws | wss
 * vpn: false = hanya SOCKS5 lokal, true = tunnel semua aplikasi lewat VpnService
 *
 * Opsi tambahan (gaya HTTP Custom):
 * - autoPing / pingInterval / pingTarget : ping berkala saat terhubung
 * - autoReconnect                        : sambung ulang otomatis saat putus
 * - onlyMobileData                       : tolak koneksi saat memakai Wi-Fi
 * - blockRoot                            : tolak koneksi bila perangkat ter-root
 * - mappedDns / dnsServer                : DNS lewat tunnel atau DNS kustom
 */
data class Profile(
    var id: Long = 0,
    var name: String = "Server 1",
    var host: String = "",
    var port: Int = 22,
    var user: String = "",
    var pass: String = "",
    var proxy: String = "",
    var payload: String = "",
    var socksPort: Int = 1080,
    var vpn: Boolean = false,
    var transport: String = "ssh",
    var sni: String = "",
    var wsPath: String = "/",
    var wsHost: String = "",
    var strictTls: Boolean = true,
    var autoPing: Boolean = true,
    var pingInterval: Int = 10,
    var pingTarget: String = "1.1.1.1:443",
    var autoReconnect: Boolean = true,
    var onlyMobileData: Boolean = false,
    var blockRoot: Boolean = false,
    var mappedDns: Boolean = true,
    var dnsServer: String = "1.1.1.1"
)

class ProfileStore(context: Context) {
    private val prefs = context.getSharedPreferences("cfg", Context.MODE_PRIVATE)

    fun load(): MutableList<Profile> {
        val raw = prefs.getString(KEY_PROFILES, null)
        if (!raw.isNullOrBlank()) {
            try {
                val arr = JSONArray(raw)
                val list = ArrayList<Profile>(arr.length())
                for (i in 0 until arr.length()) {
                    list.add(fromJson(arr.getJSONObject(i)))
                }
                if (list.isNotEmpty()) return list
            } catch (_: Exception) {
                // File lama/rusak: jatuh ke migrasi di bawah.
            }
        }
        return mutableListOf(migrateLegacy())
    }

    fun save(profiles: List<Profile>, activeId: Long) {
        val arr = JSONArray()
        profiles.forEach { arr.put(toJson(it)) }
        prefs.edit()
            .putString(KEY_PROFILES, arr.toString())
            .putLong(KEY_ACTIVE, activeId)
            .apply()
    }

    fun activeId(): Long = prefs.getLong(KEY_ACTIVE, 0L)

    fun get(id: Long): Profile {
        val list = load()
        return list.firstOrNull { it.id == id } ?: list.first()
    }

    private fun migrateLegacy(): Profile {
        fun str(k: String) = prefs.getString(k, "") ?: ""
        return Profile(
            id = 1,
            name = "Server 1",
            host = str("host"),
            port = str("port").toIntOrNull() ?: 22,
            user = str("user"),
            pass = str("pass"),
            proxy = str("proxy"),
            payload = str("payload"),
            socksPort = 1080,
            vpn = false,
            transport = "ssh"
        )
    }

    private fun toJson(p: Profile) = JSONObject().apply {
        put("id", p.id)
        put("name", p.name)
        put("host", p.host)
        put("port", p.port)
        put("user", p.user)
        put("pass", p.pass)
        put("proxy", p.proxy)
        put("payload", p.payload)
        put("socksPort", p.socksPort)
        put("vpn", p.vpn)
        put("transport", p.transport)
        put("sni", p.sni)
        put("wsPath", p.wsPath)
        put("wsHost", p.wsHost)
        put("strictTls", p.strictTls)
        put("autoPing", p.autoPing)
        put("pingInterval", p.pingInterval)
        put("pingTarget", p.pingTarget)
        put("autoReconnect", p.autoReconnect)
        put("onlyMobileData", p.onlyMobileData)
        put("blockRoot", p.blockRoot)
        put("mappedDns", p.mappedDns)
        put("dnsServer", p.dnsServer)
    }

    private fun fromJson(o: JSONObject) = Profile(
        id = o.optLong("id", 0L),
        name = o.optString("name", "Server"),
        host = o.optString("host", ""),
        port = o.optInt("port", 22),
        user = o.optString("user", ""),
        pass = o.optString("pass", ""),
        proxy = o.optString("proxy", ""),
        payload = o.optString("payload", ""),
        socksPort = o.optInt("socksPort", 1080),
        vpn = o.optBoolean("vpn", false),
        transport = o.optString("transport", "ssh"),
        sni = o.optString("sni", ""),
        wsPath = o.optString("wsPath", "/"),
        wsHost = o.optString("wsHost", ""),
        strictTls = o.optBoolean("strictTls", true),
        autoPing = o.optBoolean("autoPing", true),
        pingInterval = o.optInt("pingInterval", 10),
        pingTarget = o.optString("pingTarget", "1.1.1.1:443"),
        autoReconnect = o.optBoolean("autoReconnect", true),
        onlyMobileData = o.optBoolean("onlyMobileData", false),
        blockRoot = o.optBoolean("blockRoot", false),
        mappedDns = o.optBoolean("mappedDns", true),
        dnsServer = o.optString("dnsServer", "1.1.1.1")
    )

    companion object {
        private const val KEY_PROFILES = "profiles"
        private const val KEY_ACTIVE = "activeProfile"
    }
}
