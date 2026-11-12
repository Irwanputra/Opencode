package id.wanz.tunnel

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.RippleDrawable

/**
 * Umpan balik sentuh.
 *
 * Sebelum v2.9.3 semua baris dan tombol hanya bereaksi setelah aksi selesai
 * (mis. layar berganti), sehingga terasa kaku. Ripple kecil di bawah jari
 * membuat sentuhan langsung terasa, tanpa menambah warna kedua: kilaunya
 * hanya tinta transparan di atas permukaan yang sudah ada.
 */
internal fun pressWash(): Int = if (darkActive) 0x2EFFFFFF else 0x22000000

/**
 * Membungkus latar [content] dengan ripple.
 *
 * [circular] dipakai tombol ikon 48dp supaya kilau tidak memenuhi kotak.
 * Bila [content] null, ripple mengikuti batas view (baris, sel centang, tab).
 */
internal fun Context.ripple(
    content: Drawable? = null,
    circular: Boolean = false
): RippleDrawable {
    val mask = if (circular) {
        GradientDrawable().apply {
            shape = GradientDrawable.OVAL
            setColor(0xFFFFFFFF.toInt())
        }
    } else {
        null
    }
    return RippleDrawable(ColorStateList.valueOf(pressWash()), content, mask)
}
