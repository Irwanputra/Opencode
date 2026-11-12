package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

/** Ikon pengaturan: tiga penggeser, digambar sendiri (tanpa emoji). */
class SlidersView(context: Context) : View(context) {
    private val density = resources.displayMetrics.density
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 1.6f * density
        strokeCap = Paint.Cap.ROUND
        color = INK
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val left = paddingLeft + 2f * density
        val right = width - paddingRight - 2f * density
        val top = paddingTop + 2f * density
        val bottom = height - paddingBottom - 2f * density
        val ks = floatArrayOf(0.66f, 0.34f, 0.72f)
        for (i in 0..2) {
            val y = top + (bottom - top) * (0.22f + i * 0.28f)
            canvas.drawLine(left, y, right, y, paint)
            val kx = left + (right - left) * ks[i]
            paint.style = Paint.Style.FILL
            canvas.drawCircle(kx, y, 2.4f * density, paint)
            paint.style = Paint.Style.STROKE
        }
    }
}

/** Panah garis untuk baris yang bisa dibuka. direction 1 = kanan, -1 = kiri. */
class ArrowView(context: Context) : View(context) {
    var direction: Float = 1f
        set(value) {
            field = value
            invalidate()
        }

    var color: Int = INK
        set(value) {
            field = value
            invalidate()
        }

    private val density = resources.displayMetrics.density
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 1.5f * density
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.color = color
        val cx = width / 2f
        val cy = height / 2f
        val len = 6f * density * direction
        canvas.drawLine(cx - len, cy, cx + len, cy, paint)
        canvas.drawLine(cx + len - 4f * density * direction, cy - 4f * density, cx + len, cy, paint)
        canvas.drawLine(cx + len - 4f * density * direction, cy + 4f * density, cx + len, cy, paint)
    }
}
