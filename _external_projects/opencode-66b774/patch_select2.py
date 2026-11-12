from pathlib import Path

SRC = Path('app/src/main/java/id/wanz/tunnel')


def patch(path, pairs):
    p = SRC / path
    s = p.read_text()
    for old, new in pairs:
        assert s.count(old) == 1, f'{path}: {s.count(old)}x {old[:70]!r}'
        s = s.replace(old, new)
    p.write_text(s)
    print('patched', path)


# ---------------------------------------------------------------- InkSelect
patch('InkSelect.kt', [
    # caption: label kolom, dipakai untuk judul dialog dan pembaca layar
    ('''    var onSelect: ((Int) -> Unit)? = null''',
     '''    var onSelect: ((Int) -> Unit)? = null

    /**
     * Nama kolom, mis. "Transport". Nilai yang digambar di kanvas tidak bisa
     * dibaca TalkBack, jadi nama kolom dan nilai digabung ke [contentDescription]
     * dan nama kolom jadi judul dialog.
     */
    var caption: String = ""
        set(value) {
            field = value
            announce()
        }'''),
    # options / selectedIndex -> announce()
    ('''            field = value
            if (selectedIndex >= value.size) selectedIndex = 0
            contentDescription = value.getOrElse(selectedIndex) { "" }
            invalidate()''',
     '''            field = value
            if (selectedIndex >= value.size) selectedIndex = 0
            announce()
            invalidate()'''),
    ('''            field = value.coerceIn(0, (options.size - 1).coerceAtLeast(0))
            contentDescription = options.getOrElse(field) { "" }
            invalidate()''',
     '''            field = value.coerceIn(0, (options.size - 1).coerceAtLeast(0))
            announce()
            invalidate()'''),
    # dialog ikut palet aplikasi, bukan palet sistem; plus judul
    ('''        AlertDialog.Builder(context)
            .setItems(options.toTypedArray()) { _, which ->''',
     '''        // Tema dialog dipilih dari palet yang aktif, bukan dari pengaturan HP:
        // saat pengguna memilih Gelap manual di HP terang, dialog tetap gelap.
        val dlgTheme = if (darkActive)
            android.R.style.Theme_DeviceDefault_Dialog_Alert
        else
            android.R.style.Theme_DeviceDefault_Light_Dialog_Alert
        val builder = AlertDialog.Builder(context, dlgTheme)
        if (caption.isNotBlank()) builder.setTitle(caption)
        builder.setItems(options.toTypedArray()) { _, which ->'''),
    # announce()
    ('''    override fun performClick(): Boolean {''',
     '''    /** Bicara versi dari nilai yang digambar: "Transport, SSH langsung". */
    private fun announce() {
        val value = options.getOrElse(selectedIndex) { "" }
        contentDescription = if (caption.isBlank()) value else "$caption, $value"
    }

    override fun performClick(): Boolean {'''),
])

# ------------------------------------------------------- SettingsActivity
patch('SettingsActivity.kt', [
    ('''    private fun select(items: List<String>) = InkSelect(this).apply {
        options = items
    }''',
     '''    private fun select(caption: String, items: List<String>) =
        InkSelect(this).apply {
            this.caption = caption
            options = items
        }'''),
    ('themeSelect = select(THEME_LABELS)',
     'themeSelect = select("Tema", THEME_LABELS)'),
    ('transportSelect = select(transportLabels)',
     'transportSelect = select("Transport", transportLabels)'),
    ('pingIntervalSelect = select(pingIntervalLabels)',
     'pingIntervalSelect = select("Interval ping", pingIntervalLabels)'),
    ('''        profileSelect = InkSelect(this)''',
     '''        profileSelect = InkSelect(this).apply { caption = "Profil" }'''),
])
