package id.wanz.tunnel

import android.app.AlertDialog
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.view.HapticFeedbackConstants
import android.view.View

/**
 * Pemilih opsi "Konsol" — menggantikan `android.widget.Spinner`.
 *
 * Spinner bawaan masih terasa komponen default sistem (rubrik
 * `anti-ai-slop-ui`, *component defaultness*). Ini bidang bergaris bawah
 * saja, sama seperti kolom isian: tanpa kotak, tanpa isi abu-abu. Nilai
 * memakai IBM Plex Mono, panah digambar dengan garis, dan daftar pilihan
 * memakai dialog sistem supaya perilakunya tetap milik platform.
 */
class InkSelect(context: Context) : View(context) {

    var options: List<String> = emptyList()
        set(value) {
            field = value
            if (selectedIndex >= value.size) selectedIndex = 0
            announce()
            invalidate()
        }

    var selectedIndex: Int = 0
        set(value) {
            field = value.coerceIn(0, (options.size - 1).coerceAtLeast(0))
            announce()
            invalidate()
        }

    var onSelect: ((Int) -> Unit)? = null

    /**
     * Nama kolom, mis. "Transport". Nilai yang digambar di kanvas tidak bisa
     * dibaca TalkBack, jadi nama kolom dan nilai digabung ke [contentDescription]
     * dan nama kolom jadi judul dialog.
     */
    var caption: String = ""
        set(value) {
            field = value
            announce()
        }

    private val density = resources.displayMetrics.density
    private fun dp(v: Float) = v * density

    private val value = Paint(Paint.ANTI_ALIAS_FLAG)
    private val edge = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(1f)
    }
    private val arrow = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = dp(1.4f)
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
    }

    init {
        isClickable = true
        minimumHeight = dp(48f).toInt()
    }

    override fun onDraw(canvas: Canvas) {
        val w = width.toFloat()
        val h = height.toFloat()

        // Hanya garis bawah, sama seperti kolom isian: semua bidang satu
        // bahasa, bukan kotak-kotak komponen siap pakai.
        edge.color = if (isPressed) INK else HAIR
        edge.strokeWidth = if (isPressed) dp(1.6f) else dp(1f)
        canvas.drawLine(0f, h - 0.5f, w, h - 0.5f, edge)

        value.typeface = Face.mono(context)
        value.textSize = dp(14f)
        value.color = INK
        val text = options.getOrElse(selectedIndex) { "—" }
        val base = (h - dp(6f)) / 2f - (value.ascent() + value.descent()) / 2f
        canvas.drawText(text, 0f, base, value)

        val ax = w - dp(14f)
        val ay = h / 2f
        arrow.color = INK
        canvas.drawLine(ax - dp(4f), ay - dp(3f), ax, ay + dp(1f), arrow)
        canvas.drawLine(ax, ay + dp(1f), ax + dp(4f), ay - dp(3f), arrow)
    }

    /** Bicara versi dari nilai yang digambar: "Transport, SSH langsung". */
    private fun announce() {
        val value = options.getOrElse(selectedIndex) { "" }
        contentDescription = if (caption.isBlank()) value else "$caption, $value"
    }

    override fun performClick(): Boolean {
        super.performClick()
        if (options.isEmpty()) return true
        performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
        // Tema dialog dipilih dari palet yang aktif, bukan dari pengaturan HP:
        // saat pengguna memilih Gelap manual di HP terang, dialog tetap gelap.
        val dlgTheme = if (darkActive)
            android.R.style.Theme_DeviceDefault_Dialog_Alert
        else
            android.R.style.Theme_DeviceDefault_Light_Dialog_Alert
        val builder = AlertDialog.Builder(context, dlgTheme)
        if (caption.isNotBlank()) builder.setTitle(caption)
        builder.setItems(options.toTypedArray()) { _, which ->
                if (which != selectedIndex) {
                    selectedIndex = which
                    onSelect?.invoke(which)
                }
            }
            .show()
        return true
    }
}
