package id.wanz.tunnel

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import android.view.animation.DecelerateInterpolator
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
    background = ripple(circular = true)
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
    private var checkedState = false
    private var progress = 0f
    private var animator: ValueAnimator? = null

    var checked: Boolean
        get() = checkedState
        set(value) = setChecked(value, animate = true)

    /**
     * Pasang status tanpa animasi, dipakai saat layar pertama kali mengisi
     * centang dari profil tersimpan supaya tidak ada delapan kotak berkedip.
     */
    fun snapTo(value: Boolean) {
        checkedState = value
        animator?.cancel()
        animator = null
        progress = if (value) 1f else 0f
        invalidate()
    }

    fun setChecked(value: Boolean, animate: Boolean) {
        if (checkedState == value) return
        checkedState = value
        animator?.cancel()
        animator = null
        if (!animate || !isAttachedToWindow || Face.reducedMotion(context)) {
            progress = if (value) 1f else 0f
            invalidate()
            return
        }
        // Kotak sedikit menyusut lalu pulih bersama centangnya — sentuhan
        // terasa hidup tanpa memantul berlebihan.
        scaleX = 0.86f
        scaleY = 0.86f
        animate().scaleX(1f).scaleY(1f).setDuration(190L)
            .setInterpolator(DecelerateInterpolator()).start()
        animator = ValueAnimator.ofFloat(progress, if (value) 1f else 0f).apply {
            duration = 140L
            interpolator = DecelerateInterpolator()
            addUpdateListener {
                progress = it.animatedValue as Float
                invalidate()
            }
            start()
        }
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
        // Dua keadaan disilangkan memakai satu nilai 0..1, jadi centang tidak
        // berkedip: garis kotak memudar saat bidang hijau muncul.
        stroke.color = INK
        stroke.alpha = ((1f - progress) * 255f).toInt().coerceIn(0, 255)
        if (stroke.alpha > 0) canvas.drawPath(path, stroke)

        if (progress > 0f) {
            fill.color = ACCENT
            fill.alpha = (progress * 255f).toInt().coerceIn(0, 255)
            canvas.drawPath(path, fill)
            check.color = ON_ACCENT
            check.alpha = (progress * 255f).toInt().coerceIn(0, 255)
            val w = right - left
            val h = bottom - top
            canvas.drawLine(left + w * 0.24f, top + h * 0.52f,
                left + w * 0.44f, top + h * 0.72f, check)
            canvas.drawLine(left + w * 0.44f, top + h * 0.72f,
                left + w * 0.78f, top + h * 0.30f, check)
        }
    }
}
