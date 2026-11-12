package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import kotlin.math.max

/**
 * Riwayat ping sebagai deretan bilah tipis — alat ukur, bukan grafik dekoratif.
 * Bilah terbaru di kanan dan digambar penuh; sisanya diredupkan.
 */
class PingBarsView(context: Context) : View(context) {
    private val density = resources.displayMetrics.density
    private val bar = Paint(Paint.ANTI_ALIAS_FLAG)
    private val base = Paint(Paint.ANTI_ALIAS_FLAG).apply { color = HAIR }

    var values: List<Int> = emptyList()
        set(value) {
            field = value
            invalidate()
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val bottom = height.toFloat() - density
        val slots = 24
        val gap = 3f * density
        val slotW = (width - gap * (slots - 1)) / slots
        if (slotW <= 0f) return

        if (values.isEmpty()) {
            // Strip kosong: 24 takik samar, bukan garis yang terbaca sebagai pemisah.
            bar.color = withAlpha(INK, 34)
            for (i in 0 until slots) {
                val x = i * (slotW + gap)
                canvas.drawRect(x, bottom - 2f * density, x + slotW, bottom, bar)
            }
            return
        }

        canvas.drawRect(0f, bottom, width.toFloat(), bottom + density, base)
        val maxV = max(40, values.maxOrNull() ?: 40).toFloat()
        val start = slots - values.size

        values.forEachIndexed { i, ms ->
            val h = (ms.coerceAtLeast(0) / maxV) * (height - 5f * density)
            val x = (start + i) * (slotW + gap)
            bar.color = if (i == values.lastIndex) INK else withAlpha(INK, 60)
            canvas.drawRect(
                x,
                bottom - h.coerceAtLeast(2f * density),
                x + slotW,
                bottom,
                bar
            )
        }
    }

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)
}
