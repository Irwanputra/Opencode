package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Typeface
import android.view.View
import android.view.animation.LinearInterpolator

/**
 * Tombol aksi lebar penuh (56dp). Bukan orb, bukan pil.
 *
 * - Diam: bidang tinta penuh, label terang, panah kanan.
 * - Menyambung: bidang netral, garis rambut, garis kemajuan berjalan.
 * - Terhubung: bidang kertas bergaris tinta, kotak hijau kecil, label "Putuskan".
 * - Gagal: bidang kertas bergaris merah.
 */
class ActionBarView(context: Context) : View(context) {
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

    private val density = resources.displayMetrics.density
    private fun dp(v: Float) = v * density

    private val fill = Paint(Paint.ANTI_ALIAS_FLAG)
    private val edge = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(1f)
    }
    private val label = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        textSize = dp(16f)
    }
    private val glyph = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(1.6f)
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
    }
    private val mark = Paint(Paint.ANTI_ALIAS_FLAG)

    private var animator: ValueAnimator? = null
    private var phase = 0f

    private fun textColor(): Int = when {
        state == State.IDLE -> PAPER
        state == State.ERROR -> ERR
        state == State.CONNECTED && warning -> WARN
        else -> INK
    }

    private fun caption(): String = when (state) {
        State.IDLE -> "Hubungkan tunnel"
        State.CONNECTING -> "Menyambungkan"
        State.CONNECTED -> "Putuskan"
        State.ERROR -> "Coba lagi"
    }

    override fun onDraw(canvas: Canvas) {
        val w = width.toFloat()
        val h = height.toFloat()
        val r = dp(2f)

        when (state) {
            State.IDLE -> {
                fill.color = INK
                canvas.drawRoundRect(0f, 0f, w, h, r, r, fill)
            }
            State.CONNECTING -> {
                fill.color = PANEL
                canvas.drawRoundRect(0f, 0f, w, h, r, r, fill)
                edge.color = HAIR
                canvas.drawRoundRect(0.5f, 0.5f, w - 0.5f, h - 0.5f, r, r, edge)
            }
            State.CONNECTED -> {
                fill.color = BG
                canvas.drawRoundRect(0f, 0f, w, h, r, r, fill)
                edge.color = if (warning) WARN else INK
                edge.strokeWidth = dp(1.4f)
                canvas.drawRoundRect(
                    dp(0.7f), dp(0.7f), w - dp(0.7f), h - dp(0.7f), r, r, edge
                )
                edge.strokeWidth = dp(1f)
            }
            State.ERROR -> {
                fill.color = BG
                canvas.drawRoundRect(0f, 0f, w, h, r, r, fill)
                edge.color = ERR
                edge.strokeWidth = dp(1.4f)
                canvas.drawRoundRect(
                    dp(0.7f), dp(0.7f), w - dp(0.7f), h - dp(0.7f), r, r, edge
                )
                edge.strokeWidth = dp(1f)
            }
        }

        if (isPressed) {
            fill.color = withAlpha(0xFF000000.toInt(), if (state == State.IDLE) 44 else 18)
            canvas.drawRoundRect(0f, 0f, w, h, r, r, fill)
        }

        val fg = textColor()
        var x = dp(20f)
        if (state == State.CONNECTED) {
            mark.color = if (warning) WARN else OK
            canvas.drawRect(x, h / 2f - dp(4f), x + dp(8f), h / 2f + dp(4f), mark)
            x += dp(18f)
        }

        label.color = fg
        val baseline = h / 2f - (label.ascent() + label.descent()) / 2f
        canvas.drawText(caption(), x, baseline, label)

        // Panah kanan, digambar — bukan emoji.
        val ax = w - dp(24f)
        val ay = h / 2f
        glyph.color = fg
        canvas.drawLine(ax - dp(6f), ay, ax, ay, glyph)
        canvas.drawLine(ax - dp(4f), ay - dp(4f), ax, ay, glyph)
        canvas.drawLine(ax - dp(4f), ay + dp(4f), ax, ay, glyph)

        if (state == State.CONNECTING) {
            val trackY = h - dp(3f)
            fill.color = withAlpha(WARN, 38)
            canvas.drawRect(0f, trackY, w, h, fill)
            fill.color = WARN
            val seg = w * 0.3f
            val sx = -seg + phase * (w + seg)
            canvas.drawRect(sx, trackY, sx + seg, h, fill)
        }
    }

    private fun sync() {
        if (state == State.CONNECTING) {
            if (animator != null) return
            animator = ValueAnimator.ofFloat(0f, 1f).apply {
                duration = 1200L
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
