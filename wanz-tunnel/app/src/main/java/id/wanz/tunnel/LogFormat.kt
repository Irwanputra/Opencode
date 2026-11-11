package id.wanz.tunnel

import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan

/** Warna per level log, mengikuti nuansa HTTP Custom. */
internal fun logLevelColor(level: String): Int = when (level) {
    TunnelLog.WARN -> AMBER
    TunnelLog.ERROR -> CORAL
    TunnelLog.PING -> TEAL
    else -> 0xFFD7E2F5.toInt()
}

private const val LOG_TIME_COLOR = 0xFF6C82A8.toInt()
private const val LOG_MESSAGE_COLOR = 0xFFDCE6F7.toInt()

/**
 * Render satu entri log menjadi teks berwarna:
 * `10:24:31  [INFO]  pesan`
 */
internal fun TunnelLog.Entry.toSpanned(): CharSequence {
    val ss = SpannableStringBuilder()
    ss.append(time)
    ss.setSpan(ForegroundColorSpan(LOG_TIME_COLOR), 0, ss.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

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
        ForegroundColorSpan(LOG_MESSAGE_COLOR),
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
