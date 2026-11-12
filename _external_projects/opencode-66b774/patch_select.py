from pathlib import Path

p = Path('app/src/main/java/id/wanz/tunnel/InkSelect.kt')
s = p.read_text()

old_doc = ''' * Pemilih opsi "Panel" - menggantikan `android.widget.Spinner`.'''
assert old_doc.splitlines()[0].strip() in s or 'Pemilih opsi' in s

# 1. dokumen
s = s.replace(
    ' * Pemilih opsi "Panel" \u2014 menggantikan `android.widget.Spinner`.\n'
    ' *\n'
    ' * Spinner bawaan masih tampil sebagai komponen default sistem (rubrik\n'
    ' * `anti-ai-slop-ui`, *component defaultness*). Ini bidang datar bersudut\n'
    ' * [R_FIELD] dengan garis rambut, nilai memakai IBM Plex Mono, panah garis\n'
    ' * mengikuti bahasa ikon lain, dan daftar pilihan memakai dialog sistem agar\n'
    ' * perilakunya (gestur, aksesibilitas) tetap milik platform.',
    ' * Pemilih opsi "Konsol" \u2014 menggantikan `android.widget.Spinner`.\n'
    ' *\n'
    ' * Spinner bawaan masih terasa komponen default sistem (rubrik\n'
    ' * `anti-ai-slop-ui`, *component defaultness*). Ini bidang bergaris bawah\n'
    ' * saja, sama seperti kolom isian: tanpa kotak, tanpa isi abu-abu. Nilai\n'
    ' * memakai IBM Plex Mono, panah digambar dengan garis, dan daftar pilihan\n'
    ' * memakai dialog sistem supaya perilakunya tetap milik platform.')

# 2. gambar garis bawah saja
s = s.replace('''    override fun onDraw(canvas: Canvas) {
        val w = width.toFloat()
        val h = height.toFloat()
        val r = dp(R_FIELD.toFloat())

        fill.color = BG
        canvas.drawRoundRect(0.5f, 0.5f, w - 0.5f, h - 0.5f, r, r, fill)
        edge.color = if (isPressed) INK else HAIR
        canvas.drawRoundRect(0.5f, 0.5f, w - 0.5f, h - 0.5f, r, r, edge)

        value.typeface = Face.mono(context)
        value.textSize = dp(14f)
        value.color = INK
        val text = options.getOrElse(selectedIndex) { "\u2014" }
        val base = h / 2f - (value.ascent() + value.descent()) / 2f
        canvas.drawText(text, dp(12f), base, value)

        val ax = w - dp(18f)''',
'''    override fun onDraw(canvas: Canvas) {
        val w = width.toFloat()
        val h = height.toFloat()

        // Hanya garis bawah, sama seperti kolom isian: semua bidang satu
        // bahasa, bukan kotak-kotak komponen siap pakai.
        edge.color = if (isPressed) INK else HAIR
        edge.strokeWidth = if (isPressed) dp(1.6f) else dp(1f)
        canvas.drawLine(0f, h - 0.5f, w, h - 0.5f, edge)

        value.typeface = Face.mono(context)
        value.textSize = dp(14f)
        value.color = INK
        val text = options.getOrElse(selectedIndex) { "\u2014" }
        val base = (h - dp(6f)) / 2f - (value.ascent() + value.descent()) / 2f
        canvas.drawText(text, 0f, base, value)

        val ax = w - dp(14f)''')

# 3. cat sisa yang tidak dipakai lagi
s = s.replace('    private val fill = Paint(Paint.ANTI_ALIAS_FLAG)\n', '')
p.write_text(s)

m = Path('app/src/main/java/id/wanz/tunnel/MainActivity.kt')
t = m.read_text()
assert 'txRate.text = "puncak \u2014"' in t
m.write_text(t.replace('txRate.text = "puncak \u2014"', 'txRate.text = "maks \u2014"'))

st = Path('app/src/main/java/id/wanz/tunnel/SettingsActivity.kt')
u = st.read_text()
old_note = ('            note("Gelap memakai grafit hangat dengan aksen kuningan; terang memakai " +\n'
            '                "kertas dengan tinta tua. Ganti di sini, tidak mengikuti pengaturan HP " +\n'
            '                "kalau Terang atau Gelap dipilih."),')
new_note = ('            note("Gelap: grafit hangat dengan aksen kuningan. Terang: kertas dengan " +\n'
            '                "tinta tua. Ikuti sistem mengikuti pengaturan HP."),')
assert u.count(old_note) == 1
st.write_text(u.replace(old_note, new_note))
print('ok')
