package id.wanz.tunnel

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.net.VpnService
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayDeque

/**
 * Beranda "Panel" (v2.8).
 *
 * Susunan: rel status di tepi atas, kop kiri, blok status, tabel bacaan
 * (ping/uptime/mode/transport), server aktif, cuplikan aktivitas, lalu satu
 * tombol aksi lebar yang menempel di bawah. Warna hanya untuk status.
 */
class MainActivity : Activity() {
    private lateinit var page: ScrollView
    private lateinit var rail: StatusRailView
    private lateinit var action: ActionBarView
    private lateinit var headline: TextView
    private lateinit var detail: TextView
    private lateinit var pingValue: TextView
    private lateinit var pingBars: PingBarsView
    private lateinit var uptimeValue: TextView
    private lateinit var modeValue: TextView
    private lateinit var modeSub: TextView
    private lateinit var transportValue: TextView
    private lateinit var transportSub: TextView
    private lateinit var serverName: TextView
    private lateinit var serverHost: TextView
    private lateinit var logPreview: TextView

    private lateinit var store: ProfileStore
    private var profile: Profile? = null
    private var pendingProfileId = -1L
    private var logDirty = false
    private var lastPingStamp = 0L
    private val pingHistory = ArrayDeque<Int>()

    private val handler = Handler(Looper.getMainLooper())
    private val ticker = object : Runnable {
        override fun run() {
            renderUptime()
            handler.postDelayed(this, 1000L)
        }
    }
    private val logRenderer = Runnable {
        logDirty = false
        renderLog()
    }

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

    private fun lp(top: Int = 0) =
        LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun horizontal(gravity: Int = Gravity.CENTER_VERTICAL) =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            this.gravity = gravity
        }

    private fun label(text: String) = TextView(this).apply {
        this.text = text
        textSize = 11f
        setTextColor(MUTED)
        typeface = Typeface.create("sans-serif", Typeface.NORMAL)
    }

    private fun value(size: Float, mono: Boolean = false) = TextView(this).apply {
        textSize = size
        setTextColor(INK)
        typeface = Typeface.create(if (mono) "monospace" else "sans-serif-medium", Typeface.NORMAL)
        maxLines = 1
        ellipsize = TextUtils.TruncateAt.END
        includeFontPadding = false
    }

    private fun sub() = TextView(this).apply {
        textSize = 10.5f
        setTextColor(MUTED)
        maxLines = 1
        ellipsize = TextUtils.TruncateAt.END
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG
        window.navigationBarColor = BG
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

        if (Build.VERSION.SDK_INT >= 33 &&
            checkSelfPermission("android.permission.POST_NOTIFICATIONS") !=
            PackageManager.PERMISSION_GRANTED
        ) {
            requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)
        }

        store = ProfileStore(this)

        val content = buildContent()
        page = ScrollView(this).apply {
            isFillViewport = true
            clipToPadding = false
            isVerticalScrollBarEnabled = false
            setBackgroundColor(BG)
            addView(content, ViewGroup.LayoutParams(-1, -2))
        }

        rail = StatusRailView(this)
        action = ActionBarView(this).apply {
            isClickable = true
            contentDescription = "Hubungkan tunnel"
            setOnClickListener { toggle() }
        }

        val bottom = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
        }
        bottom.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        val bottomInner = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(24), dp(12), dp(24), dp(14))
        }
        bottomInner.addView(action, LinearLayout.LayoutParams(-1, dp(56)))
        bottomInner.addView(TextView(this).apply {
            text = "Wanz Tunnel 2.8.1  ·  koneksi pribadi"
            textSize = 10f
            setTextColor(FAINT)
            setPadding(0, dp(8), 0, 0)
        })
        bottom.addView(bottomInner)

        val shell = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
        }
        shell.addView(rail, LinearLayout.LayoutParams(-1, dp(4)))
        shell.addView(page, LinearLayout.LayoutParams(-1, 0, 1f))
        shell.addView(bottom, LinearLayout.LayoutParams(-1, -2))
        setContentView(shell)

        reloadProfile()
        render()
        renderLog()
        page.post { page.scrollTo(0, 0) }
    }

    private fun buildContent(): LinearLayout {
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(24), dp(16), dp(24), dp(28))
        }

        // ------------------------------------------------------------- KOP
        val header = horizontal()
        header.addView(View(this).apply { setBackgroundColor(INK) },
            LinearLayout.LayoutParams(dp(10), dp(10)).apply { rightMargin = dp(9) })
        header.addView(TextView(this).apply {
            text = "WANZ TUNNEL"
            textSize = 13f
            letterSpacing = 0.06f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        }, LinearLayout.LayoutParams(0, -2, 1f))

        val settingsButton = FrameLayout(this).apply {
            background = box(0, 2, HAIR, 1)
            isClickable = true
            contentDescription = "Buka pengaturan"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
        settingsButton.addView(
            SlidersView(this).apply { setPadding(dp(10), dp(9), dp(10), dp(9)) },
            FrameLayout.LayoutParams(-1, -1)
        )
        header.addView(settingsButton, LinearLayout.LayoutParams(dp(40), dp(40)))
        root.addView(header)
        root.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(14) })

        // ----------------------------------------------------------- STATUS
        val statusBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        headline = TextView(this).apply {
            text = "Terputus"
            textSize = 34f
            letterSpacing = -0.02f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            includeFontPadding = false
        }
        statusBox.addView(headline, lp(2))
        detail = TextView(this).apply {
            text = "Pilih server lalu hubungkan."
            textSize = 13f
            setTextColor(MUTED)
            maxLines = 2
            setLineSpacing(dp(2).toFloat(), 1f)
        }
        statusBox.addView(detail, lp(6))
        root.addView(statusBox, lp(24))

        // --------------------------------------------------------- BACAAN
        val table = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        table.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        table.addView(
            readoutRow(dp(104), pingCell(), uptimeCell()),
            LinearLayout.LayoutParams(-1, dp(104))
        )
        table.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        table.addView(
            readoutRow(dp(86), modeCell(), transportCell()),
            LinearLayout.LayoutParams(-1, dp(86))
        )
        table.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        root.addView(table, lp(24))

        // ----------------------------------------------------------- SERVER
        val serverWrap = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val serverRow = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, dp(13), 0, dp(13))
            isClickable = true
            contentDescription = "Ubah server aktif"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
        serverRow.addView(label("Server aktif"))
        val nameRow = horizontal()
        serverName = TextView(this).apply {
            text = "Belum ada server"
            textSize = 17f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        nameRow.addView(serverName, LinearLayout.LayoutParams(0, -2, 1f))
        nameRow.addView(ArrowView(this), LinearLayout.LayoutParams(dp(20), dp(20)))
        serverRow.addView(nameRow, lp(4))
        serverHost = TextView(this).apply {
            text = "Atur host dan akun di pengaturan."
            textSize = 11.5f
            setTextColor(MUTED)
            typeface = Typeface.MONOSPACE
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        serverRow.addView(serverHost, lp(2))
        serverWrap.addView(serverRow)
        serverWrap.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        root.addView(serverWrap, lp(24))

        // -------------------------------------------------------- AKTIVITAS
        val activityBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val activityHead = horizontal()
        activityHead.addView(label("Aktivitas"), LinearLayout.LayoutParams(0, -2, 1f))
        activityHead.addView(TextView(this).apply {
            text = "Buka log"
            textSize = 11.5f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
            setPadding(dp(12), dp(8), 0, dp(8))
            isClickable = true
            setOnClickListener {
                startActivity(Intent(this@MainActivity, LogActivity::class.java))
            }
        })
        activityBox.addView(activityHead)

        logPreview = TextView(this).apply {
            text = "Belum ada aktivitas."
            textSize = 10f
            setTextColor(MUTED)
            typeface = Typeface.MONOSPACE
            setLineSpacing(dp(3).toFloat(), 1f)
            maxLines = 6
            ellipsize = TextUtils.TruncateAt.END
            setPadding(dp(12), dp(11), dp(12), dp(11))
            background = box(PANEL, 2, HAIR, 1)
            isClickable = true
            setOnClickListener {
                startActivity(Intent(this@MainActivity, LogActivity::class.java))
            }
        }
        activityBox.addView(logPreview, lp(7))
        root.addView(activityBox, lp(22))

        return root
    }

    private fun readoutRow(height: Int, a: View, b: View): LinearLayout {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.TOP
        }
        row.addView(a, LinearLayout.LayoutParams(0, height, 1f))
        row.addView(View(this).apply { setBackgroundColor(HAIR) },
            LinearLayout.LayoutParams(dp(1), height))
        row.addView(b, LinearLayout.LayoutParams(0, height, 1f))
        return row
    }

    private fun cell(left: Boolean): LinearLayout = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        setPadding(
            if (left) 0 else dp(16),
            dp(12),
            if (left) dp(16) else 0,
            dp(12)
        )
    }

    private fun pingCell(): LinearLayout {
        val c = cell(true)
        c.addView(label("Ping"))
        pingValue = value(23f, mono = true).apply {
            text = "—"
            setTextColor(FAINT)
        }
        c.addView(pingValue, lp(4))
        pingBars = PingBarsView(this)
        c.addView(pingBars, LinearLayout.LayoutParams(-1, dp(22)).apply { topMargin = dp(8) })
        c.isClickable = true
        c.contentDescription = "Uji ping"
        c.setOnClickListener {
            if (TunnelService.running) {
                startService(
                    Intent(this, TunnelService::class.java)
                        .setAction(TunnelService.ACTION_PING)
                )
            } else {
                Toast.makeText(this, "Hubungkan dulu untuk ping", Toast.LENGTH_SHORT).show()
            }
        }
        return c
    }

    private fun uptimeCell(): LinearLayout {
        val c = cell(false)
        c.addView(label("Uptime"))
        uptimeValue = value(19f, mono = true).apply {
            text = "—"
            setTextColor(FAINT)
        }
        c.addView(uptimeValue, lp(5))
        c.addView(sub().apply { text = "durasi sesi" }, lp(4))
        return c
    }

    private fun modeCell(): LinearLayout {
        val c = cell(true)
        c.addView(label("Mode"))
        modeValue = value(18f).apply { text = "VPN" }
        c.addView(modeValue, lp(5))
        modeSub = sub().apply { text = "semua aplikasi" }
        c.addView(modeSub, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(2) })
        return c
    }

    private fun transportCell(): LinearLayout {
        val c = cell(false)
        c.addView(label("Transport"))
        transportValue = value(18f).apply { text = "SSH" }
        c.addView(transportValue, lp(5))
        transportSub = sub().apply { text = "langsung" }
        c.addView(transportSub, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(2) })
        return c
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
            serverName.text = "Belum ada server"
            serverHost.text = "Atur host dan akun di pengaturan."
            modeValue.text = "VPN"
            modeSub.text = "semua aplikasi"
            transportValue.text = "SSH"
            transportSub.text = "langsung"
            return
        }
        serverName.text = p.name.ifBlank { "Server ${p.id}" }
        serverHost.text = if (p.host.isBlank()) {
            "Host belum diisi · buka pengaturan"
        } else {
            "${p.host}:${p.port}"
        }
        modeValue.text = "VPN"
        modeSub.text = "semua aplikasi"
        transportValue.text = when (p.transport) {
            "ssh" -> "SSH"
            "tls" -> "TLS"
            "ws" -> "WS"
            "wss" -> "WSS"
            else -> p.transport.uppercase()
        }
        transportSub.text = when (p.transport) {
            "ssh" -> "langsung"
            "tls" -> "SNI"
            "ws" -> "SSH WebSocket"
            "wss" -> "WebSocket + TLS"
            else -> p.transport
        }
    }

    private fun renderUptime() {
        val started = TunnelService.connectedAt
        val active = TunnelService.running && started > 0L
        if (!active) {
            uptimeValue.text = "—"
            uptimeValue.setTextColor(FAINT)
            return
        }
        val total = ((System.currentTimeMillis() - started) / 1000L).coerceAtLeast(0L)
        val hh = total / 3600
        val mm = (total % 3600) / 60
        val ss = total % 60
        uptimeValue.text = String.format("%02d:%02d:%02d", hh, mm, ss)
        uptimeValue.setTextColor(INK)
    }

    private fun render() {
        renderSummary()
        val raw = TunnelService.status
        val state = when {
            raw.startsWith("Terhubung") -> ActionBarView.State.CONNECTED
            raw.startsWith("Gagal") || raw.startsWith("VPN dicabut") -> ActionBarView.State.ERROR
            TunnelService.running -> ActionBarView.State.CONNECTING
            else -> ActionBarView.State.IDLE
        }
        val noInternet = state == ActionBarView.State.CONNECTED && raw.contains("internet gagal")

        rail.state = when (state) {
            ActionBarView.State.CONNECTED -> StatusRailView.State.CONNECTED
            ActionBarView.State.ERROR -> StatusRailView.State.ERROR
            ActionBarView.State.CONNECTING -> StatusRailView.State.CONNECTING
            else -> StatusRailView.State.IDLE
        }
        rail.warning = noInternet
        action.state = state
        action.warning = noInternet
        action.contentDescription = when (state) {
            ActionBarView.State.CONNECTED -> "Putuskan tunnel"
            ActionBarView.State.ERROR -> "Coba hubungkan lagi"
            else -> "Hubungkan tunnel"
        }

        headline.text = when {
            noInternet -> "Tanpa internet"
            state == ActionBarView.State.CONNECTED -> "Terhubung"
            state == ActionBarView.State.ERROR -> "Gagal"
            state == ActionBarView.State.CONNECTING -> "Menyambungkan"
            else -> "Terputus"
        }
        headline.setTextColor(
            when {
                noInternet -> WARN
                state == ActionBarView.State.CONNECTED -> OK
                state == ActionBarView.State.ERROR -> ERR
                else -> INK
            }
        )

        detail.text = when {
            noInternet -> "Tunnel aktif, tetapi uji internet gagal. Periksa server atau payload."
            state == ActionBarView.State.CONNECTED ->
                raw.removePrefix("Terhubung").trim(' ', '•', '·')
                    .ifBlank { "Tunnel aktif dan siap dipakai." }
            state == ActionBarView.State.ERROR -> friendlyError(raw)
            state == ActionBarView.State.CONNECTING -> raw
            else -> "Pilih server lalu hubungkan."
        }
        detail.setTextColor(
            when {
                noInternet -> WARN
                state == ActionBarView.State.CONNECTED -> MUTED
                state == ActionBarView.State.ERROR -> ERR
                else -> MUTED
            }
        )

        // Ping.
        val ms = TunnelService.pingMs
        if (ms >= 0 && TunnelService.pingAt != lastPingStamp) {
            lastPingStamp = TunnelService.pingAt
            pingHistory.addLast(ms)
            while (pingHistory.size > 24) pingHistory.removeFirst()
            pingBars.values = pingHistory.toList()
        }
        if (!TunnelService.running) {
            pingHistory.clear()
            pingBars.values = emptyList()
            lastPingStamp = 0L
        }
        pingValue.text = if (ms >= 0 && TunnelService.running) "$ms ms" else "—"
        pingValue.setTextColor(
            if (ms >= 0 && TunnelService.running) INK else FAINT
        )

        renderUptime()
    }

    private fun friendlyError(raw: String): String {
        val message = raw.removePrefix("Gagal:").trim()
        return when {
            message.contains("Auth cancel", true) || message.contains("Auth fail", true) ->
                "Autentikasi ditolak server. Periksa username dan password."
            message.contains("Connection refused", true) ->
                "Server menolak koneksi. Periksa host dan port."
            message.contains("UnknownHost", true) ->
                "Host tidak ditemukan. Periksa alamat server."
            message.contains("timeout", true) ->
                "Waktu koneksi habis. Coba lagi atau ganti server."
            else -> message.ifBlank { raw }
        }
    }

    private fun renderLog() {
        val entries = TunnelLog.all()
        logPreview.text = if (entries.isEmpty()) {
            "Belum ada aktivitas."
        } else {
            renderLogSpanned(entries.takeLast(6))
        }
    }

    private fun toggle() {
        action.performHapticFeedback(android.view.HapticFeedbackConstants.VIRTUAL_KEY)
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            return
        }
        val p = profile ?: return
        if (p.host.isBlank()) {
            Toast.makeText(this, "Buka pengaturan lalu isi host/IP server", Toast.LENGTH_SHORT)
                .show()
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }
        if (p.user.isBlank()) {
            Toast.makeText(this, "Buka pengaturan lalu isi username SSH", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }
        // Selalu VPN (mode tunggal, seperti HTTP Custom).
        val prepare = VpnService.prepare(this)
        if (prepare != null) {
            pendingProfileId = p.id
            @Suppress("DEPRECATION")
            startActivityForResult(prepare, REQ_VPN)
            return
        }
        startTunnel(p.id)
    }

    private fun startTunnel(profileId: Long) {
        startForegroundService(
            Intent(this, TunnelService::class.java)
                .setAction(TunnelService.ACTION_START)
                .putExtra(TunnelService.EXTRA_PROFILE, profileId)
        )
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

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            page.postDelayed({ page.scrollTo(0, 0) }, 250L)
        }
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
        handler.removeCallbacks(ticker)
        handler.post(ticker)
        page.post { page.scrollTo(0, 0) }
    }

    override fun onPause() {
        super.onPause()
        TunnelService.onStatus = null
        TunnelLog.onChange = null
        handler.removeCallbacks(ticker)
        logDirty = false
    }

    companion object {
        private const val REQ_VPN = 1001
    }
}
