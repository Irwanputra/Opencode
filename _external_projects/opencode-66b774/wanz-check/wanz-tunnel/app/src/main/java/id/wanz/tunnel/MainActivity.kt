package id.wanz.tunnel

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Bundle
import android.text.InputType
import android.view.Gravity
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import java.io.File

private val BG = 0xFF101C2E.toInt()
private val CARD = 0xFF182A44.toInt()
private val FIELD = 0xFF213A5C.toInt()
private val MUTED = 0xFF8FA3BF.toInt()
private val AMBER = 0xFFF6B352.toInt()
private val TEAL = 0xFF4FD1C5.toInt()
private val CORAL = 0xFFFF7A6B.toInt()

class MainActivity : Activity() {
    private val prefs by lazy { getSharedPreferences("cfg", MODE_PRIVATE) }
    private val fields = LinkedHashMap<String, EditText>()
    private lateinit var btn: TextView
    private lateinit var info: TextView

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun shape(color: Int, radius: Int, ring: Int = 0, oval: Boolean = false) = GradientDrawable().apply {
        if (oval) setShape(GradientDrawable.OVAL) else cornerRadius = dp(radius).toFloat()
        setColor(color)
        if (ring != 0) setStroke(dp(5), ring)
    }

    private fun lp(top: Int) = LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun field(k: String, hint: String, type: Int = InputType.TYPE_CLASS_TEXT, lines: Int = 1) =
        EditText(this).apply {
            this.hint = hint
            inputType = if (lines > 1) type or InputType.TYPE_TEXT_FLAG_MULTI_LINE else type
            if (lines > 1) { minLines = lines; gravity = Gravity.TOP }
            setTextColor(-1); setHintTextColor(MUTED); textSize = 15f
            background = shape(FIELD, 14)
            setPadding(dp(16), dp(14), dp(16), dp(14))
            setText(prefs.getString(k, ""))
            fields[k] = this
        }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG
        window.navigationBarColor = BG
        if (Build.VERSION.SDK_INT >= 33) requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)

        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), dp(40), dp(20), dp(32))
        }
        col.addView(TextView(this).apply {
            text = "Wanz Tunnel"; textSize = 30f; setTextColor(-1)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        col.addView(TextView(this).apply {
            text = "Tunnel SSH dengan payload dan proxy"; textSize = 14f; setTextColor(MUTED)
        })

        btn = TextView(this).apply {
            gravity = Gravity.CENTER; textSize = 17f; setTextColor(-1)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            setOnClickListener { toggle() }
        }
        col.addView(btn, LinearLayout.LayoutParams(dp(148), dp(148)).apply {
            gravity = Gravity.CENTER_HORIZONTAL; topMargin = dp(36)
        })
        info = TextView(this).apply { gravity = Gravity.CENTER; textSize = 13f; setTextColor(MUTED) }
        col.addView(info, lp(18))

        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = shape(CARD, 24)
            setPadding(dp(16), dp(16), dp(16), dp(16))
        }
        val row = LinearLayout(this)
        row.addView(field("host", "IP atau host server"), LinearLayout.LayoutParams(0, -2, 2f))
        row.addView(field("port", "Port", InputType.TYPE_CLASS_NUMBER), LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) })
        card.addView(row)
        card.addView(field("user", "Username"), lp(10))
        card.addView(field("pass", "Password", InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD), lp(10))
        card.addView(field("proxy", "Proxy IP:port (boleh kosong)"), lp(10))
        card.addView(field("payload", "Payload, mis. CONNECT [host_port] HTTP/1.1[crlf][crlf]", lines = 4), lp(10))
        col.addView(card, lp(28))

        col.addView(TextView(this).apply {
            text = "Reset kunci host"; textSize = 13f; setTextColor(MUTED); gravity = Gravity.CENTER
            setPadding(0, dp(20), 0, dp(8))
            setOnClickListener {
                File(filesDir, "known_hosts").delete()
                Toast.makeText(this@MainActivity, "Kunci host direset", Toast.LENGTH_SHORT).show()
            }
        })

        setContentView(ScrollView(this).apply { setBackgroundColor(BG); isFillViewport = true; addView(col) })
    }

    private fun save() {
        val e = prefs.edit()
        fields.forEach { (k, v) -> e.putString(k, v.text.toString()) }
        e.apply()
    }

    private fun toggle() {
        val svc = Intent(this, TunnelService::class.java)
        if (TunnelService.running) { stopService(svc); return }
        if (fields["host"]!!.text.isBlank()) {
            Toast.makeText(this, "Isi IP server dulu", Toast.LENGTH_SHORT).show(); return
        }
        save()
        startForegroundService(svc)
    }

    private fun render() {
        val s = TunnelService.status
        val c = when {
            s.startsWith("Terhubung") -> TEAL
            s.startsWith("Gagal") -> CORAL
            else -> AMBER
        }
        btn.text = if (TunnelService.running) "Putuskan" else "Hubungkan"
        btn.background = shape(CARD, 0, c, true)
        info.text = s
    }

    override fun onResume() {
        super.onResume()
        TunnelService.onStatus = { runOnUiThread { render() } }
        render()
    }

    override fun onPause() {
        super.onPause()
        TunnelService.onStatus = null
        save()
    }
}
