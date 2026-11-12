# Wanz Tunnel — Arah Desain: Klon Fungsional HTTP Custom

Dokumen ini mengunci arah visual v2.9.2. Arah "Konsol" (grafit + kuningan)
dibatalkan atas permintaan pemilik aplikasi: **tampilan harus sama seperti HTTP
Custom**. Yang ditiru adalah susunan, warna, dan bentuk kontrolnya; isinya tetap
fitur Wanz Tunnel yang benar-benar bekerja.

## Ide

HTTP Custom dipakai karena satu layar sudah memuat semua yang dibutuhkan orang
saat menyambung: judul, dua tab, satu baris server, delapan opsi, satu tombol
besar, dan log di tab sebelah. Wanz Tunnel memakai susunan yang sama supaya
tangan yang sudah hafal acuan tidak perlu belajar ulang.

Uji cepat: ambil tangkapan layar, ganti teks "Wanz Tunnel" menjadi "HTTP
Custom", dan hasilnya harus terbaca sebagai aplikasi yang sama. Yang tidak boleh
sama adalah isi palsu: setiap centang, menu, dan tombol di sini tersambung ke
profil atau layanan.

## Yang dilarang

- Tidak ada gradien, glow, elevasi, glassmorphism, atau orb.
- Tidak ada emoji sebagai ikon. Semua ikon adalah **Material Icons** (Apache 2.0)
  yang dibundel sebagai vector drawable `app/src/main/res/drawable/ic_*.xml`.
- Tidak ada kontrol hiasan. Delapan centang di beranda semuanya mengubah field
  profil yang dibaca `TunnelService`; tidak ada toggle yang hanya mengubah warna.
- Tidak ada teks hype atau label dekoratif `01 / 02 / 03`.
- Tidak ada huruf kapital semua sebagai gaya. Pengecualiannya hanya merek
  "WANZ TUNNEL" dan label aksi tombol (`HUBUNGKAN`, `PUTUSKAN`, `COBA LAGI`)
  yang memang kapital pada acuan.
- Mode gelap bukan inversi mentah; kedua palet diukur terpisah.

Aturan yang bisa diperiksa mesin dijaga `tools/design_gate.py --strict`
(gradien, glow, emoji, variasi sudut, kontras kedua palet, tinggi sentuh, label
aksesibilitas, huruf kapital, elipsis, easing memantul, ukuran font pecahan).
Sisanya dinilai dari tangkapan layar.

## Token

Warna dipasang sebagai token waktu-jalankan oleh `applyPalette()` sebelum view
dibuat. Rasio kontras diukur terhadap permukaan tempat token dipakai.

| Peran | Terang | Gelap | Kontras (terang / gelap) |
|---|---|---|---|
| Latar (`BG`) | `#FFFFFF` | `#1E1E1E` | — |
| Panel, laci, log (`PANEL`) | `#F5F5F5` | `#252525` | INK 15,80 / 15,33 terhadap `PANEL` |
| Bidang isian (`FIELD`) | `#FFFFFF` | `#1E1E1E` | INK 17,22 / 16,67 |
| Tinta (`INK`) | `#1B1B1B` | `#FFFFFF` | 17,22 / 16,67 terhadap `BG` |
| Teks sekunder (`MUTED`) | `#5F5F5F` | `#BDBDBD` | 6,39 / 8,87 |
| Teks samar (`FAINT`) | `#6B6B6B` | `#9E9E9E` | 5,33 / 6,22 thd `BG`; 4,89 / 5,72 thd `PANEL` |
| Garis rambut (`HAIR`) | `#DDDDDD` | `#3C3C3C` | bukan teks; 1dp cukup |
| Terhubung (`OK`) | `#2E7D32` | `#4CAF50` | 5,13 / 6,00 |
| Peringatan (`WARN`) | `#8A5300` | `#FFD54F` | 6,33 / 11,81 |
| Gagal (`ERR`) | `#B3261E` | `#FF6B81` | 6,54 / 6,09 |
| Identitas (`ACCENT`) | `#2E7D32` | `#4CAF50` | 5,13 / 6,00 |
| Di atas aksen (`ON_ACCENT`) | `#FFFFFF` | `#0D1B0E` | 5,13 / 6,40 |

Hijau tunggal dipakai untuk judul "Wanz", garis tab aktif, kotak centang
terpilih, tepi tombol utama, dan tombol tambah. Tidak ada warna kedua sebagai
aksen.

Ukuran: garis 1dp (dibulatkan ke piksel utuh), tinggi sentuh minimal 48dp,
tombol sambung 56dp, laci 86% lebar layar (maksimal 320dp).

## Tema

Tiga pilihan di Pengaturan > Tampilan: **Ikuti sistem**, **Terang**, **Gelap**.
Pilihan disimpan global di `shared_prefs/app_cfg.xml` (`theme_mode`) dan
diterapkan dengan membangun ulang halaman, bukan lewat resource `-night` saja.
`InkActivity` memasang palet di `onCreate`, lalu `applyWindowChrome()` setelah
`super.onCreate()` supaya ikon status bar dan navigation bar benar-benar ikut
palet (memanggilnya sebelum `super` membuat `WindowInsetsController` belum ada,
dan ikon gelap tertinggal di atas latar gelap). Dialog memakai tema eksplisit
dari palet aktif, bukan palet sistem.

## Tipografi

Dua keluarga, keduanya dari Google Fonts, dibundel (Apache 2.0) dan dipotong ke
karakter yang dipakai (total ± 100 KB):

- **Roboto 400/500** untuk seluruh teks antarmuka: judul, tab, label centang,
  tombol, isi dialog, kalimat pengaturan.
- **Roboto Mono 400/500** untuk data: alamat server, port, angka trafik, uptime,
  ping, dan log.

Roboto dipilih justru karena sama dengan acuan; aplikasi ini tidak lagi mencoba
terlihat seperti template dengan font lain.

| font | tinggi x / em | tebal garis @26px | @29px | @34px |
|---|---|---|---|---|
| **Roboto 400** | 0,528 | 2,67 | 2,67 | 3,00 |
| **Roboto Mono 400** | 0,528 | 2,67 | 2,67 | 3,00 |

- Judul aplikasi 22sp medium: "Wanz" hijau, "Tunnel" tinta.
- Label tab 15sp medium. Judul bagian 15sp medium hijau.
- Isian server 14,5sp mono; label mikro 10,5sp mono; log 12sp mono.
- Label kotak centang 14,5sp Roboto; tombol aksi 15sp medium.
- **Tulisan tidak boleh geter.** Dua penyebabnya dibereskan di `Face`: ukuran sp
  yang menghasilkan piksel pecahan dibulatkan oleh `Face.px()` lewat `inkSize()`,
  dan `Face.tracking()` memilih `letterSpacing` sehingga langkah glyph mono jatuh
  di batas piksel. `design_gate.py` menganggap `COMPLEX_UNIT_SP` atau
  `textSize = dp(...)` di luar `Face.kt` sebagai galat.

## Susunan beranda

1. **Bilah atas 56dp**: menu di kiri; judul "Wanz Tunnel"; impor config; menu lain.
2. **Dua tab 48dp** (`SSH`, `LOG`) dengan garis bawah hijau 3dp pada tab aktif,
   lalu garis rambut selebar layar.
3. **Tab SSH**:
   - baris profil aktif (ketuk untuk memilih profil) dan label pembungkus
     `SSH · VPN` / `SSH + TLS · VPN` dan seterusnya;
   - bidang `ip:port@user:pass` bergaris bawah, Roboto Mono, satu baris;
   - kisi centang **dua kolom, empat baris**, tiap sel tinggi 48dp;
   - tombol sambung bergaris tepi 1,5dp, tinggi 56dp, label berubah
     `HUBUNGKAN` → `MENYAMBUNG…` → `PUTUSKAN` / `COBA LAGI`;
   - baris status satu sampai dua baris;
   - tiga bacaan sejajar: Unduh, Unggah, Aktif. Kolom Aktif juga memicu ping.
4. **Tab LOG**: baris "Ikuti" + salin + bersihkan, lalu daftar log
   `[jam:menit:detik] pesan` dengan garis pemisah tipis. Warna pesan per level:
   INFO tinta, PING hijau, WARN kuning, ERROR merah muda.
5. **Tombol bulat (+)** 56dp di kanan bawah: menambah profil baru lalu membuka
   Pengaturan. Profil lama dipilih lewat baris profil atau laci "Profil".
6. **Laci kiri**: logo heksagon "WT", nama dan versi, lalu grup
   **Utilitas** (Profil, Payload, SNI/host TLS, Tema), **Koneksi** (Pengaturan,
   Impor config, Ping sekarang), dan **Alat** (Log, Salin log, Bersihkan log,
   Tentang). Laci bisa digulir pada layar pendek.

Delapan centang dan field yang diubahnya:

| Label | Field profil | Akibat nyata |
|---|---|---|
| Pakai payload | `usePayload` | `TunnelService` mengirim payload hanya bila dicentang |
| SSL | `transport` | `tls` / `wss` |
| WebSocket | `transport` | `ws` / `wss` |
| Verifikasi TLS | `strictTls` | verifikasi sertifikat TLS |
| DNS lewat tunnel | `mappedDns` | resolusi nama di sisi server |
| Ping otomatis | `autoPing` | ping berkala saat terhubung |
| Sambung ulang | `autoReconnect` | sambung ulang otomatis saat putus |
| Seluler saja | `onlyMobileData` | menolak koneksi saat memakai Wi-Fi |

## Komponen

- `SquareCheckView` (24dp, sudut 2dp): kotak garis tinta saat mati; bidang hijau
  dengan centang gelap saat hidup.
- `InkToggle`: label Roboto di kiri + kotak centang 22dp di kanan, dipakai di
  Pengaturan. Menggantikan `Switch` bawaan.
- `InkSelect`: bidang bergaris bawah + panah garis, nilai Roboto Mono, daftar
  pilihan lewat dialog.
- `FieldUnderline`: garis bawah digambar dari bounds (1dp biasa, 2dp saat fokus),
  bukan `LayerDrawable` yang di-inset; inset itu melebar jadi blok tinta pada
  field multi-baris.
- `HexLogoView`: heksagon putih dengan "W" tinta dan "T" hijau.
- Semua kontrol sentuh berlabel `contentDescription` dan minimal 48dp.

## Gerak

Hanya dua, keduanya membawa informasi:

- Laci masuk/keluar 180ms; scrim meredup bersamaan.
- Tombol dan centang memakai umpan balik haptic, bukan animasi dekoratif.

Keduanya menghormati `ANIMATOR_DURATION_SCALE` sistem lewat
`Face.reducedMotion()`; bila animasi dimatikan, durasi menjadi nol.

## Status

- `Terhubung` hanya muncul jika tunnel aktif **dan** self-test DNS + TCP berhasil.
- Jika tunnel aktif tetapi internet gagal: "Tunnel aktif, tetapi uji internet
  gagal", warna `WARN`.
- Alamat proxy lokal tidak ditampilkan sebagai status saat terhubung.
- Log memakai jam perangkat dan level yang diturunkan dari tag/pesan.

## Latar foto (ditunda)

Rencana latar foto Freya JKT48 beserta cara mengukur kontrasnya ada di
`design/wallpaper/README.md`. Pemasangannya ditunda atas permintaan pemakai;
aplikasi tetap bercanvas solid.
