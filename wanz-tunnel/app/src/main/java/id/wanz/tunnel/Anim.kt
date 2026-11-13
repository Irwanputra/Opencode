package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.DecelerateInterpolator

/**
 * Animasi mikro supaya sentuhan terasa hidup: tombol mengecil saat ditekan,
 * konten naik memudar masuk, baris log meluncur, dan tombol utama berdenyut
 * selagi menyambung.
 *
 * Semua gerak menghormati skala animasi sistem lewat Face.reducedMotion:
 * bila pengguna menyetel skala nol, durasi menjadi nol dan denyut tidak
 * dijalankan sama sekali.
 */
internal object Anim {

    /** Benar bila animasi layak dijalankan. */
    fun on(context: Context): Boolean = !Face.reducedMotion(context)

    /** Durasi aman: 0 bila gerak dikurangi, selain itu [ms]. */
    fun dur(context: Context, ms: Long): Long = if (on(context)) ms else 0L

    /**
     * Tombol mengecil sedikit saat ditekan dan pulih saat dilepas. Listener
     * mengembalikan false agar klik dan ripple bawaan tetap bekerja normal.
     */
    fun pressScale(view: View) {
        val ms = dur(view.context, 110L)
        view.setOnTouchListener { v, e ->
            when (e.actionMasked) {
                MotionEvent.ACTION_DOWN -> v.animate()
                    .scaleX(0.97f).scaleY(0.97f).setDuration(ms).start()
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> v.animate()
                    .scaleX(1f).scaleY(1f).setDuration(ms)
                    .setInterpolator(DecelerateInterpolator()).start()
            }
            false
        }
    }

    /** Muncul dari bawah: naik sambil memudar masuk, sekali dan pelan. */
    fun riseIn(view: View, delayMs: Long, durationMs: Long = 260L) {
        if (!on(view.context)) return
        view.animate().cancel()
        view.alpha = 0f
        view.translationY = (view.resources.displayMetrics.density * 14).toFloat()
        view.animate()
            .alpha(1f)
            .translationY(0f)
            .setStartDelay(delayMs)
            .setDuration(dur(view.context, durationMs))
            .setInterpolator(DecelerateInterpolator())
            .start()
    }

    /** Denyut "sedang bekerja" per view, dikelola di sini agar pemanggil
     *  tidak perlu menyimpan referensi animator. */
    private val pulses = HashMap<View, ValueAnimator>()

    /** Mulai denyut lembut (opasitas turun-naik) menandakan proses berjalan. */
    fun pulse(view: View) {
        if (!on(view.context) || pulses.containsKey(view)) return
        val animator = ValueAnimator.ofFloat(1f, 0.65f).apply {
            duration = 850L
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
            interpolator = AccelerateDecelerateInterpolator()
            addUpdateListener { view.alpha = it.animatedValue as Float }
        }
        pulses[view] = animator
        view.post { if (pulses[view] === animator) animator.start() }
    }

    /** Hentikan denyut dan pulihkan tampilan normal. */
    fun stopPulse(view: View) {
        pulses.remove(view)?.cancel()
        view.alpha = 1f
    }
}
