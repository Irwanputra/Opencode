package id.wanz.tunnel

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.util.TypedValue
import android.widget.TextView
import kotlin.math.ceil
import kotlin.math.roundToInt

/**
 * Tipografi "Konsol".
 *
 * Keputusan tipografi, bukan default sistem:
 *
 * - **Data dan label** (ping, uptime, host, port, log, nama kolom) →
 *   **JetBrains Mono** (Google Fonts, OFL). Aplikasi ini instrumen jaringan:
 *   angka, alamat, dan baris log harus tabular dan sejajar antarbaris supaya
 *   perubahan antar-sekscan bisa dibaca, bukan melompat-lompat.
 * - **Prosa** (kalimat penjelasan, catatan, label tombol) → **Chivo**
 *   (Google Fonts, OFL). Bukan Roboto: font bawaan HP membuat aplikasi terlihat
 *   seperti template.
 *
 * Semua font diunduh dari Google Fonts, lalu dipotong (fonttools) ke karakter
 * yang benar-benar dipakai aplikasi: Latin dasar plus `· — • … ← → × − ‹ ›`.
 * Total keempat berkas 206 KB, lebih kecil dari font sebelumnya (272 KB).
 *
 * Kenapa dua font itu, bukan yang lain — diukur, bukan selera:
 *
 * | font | tinggi x / em | tebal garis @26px | @29px | @34px |
 * |---|---|---|---|---|
 * | Roboto 400 (bawaan HP) | 0,528 | 2,67 | 2,67 | 3,00 |
 * | IBM Plex Mono 400 (sebelumnya) | 0,516 | 2,33 | 2,67 | 3,00 |
 * | JetBrains Mono 400 | 0,550 | 2,00 | 3,00 | 3,00 |
 * | **Chivo 400** | 0,511 | **3,00** | **4,00** | **4,00** |
 *
 * (Tinggi x besar = huruf kecil tetap terbuka di ukuran 9,5–12,5sp; tebal garis
 * di atas 2px = FreeType tidak perlu memecah satu garis ke dua piksel.)
 * Label micro dan judul memakai kelas 500, dan pada kelas itu JetBrains Mono serta
 * Chivo sama-sama 3px pada 26px — angka dan kalimat sama tegasnya.
 *
 * Dua hal yang bikin tulisan kelihatan **geter** di layar HP, dan dibereskan di sini:
 *
 * 1. Ukuran dalam sp yang menghasilkan piksel pecahan — 9,5sp pada densitas 2,75
 *    adalah 26,125px, sehingga garis dasar jatuh di setengah piksel dan FreeType
 *    menyebar tinta ke dua baris piksel. [px] membulatkan ke piksel utuh.
 * 2. Lebar langkah glyph yang pecahan. Glyph mono berlebar 0,6em, jadi pada
 *    26px langkahnya 15,6px; huruf kedua dan seterusnya makin jauh dari batas
 *    piksel. [tracking] memilih nilai `letterSpacing` yang membuat langkah itu
 *    bulat lagi (naik ke piksel utuh berikutnya, jadi hurufnya tidak mengecil).
 *
 * Skala (sp), cuma enam tingkat: 34 status · 27 judul layar · 21/19/18 nilai
 * bacaan · 17 judul baris · 13 proza · 11,5 label · 10,5 mikro.
 */
internal object Face {
    @Volatile private var monoCache: Typeface? = null
    @Volatile private var monoMediumCache: Typeface? = null
    @Volatile private var proseCache: Typeface? = null
    @Volatile private var proseMediumCache: Typeface? = null

    /** JetBrains Mono Regular untuk angka, alamat, dan log. */
    fun mono(context: Context): Typeface {
        monoCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.jetbrains_mono)
        } catch (_: Exception) {
            Typeface.MONOSPACE
        }
        monoCache = t
        return t
    }

    /** JetBrains Mono Medium untuk label kolom dan nilai yang perlu ditebalkan. */
    fun monoMedium(context: Context): Typeface {
        monoMediumCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.jetbrains_mono_medium)
        } catch (_: Exception) {
            Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
        }
        monoMediumCache = t
        return t
    }

    /** Chivo Regular untuk kalimat. */
    fun prose(context: Context): Typeface {
        proseCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.chivo)
        } catch (_: Exception) {
            Typeface.SANS_SERIF
        }
        proseCache = t
        return t
    }

    /** Chivo Medium untuk judul dan label tombol. */
    fun proseMedium(context: Context): Typeface {
        proseMediumCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.chivo_medium)
        } catch (_: Exception) {
            Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD)
        }
        proseMediumCache = t
        return t
    }

    /**
     * sp -> piksel **utuh**. `scaledDensity` dipakai supaya ikut pengaturan
     * ukuran huruf pengguna; hasilnya dibulatkan agar tidak ada setengah piksel
     * di garis dasar.
     */
    fun px(context: Context, sp: Float): Float {
        val d = context.resources.displayMetrics
        val scale = if (d.scaledDensity > 0f) d.scaledDensity else d.density
        return (sp * scale).roundToInt().coerceAtLeast(1).toFloat()
    }

    /**
     * dp -> piksel **utuh** untuk garis dan tepi. Tidak ikut skala huruf.
     * Garis "1dp" di densitas 2,75 selebar 2,75px: digambar anti-alias ia jadi
     * dua baris piksel kabur. Dilebarkan ke 3px dan ditempatkan di batas piksel,
     * garisnya setajam yang dirancang.
     */
    fun linePx(context: Context, dp: Float): Float =
        (dp * context.resources.displayMetrics.density).roundToInt().coerceAtLeast(1).toFloat()

    /**
     * Nilai `letterSpacing` yang membuat langkah glyph mono jatuh di batas
     * piksel. [advance] diukur tanpa tracking; [want] tracking yang diinginkan
     * (relatif em) untuk label micro yang memang perlu airy.
     */
    fun tracking(advance: Float, sizePx: Float, want: Float = 0f): Float {
        if (sizePx <= 0f || advance <= 0f) return 0f
        val extra = ceil(advance + want * sizePx) - advance
        return if (extra <= 0f) 0f else extra / sizePx
    }

    /** Lebar langkah satu glyph pada typeface dan ukuran tertentu. */
    fun advance(typeface: Typeface, sizePx: Float): Float {
        val p = Paint()
        p.typeface = typeface
        p.textSize = sizePx
        return p.measureText("0")
    }

    /**
     * Skala animasi sistem (Developer Options → Animator duration scale).
     * Nol = pengguna minta tanpa gerak; semua animasi dekoratif harus berhenti.
     */
    fun reducedMotion(context: Context): Boolean {
        val scale = javaSettingsFloat(context)
        return scale != null && scale < 0.01f
    }

    private fun javaSettingsFloat(context: Context): Float? = try {
        android.provider.Settings.Global.getFloat(
            context.contentResolver, android.provider.Settings.Global.ANIMATOR_DURATION_SCALE, 1f
        )
    } catch (_: Exception) {
        null
    }
}

/**
 * Pasang ukuran teks dalam piksel utuh. Ganti `textSize = 12.5f` (yang dihitung
 * dalam sp dan bisa jadi 34,375px) dengan `inkSize(12.5f)`.
 *
 * [mono] = true memaksa langkah glyph ikut dibulatkan; hanya untuk typeface
 * mono, karena pada font proposional memaksa lebar langkah akan merusak spasi.
 * [tracking] dipakai oleh label micro yang memang diberi jarak antarhuruf.
 */
internal fun TextView.inkSize(sp: Float, mono: Boolean = false, tracking: Float = 0f) {
    val size = Face.px(context, sp)
    setTextSize(TypedValue.COMPLEX_UNIT_PX, size)
    if (mono) letterSpacing = Face.tracking(Face.advance(typeface, size), size, tracking)
}
