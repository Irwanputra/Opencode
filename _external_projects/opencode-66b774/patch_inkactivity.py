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


# ------------------------------------------------------------------ Theme.kt
patch('Theme.kt', [
    ('''/**
 * Samakan jendela, status bar, dan navigation bar dengan palet aktif.''',
     '''/**
 * Activity dasar "Konsol".
 *
 * Dua hal dikerjakan di sini supaya tidak ditiru tiga kali:
 *
 * 1. Palet dan chrome jendela dipasang sebelum subclass membuat view apa pun.
 * 2. Kalau preferensi tema berubah ketika halaman ini sedang di belakang
 *    (mis. pengguna memilih Gelap di pengaturan), halaman dibangun ulang saat
 *    kembali ke depan. Tanpa itu, halaman lama tetap memakai warna lama dan
 *    tampil campur aduk.
 */
abstract class InkActivity : Activity() {
    private var builtWithMode = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        applyPalette(this)
        applyWindowChrome(this)
        builtWithMode = AppPrefs.themeMode(this)
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        if (AppPrefs.themeMode(this) != builtWithMode) recreate()
    }
}

/**
 * Samakan jendela, status bar, dan navigation bar dengan palet aktif.'''),
])

# --------------------------------------------------------------- MainActivity
patch('MainActivity.kt', [
    ('class MainActivity : Activity() {', 'class MainActivity : InkActivity() {'),
    ('''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        applyPalette(this)
        applyWindowChrome(this)
        window.setSoftInputMode''',
     '''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.setSoftInputMode'''),
])

# ----------------------------------------------------------- SettingsActivity
patch('SettingsActivity.kt', [
    ('class SettingsActivity : Activity() {', 'class SettingsActivity : InkActivity() {'),
    ('''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        applyPalette(this)
        applyWindowChrome(this)
        window.setSoftInputMode''',
     '''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        window.setSoftInputMode'''),
    # ganti tema: simpan lalu bangun ulang; halaman lain ikut lewat InkActivity
    ('''            if (AppPrefs.themeMode(this@SettingsActivity) != which) {
                AppPrefs.setThemeMode(this@SettingsActivity, which)
                recreate()
            }''',
     '''            if (AppPrefs.themeMode(this@SettingsActivity) != which) {
                AppPrefs.setThemeMode(this@SettingsActivity, which)
                // Halaman ini dibangun ulang sekarang; halaman lain yang masih
                // terbuka ikut dibangun ulang saat kembali ke depan.
                recreate()
            }'''),
])

# ---------------------------------------------------------------- LogActivity
patch('LogActivity.kt', [
    ('class LogActivity : Activity() {', 'class LogActivity : InkActivity() {'),
    ('''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        applyPalette(this)
        applyWindowChrome(this)
''',
     '''    override fun onCreate(b: Bundle?) {
        super.onCreate(b)
'''),
])
