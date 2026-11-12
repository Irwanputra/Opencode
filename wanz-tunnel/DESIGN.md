# Wanz Tunnel — Arah Desain "Konsol"

Dokumen ini mengunci satu arah visual. Tujuannya bukan "terlihat modern",
tetapi **terlihat dibuat dengan sengaja** — sehingga tidak bisa langsung ditebak
sebagai UI hasil generator.

Arah "Konsol" adalah penyempurnaan arah "Panel" (v2.8). Bentuknya dipreteli dari
dua aplikasi yang benar-benar dipakai orang, **bukan dari tampilannya**: DarkTunnel
(kartu koneksi berisi baris label/nilai + tombol CONNECT melebar) dan HTTP Custom
(bacaan RX/TX yang berjalan, daftar profil pendek, log mono). Yang diambil adalah
cara keduanya dipakai; warnanya sengaja dibedakan.

## Ide

Wanz Tunnel adalah alat jaringan. Tampilannya mengikuti **konsol instrumen**:
kanvas grafit hangat atau kertas, tinta, garis rambut, angka monospace tabular,
dan satu tombol aksi yang menempel di dasar layar. Warna tidak dipakai sebagai
hiasan; warna adalah status koneksi dan satu tombol utama saja.

Uji cepat: kalau logo diganti logo lain, aplikasi ini masih jelas "alat tunnel"
karena susunannya mengikuti isi (status, ping, uptime, trafik, server, log),
bukan susunan kartu generik.

## Yang dilarang (filter anti-slop)

Mengacu pada `_design_tools/` (ruang lingkup: `ui-craft`, `anti-ai-slop-ui`,
`web-interface-guidelines`, `anti-ai-slop`) dan `smoothui.dev/blog/ai-design-slop`:

- Tidak ada gradien ungu/indigo, aurora, glow, atau orb. Aksen aplikasi ini
  kuningan (`#C9A22F` / `#7E5B10`) — sengaja bukan ungu dan bukan biru, dua warna
  yang dipakai DarkTunnel dan HTTP Custom.
- Tidak ada glassmorphism, bayangan lembut, atau kartu kaca. Tidak ada elevasi.
- Tidak ada emoji sebagai ikon. Ikon digambar sendiri dengan garis (`SlidersView`,
  `Glyphs`).
- Tidak ada hero di tengah dengan satu tombol besar.
- Tidak ada deretan kartu berukuran sama.
- Sudut tidak seragam: 1dp untuk bidang isian, 2dp untuk panel dan tombol,
  0dp untuk garis dan rel status (`R_FIELD`, `R_PANEL`, `R_HAIR`).
- Tidak ada teks hype ("super cepat", "aman total") atau label dekoratif
  `01 / 02 / 03`.
- Tidak ada terminal hijau-di-hitam dan tidak ada aksen asam.
- Tidak ada animasi yang tidak membawa informasi.
- Mode gelap bukan inversi mentah: tiap pasangan teks/bidang diukur dulu.

Aturan yang bisa diperiksa mesin dijaga `tools/design_gate.py --strict`
(gradien, glow, emoji, variasi sudut, kontras kedua palet, tinggi sentuh, label
aksesibilitas, huruf kapital, elipsis, easing memantul). Sisanya dinilai dari
tangkapan layar.

## Token

Warna didefinisikan dua kali, terang dan gelap, dan dipasang sebagai token
waktu-jalankan oleh `applyPalette()` sebelum view apa pun dibuat. Angka di kolom
kanan adalah rasio kontras WCAG token terhadap permukaan tempatnya dipakai.

| Peran | Terang | Gelap | Kontras (terang / gelap) |
|---|---|---|---|
| Latar (`BG`) | `#F1F1EC` | `#131410` | — |
| Panel, log (`PANEL`) | `#E8E8E2` | `#1E1F19` | — |
| Bidang isian (`FIELD`) | `#EAEAE4` | `#1A1B15` | INK 15,85 / 16,44 terhadap `BG` |
| Tinta, isi tombol primer (`INK`) | `#15171A` | `#F2F2EA` | ON_INK 16,28 / 16,04 terhadap INK |
| Teks sekunder (`MUTED`) | `#5F645F` | `#A9ADA4` | 5,33 / 8,10 terhadap `BG` |
| Teks samar, mono (`FAINT`) | `#646862` | `#8B8F87` | 5,01 / 5,62 thd `BG`, 4,62 / 5,04 thd `PANEL` |
| Garis rambut (`HAIR`) | `#C7C9C2` | `#32342C` | bukan teks: 1,8:1 cukup untuk 1dp |
| Terhubung (`OK`) | `#146B46` | `#5BC08A` | 5,75 / 8,24 terhadap `BG` |
| Menyambung, peringatan (`WARN`) | `#8A5300` | `#EFAE3C` | 5,59 / 8,22 terhadap `BG` |
| Gagal (`ERR`) | `#A3261B` | `#EF7F68` | 6,50 / 6,96 terhadap `BG` |
| Aksen kuningan (`ACCENT`) | `#7E5B10` | `#C9A22F` | 5,47 / 7,66 terhadap `BG`, ON_ACCENT 6,00 / 7,58 |

Beda `MUTED` dan `FAINT` bukan cuma terang: `MUTED` selalu proza (kalimat
penjelas), `FAINT` selalu mono (placeholder, nilai kosong, cap waktu log).

Ukuran: garis 1dp, sudut per peran seperti di atas, tinggi sentuh minimal 48dp,
tombol aksi 58dp.

## Tema

Tiga pilihan di Pengaturan > Tampilan: **Ikuti sistem**, **Terang**, **Gelap**.
Pilihan disimpan global di `shared_prefs/app_cfg.xml` (kunci `theme_mode`) dan
diterapkan dengan membangun ulang halaman, bukan lewat resource `-night` saja:
`InkActivity` memasang palet di `onCreate` dan `recreate()` di `onResume` kalau
preferensi berubah saat halaman di belakang. Tanpa itu, halaman lama tetap
memakai warna lama dan layar jadi campur aduk. Chrome jendela (status bar,
navigation bar, splash tint) ditutup dari kode lewat `applyWindowChrome()` agar
tidak mengikuti pengaturan HP secara diam-diam. Dialog pilihan (mis. dialog
"Tema") dibangun dengan tema eksplisit dari palet aktif, bukan palet sistem.

## Tipografi

- Dua keluarga, keduanya dibundel dari Google Fonts dan dipotong ke karakter yang
  dipakai aplikasi (total 206 KB): **JetBrains Mono** untuk angka, alamat, dan log;
  **Chivo** untuk kalimat (`Face.mono`, `Face.prose`). Font bawaan HP (Roboto)
  dibuang: di aplikasi jaringan, kalimat yang memakai font sistem membuat seluruh
  layar terbaca seperti template.
- Pemilihannya diukur, bukan selera. Tinggi x (seberapa besar huruf kecil) dan
  tebal garis saat di-render pada densitas 2,75:

  | font | tinggi x / em | garis @26px | @29px | @34px |
  |---|---|---|---|---|
  | Roboto 400 (bawaan HP) | 0,528 | 2,67 | 2,67 | 3,00 |
  | IBM Plex Mono 400 (sebelumnya) | 0,516 | 2,33 | 2,67 | 3,00 |
  | **JetBrains Mono 400** | **0,550** | 2,00 | 3,00 | 3,00 |
  | **Chivo 400** | 0,511 | **3,00** | **4,00** | **4,00** |

  Tinggi x terbesar dan angka tabular membuat JetBrains Mono paling terbaca di
  deret bacaan; Chivo satu-satunya yang tetap di atas tiga piksel pada semua
  ukuran kalimat, jadi teks penjelas tidak jadi benang.
- Label micro 9,5sp mono dengan tracking +0,04: nama kolom, bukan kalimat. Setelah
  langkah glyph dibulatkan, tracking efektifnya jadi +0,054 em pada 26px
  (15,6px → 17px) — selisihnya sepersepuluh piksel huruf, tidak terlihat.
- Angka 12,5–16sp mono; perubahan antar-sekatan tidak membuat layout meloncat.
- Judul status 23sp medium; judul halaman 27sp tracking negatif tipis.
- Tidak ada huruf kapital semua sebagai gaya; hanya merek "WANZ TUNNEL".
- **Tulisan tidak boleh geter.** Dua penyebabnya dibereskan di `Face`:
  ukuran sp yang menghasilkan piksel pecahan (9,5sp × densitas 2,75 = 26,125px)
  dibulatkan ke piksel utuh oleh `Face.px` lewat `inkSize()`, dan
  `Face.tracking()` memilih nilai `letterSpacing` sehingga langkah glyph mono
  (0,6em — pada 26px berarti 15,6px) jatuh lagi di batas piksel. Semua kolom
  bacaan rata kiri dengan lebar tetap, jadi angka yang berubah tiap detik tidak
  menggeser tetangganya. Aturan ini dijaga `design_gate.py`: `COMPLEX_UNIT_SP`
  atau `textSize = dp(...)` di luar `Face.kt` dianggap galat.

## Susunan beranda

1. Rel status 3dp di tepi atas: abu saat diam, hijau saat terhubung, merah saat
   gagal, satu segmen berjalan saat menyambung.
2. Kop: tanda kotak tinta + "WANZ TUNNEL", tombol geser di kanan.
3. Status: satu baris kondisi (`Terputus`, `Menyambungkan`, `Terhubung`,
   `Terhubung, tanpa internet`, `Gagal`) + penjelas satu kalimat, dan penghitung
   profil `2/3` di kanan.
4. Kartu koneksi: baris profil dengan pemindah `‹ ›` (multi-profil, tetap satu
   sentuhan), lalu baris `target`, `akun`, `pembungkus` dipisah garis rambut.
5. Deret bacaan tiga kolom dengan garis pembagi: **kunde**, **kirim**, **aktif**
   — angka besar di atas, laju per detik dan puncak sesi di bawah.
6. Rel ping: nilai terbaru + riwayat bilah (12 slot).
7. Log lima baris terakhir, panel mono, tap untuk membuka log penuh.
8. Bilah aksi menempel di dasar layar: CONNECT/PUTUS 58dp, tetap kelihatan saat
   halaman digulir, lalu baris versi.

Pengaturan dan Log memakai sistem yang sama: judul bagian bergaris rambut, field
bergaris bawah saja (bukan kotak abu komponen default), daftar aksi tanpa kartu.
`InkSelect` dan `InkToggle` menggambar dirinya sendiri dan menjamin tinggi sentuh
48dp, karena `Spinner` bawaan masih terasa komponen sistem. Garis bawah field
digambar dari bounds (`FieldUnderline`): 1dp biasa, 2dp saat fokus. Bukan
`LayerDrawable` yang di-inset dari atas — pada field multi-baris (Payload, Impor
config) celah inset itu melebar jadi blok tinta setinggi field, dan field fokus
tampak seperti kertas di layar gelap.

Mode tunggal: **VPN**, seperti HTTP Custom. Tidak ada pilihan SOCKS5/VPN; SOCKS5
hanya detail internal tun2socks.

## Gerak

Hanya dua, keduanya membawa informasi:

- Segmen rel status berjalan selama proses menyambung.
- Garis kemajuan di tombol selama proses menyambung.

Keduanya menghormati `ANIMATOR_DURATION_SCALE` sistem. Tidak ada animasi masuk,
parallax, atau denyut saat sudah terhubung.

## Status

- `Terhubung` hanya muncul jika tunnel aktif **dan** self-test DNS + TCP berhasil.
- Jika tunnel aktif tetapi internet gagal: `Terhubung, tanpa internet`, warna
  kuning kuningan tua, disertai penjelasan.
- Alamat proxy lokal tidak ditampilkan sebagai status saat terhubung.

## Latar foto (disiapkan, belum dipasang)

Rencana latar foto Freya JKT48 beserta dua belas kandidat HD dan cara mengukur
kontrasnya ada di `design/wallpaper/README.md`. Pemasangannya ditunda atas
permintaan pemakai; aplikasi tetap bercanvas solid. Kalau nanti dipasang, panel
tidak dibuat transparan begitu saja: alpha `0xDB` di atas scrim `BG` 70 persen,
dengan angka yang sudah diukur per foto (`tools/wall_contrast.py`).
