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

/**
 * Render satu entri log menjadi teks berwarna, mengikuti bentuk acuan:
 * `[10:24:31]  pesan`
 *
 * Level tetap terbaca dari warna pesannya: INFO putih, PING hijau, WARN
 * kuning, ERROR merah muda. Jam selalu redup supaya pesan yang menonjol.
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

    val msgStart = ss.length
    ss.append(message)
    ss.setSpan(
        ForegroundColorSpan(logLevelColor(level)),
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
