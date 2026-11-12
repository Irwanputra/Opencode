package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.HapticFeedbackConstants
import android.view.View

/**
 * Sakelar "Panel" — menggantikan `android.widget.Switch` yang masih terasa
 * komponen default sistem (rubrik `anti-ai-slop-ui`: *component defaultness*).
 *
 * Bentuknya sesuai bahasa visual aplikasi: trek 38×18dp bersudut 2dp dengan
 * garis rambut, kotak geser 14dp. Hitam = aktif, garis rambut = tidak. Tidak
 * ada warna aksen, tidak ada animasi pegas.
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
        typeface = Face.proseMedium(context)
        color = INK
        textSize = Face.px(context, 13.5f)
    }
    private val shape = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(1f)
        color = HAIR
    }
    private val fill = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        isClickable = true
        minimumHeight = dp(48f).toInt()
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

        val trackW = dp(38f)
        val trackH = dp(18f)
        val left = width - trackW
        val top = midY - trackH / 2f
        val r = dp(R_PANEL.toFloat())

        if (isChecked) {
            fill.color = INK
            canvas.drawRoundRect(left, top, left + trackW, top + trackH, r, r, fill)
        } else {
            fill.color = FIELD
            canvas.drawRoundRect(left, top, left + trackW, top + trackH, r, r, fill)
            shape.color = HAIR
            canvas.drawRoundRect(left + 0.5f, top + 0.5f, left + trackW - 0.5f, top + trackH - 0.5f, r, r, shape)
        }

        val knob = dp(14f)
        val kx = if (isChecked) left + trackW - knob - dp(2f) else left + dp(2f)
        val ky = top + (trackH - knob) / 2f
        fill.color = if (isChecked) ON_INK else FAINT
        canvas.drawRoundRect(kx, ky, kx + knob, ky + knob, dp(1f), dp(1f), fill)
    }

    override fun performClick(): Boolean {
        super.performClick()
        isChecked = !isChecked
        performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
        onToggle?.invoke(isChecked)
        return true
    }
}
