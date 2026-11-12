package id.wanz.tunnel

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan

/**
 * Warna per level log. Semua dibaca ulang tiap render: token warna berubah
 * saat palet gelap dipasang, jadi warnanya tidak boleh ditambal di sini.
 */
internal fun logLevelColor(level: String): Int = when (level) {
    TunnelLog.WARN -> WARN
    TunnelLog.ERROR -> ERR
    TunnelLog.PING -> OK
    TunnelLog.OK -> OK
    TunnelLog.BANNER -> ACCENT
    else -> INK
}

private fun logTimeColor(): Int = FAINT

/**
 * Palet ANSI standar untuk banner/server message. Sengaja versi redup yang
 * masih terbaca di latar gelap maupun terang, bukan putih murni menyilaukan.
 */
private val ANSI_NORMAL = intArrayOf(
    0x000000, 0xD64545, 0x3C9A5F, 0xB7791F, 0x3A7BD5, 0x9B59B6, 0x2A8F9A, 0x8A8F98
)
private val ANSI_BRIGHT = intArrayOf(
    0x6B7280, 0xFF6B6B, 0x7FD68F, 0xE8B34B, 0x74A9FF, 0xC792E0, 0x6FD3DE, 0xFFFFFF
)

private const val ESC = '\u001B'

/**
 * Render satu entri log menjadi teks berwarna, mengikuti bentuk acuan:
 * `[10:24:31]  pesan`
 *
 * Level tetap terbaca dari warna pesannya: INFO putih, OK/PING hijau, WARN
 * kuning, ERROR merah muda, BANNER hijau aksen. Kode ANSI dari banner SSH
 * ditafsirkan per span supaya warna asli server tidak hilang, lalu diakhiri
 * dengan warna level agar sisa baris tetap konsisten.
 */
internal fun TunnelLog.Entry.toSpanned(): CharSequence {
    val ss = SpannableStringBuilder()
    ss.append("[")
    val timeStart = ss.length
    ss.append(time)
    ss.setSpan(
        ForegroundColorSpan(logTimeColor()),
        timeStart,
        ss.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    ss.append("]  ")
    appendAnsi(ss, message, logLevelColor(level))
    return ss
}

/** Tulis teks dengan kode SGR ANSI ditafsirkan menjadi span warna/tebal. */
private fun appendAnsi(out: SpannableStringBuilder, text: String, base: Int) {
    var color = base
    var bold = false
    var index = 0
    while (index < text.length) {
        val esc = text.indexOf(ESC, index)
        if (esc < 0) {
            appendStyled(out, text.substring(index), color, bold)
            return
        }
        if (esc > index) appendStyled(out, text.substring(index, esc), color, bold)
        val end = text.indexOf('m', esc + 1)
        if (end < 0) return // escape menggantung: sisa teks dibuang
        val codes = text.substring(esc + 2, end)
            .split(';')
            .mapNotNull { it.trim().toIntOrNull() }
        if (codes.isEmpty()) {
            color = base
            bold = false
        }
        for (code in codes) {
            when {
                code == 0 -> {
                    color = base
                    bold = false
                }
                code == 1 -> bold = true
                code == 22 -> bold = false
                code == 39 -> color = base
                code in 30..37 -> color = ANSI_NORMAL[code - 30]
                code in 90..97 -> color = ANSI_BRIGHT[code - 90]
            }
        }
        index = end + 1
    }
}

private fun appendStyled(
    out: SpannableStringBuilder,
    text: String,
    color: Int,
    bold: Boolean
) {
    if (text.isEmpty()) return
    val start = out.length
    out.append(text)
    out.setSpan(
        ForegroundColorSpan(color),
        start,
        out.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    if (bold) {
        out.setSpan(
            StyleSpan(Typeface.BOLD),
            start,
            out.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
}

/** Gabungkan semua entri menjadi satu teks berwarna. */
internal fun renderLogSpanned(entries: List<TunnelLog.Entry>): CharSequence {
    val out = SpannableStringBuilder()
    entries.forEachIndexed { index, entry ->
        if (index > 0) out.append('\n')
        out.append(entry.toSpanned())
    }
    return out
}
