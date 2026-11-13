package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.view.MotionEvent
import android.view.View
import android.view.animation.PathInterpolator

/**
 * Animasi mikro supaya sentuhan terasa hidup, mengikuti "bahasa gerak"
 * Material 3 yang dipakai acuan (HTTP Custom): easing fast_out_slow_in untuk
 * gerakan kecil, emphasized decelerate/accelerate untuk masuk/keluar, dan
 * denyut napas pelan 1500ms untuk keadaan "sedang bekerja" (di acuan ada
 * sebagai animator/icon_scale).
 *
 * Semua gerak menghormati skala animasi sistem lewat Face.reducedMotion:
 * bila pengguna menyetel skala nol, durasi menjadi nol dan denyut tidak
 * dijalankan sama sekali.
 */
internal object Anim {

    /** Easing fast_out_slow_in (PathInterpolator 0.4, 0, 0.2, 1). */
    val fastOutSlowIn = PathInterpolator(0.4f, 0f, 0.2f, 1f)

    /** Easing emphasized decelerate — untuk elemen yang masuk. */
    val emphasizedDecelerate = PathInterpolator(0.1f, 0.7f, 0.1f, 1f)

    /** Easing emphasized accelerate — untuk elemen yang keluar. */
    val emphasizedAccelerate = PathInterpolator(0.3f, 0f, 0.8f, 0.2f)

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
                    .setInterpolator(fastOutSlowIn).start()
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
            .setInterpolator(fastOutSlowIn)
            .start()
    }

    /** Denyut napas per view, dikelola di sini agar pemanggil tidak perlu
     *  menyimpan referensi animator. */
    private val pulses = HashMap<View, ValueAnimator>()

    /**
     * Napas pelan pada keadaan "sedang bekerja": skala naik-turun halus
     * 1500ms bolak-balik (fast_out_slow_in) — pola animator/icon_scale pada
     * acuan, diterapkan pada tombol sambung selagi MENYAMBUNG.
     */
    fun pulse(view: View) {
        if (!on(view.context) || pulses.containsKey(view)) return
        val animator = ValueAnimator.ofFloat(1f, 1.03f).apply {
            duration = 1500L
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
            interpolator = fastOutSlowIn
            addUpdateListener {
                val s = it.animatedValue as Float
                view.scaleX = s
                view.scaleY = s
            }
        }
        pulses[view] = animator
        view.post { if (pulses[view] === animator) animator.start() }
    }

    /** Hentikan denyut dan pulihkan tampilan normal. */
    fun stopPulse(view: View) {
        pulses.remove(view)?.cancel()
        view.scaleX = 1f
        view.scaleY = 1f
    }
}
