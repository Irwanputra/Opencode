package id.wanz.tunnel

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle

/**
 * Sistem visual "Wanz" — dirancang ulang pada v2.9.16 memakai mockup
 * text-to-image (Seedream 5.5) sebagai referensi, bukan lagi tiruan layar
 * HTTP Custom. Bahasa visualnya:
 *
 * - kanvas charcoal `#15171A` (gelap) dan putih bersih (terang);
 * - kartu membulat 20dp (`PANEL`) dengan garis rambut, isian kotak 14dp,
 *   tombol dan pil 28dp penuh;
 * - hijau tunggal `#4CAF50`/`#2E7D32` untuk identitas dan status hidup:
 *   pil tab aktif, kotak centang, tombol sambung terisi penuh;
 * - ubin merek W di bilah atas, laci, dan dialog Tentang;
 * - log monospace berbaris dalam kartu kecil membulat, bukan garis tipis.
 *
 * Pasangan warna diukur ulang untuk dua palet (WCAG AA minimal 4,5:1 untuk
 * teks). Mode terang bukan inversi: latar putih, teks hampir hitam, hijau
 * digelapkan sampai lolos kontras.
 *
 * ```
 *                 TERANG                        GELAP
 *   INK/BG   17.22      INK/BG   17.96
 *   MUTED/BG  6.29      MUTED/BG  8.74
 *   FAINT/BG  5.11      FAINT/BG  5.66
 *   OK/BG     5.13      OK/BG     6.46
 *   WARN/BG   6.33      WARN/BG  12.73
 *   ERR/BG    6.54      ERR/BG    6.56
 *   ACCENT/BG 5.13      ACCENT/BG 6.46
 * ```
 */
internal class Palette(
    val bg: Int, val panel: Int, val field: Int,
    val ink: Int, val muted: Int, val faint: Int, val hair: Int,
    val ok: Int, val warn: Int, val err: Int, val onInk: Int,
    val accent: Int, val onAccent: Int,
)

private const val LIGHT_BG = 0xFFFFFFFF.toInt()
private const val LIGHT_PANEL = 0xFFF3F5F4.toInt()
private const val LIGHT_FIELD = 0xFFFFFFFF.toInt()
private const val LIGHT_INK = 0xFF1B1B1B.toInt()
private const val LIGHT_MUTED = 0xFF5A6167.toInt()
private const val LIGHT_FAINT = 0xFF676F76.toInt()
private const val LIGHT_HAIR = 0xFFE2E6E4.toInt()
private const val LIGHT_OK = 0xFF2E7D32.toInt()
private const val LIGHT_WARN = 0xFF8A5300.toInt()
private const val LIGHT_ERR = 0xFFB3261E.toInt()
private const val LIGHT_ON_INK = 0xFFFFFFFF.toInt()
private const val LIGHT_ACCENT = 0xFF2E7D32.toInt()
private const val LIGHT_ON_ACCENT = 0xFFFFFFFF.toInt()

private const val DARK_BG = 0xFF15171A.toInt()
private const val DARK_PANEL = 0xFF1E2328.toInt()
private const val DARK_FIELD = 0xFF262D34.toInt()
private const val DARK_INK = 0xFFFFFFFF.toInt()
private const val DARK_MUTED = 0xFFAEB6BD.toInt()
private const val DARK_FAINT = 0xFF87929B.toInt()
private const val DARK_HAIR = 0xFF2E363D.toInt()
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
 * Sudut mengikuti bahasa mockup "Wanz": kartu 20dp, isian kotak 14dp,
 * kotak centang 7dp, tombol dan pil 28dp penuh, baris log 10dp. Tiga peran
 * utama + dua peran kecil — bukan satu angka untuk semua.
 */
internal const val R_FIELD = 14
internal const val R_CHECK = 12
internal const val R_PANEL = 20
internal const val R_HAIR = 0
internal const val R_PILL = 28
internal const val R_LINE = 10
