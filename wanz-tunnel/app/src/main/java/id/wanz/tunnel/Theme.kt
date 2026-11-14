package id.wanz.tunnel

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle

/**
 * Sistem visual: mengikuti aplikasi acuan **HTTP Custom** yang dipakai
 * pemilik aplikasi ini — bukan lagi arah "Konsol" yang abstrak.
 *
 * Yang diambil dari acuan, bukan ditebak:
 * - kanvas abu gelap netral (#1E1E1E) untuk seluruh layar, termasuk bilah atas
 *   dan tab — tanpa gradien dan tanpa bayangan; satu-satunya kartu adalah
 *   ringkasan trafik bergaris tipis di bawah tombol sambung;
 * - hijau tunggal (#4CAF50) untuk identitas dan status hidup: judul, garis tab
 *   aktif, kotak centang terpilih, tepi tombol utama, tombol tambah;
 * - judul "Wanz Tunnel" dengan kata pertama hijau dan kata kedua putih;
 * - dua tab selebar layar dengan garis bawah hijau setebal 3px;
 * - isian bergaris bawah saja, tanpa kotak latar;
 * - kisi centang dua kolom dan tombol utama bergaris tepi;
 * - log monospace berbaris `[jam:menit:detik] pesan` dengan garis pemisah tipis.
 *
 * Pasangan warna diukur ulang untuk dua palet (WCAG AA minimal 4,5:1 untuk
 * teks). Mode terang bukan inversi: latar putih, teks hampir hitam, hijau
 * digelapkan sampai lolos kontras.
 *
 * ```
 *                 TERANG                        GELAP
 *   INK/BG   17.22      INK/BG   16.67
 *   MUTED/BG  6.39      MUTED/BG  8.87
 *   FAINT/BG  5.33      FAINT/BG  6.22
 *   OK/BG     5.13      OK/BG     6.00
 *   WARN/BG   6.33      WARN/BG  11.81
 *   ERR/BG    6.54      ERR/BG    6.09
 *   ACCENT/BG 5.13      ACCENT/BG 6.00
 * ```
 */
internal class Palette(
    val bg: Int, val panel: Int, val field: Int,
    val ink: Int, val muted: Int, val faint: Int, val hair: Int,
    val ok: Int, val warn: Int, val err: Int, val onInk: Int,
    val accent: Int, val onAccent: Int,
)

private const val LIGHT_BG = 0xFFFFFFFF.toInt()
private const val LIGHT_PANEL = 0xFFF5F5F5.toInt()
private const val LIGHT_FIELD = 0xFFFFFFFF.toInt()
private const val LIGHT_INK = 0xFF1B1B1B.toInt()
private const val LIGHT_MUTED = 0xFF5F5F5F.toInt()
private const val LIGHT_FAINT = 0xFF6B6B6B.toInt()
private const val LIGHT_HAIR = 0xFFDDDDDD.toInt()
private const val LIGHT_OK = 0xFF2E7D32.toInt()
private const val LIGHT_WARN = 0xFF8A5300.toInt()
private const val LIGHT_ERR = 0xFFB3261E.toInt()
private const val LIGHT_ON_INK = 0xFFFFFFFF.toInt()
private const val LIGHT_ACCENT = 0xFF2E7D32.toInt()
private const val LIGHT_ON_ACCENT = 0xFFFFFFFF.toInt()

private const val DARK_BG = 0xFF1E1E1E.toInt()
private const val DARK_PANEL = 0xFF252525.toInt()
private const val DARK_FIELD = 0xFF1E1E1E.toInt()
private const val DARK_INK = 0xFFFFFFFF.toInt()
private const val DARK_MUTED = 0xFFBDBDBD.toInt()
private const val DARK_FAINT = 0xFF9E9E9E.toInt()
private const val DARK_HAIR = 0xFF3C3C3C.toInt()
private const val DARK_OK = 0xFF4CAF50.toInt()
private const val DARK_WARN = 0xFFFFD54F.toInt()
private const val DARK_ERR = 0xFFFF6B81.toInt()
private const val DARK_ON_INK = 0xFF1E1E1E.toInt()
private const val DARK_ACCENT = 0xFF4CAF50.toInt()
private const val DARK_ON_ACCENT = 0xFF0D1B0E.toInt()

private val LIGHT = Palette(
    bg = LIGHT_BG, panel = LIGHT_PANEL, field = LIGHT_FIELD,
    ink = LIGHT_INK, muted = LIGHT_MUTED, faint = LIGHT_FAINT, hair = LIGHT_HAIR,
    ok = LIGHT_OK, warn = LIGHT_WARN, err = LIGHT_ERR, onInk = LIGHT_ON_INK,
    accent = LIGHT_ACCENT, onAccent = LIGHT_ON_ACCENT,
)

private val DARK = Palette(
    bg = DARK_BG, panel = DARK_PANEL, field = DARK_FIELD,
    ink = DARK_INK, muted = DARK_MUTED, faint = DARK_FAINT, hair = DARK_HAIR,
    ok = DARK_OK, warn = DARK_WARN, err = DARK_ERR, onInk = DARK_ON_INK,
    accent = DARK_ACCENT, onAccent = DARK_ON_ACCENT,
)

// ------------------------------------------------------------------ token aktif
internal var BG = LIGHT.bg
internal var PANEL = LIGHT.panel
internal var FIELD = LIGHT.field
internal var INK = LIGHT.ink
internal var MUTED = LIGHT.muted
internal var FAINT = LIGHT.faint
internal var HAIR = LIGHT.hair

/** Status koneksi: hijau, kuning, merah — sama seperti warna log acuan. */
internal var OK = LIGHT.ok
internal var WARN = LIGHT.warn
internal var ERR = LIGHT.err

internal var ON_INK = LIGHT.onInk

/** Identitas: hijau tunggal, dipakai judul, garis tab, centang, tepi tombol. */
internal var ACCENT = LIGHT.accent
internal var ON_ACCENT = LIGHT.onAccent

/** true saat palet gelap sedang dipakai; dipakai chrome jendela dan scrim. */
internal var darkActive = false
    private set

// ------------------------------------------------------------------ pilihan tema
internal const val THEME_SYSTEM = 0
internal const val THEME_LIGHT = 1
internal const val THEME_DARK = 2

internal val THEME_LABELS = listOf("Ikuti sistem", "Terang", "Gelap")

/** Preferensi global aplikasi (bukan per profil). */
internal object AppPrefs {
    private const val FILE = "app_cfg"

    private fun prefs(context: Context) =
        context.getSharedPreferences(FILE, Context.MODE_PRIVATE)

    fun themeMode(context: Context): Int =
        prefs(context).getInt("theme_mode", THEME_SYSTEM)

    fun setThemeMode(context: Context, mode: Int) {
        prefs(context).edit().putInt("theme_mode", mode).apply()
    }
}

internal fun systemDark(context: Context): Boolean =
    (context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) ==
        Configuration.UI_MODE_NIGHT_YES

private fun paletteFor(mode: Int, sysDark: Boolean): Palette = when (mode) {
    THEME_LIGHT -> LIGHT
    THEME_DARK -> DARK
    else -> if (sysDark) DARK else LIGHT
}

/**
 * Pasang token warna. Harus dipanggil paling awal di `onCreate` setiap
 * activity, sebelum view apa pun dibuat (Paint menangkap warna saat dibuat).
 */
internal fun applyPalette(context: Context): Boolean {
    val mode = AppPrefs.themeMode(context)
    val sysDark = systemDark(context)
    val p = paletteFor(mode, sysDark)
    darkActive = p === DARK
    BG = p.bg
    PANEL = p.panel
    FIELD = p.field
    INK = p.ink
    MUTED = p.muted
    FAINT = p.faint
    HAIR = p.hair
    OK = p.ok
    WARN = p.warn
    ERR = p.err
    ON_INK = p.onInk
    ACCENT = p.accent
    ON_ACCENT = p.onAccent
    return darkActive
}

/**
 * Activity dasar.
 *
 * 1. Palet dan chrome jendela dipasang sebelum subclass membuat view apa pun.
 * 2. Kalau preferensi tema berubah ketika halaman ini sedang di belakang,
 *    halaman dibangun ulang saat kembali ke depan.
 */
abstract class InkActivity : Activity() {
    private var builtWithMode = -1

    override fun onCreate(b: Bundle?) {
        applyPalette(this)
        super.onCreate(b)
        // Setelah super.onCreate: WindowInsetsController baru tersedia, jadi
        // ikon status bar/navigation bar benar-benar mengikuti palet.
        applyWindowChrome(this)
        builtWithMode = AppPrefs.themeMode(this)
    }

    override fun onResume() {
        super.onResume()
        applyWindowChrome(this)
        if (AppPrefs.themeMode(this) != builtWithMode) recreate()
    }
}

/**
 * Samakan jendela, status bar, dan navigation bar dengan palet aktif.
 */
internal fun applyWindowChrome(activity: Activity) {
    val window = activity.window
    window.decorView.setBackgroundColor(BG)
    window.statusBarColor = BG
    window.navigationBarColor = BG
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        setLightBars(window, !darkActive)
    } else {
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = if (darkActive) 0 else
            (android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or
                android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
    }
}

@android.annotation.TargetApi(Build.VERSION_CODES.R)
private fun setLightBars(window: android.view.Window, light: Boolean) {
    val controller = window.insetsController ?: return
    val bits = android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS or
        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
    controller.setSystemBarsAppearance(if (light) bits else 0, bits)
}

/**
 * Sudut: isian tidak bersudut (hanya garis bawah), kotak centang 2dp, tombol
 * dan panel 4dp. Tiga peran, tiga alasan — bukan satu angka untuk semua.
 */
internal const val R_FIELD = 0
internal const val R_CHECK = 2
internal const val R_PANEL = 4
internal const val R_HAIR = 0
