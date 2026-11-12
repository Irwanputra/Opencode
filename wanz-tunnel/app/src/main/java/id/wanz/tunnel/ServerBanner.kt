package id.wanz.tunnel

/**
 * Banner "Server Message" dari banyak server SSH (mis. Sunek) berupa potongan
 * HTML berwarna:
 *
 * ```
 * <p style="text-align:center"><b><br>
 * <br><font color='#FF8A00'><b>┌──────◆──────┐</b></font><br>
 * <br><font color='#00E5FF'><b>» Akun VPN</b></font><br>
 * ```
 *
 * Ditampilkan mentah, log jadi penuh tag. Fungsi ini mengubah HTML tersebut
 * menjadi kode warna ANSI SGR sehingga warna asli server tetap tampil di
 * layar, sementara tombol Salin tetap mencetak teks polos (escape ANSI dibuang
 * oleh `TunnelLog.plain`). Pesan tanpa tag (termasuk banner ANSI murni)
 * diteruskan apa adanya.
 */
internal object ServerBanner {
    private const val ESC = '\u001B'

    private val BR = Regex("<br\\s*/?>", RegexOption.IGNORE_CASE)
    private val OPEN_FONT = Regex(
        "<font[^>]*color\\s*=\\s*['\"]?#([0-9A-Fa-f]{6})['\"]?[^>]*>",
        RegexOption.IGNORE_CASE
    )
    private val CLOSE_FONT = Regex("</font>", RegexOption.IGNORE_CASE)
    private val OPEN_B = Regex("<(?:b|strong)>", RegexOption.IGNORE_CASE)
    private val CLOSE_B = Regex("</(?:b|strong)>", RegexOption.IGNORE_CASE)
    private val OPEN_U = Regex("<u>", RegexOption.IGNORE_CASE)
    private val CLOSE_U = Regex("</u>", RegexOption.IGNORE_CASE)
    private val ANY_TAG = Regex("</?[a-zA-Z][^>]*>")
    private val ENTITIES = linkedMapOf(
        ">" to ">",
        "<" to "<",
        ("&" + "quot;") to "\"",
        ("&" + "#39;") to "'",
        ("&" + "apos;") to "'",
        ("&" + "nbsp;") to " ",
        "&" to "&"
    )

    fun toAnsi(html: String): String {
        if (!html.contains('<')) return html
        var s = BR.replace(html, "\n")
        s = OPEN_FONT.replace(s) { m -> rgb(m.groupValues[1]) }
        s = CLOSE_FONT.replace(s, "${ESC}[39m")
        s = OPEN_B.replace(s, "${ESC}[1m")
        s = CLOSE_B.replace(s, "${ESC}[22m")
        s = OPEN_U.replace(s, "${ESC}[4m")
        s = CLOSE_U.replace(s, "${ESC}[24m")
        s = ANY_TAG.replace(s, "")
        for ((entity, plain) in ENTITIES) s = s.replace(entity, plain)
        return s.trim('\n', ' ')
    }

    /** `#RRGGBB` → escape warna teks 24-bit (`ESC[38;2;R;G;Bm`). */
    private fun rgb(hex: String): String {
        val r = hex.substring(0, 2).toInt(16)
        val g = hex.substring(2, 4).toInt(16)
        val b = hex.substring(4, 6).toInt(16)
        return "${ESC}[38;2;$r;$g;${b}m"
    }
}
