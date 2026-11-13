# Wanz Tunnel — Arah Desain: Klon Fungsional HTTP Custom

Dokumen ini mengunci arah visual v2.9.4. Arah "Konsol" (grafit + kuningan)
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
- Tidak ada menu tiga titik di bilah atas dan tidak ada tombol tambah mengambang.
  Menambah profil lewat laci **Profil** → "Tambah profil baru"; mengubah profil
  aktif lewat laci **Profil** → "Ubah profil aktif". Tidak ada lagi entri
  "Pengaturan" di laci karena pintasan itu hanya membuka layar yang sama.
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
terpilih, dan tepi tombol utama. Tidak ada warna kedua sebagai aksen.

Ukuran: garis 1dp (dibulatkan ke piksel utuh), tinggi sentuh minimal 48dp,
tombol sambung 56dp, laci 86% lebar layar (maksimal 320dp).

## Tema

Tiga pilihan di laci **Tema**: **Ikuti sistem**, **Terang**, **Gelap**.
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

1. **Bilah atas 56dp**: menu di kiri; judul "Wanz Tunnel" di tengah.
2. **Dua tab 48dp** (`SSH`, `LOG`) dengan garis bawah hijau 3dp pada tab aktif,
   lalu garis rambut selebar layar.
3. **Tab SSH**:
   - baris profil aktif (ketuk untuk memilih profil) dan label pembungkus
     `SSH · VPN` / `SSH + TLS · VPN` dan seterusnya;
   - bidang `ip:port@user:pass` bergaris bawah, Roboto Mono, satu baris;
   - kisi centang **dua kolom** (sembilan sel), tiap sel tinggi 48dp;
   - tombol sambung bergaris tepi 1,5dp, tinggi 56dp, label berubah
     `HUBUNGKAN` → `MENYAMBUNG…` → `PUTUSKAN` / `COBA LAGI`;
   - baris status satu sampai dua baris;
   - tiga bacaan sejajar: Unduh, Unggah, Aktif. Kolom Aktif juga memicu ping.
4. **Tab LOG**: baris "Ikuti" + salin + bersihkan, lalu daftar log
   `[jam:menit:detik] pesan` dengan garis pemisah tipis. Warna pesan per level:
   INFO tinta, PING hijau, WARN kuning, ERROR merah muda.
5. **Laci kiri**: logo heksagon "WT", nama dan versi, lalu grup
   **Utilitas** (Profil, Payload, Proxy, SlowDNS, Tema) dan **Alat** (Tentang).
   Laci
   bisa digulir pada layar pendek. Tidak ada entri menu yang hanya membuka
   layar atau aksi yang sudah ada di beranda:
   - **Profil** membuka daftar profil; di situ ada pilih profil, Ubah nama,
     Hapus, dan Tambah profil baru.
   - **Payload** dan **Proxy** mengubah dua field profil yang tidak muat di
     beranda; SSH (host/port/user/pass) diisi langsung di field ringkas.
   - **SlowDNS** mengatur resolver, domain tunnel, public key server, dan
     tipe record query (Automatic/NULL/TXT/CNAME/MX/NS/SRV); centangnya ada
     di kisi beranda.
   - **Tema** memilih Ikuti sistem/Terang/Gelap.
   - Ping manual cukup ketuk kolom
     Aktif; log dan salin/bersihkan cukup di tab LOG; reset kunci host ada di
     dialog Tentang. (Ikon impor config dihapus sejak v2.9.8.)

Sembilan centang dan field yang diubahnya:

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
| SlowDNS | `slowdns` | SSH disalurkan lewat terowongan DNS (dnstt) |

## Komponen

- `SquareCheckView` (24dp, sudut 2dp): kotak garis tinta saat mati; bidang hijau
  dengan centang gelap saat hidup.
- `FieldUnderline`: garis bawah digambar dari bounds (1dp biasa, 2dp saat fokus),
  bukan `LayerDrawable` yang di-inset; inset itu melebar jadi blok tinta pada
  field multi-baris.
- `HexLogoView`: heksagon putih dengan "W" tinta dan "T" hijau.
- Semua kontrol sentuh berlabel `contentDescription` dan minimal 48dp.

## Gerak

Semua gerak membawa informasi, tidak ada yang sekadar hiasan:

- **Ripple sentuh** di tab, baris profil, sel centang, tombol sambung, baris
  laci, dan tombol dialog. Kilau memakai tinta transparan, bukan warna kedua.
- **Tekan tombol** mengecil 3% (`Anim.pressScale`) pada tombol sambung —
  umpan balik tekan tanpa mengubah warna.
- **Laci** masuk 200ms dan keluar 180ms (Decelerate/Accelerate); scrim
  meredup bersamaan. Tidak memakai layer keras eksplisit karena pada sebagian
  renderer (emulator software/SwiftShader) layer itu membuat laci tampil hitam.
- **Tab SSH/LOG** silang-memudar 160ms masuk dan 120ms keluar; halaman lama
  tetap terlihat di bawah halaman baru sampai transisi selesai.
- **Centang** mengisi 140ms: bidang hijau muncul sementara garis kotak
  memudar, jadi tidak ada kedipan saat status berubah. Kotaknya juga
  menyusut 0,86 lalu pulih 190ms — terasa "diklik", bukan hanya berganti
  warna.
- **Dialog** (semua dialog tema Wanz) masuk membesar dari 92% sambil memudar
  200ms dari pusat, keluar mengecil 94% + memudar 140ms
  (`res/anim/dialog_*.xml` lewat `windowAnimationStyle`).
- **Tombol sambung** mengecil 3% saat ditekan dan pulih 110ms
  (`Anim.pressScale`); label yang berganti keadaan mengembang dari 96% ke
  100% dalam 220ms; selagi `MENYAMBUNG…` opasitasnya berdenyut lembut
  850ms bolak-balik (`Anim.pulse`) dan berhenti bersih di keadaan lain.
- **Sambutan konten**: blok-blok tab SSH naik 14dp sambil memudar masuk
  260ms, dijeda berurutan 30ms, sekali saja di buka pertama (tidak diulang
  saat rotasi).
- **Baris log baru** meluncur masuk 170ms dari bawah; log lama tidak
  dianimasikan ulang.
- Tombol dan centang tetap memakai umpan balik haptic.

Semuanya menghormati `ANIMATOR_DURATION_SCALE` sistem lewat
`Face.reducedMotion()`; bila animasi dimatikan, semua perubahan berlaku
langsung tanpa durasi.

## Status

- `Terhubung` hanya muncul jika tunnel aktif **dan** self-test DNS + TCP berhasil.
- Jika tunnel aktif tetapi internet gagal: "Tunnel aktif, tetapi uji internet
  gagal", warna `WARN`.
- Alamat proxy lokal tidak ditampilkan sebagai status saat terhubung.
- Log memakai jam perangkat dan level yang diturunkan dari tag/pesan. Level
  v2.9.5: INFO, OK (hijau), WARN, ERROR, PING (hijau), BANNER (aksen). Banner
  SSH/server message boleh membawa kode warna ANSI dari server; kode itu
  ditafsirkan menjadi warna per span (termasuk truecolor `38;2;R;G;B` dari
  konversi HTML `ServerBanner`), dan dibuang saat log disalin.
- Tahapan log mengikuti HTTP Custom: header perangkat/jaringan/IP lokal,
  siklus layanan + WakeLock, resolve → socket → timeout, payload per bagian
  (escape `\r\n`), preamble HTTP (301/101), banner SSH, fingerprint kunci
  host, autentikasi, server message, SOCKS5/TUN/tun2socks, uji internet.

## Latar foto (ditunda)

Rencana latar foto Freya JKT48 beserta cara mengukur kontrasnya ada di
`design/wallpaper/README.md`. Pemasangannya ditunda atas permintaan pemakai;
aplikasi tetap bercanvas solid.
