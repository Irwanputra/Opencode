package id.wanz.tunnel

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.drawable.GradientDrawable
import android.net.VpnService
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.TextUtils
import android.util.TypedValue
import android.view.Gravity
import android.view.HapticFeedbackConstants
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayDeque
import java.util.Locale

/**
 * Beranda "Konsol" (v2.9).
 *
 * Diambil dari cara DarkTunnel dan HTTP Custom dipakai orang, bukan dari
 * cara keduanya terlihat: satu kartu koneksi berisi baris label/nilai,
 * bacaan trafik dan uptime yang berjalan terus, riwayat ping, lalu konsol log
 * mono di bawah. Yang membedakan: kanvas grafit hangat, aksen kuningan, tanpa
 * ikon Material, dan tombol aksi yang menempel di bawah layar sehingga tetap
 * bisa ditekan walau halaman digulir.
 *
 * Bagian teratas selalu: rel status, kop, satu baris status. Semua angka di
 *IBM Plex Mono supaya perubahan antar-sekatan tidak membuat layout meloncat.
 */
class MainActivity : InkActivity() {
    private lateinit var page: ScrollView
    private lateinit var rail: StatusRailView
    private lateinit var action: ActionBarView
    private lateinit var headline: TextView
    private lateinit var detail: TextView
    private lateinit var profileName: TextView
    private lateinit var profileStep: TextView
    private lateinit var chipTransport: TextView
    private lateinit var rowTarget: TextView
    private lateinit var rowAccount: TextView
    private lateinit var rowExtra: TextView
    private lateinit var rxValue: TextView
    private lateinit var rxRate: TextView
    private lateinit var txValue: TextView
    private lateinit var txRate: TextView
    private lateinit var uptimeValue: TextView
    private lateinit var uptimeSub: TextView
    private lateinit var pingValue: TextView
    private lateinit var pingBars: PingBarsView
    private lateinit var logPreview: TextView

    private lateinit var store: ProfileStore
    private var profiles = mutableListOf<Profile>()
    private var profile: Profile? = null
    private var pendingProfileId = -1L
    private var logDirty = false
    private var lastPingStamp = 0L
    private val pingHistory = ArrayDeque<Int>()

    private var lastRx = 0L
    private var lastTx = 0L
    private var peakRate = 0L

    private val handler = Handler(Looper.getMainLooper())
    private val ticker = object : Runnable {
        override fun run() {
            renderUptime()
            renderTraffic()
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
        radius: Int = R_PANEL,
        stroke: Int = 0,
        strokeWidth: Int = 1
    ) = GradientDrawable().apply {
        cornerRadius = dp(radius).toFloat()
        setColor(fill)
        if (stroke != 0) setStroke(dp(strokeWidth), stroke)
    }

    private fun rule() = View(this).apply { setBackgroundColor(HAIR) }

    private fun lp(top: Int = 0) = LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun horizontal(gravity: Int = Gravity.CENTER_VERTICAL) = LinearLayout(this).apply {
        orientation = LinearLayout.HORIZONTAL
        this.gravity = gravity
    }

    /** Label micro 9,5sp mono: nama kolom, bukan kalimat. */
    private fun micro(size: Float = 9.5f, color: Int = FAINT) = TextView(this).apply {
        setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
        letterSpacing = 0.04f
        setTextColor(color)
        typeface = Face.mono(this@MainActivity)
        maxLines = 1
        ellipsize = TextUtils.TruncateAt.END
    }

    /** Angka: mono, satu baris, tidak pernah membuat layout meloncat. */
    private fun number(size: Float, color: Int = INK) = TextView(this).apply {
        setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
        setTextColor(color)
        typeface = Face.mono(this@MainActivity)
        maxLines = 1
        ellipsize = TextUtils.TruncateAt.END
        includeFontPadding = false
    }

    /** Kalimat: sans sistem, dibaca sekali lalu dilupakan. */
    private fun prose(size: Float, color: Int = MUTED, medium: Boolean = false) =
        TextView(this).apply {
            setTextSize(TypedValue.COMPLEX_UNIT_SP, size)
            setTextColor(color)
            typeface = if (medium) Face.proseMedium(this@MainActivity)
            else Face.prose(this@MainActivity)
            setLineSpacing(dp(2).toFloat(), 1f)
        }

    // ------------------------------------------------------------------ layout
    private fun buildUi(): View {
        val shell = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
        }

        rail = StatusRailView(this)
        shell.addView(rail, LinearLayout.LayoutParams(-1, dp(3)))

        page = ScrollView(this).apply { isVerticalScrollBarEnabled = false }
        val body = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(18), dp(12), dp(18), dp(10))
        }
        body.addView(header())
        body.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(12) })
        body.addView(statusBlock(), lp(14))
        body.addView(connectionCard(), lp(16))
        body.addView(readoutStrip(), lp(14))
        body.addView(pingStrip(), lp(0))
        body.addView(logBlock(), lp(14))
        page.addView(body, wrap())
        shell.addView(page, LinearLayout.LayoutParams(-1, 0, 1f))

        val actionWrap = FrameLayout(this).apply { setPadding(dp(18), dp(6), dp(18), dp(2)) }
        action = ActionBarView(this).apply {
            setOnClickListener { toggle() }
        }
        actionWrap.addView(action, FrameLayout.LayoutParams(-1, dp(58)))
        shell.addView(actionWrap)

        shell.addView(
            micro(9.5f, FAINT).apply {
                text = "Wanz Tunnel " + BuildConfig.VERSION_NAME + "  ·  koneksi pribadi"
                gravity = Gravity.CENTER
            },
            LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(8) }
        )
        return shell
    }

    /** Isi halaman biarkan membungkus tinggi kontennya. */
    private fun wrap() = LinearLayout.LayoutParams(-1, -2)

    /** Kop: tanda produk di kiri, roda gigi di kanan. */
    private fun header(): View {
        val row = horizontal()
        row.addView(View(this).apply { setBackgroundColor(INK) },
            LinearLayout.LayoutParams(dp(10), dp(10)).apply { rightMargin = dp(9) })
        row.addView(micro(12f, INK).apply {
            text = "WANZ TUNNEL"
            letterSpacing = 0.10f
            typeface = Face.monoMedium(this@MainActivity)
        }, LinearLayout.LayoutParams(0, -2, 1f))

        val gear = FrameLayout(this).apply {
            background = box(0, R_PANEL, HAIR, 1)
            isClickable = true
            contentDescription = "Buka pengaturan"
            minimumHeight = dp(44)
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
        gear.addView(
            SlidersView(this).apply { setPadding(dp(11), dp(10), dp(11), dp(10)) },
            FrameLayout.LayoutParams(-1, -1)
        )
        row.addView(gear, LinearLayout.LayoutParams(dp(44), dp(44)))
        return row
    }

    /** Satu baris status: kondisi sekarang, bukan ruang kosong 34sp. */
    private fun statusBlock(): View {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }

        val top = horizontal()
        headline = prose(23f, INK, medium = true).apply { maxLines = 1 }
        headline.text = "Terputus"
        top.addView(headline, LinearLayout.LayoutParams(0, -2, 1f))
        profileStep = number(11f, FAINT).apply {
            text = ""
            gravity = Gravity.END
        }
        top.addView(profileStep, LinearLayout.LayoutParams(-2, -2))
        box.addView(top)

        detail = prose(12f, MUTED).apply { maxLines = 2 }
        detail.text = "Pilih server lalu hubungkan."
        box.addView(detail, lp(4))
        return box
    }

    /**
     * Kartu koneksi: baris profil dengan pemindah, lalu nilai target, akun,
     * dan pembungkus yang benar-benar dipakai layanan. Meniru susunan kartu
     * DarkTunnel, tapi tanpa daftar config bertumpuk.
     */
    private fun connectionCard(): View {
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = box(PANEL, R_PANEL, HAIR, 1)
            setPadding(dp(14), dp(12), dp(14), dp(12))
        }

        val chipRow = horizontal()
        chipRow.addView(micro(9.5f, FAINT).apply { text = "server aktif" })
        chipTransport = number(11f, ACCENT).apply {
            text = "SSH · VPN"
            gravity = Gravity.END
        }
        chipRow.addView(chipTransport, LinearLayout.LayoutParams(0, -2, 1f).apply {
            leftMargin = dp(10)
        })
        card.addView(chipRow)

        val nameRow = horizontal().apply {
            setPadding(0, dp(8), 0, dp(4))
            minimumHeight = dp(44)
            isClickable = true
            contentDescription = "Ubah profil server"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, SettingsActivity::class.java))
            }
        }
        profileName = prose(19f, INK, medium = true).apply {
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
            text = "Belum ada server"
        }
        nameRow.addView(proseStep("‹", "Profil sebelumnya") { stepProfile(-1) },
            LinearLayout.LayoutParams(-2, -1))
        nameRow.addView(
            profileName,
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(6); rightMargin = dp(6) }
        )
        nameRow.addView(proseStep("›", "Profil berikutnya") { stepProfile(1) },
            LinearLayout.LayoutParams(-2, -1))
        card.addView(nameRow)

        card.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(4) })
        rowTarget = kvRow(card, "target")
        rowAccount = kvRow(card, "akun")
        rowExtra = kvRow(card, "pembungkus", last = true)
        return card
    }

    /** Tombol kecil pemindah profil, setinggi area sentuh. */
    private fun proseStep(glyph: String, desc: String, onTap: () -> Unit) =
        TextView(this).apply {
            text = glyph
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 17f)
            setTextColor(FAINT)
            contentDescription = desc
            gravity = Gravity.CENTER
            setPadding(dp(10), 0, dp(10), 0)
            minimumWidth = dp(40)
            minimumHeight = dp(44)
            isClickable = true
            setOnClickListener {
                performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                onTap()
            }
        }

    /** Baris label kiri, nilai kanan. Dua kolom, satu garis rambut. */
    private fun kvRow(parent: LinearLayout, name: String, last: Boolean = false): TextView {
        val row = horizontal().apply { setPadding(0, dp(9), 0, dp(9)) }
        row.addView(micro(9.5f, FAINT).apply { text = name })
        val value = number(12.5f, INK).apply {
            text = "—"
            gravity = Gravity.END
            letterSpacing = 0.01f
        }
        row.addView(value, LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(12) })
        parent.addView(row)
        if (!last) parent.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        return value
    }

    /** Bacaan trafik dan uptime, tiga kolom sejajar. */
    private fun readoutStrip(): View {
        val row = horizontal(Gravity.TOP)
        rxValue = number(16f)
        rxRate = micro(9.5f, MUTED)
        txValue = number(16f)
        txRate = micro(9.5f, MUTED)
        uptimeValue = number(16f)
        uptimeSub = micro(9.5f, MUTED)

        row.addView(column("kunde", rxValue, rxRate), columnParams())
        row.addView(divider(), LinearLayout.LayoutParams(dp(1), -1))
        row.addView(column("kirim", txValue, txRate), columnParams())
        row.addView(divider(), LinearLayout.LayoutParams(dp(1), -1))
        row.addView(column("aktif", uptimeValue, uptimeSub), columnParams())
        return row
    }

    private fun columnParams() = LinearLayout.LayoutParams(0, -2, 1f)

    private fun divider() = View(this).apply { setBackgroundColor(HAIR) }

    private fun column(name: String, value: TextView, sub: TextView): View {
        val c = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(10), dp(10), dp(10), dp(10))
        }
        c.addView(micro(9.5f, FAINT).apply { text = name })
        c.addView(value, lp(3))
        c.addView(sub, lp(2))
        return c
    }

    /** Riwayat ping: nilai terbaru di kanan atas, bilah di bawahnya. */
    private fun pingStrip(): View {
        val c = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(10), dp(12), dp(10), dp(12))
            background = box(PANEL, R_PANEL, HAIR, 1)
            isClickable = true
            contentDescription = "Uji ping sekarang"
            minimumHeight = dp(48)
            setOnClickListener { pingNow() }
        }
        val head = horizontal()
        head.addView(micro(9.5f, FAINT).apply { text = "ping" })
        pingValue = number(12.5f, FAINT).apply {
            text = "—"
            gravity = Gravity.END
        }
        head.addView(pingValue, LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) })
        c.addView(head)
        pingBars = PingBarsView(this)
        c.addView(pingBars, LinearLayout.LayoutParams(-1, dp(44)).apply { topMargin = dp(8) })
        return c
    }

    private fun logBlock(): View {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val head = horizontal()
        head.addView(micro(9.5f, FAINT).apply { text = "log" }, LinearLayout.LayoutParams(0, -2, 1f))
        head.addView(
            micro(10.5f, ACCENT).apply {
                text = "buka"
                setPadding(dp(12), dp(9), 0, dp(9))
                minimumHeight = dp(44)
                isClickable = true
                contentDescription = "Buka log lengkap"
                typeface = Face.monoMedium(this@MainActivity)
                setOnClickListener {
                    startActivity(Intent(this@MainActivity, LogActivity::class.java))
                }
            }
        )
        box.addView(head)

        logPreview = number(9.5f, INK).apply {
            maxLines = 5
            ellipsize = TextUtils.TruncateAt.END
            setLineSpacing(dp(3).toFloat(), 1f)
            setBackgroundColor(PANEL)
            setPadding(dp(10), dp(9), dp(10), dp(9))
            isClickable = true
            contentDescription = "Buka log lengkap"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, LogActivity::class.java))
            }
        }
        box.addView(logPreview, lp(5))
        return box
    }

    // ------------------------------------------------------------------ render
    private fun render() {
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
            noInternet -> "Terhubung, tanpa internet"
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
            else -> "Semua trafik aplikasi lewat VPN. Ketuk tombol di bawah."
        }
        detail.setTextColor(
            when {
                noInternet -> WARN
                state == ActionBarView.State.CONNECTED -> MUTED
                state == ActionBarView.State.ERROR -> ERR
                else -> MUTED
            }
        )

        profileStep.text = if (profiles.size > 1) {
            "${profiles.indexOf(profile) + 1}/${profiles.size}"
        } else {
            ""
        }

        val ms = TunnelService.pingMs
        if (ms >= 0 && TunnelService.pingAt != lastPingStamp) {
            lastPingStamp = TunnelService.pingAt
            pingHistory.addLast(ms)
            while (pingHistory.size > PingBarsView.SLOTS) pingHistory.removeFirst()
            pingBars.values = pingHistory.toList()
        }
        if (!TunnelService.running) {
            pingHistory.clear()
            pingBars.values = emptyList()
            lastPingStamp = 0L
        }
        pingValue.text = if (ms >= 0 && TunnelService.running) "$ms ms" else "—"
        pingValue.setTextColor(if (ms >= 0 && TunnelService.running) INK else FAINT)

        renderUptime()
        renderTraffic()
    }

    private fun renderSummary() {
        val p = profile
        if (p == null) {
            profileName.text = "Belum ada server"
            chipTransport.text = "SSH · VPN"
            rowTarget.text = "belum diisi"
            rowAccount.text = "belum diisi"
            rowExtra.text = "langsung"
            return
        }
        profileName.text = p.name.ifBlank { "Server ${p.id}" }
        chipTransport.text = "${transportLabel(p.transport)} · VPN"
        rowTarget.text = if (p.host.isBlank()) "belum diisi" else "${p.host}:${p.port}"
        rowAccount.text = if (p.user.isBlank()) "belum diisi" else p.user
        rowExtra.text = when (p.transport) {
            "ssh" -> "langsung"
            "tls" -> if (p.sni.isBlank()) "TLS" else "TLS · ${p.sni}"
            "ws" -> if (p.wsHost.isBlank()) "WebSocket" else "WS · ${p.wsHost}"
            "wss" -> if (p.wsHost.isBlank()) "WebSocket + TLS" else "WSS · ${p.wsHost}"
            else -> p.transport
        }
    }

    private fun transportLabel(key: String) = when (key) {
        "ssh" -> "SSH"
        "tls" -> "TLS"
        "ws" -> "WS"
        "wss" -> "WSS"
        else -> key.uppercase(Locale.getDefault())
    }

    private fun renderUptime() {
        val started = TunnelService.connectedAt
        val active = TunnelService.running && started > 0L
        if (!active) {
            uptimeValue.text = "—"
            uptimeValue.setTextColor(FAINT)
            uptimeSub.text = "belum berjalan"
            return
        }
        uptimeValue.setTextColor(INK)
        val total = ((System.currentTimeMillis() - started) / 1000L).coerceAtLeast(0L)
        val hh = total / 3600
        val mm = (total % 3600) / 60
        val ss = total % 60
        uptimeValue.text = if (hh > 0) "%02d:%02d:%02d".format(hh, mm, ss)
        else "%02d:%02d".format(mm, ss)
        uptimeSub.text = if (TunnelService.pingMs >= 0) "ping ${TunnelService.pingMs} ms"
        else "ping belum diuji"
    }

    /** Traffic: jumlah terkumpul plus laju detik ini dan puncak sesi. */
    private fun renderTraffic() {
        val active = TunnelService.running && TunnelService.connectedAt > 0L
        if (!active) {
            lastRx = 0L
            lastTx = 0L
            peakRate = 0L
            rxValue.text = "—"
            txValue.text = "—"
            rxValue.setTextColor(FAINT)
            txValue.setTextColor(FAINT)
            rxRate.text = "belum ada"
            txRate.text = "maks —"
            return
        }
        val rx = TunnelService.sessionRx()
        val tx = TunnelService.sessionTx()
        val rxDelta = (rx - lastRx).coerceAtLeast(0L)
        val txDelta = (tx - lastTx).coerceAtLeast(0L)
        lastRx = rx
        lastTx = tx
        val rate = rxDelta + txDelta
        if (rate > peakRate) peakRate = rate

        rxValue.text = fmtBytes(rx)
        txValue.text = fmtBytes(tx)
        rxValue.setTextColor(INK)
        txValue.setTextColor(INK)
        rxRate.text = "${fmtBytes(rxDelta)}/s"
        txRate.text = "maks ${fmtBytes(peakRate)}/s"
    }

    private fun fmtBytes(v: Long): String {
        if (v < 1024) return "${v} B"
        val kb = v / 1024.0
        if (kb < 1024) return "${fmtOne(kb)} KB"
        val mb = kb / 1024.0
        if (mb < 1024) return "${fmtOne(mb)} MB"
        return "${fmtOne(mb / 1024.0)} GB"
    }

    /** Satu desimal cuma di bawah 10; di atasnya angka penuh. */
    private fun fmtOne(v: Double): String =
        String.format(Locale.US, if (v >= 10) "%.0f" else "%.1f", v)

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
            "belum ada aktivitas"
        } else {
            renderLogSpanned(entries.takeLast(5))
        }
    }

    // ------------------------------------------------------------------ aksi
    private fun pingNow() {
        if (!TunnelService.running) {
            Toast.makeText(this, "Hubungkan dulu untuk ping", Toast.LENGTH_SHORT).show()
            return
        }
        startService(
            Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_PING)
        )
    }

    /** Pindah profil dari beranda; tunnel diputus kalau sedang jalan. */
    private fun stepProfile(delta: Int) {
        if (profiles.size < 2) {
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }
        val current = profile?.id ?: profiles.first().id
        val index = profiles.indexOfFirst { it.id == current }
        val next = ((index + delta) % profiles.size + profiles.size) % profiles.size
        val target = profiles[next]
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            Toast.makeText(this, "Tunnel diputus karena ganti profil", Toast.LENGTH_SHORT).show()
        }
        store.save(profiles, target.id)
        profile = target
        renderSummary()
        render()
    }

    private fun toggle() {
        action.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            return
        }
        val p = profile ?: run {
            startActivity(Intent(this, SettingsActivity::class.java))
            return
        }
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

    private fun reloadProfile() {
        profiles = store.load()
        if (profiles.isEmpty()) profiles.add(Profile(id = 1, name = "Server 1"))
        val activeId = store.activeId()
        profile = profiles.firstOrNull { it.id == activeId } ?: profiles.firstOrNull()
        renderSummary()
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContentView(buildUi())

        store = ProfileStore(this)
        reloadProfile()

        if (Build.VERSION.SDK_INT >= 33 &&
            checkSelfPermission("android.permission.POST_NOTIFICATIONS") !=
            PackageManager.PERMISSION_GRANTED
        ) {
            requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) page.postDelayed({ page.scrollTo(0, 0) }, 250L)
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
