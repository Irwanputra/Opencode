package id.wanz.tunnel

import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
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
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import java.io.File
import java.util.Locale

/**
 * Beranda gaya "Wanz" — dirancang ulang dari mockup text-to-image
 * (Seedream 5.5; lihat `brand/PROMPTS.md`).
 *
 * Susunannya dari atas ke bawah: bilah atas berisi menu, ubin merek W, dan
 * judul "Wanz Tunnel"; kontrol tab berbentuk pil dengan pil hijau yang
 * meluncur; kartu Koneksi membulat berisi profil, isian server berbentuk
 * kotak, kisi centang dua kolom, dan tombol sambung hijau penuh; lalu kartu
 * statistik. Tab LOG menampilkan baris log dalam kartu kecil membulat.
 * Tidak ada menu tiga titik dan tidak ada tombol tambah mengambang: keduanya
 * pintasan yang tidak dipakai, dan semua tujuannya tetap ada di laci kiri.
 *
 * Yang tidak berubah: tunnel tetap SSH + VPN, format isian `ip:port@user:pass`
 * tetap dipakai, dan semua angka memakai Roboto Mono dengan piksel utuh
 * supaya tidak bergetar.
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
    private lateinit var connectButton: TextView
    private lateinit var statusText: TextView
    private lateinit var statusDot: View
    private lateinit var livePill: TextView
    private lateinit var rxText: TextView
    private lateinit var txText: TextView
    private lateinit var upText: TextView
    private lateinit var rxSub: TextView
    private lateinit var txSub: TextView
    private lateinit var upSub: TextView
    private lateinit var metricsDot: View
    private lateinit var followChip: TextView
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

    /** Ikon kecil untuk drawable komposit TextView, diwarnai token aktif. */
    private fun drawableIcon(res: Int, sizeDp: Int, tint: Int): Drawable =
        resources.getDrawable(res, theme).mutate().apply {
            setTint(tint)
            setBounds(0, 0, dp(sizeDp), dp(sizeDp))
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

    /** Bilah atas: menu di kiri, lalu ubin merek W dan judul dua warna. */
    private fun appBar(): View {
        val bar = horizontal().apply {
            setPadding(dp(4), 0, dp(4), 0)
            setBackgroundColor(BG)
        }
        bar.addView(
            iconButton(R.drawable.ic_menu, "Buka menu") { openDrawer() },
            LinearLayout.LayoutParams(dp(48), dp(48))
        )

        val title = horizontal().apply { setPadding(dp(8), 0, 0, 0) }
        title.addView(brandTile(30), LinearLayout.LayoutParams(dp(30), dp(30)))
        title.addView(
            uiText("Wanz", 21f, ACCENT, medium = true).apply { setPadding(dp(10), 0, 0, 0) }
        )
        title.addView(
            uiText("Tunnel", 21f, INK).apply { setPadding(dp(6), 0, 0, 0) }
        )
        bar.addView(title, LinearLayout.LayoutParams(0, -2, 1f))
        return bar
    }

    /** Dua tab dalam wadah pil: pil hijau meluncur ke tab aktif. */
    private fun tabBar(): View {
        val wrap = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(12), dp(16), dp(8))
        }
        val track = FrameLayout(this).apply {
            background = box(0, R_PILL, HAIR, 1f)
        }

        // Pil aktif di belakang label; digeser antar tab, bukan nyala-mati.
        tabIndicator = View(this).apply { background = box(ACCENT, R_PILL) }
        track.addView(
            tabIndicator,
            FrameLayout.LayoutParams(-1, -1).apply { setMargins(dp(4), dp(4), dp(4), dp(4)) }
        )

        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(dp(4), 0, dp(4), 0)
        }

        fun cell(label: String, which: Int): LinearLayout {
            val cell = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                minimumHeight = dp(44)
                isClickable = true
                isFocusable = true
                contentDescription = if (which == TAB_SSH) "Tab SSH" else "Tab log"
                background = ripple()
                setOnClickListener { selectTab(which) }
            }
            val text = uiText(label, 14.5f, MUTED, medium = true).apply { gravity = Gravity.CENTER }
            cell.addView(text, LinearLayout.LayoutParams(-1, -2))
            if (which == TAB_SSH) tabSsh = text else tabLog = text
            return cell
        }

        row.addView(cell("SSH", TAB_SSH), LinearLayout.LayoutParams(0, -1, 1f))
        row.addView(cell("LOG", TAB_LOG), LinearLayout.LayoutParams(0, -1, 1f))
        track.addView(
            row,
            FrameLayout.LayoutParams(-1, dp(44), Gravity.CENTER)
        )
        wrap.addView(track, LinearLayout.LayoutParams(-1, dp(52)))

        // Pil aktif selebar satu sel; lebarnya baru pasti setelah track diukur.
        tabIndicator.post {
            tabIndicator.layoutParams = FrameLayout.LayoutParams(
                tabIndicator.width / 2, FrameLayout.LayoutParams.MATCH_PARENT
            ).apply { setMargins(dp(4), dp(4), dp(4), dp(4)) }
            slideTabIndicator()
        }
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
            setPadding(dp(16), dp(12), dp(16), dp(24))
        }
        sshBody = body

        // Kartu Koneksi: profil, isian server, opsi, dan tombol sambung.
        val card = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            background = box(PANEL, R_PANEL, HAIR, 1f)
            setPadding(dp(16), dp(12), dp(16), dp(16))
        }
        body.addView(card, LinearLayout.LayoutParams(-1, -2))

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
        transportLabel = monoText("SSH · VPN", 10.5f, ACCENT).apply {
            gravity = Gravity.CENTER
            background = box(0, R_PILL, HAIR, 1f)
            setPadding(dp(10), dp(4), dp(10), dp(4))
        }
        profileRow.addView(
            transportLabel,
            LinearLayout.LayoutParams(-2, -2).apply { leftMargin = dp(12) }
        )
        card.addView(profileRow)

        // Bidang ringkas: satu baris yang mengatur host, port, user, dan sandi.
        card.addView(
            monoText("Server", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(12), 0, dp(6))
            }
        )

        val hair = Face.linePx(this, 1f).toInt()
        compactField = EditText(this).apply {
            hint = "ip:port@user:pass"
            setHintTextColor(FAINT)
            setTextColor(INK)
            typeface = Face.mono(this@MainActivity)
            inkSize(14f, mono = true)
            setPadding(dp(14), dp(12), dp(14), dp(12))
            background = box(FIELD, R_FIELD, HAIR, 1f)
            isSingleLine = true
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
            imeOptions = EditorInfo.IME_ACTION_DONE
            contentDescription = "Server, format ip port user sandi"
            setCompoundDrawables(drawableIcon(R.drawable.ic_dns, 18, MUTED), null, null, null)
            compoundDrawablePadding = dp(10)
            setOnFocusChangeListener { _, hasFocus ->
                (background as? GradientDrawable)?.setStroke(
                    hair, if (hasFocus) ACCENT else HAIR
                )
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
        card.addView(compactField, LinearLayout.LayoutParams(-1, dp(52)))

        card.addView(
            uiText("Port dan akun boleh menyusul di baris ini.", 11.5f, FAINT).apply {
                setPadding(0, dp(6), 0, 0)
            }
        )

        // Kisi centang dua kolom, delapan opsi yang semuanya tersambung ke profil.
        card.addView(
            monoText("Opsi", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(18), 0, dp(2))
            }
        )
        card.addView(checkGrid(), lp(2))

        connectButton = TextView(this).apply {
            text = "HUBUNGKAN"
            gravity = Gravity.CENTER
            typeface = Face.proseMedium(this@MainActivity)
            inkSize(15f)
            setTextColor(ON_ACCENT)
            background = ripple(box(ACCENT, R_PILL))
            isClickable = true
            isFocusable = true
            contentDescription = "Hubungkan tunnel"
            minimumHeight = dp(56)
            setCompoundDrawables(drawableIcon(R.drawable.ic_lock, 18, ON_ACCENT), null, null, null)
            compoundDrawablePadding = dp(8)
            setOnClickListener { toggleTunnel() }
        }
        // Tekanan jari terasa: tombol mengecil sedikit lalu pulih.
        Anim.pressScale(connectButton)
        card.addView(connectButton, LinearLayout.LayoutParams(-1, dp(56)).apply { topMargin = dp(20) })

        statusText = uiText("Belum tersambung.", 12f, MUTED).apply {
            maxLines = 2
            gravity = Gravity.CENTER
            setLineSpacing(dp(2).toFloat(), 1f)
        }
        // Baris status di tengah dengan titik warna status, seperti mockup.
        statusDot = View(this).apply {
            background = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(MUTED)
            }
        }
        val statusRow = horizontal().apply { gravity = Gravity.CENTER }
        statusRow.addView(
            statusDot,
            LinearLayout.LayoutParams(dp(8), dp(8)).apply {
                rightMargin = dp(8)
                topMargin = dp(3)
            }
        )
        statusRow.addView(statusText, LinearLayout.LayoutParams(-2, -2))
        body.addView(statusRow, lp(10))

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

        // Kepala kartu: label mikro + pil LIVE saat tunnel aktif (mockup).
        livePill = monoText("LIVE", 10f, OK).apply {
            background = box(0, R_PILL, HAIR, 1f)
            setPadding(dp(12), dp(4), dp(12), dp(4))
            val dot = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setSize(dp(6), dp(6))
                setColor(OK)
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(dot, null, null, null)
            compoundDrawablePadding = dp(6)
            visibility = View.GONE
        }
        val head = horizontal().apply { gravity = Gravity.CENTER_VERTICAL }
        head.addView(
            monoText("TRANSFER DATA", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
            },
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        head.addView(livePill, LinearLayout.LayoutParams(-2, -2))
        card.addView(head, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(6) })

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
            setPadding(dp(16), dp(8), dp(16), dp(8))
        }
        followChip = chip("Ikuti", null, autoScroll, "Ikuti log baru") {
            autoScroll = !autoScroll
            syncFollowChip()
            if (autoScroll) {
                logScroll.post { logScroll.fullScroll(View.FOCUS_DOWN) }
            }
        }
        bar.addView(followChip, LinearLayout.LayoutParams(-2, -2).apply { rightMargin = dp(8) })
        bar.addView(
            chip("Salin", R.drawable.ic_content_copy, false, "Salin log") { copyLog() },
            LinearLayout.LayoutParams(-2, -2).apply { rightMargin = dp(8) }
        )
        bar.addView(
            chip("Bersihkan", R.drawable.ic_delete, false, "Bersihkan log") { clearLog() },
            LinearLayout.LayoutParams(-2, -2)
        )
        panel.addView(bar, LinearLayout.LayoutParams(-1, -2))

        logScroll = ScrollView(this).apply {
            isVerticalScrollBarEnabled = false
            clipToPadding = false
        }
        logList = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(2), dp(16), dp(24))
        }
        logScroll.addView(logList, ViewGroup.LayoutParams(-1, -2))
        panel.addView(logScroll, LinearLayout.LayoutParams(-1, 0, 1f))
        return panel
    }

    /** Pil aksi bilah log: terisi hijau saat aktif, garis rambut saat diam. */
    private fun chip(
        label: String,
        icon: Int?,
        filled: Boolean,
        desc: String = label,
        onClick: () -> Unit
    ): TextView = TextView(this).apply {
        text = label
        typeface = Face.proseMedium(this@MainActivity)
        inkSize(13f)
        gravity = Gravity.CENTER_VERTICAL
        minimumHeight = dp(44)
        setPadding(dp(18), 0, dp(18), 0)
        isClickable = true
        isFocusable = true
        contentDescription = desc
        setOnClickListener { onClick() }
        if (icon != null) {
            setCompoundDrawables(
                drawableIcon(icon, 16, if (filled) ON_ACCENT else MUTED), null, null, null
            )
            compoundDrawablePadding = dp(8)
        }
        background = ripple(if (filled) box(ACCENT, R_PILL) else box(0, R_PILL, HAIR, 1f))
        setTextColor(if (filled) ON_ACCENT else INK)
    }

    /** Pil Ikuti berubah bentuk saat dinyalakan/dimatikan. */
    private fun syncFollowChip() {
        followChip.background =
            ripple(if (autoScroll) box(ACCENT, R_PILL) else box(0, R_PILL, HAIR, 1f))
        followChip.setTextColor(if (autoScroll) ON_ACCENT else INK)
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
            setLineSpacing(dp(3).toFloat(), 1f)
            setPadding(dp(14), dp(8), dp(14), dp(8))
            background = box(PANEL, R_LINE)
        }
        logList.addView(
            line,
            LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(4) }
        )
        logList.addView(gap(), LinearLayout.LayoutParams(-1, dp(4)))
        // Baris baru meluncur masuk dari bawah, pelan dan singkat.
        if (Anim.on(this)) {
            line.alpha = 0f
            line.translationY = dp(8).toFloat()
            line.animate().alpha(1f).translationY(0f).setDuration(170L)
                .setInterpolator(Anim.fastOutSlowIn)
                .start()
        }
    }

    /** Jarak antarkartu log; dipasangkan dengan barisnya saat jendela geser. */
    private fun gap() = View(this)

    // ---------------------------------------------------------------- drawer
    private fun buildDrawer(): ScrollView {
        val panel = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(PANEL)
            setPadding(0, dp(24), 0, dp(28))
        }

        // Kepala laci: ubin merek besar, nama, slogan, dan versi.
        val head = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), 0, dp(20), 0)
        }
        head.addView(brandTile(72), LinearLayout.LayoutParams(dp(72), dp(72)))
        val brand = horizontal().apply { setPadding(0, dp(14), 0, 0) }
        brand.addView(uiText("Wanz", 20f, ACCENT, medium = true))
        brand.addView(
            uiText("Tunnel", 20f, INK, medium = true).apply { setPadding(dp(5), 0, 0, 0) }
        )
        head.addView(brand)
        head.addView(
            uiText("Aman · Cepat · Gratis", 11.5f, MUTED).apply { setPadding(0, dp(3), 0, 0) }
        )
        head.addView(
            monoText("v" + BuildConfig.VERSION_NAME, 10f, FAINT).apply {
                setPadding(0, dp(2), 0, 0)
            }
        )
        panel.addView(head)
        panel.addView(
            rule(),
            LinearLayout.LayoutParams(-1, dp(1)).apply {
                setMargins(dp(20), dp(18), dp(20), 0)
            }
        )

        panel.addView(groupLabel("Utilitas"))
        panel.addView(
            drawerRow(R.drawable.ic_account_circle, "Profil") { profileDialog() }, rowLp()
        )
        panel.addView(
            drawerRow(R.drawable.ic_receipt_long, "Payload") { payloadDialog() }, rowLp()
        )
        panel.addView(drawerRow(R.drawable.ic_dns, "Proxy") { proxyDialog() }, rowLp())
        panel.addView(drawerRow(R.drawable.ic_language, "SlowDNS") { slowDnsDialog() }, rowLp())
        panel.addView(drawerRow(R.drawable.ic_brightness_6, "Tema") { themeDialog() }, rowLp())

        panel.addView(groupLabel("Alat"))
        panel.addView(drawerRow(R.drawable.ic_info, "Tentang") { aboutDialog() }, rowLp())

        panel.addView(View(this), LinearLayout.LayoutParams(0, 0, 1f))
        panel.addView(
            monoText("Wanz Tunnel v" + BuildConfig.VERSION_NAME, 10f, FAINT).apply {
                setPadding(dp(32), dp(10), dp(20), 0)
            }
        )
        return ScrollView(this).apply {
            setBackgroundColor(PANEL)
            isVerticalScrollBarEnabled = false
            isFillViewport = true
            addView(panel, ViewGroup.LayoutParams(-1, -2))
        }
    }

    /**
     * Tanda merek: ubin charcoal dengan monogram W hijau. Aset dibuat khusus
     * untuk Wanz Tunnel (Seedream 5.5, prompt di `brand/PROMPTS.md`), lalu
     * diratakan ke dua warna dan dipertajam agar tetap terbaca di ukuran kecil.
     */
    private fun brandTile(sizeDp: Int = 64): ImageView = ImageView(this).apply {
        setImageResource(R.drawable.wanz_tile)
        scaleType = ImageView.ScaleType.FIT_CENTER
        contentDescription = null
        importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
        minimumWidth = dp(sizeDp)
        minimumHeight = dp(sizeDp)
    }

    private fun groupLabel(text: String) = monoText(text, 10.5f, FAINT).apply {
        letterSpacing = 0.12f
        setPadding(dp(32), dp(16), dp(20), dp(4))
    }

    /** Baris laci diberi margin samping supaya pil ripple membulat terlihat. */
    private fun rowLp() = LinearLayout.LayoutParams(-1, -2).apply {
        setMargins(dp(12), 0, dp(12), 0)
    }

    private fun drawerRow(icon: Int, label: String, onTap: () -> Unit) =
        horizontal().apply {
            setPadding(dp(16), 0, dp(16), 0)
            minimumHeight = dp(48)
            isClickable = true
            isFocusable = true
            background = ripple(box(0, R_PILL))
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
        tabSsh.setTextColor(if (which == TAB_SSH) ON_ACCENT else MUTED)
        tabLog.setTextColor(if (which == TAB_LOG) ON_ACCENT else MUTED)
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

    /** Pil aktif meluncur ke posisi tab terpilih (fast_out_slow_in). */
    private fun slideTabIndicator() {
        if (!::tabIndicator.isInitialized) return
        tabIndicator.post {
            val target = if (tab == TAB_SSH) 0f else tabIndicator.width.toFloat()
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
        // Tombol selalu terisi penuh: hijau saat siap, abu saat menyambung,
        // merah saat terhubung (tindakannya memutus).
        val fill = when (state) {
            Conn.CONNECTED -> ERR
            Conn.CONNECTING -> MUTED
            else -> ACCENT
        }
        connectButton.setTextColor(ON_ACCENT)
        connectButton.background = ripple(box(fill, R_PILL))
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
        val statusColor = when {
            noInternet -> WARN
            state == Conn.ERROR -> ERR
            state == Conn.CONNECTED -> OK
            else -> MUTED
        }
        statusText.setTextColor(statusColor)
        (statusDot.background as? GradientDrawable)?.setColor(statusColor)
        renderMetrics()
    }

    private fun renderMetrics() {
        val active = TunnelService.running && TunnelService.connectedAt > 0L
        (metricsDot.background as? GradientDrawable)?.setColor(if (active) OK else HAIR)
        livePill.visibility = if (active) View.VISIBLE else View.GONE
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
            setPadding(dp(14), dp(12), dp(14), dp(12))
            background = box(FIELD, R_FIELD, HAIR, 1f)
            setOnFocusChangeListener { v, hasFocus ->
                (v.background as? GradientDrawable)?.setStroke(
                    Face.linePx(this@MainActivity, 1f).toInt(), if (hasFocus) ACCENT else HAIR
                )
            }
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

    /** Dialog Profil: daftar kartu profil + tombol tambah, ala mockup AI. */
    private fun profileDialog() {
        saveCompactField(false)
        hideKeyboard()
        val list = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(8), dp(22), dp(4))
        }
        val dialogRef = arrayOfNulls<AlertDialog>(1)
        profiles.forEach { p ->
            val active = p.id == profile?.id
            val label = p.name.ifBlank { "Server ${p.id}" }
            val row = horizontal().apply {
                setPadding(dp(14), dp(8), dp(6), dp(8))
                background = ripple(
                    box(PANEL, R_PANEL, if (active) ACCENT else HAIR, if (active) 1.5f else 1f)
                )
                isClickable = true
                isFocusable = true
                contentDescription = "Pilih profil $label"
                setOnClickListener {
                    dialogRef[0]?.dismiss()
                    switchProfile(p)
                }
            }
            row.addView(radioDot(active), LinearLayout.LayoutParams(dp(16), dp(16)))
            val col = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(dp(12), 0, 0, 0)
            }
            col.addView(
                uiText(label, 15f, INK, medium = true).apply {
                    maxLines = 1
                    ellipsize = TextUtils.TruncateAt.END
                }
            )
            col.addView(
                monoText(
                    if (p.host.isBlank()) "host belum diisi" else "${p.host} : ${p.port}",
                    11f, MUTED
                ).apply {
                    setPadding(0, dp(2), 0, 0)
                    maxLines = 1
                    ellipsize = TextUtils.TruncateAt.END
                }
            )
            row.addView(col, LinearLayout.LayoutParams(0, -2, 1f))
            row.addView(
                iconButton(R.drawable.ic_edit, "Ubah nama $label", MUTED, 20) {
                    dialogRef[0]?.dismiss()
                    renameProfileDialog(p)
                },
                LinearLayout.LayoutParams(dp(48), dp(48))
            )
            row.addView(
                iconButton(R.drawable.ic_delete, "Hapus $label", MUTED, 20) {
                    dialogRef[0]?.dismiss()
                    deleteProfileDialog(p)
                },
                LinearLayout.LayoutParams(dp(48), dp(48))
            )
            list.addView(row, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(10) })
        }
        val add = TextView(this).apply {
            text = "TAMBAH PROFIL BARU"
            gravity = Gravity.CENTER
            typeface = Face.proseMedium(this@MainActivity)
            inkSize(14f)
            setTextColor(ON_ACCENT)
            background = ripple(box(ACCENT, R_PILL))
            minimumHeight = dp(52)
            isClickable = true
            isFocusable = true
            contentDescription = "Tambah profil baru"
            setCompoundDrawables(
                drawableIcon(R.drawable.ic_add, 18, ON_ACCENT), null, null, null
            )
            compoundDrawablePadding = dp(8)
            setOnClickListener {
                dialogRef[0]?.dismiss()
                addProfile()
            }
        }
        list.addView(add, LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(6) })
        val dialog = themedBuilder("Profil")
            .setView(ScrollView(this).apply { addView(list) })
            .setNegativeButton("Batal", null)
            .create()
        dialogRef[0] = dialog
        dialog.show()
    }

    private fun renameProfileDialog(target: Profile) {
        saveCompactField(false)
        val input = dialogInput(target.name, "Nama profil")
        themedBuilder("Ubah nama profil")
            .setView(dialogWrap(input))
            .setPositiveButton("Simpan") { _, _ ->
                val name = input.text.toString().trim().ifBlank { "Server ${target.id}" }
                commitProfile(target.copy(name = name))
                syncUi()
                Toast.makeText(this, "Nama profil disimpan", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Batal", null)
            .show()
    }

    private fun deleteProfileDialog(target: Profile) {
        saveCompactField(false)
        themedBuilder("Hapus profil")
            .setMessage(
                "Hapus \"${target.name.ifBlank { "Server ${target.id}" }}\"? " +
                    "Tindakan ini tidak bisa dibatalkan."
            )
            .setPositiveButton("Hapus") { _, _ -> deleteProfile(target) }
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

    /**
     * Baris saklar: label dan keterangan di kiri, Switch beraksen hijau di
     * kanan — mengikuti mockup SlowDNS (Setelan klien).
     */
    private fun switchRow(
        label: String,
        sub: String?,
        checked: Boolean
    ): Pair<LinearLayout, Switch> {
        val sw = Switch(this).apply {
            isChecked = checked
            contentDescription = label
            thumbTintList = ColorStateList(
                arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
                intArrayOf(ACCENT, MUTED)
            )
            trackTintList = ColorStateList(
                arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
                intArrayOf(0x664CAF50, 0x3387929B)
            )
        }
        val col = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        col.addView(uiText(label, 14.5f, INK))
        if (sub != null) {
            col.addView(uiText(sub, 11.5f, MUTED).apply { setPadding(0, dp(1), 0, 0) })
        }
        val row = horizontal().apply {
            setPadding(0, dp(6), 0, dp(6))
            minimumHeight = dp(48)
            isClickable = true
            isFocusable = true
            background = ripple()
            contentDescription = label
            setOnClickListener {
                sw.toggle()
                performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY)
            }
        }
        row.addView(col, LinearLayout.LayoutParams(0, -2, 1f))
        row.addView(sw, LinearLayout.LayoutParams(-2, -2).apply { leftMargin = dp(12) })
        return row to sw
    }

    /** Indikator pilihan: cincin abu saat kosong, titik hijau saat terpilih. */
    private fun radioDot(selected: Boolean): View = View(this).apply {
        background = if (selected) {
            LayerDrawable(
                arrayOf(
                    GradientDrawable().apply {
                        shape = GradientDrawable.OVAL
                        setStroke(dp(2), ACCENT)
                    },
                    GradientDrawable().apply {
                        shape = GradientDrawable.OVAL
                        setColor(ACCENT)
                    }
                )
            ).apply { setLayerInset(1, dp(5), dp(5), dp(5), dp(5)) }
        } else {
            GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setStroke(dp(2), MUTED)
            }
        }
    }

    /**
     * Pratinjau mini tema untuk kartu pilihan Tema: kanvas warna dasar
     * dengan bilah aksen; mode sistem membelah putih/charcoal.
     */
    private fun previewThumb(mode: Int): View {
        val dark = 0xFF15171A.toInt()
        val light = 0xFFFFFFFF.toInt()
        val frame = FrameLayout(this).apply {
            clipToOutline = true
            when (mode) {
                THEME_DARK -> background = box(dark, R_FIELD)
                THEME_LIGHT -> background = box(light, R_FIELD, HAIR, 1f)
                else -> {
                    background = box(light, R_FIELD, HAIR, 1f)
                    addView(
                        View(this@MainActivity).apply { background = box(dark, 0) },
                        FrameLayout.LayoutParams(dp(20), -1, Gravity.END)
                    )
                }
            }
            addView(
                View(this@MainActivity).apply { background = box(ACCENT, 0) },
                FrameLayout.LayoutParams(dp(14), dp(4), Gravity.TOP or Gravity.START)
                    .apply { setMargins(dp(6), dp(6), 0, 0) }
            )
        }
        return frame
    }

    /** Dialog pengaturan SlowDNS: aktif, resolver, domain, pubkey, tipe. */
    private fun slowDnsDialog() {
        saveCompactField(false)
        val p = profile ?: return
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(8), dp(22), dp(4))
        }

        // Baris aktif/nonaktif memakai saklar, seperti mockup SlowDNS.
        val (enableRow, enableSwitch) = switchRow("Aktifkan SlowDNS", null, p.slowdns)
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

        /** Sel kisi dua kolom untuk setelan lanjutan, seperti mockup. */
        fun addGrid(row: LinearLayout, label: String, value: String, hint: String): EditText {
            val col = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
            col.addView(
                monoText(label, 10.5f, FAINT).apply {
                    letterSpacing = 0.12f
                    setPadding(0, dp(8), 0, dp(4))
                }
            )
            val input = dialogInput(value, hint)
            col.addView(input, LinearLayout.LayoutParams(-1, -2))
            row.addView(
                col,
                LinearLayout.LayoutParams(0, -2, 1f).apply {
                    if (row.childCount > 0) leftMargin = dp(10)
                }
            )
            return input
        }

        // Resolver dipilih lewat kontrol segmen pil: UDP / DOH / DOT.
        val resolverHost = p.slowdnsResolver
            .removePrefix("https://").removePrefix("tls://").removePrefix("dot://")
        var scheme = when {
            p.slowdnsResolver.startsWith("https://") -> "DOH"
            p.slowdnsResolver.startsWith("tls://") ||
                p.slowdnsResolver.startsWith("dot://") -> "DOT"
            else -> "UDP"
        }
        val segHint = mapOf(
            "UDP" to "8.8.8.8",
            "DOH" to "dns.google/dns-query",
            "DOT" to "1.1.1.1"
        )
        box.addView(
            monoText("RESOLVER", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(12), 0, dp(4))
            }
        )
        val segTrack = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            background = box(0, R_PILL, HAIR, 1f)
            setPadding(dp(4), dp(4), dp(4), dp(4))
        }
        val segs = listOf("UDP", "DOH", "DOT").map { name ->
            TextView(this).apply {
                text = name
                gravity = Gravity.CENTER
                typeface = Face.proseMedium(this@MainActivity)
                inkSize(13f)
                minimumHeight = dp(40)
                isClickable = true
                isFocusable = true
                contentDescription = "Resolver $name"
            }
        }
        segs.forEachIndexed { i, s ->
            segTrack.addView(
                s,
                LinearLayout.LayoutParams(0, -1, 1f).apply {
                    if (i < segs.size - 1) rightMargin = dp(4)
                }
            )
        }
        box.addView(segTrack, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(8) })
        val resolverInput = addField("DNS UTAMA", resolverHost, segHint[scheme] ?: "8.8.8.8")

        fun paintSegs() {
            segs.forEach { s ->
                val on = s.text == scheme
                s.background = ripple(if (on) box(ACCENT, R_PILL) else box(0, R_PILL))
                s.setTextColor(if (on) ON_ACCENT else MUTED)
            }
        }
        segs.forEach { s ->
            s.setOnClickListener {
                scheme = s.text.toString()
                resolverInput.hint = segHint[scheme]
                paintSegs()
            }
        }
        paintSegs()
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
            background = ripple(box(FIELD, R_FIELD, HAIR, 1f))
            setPadding(dp(14), 0, dp(14), 0)
            isClickable = true
            isFocusable = true
            minimumHeight = dp(48)
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

        // Pengaturan lanjutan dalam kisi dua kolom, seperti mockup SlowDNS.
        box.addView(
            monoText("SETELAN LANJUTAN", 10.5f, FAINT).apply {
                letterSpacing = 0.12f
                setPadding(0, dp(14), 0, dp(2))
            }
        )
        val grid1 = horizontal().apply { gravity = Gravity.TOP }
        val qnameInput = addGrid(
            grid1, "BATAS QNAME (BYTE)",
            if (p.slowdnsQname == 0) "" else p.slowdnsQname.toString(), "0 = default (255)"
        )
        val ednsInput = addGrid(
            grid1, "BATAS EDNS0 (BYTE)",
            if (p.slowdnsEdns == 0) "" else p.slowdnsEdns.toString(), "0 = default (4096)"
        )
        box.addView(grid1, lp(4))
        val grid2 = horizontal().apply { gravity = Gravity.TOP }
        val windowInput = addGrid(
            grid2, "KCP WINDOW",
            if (p.slowdnsWindow == 0) "" else p.slowdnsWindow.toString(), "0 = default (64)"
        )
        val sessionInput = addGrid(
            grid2, "JUMLAH SESI (1–8)",
            p.slowdnsSessions.toString(), "1 = satu sesi"
        )
        box.addView(grid2, lp(4))

        val (multiLoginRow, multiLoginCheck) = switchRow(
            "Multi login", "Login terpisah per sesi", p.slowdnsMultiLogin
        )
        box.addView(multiLoginRow, lp(4))
        val (calibrateRow, calibrateCheck) = switchRow(
            "Automatic calibration", "Uji QNAME/EDNS0 sebelum menyambung", p.slowdnsCalibrate
        )
        box.addView(calibrateRow, lp(4))

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
        // Tombol utama pil hijau penuh, sekunder garis rambut — ala mockup.
        val pos = dialog.getButton(AlertDialog.BUTTON_POSITIVE)
        pos.typeface = Face.proseMedium(this)
        pos.setTextColor(ON_ACCENT)
        pos.background = ripple(box(ACCENT, R_PILL))
        pos.minimumHeight = dp(48)
        pos.setPadding(dp(28), 0, dp(28), 0)
        val neg = dialog.getButton(AlertDialog.BUTTON_NEGATIVE)
        neg.setTextColor(INK)
        neg.background = ripple(box(0, R_PILL, HAIR, 1f))
        neg.minimumHeight = dp(48)
        neg.setPadding(dp(20), 0, dp(20), 0)
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
            // Kosong = 0 (default pustaka); teks bukan angka = -1 agar validasi menolak.
            fun number(input: EditText): Int {
                val text = input.text.toString().trim()
                return if (text.isEmpty()) 0 else (text.toIntOrNull() ?: -1)
            }
            // Susun ulang resolver dari skema segmen + host yang diisi.
            val host = resolverInput.text.toString().trim()
                .removePrefix("https://").removePrefix("tls://").removePrefix("dot://")
            val resolver = when (scheme) {
                "DOH" -> "https://$host"
                "DOT" -> "tls://$host"
                else -> host
            }
            val updated = p.copy(
                slowdns = enableSwitch.isChecked,
                slowdnsResolver = resolver,
                slowdnsDomain = domainInput.text.toString().trim(),
                slowdnsPubkey = pubkeyInput.text.toString().trim(),
                slowdnsType = selectedType,
                slowdnsQname = number(qnameInput),
                slowdnsEdns = number(ednsInput),
                slowdnsWindow = number(windowInput),
                slowdnsSessions = number(sessionInput),
                slowdnsMultiLogin = multiLoginCheck.isChecked,
                slowdnsCalibrate = calibrateCheck.isChecked
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

    /** Dialog Tema: tiga kartu pilihan berpratinjau mini, ala mockup AI. */
    private fun themeDialog() {
        val current = AppPrefs.themeMode(this)
        val box = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(8), dp(22), dp(4))
        }
        // Urutan mengikuti mockup: Ikuti sistem, Gelap, Terang.
        val order = listOf(THEME_SYSTEM, THEME_DARK, THEME_LIGHT)
        val subs = mapOf(
            THEME_SYSTEM to "Ikuti mode terang/gelap perangkat",
            THEME_DARK to "Kurangi silau dan hemat baterai",
            THEME_LIGHT to "Tampilan lebih jelas dan bersih"
        )
        val dialogRef = arrayOfNulls<AlertDialog>(1)
        order.forEach { mode ->
            val selected = mode == current
            val card = horizontal().apply {
                setPadding(dp(14), dp(12), dp(14), dp(12))
                background = ripple(
                    box(PANEL, R_PANEL, if (selected) ACCENT else HAIR, if (selected) 1.5f else 1f)
                )
                isClickable = true
                isFocusable = true
                contentDescription = "Tema ${THEME_LABELS[mode]}"
                setOnClickListener {
                    dialogRef[0]?.dismiss()
                    if (mode != current) {
                        AppPrefs.setThemeMode(this@MainActivity, mode)
                        recreate()
                    }
                }
            }
            card.addView(previewThumb(mode), LinearLayout.LayoutParams(dp(40), dp(56)))
            val col = LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(dp(14), 0, 0, 0)
            }
            col.addView(uiText(THEME_LABELS[mode], 15f, INK, medium = true))
            col.addView(
                uiText(subs[mode] ?: "", 11.5f, MUTED).apply { setPadding(0, dp(2), 0, 0) }
            )
            card.addView(col, LinearLayout.LayoutParams(0, -2, 1f))
            card.addView(radioDot(selected), LinearLayout.LayoutParams(dp(18), dp(18)))
            box.addView(card, LinearLayout.LayoutParams(-1, -2).apply { bottomMargin = dp(10) })
        }
        val dialog = themedBuilder("Tema")
            .setView(box)
            .setNegativeButton("Batal", null)
            .create()
        dialogRef[0] = dialog
        dialog.show()
    }

    private fun aboutDialog() {
        val banner = ImageView(this).apply {
            setImageResource(R.drawable.about_tunnel)
            scaleType = ImageView.ScaleType.CENTER_CROP
            contentDescription = null
            importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO
            background = box(PANEL, R_PANEL)
            clipToOutline = true
        }
        // Banner terowongan dengan ubin merek di tengahnya, seperti mockup.
        val hero = FrameLayout(this)
        hero.addView(banner, FrameLayout.LayoutParams(-1, dp(132)))
        hero.addView(
            brandTile(56),
            FrameLayout.LayoutParams(dp(56), dp(56), Gravity.CENTER)
        )

        fun badge(text: String, margin: Int = 0): TextView =
            monoText(text, 10f, MUTED).apply {
                background = box(0, R_PILL, HAIR, 1f)
                setPadding(dp(12), dp(5), dp(12), dp(5))
                layoutParams = LinearLayout.LayoutParams(-2, -2).apply {
                    leftMargin = dp(margin)
                }
            }
        val badges = horizontal().apply { gravity = Gravity.CENTER }
        badges.addView(badge("v" + BuildConfig.VERSION_NAME))
        badges.addView(badge("SSH · VPN", 8))
        badges.addView(badge("Android 10+", 8))

        val content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(dp(20), dp(16), dp(20), dp(0))
            addView(hero, LinearLayout.LayoutParams(-1, -2))
            addView(
                uiText("Wanz Tunnel", 20f, INK, medium = true)
                    .apply { setPadding(0, dp(14), 0, 0) }
            )
            addView(badges, LinearLayout.LayoutParams(-2, -2).apply { topMargin = dp(10) })
            addView(
                uiText(
                    "Klien SSH + VPN untuk Android. Semua trafik aplikasi masuk " +
                        "lewat terowongan SSH, lalu diteruskan oleh tun2socks di " +
                        "dalam perangkat.",
                    12.5f, MUTED
                ).apply {
                    gravity = Gravity.CENTER
                    setLineSpacing(dp(2).toFloat(), 1f)
                },
                lp(12)
            )
            addView(
                uiText(
                    "Lisensi: Roboto dan Roboto Mono (Apache 2.0), Material Icons " +
                        "(Apache 2.0), JSch (BSD), hev-socks5-tunnel (Apache 2.0). " +
                        "Monogram W dan ilustrasi terowongan dibuat khusus untuk " +
                        "Wanz Tunnel.",
                    10.5f, FAINT
                ).apply {
                    gravity = Gravity.CENTER
                    setLineSpacing(dp(2).toFloat(), 1f)
                },
                lp(10)
            )
        }
        themedBuilder("Tentang")
            .setView(content)
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
