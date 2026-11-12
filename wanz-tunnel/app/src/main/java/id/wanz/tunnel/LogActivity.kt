package id.wanz.tunnel

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.res.ColorStateList
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

/**
 * Log penuh, satu sistem dengan beranda: kertas, tinta, garis rambut,
 * monospace untuk data. Tanpa kaca, tanpa gradien.
 */
class LogActivity : Activity() {
    private lateinit var logText: TextView
    private lateinit var logScroll: ScrollView
    private lateinit var autoScroll: Switch
    private lateinit var countText: TextView

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun box(
        fill: Int,
        radius: Int = 2,
        stroke: Int = 0,
        strokeWidth: Int = 1
    ) = GradientDrawable().apply {
        cornerRadius = dp(radius).toFloat()
        setColor(fill)
        if (stroke != 0) setStroke(dp(strokeWidth), stroke)
    }

    private fun rule() = View(this).apply { setBackgroundColor(HAIR) }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG
        window.navigationBarColor = BG
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
            setPadding(dp(24), dp(18), dp(24), dp(18))
        }

        // ------------------------------------------------------------ KOP
        val header = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        header.addView(TextView(this).apply {
            text = "←"
            textSize = 20f
            gravity = Gravity.CENTER
            setTextColor(INK)
            contentDescription = "Kembali"
            setPadding(0, 0, dp(14), 0)
            isClickable = true
            setOnClickListener { finish() }
        }, LinearLayout.LayoutParams(-2, dp(40)))

        val title = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        title.addView(TextView(this).apply {
            text = "Log"
            textSize = 27f
            setTextColor(INK)
            letterSpacing = -0.02f
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        countText = TextView(this).apply {
            text = "0 baris"
            textSize = 10.5f
            setTextColor(MUTED)
        }
        title.addView(countText)
        header.addView(title, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(TextView(this).apply {
            text = "Salin"
            textSize = 12.5f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            setPadding(dp(10), dp(10), 0, dp(10))
            isClickable = true
            setOnClickListener { copyLog() }
        })
        root.addView(header)
        root.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(14) })

        // ---------------------------------------------------------- TOOLBAR
        val toolbar = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        autoScroll = Switch(this).apply {
            text = "Auto-scroll"
            setTextColor(INK)
            textSize = 13f
            isChecked = true
            thumbTintList = ColorStateList(
                arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
                intArrayOf(INK, 0xFF8E928C.toInt())
            )
            trackTintList = ColorStateList(
                arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
                intArrayOf((INK and 0x00FFFFFF) or (110 shl 24), HAIR)
            )
        }
        toolbar.addView(autoScroll, LinearLayout.LayoutParams(0, dp(48), 1f))
        toolbar.addView(TextView(this).apply {
            text = "Bersihkan"
            textSize = 12.5f
            setTextColor(ERR)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            setPadding(dp(10), dp(10), 0, dp(10))
            isClickable = true
            setOnClickListener {
                TunnelLog.clear()
                render()
            }
        })
        root.addView(toolbar, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(6) })

        // -------------------------------------------------------------- LOG
        logText = TextView(this).apply {
            textSize = 10.5f
            setTextColor(INK)
            typeface = Typeface.MONOSPACE
            setLineSpacing(dp(3).toFloat(), 1f)
            setTextIsSelectable(true)
            setPadding(dp(12), dp(12), dp(12), dp(12))
        }
        logScroll = ScrollView(this).apply {
            background = box(PANEL, 2, HAIR, 1)
            isVerticalScrollBarEnabled = true
            addView(logText, ViewGroup.LayoutParams(-1, -2))
        }
        root.addView(
            logScroll,
            LinearLayout.LayoutParams(-1, 0, 1f).apply { topMargin = dp(12) }
        )

        setContentView(root)
        render()
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
