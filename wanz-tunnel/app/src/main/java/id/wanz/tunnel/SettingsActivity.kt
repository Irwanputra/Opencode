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
import android.text.Editable
import android.text.InputType
import android.text.TextUtils
import android.text.TextWatcher
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
    private lateinit var mappedDnsSwitch: Switch
    private lateinit var modeProxy: TextView
    private lateinit var modeVpn: TextView
    private lateinit var modeHint: TextView
    private lateinit var dnsHint: TextView

    private lateinit var store: ProfileStore
    private var profiles = mutableListOf<Profile>()
    private var activeIndex = 0
    private var loading = false
    private var vpnMode = false

    private val transportKeys = listOf("ssh", "tls", "ws", "wss")
    private val transportLabels = listOf(
        "SSH langsung", "TLS / SNI", "SSH WebSocket (WS)", "SSH WebSocket + TLS (WSS)"
    )
    private val pingIntervalValues = listOf(5, 10, 15, 30, 60)
    private val pingIntervalLabels = pingIntervalValues.map { "$it dtk" }

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

    private fun note(text: String) = TextView(this).apply {
        this.text = text
        textSize = 11f
        setTextColor(withAlpha(MUTED, 215))
        setLineSpacing(dp(2).toFloat(), 1f)
    }

    private fun fieldBackground(): StateListDrawable {
        val normal = rounded(FIELD, 14, BORDER)
        val focused = rounded(FIELD_FOCUS, 14, withAlpha(CYAN, 180))
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
        setTextColor(TEXT)
        setHintTextColor(withAlpha(MUTED, 155))
        textSize = 15f
        background = fieldBackground()
        setPadding(dp(14), dp(12), dp(14), dp(12))
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
        textSize = 22f
        gravity = Gravity.CENTER
        setTextColor(color)
        background = rounded(withAlpha(color, 24), 14, withAlpha(color, 70))
        setOnClickListener { onClick() }
    }

    private fun segmentButton(label: String) = TextView(this).apply {
        text = label
        textSize = 13f
        gravity = Gravity.CENTER
        letterSpacing = 0.04f
        typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
    }

    private fun styleSegment(button: TextView, selected: Boolean) {
        button.background = if (selected) {
            GradientDrawable(
                GradientDrawable.Orientation.LEFT_RIGHT,
                intArrayOf(VIOLET, CYAN)
            ).apply { cornerRadius = dp(12).toFloat() }
        } else {
            rounded(0, 12)
        }
        button.setTextColor(if (selected) 0xFF071018.toInt() else MUTED)
    }

    private fun toggle(label: String, checked: Boolean) = Switch(this).apply {
        text = label
        setTextColor(TEXT)
        textSize = 13f
        isChecked = checked
        setPadding(0, dp(6), 0, dp(2))
        thumbTintList = android.content.res.ColorStateList(
            arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
            intArrayOf(CYAN, 0xFF8A97AD.toInt())
        )
        trackTintList = android.content.res.ColorStateList(
            arrayOf(intArrayOf(android.R.attr.state_checked), intArrayOf()),
            intArrayOf(withAlpha(CYAN, 130), 0xFF2A3550.toInt())
        )
    }

    private fun setVpnMode(vpn: Boolean) {
        vpnMode = vpn
        if (::modeProxy.isInitialized) {
            styleSegment(modeProxy, !vpn)
            styleSegment(modeVpn, vpn)
        }
        updateModeHint()
    }

    private fun updateModeHint() {
        if (!::modeHint.isInitialized) return
        val port = text("socksPort").ifBlank { "1080" }
        modeHint.text = if (vpnMode) {
            "Semua aplikasi TCP lewat VPN. Android akan meminta izin sekali."
        } else {
            "Hanya aplikasi yang memakai proxy 127.0.0.1:$port yang lewat tunnel."
        }
    }

    private fun updateDnsHint() {
        if (!::dnsHint.isInitialized) return
        val mapped = mappedDnsSwitch.isChecked
        fields["dnsServer"]?.isEnabled = !mapped
        fields["dnsServer"]?.alpha = if (mapped) 0.45f else 1f
        dnsHint.text = if (mapped) {
            "DNS lewat tunnel (mapped-DNS 198.18.0.2) — nama domain diselesaikan di sisi server, tanpa kebocoran DNS."
        } else {
            "DNS kustom dipakai langsung. Catatan: kueri DNS tidak lewat tunnel."
        }
    }

    private fun spinnerAdapter(items: List<String>) = object : ArrayAdapter<String>(
        this, android.R.layout.simple_spinner_item, items
    ) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            return (super.getView(position, convertView, parent) as TextView).apply {
                setTextColor(TEXT)
                textSize = 14f
                setPadding(dp(8), dp(9), dp(8), dp(9))
                background = null
                maxLines = 1
                ellipsize = TextUtils.TruncateAt.END
            }
        }

        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            return (super.getDropDownView(position, convertView, parent) as TextView).apply {
                setTextColor(TEXT)
                textSize = 14.5f
                setPadding(dp(16), dp(13), dp(16), dp(13))
                setBackgroundColor(0xFF141F35.toInt())
            }
        }
    }

    private fun darkSpinner(): Spinner = Spinner(this).apply {
        background = rounded(FIELD, 14, BORDER)
        setPadding(dp(10), 0, dp(10), 0)
        setPopupBackgroundDrawable(rounded(0xFF141F35.toInt(), 14, BORDER))
    }

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG_TOP
        window.navigationBarColor = BG_BOTTOM
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)

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
            background = GradientDrawable(
                GradientDrawable.Orientation.TL_BR,
                intArrayOf(BG_TOP, BG_BOTTOM)
            )
            isFillViewport = true
            clipToPadding = false
            isVerticalScrollBarEnabled = false
            addView(root, ViewGroup.LayoutParams(-1, -2))
        })
    }

    private fun buildUi() {
        root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(20), dp(22), dp(20), dp(40))
        }

        val header = horizontal()
        val brand = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        brand.addView(TextView(this).apply {
            text = "PENGATURAN"
            textSize = 22f
            setTextColor(TEXT)
            letterSpacing = 0.02f
            typeface = Typeface.create("sans-serif-black", Typeface.NORMAL)
        })
        brand.addView(TextView(this).apply {
            text = "WANZ TUNNEL"
            textSize = 10.5f
            setTextColor(CYAN)
            letterSpacing = 0.34f
            typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
        })
        header.addView(brand, LinearLayout.LayoutParams(0, -2, 1f))
        header.addView(TextView(this).apply {
            text = "‹ Kembali"
            textSize = 13f
            gravity = Gravity.CENTER
            setTextColor(CYAN)
            setPadding(dp(12), dp(8), dp(12), dp(8))
            background = rounded(withAlpha(CYAN, 16), 99, withAlpha(CYAN, 60))
            setOnClickListener { saveCurrent(); finish() }
        }, LinearLayout.LayoutParams(-2, -2))
        root.addView(header)

        root.addView(TextView(this).apply {
            text = "Semua opsi tunnel, ping, dan jaringan ada di sini."
            textSize = 13f
            setTextColor(MUTED)
        }, lp(6))

        // ------------------------------------------------------------ PROFIL
        val profileCard = card()
        profileCard.addView(sectionLabel("PROFIL"))
        val profileRow = horizontal()
        profileSpinner = darkSpinner()
        profileRow.addView(profileSpinner, LinearLayout.LayoutParams(0, dp(48), 1f))
        profileRow.addView(
            chipButton("+", CYAN) { addProfile() },
            LinearLayout.LayoutParams(dp(48), dp(48)).apply { leftMargin = dp(8) }
        )
        profileRow.addView(
            chipButton("−", CORAL) { deleteProfile() },
            LinearLayout.LayoutParams(dp(48), dp(48)).apply { leftMargin = dp(6) }
        )
        profileCard.addView(profileRow, lp(10))
        profileCard.addView(labeledField("NAMA PROFIL", "name", "Server 1"), lp(12))
        root.addView(profileCard, lp(16))

        // ---------------------------------------------------------- KONEKSI
        val connCard = card()
        connCard.addView(sectionLabel("KONEKSI"))
        val segment = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            background = rounded(FIELD, 16, BORDER)
            setPadding(dp(4), dp(4), dp(4), dp(4))
        }
        modeProxy = segmentButton("SOCKS5")
        modeVpn = segmentButton("VPN")
        modeProxy.setOnClickListener { setVpnMode(false) }
        modeVpn.setOnClickListener { setVpnMode(true) }
        segment.addView(modeProxy, LinearLayout.LayoutParams(0, dp(42), 1f))
        segment.addView(
            modeVpn,
            LinearLayout.LayoutParams(0, dp(42), 1f).apply { leftMargin = dp(4) }
        )
        connCard.addView(segment, lp(12))

        modeHint = TextView(this).apply {
            textSize = 11.5f
            setTextColor(MUTED)
            setLineSpacing(dp(2).toFloat(), 1f)
        }
        connCard.addView(modeHint, lp(8))

        val transportRow = horizontal(Gravity.BOTTOM)
        val transportBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        transportBox.addView(caption("TRANSPORT"))
        transportSpinner = darkSpinner().apply { adapter = spinnerAdapter(transportLabels) }
        transportBox.addView(
            transportSpinner,
            LinearLayout.LayoutParams(-1, dp(48)).apply { topMargin = dp(7) }
        )
        transportRow.addView(transportBox, LinearLayout.LayoutParams(0, -2, 2f))
        transportRow.addView(
            labeledField("PORT SOCKS5", "socksPort", "1080", InputType.TYPE_CLASS_NUMBER),
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) }
        )
        connCard.addView(transportRow, lp(12))

        val hostRow = horizontal(Gravity.BOTTOM)
        hostRow.addView(
            labeledField("HOST / IP", "host", "contoh: 104.17.70.206"),
            LinearLayout.LayoutParams(0, -2, 2f)
        )
        hostRow.addView(
            labeledField("PORT", "port", "80", InputType.TYPE_CLASS_NUMBER),
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) }
        )
        connCard.addView(hostRow, lp(12))
        connCard.addView(labeledField("USERNAME", "user", "nama pengguna SSH"), lp(12))
        connCard.addView(
            labeledField(
                "PASSWORD", "pass", "password SSH",
                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            ),
            lp(12)
        )
        root.addView(connCard, lp(14))

        // -------------------------------------------------- PAYLOAD & PROXY
        val payloadCard = card()
        payloadCard.addView(sectionLabel("PAYLOAD & PROXY"))
        payloadCard.addView(
            labeledField(
                "PAYLOAD (OPSIONAL)", "payload",
                "GET / HTTP/1.1[crlf]Host: [host][crlf][crlf][split]...",
                lines = 4
            ),
            lp(12)
        )
        payloadCard.addView(
            labeledField("PROXY / EDGE (OPSIONAL)", "proxy", "104.17.70.206:80"),
            lp(12)
        )
        payloadCard.addView(
            labeledField("SNI / HOST TLS (OPSIONAL)", "sni", "contoh: id3-1forcr.zivpn.site"),
            lp(12)
        )
        val wsRow = horizontal(Gravity.BOTTOM)
        wsRow.addView(
            labeledField("HOST HEADER WS", "wsHost", "opsional"),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        wsRow.addView(
            labeledField("PATH WS", "wsPath", "/"),
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
        root.addView(payloadCard, lp(14))

        // --------------------------------------------------------- JARINGAN
        val netCard = card()
        netCard.addView(sectionLabel("JARINGAN"))
        mappedDnsSwitch = toggle("DNS lewat tunnel (mapped-DNS)", true)
        mappedDnsSwitch.setOnCheckedChangeListener { _, _ -> updateDnsHint() }
        netCard.addView(mappedDnsSwitch, lp(6))
        netCard.addView(
            labeledField("DNS KUSTOM", "dnsServer", "1.1.1.1"),
            lp(12)
        )
        dnsHint = note("")
        netCard.addView(dnsHint, lp(8))
        root.addView(netCard, lp(14))

        // -------------------------------------------------------------- PING
        val pingCard = card()
        pingCard.addView(sectionLabel("PING"))
        autoPingSwitch = toggle("Auto ping saat terhubung", true)
        pingCard.addView(autoPingSwitch, lp(6))

        val pingRow = horizontal(Gravity.BOTTOM)
        val intervalBox = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
        intervalBox.addView(caption("INTERVAL"))
        pingIntervalSpinner = darkSpinner().apply { adapter = spinnerAdapter(pingIntervalLabels) }
        intervalBox.addView(
            pingIntervalSpinner,
            LinearLayout.LayoutParams(-1, dp(48)).apply { topMargin = dp(7) }
        )
        pingRow.addView(intervalBox, LinearLayout.LayoutParams(0, -2, 1f))
        pingRow.addView(
            labeledField("TARGET PING", "pingTarget", "1.1.1.1:443"),
            LinearLayout.LayoutParams(0, -2, 1.4f).apply { leftMargin = dp(10) }
        )
        pingCard.addView(pingRow, lp(12))
        pingCard.addView(
            TextView(this).apply {
                text = "Ping sekarang"
                textSize = 12.5f
                gravity = Gravity.CENTER
                setTextColor(CYAN)
                typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
                background = rounded(withAlpha(CYAN, 16), 12, withAlpha(CYAN, 70))
                setPadding(dp(10), dp(10), dp(10), dp(10))
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
        root.addView(pingCard, lp(14))

        // ----------------------------------------------------------- LAINNYA
        val miscCard = card()
        miscCard.addView(sectionLabel("LAINNYA"))
        autoReconnectSwitch = toggle("Sambung ulang otomatis jika putus", true)
        onlyMobileSwitch = toggle("Hanya data seluler (tolak Wi-Fi)", false)
        blockRootSwitch = toggle("Blokir root (tolak perangkat ter-root)", false)
        miscCard.addView(autoReconnectSwitch, lp(6))
        miscCard.addView(onlyMobileSwitch, lp(4))
        miscCard.addView(blockRootSwitch, lp(4))
        root.addView(miscCard, lp(14))

        // --------------------------------------------------------------- LOG
        val logCard = card()
        logCard.addView(sectionLabel("LOG"))
        logCard.addView(
            TextView(this).apply {
                text = "Buka log penuh"
                textSize = 13f
                setTextColor(CYAN)
                setPadding(0, dp(10), 0, dp(6))
                setOnClickListener {
                    startActivity(Intent(this@SettingsActivity, LogActivity::class.java))
                }
            }
        )
        logCard.addView(
            TextView(this).apply {
                text = "Salin log ke clipboard"
                textSize = 13f
                setTextColor(CYAN)
                setPadding(0, dp(6), 0, dp(6))
                setOnClickListener {
                    val txt = TunnelLog.snapshot().joinToString("\n")
                    val cm = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
                    cm.setPrimaryClip(ClipData.newPlainText("WanzTunnel", txt))
                    Toast.makeText(this@SettingsActivity, "Log disalin", Toast.LENGTH_SHORT).show()
                }
            }
        )
        logCard.addView(
            TextView(this).apply {
                text = "Bersihkan log"
                textSize = 13f
                setTextColor(CORAL)
                setPadding(0, dp(6), 0, 0)
                setOnClickListener {
                    TunnelLog.clear()
                    Toast.makeText(this@SettingsActivity, "Log dibersihkan", Toast.LENGTH_SHORT).show()
                }
            }
        )
        root.addView(logCard, lp(14))

        // ------------------------------------------------------- IMPOR CONFIG
        val importCard = card()
        importCard.addView(sectionLabel("IMPOR CONFIG"))
        importCard.addView(
            note("Tempel config (payload + proxy + akun), lalu ketuk Terapkan. " +
                "Baris akun berformat host:port@user:pass."),
            lp(8)
        )
        val importField = EditText(this).apply {
            hint = "GET / HTTP/1.1[crlf]Host: edu.ruangguru.com..." +
                "\n104.17.70.206:80" +
                "\nindo5.vpnjz.com:80@Taekkk67-vpnjantit.com:123"
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_MULTI_LINE
            minLines = 4
            gravity = Gravity.TOP or Gravity.START
            setLineSpacing(dp(3).toFloat(), 1f)
            setTextColor(TEXT)
            setHintTextColor(withAlpha(MUTED, 155))
            textSize = 12.5f
            typeface = Typeface.MONOSPACE
            background = fieldBackground()
            setPadding(dp(14), dp(12), dp(14), dp(12))
            includeFontPadding = false
        }
        importCard.addView(importField, lp(6))
        importCard.addView(
            TextView(this).apply {
                text = "Terapkan ke profil aktif"
                textSize = 13f
                gravity = Gravity.CENTER
                setTextColor(0xFF071018.toInt())
                typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)
                background = GradientDrawable(
                    GradientDrawable.Orientation.LEFT_RIGHT,
                    intArrayOf(VIOLET, CYAN)
                ).apply { cornerRadius = dp(14).toFloat() }
                setPadding(dp(12), dp(12), dp(12), dp(12))
                setOnClickListener { applyConfig(importField.text.toString()) }
            },
            lp(12)
        )
        root.addView(importCard, lp(14))

        root.addView(TextView(this).apply {
            text = "Reset kunci host"
            textSize = 12f
            setTextColor(CYAN)
            gravity = Gravity.CENTER
            setPadding(dp(10), dp(10), dp(10), dp(6))
            setOnClickListener {
                File(filesDir, "known_hosts").delete()
                Toast.makeText(this@SettingsActivity, "Kunci host direset", Toast.LENGTH_SHORT).show()
            }
        }, lp(6))

        root.addView(TextView(this).apply {
            text = "Wanz Tunnel • dibuat untuk koneksi pribadi"
            textSize = 10.5f
            setTextColor(withAlpha(MUTED, 150))
            gravity = Gravity.CENTER
        }, lp(4))

        fields["socksPort"]?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) = updateModeHint()
        })

        setVpnMode(false)
        updateDnsHint()
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
        p.socksPort = text("socksPort").toIntOrNull()?.coerceIn(1024, 65535) ?: 1080
        p.vpn = vpnMode
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
        p.mappedDns = mappedDnsSwitch.isChecked
        p.dnsServer = text("dnsServer").ifBlank { "1.1.1.1" }
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
        fields["socksPort"]?.setText(p.socksPort.toString())
        setVpnMode(p.vpn)
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
        mappedDnsSwitch.isChecked = p.mappedDns
        fields["dnsServer"]?.setText(p.dnsServer)
        loading = false
        updateModeHint()
        updateDnsHint()
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
