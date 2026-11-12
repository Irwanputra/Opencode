package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import android.view.animation.LinearInterpolator

/**
 * Rel status 4dp di tepi atas layar — satu-satunya ornamen.
 *
 * Diam = tidak ada tunnel. Garis penuh hijau = terhubung. Garis penuh merah =
 * gagal. Saat menyambung, satu segmen berjalan dari kiri ke kanan seperti
 * indikator perangkat. Tidak ada glow, tidak ada gradien.
 */
class StatusRailView(context: Context) : View(context) {
    enum class State { IDLE, CONNECTING, CONNECTED, ERROR }

    var state: State = State.IDLE
        set(value) {
            if (field == value) return
            field = value
            sync()
            invalidate()
        }

    var warning: Boolean = false
        set(value) {
            if (field == value) return
            field = value
            invalidate()
        }

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var animator: ValueAnimator? = null
    private var phase = 0f

    override fun onDraw(canvas: Canvas) {
        val h = height.toFloat()
        paint.color = HAIR
        canvas.drawRect(0f, 0f, width.toFloat(), h, paint)

        val active = when {
            state == State.CONNECTED && warning -> WARN
            state == State.CONNECTED -> OK
            state == State.ERROR -> ERR
            state == State.CONNECTING -> WARN
            else -> null
        } ?: return

        if (state == State.CONNECTING) {
            paint.color = withAlpha(active, 46)
            canvas.drawRect(0f, 0f, width.toFloat(), h, paint)
            paint.color = active
            val seg = width * 0.26f
            val x = -seg + phase * (width + seg)
            canvas.drawRect(x, 0f, x + seg, h, paint)
            return
        }

        paint.color = active
        canvas.drawRect(0f, 0f, width.toFloat(), h, paint)
    }

    private fun sync() {
        if (state == State.CONNECTING) {
            // Pengguna bisa mematikan animasi sistem; saat itu tampilkan segmen
            // diam di tengah, bukan memutar animasi dekoratif.
            if (Face.reducedMotion(context)) {
                animator?.cancel()
                animator = null
                phase = 0.37f
                return
            }
            if (animator != null) return
            animator = ValueAnimator.ofFloat(0f, 1f).apply {
                duration = 1350L
                repeatCount = ValueAnimator.INFINITE
                interpolator = LinearInterpolator()
                addUpdateListener {
                    phase = it.animatedValue as Float
                    invalidate()
                }
                start()
            }
        } else {
            animator?.cancel()
            animator = null
            phase = 0f
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        sync()
    }

    override fun onDetachedFromWindow() {
        animator?.cancel()
        animator = null
        super.onDetachedFromWindow()
    }

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)
}
