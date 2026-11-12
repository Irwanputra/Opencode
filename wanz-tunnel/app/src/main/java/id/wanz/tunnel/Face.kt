package id.wanz.tunnel

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.util.TypedValue
import android.widget.TextView
import kotlin.math.ceil
import kotlin.math.roundToInt

/**
 * Tipografi: **Roboto** untuk seluruh teks antarmuka, **Roboto Mono** untuk
 * data dan log.
 *
 * Ini pilihan yang sengaja mengikuti aplikasi acuan (HTTP Custom): teks UI
 * yang dilihat orang di layar HP adalah Roboto, dan baris log-nya monospace.
 * Keduanya dari Google Fonts, dibundel (Apache 2.0) supaya ponsel dengan font
 * sistem pengganti (Samsung, Xiaomi, Infinix) tetap menampilkan bentuk yang
 * sama.
 *
 * | font | tinggi x / em | tebal garis @26px | @29px | @34px |
 * |---|---|---|---|---|
 * | **Roboto 400** | 0,528 | 2,67 | 2,67 | 3,00 |
 * | **Roboto Mono 400** | 0,528 | 2,67 | 2,67 | 3,00 |
 * | Chivo 400 (sebelumnya) | 0,511 | 3,00 | 4,00 | 4,00 |
 * | JetBrains Mono 400 (sebelumnya) | 0,550 | 2,00 | 3,00 | 3,00 |
 *
 * Roboto memang lebih tipis daripada pilihan sebelumnya. Itu bukan regresi:
 * begitu ukuran dibulatkan ke piksel utuh, garis 2,67px tetap jatuh di tiga
 * baris piksel dengan bobot yang rata — tidak lagi "geter".
 *
 * Dua sumber getar dan penawarnya (tetap dipakai, tidak berubah):
 *
 * 1. Ukuran sp yang menghasilkan piksel pecahan — 9,5sp pada densitas 2,75
 *    adalah 26,125px, garis dasar jatuh di setengah piksel. [px] membulatkan.
 * 2. Langkah glyph mono yang pecahan — Roboto Mono berlebar 0,6em, jadi pada
 *    26px langkahnya 15,6px. [tracking] memilih `letterSpacing` yang membuat
 *    langkah itu bulat (16px), bukan mengecil.
 *
 * Skala (sp): 26 judul aplikasi · 21 judul tab/halaman · 18 isian · 16 label
 * kotak centang · 15 tombol · 14 log · 13 catatan · 12 teks bantu · 11 mikro.
 */
internal object Face {
    @Volatile private var monoCache: Typeface? = null
    @Volatile private var monoMediumCache: Typeface? = null
    @Volatile private var proseCache: Typeface? = null
    @Volatile private var proseMediumCache: Typeface? = null

    /** Roboto Mono Regular untuk log, alamat, dan nilai. */
    fun mono(context: Context): Typeface {
        monoCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.roboto_mono)
        } catch (_: Exception) {
            Typeface.MONOSPACE
        }
        monoCache = t
        return t
    }

    /** Roboto Mono Medium untuk label mikro dan angka yang perlu tegas. */
    fun monoMedium(context: Context): Typeface {
        monoMediumCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.roboto_mono_medium)
        } catch (_: Exception) {
            Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
        }
        monoMediumCache = t
        return t
    }

    /** Roboto Regular: teks antarmuka, sama seperti aplikasi acuan. */
    fun prose(context: Context): Typeface {
        proseCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.roboto)
        } catch (_: Exception) {
            Typeface.SANS_SERIF
        }
        proseCache = t
        return t
    }

    /** Roboto Medium untuk judul, nama tab aktif, dan label tombol. */
    fun proseMedium(context: Context): Typeface {
        proseMediumCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.roboto_medium)
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
     * (relatif em) untuk label yang memang perlu airy.
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
 * [tracking] dipakai oleh label yang memang diberi jarak antarhuruf.
 */
internal fun TextView.inkSize(sp: Float, mono: Boolean = false, tracking: Float = 0f) {
    val size = Face.px(context, sp)
    setTextSize(TypedValue.COMPLEX_UNIT_PX, size)
    if (mono) letterSpacing = Face.tracking(Face.advance(typeface, size), size, tracking)
}
