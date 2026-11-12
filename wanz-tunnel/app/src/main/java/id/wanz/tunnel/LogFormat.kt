package id.wanz.tunnel

import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan

/**
 * Warna per level log. Semua dibaca ulang tiap render: token warna berubah
 * saat palet gelap dipasang, jadi warnanya tidak boleh ditambal di sini.
 */
internal fun logLevelColor(level: String): Int = when (level) {
    TunnelLog.WARN -> WARN
    TunnelLog.ERROR -> ERR
    TunnelLog.PING -> OK
    else -> INK
}

private fun logTimeColor(): Int = FAINT
private fun logMessageColor(): Int = INK

/**
 * Render satu entri log menjadi teks berwarna:
 * `10:24:31  [INFO]  pesan`
 */
internal fun TunnelLog.Entry.toSpanned(): CharSequence {
    val ss = SpannableStringBuilder()
    ss.append(time)
    ss.setSpan(ForegroundColorSpan(logTimeColor()), 0, ss.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

    ss.append("  [")
    val levelStart = ss.length
    ss.append(level)
    ss.setSpan(
        ForegroundColorSpan(logLevelColor(level)),
        levelStart,
        ss.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    ss.append("]  ")

    val msgStart = ss.length
    ss.append(message)
    ss.setSpan(
        ForegroundColorSpan(logMessageColor()),
        msgStart,
        ss.length,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    return ss
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
