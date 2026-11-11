package id.wanz.tunnel

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.StateListDrawable
import android.net.VpnService
import android.os.Build
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

private val BG_TOP = 0xFF070B18.toInt()
private val BG_BOTTOM = 0xFF111A33.toInt()
private val CARD_TOP = 0xF01B2744.toInt()
private val CARD_BOTTOM = 0xF0141F38.toInt()
private val FIELD = 0xFF0B1428.toInt()
private val FIELD_FOCUS = 0xFF101D36.toInt()
private val TEXT = 0xFFF4F7FF.toInt()
private val MUTED = 0xFF8CA0C2.toInt()
private val CYAN = 0xFF5CE1E6.toInt()
private val VIOLET = 0xFF8B7CFF.toInt()
private val TEAL = 0xFF5EF0B0.toInt()
private val AMBER = 0xFFFFC66D.toInt()
private val CORAL = 0xFFFF7A8A.toInt()
private val BORDER = 0x22FFFFFF

class MainActivity : Activity() {
    private val fields = LinkedHashMap<String, EditText>()
    private lateinit var root: LinearLayout
    private lateinit var connectBtn: ConnectButtonView
    private lateinit var connectHint: TextView
    private lateinit var statusPill: LinearLayout
    private lateinit var statusDot: View
    private lateinit var statusText: TextView
    private lateinit var profileSpinner: Spinner
    private lateinit var profileAdapter: ArrayAdapter<String>
    private lateinit var transportSpinner: Spinner
    private lateinit var strictSwitch: Switch
    private lateinit var advancedBody: LinearLayout
    private lateinit var advancedArrow: TextView
    private lateinit var modeProxy: TextView
    private lateinit var modeVpn: TextView
    private lateinit var modeHint: TextView
    private lateinit var socksInfo: TextView

    private lateinit var store: ProfileStore
    private var profiles = mutableListOf<Profile>()
    private var activeIndex = 0
    private var loading = false
    private var pendingProfileId = -1L
    private var vpnMode = false

    private val transportKeys = listOf("ssh", "tls", "ws", "wss")
    private val transportLabels = listOf(
        "SSH langsung", "TLS / SNI", "WebSocket (WS)", "WebSocket + TLS (WSS)"
    )

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
        if (::socksInfo.isInitialized) {
            socksInfo.text = "SOCKS5 lokal • 127.0.0.1:$port"
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

    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.statusBarColor = BG_TOP
        window.navigationBarColor = BG_BOTTOM
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        if (Build.VERSION.SDK_INT >= 33) {
            requestPermissions(arrayOf("android.permission.POST_NOTIFICATIONS"), 0)
        }

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
                        Intent(this@MainActivity, TunnelService::class.java)
                            .setAction(TunnelService.ACTION_STOP)
                    )
                    Toast.makeText(
                        this@MainActivity,
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
        render()
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
            text = "v2.1"
            textSize = 11f
            setTextColor(CYAN)
            letterSpacing = 0.08f
            setPadding(dp(12), dp(6), dp(12), dp(6))
            background = rounded(withAlpha(CYAN, 18), 99, withAlpha(CYAN, 60))
        }, LinearLayout.LayoutParams(-2, -2))
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
        root.addView(hero, lp(18))

        val profileCard = card()
        profileCard.addView(sectionLabel("PROFIL AKTIF"))
        val profileRow = horizontal()
        profileSpinner = Spinner(this).apply {
            background = rounded(FIELD, 14, BORDER)
            setPadding(dp(12), 0, dp(12), 0)
            setPopupBackgroundDrawable(rounded(0xFF141F35.toInt(), 14, BORDER))
        }
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
        root.addView(profileCard, lp(14))

        val serverCard = card()
        serverCard.addView(sectionLabel("SERVER SSH"))
        val hostRow = horizontal(Gravity.BOTTOM)
        hostRow.addView(
            labeledField("HOST / IP", "host", "contoh: 104.17.70.206"),
            LinearLayout.LayoutParams(0, -2, 2f)
        )
        hostRow.addView(
            labeledField("PORT", "port", "80", InputType.TYPE_CLASS_NUMBER),
            LinearLayout.LayoutParams(0, -2, 1f).apply { leftMargin = dp(10) }
        )
        serverCard.addView(hostRow, lp(12))
        serverCard.addView(labeledField("USERNAME", "user", "nama pengguna SSH"), lp(12))
        serverCard.addView(
            labeledField(
                "PASSWORD", "pass", "password SSH",
                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            ),
            lp(12)
        )
        root.addView(serverCard, lp(14))

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
        transportSpinner = Spinner(this).apply {
            background = rounded(FIELD, 14, BORDER)
            setPadding(dp(10), 0, dp(10), 0)
            setPopupBackgroundDrawable(rounded(0xFF141F35.toInt(), 14, BORDER))
            adapter = spinnerAdapter(transportLabels)
        }
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
        root.addView(connCard, lp(14))

        fields["socksPort"]?.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) = updateModeHint()
        })

        val advancedCard = card()
        val advancedHeader = horizontal()
        advancedHeader.addView(
            sectionLabel("PENGATURAN LANJUTAN"),
            LinearLayout.LayoutParams(0, -2, 1f)
        )
        advancedArrow = TextView(this).apply {
            text = "▾"
            textSize = 18f
            setTextColor(CYAN)
            gravity = Gravity.CENTER
        }
        advancedHeader.addView(advancedArrow, LinearLayout.LayoutParams(dp(28), dp(28)))
        advancedHeader.setOnClickListener { toggleAdvanced() }
        advancedCard.addView(advancedHeader)

        advancedBody = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            visibility = View.GONE
        }
        advancedBody.addView(
            labeledField("PROXY / EDGE (OPSIONAL)", "proxy", "104.17.70.206:80"),
            lp(14)
        )
        advancedBody.addView(
            labeledField(
                "PAYLOAD (OPSIONAL)", "payload",
                "GET / HTTP/1.1[crlf]Host: [host][crlf][crlf][split]...",
                lines = 4
            ),
            lp(12)
        )
        advancedBody.addView(
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
        advancedBody.addView(wsRow, lp(12))
        strictSwitch = Switch(this).apply {
            text = "Verifikasi sertifikat TLS ketat"
            setTextColor(TEXT)
            textSize = 13f
            isChecked = true
            setPadding(0, dp(6), 0, dp(2))
        }
        advancedBody.addView(strictSwitch, lp(10))
        advancedCard.addView(advancedBody)
        root.addView(advancedCard, lp(14))

        socksInfo = TextView(this).apply {
            text = "SOCKS5 lokal • 127.0.0.1:1080"
            textSize = 11.5f
            setTextColor(MUTED)
            gravity = Gravity.CENTER
        }
        root.addView(socksInfo, lp(24))

        root.addView(TextView(this).apply {
            text = "Reset kunci host"
            textSize = 12f
            setTextColor(CYAN)
            gravity = Gravity.CENTER
            setPadding(dp(10), dp(8), dp(10), dp(8))
            setOnClickListener {
                File(filesDir, "known_hosts").delete()
                Toast.makeText(this@MainActivity, "Kunci host direset", Toast.LENGTH_SHORT).show()
            }
        }, lp(4))

        root.addView(TextView(this).apply {
            text = "Wanz Tunnel • dibuat untuk koneksi pribadi"
            textSize = 10.5f
            setTextColor(withAlpha(MUTED, 150))
            gravity = Gravity.CENTER
        }, lp(4))

        setVpnMode(false)
    }

    private fun toggleAdvanced() {
        val show = advancedBody.visibility != View.VISIBLE
        advancedBody.visibility = if (show) View.VISIBLE else View.GONE
        advancedArrow.animate()
            .rotation(if (show) 180f else 0f)
            .setDuration(180)
            .start()
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
        loading = false
        updateModeHint()
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
                        Intent(this, TunnelService::class.java).setAction(TunnelService.ACTION_STOP)
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

    private fun toggle() {
        val svc = Intent(this, TunnelService::class.java)
        if (TunnelService.running) {
            startService(svc.setAction(TunnelService.ACTION_STOP))
            return
        }

        saveCurrent()
        val p = profiles.getOrNull(activeIndex) ?: return
        if (p.host.isBlank()) {
            Toast.makeText(this, "Isi IP/host server dulu", Toast.LENGTH_SHORT).show()
            return
        }
        if (p.user.isBlank()) {
            Toast.makeText(this, "Isi username SSH dulu", Toast.LENGTH_SHORT).show()
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
            ConnectButtonView.State.CONNECTING -> "Menyiapkan tunnel…"
            ConnectButtonView.State.ERROR -> "Periksa konfigurasi lalu coba lagi"
            ConnectButtonView.State.IDLE -> "Ketuk untuk menghubungkan"
        }
        connectBtn.contentDescription = when (state) {
            ConnectButtonView.State.CONNECTED -> "Putuskan tunnel"
            else -> "Hubungkan tunnel"
        }
    }

    override fun onResume() {
        super.onResume()
        TunnelService.onStatus = { runOnUiThread { render() } }
        render()
    }

    override fun onPause() {
        super.onPause()
        TunnelService.onStatus = null
        saveCurrent()
    }

    companion object {
        private const val REQ_VPN = 1001
    }
}
