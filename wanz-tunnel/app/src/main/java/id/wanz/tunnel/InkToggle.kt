package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.view.HapticFeedbackConstants
import android.view.View

/**
 * Kotak centang berlabel untuk baris pengaturan, sebentuk dengan kisi centang
 * di beranda: kotak 22dp bersudut 2dp di kanan, garis tinta saat mati, bidang
 * hijau dengan centang gelap saat hidup.
 *
 * Menggantikan `android.widget.Switch`: acuan tidak memakai sakelar geser,
 * dan kotak centang membuat status terbaca tanpa harus menggeser apa pun.
 */
class InkToggle(context: Context) : View(context) {

    var label: String = ""
        set(value) {
            field = value
            contentDescription = value
            invalidate()
        }

    var isChecked: Boolean = false
        set(value) {
            if (field == value) return
            field = value
            contentDescription = "$label, ${if (value) "aktif" else "tidak aktif"}"
            invalidate()
        }

    var onToggle: ((Boolean) -> Unit)? = null

    private val density = resources.displayMetrics.density
    private fun dp(v: Float) = v * density

    private val labelText = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        typeface = Face.prose(context)
        color = INK
        textSize = Face.px(context, 14f)
    }
    private val stroke = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = Face.linePx(context, 1.6f)
        color = INK
    }
    private val fill = Paint(Paint.ANTI_ALIAS_FLAG)
    private val check = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = Face.linePx(context, 2f)
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
    }
    private val boxPath = Path()

    init {
        isClickable = true
        isFocusable = true
        minimumHeight = dp(48f).toInt()
        background = context.ripple()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val w = MeasureSpec.getSize(widthMeasureSpec)
        setMeasuredDimension(w, resolveSize(dp(48f).toInt(), heightMeasureSpec))
    }

    override fun onDraw(canvas: Canvas) {
        val midY = height / 2f
        labelText.color = INK
        val base = midY - (labelText.ascent() + labelText.descent()) / 2f
        canvas.drawText(label, 0f, base, labelText)

        val side = dp(22f)
        val left = width - side
        val top = midY - side / 2f
        val radius = dp(R_CHECK.toFloat())
        boxPath.reset()
        boxPath.addRoundRect(left, top, left + side, top + side, radius, radius, Path.Direction.CW)

        if (isChecked) {
            fill.color = ACCENT
            canvas.drawPath(boxPath, fill)
            check.color = ON_ACCENT
            canvas.drawLine(left + side * 0.24f, top + side * 0.52f,
                left + side * 0.44f, top + side * 0.72f, check)
            canvas.drawLine(left + side * 0.44f, top + side * 0.72f,
                left + side * 0.78f, top + side * 0.30f, check)
        } else {
            stroke.color = INK
            canvas.drawPath(boxPath, stroke)
        }
    }

    override fun performClick(): Boolean {
        super.performClick()
        isChecked = !isChecked
        performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
        onToggle?.invoke(isChecked)
        return true
    }
}
