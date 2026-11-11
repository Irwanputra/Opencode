package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.RectF
import android.graphics.Shader
import android.graphics.SweepGradient
import android.view.View
import kotlin.math.PI
import kotlin.math.min
import kotlin.math.sin

/**
 * Tombol koneksi melingkar dengan glow dan animasi status.
 */
class ConnectButtonView(context: Context) : View(context) {
    enum class State { IDLE, CONNECTING, CONNECTED, ERROR }

    var state: State = State.IDLE
        set(value) {
            if (field == value) return
            field = value
            updateAnimation()
            invalidate()
        }

    private val density = resources.displayMetrics.density
    private fun dp(v: Float) = v * density

    private val ringPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(2.4f)
        strokeCap = Paint.Cap.ROUND
    }
    private val fillPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val glowPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val iconPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(4.2f)
        strokeCap = Paint.Cap.ROUND
    }

    private var phase = 0f
    private var animator: ValueAnimator? = null

    private val accent: Int
        get() = when (state) {
            State.CONNECTED -> 0xFF5EF0B0.toInt()
            State.ERROR -> 0xFFFF7A8A.toInt()
            State.CONNECTING -> 0xFFFFC66D.toInt()
            else -> 0xFF5CE1E6.toInt()
        }

    private val accent2: Int
        get() = when (state) {
            State.ERROR -> 0xFFFF9A6B.toInt()
            else -> 0xFF8B7CFF.toInt()
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val cx = width / 2f
        val cy = height / 2f
        val maxR = min(width, height) / 2f - dp(10f)
        val innerR = maxR - dp(22f)
        val pulse = 0.5f + 0.5f * sin(phase * 2.0 * PI).toFloat()

        if (state == State.CONNECTING || state == State.CONNECTED) {
            glowPaint.color = withAlpha(accent, (18 + 30 * pulse).toInt())
            canvas.drawCircle(cx, cy, maxR, glowPaint)
        }

        ringPaint.shader = SweepGradient(
            cx, cy,
            intArrayOf(withAlpha(accent, 40), accent, accent2, withAlpha(accent, 40)),
            floatArrayOf(0f, 0.35f, 0.72f, 1f)
        )
        ringPaint.strokeWidth = dp(2.4f)
        canvas.save()
        if (state == State.CONNECTING) canvas.rotate(phase * 360f, cx, cy)
        canvas.drawCircle(cx, cy, maxR - dp(7f), ringPaint)
        canvas.restore()

        fillPaint.shader = RadialGradient(
            cx, cy - innerR * 0.35f, innerR * 1.55f,
            intArrayOf(
                withAlpha(accent, 55),
                0xFF15213B.toInt(),
                0xFF090F1E.toInt()
            ),
            floatArrayOf(0f, 0.58f, 1f),
            Shader.TileMode.CLAMP
        )
        canvas.drawCircle(cx, cy, innerR, fillPaint)

        ringPaint.shader = null
        ringPaint.color = withAlpha(accent, 85)
        ringPaint.strokeWidth = dp(1f)
        canvas.drawCircle(cx, cy, innerR, ringPaint)

        val r = innerR * 0.28f
        iconPaint.color = accent
        iconPaint.strokeWidth = dp(4.2f)
        canvas.drawArc(RectF(cx - r, cy - r, cx + r, cy + r), -45f, 270f, false, iconPaint)
        canvas.drawLine(cx, cy - r * 1.28f, cx, cy - r * 0.12f, iconPaint)
    }

    private fun updateAnimation() {
        if (state == State.CONNECTING || state == State.CONNECTED) {
            if (animator == null) {
                animator = ValueAnimator.ofFloat(0f, 1f).apply {
                    duration = 2200L
                    repeatCount = ValueAnimator.INFINITE
                    addUpdateListener {
                        phase = it.animatedValue as Float
                        invalidate()
                    }
                    start()
                }
            }
        } else {
            animator?.cancel()
            animator = null
            phase = 0f
        }
    }

    override fun onDetachedFromWindow() {
        animator?.cancel()
        animator = null
        super.onDetachedFromWindow()
    }

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)
}
