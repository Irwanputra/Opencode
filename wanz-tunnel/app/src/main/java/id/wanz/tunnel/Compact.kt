package id.wanz.tunnel

/**
 * Satu baris konfigurasi gaya HTTP Custom: `ip:port@user:pass`.
 *
 * Contoh nyata: `id3-1forcr.zivpn.site:80@trial2264:Kpu7cDXX`
 *
 * Aturan baca yang longgar supaya orang tidak terjebak format:
 * - `user:pass` wajib, `user` saja boleh, `@...` boleh tidak ada;
 * - port boleh tidak ditulis (pakai port profil yang sudah ada);
 * - IPv6 ditulis dalam kurung siku: `[2001:db8::1]:80@user:pass`.
 */
internal data class CompactConfig(
    val host: String,
    val port: Int?,
    val user: String?,
    val pass: String?
)

internal object Compact {
    /** Baca satu baris; `null` bila tidak ada host yang bisa dipakai. */
    fun parse(text: String): CompactConfig? {
        val s = text.trim()
        if (s.isEmpty()) return null

        val at = s.indexOf('@')
        val endpoint = if (at >= 0) s.substring(0, at) else s
        val creds = if (at >= 0) s.substring(at + 1) else null

        val (host, port) = parseEndpoint(endpoint.trim())
        if (host.isBlank()) return null

        var user: String? = null
        var pass: String? = null
        if (creds != null) {
            val colon = creds.indexOf(':')
            if (colon >= 0) {
                user = creds.substring(0, colon).trim()
                pass = creds.substring(colon + 1)
            } else {
                user = creds.trim()
                pass = ""
            }
        }
        return CompactConfig(host, port, user?.takeIf { it.isNotEmpty() }, pass)
    }

    private fun parseEndpoint(endpoint: String): Pair<String, Int?> {
        if (endpoint.isEmpty()) return "" to null
        if (endpoint.startsWith("[")) {
            val close = endpoint.indexOf(']')
            if (close > 0) {
                val host = endpoint.substring(1, close)
                val rest = endpoint.substring(close + 1).trim()
                val port = if (rest.startsWith(":")) rest.drop(1).toIntOrNull() else null
                return host to port
            }
            return endpoint to null
        }
        // Satu titik dua = pemisah port. Lebih dari satu tanpa kurung siku
        // dianggap host IPv6 mentah, bukan host:port.
        val colon = endpoint.lastIndexOf(':')
        if (colon > 0 && endpoint.indexOf(':') == colon) {
            val maybePort = endpoint.substring(colon + 1)
            val port = maybePort.toIntOrNull()
            if (port != null && port in 1..65535) {
                return endpoint.substring(0, colon) to port
            }
        }
        return endpoint to null
    }

    /** Tulis kembali ke bentuk yang sama seperti di layar acuan. */
    fun format(p: Profile): String {
        if (p.host.isBlank()) return ""
        val host = if (p.host.contains(':') && !p.host.startsWith("[")) "[${p.host}]" else p.host
        val endpoint = if (p.port in 1..65535) "$host:${p.port}" else host
        if (p.user.isBlank()) return endpoint
        return if (p.pass.isEmpty()) "$endpoint@${p.user}" else "$endpoint@${p.user}:${p.pass}"
    }

    /**
     * Terapkan hasil baca ke profil. Endpoint/user/pass yang tidak ada di
     * baris dibiarkan seperti semula.
     */
    fun apply(p: Profile, cfg: CompactConfig): Profile = p.copy(
        host = cfg.host,
        port = cfg.port ?: p.port,
        user = cfg.user ?: p.user,
        pass = cfg.pass ?: p.pass
    )
}
