package id.wanz.tunnel

import android.app.Activity
import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import java.io.File

/**
 * Halaman pengaturan bergaya HTTP Custom: kartu-kartu terpisah untuk
 * Profil, Koneksi, Payload & Proxy, Jaringan, Ping, Lainnya, Log, dan
 * Impor Config. Semua opsi di sini benar-benar dipakai oleh [TunnelService].
 */
class SettingsActivity : Activity() {
    private val fields = LinkedHashMap<String, EditText>()
    private lateinit var root: LinearLayout
    private lateinit var profileSpinner: Spinner
    private lateinit var profileAdapter: ArrayAdapter<String>
    private lateinit var transportSpinner: Spinner
    private lateinit var pingIntervalSpinner: Spinner
    private lateinit var strictSwitch: Switch
    private lateinit var autoPingSwitch: Switch
    private lateinit var autoReconnectSwitch: Switch
    private lateinit var onlyMobileSwitch: Switch
    private lateinit var blockRootSwitch: Switch

    private lateinit var store: ProfileStore
    private var profiles = mutableListOf<Profile>()
    private var activeIndex = 0
    private var loading = false

    private val transportKeys = listOf("ssh", "tls", "ws", "wss")
    private val transportLabels = listOf(
        "SSH langsung", "TLS / SNI", "SSH WebSocket (WS)", "SSH WebSocket + TLS (WSS)"
    )
    private val pingIntervalValues = listOf(5, 10, 15, 30, 60)
    private val pingIntervalLabels = pingIntervalValues.map { "$it dtk" }

    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    private fun withAlpha(color: Int, alpha: Int): Int =
        (color and 0x00FFFFFF) or (alpha.coerceIn(0, 255) shl 24)

    private fun box(
        fill: Int,
        radius: Int = 2,
        stroke: Int = 0,
        strokeWidth: Int = 1,
        oval: Boolean = false
    ) = GradientDrawable().apply {
        if (oval) shape = GradientDrawable.OVAL else cornerRadius = dp(radius).toFloat()
        setColor(fill)
        if (stroke != 0) setStroke(dp(strokeWidth), stroke)
    }

    private fun rule() = View(this).apply { setBackgroundColor(HAIR) }

    private fun lp(top: Int) =
        LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(top) }

    private fun horizontal(gravity: Int = Gravity.CENTER_VERTICAL) =
        LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            this.gravity = gravity
        }

    /** Bagian datar: tanpa kartu, tanpa bayangan, tanpa sudut. */
    private fun card() = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
    }

    private fun caption(text: String) = TextView(this).apply {
        this.text = text
        textSize = 11f
        setTextColor(MUTED)
        typeface = Typeface.create("sans-serif", Typeface.NORMAL)
    }

    /** Judul bagian dengan garis rambut di bawahnya. */
    private fun sectionLabel(text: String): LinearLayout {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        box.addView(TextView(this).apply {
            this.text = text
            textSize = 12f
            setTextColor(INK)
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        box.addView(
            rule(),
            LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(7) }
        )
        return box
    }

    private fun note(text: String) = TextView(this).apply {
        this.text = text
        textSize = 11f
        setTextColor(MUTED)
        setLineSpacing(dp(3).toFloat(), 1f)
    }

    private fun fieldBackground(): StateListDrawable {
        val normal = box(FIELD, 2, HAIR, 1)
        val focused = box(BG, 2, INK, 1)
        return StateListDrawable().apply {
            addState(intArrayOf(android.R.attr.state_focused), focused)
            addState(intArrayOf(), normal)
        }
    }

    private fun field(
        key: String,
        hint: String,
        type: Int = InputType.TYPE_CLASS_TEXT,
        lines: Int = 1
    ) = EditText(this).apply {
        this.hint = hint
        inputType = if (lines > 1) type or InputType.TYPE_TEXT_FLAG_MULTI_LINE else type
        if (lines > 1) {
            minLines = lines
            gravity = Gravity.TOP or Gravity.START
            setLineSpacing(dp(3).toFloat(), 1f)
        } else {
            isSingleLine = true
        }
        setTextColor(INK)
        setHintTextColor(FAINT)
        textSize = 15f
        background = fieldBackground()
        setPadding(dp(12), dp(11), dp(12), dp(11))
        includeFontPadding = false
        fields[key] = this
    }

    private fun labeledField(
        label: String,
        key: String,
        hint: String,
        type: Int = InputType.TYPE_CLASS_TEXT,
        lines: Int = 1
    ): LinearLayout {
        val box = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        box.addView(caption(label))
        box.addView(
            field(key, hint, type, lines),
            LinearLayout.LayoutParams(-1, -2).apply { topMargin = dp(7) }
        )
        return box
    }

    private fun chipButton(label: String, color: Int, onClick: () -> Unit) = TextView(this).apply {
        text = label
        textSize = 20f
        gravity = Gravity.CENTER
        setTextColor(color)
        background = box(0, 2, HAIR, 1)
        isClickable = true
        setOnClickListener { onClick() }
    }

    private fun toggle(label: String, checked: Boolean) = Switch(this).apply {
        text = label
        setTextColor(INK)
        textSize = 13.5f
        isChecked = checked
        setPadding(0, dp(8), 0, dp(4))
        thumbTintList = android.content.res.ColorStateList(
            arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
            intArrayOf(INK, 0xFF8E928C.toInt())
        )
        trackTintList = android.content.res.ColorStateList(
            arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
            intArrayOf(withAlpha(INK, 110), HAIR)
        )
    }

    private fun spinnerAdapter(items: List<String>) = object : ArrayAdapter<String>(
        this, android.R.layout.simple_spinner_item, items
    ) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            return (super.getView(position, convertView, parent) as TextView).apply {
                setTextColor(INK)
                textSize = 14f
                setPadding(dp(4), dp(9), dp(4), dp(9))
                background = null
                maxLines = 1
                ellipsize = TextUtils.TruncateAt.END
            }
        }

        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            return (super.getDropDownView(position, convertView, parent) as TextView).apply {
                setTextColor(INK)
                textSize = 14.5f
                setPadding(dp(16), dp(13), dp(16), dp(13))
                setBackgroundColor(BG)
            }
        }
    }

    private fun darkSpinner(): Spinner = Spinner(this).apply {
        background = box(BG, 2, HAIR, 1)
        setPadding(dp(8), 0, dp(8), 0)
        setPopupBackgroundDrawable(box(BG, 2, HAIR, 1))
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG
        window.navigationBarColor = BG
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

        store = ProfileStore(this)
        profiles = store.load()
        if (profiles.isEmpty()) profiles.add(Profile(id = 1, name = "Server 1"))
        val activeId = store.activeId()
        activeIndex = profiles.indexOfFirst { it.id == activeId }.takeIf { it >= 0 } ?: 0

        buildUi()
        profileAdapter = spinnerAdapter(profileNames())
        profileSpinner.adapter = profileAdapter
        profileSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                if (loading || position == activeIndex) return
                saveCurrent()
                if (TunnelService.running) {
                    startService(
                        Intent(this@SettingsActivity, TunnelService::class.java)
                            .setAction(TunnelService.ACTION_STOP)
                    )
                    Toast.makeText(
                        this@SettingsActivity,
                        "Tunnel diputus karena ganti profil",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                activeIndex = position.coerceIn(profiles.indices)
                val p = profiles[activeIndex]
                store.save(profiles, p.id)
                loadProfile(p)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

        loading = true
        profileSpinner.setSelection(activeIndex, false)
        loading = false
        loadProfile(profiles[activeIndex])

        setContentView(ScrollView(this).apply {
            setBackgroundColor(BG)
            isFillViewport = true
            clipToPadding = false
            isVerticalScrollBarEnabled = false
            addView(root, ViewGroup.LayoutParams(-1, -2))
        })
    }

    private fun buildUi() {
        root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(24), dp(18), dp(24), dp(40))
        }

        val header = horizontal()
        val brand = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        brand.addView(TextView(this).apply {
            text = "Pengaturan"
            textSize = 27f
            setTextColor(INK)
            letterSpacing = -0.02f
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        brand.addView(TextView(this).apply {
            text = "WANZ TUNNEL"
            textSize = 10f
            setTextColor(MUTED)
            letterSpacing = 0.1f
            typeface = Typeface.create("sans-serif", Typeface.NORMAL)
        })
        header.addView(brand, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(TextView(this).apply {
            text = "← Kembali"
            textSize = 12.5f
            gravity = Gravity.CENTER
            setTextColor(INK)
            setPadding(dp(8), dp(8), 0, dp(8))
            isClickable = true
            setOnClickListener { saveCurrent(); finish() }
        }, LinearLayout.LayoutParams(-2, -2))
        root.addView(header)
        root.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(14) })

        root.addView(TextView(this).apply {
            text = "Tunnel, jaringan, dan ping."
            textSize = 12.5f
            setTextColor(MUTED)
        }, lp(10))

        // ------------------------------------------------------------ PROFIL
        val profileCard = card()
        profileCard.addView(sectionLabel("Profil"))
        val profileRow = horizontal()
        profileSpinner = darkSpinner()
        profileRow.addView(profileSpinner, LinearLayout.LayoutParams(0, dp(48), 1f))
        profileRow.addView(
            chipButton("+", INK) { addProfile() },
            LinearLayout.LayoutParams(dp(48), dp(48)).apply { leftMargin = dp(8) }
        )
        profileRow.addView(
            chipButton("−", ERR) { deleteProfile() },
            LinearLayout.LayoutParams(dp(48), dp(48)).apply { leftMargin = dp(6) }
        )
        profileCard.addView(profileRow, lp(10))
        profileCard.addView(labeledField("Nama profil", "name", "Server 1"), lp(12))
        root.addView(profileCard, lp(26))

        // ---------------------------------------------------------- KONEKSI
        val connCard = card()
        connCard.addView(sectionLabel("Koneksi"))
        // Tidak ada pilihan mode. Seluruh trafik selalu masuk VPN, sama seperti
        // HTTP Custom; proxy SOCKS5 hanya detail internal tun2socks.
        connCard.addView(
            note("Trafik semua aplikasi lewat VPN. Android meminta izin sekali saat pertama menyambung."),
            lp(12)
        )

        val transportRow = horizontal(Gravity.BOTTOM)
        val transportBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        transportBox.addView(caption("Transport"))
        transportSpinner = darkSpinner().apply { adapter = spinnerAdapter(transportLabels) }
        transportBox.addView(
            transportSpinner,
            LinearLayout.LayoutParams(-1, dp(48)).apply { topMargin = dp(7) }
        )
        transportRow.addView(transportBox, LinearLayout.LayoutParams(0, -2, 1f))
        connCard.addView(transportRow, lp(12))

        val hostRow = horizontal(Gravity.BOTTOM)
        hostRow.addView(
            labeledField("Host / IP", "host", "contoh: 104.17.70.206"),
            LinearLayout.LayoutParams(0, -2, 2f)
        )
        hostRow.addView(
            labeledField("Port", "port", "80", InputType.TYPE_CLASS_NUMBER),
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) }
        )
        connCard.addView(hostRow, lp(12))
        connCard.addView(labeledField("Username", "user", "nama pengguna SSH"), lp(12))
        connCard.addView(
            labeledField(
                "Password", "pass", "password SSH",
                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            ),
            lp(12)
        )
        root.addView(connCard, lp(26))

        // -------------------------------------------------- PAYLOAD & PROXY
        val payloadCard = card()
        payloadCard.addView(sectionLabel("Payload & proxy"))
        payloadCard.addView(
            labeledField(
                "Payload (opsional)", "payload",
                "GET / HTTP/1.1[crlf]Host: [host][crlf][crlf][split]...",
                lines = 4
            ),
            lp(12)
        )
        payloadCard.addView(
            labeledField("Proxy / edge (opsional)", "proxy", "104.17.70.206:80"),
            lp(12)
        )
        payloadCard.addView(
            labeledField("SNI / host TLS (opsional)", "sni", "contoh: id3-1forcr.zivpn.site"),
            lp(12)
        )
        val wsRow = horizontal(Gravity.BOTTOM)
        wsRow.addView(
            labeledField("Host header WS", "wsHost", "opsional"),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        wsRow.addView(
            labeledField("Path WS", "wsPath", "/"),
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) }
        )
        payloadCard.addView(wsRow, lp(12))
        strictSwitch = toggle("Verifikasi sertifikat TLS ketat", true)
        payloadCard.addView(strictSwitch, lp(10))
        payloadCard.addView(
            note("Config HTTP Custom (payload ber-[split]) otomatis memakai SSH langsung; " +
                "handshake WS bawaan dilewati."),
            lp(8)
        )
        root.addView(payloadCard, lp(26))

        // --------------------------------------------------------- JARINGAN
        val netCard = card()
        netCard.addView(sectionLabel("Jaringan"))
        // DNS tidak lagi menjadi pilihan: SSH hanya meneruskan TCP, jadi DNS
        // selalu diselesaikan di sisi server lewat mapped-DNS.
        netCard.addView(
            TextView(this).apply {
                text = "DNS lewat tunnel (198.18.0.2)"
                textSize = 13.5f
                setTextColor(INK)
                setPadding(0, dp(12), 0, dp(12))
            },
            lp(4)
        )
        netCard.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        netCard.addView(
            note("Nama domain diselesaikan di sisi server, tanpa kebocoran DNS. " +
                "DNS kustom tidak dipakai karena SSH hanya meneruskan TCP."),
            lp(10)
        )
        root.addView(netCard, lp(26))

        // -------------------------------------------------------------- PING
        val pingCard = card()
        pingCard.addView(sectionLabel("Ping"))
        autoPingSwitch = toggle("Auto ping saat terhubung", true)
        pingCard.addView(autoPingSwitch, lp(6))

        val pingRow = horizontal(Gravity.BOTTOM)
        val intervalBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        intervalBox.addView(caption("Interval"))
        pingIntervalSpinner = darkSpinner().apply { adapter = spinnerAdapter(pingIntervalLabels) }
        intervalBox.addView(
            pingIntervalSpinner,
            LinearLayout.LayoutParams(-1, dp(48)).apply { topMargin = dp(7) }
        )
        pingRow.addView(intervalBox, LinearLayout.LayoutParams(0, -2, 1f))
        pingRow.addView(
            labeledField("Target ping", "pingTarget", "1.1.1.1:443"),
            LinearLayout.LayoutParams(0, -2, 1.4f).apply { leftMargin = dp(10) }
        )
        pingCard.addView(pingRow, lp(12))
        pingCard.addView(
            TextView(this).apply {
                text = "Ping sekarang"
                textSize = 13f
                gravity = Gravity.CENTER
                setTextColor(INK)
                typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
                background = box(0, 2, INK, 1)
                setPadding(dp(12), dp(12), dp(12), dp(12))
                isClickable = true
                setOnClickListener {
                    if (TunnelService.running) {
                        startService(
                            Intent(this@SettingsActivity, TunnelService::class.java)
                                .setAction(TunnelService.ACTION_PING)
                        )
                        Toast.makeText(this@SettingsActivity, "Ping dikirim…", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this@SettingsActivity, "Hubungkan tunnel dulu", Toast.LENGTH_SHORT).show()
                    }
                }
            },
            lp(12)
        )
        pingCard.addView(
            note("Ping mengukur RTT lewat kanal SSH langsung, bukan ICMP lokal."),
            lp(8)
        )
        root.addView(pingCard, lp(26))

        // ----------------------------------------------------------- LAINNYA
        val miscCard = card()
        miscCard.addView(sectionLabel("Lainnya"))
        autoReconnectSwitch = toggle("Sambung ulang otomatis jika putus", true)
        onlyMobileSwitch = toggle("Hanya data seluler (tolak Wi-Fi)", false)
        blockRootSwitch = toggle("Blokir root (tolak perangkat ter-root)", false)
        miscCard.addView(autoReconnectSwitch, lp(6))
        miscCard.addView(onlyMobileSwitch, lp(4))
        miscCard.addView(blockRootSwitch, lp(4))
        // Port internal tun2socks. Tidak lagi bagian dari pilihan mode.
        miscCard.addView(
            labeledField("Port lokal", "socksPort", "1080", InputType.TYPE_CLASS_NUMBER),
            lp(16)
        )
        miscCard.addView(
            note("Dipakai VPN di dalam perangkat. Ubah hanya jika port 1080 bentrok."),
            lp(6)
        )
        root.addView(miscCard, lp(26))

        // --------------------------------------------------------------- LOG
        val logCard = card()
        logCard.addView(sectionLabel("Log"))
        logCard.addView(TextView(this).apply {
            text = "Buka log penuh"
            textSize = 13f
            setTextColor(INK)
            setPadding(0, dp(12), 0, dp(12))
            isClickable = true
            setOnClickListener {
                startActivity(Intent(this@SettingsActivity, LogActivity::class.java))
            }
        })
        logCard.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        logCard.addView(TextView(this).apply {
            text = "Salin log ke clipboard"
            textSize = 13f
            setTextColor(INK)
            setPadding(0, dp(12), 0, dp(12))
            isClickable = true
            setOnClickListener {
                val txt = TunnelLog.snapshot().joinToString("\n")
                val cm = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
                cm.setPrimaryClip(ClipData.newPlainText("WanzTunnel", txt))
                Toast.makeText(this@SettingsActivity, "Log disalin", Toast.LENGTH_SHORT).show()
            }
        })
        logCard.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)))
        logCard.addView(TextView(this).apply {
            text = "Bersihkan log"
            textSize = 13f
            setTextColor(ERR)
            setPadding(0, dp(12), 0, dp(12))
            isClickable = true
            setOnClickListener {
                TunnelLog.clear()
                Toast.makeText(this@SettingsActivity, "Log dibersihkan", Toast.LENGTH_SHORT).show()
            }
        })
        root.addView(logCard, lp(26))

        // ------------------------------------------------------- IMPOR CONFIG
        val importCard = card()
        importCard.addView(sectionLabel("Impor config"))
        importCard.addView(
            note("Tempel config (payload + proxy + akun), lalu ketuk Terapkan. " +
                "Baris akun berformat host:port@user:pass."),
            lp(10)
        )
        val importField = EditText(this).apply {
            hint = "GET / HTTP/1.1[crlf]Host: edu.ruangguru.com..." +
                "\n104.17.70.206:80" +
                "\nindo5.vpnjz.com:80@Taekkk67-vpnjantit.com:123"
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_MULTI_LINE
            minLines = 4
            gravity = Gravity.TOP or Gravity.START
            setLineSpacing(dp(3).toFloat(), 1f)
            setTextColor(INK)
            setHintTextColor(FAINT)
            textSize = 12f
            typeface = Typeface.MONOSPACE
            background = fieldBackground()
            setPadding(dp(12), dp(11), dp(12), dp(11))
            includeFontPadding = false
        }
        importCard.addView(importField, lp(8))
        importCard.addView(
            TextView(this).apply {
                text = "Terapkan ke profil aktif"
                textSize = 13f
                gravity = Gravity.CENTER
                setTextColor(PAPER)
                typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
                background = box(INK, 2)
                setPadding(dp(12), dp(13), dp(12), dp(13))
                isClickable = true
                setOnClickListener { applyConfig(importField.text.toString()) }
            },
            lp(10)
        )
        root.addView(importCard, lp(26))

        root.addView(rule(), LinearLayout.LayoutParams(-1, dp(1)).apply { topMargin = dp(22) })
        root.addView(TextView(this).apply {
            text = "Reset kunci host"
            textSize = 12.5f
            setTextColor(INK)
            setPadding(0, dp(12), 0, dp(4))
            isClickable = true
            setOnClickListener {
                File(filesDir, "known_hosts").delete()
                Toast.makeText(this@SettingsActivity, "Kunci host direset", Toast.LENGTH_SHORT).show()
            }
        })
        root.addView(TextView(this).apply {
            text = "Wanz Tunnel 2.8.1  ·  koneksi pribadi"
            textSize = 10.5f
            setTextColor(FAINT)
            setPadding(0, dp(8), 0, 0)
        })
    }

    private fun profileNames(): List<String> =
        profiles.map { it.name.ifBlank { "Server ${it.id}" } }

    private fun refreshProfileNames() {
        if (!::profileAdapter.isInitialized) return
        profileAdapter.clear()
        profileAdapter.addAll(profileNames())
        profileAdapter.notifyDataSetChanged()
    }

    private fun text(key: String): String = fields[key]?.text?.toString()?.trim() ?: ""

    private fun saveCurrent() {
        if (loading) return
        val p = profiles.getOrNull(activeIndex) ?: return
        p.name = text("name").ifBlank { "Server ${p.id}" }
        p.host = text("host")
        p.port = text("port").toIntOrNull()?.coerceIn(1, 65535) ?: 22
        p.user = text("user")
        p.pass = fields["pass"]?.text?.toString() ?: ""
        p.proxy = text("proxy")
        p.payload = fields["payload"]?.text?.toString() ?: ""
        p.socksPort = text("socksPort").toIntOrNull()?.coerceIn(1024, 65535) ?: p.socksPort
        // Mode tunggal: VPN. SOCKS5 hanya dipakai di dalam perangkat oleh
        // tun2socks, tidak lagi menjadi pilihan pengguna.
        p.vpn = true
        p.transport = transportKeys.getOrElse(transportSpinner.selectedItemPosition) { "ssh" }
        p.sni = text("sni")
        p.wsHost = text("wsHost")
        p.wsPath = text("wsPath").ifBlank { "/" }
        p.strictTls = strictSwitch.isChecked
        p.autoPing = autoPingSwitch.isChecked
        p.pingInterval = pingIntervalValues.getOrElse(pingIntervalSpinner.selectedItemPosition) { 10 }
        p.pingTarget = text("pingTarget").ifBlank { "1.1.1.1:443" }
        p.autoReconnect = autoReconnectSwitch.isChecked
        p.onlyMobileData = onlyMobileSwitch.isChecked
        p.blockRoot = blockRootSwitch.isChecked
        // mapped-DNS wajib: SSH hanya meneruskan TCP.
        p.mappedDns = true
        store.save(profiles, p.id)
        refreshProfileNames()
    }

    private fun loadProfile(p: Profile) {
        loading = true
        fields["name"]?.setText(p.name)
        fields["host"]?.setText(p.host)
        fields["port"]?.setText(p.port.toString())
        fields["user"]?.setText(p.user)
        fields["pass"]?.setText(p.pass)
        fields["proxy"]?.setText(p.proxy)
        fields["payload"]?.setText(p.payload)
        fields["socksPort"]?.setText((p.socksPort.takeIf { it > 0 } ?: 1080).toString())
        transportSpinner.setSelection(
            transportKeys.indexOf(p.transport).takeIf { it >= 0 } ?: 0, false
        )
        fields["sni"]?.setText(p.sni)
        fields["wsHost"]?.setText(p.wsHost)
        fields["wsPath"]?.setText(p.wsPath.ifBlank { "/" })
        strictSwitch.isChecked = p.strictTls

        autoPingSwitch.isChecked = p.autoPing
        pingIntervalSpinner.setSelection(
            pingIntervalValues.indexOf(p.pingInterval).takeIf { it >= 0 } ?: 1, false
        )
        fields["pingTarget"]?.setText(p.pingTarget)
        autoReconnectSwitch.isChecked = p.autoReconnect
        onlyMobileSwitch.isChecked = p.onlyMobileData
        blockRootSwitch.isChecked = p.blockRoot
        loading = false
    }

    private fun addProfile() {
        saveCurrent()
        val id = (profiles.maxOfOrNull { it.id } ?: 0L) + 1
        val p = Profile(id = id, name = "Server ${profiles.size + 1}")
        profiles.add(p)
        activeIndex = profiles.size - 1
        store.save(profiles, p.id)
        loading = true
        refreshProfileNames()
        profileSpinner.setSelection(activeIndex, false)
        loading = false
        loadProfile(p)
    }

    private fun deleteProfile() {
        if (profiles.size <= 1) {
            Toast.makeText(this, "Minimal satu profil", Toast.LENGTH_SHORT).show()
            return
        }
        val p = profiles[activeIndex]
        AlertDialog.Builder(this)
            .setMessage("Hapus profil \"${p.name}\"?")
            .setNegativeButton("Batal", null)
            .setPositiveButton("Hapus") { _, _ ->
                if (TunnelService.running) {
                    startService(
                        Intent(this@SettingsActivity, TunnelService::class.java)
                            .setAction(TunnelService.ACTION_STOP)
                    )
                }
                profiles.removeAt(activeIndex)
                activeIndex = activeIndex.coerceAtMost(profiles.size - 1)
                store.save(profiles, profiles[activeIndex].id)
                loading = true
                refreshProfileNames()
                profileSpinner.setSelection(activeIndex, false)
                loading = false
                loadProfile(profiles[activeIndex])
            }
            .show()
    }

    /**
     * Mengurai config gaya HTTP Custom: payload (mengandung [crlf]/[split]),
     * proxy/edge (ip:port), dan akun (host:port@user:pass). Field yang
     * ditemukan langsung mengisi profil aktif.
     */
    private fun applyConfig(raw: String) {
        if (raw.isBlank()) {
            Toast.makeText(this, "Tempel config dulu", Toast.LENGTH_SHORT).show()
            return
        }
        val lines = raw.split('\n', '\r').map { it.trim() }.filter { it.isNotEmpty() }
        var payload: String? = null
        var proxy: String? = null
        var host: String? = null
        var port: Int? = null
        var user: String? = null
        var pass: String? = null

        val accountRegex = Regex("^([^@\\s]+):(\\d+)@(.+)$")
        val ipPortRegex = Regex("^(\\d{1,3}(?:\\.\\d{1,3}){3}):(\\d+)$")

        for (line in lines) {
            if (line.contains("[crlf]", true) || line.contains("[split]", true)) {
                payload = if (payload == null) {
                    line
                } else if (payload!!.contains("[split]", true)) {
                    payload + line
                } else {
                    payload + "[split]" + line
                }
                continue
            }
            val t = stripLabel(line)
            val account = accountRegex.find(t)
            when {
                account != null -> {
                    host = account.groupValues[1]
                    port = account.groupValues[2].toIntOrNull()
                    val cred = account.groupValues[3]
                    user = cred.substringBeforeLast(':').ifBlank { cred }
                    pass = cred.substringAfterLast(':', "")
                }
                ipPortRegex.matches(t) -> proxy = t
            }
        }

        if (host == null && payload == null && proxy == null) {
            Toast.makeText(this, "Format config tidak dikenali", Toast.LENGTH_SHORT).show()
            return
        }

        loading = true
        host?.let { fields["host"]?.setText(it) }
        port?.let { fields["port"]?.setText(it.toString()) }
        user?.let { fields["user"]?.setText(it) }
        pass?.let { fields["pass"]?.setText(it) }
        proxy?.let { fields["proxy"]?.setText(it) }
        payload?.let { fields["payload"]?.setText(it) }
        transportSpinner.setSelection(0, false)
        loading = false
        saveCurrent()
        val filled = listOfNotNull(
            host?.let { "host=$it" },
            port?.let { "port=$it" },
            user?.let { "user=$it" },
            proxy?.let { "proxy=$it" },
            payload?.let { "payload" }
        ).joinToString(", ")
        Toast.makeText(this, "Diterapkan: $filled", Toast.LENGTH_LONG).show()
    }

    /** Buang label seperti "Remote proxy:" / "IP port user pass:" di awal baris. */
    private fun stripLabel(line: String): String {
        val idx = line.indexOf(':')
        if (idx <= 0) return line
        val head = line.substring(0, idx)
        return if (head.contains(' ')) line.substring(idx + 1).trim() else line
    }

    override fun onPause() {
        super.onPause()
        saveCurrent()
    }
}
