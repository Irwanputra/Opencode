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
 * Level: INFO, WARN, ERROR, PING, OK, BANNER. Pemanggil lama cukup memakai
 * [add] dengan tag; level diturunkan otomatis dari tag/pesan agar tidak perlu
 * mengubah seluruh kode transport. BANNER dipakai untuk banner SSH/server
 * message yang boleh membawa kode warna ANSI dari server.
 */
object TunnelLog {
    const val INFO = "INFO"
    const val WARN = "WARN"
    const val ERROR = "ERROR"
    const val PING = "PING"
    const val OK = "OK"
    const val BANNER = "BANNER"

    /** Kode ANSI SGR (`ESC[...m`) dan escape kontrol lain yang tidak terlihat. */
    private val ANSI_SGR = Regex("\\u001B\\[[0-9;]*m")
    private val ANSI_OTHER = Regex("\\u001B\\[[0-9;?]*[ -/]*[@-~]")
    private val CONTROL = Regex("[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F\\u007F]")

    /** Teks polos untuk disalin: escape ANSI/kontrol dibuang. */
    internal fun plain(text: String): String =
        CONTROL.replace(ANSI_OTHER.replace(ANSI_SGR.replace(text, ""), ""), "")

    data class Entry(val time: String, val level: String, val message: String) {
        /** Format satu baris siap tampil/salin. */
        fun line(): String = "$time  [$level]  ${plain(message)}"
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
            tag.equals(OK, true) -> OK
            tag.equals(BANNER, true) -> BANNER
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
