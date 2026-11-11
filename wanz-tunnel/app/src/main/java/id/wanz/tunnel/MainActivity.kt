package id.wanz.tunnel

import android.app.Activity
import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.net.VpnService
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast

/**
 * Halaman utama yang bersih: tombol koneksi, ringkasan profil aktif, dan
 * panel log langsung. Semua konfigurasi dipindah ke [SettingsActivity].
 */
class MainActivity : Activity() {
    private lateinit var root: LinearLayout
    private lateinit var connectBtn: ConnectButtonView
    private lateinit var connectHint: TextView
    private lateinit var pingLine: TextView
    private lateinit var statusPill: LinearLayout
    private lateinit var statusDot: View
    private lateinit var statusText: TextView
    private lateinit var summaryName: TextView
    private lateinit var summaryDetail: TextView
    private lateinit var summaryMode: TextView
    private lateinit var logText: TextView
    private lateinit var logScroll: ScrollView

    private lateinit var store: ProfileStore
    private var profile: Profile? = null
    private var pendingProfileId = -1L
    private var logDirty = false

    private val logRenderer = Runnable {
        logDirty = false
        renderLog()
    }

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)

    private fun rounded(
        color: Int,
        radius: Int,
        ring: Int = 0,
        stroke: Int = 1,
        oval: Boolean = false
    ) = GradientDrawable().apply {
        if (oval) shape = GradientDrawable.OVAL else cornerRadius = dp(radius).toFloat()
        setColor(color)
        if (ring != 0) setStroke(dp(stroke), ring)
    }

    private fun lp(top: Int) =
        LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun horizontal(gravity: Int = Gravity.CENTER_VERTICAL) =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            this.gravity = gravity
        }

    private fun card() = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        background = GradientDrawable(
            GradientDrawable.Orientation.TL_BR,
            intArrayOf(CARD_TOP, CARD_BOTTOM)
        ).apply {
            cornerRadius = dp(26).toFloat()
            setStroke(dp(1), BORDER)
        }
        setPadding(dp(18), dp(17), dp(18), dp(18))
        elevation = dp(2).toFloat()
    }

    private fun caption(text: String) = TextView(this).apply {
        this.text = text
        textSize = 10.5f
        letterSpacing = 0.14f
        setTextColor(MUTED)
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }

    private fun sectionLabel(text: String) = TextView(this).apply {
        this.text = text
        textSize = 11f
        letterSpacing = 0.16f
        setTextColor(withAlpha(CYAN, 225))
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG_TOP
        window.navigationBarColor = BG_BOTTOM
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        if (Build.VERSION.SDK_INT >= 33) {
            requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)
        }

        store = ProfileStore(this)
        buildUi()

        setContentView(ScrollView(this).apply {
            background = GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                intArrayOf(BG_TOP, BG_BOTTOM)
            )
            isFillViewport = true
            clipToPadding = false
            isVerticalScrollBarEnabled = false
            addView(root, ViewGroup.LayoutParams(-1, -2))
        })

        reloadProfile()
        render()
        renderLog()
    }

    private fun buildUi() {
        root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), dp(22), dp(20), dp(40))
        }

        val header = horizontal()
        val brand = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        brand.addView(TextView(this).apply {
            text = "WANZ"
            textSize = 27f
            setTextColor(TEXT)
            letterSpacing = 0.04f
            typeface = Typeface.create("sans-serif-black", Typeface.NORMAL)
        })
        brand.addView(TextView(this).apply {
            text = "TUNNEL"
            textSize = 11f
            setTextColor(CYAN)
            letterSpacing = 0.42f
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        header.addView(brand, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(TextView(this).apply {
            text = "⚙"
            textSize = 20f
            gravity = Gravity.CENTER
            setTextColor(CYAN)
            contentDescription = "Buka pengaturan"
            setPadding(dp(10), dp(6), dp(10), dp(6))
            background = rounded(withAlpha(CYAN, 18), 99, withAlpha(CYAN, 60))
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }, LinearLayout.LayoutParams(dp(46), dp(46)))
        root.addView(header)

        root.addView(TextView(this).apply {
            text = "Koneksi SSH yang tenang, aman, dan cepat."
            textSize = 13f
            setTextColor(MUTED)
        }, lp(6))

        val hero = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(dp(18), dp(22), dp(18), dp(20))
            background = GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                intArrayOf(0xFF172645.toInt(), 0xFF0C1529.toInt())
            ).apply {
                cornerRadius = dp(30).toFloat()
                setStroke(dp(1), withAlpha(CYAN, 50))
            }
            elevation = dp(4).toFloat()
        }
        connectBtn = ConnectButtonView(this).apply {
            contentDescription = "Hubungkan atau putuskan tunnel"
            setOnClickListener { toggle() }
        }
        hero.addView(connectBtn, LinearLayout.LayoutParams(dp(196), dp(196)))

        statusPill = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
            setPadding(dp(14), dp(8), dp(14), dp(8))
        }
        statusDot = View(this)
        statusPill.addView(
            statusDot,
            LinearLayout.LayoutParams(dp(8), dp(8)).apply { rightMargin = dp(8) }
        )
        statusText = TextView(this).apply {
            text = "Terputus"
            textSize = 13f
            setTextColor(MUTED)
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        statusPill.addView(statusText)
        hero.addView(statusPill, LinearLayout.LayoutParams(-2, -2).apply { topMargin = dp(12) })

        connectHint = TextView(this).apply {
            text = "Ketuk untuk menghubungkan"
            textSize = 12f
            setTextColor(MUTED)
            gravity = Gravity.CENTER
        }
        hero.addView(connectHint, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(8) })

        pingLine = TextView(this).apply {
            text = "Ping: —"
            textSize = 11.5f
            setTextColor(withAlpha(MUTED, 220))
            gravity = Gravity.CENTER
            setPadding(dp(10), dp(5), dp(10), dp(5))
            background = rounded(withAlpha(TEAL, 12), 99, withAlpha(TEAL, 40))
            setOnClickListener {
                if (TunnelService.running) {
                    startService(
                        Intent(this@MainActivity, TunnelService::class.java)
                            .setAction(TunnelService.ACTION_PING)
                    )
                } else {
                    Toast.makeText(this@MainActivity, "Hubungkan dulu untuk ping", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        hero.addView(
            pingLine,
            LinearLayout.LayoutParams(-2, -2).apply {
                topMargin = dp(8)
                gravity = Gravity.CENTER_HORIZONTAL
            }
        )
        root.addView(hero, lp(18))

        val summaryCard = card()
        val summaryHeader = horizontal()
        summaryHeader.addView(
            sectionLabel("PROFIL AKTIF"),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        summaryMode = TextView(this).apply {
            text = "SOCKS5"
            textSize = 10.5f
            letterSpacing = 0.06f
            setTextColor(withAlpha(CYAN, 225))
            setPadding(dp(10), dp(5), dp(10), dp(5))
            background = rounded(withAlpha(CYAN, 18), 99, withAlpha(CYAN, 55))
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
        summaryHeader.addView(summaryMode, LinearLayout.LayoutParams(-2, -2))
        summaryCard.addView(summaryHeader)

        summaryName = TextView(this).apply {
            text = "Server 1"
            textSize = 18f
            setTextColor(TEXT)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        }
        summaryCard.addView(summaryName, lp(12))

        summaryDetail = TextView(this).apply {
            text = "Belum ada server"
            textSize = 12.5f
            setTextColor(MUTED)
            setLineSpacing(dp(2).toFloat(), 1f)
        }
        summaryCard.addView(summaryDetail, lp(6))

        summaryCard.addView(TextView(this).apply {
            text = "Ubah konfigurasi"
            textSize = 12f
            setTextColor(CYAN)
            setPadding(0, dp(12), 0, 0)
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        })
        root.addView(summaryCard, lp(14))

        val logCard = card()
        val logHeader = horizontal()
        logHeader.addView(
            sectionLabel("LOG KONEKSI"),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        logHeader.addView(TextView(this).apply {
            text = "Salin"
            textSize = 11.5f
            setTextColor(CYAN)
            setPadding(dp(4), dp(4), dp(10), dp(4))
            setOnClickListener {
                val txt = TunnelLog.snapshot().joinToString("\n")
                val cm = getSystemService(CLIPBOARD_SERVICE) as android.content.ClipboardManager
                cm.setPrimaryClip(android.content.ClipData.newPlainText("WanzTunnel", txt))
                Toast.makeText(this@MainActivity, "Log disalin", Toast.LENGTH_SHORT).show()
            }
        }, LinearLayout.LayoutParams(-2, -2))
        logHeader.addView(TextView(this).apply {
            text = "Bersihkan"
            textSize = 11.5f
            setTextColor(CYAN)
            setPadding(dp(10), dp(4), dp(10), dp(4))
            setOnClickListener {
                TunnelLog.clear()
                renderLog()
            }
        }, LinearLayout.LayoutParams(-2, -2))
        logHeader.addView(TextView(this).apply {
            text = "⤢"
            textSize = 14f
            setTextColor(CYAN)
            setPadding(dp(6), dp(2), dp(4), dp(4))
            contentDescription = "Buka log penuh"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, LogActivity::class.java))
            }
        }, LinearLayout.LayoutParams(-2, -2))
        logCard.addView(logHeader)

        logText = TextView(this).apply {
            text = "Menunggu aktivitas..."
            textSize = 11f
            setTextColor(withAlpha(MUTED, 235))
            typeface = Typeface.MONOSPACE
            setLineSpacing(dp(3).toFloat(), 1f)
            setTextIsSelectable(true)
        }
        logScroll = ScrollView(this).apply {
            background = rounded(FIELD, 16, BORDER)
            isFillViewport = false
            isVerticalScrollBarEnabled = true
            setPadding(dp(12), dp(12), dp(12), dp(12))
            addView(logText, ViewGroup.LayoutParams(-1, -2))
        }
        logCard.addView(logScroll, LinearLayout.LayoutParams(-1, dp(260)).apply {
            topMargin = dp(10)
        })
        root.addView(logCard, lp(14))

        root.addView(TextView(this).apply {
            text = "Wanz Tunnel • dibuat untuk koneksi pribadi"
            textSize = 10.5f
            setTextColor(withAlpha(MUTED, 150))
            gravity = Gravity.CENTER
        }, lp(18))
    }

    private fun reloadProfile() {
        val profiles = store.load()
        val activeId = store.activeId()
        profile = profiles.firstOrNull { it.id == activeId } ?: profiles.firstOrNull()
        renderSummary()
    }

    private fun renderSummary() {
        val p = profile
        if (p == null) {
            summaryName.text = "Server 1"
            summaryDetail.text = "Belum ada server"
            summaryMode.text = "SOCKS5"
            return
        }
        summaryName.text = p.name.ifBlank { "Server ${p.id}" }
        val host = p.host.ifBlank { "(host belum diisi)" }
        val transport = when (p.transport) {
            "ssh" -> "SSH langsung"
            "tls" -> "TLS / SNI"
            "ws" -> "WebSocket"
            "wss" -> "WebSocket + TLS"
            else -> p.transport
        }
        summaryMode.text = if (p.vpn) "VPN" else "SOCKS5"
        summaryDetail.text = buildString {
            append("$host:${p.port}\n")
            append("Transport: $transport\n")
            append("Proxy SOCKS5: 127.0.0.1:${p.socksPort}")
            if (p.user.isNotBlank()) append("\nUser: ${p.user}")
        }
    }

    private fun renderLog() {
        val entries = TunnelLog.all()
        logText.text = if (entries.isEmpty()) {
            "Menunggu aktivitas..."
        } else {
            renderLogSpanned(entries)
        }
        logScroll.post { logScroll.fullScroll(View.FOCUS_DOWN) }
    }

    private fun toggle() {
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            return
        }

        val p = profile ?: return
        if (p.host.isBlank()) {
            Toast.makeText(this, "Buka pengaturan lalu isi IP/host server", Toast.LENGTH_SHORT)
                .show()
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }
        if (p.user.isBlank()) {
            Toast.makeText(this, "Buka pengaturan lalu isi username SSH", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }

        if (p.vpn) {
            val prepare = VpnService.prepare(this)
            if (prepare != null) {
                pendingProfileId = p.id
                startActivityForResult(prepare, REQ_VPN)
                return
            }
        }
        startTunnel(p.id)
    }

    private fun startTunnel(profileId: Long) {
        val svc = Intent(this, TunnelService::class.java)
            .setAction(TunnelService.ACTION_START)
            .putExtra(TunnelService.EXTRA_PROFILE, profileId)
        startForegroundService(svc)
    }

    @Deprecated("Deprecated in Android")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_VPN) {
            if (resultCode == RESULT_OK) {
                startTunnel(pendingProfileId)
            } else {
                Toast.makeText(this, "Izin VPN ditolak", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun render() {
        val status = TunnelService.status
        val state = when {
            status.startsWith("Terhubung") -> ConnectButtonView.State.CONNECTED
            status.startsWith("Gagal") || status.startsWith("VPN dicabut") ->
                ConnectButtonView.State.ERROR
            TunnelService.running -> ConnectButtonView.State.CONNECTING
            else -> ConnectButtonView.State.IDLE
        }
        connectBtn.state = state

        val color = when (state) {
            ConnectButtonView.State.CONNECTED -> TEAL
            ConnectButtonView.State.ERROR -> CORAL
            ConnectButtonView.State.CONNECTING -> AMBER
            ConnectButtonView.State.IDLE -> MUTED
        }
        statusText.text = status
        statusText.setTextColor(if (state == ConnectButtonView.State.IDLE) MUTED else color)
        statusDot.background = rounded(color, 0, oval = true)
        statusPill.background = rounded(withAlpha(color, 26), 99, withAlpha(color, 65))
        connectHint.text = when (state) {
            ConnectButtonView.State.CONNECTED -> "Tunnel aktif • ketuk untuk memutuskan"
            ConnectButtonView.State.CONNECTING -> "Menyiapkan tunnel..."
            ConnectButtonView.State.ERROR -> "Periksa konfigurasi lalu coba lagi"
            ConnectButtonView.State.IDLE -> "Ketuk untuk menghubungkan"
        }
        connectBtn.contentDescription = when (state) {
            ConnectButtonView.State.CONNECTED -> "Putuskan tunnel"
            else -> "Hubungkan tunnel"
        }

        val ms = TunnelService.pingMs
        pingLine.text = when {
            !TunnelService.running -> "Ping: —"
            ms >= 0 -> "Ping: $ms ms  •  ketuk untuk ping ulang"
            else -> "Ping: menunggu…  •  ketuk untuk ping"
        }
        pingLine.setTextColor(
            if (TunnelService.running && ms >= 0) TEAL else withAlpha(MUTED, 220)
        )
    }

    override fun onResume() {
        super.onResume()
        TunnelService.onStatus = { runOnUiThread { render() } }
        TunnelLog.onChange = {
            if (!logDirty) {
                logDirty = true
                runOnUiThread(logRenderer)
            }
        }
        reloadProfile()
        render()
        renderLog()
    }

    override fun onPause() {
        super.onPause()
        TunnelService.onStatus = null
        TunnelLog.onChange = null
        logScroll.removeCallbacks(logRenderer)
        logDirty = false
    }

    companion object {
        private const val REQ_VPN = 1001
    }
}
