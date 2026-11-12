# Wanz Tunnel 2.9.1

Aplikasi Android untuk SSH tunnel dengan mode VPN system-wide, payload/proxy,
TLS/SNI, WebSocket, dan multi-profil. Tampilan memakai arah **"Konsol"**:
kanvas grafit hangat (gelap) atau kertas (terang), tinta, garis rambut, angka
monospace tabular, aksen kuningan, dan warna yang hanya dipakai untuk
menyatakan status koneksi.

## Fitur

- SSH password authentication (JSch)
- **Mode tunggal VPN** seperti HTTP Custom: semua aplikasi lewat
  `VpnService` + tun2socks (hev-socks5-tunnel); SOCKS5 lokal hanya dipakai
  internal oleh tun2socks (default 1080, bisa diubah di bagian Lainnya)
- UI "Konsol": rel status di tepi atas, kartu koneksi dengan baris label/nilai,
  deret bacaan **kunde / kirim / aktif** (jumlah, laju per detik, puncak sesi),
  rel ping dengan riwayat, cuplikan log mono, dan satu tombol aksi 58dp yang
  menempel di bawah layar. Semua konfigurasi di halaman Pengaturan.
- Tema **Ikuti sistem / Terang / Gelap**: grafit hangat dengan aksen kuningan
  untuk gelap, kertas dengan tinta tua untuk terang. Kedua palet diukur kontrasnya
  (bukan inversi), dan halaman dibangun ulang begitu pilihan berubah.
- Log koneksi gaya HTTP Custom: setiap baris `jam  [LEVEL]  pesan` dengan
  level **INFO/WARN/ERROR/PING**, warna per level, auto-scroll, layar log
  penuh serta tombol Salin / Bersihkan
- Ping bawaan: hasil ping tampil di halaman utama dan di log; ketuk baris
  ping untuk ping manual
- Auto ping: interval 5/10/15/30/60 detik dengan target bisa diatur
  (default `1.1.1.1:443`), diukur lewat jalur SSH (SOCKS5), bukan ICMP lokal
- Transport:
  - SSH langsung
  - TLS / SNI (mis. stunnel)
  - WebSocket (WS)
  - WebSocket + TLS (WSS)
- Payload HTTP kustom dengan placeholder:
  `[host_port]`, `[host]`, `[port]`, `[crlf]`, `[crlr]`, `[cr]`, `[lf]`
- Payload HTTP Custom: `[split]`, `[delay]`, `[delay_split]`, `[split_delay]`
  (sesuai perilaku HTTP Custom: `[split]` dikirim back-to-back tanpa jeda;
  `[delay]`/`[delay_split]`/`[split_delay]` memberi jeda 1 detik antar
  potongan; preamble HTTP 301/101 dilewati sampai banner SSH ditemukan pada
  mode `SSH langsung`)
- Deteksi otomatis: payload yang sudah memuat upgrade HTTP — ber-`[split]` **atau**
  ber-header `Upgrade: websocket` — selalu diproses sebagai `SSH langsung`, jadi
  memilih transport WS/WSS tidak lagi menyebabkan `301`
- Proxy perantara opsional
- Multi-profil: tambah, ganti, hapus, simpan otomatis
- DNS mode VPN: selalu mapped-DNS (lewat tunnel); DNS kustom tidak tersedia
  karena SSH hanya meneruskan TCP
- Auto-reconnect saat jaringan berubah / koneksi terputus (bisa dimatikan)
- Opsi gaya HTTP Custom: hanya data seluler, blokir root
- SSH keepalive 120 detik
- Host key TOFU; kunci yang berubah ditolak, tombol reset tersedia
- Foreground service + notifikasi
- APK release di-minify dengan R8

## Cara pakai

1. Isi nama profil, host, port SSH, username, password.
2. Pilih transport:
   - `SSH langsung` untuk server SSH biasa.
   - `TLS / SNI` untuk SSH di balik TLS (stunnel) atau CDN.
   - `WS` / `WSS` untuk SSH di balik WebSocket.
3. Isi SNI, Host header WS, dan path WS bila memakai TLS/WS.
4. Tekan Hubungkan. Izin VPN Android diminta sekali, lalu seluruh trafik
   TCP aplikasi lewat tunnel.

### Impor config

Di halaman **Pengaturan** ada kartu **IMPOR CONFIG**. Tempel bundle config
gaya HTTP Custom lalu ketuk **Terapkan ke profil aktif**; Wanz Tunnel
mengisi otomatis field yang dikenali:

- baris payload (mengandung `[crlf]` / `[split]`) → **PAYLOAD**
- baris proxy `ip:port` → **PROXY / EDGE**
- baris akun `host:port@user:pass` → **HOST / IP**, **PORT**, **USERNAME**, **PASSWORD**

Contoh:

```
GET / HTTP/1.1[crlf]Host: edu.ruangguru.com[crlf][crlf]PATCH / HTTP/1.1[crlf]Host: [host][crlf]Upgrade: websocket[crlf][crlf][split]HTTP/ 69[crlf][crlf]
104.17.70.206:80
indo5.vpnjz.com:80@Taekkk67-vpnjantit.com:123
```

### Config gaya HTTP Custom (XL edukasi)

Contoh config seperti:

```
GET / HTTP/1.1[crlf]Host: edu.ruangguru.com[crlf][crlf]PATCH / HTTP/1.1[crlf]Host: [host][crlf]Upgrade: websocket[crlf][crlf][split]HTTP/ 69[crlf][crlf]
104.17.70.206:80
id3-1forcr.zivpn.site
trial7222G0kyDVD2
```

dipetakan ke Wanz Tunnel seperti ini:

| Field HTTP Custom | Field Wanz Tunnel |
| --- | --- |
| Proxy/edge `104.17.70.206:80` | **PROXY / EDGE** |
| SSH host `id3-1forcr.zivpn.site` | **HOST / IP** |
| Port SSH `80` | **PORT** |
| Payload lengkap (termasuk `[split]`) | **PAYLOAD** |
| Transport | **SSH langsung** |
| User & password | **USERNAME** / **PASSWORD** |

Bentuk payload yang benar-benar dikirim HTTP Custom (terbaca dari tab **LOG**
aplikasi itu) biasanya **tidak** memakai `[split]` — satu baris panjang dengan
`\r\n` ditulis harfiah:

```
GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\nPATCH / HTTP/1.1\r\nHost: id3-1forcr.zivpn.site\r\nUpgrade: websocket\r\n\r\n
104.17.70.206:80
id3-1forcr.zivpn.site
nama-akun
```

Kedua bentuk diperlakukan sama: payload dikirim satu kali, request keduanya yang
menaikkan koneksi ke websocket, app tidak menambah upgrade lagi.

Catatan penting:

- Bagian setelah `[split]` dikirim sebagai paket terpisah, persis seperti
  perilaku HTTP Custom.
- Server biasanya membalas `301` lalu `101`, baru banner SSH. Wanz Tunnel
  otomatis melewati respons HTTP itu pada mode `SSH langsung`.
- Payload yang memuat `Upgrade: websocket` (dipisah `[crlf]` maupun `\r\n`
  harfiah) dianggap sudah melakukan upgrade sendiri: transport WS/WSS otomatis
  turun ke `SSH langsung` supaya app tidak mengirim upgrade kedua — server jenis
  ini menolak upgrade kedua dengan `301` dan banner SSH tidak pernah datang.
  Untuk `WSS`, payload model ini dikirim polos (di HTTP Custom juga begitu).

## Catatan

- Mode VPN membutuhkan **Android 10 (API 29)** atau lebih baru.
- Mode VPN hanya meneruskan **TCP**. UDP (QUIC, game, VoIP) belum didukung;
  aplikasi biasanya otomatis fallback ke TCP.
- DNS sistem diarahkan ke mapped-DNS `198.18.0.2`, lalu nama domain dikirim
  ke SOCKS5 dan di-resolve oleh server SSH.
- TLS ketat aktif secara default. Matikan hanya untuk server dengan sertifikat
  self-signed.
- Password masih disimpan di SharedPreferences biasa (belum dienkripsi).
- APK release saat ini ditandatangani dengan debug key agar langsung bisa
  dipasang. Untuk distribusi serius, gunakan keystore rilis sendiri.

## Build

```bash
./gradlew assembleDebug
./gradlew testDebugUnitTest
./gradlew assembleRelease
```

Butuh JDK 17 dan Android SDK 34. Proyek sudah menyertakan Gradle wrapper 8.7,
AGP 8.5.2, dan `app/libs/hev-socks5-tunnel.aar` sehingga tidak perlu NDK.

APK release ditandatangani dengan debug key agar bisa langsung dipasang.
Ganti `signingConfig` di `app/build.gradle.kts` untuk distribusi resmi.

Rilis siap pasang: **`WanzTunnel-2.9.1.apk`** (2,0 MB, `versionCode 15`,
Android 10 ke atas), SHA-256
`0b7a6463fe9c01a51c6f91138f0932190bbd90123e491bc11de0485f7f316d47`.
Rilis sebelumnya, `WanzTunnel-2.9.apk` (`versionCode 14`, SHA-256
`159639ddae709d88e50153118f95c751987c35204bbbbdad25807ffb40a14213`), punya cacat
tampilan pada field multi-baris — perbaiki di 2.9.1.
Salinannya ada di akar repo dan di `_external_projects/opencode-66b774/deliverables/`.

Gerbang desain dan pemeriksaan sebelum rilis:

```bash
python3 tools/design_gate.py --strict   # 0 galat, 0 peringatan
python3 tools/wall_contrast.py          # kontras latar foto (fitur ditunda)
./gradlew testDebugUnitTest lintDebug assembleRelease
```

## Status uji

Diuji pada emulator Android 14 (x86_64) dengan server SSH lokal:

- Mode proxy SOCKS5 dan port kustom: HTTP 200 lewat `curl`.
- Mode VPN: seluruh trafik Chrome lewat tunnel, DNS mapped-DNS bekerja,
  port SOCKS kustom 1084 bekerja.
- Transport TLS/SNI (stunnel), WS (websockify), dan WSS (stunnel + websockify):
  HTTP 200 lewat SOCKS5.
- Multi-profil: tambah, ganti, ubah nama, hapus, dan persistensi berjalan.
- Tombol Putuskan menutup TUN, SOCKS, dan service dengan benar.
- Unit test handshake/echo WebSocket lolos.
- Payload HTTP Custom `[split]`: potongan terkirim berurutan, preamble HTTP
  (301 + body chunked + 101) dilewati, banner SSH diteruskan ke JSch.
- End-to-end `[split]` + mock gateway HTTP: status `Terhubung`, lalu
  `curl --socks5-hostname` ke `https://example.com` menghasilkan HTTP 200.
- UI baru: tombol koneksi melingkar beranimasi, mode SOCKS5/VPN, dan
  pengaturan lanjutan terverifikasi di emulator Android 14.
- UI v2.2: halaman utama bersih + menu Pengaturan terpisah, dan panel log
  koneksi langsung (STATUS/SSH/TRANSPORT/SOCKS) terverifikasi di emulator
  Android 14.
- End-to-end v2.2 ke server nyata (CDN, payload `[split]`): banner
  `SSH-2.0-dropbear`, autentikasi berhasil, SOCKS5 meneruskan HTTP 200, dan
  mode VPN mengarahkan DNS (mapped-DNS) serta trafik TCP aplikasi lewat tunnel.
- Impor config (`host:port@user:pass` + proxy + payload) terverifikasi di
  emulator mengisi HOST/PORT/USER/PASSWORD/PROXY/PAYLOAD dengan benar.
- Perbaikan v2.2: transport dipilih `WebSocket` tapi payload ber-`[split]`
  sekarang otomatis memakai `SSH langsung` → status `Terhubung` dan SOCKS5
  meneruskan HTTP 200 (sebelumnya gagal `301 Moved Permanently`).
- Perbaikan v2.3: pemecahan dan jeda payload kini **persis** HTTP Custom
  (hasil reverse engineering `C1935.run()`): `[split]` polos tanpa jeda,
  `[delay]`/`[delay_split]`/`[split_delay]` jeda 1 detik antar potongan,
  dan placeholder `[crlr]` (`\n\r`) ditambahkan. Dukungan `[split_delay]`
  yang sebelumnya diabaikan kini diproses.
- Perbaikan v2.4: **fallback otomatis**. Bila transport `WS`/`WSS` ditolak
  server/proxy (mis. `301 Moved Permanently`, `400`, atau handshake gagal),
  app otomatis menyambung ulang sekali sebagai **SSH langsung** memakai
  payload yang sama. Ini menutup kasus perangkat nyata di mana handshake WS
  bawaan ditolak padahal payload SSH-over-HTTP tetap valid. Diuji lewat unit
  test `wsRejectionFallsBackToRawSsh` (301 → banner SSH).
- Verifikasi v2.4 di emulator Android 14 (x86_64) dengan config pengguna
  asli: status `Terhubung • SOCKS5 127.0.0.1:1080`, log menunjukkan
  `[split]` 2 bagian tanpa jeda, banner `SSH-2.0-dropbear_2019.78`,
  autentikasi berhasil, serta `curl` lewat SOCKS5 menghasilkan **HTTP 200**
  dan **HTTPS 204** dengan IP keluar berbeda dari IP host (trafik benar-benar
  melewati server SSH).
- v2.5: log berlevel ala HTTP Custom (`[INFO]`/`[WARN]`/`[ERROR]`/`[PING]`,
  berwarna, layar log penuh), auto ping dengan interval & target yang bisa
  diatur, serta pengaturan bertingkat (Profil, Koneksi, Payload & Proxy,
  Jaringan, Ping, Lainnya, Log, Impor Config). Kebijakan "hanya data seluler"
  dan "blokir root" benar-benar menolak koneksi. Unit test 9/9 lolos.
- v2.6: status saat terhubung tidak lagi menampilkan alamat proxy. Cukup
  `Terhubung` (mode SOCKS5) atau `Terhubung • VPN`; notifikasi menjadi
  `Tunnel aktif` / `Tunnel aktif • VPN`, dan ringkasan profil menampilkan
  `Mode: SOCKS5` / `Mode: VPN`.
- Perbaikan v2.6.1: **VPN tersambung tetapi tidak bisa internetan**. Blok
  `mapdns` pada konfigurasi tun2socks disisipkan lewat interpolasi string lalu
  di-`trimIndent()`, sehingga indentasi YAML rusak dan pemetaan DNS gagal.
  Konfigurasi kini disusun baris-per-baris (`VpnConfig`) dan dikunci dengan
  unit test indentasi. Mode SOCKS5 tidak terpengaruh.
- v2.6.2: **penyamaan perilaku VPN dengan HTTP Custom (hasil reverse
  engineering `Tun2SocksService`/`C1944`)**:
  - MTU 1500 (0x5dc) menggantikan 8500; IPv4-only, tanpa alamat/route IPv6
    (route `::/0` di perangkat nyata kerap membuat trafik memilih jalur IPv6
    yang tidak bisa diteruskan SSH).
  - Socket SSH kini di-`protect()` dan di-`bind()` ke jaringan fisik, sehingga
    tidak masuk kembali ke TUN (loop VPN → SOCKS → SSH → VPN).
  - Mode VPN selalu memakai mapped-DNS — SSH hanya meneruskan TCP, jadi DNS
    UDP/kustom tidak akan pernah sampai; pengaturan "DNS kustom" otomatis
    dinonaktifkan saat mode VPN.
  - **Self-test internet otomatis** dari dalam app setelah VPN aktif: menguji
    DNS (example.org) dan TCP (target ping) melalui jalur VPN sungguhan.
    Jika gagal, status jadi `Terhubung • VPN • internet gagal` dan log
    menunjukkan apakah DNS atau TCP yang bermasalah — tidak ada lagi status
    "terhubung" yang bohong.
  - Verifikasi emulator: `Terhubung • VPN • internet OK`, DNS
    `example.org → 240.0.0.0`, Chrome memuat example.com, ping ~284 ms.
- v2.7: redesign UI "Aurora Bento" (digantikan v2.8):
  - Palet gelap dengan aksen violet–mint, permukaan kaca, latar aurora, dan
    orb koneksi. Arah ini dinilai masih mengikuti pola UI generik, sehingga
    tidak dipakai lagi.
- v2.8: **arah desain baru "Panel"** — anti-pola UI generik:
  - Kertas terang `#F1F1EC`, tinta `#15171A`, garis rambut 1dp, sudut 2dp.
    Tidak ada gradien, glow, glassmorphism, orb, emoji, atau kartu seragam.
  - Warna hanya semantik: hijau = terhubung, amber = menyambung/peringatan,
    merah = gagal. Sisanya monokrom.
  - Beranda: rel status 4dp di tepi atas, kop kiri, status besar, tabel bacaan
    (ping + riwayat bilah, uptime, mode, transport), server aktif, cuplikan
    aktivitas, dan satu tombol aksi lebar yang menempel di bawah.
  - Pengaturan dan Log memakai sistem yang sama: judul bagian bergaris,
    field datar, daftar aksi tanpa kartu.
  - Ikon adaptif monokrom: gerbang tunnel digambar sebagai garis, bukan
    gradien. Splash screen kertas.
  - Data tetap nyata: ping diukur lewat kanal SSH, uptime dari waktu koneksi,
    status "Tanpa internet" bila self-test DNS/TCP gagal.
  - Catatan lengkap: `DESIGN.md`.
- v2.8.1: **mode tunggal VPN, seperti HTTP Custom**:
  - Pilihan `SOCKS5 / VPN` di Pengaturan dihapus. Tidak ada pilihan mode;
    seluruh trafik aplikasi selalu lewat VPN, sama seperti HTTP Custom.
  - Proxy SOCKS5 lokal tetap hidup tetapi hanya sebagai bagian internal
    tun2socks (port diatur di **Lainnya → Port lokal**, default 1080).
  - Config lama yang tersimpan dengan `vpn: false` otomatis dipaksa VPN saat
    dibaca; perilaku "hanya proxy" sudah tidak ada.
  - DNS kustom dimatikan permanen (field diredupkan) karena SSH hanya TCP;
    DNS selalu mapped-DNS 198.18.0.2.
  - Beranda selalu menampilkan Mode `VPN` · "semua aplikasi"; tombol
    Hubungkan selalu meminta izin VPN.
- v2.9.1: **perbaikan tampilan dari laporan perangkat nyata** (satu APK, dua bug):
  - **Field multi-baris jadi blok warna.**
    - Gejala di perangkat nyata: pada layar gelap, field **Payload** dan kolom
      **Impor config** tampil seperti kotak kertas krem, terutama saat fokus.
    - Penyebab: garis bawah field dibuat dari `LayerDrawable` berisi
      `ColorDrawable` solid yang di-inset 47dp dari atas. Tinggi field belum
      diketahui waktu drawable dibangun, jadi pada field 4 baris "garis" itu
      melebar jadi blok setinggi field. Field satu baris (48dp) tidak kena karena
      sisanya cuma 1dp.
    - Sekarang garis digambar dari bounds oleh `FieldUnderline`, jadi selalu garis
      setebal 1dp di dasar field berapa pun tingginya; saat fokus tebalnya 2dp dan
      warnanya `INK`. Tidak ada warna atau kartu tambahan yang masuk.
  - **Ganti font + tulisan tidak geter lagi.**
    - IBM Plex Mono + Roboto (font bawaan HP) diganti **JetBrains Mono** untuk
      angka/alamat/log dan **Chivo** untuk kalimat. Keduanya dari
      Google Fonts, OFL, dipotong ke karakter yang dipakai aplikasi: 206 KB,
      lebih kecil dari font sebelumnya (272 KB). `inkSize()` dipasang di semua
      kolom isian, judul, baris log, dan label Pengaturan.
    - "Geter" dibereskan di akarnya, bukan dipoles: `Face.px()` membulatkan
      ukuran ke piksel utuh (9,5sp pada densitas 2,75 = 26,125px — garis dasar di
      setengah piksel bikin huruf kecil kelihatan bergetar), dan `Face.tracking()`
      menghitung ulang `letterSpacing` supaya langkah glyph mono (0,6em = 15,6px
      pada 26px) jatuh di batas piksel. `InkSelect`, `InkToggle`, `PingBarsView`,
      dan kop action bar yang digambar dengan `Paint` ikut dibulatkan.
    - Semua kolom bacaan tetap rata kiri dengan lebar tetap, jadi angka trafik
      yang berubah tiap detik tidak menggeser kolom di sebelahnya.
  - **Payload HTTP Custom tanpa `[split]` kini dikenali** (ditemukan dari log
    HTTP Custom pemakai — log tab `LOG` aplikasi itu):
    - Payload nyata satu baris saja, tanpa penanda split:
      `GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\nPATCH / HTTP/1.1\r\nHost: <server>\r\nUpgrade: websocket\r\n\r\n`
      dengan `\r\n` ditulis harfiah.
    - Sebelum: hanya payload ber-`[split]` yang membuat app melewatkan handshake
      WS miliknya. Dengan transport WS, app jadi mengirim upgrade **kedua**;
      server menjawab `HTTP/1.1 301 Moved Permanently` dan banner SSH tidak
      pernah tiba — inilah gejala "terhubung tapi tidak bisa internetan".
    - Sekarang payload apa pun yang memuat `Upgrade: websocket` (dengan `[crlf]`
      maupun `\r\n` harfiah) otomatis diproses sebagai `SSH langsung`: payload
      dikirim utuh satu kali, preamble `301`/`101` dilewati, banner langsung
      dipakai. Log app menuliskan alasannya.
    - Diuji ke server nyata, dua jalur. Lewat socket mentah:
      `id3-1forcr.zivpn.site` dan `bansos.sunekvpn.cc.cd` pada edge
      `104.17.70.206:80` membalas preamble Cloudflare (`301`, ±1,8 KB) lalu
      banner `SSH-2.0-dropbear_2019.78`. Koneksi langsung ke IP hasil DNS
      `bansos.sunekvpn.cc.cd` (`169.40.151.7:80`) membalas 0 byte — karena itu
      kolom **Proxy / edge** perlu diisi.
    - Diuji end-to-end dengan pustaka SSH yang sama dipakai aplikasi
      (`com.github.mwiede:jsch` 0.2.17), payload di atas, dan akun pemakai di
      `bansos.sunekvpn.cc.cd:80`:
      - `preamble 1842 byte dilewati` → banner diterima;
      - login password **berhasil** dalam ±1,2 detik, tanpa menyetel algoritma
        apa pun (JSch default menawar `ecdsa-sha2-nistp256`);
      - kunci host baru diterima lewat `StrictHostKeyChecking=ask` lalu disimpan
        ke `known_hosts`, sama seperti perilaku di HP;
      - terowongan `direct-tcpip`: `GET http://example.com/` → `HTTP/1.1 200 OK`
        (928 byte) dan `https://www.google.com/generate_204` → TLS 1.3
        (`TLS_AES_256_GCM_SHA384`) → `HTTP/1.1 204 No Content`.
      Jadi jalur payload → banner → KEX → login → trafik nyata terbukti jalan;
      yang dulu menggagalkan koneksi murni karena upgrade WS ganda.
    - Unit test baru: `payloadWithUpgradeHeaderSkipsAppHandshake` (301 → 101 →
      banner, tanpa `Sec-WebSocket-Key` ikut terkirim) dan
      `upgradeDetectorIgnoresPlainFakeHttpPayload`. Total 16 unit test, 0 gagal.
- v2.9: **arah desain baru "Konsol"** (menggantikan "Panel"), dua palet, dan
  bacaan koneksi yang benar-benar hidup:
  - Kanvas grafit hangat `#131410` untuk gelap, kertas `#F1F1EC` untuk terang;
    aksen kuningan `#C9A22F` / `#7E5B10`. Sengaja bukan ungu dan bukan biru —
    dua warna yang dipakai DarkTunnel dan HTTP Custom — dan tanpa ikon Material.
  - Mode gelap bukan inversi: tiap pasangan teks/bidang diukur. Contoh
    `INK/BG` 16,44:1 (gelap) dan 15,85:1 (terang); label micro `FAINT` tetap
    di atas 4,5:1 di kedua palet.
  - Tema **Ikuti sistem / Terang / Gelap** di Pengaturan → Tampilan, disimpan
    global (`app_cfg`, kunci `theme_mode`). `InkActivity` memasang palet sebelum
    view dibuat dan membangun ulang halaman saat pilihan berubah, jadi tidak ada
    lagi layar campur aduk; status bar, navigation bar, dan splash ikut palet,
    bukan pengaturan HP.
  - Beranda: kartu koneksi dengan pemindah profil `‹ ›` dan baris `target` /
    `akun` / `pembungkus`, deret bacaan **kunde / kirim / aktif** (angka besar,
    laju per detik, puncak sesi), rel ping dengan riwayat 12 slot (ketuk untuk
    ping manual), cuplikan log lima baris berwarna, dan tombol aksi 58dp yang
    menempel di dasar layar. Roda gigi di kop membuka Pengaturan.
  - Angka trafik berasal dari penghitung sesi `TunnelService` (delta per detik),
    bukan hiasan; status `Terhubung, tanpa internet` tetap muncul kalau self-test
    DNS/TCP gagal.
  - Kontrol `InkSelect` dan `InkToggle` digambar sendiri (bidang bergaris bawah,
    tinggi sentuh 48dp, `contentDescription` "..., nilai") karena `Spinner`
    bawaan masih terasa komponen default.
  - `tools/design_gate.py` diperluas: gradien/glow/emoji, variasi sudut per
    peran, kontras WCAG **kedua** palet, warna resource malam, tinggi sentuh,
    label aksesibilitas, huruf kapital, elipsis, dan easing memantul.
  - Diverifikasi di emulator Android 14: dengan sistem terang dan pilihan Gelap
    manual, seluruh beranda dan dialog tema ikut grafit; bacaan trafik, bilah
    ping, uptime, dan log berwarna teruji saat terhubung (`VPN • internet OK`,
    ping 13–23 ms).
  - Latar foto Freya JKT48: dua belas kandidat HD (1080x2340, master sampai
    3104x4096) beserta cara mengukur kontras panel semi-opaque-nya disiapkan di
    `design/wallpaper/` dan `tools/wall_contrast.py`; pemasangannya **ditunda**
    atas permintaan pemakai, jadi APK tetap 2,0 MB.

## Komponen pihak ketiga

- [JSch (mwiede fork)](https://github.com/mwiede/jsch) — SSH, BSD-style license.
- [hev-socks5-tunnel](https://github.com/heiher/hev-socks5-tunnel) — tun2socks, MIT license.
- [JetBrains Mono](https://fonts.google.com/specimen/JetBrains+Mono) — angka,
  alamat, log, dan label kolom; SIL Open Font License 1.1.
- [Chivo](https://fonts.google.com/specimen/Chivo) — kalimat dan judul; SIL Open
  Font License 1.1.
  Keduanya diambil dari Google Fonts lalu dipotong (fonttools) ke karakter yang
  dipakai aplikasi: Latin dasar plus `· — • … ← → × − ‹ ›`, total 206 KB untuk
  empat berkas. Dibundel di `app/src/main/res/font/`, salinan lisensi di
  `app/src/main/assets/legal/`.
- IBM Plex Mono dipakai sampai v2.9; sejak v2.9.1 digantikan dua font di atas.
- Foto latar (belum dipakai): sumber Pinterest, fotografer belum diketahui.
  Lihat `design/wallpaper/README.md` sebelum APK-nya diedarkan luas.
