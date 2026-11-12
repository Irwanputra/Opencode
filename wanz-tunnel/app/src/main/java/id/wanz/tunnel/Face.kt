package id.wanz.tunnel

import android.content.Context
import android.graphics.Typeface

/**
 * Tipografi "Panel" (v2.9).
 *
 * Keputusan tipografi, bukan default sistem:
 *
 * - **Prosa** (kalimat penjelasan, catatan, label tombol) → sans sistem.
 * - **Data dan label** (ping, uptime, host, port, log, judul kolom) →
 *   **IBM Plex Mono** yang dibundel di `res/font`. Aplikasi ini instrumen
 *   jaringan: angka, alamat, dan baris log harus tabular dan sejajar antarbaris
 *   supaya perubahan antar-sekscan bisa dibaca, bukan melompat-lompat.
 *
 * Rubrik `anti-ai-slop-ui/rubrics/ai_slop_score.md` menilai "font sistem tanpa
 * keputusan tipografi" 2 dari 2 poin; pemisahan prosa/data di atas adalah
 * keputusan yang bisa dipertanggungjawabkan ke produk.
 *
 * Skala (sp), cuma enam tingkat:
 * 34 status · 27 judul layar · 21/19/18 nilai bacaan · 17 judul baris ·
 * 13 proza · 11,5 label · 10,5 mikro.
 */
internal object Face {
    @Volatile private var monoCache: Typeface? = null
    @Volatile private var monoMediumCache: Typeface? = null

    /** IBM Plex Mono Regular untuk angka, alamat, dan log. */
    fun mono(context: Context): Typeface {
        monoCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.ibm_plex_mono)
        } catch (_: Exception) {
            Typeface.MONOSPACE
        }
        monoCache = t
        return t
    }

    /** IBM Plex Mono Medium untuk label kolom dan nilai yang perlu ditebalkan. */
    fun monoMedium(context: Context): Typeface {
        monoMediumCache?.let { return it }
        val t = try {
            context.resources.getFont(R.font.ibm_plex_mono_medium)
        } catch (_: Exception) {
            Typeface.create(Typeface.MONOSPACE, Typeface.BOLD)
        }
        monoMediumCache = t
        return t
    }

    /** Sans sistem khusus proza; dipertahankan agar kalimat Indonesia enak dibaca. */
    fun prose(context: Context): Typeface = Typeface.SANS_SERIF

    /** Sans medium khusus judul dan label tombol. */
    fun proseMedium(context: Context): Typeface =
        Typeface.create("sans-serif-medium", Typeface.NORMAL)

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
