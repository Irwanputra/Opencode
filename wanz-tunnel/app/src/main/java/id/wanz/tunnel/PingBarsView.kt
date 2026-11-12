package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View
import kotlin.math.max

/**
 * Riwayat ping sebagai **bilah horizontal**, satu baris per pengukuran, terbaru
 * di paling bawah.
 *
 * Alasan bentuk: aturan `ui-craft` (Anti-Slop Test, Major) melarang bilah
 * vertikal untuk deret waktu — tinggi bilah memaksa mata membandingkan luas,
 * sedangkan panjang bilah terbaca langsung. Di sini bilahnya membentang penuh
 * sebaris tabel supaya pembandingnya sepanjang mungkin, dengan garis rambut
 * di kanan sebagai tanda batas skala.
 *
 * Tanpa data: baris-baris samar seperti kertas grafik ditambah tulisan
 * "belum ada", bukan ruang kosong yang terbaca sebagai error.
 */
class PingBarsView(context: Context) : View(context) {
    private val density = resources.displayMetrics.density
    private val bar = Paint(Paint.ANTI_ALIAS_FLAG)
    private val line = Paint()
    private val stamp = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        textSize = 9.5f * density
    }

    var values: List<Int> = emptyList()
        set(value) {
            field = value
            invalidate()
        }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val slots = SLOTS
        val rowH = height.toFloat() / slots
        val barH = (rowH * 0.58f).coerceAtMost(3.2f * density)
        val right = width - 1f

        // Batas skala di kanan, dibaca sebagai sumbu, bukan kotak.
        line.color = withAlpha(INK, 40)
        line.strokeWidth = 1f
        canvas.drawLine(right, 0f, right, height.toFloat(), line)

        if (values.isEmpty()) {
            line.color = withAlpha(INK, 10)
            for (i in 0 until slots) {
                val y = i * rowH + rowH / 2f
                canvas.drawLine(0f, y, right, y, line)
            }
            stamp.color = FAINT
            canvas.drawText(
                "belum ada", 0f,
                height / 2f - (stamp.ascent() + stamp.descent()) / 2f, stamp
            )
            return
        }

        val maxV = max(40, values.maxOrNull() ?: 40).toFloat()
        stamp.color = FAINT

        values.forEachIndexed { i, ms ->
            val y = (slots - values.size + i) * rowH
            val top = y + (rowH - barH) / 2f
            val w = (ms / maxV) * right
            val newest = i == values.lastIndex
            bar.color = if (newest) INK else withAlpha(INK, 90)
            canvas.drawRect(0f, top, (w).coerceAtLeast(1.5f * density), top + barH, bar)
        }
    }

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)

    companion object {
        /** Jumlah pengukuran yang ditampilkan; sisanya digabung per slot. */
        const val SLOTS = 12
    }
}
