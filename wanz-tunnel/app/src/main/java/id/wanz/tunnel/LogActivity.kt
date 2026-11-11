package id.wanz.tunnel

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

/**
 * Layar log penuh, gaya HTTP Custom: monospace, berwarna per level,
 * auto-scroll, serta tombol Salin / Bersihkan / Tutup.
 */
class LogActivity : Activity() {
    private lateinit var logText: TextView
    private lateinit var logScroll: ScrollView
    private lateinit var autoScroll: Switch
    private lateinit var countText: TextView

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun rounded(color: Int, radius: Int, ring: Int = 0) = GradientDrawable().apply {
        cornerRadius = dp(radius).toFloat()
        setColor(color)
        if (ring != 0) setStroke(dp(1), ring)
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG_TOP
        window.navigationBarColor = BG_BOTTOM

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(18), dp(16), dp(16))
            background = GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                intArrayOf(BG_TOP, BG_BOTTOM)
            )
        }

        val header = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        val title = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        title.addView(TextView(this).apply {
            text = "LOG"
            textSize = 20f
            setTextColor(TEXT)
            letterSpacing = 0.16f
            typeface = Typeface.create("sans-serif-black", Typeface.NORMAL)
        })
        countText = TextView(this).apply {
            text = "0 baris"
            textSize = 10.5f
            setTextColor(MUTED)
            letterSpacing = 0.08f
        }
        title.addView(countText)
        header.addView(title, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(action("Salin") { copyLog() })
        header.addView(action("Bersihkan") {
            TunnelLog.clear()
            render()
        })
        header.addView(action("Tutup") { finish() })
        root.addView(header)

        autoScroll = Switch(this).apply {
            text = "Auto-scroll"
            setTextColor(MUTED)
            textSize = 12f
            isChecked = true
        }
        root.addView(autoScroll, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(8) })

        logText = TextView(this).apply {
            textSize = 10.5f
            setTextColor(0xFFD7E2F5.toInt())
            typeface = Typeface.MONOSPACE
            setLineSpacing(dp(3).toFloat(), 1f)
            setTextIsSelectable(true)
        }
        logScroll = ScrollView(this).apply {
            background = rounded(FIELD, 16, BORDER)
            isVerticalScrollBarEnabled = true
            setPadding(dp(12), dp(12), dp(12), dp(12))
            addView(logText, ViewGroup.LayoutParams(-1, -2))
        }
        root.addView(logScroll, LinearLayout.LayoutParams(-1, 0, 1f).apply { topMargin = dp(10) })

        setContentView(root)
        render()
    }

    private fun action(label: String, onClick: () -> Unit) = TextView(this).apply {
        text = label
        textSize = 12f
        setTextColor(CYAN)
        gravity = Gravity.CENTER
        setPadding(dp(10), dp(8), dp(10), dp(8))
        setOnClickListener { onClick() }
    }

    private fun copyLog() {
        val txt = TunnelLog.snapshot().joinToString("\n")
        val cm = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        cm.setPrimaryClip(ClipData.newPlainText("WanzTunnel", txt))
        Toast.makeText(this, "Log disalin", Toast.LENGTH_SHORT).show()
    }

    private fun render() {
        val entries = TunnelLog.all()
        countText.text = "${entries.size} baris"
        logText.text = if (entries.isEmpty()) {
            "Belum ada log."
        } else {
            renderLogSpanned(entries)
        }
        if (autoScroll.isChecked) {
            logScroll.post { logScroll.fullScroll(ScrollView.FOCUS_DOWN) }
        }
    }

    override fun onResume() {
        super.onResume()
        TunnelLog.onChange = { runOnUiThread { render() } }
        render()
    }

    override fun onPause() {
        super.onPause()
        TunnelLog.onChange = null
    }
}
