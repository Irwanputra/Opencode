package id.wanz.tunnel

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import android.widget.ImageView

/** Ikon Material (Apache 2.0) sebagai vektor, diwarnai token aktif. */
internal fun Context.iconView(res: Int, sizeDp: Int = 24, tint: Int = INK): ImageView =
    ImageView(this).apply {
        setImageResource(res)
        setColorFilter(tint)
        scaleType = ImageView.ScaleType.FIT_CENTER
        val s = (sizeDp * resources.displayMetrics.density).toInt()
        layoutParams = android.widget.FrameLayout.LayoutParams(s, s)
    }

/** Tombol ikon 48dp: area sentuh tetap lapang walau gambarnya 24dp. */
internal fun Context.iconButton(
    res: Int,
    desc: String,
    tint: Int = INK,
    sizeDp: Int = 24,
    onClick: () -> Unit
): android.widget.FrameLayout = android.widget.FrameLayout(this).apply {
    isClickable = true
    isFocusable = true
    contentDescription = desc
    setOnClickListener { onClick() }
    addView(iconView(res, sizeDp, tint), android.widget.FrameLayout.LayoutParams(
        (sizeDp * resources.displayMetrics.density).toInt(),
        (sizeDp * resources.displayMetrics.density).toInt(),
        android.view.Gravity.CENTER
    ))
}

/**
 * Kotak centang persegi seperti acuan: 24dp, garis 2dp, sudut 2dp. Saat
 * tercentang bidangnya hijau dan centangnya gelap.
 */
class SquareCheckView(context: Context) : View(context) {
    var checked: Boolean = false
        set(value) {
            if (field == value) return
            field = value
            invalidate()
        }

    /** Dipanggil setelah [checked] berubah karena sentuhan pengguna. */
    var onChecked: ((Boolean) -> Unit)? = null

    private val density = resources.displayMetrics.density
    private val fill = Paint(Paint.ANTI_ALIAS_FLAG)
    private val stroke = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = Face.linePx(context, 1.6f)
    }
    private val check = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = Face.linePx(context, 2f)
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
    }
    private val path = Path()

    init {
        val s = (24 * density).toInt()
        minimumWidth = s
        minimumHeight = s
    }

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        val s = (24 * density).toInt()
        setMeasuredDimension(s, s)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val pad = Face.linePx(context, 1f)
        val r = Face.linePx(context, R_CHECK.toFloat()) / 2f
        val left = pad
        val top = pad
        val right = width - pad
        val bottom = height - pad
        path.reset()
        path.addRoundRect(left, top, right, bottom, r, r, Path.Direction.CW)
        if (checked) {
            fill.color = ACCENT
            canvas.drawPath(path, fill)
            check.color = ON_ACCENT
            val w = right - left
            val h = bottom - top
            canvas.drawLine(left + w * 0.24f, top + h * 0.52f,
                left + w * 0.44f, top + h * 0.72f, check)
            canvas.drawLine(left + w * 0.44f, top + h * 0.72f,
                left + w * 0.78f, top + h * 0.30f, check)
        } else {
            stroke.color = INK
            canvas.drawPath(path, stroke)
        }
    }
}

/**
 * Logo drawer: heksagon putih dengan dua huruf — "W" tinta, "T" hijau —
 * padanan langsung logo "HC" pada acuan.
 */
class HexLogoView(context: Context) : View(context) {
    private val density = resources.displayMetrics.density
    private val outline = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = Face.linePx(context, 5f)
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
    }
    private val text = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        typeface = Face.proseMedium(context)
        textSize = Face.px(context, 34f)
        textAlign = Paint.Align.CENTER
        isFakeBoldText = false
    }
    private val path = Path()

    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        val s = (88 * density).toInt()
        setMeasuredDimension(s, s)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val cx = width / 2f
        val cy = height / 2f
        val rad = minOf(width, height) / 2f - Face.linePx(context, 3f)
        path.reset()
        for (i in 0 until 6) {
            val a = Math.toRadians(-90.0 + i * 60.0)
            val x = cx + rad * Math.cos(a).toFloat()
            val y = cy + rad * Math.sin(a).toFloat()
            if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
        }
        path.close()
        outline.color = INK
        canvas.drawPath(path, outline)

        val baseline = cy - (text.descent() + text.ascent()) / 2f
        text.color = INK
        canvas.drawText("W", cx - text.textSize * 0.26f, baseline, text)
        text.color = ACCENT
        canvas.drawText("T", cx + text.textSize * 0.30f, baseline, text)
    }
}
