package id.wanz.tunnel

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable

/**
 * Garis bawah bidang isian "Konsol".
 *
 * Digambar dari bounds, bukan `ColorDrawable` yang di-inset. Perbedaannya
 * penting: `LayerDrawable.setLayerInset()` memutuskan tebal garis waktu
 * drawable dibangun, padahal tinggi field baru diketahui nanti. Pada field
 * satu baris (48dp) celah 47dp itu kebetulan jadi garis 1dp; pada field
 * multi-baris (Payload, Impor config) "garis" tersebut melebar jadi blok
 * setinggi seluruh field dan field yang sedang fokus tampak seperti kotak
 * kertas di layar gelap.
 *
 * Tebalnya ikut peran, bukan satu angka untuk semua: setipis garis rambut saat
 * biasa, dua kali itu saat fokus, supaya perpindahan fokus kelihatan tanpa
 * perlu warna tambahan.
 */
internal class FieldUnderline(
    color: Int,
    private val thickness: Float,
) : Drawable() {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        this.color = color
        strokeWidth = thickness
    }

    /** Ganti warna tanpa membuat drawable baru (palet bisa berganti). */
    fun setColor(color: Int) {
        paint.color = color
        invalidateSelf()
    }

    override fun draw(canvas: Canvas) {
        val b = bounds
        val y = b.bottom.toFloat() - thickness / 2f
        canvas.drawLine(b.left.toFloat(), y, b.right.toFloat(), y, paint)
    }

    override fun setAlpha(alpha: Int) {
        paint.alpha = alpha
        invalidateSelf()
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        paint.colorFilter = colorFilter
        invalidateSelf()
    }

    @Deprecated("Deprecated in Java")
    override fun getOpacity(): Int = PixelFormat.TRANSLUCENT
}
