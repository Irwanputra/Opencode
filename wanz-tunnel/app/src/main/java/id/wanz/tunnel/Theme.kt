package id.wanz.tunnel

import android.app.Activity
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle

/**
 * Sistem visual "Konsol" (v2.9): grafit gelap dengan kertas sebagai varian.
 *
 * Arah diambil dari dua aplikasi yang benar-benar dipakai orang, bukan dari
 * template: kartu koneksi berisi baris label/nilai + tombol CONNECT melebar
 * seperti DarkTunnel, dan deret bacaan RX/TX + konsol log mono seperti HTTP
 * Custom. Bedanya sengaja: kanvas grafit hangat (bukan hitam pekat atau biru
 * laut), aksen kuningan (bukan ungu atau biru), tanpa ikon Material.
 *
 * Warna hanya dipakai untuk status koneksi dan satu tombol utama; sisanya
 * teks di atas permukaan. Semua datar, sudut kecil, garis rambut 1dp.
 *
 * Semua warna lewat [Palette] supaya mode gelap bukan hasil inversi mentah:
 * tiap pasangan teks/bidang diukur dulu. Nomor di bawah rasio kontras
 * WCAG-nya terhadap permukaan tempat token itu dipakai.
 *
 * ```
 *                 TERANG                        GELAP
 *   INK/BG   15.85      INK/BG   16.44
 *   MUTED/BG  5.33      MUTED/BG  8.10
 *   FAINT/BG  5.01      FAINT/BG  5.62
 *   FAINT/PANEL 4.62    FAINT/PANEL 5.04
 *   OK/BG     5.75      OK/BG     8.24
 *   WARN/BG   5.59      WARN/BG   8.22
 *   ERR/BG    6.50      ERR/BG    6.96
 *   ON_INK/INK 16.28    ON_INK/INK 16.04
 *   AKSEN/BG   5.47      AKSEN/BG  7.66
 *   ON_AK/AKSEN 6.00     ON_AK/AKSEN 7.58
 * ```
 *
 * `HAIR` bukan teks: garis rambut 1dp, 1.8:1 terhadap BG sudah cukup untuk
 * memisahkan bidang tanpa jadi kotak. Perbedaan `MUTED` dan `FAINT` bukan
 * cuma terang: `MUTED` selalu proza, `FAINT` selalu mono (placeholder, nilai
 * kosong, cap waktu log).
 */
internal class Palette(
    val bg: Int, val panel: Int, val field: Int,
    val ink: Int, val muted: Int, val faint: Int, val hair: Int,
    val ok: Int, val warn: Int, val err: Int, val onInk: Int,
    val accent: Int, val onAccent: Int,
)

private const val LIGHT_BG = 0xFFF1F1EC.toInt()
private const val LIGHT_PANEL = 0xFFE8E8E2.toInt()
private const val LIGHT_FIELD = 0xFFEAEAE4.toInt()
private const val LIGHT_INK = 0xFF15171A.toInt()
private const val LIGHT_MUTED = 0xFF5F645F.toInt()
private const val LIGHT_FAINT = 0xFF646862.toInt()
private const val LIGHT_HAIR = 0xFFC7C9C2.toInt()
private const val LIGHT_OK = 0xFF146B46.toInt()
private const val LIGHT_WARN = 0xFF8A5300.toInt()
private const val LIGHT_ERR = 0xFFA3261B.toInt()
private const val LIGHT_ON_INK = 0xFFF4F4EF.toInt()
private const val LIGHT_ACCENT = 0xFF7E5B10.toInt()
private const val LIGHT_ON_ACCENT = 0xFFFFFBF2.toInt()

private const val DARK_BG = 0xFF131410.toInt()
private const val DARK_PANEL = 0xFF1E1F19.toInt()
private const val DARK_FIELD = 0xFF1A1B15.toInt()
private const val DARK_INK = 0xFFF2F2EA.toInt()
private const val DARK_MUTED = 0xFFA9ADA4.toInt()
private const val DARK_FAINT = 0xFF8B8F87.toInt()
private const val DARK_HAIR = 0xFF32342C.toInt()
private const val DARK_OK = 0xFF5BC08A.toInt()
private const val DARK_WARN = 0xFFEFAE3C.toInt()
private const val DARK_ERR = 0xFFEF7F68.toInt()
private const val DARK_ON_INK = 0xFF16170F.toInt()
private const val DARK_ACCENT = 0xFFC9A22F.toInt()
private const val DARK_ON_ACCENT = 0xFF1A1405.toInt()

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
// Nama token menyebut PERAN, bukan warna: `BG` permukaan dasar, `INK` teks
// utama sekaligus isi tombol primer, `ON_INK` teks di atas isi tombol itu.
// Karena itu token ini `var`: diganti sekali oleh [applyPalette] sebelum UI
// dibangun, bukan dibaca ulang sebagai konstanta waktu-kompilasi.

internal var BG = LIGHT.bg
internal var PANEL = LIGHT.panel
internal var FIELD = LIGHT.field
internal var INK = LIGHT.ink
internal var MUTED = LIGHT.muted
internal var FAINT = LIGHT.faint
internal var HAIR = LIGHT.hair

/** Status koneksi — satu-satunya warna semantik. */
internal var OK = LIGHT.ok
internal var WARN = LIGHT.warn
internal var ERR = LIGHT.err

/** Teks/isi yang menjepit warna [INK]: di terang kertas, di gelap tinta. */
internal var ON_INK = LIGHT.onInk

/**
 * Aksen identitas: kuningan tua di terang, kuningan di gelap. Bukan ungu dan
 * bukan biru — dua warna yang dipakai DarkTunnel dan HTTP Custom, dan yang
 * paling sering keluar dari generator. Hanya untuk tombol utama, chip aktif,
 * dan tautan; status tetap hijau/jingga/merah.
 */
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
 * Activity dasar "Konsol".
 *
 * Dua hal dikerjakan di sini supaya tidak ditiru tiga kali:
 *
 * 1. Palet dan chrome jendela dipasang sebelum subclass membuat view apa pun.
 * 2. Kalau preferensi tema berubah ketika halaman ini sedang di belakang
 *    (mis. pengguna memilih Gelap di pengaturan), halaman dibangun ulang saat
 *    kembali ke depan. Tanpa itu, halaman lama tetap memakai warna lama dan
 *    tampil campur aduk.
 */
abstract class InkActivity : Activity() {
    private var builtWithMode = -1

    override fun onCreate(b: Bundle?) {
        applyPalette(this)
        applyWindowChrome(this)
        builtWithMode = AppPrefs.themeMode(this)
        super.onCreate(b)
    }

    override fun onResume() {
        super.onResume()
        if (AppPrefs.themeMode(this) != builtWithMode) recreate()
    }
}

/**
 * Samakan jendela, status bar, dan navigation bar dengan palet aktif.
 *
 * Saat mode gelap atau terang dipilih manual, resource `values-night` belum
 * tentu ikut (dia ikut setting sistem), jadi chrome ditutup dari kode.
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

/**
 * Ikon bar sistem ikut terang/gelap. API 30 memindahkan pengaturannya dari
 * bendera `systemUiVisibility` ke `WindowInsetsController`.
 */
@android.annotation.TargetApi(Build.VERSION_CODES.R)
private fun setLightBars(window: android.view.Window, light: Boolean) {
    val controller = window.insetsController ?: return
    val bits = android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS or
        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
    controller.setSystemBarsAppearance(if (light) bits else 0, bits)
}

/**
 * Sudut per peran — bukan satu angka untuk semua (Anti-Slop Test:
 * "uniform border-radius on everything").
 *
 * - [R_FIELD] 1dp: bidang masukan, supaya terasa seperti formulir cetak.
 * - [R_PANEL] 2dp: panel, bilah aksi, tombol.
 * - [R_HAIR] 0dp: garis dan rel status.
 */
internal const val R_FIELD = 1
internal const val R_PANEL = 2
internal const val R_HAIR = 0
