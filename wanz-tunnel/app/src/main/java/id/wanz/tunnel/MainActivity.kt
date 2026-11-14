package id.wanz.tunnel

import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.net.VpnService
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.InputType
import android.text.TextUtils
import android.view.Gravity
import android.view.HapticFeedbackConstants
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import java.io.File
import java.util.Locale

/**
 * Beranda, disusun mengikuti aplikasi acuan (HTTP Custom).
 *
 * Susunannya dari atas ke bawah: bilah atas berisi menu, judul "Wanz Tunnel",
 * impor config; dua tab selebar layar dengan garis bawah hijau; isian
 * `ip:port@user:pass`; kisi centang dua kolom; tombol sambung bergaris;
 * baris status; lalu bacaan trafik. Tab LOG menampilkan log berwarna per level.
 * Tidak ada menu tiga titik dan tidak ada tombol tambah mengambang: keduanya
 * pintasan yang tidak dipakai, dan semua tujuannya tetap ada di laci kiri.
 *
 * Yang tidak berubah dari versi sebelumnya: tunnel tetap SSH + VPN, dan semua
 * angka memakai Roboto Mono dengan piksel utuh supaya tidak bergetar.
 */
class MainActivity : InkActivity() {

    private lateinit var root: FrameLayout
    private lateinit var sshPanel: ScrollView
    private lateinit var sshBody: LinearLayout
    private lateinit var logPanel: LinearLayout
    private lateinit var logScroll: ScrollView
    private lateinit var logList: LinearLayout
    private lateinit var drawer: ScrollView
    private lateinit var scrim: View
    private var drawerWidth = 0
    private var drawerOpen = false

    private lateinit var tabSsh: TextView
    private lateinit var tabLog: TextView
    private lateinit var tabIndicator: View
    private var tab = TAB_SSH

    private lateinit var nameLabel: TextView
    private lateinit var transportLabel: TextView
    private lateinit var compactField: EditText
    private lateinit var compactUnderline: FieldUnderline
    private lateinit var connectButton: TextView
    private lateinit var statusText: TextView
    private lateinit var rxText: TextView
    private lateinit var txText: TextView
    private lateinit var upText: TextView
    private lateinit var rxSub: TextView
    private lateinit var txSub: TextView
    private lateinit var upSub: TextView
    private lateinit var metricsDot: View
    private lateinit var followCheck: SquareCheckView
    private var autoScroll = true

    private val checks = LinkedHashMap<String, SquareCheckView>()

    private lateinit var store: ProfileStore
    private var profiles = mutableListOf<Profile>()
    private var profile: Profile? = null
    private var pendingProfileId = -1L

    private var lastRx = 0L
    private var lastTx = 0L
    private var logPending = false
    private var lastButtonLabel: String? = null
    private var lastStatus: String? = null

    /**
     * Jendela log yang sedang terpasang di layar. Dipakai untuk menambah baris
     * baru saja, bukan membangun ulang 180 baris setiap kali log bertambah —
     * pembangunan ulang itulah yang membuat tab LOG tersendat saat menyambung.
     */
    private var renderedTotal = -1
    private var renderedStart = 0

    private val handler = Handler(Looper.getMainLooper())
    private val ticker = object : Runnable {
        override fun run() {
            renderMetrics()
            handler.postDelayed(this, 1000L)
        }
    }
    private val logRenderer = Runnable {
        logPending = false
        if (tab == TAB_LOG) renderLog()
    }

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun box(
        fill: Int,
        radius: Int = R_PANEL,
        stroke: Int = 0,
        strokeWidth: Float = 1f
    ) = GradientDrawable().apply {
        cornerRadius = dp(radius).toFloat()
        setColor(fill)
        if (stroke != 0) setStroke(Face.linePx(this@MainActivity, strokeWidth).toInt(), stroke)
    }

    private fun rule(color: Int = HAIR) = View(this).apply { setBackgroundColor(color) }

    private fun lp(top: Int = 0) = LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun horizontal(gravity: Int = Gravity.CENTER_VERTICAL) =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            this.gravity = gravity
        }

    /** Teks antarmuka: Roboto, ukuran dibulatkan ke piksel utuh. */
    private fun uiText(
        text: String,
        size: Float,
        color: Int = INK,
        medium: Boolean = false
    ) = TextView(this).apply {
        this.text = text
        typeface = if (medium) Face.proseMedium(this@MainActivity) else Face.prose(this@MainActivity)
        inkSize(size)
        setTextColor(color)
    }

    /** Data: Roboto Mono, tabular dan tidak meloncat antarsekon. */
    private fun monoText(text: String, size: Float, color: Int = INK) =
        TextView(this).apply {
            this.text = text
            typeface = Face.mono(this@MainActivity)
            inkSize(size, mono = true)
            setTextColor(color)
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
            includeFontPadding = false
        }

    // ------------------------------------------------------------------ layout
    private fun buildUi(): View {
        root = FrameLayout(this).apply { setBackgroundColor(BG) }

        val column = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
        }
        column.addView(appBar(), LinearLayout.LayoutParams(-1, dp(56)))
        column.addView(tabBar(), LinearLayout.LayoutParams(-1, -2))

        val area = FrameLayout(this)
        sshPanel = buildSshPanel()
        logPanel = buildLogPanel()
        area.addView(sshPanel, FrameLayout.LayoutParams(-1, -1))
        area.addView(logPanel, FrameLayout.LayoutParams(-1, -1))
        logPanel.visibility = View.GONE
        column.addView(area, LinearLayout.LayoutParams(-1, 0, 1f))

        root.addView(column, FrameLayout.LayoutParams(-1, -1))

        scrim = View(this).apply {
            setBackgroundColor(Color.argb(150, 0, 0, 0))
            visibility = View.GONE
            isClickable = true
            contentDescription = "Tutup menu"
            setOnClickListener { closeDrawer() }
        }
        root.addView(scrim, FrameLayout.LayoutParams(-1, -1))

        drawerWidth = minOf(dp(320), (resources.displayMetrics.widthPixels * 0.86f).toInt())
        drawer = buildDrawer()
        root.addView(
            drawer,
            FrameLayout.LayoutParams(drawerWidth, -1, Gravity.START)
        )
        drawer.translationX = -drawerWidth.toFloat()
        drawer.visibility = View.GONE

        return root
    }

    /** Bilah atas: menu di kiri, judul dua warna di tengah. */
    private fun appBar(): View {
        val bar = horizontal().apply {
            setPadding(dp(4), 0, dp(4), 0)
            setBackgroundColor(BG)
        }
        bar.addView(
            iconButton(R.drawable.ic_menu, "Buka menu") { openDrawer() },
            LinearLayout.LayoutParams(dp(48), dp(48))
        )

        val title = horizontal().apply { setPadding(dp(4), 0, 0, 0) }
        title.addView(uiText("Wanz", 22f, ACCENT, medium = true))
        title.addView(
            uiText("Tunnel", 22f, INK).apply { setPadding(dp(6), 0, 0, 0) }
        )
        bar.addView(title, LinearLayout.LayoutParams(0, -2, 1f))
        return bar
    }

    /** Dua tab dengan garis bawah 3dp yang meluncur ke tab aktif — perilaku
     *  TabLayout pada acuan, dengan easing emphasized Material 3. */
    private fun tabBar(): View {
        val wrap = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
        }
        val row = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }

        fun cell(label: String, which: Int): LinearLayout {
            val cell = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                minimumHeight = dp(48)
                isClickable = true
                isFocusable = true
                contentDescription = if (which == TAB_SSH) "Tab SSH" else "Tab log"
                background = ripple()
                setOnClickListener { selectTab(which) }
            }
            val text = uiText(label, 15f, MUTED, medium = true).apply { gravity = Gravity.CENTER }
            cell.addView(text, LinearLayout.LayoutParams(-1, -2))
            if (which == TAB_SSH) tabSsh = text else tabLog = text
            return cell
        }

        row.addView(cell("SSH", TAB_SSH), LinearLayout.LayoutParams(0, -1, 1f))
        row.addView(cell("LOG", TAB_LOG), LinearLayout.LayoutParams(0, -1, 1f))

        // Satu garis aktif bersama: digeser antar tab, bukan nyala-mati.
        val track = FrameLayout(this)
        track.addView(row, FrameLayout.LayoutParams(-1, dp(48)))
        tabIndicator = View(this).apply { setBackgroundColor(ACCENT) }
        track.addView(
            tabIndicator,
            FrameLayout.LayoutParams(-1, dp(3), Gravity.BOTTOM)
        )
        wrap.addView(track, LinearLayout.LayoutParams(-1, dp(48)))
        wrap.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        return wrap
    }

    // -------------------------------------------------------------- tab SSH
    private fun buildSshPanel(): ScrollView {
        val scroll = ScrollView(this).apply {
            setBackgroundColor(BG)
            isVerticalScrollBarEnabled = false
            clipToPadding = false
        }
        val body = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), dp(16), dp(20), dp(24))
        }
        sshBody = body

        // Profil aktif: ketuk untuk memilih profil lain.
        val profileRow = horizontal().apply {
            minimumHeight = dp(48)
            isClickable = true
            contentDescription = "Pilih profil"
            background = ripple()
            setOnClickListener { profileDialog() }
        }
        nameLabel = uiText("Server 1", 17f, INK, medium = true).apply {
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        profileRow.addView(nameLabel, LinearLayout.LayoutParams(0, -2, 1f))
        transportLabel = monoText("SSH · VPN", 10.5f, ACCENT).apply { gravity = Gravity.END }
        profileRow.addView(transportLabel, LinearLayout.LayoutParams(-2, -2))
        body.addView(profileRow)

        // Bidang ringkas: satu baris yang mengatur host, port, user, dan sandi.
        val caption = monoText("Server", 10.5f, FAINT).apply {
            letterSpacing = 0.12f
            setPadding(0, dp(8), 0, 0)
        }
        body.addView(caption)

        compactUnderline = FieldUnderline(HAIR, Face.linePx(this, 1f))
        compactField = EditText(this).apply {
            hint = "ip:port@user:pass"
            setHintTextColor(FAINT)
            setTextColor(INK)
            typeface = Face.mono(this@MainActivity)
            inkSize(14.5f, mono = true)
            setPadding(0, dp(10), 0, dp(10))
            background = compactUnderline
            isSingleLine = true
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
            imeOptions = EditorInfo.IME_ACTION_DONE
            contentDescription = "Server, format ip port user sandi"
            setOnFocusChangeListener { _, hasFocus ->
                compactUnderline.setColor(if (hasFocus) ACCENT else HAIR)
                if (!hasFocus) saveCompactField(false)
            }
            setOnEditorActionListener { _, actionId, _ ->
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    saveCompactField(true)
                    hideKeyboard()
                    true
                } else {
                    false
                }
            }
        }
        body.addView(compactField, LinearLayout.LayoutParams(-1, dp(50)))

        body.addView(
            uiText("Port dan akun boleh menyusul di baris ini.", 11.5f, FAINT).apply {
                setPadding(0, dp(6), 0, 0)
            }
        )

        // Kisi centang dua kolom, delapan opsi yang semuanya tersambung ke profil.
        body.addView(
            monoText("Opsi", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(22), 0, dp(2))
            }
        )
        body.addView(checkGrid(), lp(2))

        connectButton = TextView(this).apply {
            text = "HUBUNGKAN"
            gravity = Gravity.CENTER
            typeface = Face.proseMedium(this@MainActivity)
            inkSize(15f)
            setTextColor(ACCENT)
            background = ripple(box(0, R_PANEL, ACCENT, 1.5f))
            isClickable = true
            isFocusable = true
            contentDescription = "Hubungkan tunnel"
            minimumHeight = dp(56)
            setOnClickListener { toggleTunnel() }
        }
        // Tekanan jari terasa: tombol mengecil sedikit lalu pulih.
        Anim.pressScale(connectButton)
        body.addView(connectButton, LinearLayout.LayoutParams(-1, dp(56)).apply { topMargin = dp(24) })

        statusText = uiText("Belum tersambung.", 12f, MUTED).apply {
            maxLines = 2
            setLineSpacing(dp(2).toFloat(), 1f)
        }
        body.addView(statusText, lp(8))

        body.addView(metricsRow(), lp(14))

        scroll.addView(body, ViewGroup.LayoutParams(-1, -2))
        return scroll
    }

    private data class CheckCell(
        val key: String,
        val label: String,
        val read: (Profile) -> Boolean,
        val write: (Profile, Boolean) -> Profile
    )

    private fun checkGrid(): View {
        val grid = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        val cells = listOf(
            CheckCell("payload", "Pakai payload",
                { it.usePayload }, { p, v -> p.copy(usePayload = v) }),
            CheckCell("ssl", "SSL",
                { sslOn(it) }, { p, v -> withSsl(p, v) }),
            CheckCell("ws", "WebSocket",
                { wsOn(it) }, { p, v -> withWs(p, v) }),
            CheckCell("verify", "Verifikasi TLS",
                { it.strictTls }, { p, v -> p.copy(strictTls = v) }),
            CheckCell("dns", "DNS lewat tunnel",
                { it.mappedDns }, { p, v -> p.copy(mappedDns = v) }),
            CheckCell("autoping", "Ping otomatis",
                { it.autoPing }, { p, v -> p.copy(autoPing = v) }),
            CheckCell("reconnect", "Sambung ulang",
                { it.autoReconnect }, { p, v -> p.copy(autoReconnect = v) }),
            CheckCell("mobile", "Seluler saja",
                { it.onlyMobileData }, { p, v -> p.copy(onlyMobileData = v) }),
            CheckCell("slowdns", "SlowDNS",
                { it.slowdns }, { p, v -> p.copy(slowdns = v) })
        )

        cells.chunked(2).forEach { pair ->
            val row = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
            pair.forEachIndexed { index, cell ->
                val tick = SquareCheckView(this)
                checks[cell.key] = tick
                val label = uiText(cell.label, 14.5f, INK)

                val holder = LinearLayout(this).apply {
                    orientation = LinearLayout.HORIZONTAL
                    gravity = Gravity.CENTER_VERTICAL
                    minimumHeight = dp(48)
                    isClickable = true
                    isFocusable = true
                    background = ripple()
                    contentDescription = cell.label
                    setOnClickListener {
                        val active = profile ?: return@setOnClickListener
                        tick.checked = !tick.checked
                        performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                        commitProfile(cell.write(active, tick.checked))
                        syncChecks()
                        // SlowDNS baru dicentang tanpa konfigurasi: buka
                        // langsung dialognya supaya tidak menyambung kosong.
                        if (cell.key == "slowdns" && tick.checked &&
                            profile?.slowdnsDomain?.isBlank() == true
                        ) {
                            slowDnsDialog()
                        }
                    }
                }
                holder.addView(
                    tick,
                    LinearLayout.LayoutParams(dp(24), dp(24)).apply { rightMargin = dp(12) }
                )
                holder.addView(label, LinearLayout.LayoutParams(0, -2, 1f))
                row.addView(
                    holder,
                    LinearLayout.LayoutParams(0, dp(48), 1f).apply {
                        if (index == 0) rightMargin = dp(12)
                    }
                )
            }
            if (pair.size == 1) {
                row.addView(View(this), LinearLayout.LayoutParams(0, dp(1), 1f))
            }
            grid.addView(row)
        }
        return grid
    }

    /**
     * Kartu statistik mengikuti beranda HTTP Custom terbaru: panah ↓/↑ dengan
     * angka besar, kecepatan sesaat di bawahnya, lalu satu baris status +
     * ping. Bentuknya kartu bergaris tipis, bukan tabel tiga kolom — angka
     * total dan kecepatan jadi lebih mudah dibaca sekilas.
     */
    private fun metricsRow(): View {
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = box(PANEL, R_PANEL, HAIR, 1f)
            setPadding(dp(16), dp(12), dp(16), 0)
        }

        rxText = monoText("—", 18f)
        rxSub = monoText("belum ada", 10f, FAINT)
        txText = monoText("—", 18f)
        txSub = monoText("belum ada", 10f, FAINT)
        upText = monoText("—", 12.5f, MUTED)
        upSub = monoText("ping belum diuji", 11f, FAINT)

        fun arrow(res: Int) = ImageView(this).apply {
            setImageResource(res)
            imageTintList = ColorStateList.valueOf(ACCENT)
            scaleType = ImageView.ScaleType.FIT_CENTER
        }

        fun block(
            label: String,
            icon: Int,
            value: TextView,
            sub: TextView,
            alignEnd: Boolean
        ): View {
            val col = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                gravity = if (alignEnd) Gravity.END else Gravity.START
            }
            val head = horizontal().apply {
                gravity = Gravity.CENTER_VERTICAL or
                    (if (alignEnd) Gravity.END else Gravity.START)
            }
            head.addView(arrow(icon), LinearLayout.LayoutParams(dp(14), dp(14)))
            head.addView(
                uiText(label, 11f, ACCENT, medium = true).apply {
                    letterSpacing = 0.06f
                    setPadding(dp(6), 0, 0, 0)
                }
            )
            col.addView(head)
            col.addView(
                value,
                LinearLayout.LayoutParams(-2, -2).apply { topMargin = dp(4) }
            )
            col.addView(
                sub,
                LinearLayout.LayoutParams(-2, -2).apply { topMargin = dp(1) }
            )
            return col
        }

        val top = LinearLayout(this).apply { orientation = LinearLayout.HORIZONTAL }
        top.addView(
            block("Unduh", R.drawable.ic_arrow_downward, rxText, rxSub, false),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        top.addView(
            block("Unggah", R.drawable.ic_arrow_upward, txText, txSub, true),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        card.addView(top)

        card.addView(
            rule(),
            LinearLayout.LayoutParams(-1, Face.linePx(this, 1f).toInt()).apply { topMargin = dp(10) }
        )

        // Baris bawah: titik status + durasi di kiri, globe + ping di kanan.
        // Seluruh baris tetap target sentuh 48dp untuk ping manual.
        val foot = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            minimumHeight = dp(48)
            isClickable = true
            isFocusable = true
            contentDescription = "Ping sekarang"
            background = ripple()
            setOnClickListener { sendPing() }
        }
        metricsDot = View(this).apply { background = box(FAINT, 4) }
        foot.addView(
            metricsDot,
            LinearLayout.LayoutParams(dp(8), dp(8)).apply { rightMargin = dp(8) }
        )
        foot.addView(uiText("Durasi", 11f, MUTED).apply { letterSpacing = 0.06f })
        foot.addView(
            upText,
            LinearLayout.LayoutParams(-2, -2).apply { leftMargin = dp(8) }
        )
        foot.addView(View(this), LinearLayout.LayoutParams(0, 0, 1f))
        foot.addView(
            ImageView(this).apply {
                setImageResource(R.drawable.ic_public)
                imageTintList = ColorStateList.valueOf(FAINT)
                scaleType = ImageView.ScaleType.FIT_CENTER
            },
            LinearLayout.LayoutParams(dp(14), dp(14)).apply { rightMargin = dp(6) }
        )
        foot.addView(upSub)
        card.addView(foot, LinearLayout.LayoutParams(-1, dp(48)))
        return card
    }

    // -------------------------------------------------------------- tab LOG
    private fun buildLogPanel(): LinearLayout {
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(BG)
        }
        val bar = horizontal().apply {
            setPadding(dp(16), 0, dp(8), 0)
            minimumHeight = dp(48)
        }

        followCheck = SquareCheckView(this).apply {
            checked = true
            contentDescription = "Ikuti log baru"
        }
        val follow = horizontal().apply {
            minimumHeight = dp(48)
            isClickable = true
            isFocusable = true
            contentDescription = "Ikuti log baru"
            background = ripple()
            setOnClickListener {
                followCheck.checked = !followCheck.checked
                autoScroll = followCheck.checked
                if (autoScroll) {
                    logScroll.post { logScroll.fullScroll(View.FOCUS_DOWN) }
                }
            }
        }
        follow.addView(
            followCheck,
            LinearLayout.LayoutParams(dp(24), dp(24)).apply { rightMargin = dp(12) }
        )
        follow.addView(uiText("Ikuti", 13f, MUTED), LinearLayout.LayoutParams(-2, -2))
        bar.addView(follow, LinearLayout.LayoutParams(-2, dp(48)))

        bar.addView(View(this), LinearLayout.LayoutParams(0, 0, 1f))
        bar.addView(
            iconButton(R.drawable.ic_content_copy, "Salin log") { copyLog() },
            LinearLayout.LayoutParams(dp(48), dp(48))
        )
        bar.addView(
            iconButton(R.drawable.ic_delete, "Bersihkan log") { clearLog() },
            LinearLayout.LayoutParams(dp(48), dp(48))
        )
        panel.addView(bar, LinearLayout.LayoutParams(-1, dp(48)))
        panel.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))

        logScroll = ScrollView(this).apply {
            isVerticalScrollBarEnabled = false
            clipToPadding = false
        }
        logList = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(0, dp(2), 0, dp(24))
        }
        logScroll.addView(logList, ViewGroup.LayoutParams(-1, -2))
        panel.addView(logScroll, LinearLayout.LayoutParams(-1, 0, 1f))
        return panel
    }

    private fun renderLog() {
        val entries = TunnelLog.all()
        val total = entries.size
        if (total == 0) {
            if (renderedTotal != 0) {
                logList.removeAllViews()
                logList.addView(
                    uiText("Belum ada log. Hubungkan tunnel untuk melihat aktivitas.", 13f, FAINT)
                        .apply { setPadding(dp(20), dp(20), dp(20), dp(20)) }
                )
                renderedTotal = 0
                renderedStart = 0
            }
            return
        }
        val start = (total - 180).coerceAtLeast(0)
        val rebuild = renderedTotal < 0 || renderedTotal == 0 || total < renderedTotal ||
            start < renderedStart
        if (rebuild) {
            logList.removeAllViews()
            renderedStart = start
            renderedTotal = start
        } else if (start > renderedStart) {
            // Jendela bergeser: buang pasangan baris+garis paling atas.
            var drop = start - renderedStart
            while (drop-- > 0 && logList.childCount >= 2) {
                logList.removeViewAt(0)
                logList.removeViewAt(0)
            }
            renderedStart = start
        }
        for (i in renderedTotal until total) addLogLine(entries[i])
        renderedTotal = total
        if (autoScroll) {
            logScroll.post { logScroll.fullScroll(View.FOCUS_DOWN) }
        }
    }

    private fun addLogLine(entry: TunnelLog.Entry) {
        val line = TextView(this).apply {
            text = entry.toSpanned()
            typeface = Face.mono(this@MainActivity)
            inkSize(12f, mono = true)
            setLineSpacing(dp(4).toFloat(), 1f)
            setPadding(dp(18), dp(8), dp(18), dp(8))
        }
        logList.addView(line, LinearLayout.LayoutParams(-1, -2))
        logList.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        // Baris baru meluncur masuk dari bawah, pelan dan singkat.
        if (Anim.on(this)) {
            line.alpha = 0f
            line.translationY = dp(8).toFloat()
            line.animate().alpha(1f).translationY(0f).setDuration(170L)
                .setInterpolator(Anim.fastOutSlowIn)
                .start()
        }
    }

    // ---------------------------------------------------------------- drawer
    private fun buildDrawer(): ScrollView {
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(PANEL)
            setPadding(0, dp(22), 0, dp(28))
        }

        val head = horizontal().apply { setPadding(dp(20), 0, dp(20), 0) }
        head.addView(HexLogoView(this), LinearLayout.LayoutParams(dp(64), dp(64)))
        val names = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(14), 0, 0, 0)
        }
        val brand = horizontal()
        brand.addView(uiText("Wanz", 20f, ACCENT, medium = true))
        brand.addView(
            uiText("Tunnel", 20f, INK, medium = true).apply { setPadding(dp(5), 0, 0, 0) }
        )
        names.addView(brand)
        names.addView(
            monoText("v" + BuildConfig.VERSION_NAME + " · koneksi pribadi", 10f, FAINT)
                .apply { setPadding(0, dp(4), 0, 0) }
        )
        head.addView(names, LinearLayout.LayoutParams(0, -2, 1f))
        panel.addView(head)
        panel.addView(
            rule(),
            LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(18) }
        )

        panel.addView(groupLabel("Utilitas"))
        panel.addView(drawerRow(R.drawable.ic_account_circle, "Profil") { profileDialog() })
        panel.addView(drawerRow(R.drawable.ic_receipt_long, "Payload") { payloadDialog() })
        panel.addView(drawerRow(R.drawable.ic_dns, "Proxy") { proxyDialog() })
        panel.addView(drawerRow(R.drawable.ic_language, "SlowDNS") { slowDnsDialog() })
        panel.addView(drawerRow(R.drawable.ic_brightness_6, "Tema") { themeDialog() })

        panel.addView(groupLabel("Alat"))
        panel.addView(drawerRow(R.drawable.ic_info, "Tentang") { aboutDialog() })

        panel.addView(View(this), LinearLayout.LayoutParams(0, 0, 1f))
        panel.addView(
            monoText("Wanz Tunnel v" + BuildConfig.VERSION_NAME, 10f, FAINT).apply {
                setPadding(dp(20), dp(10), dp(20), 0)
            }
        )
        return ScrollView(this).apply {
            setBackgroundColor(PANEL)
            isVerticalScrollBarEnabled = false
            isFillViewport = true
            addView(panel, ViewGroup.LayoutParams(-1, -2))
        }
    }

    private fun groupLabel(text: String) = monoText(text, 10.5f, FAINT).apply {
        letterSpacing = 0.12f
        setPadding(dp(20), dp(16), dp(20), dp(4))
    }

    private fun drawerRow(icon: Int, label: String, onTap: () -> Unit) =
        horizontal().apply {
            setPadding(dp(20), 0, dp(20), 0)
            minimumHeight = dp(48)
            isClickable = true
            isFocusable = true
            background = ripple()
            contentDescription = label
            setOnClickListener {
                closeDrawer()
                onTap()
            }
            addView(iconView(icon, 20, MUTED), LinearLayout.LayoutParams(dp(20), dp(20)))
            addView(
                uiText(label, 15f, INK).apply { setPadding(dp(16), 0, 0, 0) },
                LinearLayout.LayoutParams(0, -2, 1f)
            )
        }

    private fun openDrawer() {
        if (drawerOpen) return
        drawerOpen = true
        drawer.visibility = View.VISIBLE
        scrim.visibility = View.VISIBLE
        val duration = if (Face.reducedMotion(this)) 0L else 200L
        drawer.translationX = -drawerWidth.toFloat()
        drawer.animate().translationX(0f).setDuration(duration)
            .setInterpolator(Anim.emphasizedDecelerate)
            .start()
        scrim.alpha = 0f
        scrim.animate().alpha(1f).setDuration(duration).start()
    }

    private fun closeDrawer() {
        if (!drawerOpen) return
        drawerOpen = false
        val duration = if (Face.reducedMotion(this)) 0L else 180L
        drawer.animate().translationX(-drawerWidth.toFloat()).setDuration(duration)
            .setInterpolator(Anim.emphasizedAccelerate)
            .withEndAction { drawer.visibility = View.GONE }.start()
        scrim.animate().alpha(0f).setDuration(duration)
            .withEndAction { scrim.visibility = View.GONE }.start()
    }

    // ------------------------------------------------------------------ tab
    private fun selectTab(which: Int) {
        saveCompactField(false)
        if (which != TAB_SSH) hideKeyboard()
        val same = tab == which && sshPanel.visibility == View.VISIBLE == (which == TAB_SSH)
        tab = which
        tabSsh.setTextColor(if (which == TAB_SSH) ACCENT else MUTED)
        tabLog.setTextColor(if (which == TAB_LOG) ACCENT else MUTED)
        if (which == TAB_LOG) renderLog()
        slideTabIndicator()

        val incoming = if (which == TAB_SSH) sshPanel else logPanel
        val outgoing = if (which == TAB_SSH) logPanel else sshPanel
        if (same) return
        incoming.animate().cancel()
        outgoing.animate().cancel()
        if (Face.reducedMotion(this)) {
            incoming.alpha = 1f
            incoming.visibility = View.VISIBLE
            outgoing.alpha = 1f
            outgoing.visibility = View.GONE
            return
        }
        // Halaman masuk berada di atas lalu memudar masuk; halaman lama tetap
        // terlihat di bawahnya sampai transisi selesai, jadi tidak ada kedipan.
        incoming.bringToFront()
        incoming.alpha = 0f
        incoming.visibility = View.VISIBLE
        incoming.animate().alpha(1f).setDuration(160L).start()
        outgoing.animate().alpha(0f).setDuration(120L).withEndAction {
            if (outgoing !== incoming) {
                outgoing.visibility = View.GONE
                outgoing.alpha = 1f
            }
        }.start()
    }

    /** Garis aktif tab meluncur ke posisi tab terpilih (fast_out_slow_in). */
    private fun slideTabIndicator() {
        if (!::tabIndicator.isInitialized) return
        tabIndicator.post {
            val target = if (tab == TAB_SSH) 0f else tabIndicator.width / 2f
            if (!Anim.on(this)) {
                tabIndicator.translationX = target
                return@post
            }
            tabIndicator.animate().translationX(target).setDuration(250L)
                .setInterpolator(Anim.fastOutSlowIn)
                .start()
        }
    }

    // ------------------------------------------------------------- profil UI
    private fun sslOn(p: Profile) = p.transport == "tls" || p.transport == "wss"

    private fun wsOn(p: Profile) = p.transport == "ws" || p.transport == "wss"

    private fun withSsl(p: Profile, on: Boolean): Profile {
        val transport = when {
            on && wsOn(p) -> "wss"
            on -> "tls"
            wsOn(p) -> "ws"
            else -> "ssh"
        }
        return p.copy(transport = transport)
    }

    private fun withWs(p: Profile, on: Boolean): Profile {
        val transport = when {
            on && sslOn(p) -> "wss"
            on -> "ws"
            sslOn(p) -> "tls"
            else -> "ssh"
        }
        return p.copy(transport = transport)
    }

    private fun transportText(p: Profile): String {
        val base = when (p.transport) {
            "tls" -> "SSH + TLS"
            "ws" -> "SSH + WS"
            "wss" -> "SSH + TLS + WS"
            else -> "SSH"
        }
        val slow = if (p.slowdns) " + SlowDNS" else ""
        return "$base$slow · VPN"
    }

    private fun syncUi() {
        val p = profile
        if (p == null) {
            nameLabel.text = "Belum ada server"
            transportLabel.text = ""
            compactField.setText("")
            syncChecks()
            return
        }
        nameLabel.text = p.name.ifBlank { "Server ${p.id}" }
        transportLabel.text = transportText(p)
        val formatted = Compact.format(p)
        if (!compactField.hasFocus() && compactField.text.toString() != formatted) {
            compactField.setText(formatted)
        }
        syncChecks()
    }

    private fun syncChecks() {
        val p = profile ?: return
        // snapTo: status dari profil dipasang tanpa animasi; animasi hanya
        // untuk sentuhan pengguna di kisi.
        checks["payload"]?.snapTo(p.usePayload)
        checks["ssl"]?.snapTo(sslOn(p))
        checks["ws"]?.snapTo(wsOn(p))
        checks["verify"]?.snapTo(p.strictTls)
        checks["dns"]?.snapTo(p.mappedDns)
        checks["autoping"]?.snapTo(p.autoPing)
        checks["reconnect"]?.snapTo(p.autoReconnect)
        checks["mobile"]?.snapTo(p.onlyMobileData)
        checks["slowdns"]?.snapTo(p.slowdns)
    }

    private fun commitProfile(updated: Profile) {
        profile = updated
        val index = profiles.indexOfFirst { it.id == updated.id }
        if (index >= 0) profiles[index] = updated else profiles.add(updated)
        store.save(profiles, updated.id)
        nameLabel.text = updated.name.ifBlank { "Server ${updated.id}" }
        transportLabel.text = transportText(updated)
    }

    /**
     * Baca kembali bidang ringkas. Dipanggil saat fokus pindah, saat tombol
     * sambung ditekan, dan sebelum pindah layar. Baris yang tidak dikenali
     * dikembalikan ke bentuk profil supaya tidak diam-diam salah simpan.
     */
    private fun saveCompactField(showError: Boolean) {
        val p = profile ?: return
        val raw = compactField.text.toString().trim()
        if (raw.isEmpty()) return
        val cfg = Compact.parse(raw)
        if (cfg == null) {
            if (showError) {
                Toast.makeText(this, "Format belum dikenali. Contoh: host:port@user:pass",
                    Toast.LENGTH_SHORT).show()
            }
            if (!compactField.hasFocus()) compactField.setText(Compact.format(p))
            return
        }
        val updated = Compact.apply(p, cfg)
        if (updated != p) commitProfile(updated)
        if (!compactField.hasFocus()) compactField.setText(Compact.format(updated))
    }

    private fun reloadProfile() {
        profiles = store.load()
        if (profiles.isEmpty()) profiles.add(Profile(id = 1, name = "Server 1"))
        val activeId = store.activeId()
        profile = profiles.firstOrNull { it.id == activeId } ?: profiles.first()
    }

    private fun switchProfile(target: Profile) {
        saveCompactField(false)
        if (profile?.id == target.id) return
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            Toast.makeText(this, "Tunnel diputus karena ganti profil", Toast.LENGTH_SHORT).show()
        }
        store.save(profiles, target.id)
        profile = profiles.firstOrNull { it.id == target.id } ?: target
        syncUi()
        render()
    }

    private fun addProfile() {
        saveCompactField(false)
        val nextId = (profiles.maxOfOrNull { it.id } ?: 0L) + 1L
        val fresh = Profile(id = nextId, name = "Server ${profiles.size + 1}")
        profiles.add(fresh)
        store.save(profiles, fresh.id)
        profile = fresh
        syncUi()
        render()
        Toast.makeText(this, "Profil baru dibuat. Isi server di kolom Server.",
            Toast.LENGTH_SHORT).show()
        compactField.requestFocus()
    }

    // -------------------------------------------------------------- koneksi
    private fun toggleTunnel() {
        connectButton.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
        saveCompactField(false)
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            return
        }
        val p = profile ?: run { addProfile(); return }
        if (p.host.isBlank() || p.user.isBlank()) {
            Toast.makeText(this, "Isi server dulu: ip:port@user:pass", Toast.LENGTH_SHORT).show()
            compactField.requestFocus()
            return
        }
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

    private fun render() {
        val raw = TunnelService.status
        val state = when {
            raw.startsWith("Terhubung") -> Conn.CONNECTED
            raw.startsWith("Gagal") || raw.startsWith("VPN dicabut") -> Conn.ERROR
            TunnelService.running -> Conn.CONNECTING
            else -> Conn.IDLE
        }
        val noInternet = state == Conn.CONNECTED && raw.contains("internet gagal")

        val label = when (state) {
            Conn.CONNECTED -> "PUTUSKAN"
            Conn.CONNECTING -> "MENYAMBUNG…"
            Conn.ERROR -> "COBA LAGI"
            else -> "HUBUNGKAN"
        }
        connectButton.text = label
        val border = when (state) {
            Conn.CONNECTED -> ERR
            Conn.CONNECTING -> MUTED
            else -> ACCENT
        }
        connectButton.setTextColor(border)
        connectButton.background = ripple(box(0, R_PANEL, border, 1.5f))
        connectButton.contentDescription = when (state) {
            Conn.CONNECTED -> "Putuskan tunnel"
            Conn.ERROR -> "Coba hubungkan lagi"
            else -> "Hubungkan tunnel"
        }
        // Pantulan kecil saat label tombol berganti keadaan.
        if (label != lastButtonLabel) {
            lastButtonLabel = label
            if (Anim.on(this)) {
                connectButton.animate().cancel()
                connectButton.scaleX = 0.96f
                connectButton.scaleY = 0.96f
                connectButton.animate().scaleX(1f).scaleY(1f).setDuration(220L)
                    .setInterpolator(Anim.fastOutSlowIn)
                    .start()
            }
        }
        // Denyut lembut selagi menyambung; berhenti pada keadaan lain.
        if (state == Conn.CONNECTING) Anim.pulse(connectButton) else Anim.stopPulse(connectButton)

        val message = when {
            noInternet -> "Tunnel aktif, tetapi uji internet gagal. Periksa server atau payload."
            state == Conn.ERROR -> friendlyError(raw)
            state == Conn.CONNECTED ->
                raw.removePrefix("Terhubung").trim(' ', '·', '•')
                    .ifBlank { "Tunnel aktif · semua trafik lewat VPN." }
            state == Conn.CONNECTING -> raw
            else -> "Belum tersambung. Isi server lalu ketuk HUBUNGKAN."
        }
        if (message != lastStatus) {
            lastStatus = message
            statusText.text = message
            // Status baru memudar masuk, tidak muncul mendadak.
            if (Anim.on(this)) {
                statusText.animate().cancel()
                statusText.alpha = 0f
                statusText.animate().alpha(1f).setDuration(160L).start()
            }
        }
        statusText.setTextColor(
            when {
                noInternet -> WARN
                state == Conn.ERROR -> ERR
                state == Conn.CONNECTED -> OK
                else -> MUTED
            }
        )
        renderMetrics()
    }

    private fun renderMetrics() {
        val active = TunnelService.running && TunnelService.connectedAt > 0L
        (metricsDot.background as? GradientDrawable)?.setColor(if (active) OK else HAIR)
        if (!active) {
            lastRx = 0L
            lastTx = 0L
            rxText.text = "—"
            txText.text = "—"
            upText.text = "—"
            rxText.setTextColor(FAINT)
            txText.setTextColor(FAINT)
            upText.setTextColor(FAINT)
            rxSub.text = "belum ada"
            txSub.text = "belum ada"
            upSub.text = "ping belum diuji"
            upSub.setTextColor(FAINT)
            return
        }
        rxText.setTextColor(INK)
        txText.setTextColor(INK)
        upText.setTextColor(INK)

        val total = ((System.currentTimeMillis() - TunnelService.connectedAt) / 1000L)
            .coerceAtLeast(0L)
        val hh = total / 3600
        val mm = (total % 3600) / 60
        val ss = total % 60
        upText.text = if (hh > 0) "%02d:%02d:%02d".format(hh, mm, ss)
        else "%02d:%02d".format(mm, ss)
        upSub.text = if (TunnelService.pingMs >= 0) "ping ${TunnelService.pingMs} ms"
        else "ping belum diuji"
        upSub.setTextColor(if (TunnelService.pingMs >= 0) MUTED else FAINT)

        val rx = TunnelService.sessionRx()
        val tx = TunnelService.sessionTx()
        val rxDelta = (rx - lastRx).coerceAtLeast(0L)
        val txDelta = (tx - lastTx).coerceAtLeast(0L)
        lastRx = rx
        lastTx = tx
        rxText.text = fmtBytes(rx)
        txText.text = fmtBytes(tx)
        rxSub.text = fmtBytes(rxDelta) + "/s"
        txSub.text = fmtBytes(txDelta) + "/s"
    }

    private fun fmtBytes(v: Long): String {
        if (v < 1024) return "$v B"
        val kb = v / 1024.0
        if (kb < 1024) return fmtOne(kb) + " KB"
        val mb = kb / 1024.0
        if (mb < 1024) return fmtOne(mb) + " MB"
        return fmtOne(mb / 1024.0) + " GB"
    }

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

    private fun sendPing() {
        if (!TunnelService.running) {
            Toast.makeText(this, "Hubungkan dulu untuk ping", Toast.LENGTH_SHORT).show()
            return
        }
        startService(
            Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_PING)
        )
    }

    // -------------------------------------------------------------- dialog
    private fun themedBuilder(title: String?): AlertDialog.Builder {
        val theme = if (darkActive) R.style.WanzDialogDark else R.style.WanzDialogLight
        val builder = AlertDialog.Builder(this, theme)
        if (title != null) builder.setTitle(title)
        return builder
    }

    private fun dialogInput(value: String, hint: String, multiline: Boolean = false) =
        EditText(this).apply {
            setText(value)
            this.hint = hint
            setTextColor(INK)
            setHintTextColor(FAINT)
            typeface = Face.mono(this@MainActivity)
            inkSize(14f, mono = true)
            setPadding(0, dp(10), 0, dp(10))
            background = FieldUnderline(HAIR, Face.linePx(this@MainActivity, 1f))
            if (multiline) {
                minLines = 6
                gravity = Gravity.TOP or Gravity.START
                inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_MULTI_LINE
            } else {
                isSingleLine = true
                inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
            }
        }

    private fun dialogWrap(child: View, note: String? = null): LinearLayout =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(8), dp(22), dp(4))
            addView(child, LinearLayout.LayoutParams(-1, -2))
            if (note != null) {
                addView(
                    uiText(note, 12f, MUTED).apply { setPadding(0, dp(8), 0, 0) },
                    LinearLayout.LayoutParams(-1, -2)
                )
            }
        }

    private fun profileDialog() {
        saveCompactField(false)
        hideKeyboard()
        val names = profiles.map { it.name.ifBlank { "Server ${it.id}" } }.toMutableList()
        names.add("Ubah nama profil")
        names.add("Hapus profil")
        names.add("Tambah profil baru")
        val renameAt = profiles.size
        val deleteAt = profiles.size + 1
        val addAt = profiles.size + 2
        themedBuilder("Profil")
            .setItems(names.toTypedArray()) { _, which ->
                when (which) {
                    renameAt -> renameProfileDialog()
                    deleteAt -> deleteProfileDialog()
                    addAt -> addProfile()
                    else -> switchProfile(profiles[which])
                }
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun renameProfileDialog() {
        saveCompactField(false)
        val p = profile ?: return
        val input = dialogInput(p.name, "Nama profil")
        themedBuilder("Ubah nama profil")
            .setView(dialogWrap(input))
            .setPositiveButton("Simpan") { _, _ ->
                val name = input.text.toString().trim().ifBlank { "Server ${p.id}" }
                commitProfile(p.copy(name = name))
                syncUi()
                Toast.makeText(this, "Nama profil disimpan", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun deleteProfileDialog() {
        saveCompactField(false)
        val p = profile ?: return
        themedBuilder("Hapus profil")
            .setMessage("Hapus \"${p.name.ifBlank { "Server ${p.id}" }}\"? Tindakan ini tidak bisa dibatalkan.")
            .setPositiveButton("Hapus") { _, _ -> deleteProfile(p) }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun deleteProfile(target: Profile) {
        if (TunnelService.running) {
            startService(
                Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
            )
            Toast.makeText(this, "Tunnel diputus karena profil dihapus", Toast.LENGTH_SHORT).show()
        }
        profiles.removeAll { it.id == target.id }
        if (profiles.isEmpty()) profiles.add(Profile(id = 1, name = "Server 1"))
        val next = profiles.first()
        store.save(profiles, next.id)
        profile = next
        syncUi()
        render()
        Toast.makeText(this, "Profil dihapus", Toast.LENGTH_SHORT).show()
    }

    private fun payloadDialog() {
        saveCompactField(false)
        val p = profile ?: return
        val input = dialogInput(p.payload, "GET / HTTP/1.1", multiline = true)
        themedBuilder("Payload")
            .setView(dialogWrap(input, "Dipakai saat kotak Pakai payload dicentang."))
            .setPositiveButton("Terapkan") { _, _ ->
                commitProfile(p.copy(payload = input.text.toString()))
                syncChecks()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun proxyDialog() {
        saveCompactField(false)
        val p = profile ?: return
        val input = dialogInput(p.proxy, "host:port")
        themedBuilder("Proxy")
            .setView(
                dialogWrap(input, "Alamat proxy/edge sebelum server SSH. Kosongkan untuk langsung ke server.")
            )
            .setPositiveButton("Terapkan") { _, _ ->
                commitProfile(p.copy(proxy = input.text.toString().trim()))
                syncUi()
                Toast.makeText(this, "Proxy disimpan", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    /** Dialog pengaturan SlowDNS: aktif, resolver, domain, pubkey, tipe. */
    private fun slowDnsDialog() {
        saveCompactField(false)
        val p = profile ?: return
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(8), dp(22), dp(4))
        }

        // Baris aktif/nonaktif gaya kisi centang.
        val enableCheck = SquareCheckView(this).apply {
            checked = p.slowdns
            contentDescription = "Aktifkan SlowDNS"
        }
        val enableRow = horizontal().apply {
            minimumHeight = dp(44)
            isClickable = true
            isFocusable = true
            background = ripple()
            contentDescription = "Aktifkan SlowDNS"
            setOnClickListener {
                enableCheck.checked = !enableCheck.checked
                performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
            }
        }
        enableRow.addView(
            enableCheck,
            LinearLayout.LayoutParams(dp(24), dp(24)).apply { rightMargin = dp(12) }
        )
        enableRow.addView(uiText("Aktifkan SlowDNS", 14.5f, INK))
        box.addView(enableRow, lp(4))

        fun addField(label: String, value: String, hint: String): EditText {
            box.addView(
                monoText(label, 10.5f, FAINT).apply {
                    letterSpacing = 0.12f
                    setPadding(0, dp(12), 0, dp(2))
                }
            )
            val input = dialogInput(value, hint)
            box.addView(input, LinearLayout.LayoutParams(-1, -2))
            return input
        }

        val resolverInput = addField(
            "DNS RESOLVER", p.slowdnsResolver,
            "8.8.8.8 • https://dns.google/dns-query • tls://1.1.1.1"
        )
        val domainInput = addField("DOMAIN TUNNEL", p.slowdnsDomain, "tunnel.domain.com")
        val pubkeyInput = addField("PUBLIC KEY SERVER", p.slowdnsPubkey, "64 karakter heksadesimal")

        // Pilihan tipe record query: AUTO/NULL/TXT/CNAME/MX/NS/SRV.
        box.addView(
            monoText("TIPE RECORD", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(12), 0, dp(2))
            }
        )
        var selectedType = SlowDns.normalizeType(p.slowdnsType)
        val typeView = uiText(selectedType, 14f, INK).apply {
            background = ripple()
            isClickable = true
            isFocusable = true
            minimumHeight = dp(44)
            gravity = Gravity.CENTER_VERTICAL
            contentDescription = "Pilih tipe record SlowDNS"
            setOnClickListener {
                val current = SlowDns.TYPES.indexOf(selectedType).coerceAtLeast(0)
                themedBuilder("Tipe SlowDNS")
                    .setSingleChoiceItems(SlowDns.TYPES.toTypedArray(), current) { dialog, which ->
                        selectedType = SlowDns.TYPES[which]
                        text = selectedType
                        dialog.dismiss()
                    }
                    .setNegativeButton("Batal", null)
                    .show()
            }
        }
        box.addView(typeView, LinearLayout.LayoutParams(-1, -2))

        // Pengaturan lanjutan, sama seperti panel SlowDNS HTTP Custom.
        val qnameInput = addField(
            "BATAS QNAME (BYTE)",
            if (p.slowdnsQname == 0) "" else p.slowdnsQname.toString(),
            "0 = default (255)"
        )
        val ednsInput = addField(
            "BATAS EDNS0 (BYTE)",
            if (p.slowdnsEdns == 0) "" else p.slowdnsEdns.toString(),
            "0 = default (4096)"
        )
        val windowInput = addField(
            "KCP WINDOW",
            if (p.slowdnsWindow == 0) "" else p.slowdnsWindow.toString(),
            "0 = default (64)"
        )
        val sessionInput = addField(
            "JUMLAH SESI (1–8)",
            p.slowdnsSessions.toString(),
            "1 = satu sesi"
        )

        fun addToggle(label: String, checked: Boolean): SquareCheckView {
            val check = SquareCheckView(this).apply {
                this.checked = checked
                contentDescription = label
            }
            val row = horizontal().apply {
                minimumHeight = dp(44)
                isClickable = true
                isFocusable = true
                background = ripple()
                contentDescription = label
                setOnClickListener {
                    check.checked = !check.checked
                    performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
                }
            }
            row.addView(
                check,
                LinearLayout.LayoutParams(dp(24), dp(24)).apply { rightMargin = dp(12) }
            )
            row.addView(uiText(label, 14.5f, INK))
            box.addView(row, lp(4))
            return check
        }

        val multiLoginCheck = addToggle("Multi login (login terpisah per sesi)", p.slowdnsMultiLogin)
        val calibrateCheck = addToggle("Automatic calibration (uji QNAME/EDNS0)", p.slowdnsCalibrate)

        box.addView(
            uiText(
                "SSH disalurkan lewat terowongan DNS (dnstt). Resolver boleh UDP biasa, " +
                    "DoH (https://), atau DoT (tls://). Tipe NULL paling tahan cache; " +
                    "AUTO menguji sendiri tipe yang lolos. Batas QNAME/EDNS membantu " +
                    "pada jaringan yang memotong DNS besar. Sesi >1 hanya dipakai saat " +
                    "Multi login aktif; kalibrasi menguji batas sebelum menyambung.",
                12f, MUTED
            ).apply { setPadding(0, dp(12), 0, 0) }
        )

        // Validasi ditangani manual agar dialog tetap terbuka saat salah isi.
        val dialog = themedBuilder("SlowDNS")
            .setView(ScrollView(this).apply { addView(box) })
            .setPositiveButton("Terapkan", null)
            .setNegativeButton("Batal", null)
            .create()
        dialog.show()
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
            // Kosong = 0 (default pustaka); teks bukan angka = -1 agar validasi menolak.
            fun number(input: EditText): Int {
                val text = input.text.toString().trim()
                return if (text.isEmpty()) 0 else (text.toIntOrNull() ?: -1)
            }
            val updated = p.copy(
                slowdns = enableCheck.checked,
                slowdnsResolver = resolverInput.text.toString().trim(),
                slowdnsDomain = domainInput.text.toString().trim(),
                slowdnsPubkey = pubkeyInput.text.toString().trim(),
                slowdnsType = selectedType,
                slowdnsQname = number(qnameInput),
                slowdnsEdns = number(ednsInput),
                slowdnsWindow = number(windowInput),
                slowdnsSessions = number(sessionInput),
                slowdnsMultiLogin = multiLoginCheck.checked,
                slowdnsCalibrate = calibrateCheck.checked
            )
            val err = SlowDns.validate(updated)
            if (err != null) {
                Toast.makeText(this, err, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            commitProfile(updated)
            syncUi()
            dialog.dismiss()
            Toast.makeText(
                this,
                if (updated.slowdns) "SlowDNS diaktifkan" else "SlowDNS dimatikan",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun themeDialog() {
        themedBuilder("Tema")
            .setSingleChoiceItems(THEME_LABELS.toTypedArray(), AppPrefs.themeMode(this)) { dialog, which ->
                AppPrefs.setThemeMode(this, which)
                dialog.dismiss()
                recreate()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun aboutDialog() {
        val message = "Wanz Tunnel " + BuildConfig.VERSION_NAME + "\n\n" +
            "Klien SSH + VPN untuk Android. Semua trafik aplikasi masuk lewat " +
            "terowongan SSH, lalu diteruskan oleh tun2socks di dalam perangkat.\n\n" +
            "Lisensi: Roboto dan Roboto Mono (Apache 2.0), Material Icons " +
            "(Apache 2.0), JSch (BSD), hev-socks5-tunnel (Apache 2.0)."
        themedBuilder("Tentang")
            .setMessage(message)
            .setNeutralButton("Reset kunci host") { _, _ ->
                File(filesDir, "known_hosts").delete()
                Toast.makeText(this, "Kunci host direset", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Tutup", null)
            .show()
    }

    private fun copyLog() {
        val text = TunnelLog.snapshot().joinToString("\n")
        val cm = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        cm.setPrimaryClip(ClipData.newPlainText("WanzTunnel", text))
        Toast.makeText(this, "Log disalin", Toast.LENGTH_SHORT).show()
    }

    private fun clearLog() {
        themedBuilder("Bersihkan log")
            .setMessage("Hapus semua baris log sekarang?")
            .setPositiveButton("Bersihkan") { _, _ ->
                TunnelLog.clear()
                renderedTotal = -1
                renderedStart = 0
                renderLog()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(compactField.windowToken, 0)
        compactField.clearFocus()
    }

    // ------------------------------------------------------------- kehidupan
    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContentView(buildUi())

        store = ProfileStore(this)
        reloadProfile()
        syncUi()
        // Sambutan halus: blok-blok halaman SSH naik dan memudar masuk
        // berurutan sekali di awal (tidak diulang saat rotasi layar).
        if (b == null && Anim.on(this)) {
            sshBody.post {
                var delay = 40L
                for (i in 0 until sshBody.childCount) {
                    Anim.riseIn(sshBody.getChildAt(i), delay)
                    delay += 30L
                }
            }
        }
        selectTab(if (intent?.getStringExtra("tab") == "log") TAB_LOG else TAB_SSH)

        if (Build.VERSION.SDK_INT >= 33 &&
            checkSelfPermission("android.permission.POST_NOTIFICATIONS") !=
            PackageManager.PERMISSION_GRANTED
        ) {
            requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent?.getStringExtra("tab") == "log") selectTab(TAB_LOG)
    }

    override fun onResume() {
        super.onResume()
        TunnelService.onStatus = { runOnUiThread { render() } }
        TunnelLog.onChange = {
            if (!logPending) {
                logPending = true
                handler.postDelayed(logRenderer, 300L)
            }
        }
        reloadProfile()
        syncUi()
        render()
        if (tab == TAB_LOG) renderLog()
        handler.removeCallbacks(ticker)
        handler.post(ticker)
    }

    override fun onPause() {
        super.onPause()
        Anim.stopPulse(connectButton)
        TunnelService.onStatus = null
        TunnelLog.onChange = null
        handler.removeCallbacks(ticker)
        handler.removeCallbacks(logRenderer)
        logPending = false
        saveCompactField(false)
    }

    @Deprecated("Deprecated in Android")
    override fun onBackPressed() {
        if (drawerOpen) {
            closeDrawer()
            return
        }
        if (tab == TAB_LOG) {
            selectTab(TAB_SSH)
            return
        }
        super.onBackPressed()
    }

    private enum class Conn { IDLE, CONNECTING, CONNECTED, ERROR }

    companion object {
        private const val TAB_SSH = 0
        private const val TAB_LOG = 1
        private const val REQ_VPN = 1001
    }
}
