package id.wanz.tunnel

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Log ring-buffer sederhana yang dibagi antara service, transport, dan UI.
 *
 * Semua komponen (service/tunnel) menulis ke sini, lalu halaman utama
 * menampilkannya secara live. Isi log disimpan di memori supaya tetap ada
 * saat activity dibuat ulang.
 */
object TunnelLog {
    private const val MAX_LINES = 800
    private val lines = ArrayDeque<String>()
    private val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.US)

    /** Dipanggil setiap ada baris baru/dibersihkan. Bisa dari thread mana pun. */
    @Volatile
    var onChange: (() -> Unit)? = null

    fun add(tag: String, message: String) {
        val entry = "${timeFormat.format(Date())}  $tag  $message"
        synchronized(lines) {
            lines.addLast(entry)
            while (lines.size > MAX_LINES) lines.removeFirst()
        }
        onChange?.invoke()
    }

    fun snapshot(): List<String> = synchronized(lines) { lines.toList() }

    fun clear() {
        synchronized(lines) { lines.clear() }
        onChange?.invoke()
    }
}