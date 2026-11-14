# Wanz Tunnel — Arah Desain: Bahasa Visual "Wanz"

Dokumen ini mengunci arah visual v2.9.16. Sejak versi ini tampilan tidak lagi
meniru layar HTTP Custom: seluruh tampilan dan tata letak dirancang ulang
memakai mockup **text-to-image (Seedream 5.5)** sebagai referensi — beranda
gelap/terang, laci, tab LOG, dan dialog Tentang (prompt tercatat di
`brand/PROMPTS.md`). Yang diambil dari mockup adalah bahasa visualnya: latar
charcoal, kartu membulat, pil tab, dan tombol hijau penuh; isinya tetap fitur
Wanz Tunnel yang benar-benar bekerja.

## Ide

Satu layar tetap memuat semua yang dibutuhkan orang saat menyambung: judul,
dua tab, satu baris server, delapan opsi, satu tombol besar, dan log di tab
sebelah. Mockup AI menata ulang kontrol yang sama ke bahasa visual "Wanz"
supaya aplikasi terasa dirancang khusus untuk Wanz Tunnel, bukan meniru
aplikasi lain.

Uji cepat: ambil tangkapan layar, dan hasilnya harus terbaca sebagai Wanz
Tunnel — bukan aplikasi acuan mana pun. Yang tidak boleh sama adalah isi
palsu: setiap centang, menu, dan tombol di sini tersambung ke profil atau
layanan.

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
- Tidak ada huruf kapital semua sebagai gaya. Pengecualiannya hanya label
  aksi tombol (`HUBUNGKAN`, `PUTUSKAN`, `COBA LAGI`) dan label mikro
  (`SERVER`, `OPSI`) yang memang kapital di mockup.
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
| Latar (`BG`) | `#FFFFFF` | `#15171A` | — |
| Panel, laci, kartu log (`PANEL`) | `#F3F5F4` | `#1E2328` | INK 15,73 / 15,83 terhadap `PANEL` |
| Bidang isian (`FIELD`) | `#FFFFFF` | `#262D34` | INK 17,22 / 13,93 |
| Tinta (`INK`) | `#1B1B1B` | `#FFFFFF` | 17,22 / 17,96 terhadap `BG` |
| Teks sekunder (`MUTED`) | `#5A6167` | `#AEB6BD` | 6,29 / 8,74 |
| Teks samar (`FAINT`) | `#676F76` | `#87929B` | 5,11 / 5,66 thd `BG`; 4,66 / 4,99 thd `PANEL` |
| Garis rambut (`HAIR`) | `#E2E6E4` | `#2E363D` | bukan teks; 1dp cukup |
| Terhubung (`OK`) | `#2E7D32` | `#4CAF50` | 5,13 / 6,46 |
| Peringatan (`WARN`) | `#8A5300` | `#FFD54F` | 6,33 / 12,73 |
| Gagal (`ERR`) | `#B3261E` | `#FF6B81` | 6,54 / 6,56 |
| Identitas (`ACCENT`) | `#2E7D32` | `#4CAF50` | 5,13 / 6,46 |
| Di atas aksen (`ON_ACCENT`) | `#FFFFFF` | `#0D1B0E` | 5,13 / 6,40 |

Hijau tunggal dipakai untuk pil tab aktif, kotak centang terpilih, tombol
sambung terisi, dan label transport. Tidak ada warna kedua sebagai aksen.

Sudut memakai lima peran sesuai mockup: kartu dan panel 20dp (`R_PANEL`),
isian dan input dialog 14dp (`R_FIELD`), kotak centang 12dp (`R_CHECK`),
tombol dan pil 28dp penuh (`R_PILL`), baris log 10dp (`R_LINE`).

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

Roboto dipertahankan sebagai font UI; identitas baru datang dari warna,
sudut, dan bentuk kontrol, bukan dari font.

| font | tinggi x / em | tebal garis @26px | @29px | @34px |
|---|---|---|---|---|
| **Roboto 400** | 0,528 | 2,67 | 2,67 | 3,00 |
| **Roboto Mono 400** | 0,528 | 2,67 | 2,67 | 3,00 |

- Judul aplikasi 21sp medium: "Wanz" hijau, "Tunnel" tinta.
- Label tab 14,5sp medium; label mikro (`SERVER`, `OPSI`, grup laci) 10,5sp
  mono.
- Isian server 14sp mono; log 12sp mono.
- Label kotak centang 14,5sp Roboto; tombol aksi 15sp medium.
- **Tulisan tidak boleh geter.** Dua penyebabnya dibereskan di `Face`: ukuran sp
  yang menghasilkan piksel pecahan dibulatkan oleh `Face.px()` lewat `inkSize()`,
  dan `Face.tracking()` memilih `letterSpacing` sehingga langkah glyph mono jatuh
  di batas piksel. `design_gate.py` menganggap `COMPLEX_UNIT_SP` atau
  `textSize = dp(...)` di luar `Face.kt` sebagai galat.

## Susunan beranda

1. **Bilah atas 56dp**: menu di kiri; ubin merek W 30dp + judul "Wanz Tunnel"
   ("Wanz" hijau, "Tunnel" tinta).
2. **Kontrol tab berbentuk pil 52dp** (`SSH`, `LOG`): trek garis rambut
   membulat 28dp, pil hijau selebar satu tab meluncur di dalamnya ke tab
   aktif; label tab aktif memakai warna `ON_ACCENT`.
3. **Tab SSH — kartu Koneksi** (panel membulat 20dp, garis rambut) membungkus
   profil, isian, opsi, dan tombol:
   - baris profil aktif (ketuk untuk memilih profil) dengan pil label
     `SSH · VPN` / `SSH + TLS · VPN` dan seterusnya;
   - label mikro `SERVER`, lalu isian kotak 14dp berisi ikon DNS dan format
     `ip:port@user:pass`, Roboto Mono, satu baris; tepi berubah hijau saat
     fokus;
   - label mikro `OPSI`, lalu kisi centang **dua kolom** (sembilan sel),
     tiap sel tinggi 48dp dengan kotak centang membulat;
   - tombol sambung **terisi penuh** hijau, membulat 28dp, tinggi 56dp,
     ikon gembok + label `HUBUNGKAN` → `MENYAMBUNG…` (abu) → `PUTUSKAN` /
     `COBA LAGI` (merah); sejak v2.9.19 label tombol juga menampilkan
     progres sambung ulang `MENYAMBUNG ULANG (n)…` (abu, berdenyut) —
     baris status terpisah di bawah tombol dihapus agar tampilan bersih;
   - kartu statistik dengan kepala label mikro `TRANSFER DATA` dan pil
     `LIVE` saat tunnel aktif; panah ↓ Unduh dan ↑ Unggah dengan angka
     total besar dan kecepatan sesaat di bawahnya; baris bawah berisi titik
     status, durasi, dan globe + ping. Seluruh baris bawah memicu ping manual.
4. **Tab LOG**: tiga pil aksi — `Ikuti` (terisi hijau saat aktif), `Salin`,
   dan `Bersihkan` (garis rambut) — lalu daftar log
   `[jam:menit:detik] pesan` dalam kartu kecil membulat 10dp, tanpa garis
   pemisah. Warna pesan per level: INFO tinta, PING hijau, WARN kuning,
   ERROR merah muda.
5. **Laci kiri**: kepala ubin merek W 72dp, nama "Wanz Tunnel", slogan
   "Aman · Cepat · Gratis", dan versi; lalu grup
   **Utilitas** (Profil, Payload, Proxy, SlowDNS, Tema) dan **Alat** (Tentang).
   Laci
   bisa digulir pada layar pendek. Tidak ada entri menu yang hanya membuka
   layar atau aksi yang sudah ada di beranda:
   - **Profil** membuka daftar profil; di situ ada pilih profil, Ubah nama,
     Hapus, dan Tambah profil baru.
   - **Payload** dan **Proxy** mengubah dua field profil yang tidak muat di
     beranda; SSH (host/port/user/pass) diisi langsung di field ringkas.
   - **SlowDNS** mengatur resolver (UDP/DoH/DoT), domain tunnel, public key
     server, tipe record query (Automatic/NULL/TXT/CNAME/MX/NS/SRV), serta
     pengaturan lanjutan QNAME limit, EDNS0 limit, KCP Window, Session,
     Multi login, dan Automatic calibration; centangnya ada di kisi
     beranda.
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

- `SquareCheckView` (24dp, sudut membulat 12dp): kotak garis tinta saat mati;
  bidang hijau dengan centang gelap saat hidup.
- Isian server dan input dialog: `EditText` berlatar kotak `GradientDrawable`
  (`FIELD`, sudut 14dp, garis rambut 1dp); tepi berubah `ACCENT` saat fokus.
  `FieldUnderline` dihapus sejak v2.9.16.
- Dialog Profil (v2.9.17): daftar kartu membulat dengan titik radio hijau,
  alamat mono di bawah nama, aksi ubah/hapus per baris, dan tombol hijau
  penuh `TAMBAH PROFIL BARU`.
- Dialog SlowDNS (v2.9.17): kontrol segmen resolver UDP/DOH/DOT, saklar
  beraksen hijau (Aktifkan, Multi login, Kalibrasi), kisi dua kolom untuk
  setelan lanjutan, dan tombol Terapkan berbentuk pil hijau.
- Dialog Tema (v2.9.17): tiga kartu berpratinjau mini (Ikuti sistem/Gelap/
  Terang) dengan indikator radio; kartu terpilih bergaris hijau.
- `brandTile()`: ubin charcoal dengan monogram W hijau; dipakai di laci dan
  dialog Tentang. Sumber asetnya ada di `brand/`.
- `DNSPacketConn` (SlowDNS): pembungkus `net.PacketConn` untuk query DNS.
  `Close() error` menutup kanal `done` sekali (aman berulang) sehingga loop
  kirim/terima berhenti; `Stop()` memanggilnya sebelum menutup socket UDP
  dan membungkam `net.ErrClosed`, jadi instance yang sudah berhenti tidak
  meninggalkan goroutine yang menulis ke socket tertutup.
- Semua kontrol sentuh berlabel `contentDescription` dan minimal 48dp.

## Identitas merek & aset AI

Aset identitas dibuat khusus untuk Wanz Tunnel, bukan diambil dari aplikasi
acuan:

- **Monogram W**: kandidat AI Seedream 5.5 dirotasi 180° agar terbaca sebagai
  W, lalu diratakan ke hijau `#4CAF50` dan ditebalkan secara deterministik
  dengan filter maksimum alpha. Bentuk dasarnya dua lengkung terowongan yang
  tersusun seperti W.
- **Ikon launcher adaptif**: latar `#15171A`, foreground W hijau pada 40%
  kanvas 108dp agar aman untuk mask bulat/squircle, dan layer monokrom putih
  untuk ikon bertema Android 13+.
- **Ubin merek**: `wanz_tile.png` (charcoal, sudut membulat) dipakai di laci
  dan dialog Tentang agar identitasnya konsisten dengan launcher.
- **Ilustrasi terowongan**: banner flat pada dialog Tentang memakai perspektif
  lengkung abu dengan jalur hijau; dikompres WebP agar APK tetap ringan.
- **Mockup UI**: lima mockup Seedream 5.5 (beranda gelap/terang, laci, tab LOG,
  dialog Tentang) menjadi referensi desain ulang v2.9.16; prompt lengkapnya
  ada di `brand/PROMPTS.md`.

Prompt, langkah pengolahan, dan berkas sumber dicatat di `brand/PROMPTS.md`.

## Gerak

Semua gerak membawa informasi, tidak ada yang sekadar hiasan:

- **Ripple sentuh** di tab, baris profil, sel centang, tombol sambung, baris
  laci, dan tombol dialog. Kilau memakai tinta transparan, bukan warna kedua.
- **Tekan tombol** mengecil 3% (`Anim.pressScale`) pada tombol sambung —
  umpan balik tekan tanpa mengubah warna.
- **Laci** masuk 200ms dan keluar 180ms dengan kurva emphasized
  decelerate/accelerate Material 3 (persis kurva pada acuan); scrim
  meredup bersamaan. Tidak memakai layer keras eksplisit karena pada sebagian
  renderer (emulator software/SwiftShader) layer itu membuat laci tampil hitam.
- **Pil tab** aktif adalah satu pil bersama yang meluncur 250ms
  (fast_out_slow_in) ke tab terpilih — bukan pil per sel yang nyala-mati.
- **Tab SSH/LOG** silang-memudar 160ms masuk dan 120ms keluar; halaman lama
  tetap terlihat di bawah halaman baru sampai transisi selesai.
- **Centang** mengisi 140ms: bidang hijau muncul sementara garis kotak
  memudar, jadi tidak ada kedipan saat status berubah. Kotaknya juga
  menyusut 0,86 lalu pulih 190ms — terasa "diklik", bukan hanya berganti
  warna.
- **Dialog** (semua dialog tema Wanz) masuk persis spesifikasi Material 3
  pada acuan: memudar sambil membesar dari 80% selama 400ms (emphasized
  decelerate), keluar memudar 150ms (emphasized accelerate)
  (`res/anim/dialog_*.xml` lewat `windowAnimationStyle`).
- **Tombol sambung** mengecil 3% saat ditekan dan pulih 110ms
  (`Anim.pressScale`); label yang berganti keadaan mengembang dari 96% ke
  100% dalam 220ms; selagi `MENYAMBUNG…` tombol bernapas pelan — skala
  1,00 → 1,03 selama 1500ms bolak-balik (fast_out_slow_in), pola
  `animator/icon_scale` pada acuan (`Anim.pulse`) — dan berhenti bersih di
  keadaan lain.
- Kurva gerak memakai keluarga Material 3, didefinisikan di
  `res/interpolator/`: fast_out_slow_in (0,4; 0; 0,2; 1) untuk gerak kecil,
  emphasized decelerate (0,1; 0,7; 0,1; 1) untuk masuk, dan emphasized
  accelerate (0,3; 0; 0,8; 0,2) untuk keluar — nilai kontrol persis dari
  acuan.
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
