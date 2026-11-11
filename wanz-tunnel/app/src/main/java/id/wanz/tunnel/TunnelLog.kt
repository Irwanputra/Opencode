package id.wanz.tunnel

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Log ring-buffer dengan level, ditampilkan mirip HTTP Custom:
 *
 * ```
 * 10:24:31  [INFO]   Membuka proxy/edge 104.17.70.206:80
 * 10:24:32  [INFO]   Banner SSH: SSH-2.0-dropbear_2019.78
 * 10:24:42  [PING]   38 ms
 * 10:25:02  [ERROR]  Gagal: Connection refused
 * ```
 *
 * Level: INFO, WARN, ERROR, PING. Pemanggil lama cukup memakai [add] dengan
 * tag; level diturunkan otomatis dari tag/pesan agar tidak perlu mengubah
 * seluruh kode transport.
 */
object TunnelLog {
    const val INFO = "INFO"
    const val WARN = "WARN"
    const val ERROR = "ERROR"
    const val PING = "PING"

    data class Entry(val time: String, val level: String, val message: String) {
        /** Format satu baris siap tampil/salin. */
        fun line(): String = "$time  [$level]  $message"
    }

    private const val MAX_LINES = 800
    private val entries = ArrayDeque<Entry>()
    private val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.US)

    /** Dipanggil setiap ada baris baru/dibersihkan. Bisa dari thread mana pun. */
    @Volatile
    var onChange: (() -> Unit)? = null

    fun add(tag: String, message: String) {
        val level = when {
            tag.equals(ERROR, true) -> ERROR
            tag.equals(WARN, true) -> WARN
            tag.equals(PING, true) -> PING
            message.startsWith("Gagal", true) -> ERROR
            message.startsWith("Mencoba ulang", true) -> WARN
            message.startsWith("Menunggu", true) -> INFO
            else -> INFO
        }
        val entry = Entry(timeFormat.format(Date()), level, message)
        synchronized(entries) {
            entries.addLast(entry)
            while (entries.size > MAX_LINES) entries.removeFirst()
        }
        onChange?.invoke()
    }

    /** Semua entri terstruktur (untuk pewarnaan per level). */
    fun all(): List<Entry> = synchronized(entries) { entries.toList() }

    /** Teks siap tampil/salin. */
    fun snapshot(): List<String> = all().map { it.line() }

    fun clear() {
        synchronized(entries) { entries.clear() }
        onChange?.invoke()
    }
}
