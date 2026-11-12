# Wanz Tunnel 2.9.7

Aplikasi Android untuk SSH tunnel dengan mode VPN system-wide, payload/proxy,
TLS/SNI, WebSocket, dan multi-profil. Tampilan v2.9.6 mengikuti **HTTP Custom**:
kanvas abu netral gelap (atau putih), hijau tunggal `#4CAF50`/`#2E7D32`, judul
dua warna, dua tab bergaris bawah, isian `ip:port@user:pass`, kisi centang dua
kolom, tombol sambung bergaris, dan laci bergrup — tanpa menu tiga titik dan
tanpa tombol tambah mengambang. Font UI Roboto, data dan log Roboto Mono.

## Fitur

- SSH password authentication (JSch)
- **Mode tunggal VPN** seperti HTTP Custom: semua aplikasi lewat
  `VpnService` + tun2socks (hev-socks5-tunnel); SOCKS5 lokal hanya dipakai
  internal oleh tun2socks (port 1080 tetap)
- UI mengikuti HTTP Custom: bilah atas dengan menu dan impor config, tab
  **SSH** dan **LOG**, isian `ip:port@user:pass`, delapan centang dua kolom,
  tombol sambung bergaris, dan bacaan Unduh/Unggah/Aktif. Laci kiri hanya
  **Utilitas** (Profil, Payload, Proxy, Tema) dan **Alat** (Tentang). Tidak ada
  menu tiga titik, tombol tambah mengambang, atau layar Pengaturan terpisah;
  SSH diisi di field ringkas, dan profil dikelola langsung dari dialog Profil
  (pilih, ubah nama, hapus, tambah).
- Delapan centang berfungsi nyata: Pakai payload (`usePayload`), SSL dan
  WebSocket (mengubah `transport`), Verifikasi TLS, DNS lewat tunnel, Ping
  otomatis, Sambung ulang, dan Seluler saja.
- Tema **Ikuti sistem / Terang / Gelap**: gelap `#1E1E1E` dengan hijau
  `#4CAF50`, terang `#FFFFFF` dengan hijau `#2E7D32`. Kedua palet diukur
  kontrasnya (bukan inversi), dan halaman dibangun ulang begitu pilihan berubah.
- Log koneksi gaya HTTP Custom: ditampilkan `[jam:menit:detik]  pesan` dengan
  garis pemisah tipis dan warna per level (**INFO** tinta, **OK/PING** hijau,
  **WARN** kuning, **ERROR** merah muda, **BANNER** hijau aksen), auto-scroll,
  serta tombol Ikuti / Salin / Bersihkan. Salinan memakai format
  `jam  [LEVEL]  pesan` tanpa escape ANSI. Server message HTML dari server
  (`<font color=...>`) dirender berwarna tanpa tag. Tahapan log mengikuti
  HTTP Custom: header perangkat/sistem/jaringan/IP lokal, siklus layanan +
  WakeLock, resolve host, socket + timeout, payload ter-escape per bagian,
  status HTTP preamble (301/101), banner SSH, fingerprint kunci host
  (MD5/SHA-256), autentikasi, server message, SOCKS5/TUN, sampai uji internet.
- Ping bawaan: hasil ping tampil di kolom Aktif dan di log; ketuk kolom Aktif
  untuk ping manual (tidak ada menu ping terpisah)
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
- Host key TOFU; kunci yang berubah ditolak, reset kunci host ada di dialog
  **Tentang**
- Foreground service + notifikasi
- APK release di-minify dengan R8

## Cara pakai

1. Isi satu baris `ip:port@user:pass` di beranda (port dan akun boleh menyusul),
   atau buka **Profil → Ubah profil aktif** untuk field rinci.
2. Pilih transport:
   - `SSH langsung` untuk server SSH biasa.
   - `TLS / SNI` untuk SSH di balik TLS (stunnel) atau CDN.
   - `WS` / `WSS` untuk SSH di balik WebSocket.
3. Isi SNI, Host header WS, dan path WS bila memakai TLS/WS.
4. Tekan Hubungkan. Izin VPN Android diminta sekali, lalu seluruh trafik
   TCP aplikasi lewat tunnel.

### Impor config

Di layar rinci profil (**Profil → Ubah profil aktif**) ada kartu **IMPOR
CONFIG**. Tempel bundle config
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

Rilis siap pasang: **`WanzTunnel-2.9.7.apk`** (1,9 MB, `versionCode 21`,
Android 10 ke atas), SHA-256
`a0ade573dbdab3afbeed10c0f1adcd55b9ddb65431cf0b6bdf7af00af6335cd6`.
Rilis sebelumnya, `WanzTunnel-2.9.6.apk` (`versionCode 20`, SHA-256
`571c3876a979c08fd8d500ae58746833c5291ba0331a8c21c4b443ffb52ffcd2`), masih
menampilkan Server Message HTML mentah (penuh tag `<font>`).
Salinannya ada di akar repo dan di `_external_projects/opencode-66b774/deliverables/`.

Gerbang desain dan pemeriksaan sebelum rilis:

```bash
python3 tools/design_gate.py --strict   # 0 galat, 0 peringatan
python3 tools/wall_contrast.py          # kontras latar foto (fitur ditunda)
./gradlew testDebugUnitTest lintDebug assembleRelease
```

## Status uji

Diuji pada emulator Android 14 (x86_64) dengan server SSH lokal:

- UI v2.9.4 (rilis yang sama dengan APK di atas) diverifikasi ulang di emulator
  Android 14: tema gelap `#1E1E1E` dan terang `#FFFFFF`, judul dua warna, tab
  SSH/LOG bergaris bawah, kisi 8 centang, tombol bergaris, laci bergrup, dan
  dialog Payload/Tema/Profil/Impor/Tentang.
  Dialog memakai panel 4dp dengan aksen hijau (bukan ungu bawaan Android).
- Log v2.9.5 diuji ke server pemakai (`bansos.sunekvpn.cc.cd:80` via edge
  `104.17.70.206:80`, payload HTTP Custom): 25 unit test lulus termasuk level
  baru **OK**/**BANNER** dan pemangkasan ANSI pada salinan log; jalur nyata
  menghasilkan preamble `301`/`101`, banner `SSH-2.0-dropbear_2019.78`, login
  password sukses, dan kanal `direct-tcpip` aktif.
- Bilah atas kini hanya menu + judul + impor config; tidak ada titik tiga dan
  tidak ada tombol tambah mengambang. Profil baru dibuat lewat laci **Profil**
  → "Tambah profil baru", dan profil lama diubah lewat **Profil → Ubah profil
  aktif". Tidak ada lagi entri "Pengaturan" di laci.
- Umpan balik sentuh baru terlihat di emulator: ripple pada tab, baris profil,
  sel centang, tombol sambung, dan baris laci; perpindahan
  tab silang-memudar; centang mengisi dalam 140ms. Log kini ditambah per baris
  (bukan dibangun ulang 180 baris tiap 300ms), sehingga tab LOG tidak
  tersendat saat menyambung.
- Log nyata dari percobaan koneksi ke `bansos.sunekvpn.cc.cd:80` tampil
  `[jam:menit:detik] pesan` berwarna per level (INFO tinta, WARN kuning,
  ERROR merah muda), dengan sambung-ulang otomatis tercatat setiap 5 detik.
  Emulator tidak bisa menembus server tersebut (`connection is closed by
  foreign host`); jalur login dan trafik nyata sudah terbukti sebelumnya di
  luar emulator.
- Mematikan centang "Pakai payload" benar-benar menghentikan pengiriman payload
  tanpa menghapus teksnya; log tidak lagi menulis "Mengirim payload".
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
- v2.9.7: **log CONNECT per koneksi dihapus** (permintaan pemakai). Trafik
  aplikasi menghasilkan puluhan `CONNECT host:port` per menit dan membanjiri
  tab LOG; baris itu kini hanya masuk log debug internal. Log tetap menampilkan
  satu baris "SOCKS5 lokal siap" saat tunnel naik, ping berkala, dan seluruh
  tahapan koneksi. APK: `WanzTunnel-2.9.7.apk` (`versionCode 21`).
- v2.9.6: **Server Message HTML dirender berwarna tanpa tag** (laporan pemakai:
  banner Sunek muncul sebagai teks `<p style=...><font color='#FF8A00'>...`).
  - `ServerBanner.toAnsi()` mengubah potongan HTML biasa dari server menjadi
    kode warna ANSI SGR: `<font color='#RRGGBB'>` → warna teks 24-bit,
    `<b>`/`<strong>` → tebal, `<u>` → garis bawah, `<br>` → baris baru,
    `<p style=...>` dan tag sisa dibuang, entity dasar (`>`, `&`, ...)
    diterjemahkan. Pesan tanpa tag (termasuk banner ANSI murni) tidak diubah.
  - Renderer log kini juga mengerti ANSI extended: `38;2;R;G;B` (truecolor),
    `38;5;n` (16 warna dasar), garis bawah (4/24), dan latar (48, diabaikan)
    selain kode 30-37/90-97 yang sudah ada.
  - Tombol Salin tetap menghasilkan teks polos: escape ANSI dan tag HTML
    dibuang di `TunnelLog.plain()`.
  - 6 unit test baru (`HtmlBannerTest`), total 31 test lulus; gerbang desain
    dan lint tetap bersih. APK: `WanzTunnel-2.9.6.apk` (`versionCode 20`).
- v2.9.5: **log diperkaya mengikuti HTTP Custom** atas permintaan pemakai
  (log acuan: `bansos.sunekvpn.cc.cd:80@sunek-coolmaxx:Coolmaxx`).
  - Tahapan koneksi kini dicatat lengkap: versi app, perangkat, sistem/ABI,
    jaringan + IP lokal + operator, siklus layanan (mulai/stop/berhenti),
    WakeLock partial (izin `WAKE_LOCK` + implementasi nyata), profil/transport/
    payload/proxy, resolve host → IP, socket + timeout, payload ter-escape
    (`\r\n` terlihat) per bagian, status HTTP preamble (`301`, `101`,
    `Server: cloudflare`, `Location:`), banner SSH, kunci host + fingerprint
    MD5 (`aa:bb:…`) dan SHA-256, autentikasi, kanal SSH siap, SOCKS5 lokal,
    TUN/tun2socks, sampai uji internet.
  - Level log baru: **OK** (hijau) untuk keberhasilan tahapan dan **BANNER**
    untuk banner SSH / server message. Kode warna ANSI dari server ditafsirkan
    jadi warna per span di layar, sedangkan tombol Salin menuliskan teks polos
    tanpa escape.
  - Status antara "SSH siap" dan "Terhubung" sekarang jujur: "Menyiapkan VPN…",
    lalu "Terhubung • VPN" hanya setelah TUN + tun2socks benar-benar aktif.
  - Uji ulang ke server pemakai lewat edge `104.17.70.206:80`: payload 2 bagian
    terkirim, preamble `301`+`101` dilewati, banner `SSH-2.0-dropbear_2019.78`
    diterima, login password berhasil, `direct-tcpip` jalan. Unit test naik
    jadi 25 (log level OK/BANNER + parser ANSI), lint dan gerbang desain
    tetap bersih.
- v2.9.4: **layar Pengaturan dihapus total** dan seluruh fitur ganda
  dibereskan.
  - Laci kini hanya **Utilitas** (Profil, Payload, Proxy, Tema) dan **Alat**
    (Tentang). Tidak ada entri yang hanya membuka layar atau aksi yang sudah
    tersedia di beranda.
  - Dialog **Profil** menangani pilih profil, ubah nama, hapus, dan tambah.
    SSH diisi lewat field `ip:port@user:pass`; tidak perlu layar rinci.
  - **Payload** dan **Proxy** menjadi dialog tersendiri. Impor config tetap
    lewat ikon bilah atas, ping manual lewat kolom Aktif, log lewat tab LOG,
    dan reset kunci host pindah ke dialog Tentang.
  - `SettingsActivity.kt`, entri manifest-nya, `InkToggle`, `InkSelect`, serta
    ikon `ic_settings`, `ic_list`, `ic_network_check`, dan ikon tak terpakai
    lain dihapus (tersisa 9 ikon fungsional + 2 ikon launcher).
  - Layer keras eksplisit pada laci dibuang: di emulator software renderer ia
    membuat seluruh layar hitam; animasi tetap halus lewat interpolator.
- v2.9.3: **menu tiga titik dan tombol tambah mengambang dihapus**, dan rasa
  animasi diperbaiki.
  - Keduanya hanya pintasan; menambah profil tetap bisa lewat laci **Profil** →
    "Tambah profil baru" atau tombol **+** di Pengaturan. Ruang bawah beranda
    dan daftar log dikurangi karena tidak lagi perlu menghindari tombol
    mengambang. `ic_add` dan `ic_more_vert` ikut dihapus.
  - Ripple sentuh di semua permukaan yang bisa diketuk (tab, baris profil, sel
    centang, tombol sambung, baris laci, tautan dan tombol Pengaturan), jadi
    sentuhan langsung terasa sebelum aksi selesai.
  - Perpindahan tab SSH/LOG memudar silang 160ms; centang mengisi 140ms dengan
    kotak garis memudar; laci memakai interpolator dipercepat/diperlambat.
    Semua tetap menghormati "hapus animasi" sistem.
  - Daftar log ditambah per baris, bukan dibangun ulang seluruhnya tiap
    pembaruan; batas tampilan 180 baris dan jeda render 300ms.
- v2.9.2: **tampilan disamakan dengan HTTP Custom** atas permintaan pemakai.
  - Palet baru: gelap `#1E1E1E`, panel `#252525`, tinta `#FFFFFF`, hijau
    `#4CAF50`; terang `#FFFFFF` dengan hijau `#2E7D32`. Kontras kedua palet
    diukur ulang (INK/BG 16,67 dan 17,22; ACCENT/BG 6,00 dan 5,13).
  - Tipografi diganti ke **Roboto 400/500** (UI) dan **Roboto Mono 400/500**
    (data/log), keduanya dari Google Fonts, dipotong fonttools, dibundel dengan
    lisensi Apache 2.0. Arah "Konsol" (Chivo/JetBrains Mono, grafit + kuningan)
    dibatalkan.
  - Beranda baru: bilah atas 56dp (menu, judul "Wanz Tunnel", impor config, menu
    lain), tab SSH/LOG dengan garis bawah hijau 3dp, isian `ip:port@user:pass`
    yang mengurai balik ke host/port/user/pass, kisi centang 2 kolom, tombol
    sambung bergaris 56dp, baris status, dan bacaan Unduh/Unggah/Aktif.
  - Laci kiri bergrup (Utilitas/Koneksi/Alat) dengan logo heksagon WT dan versi;
    bisa digulir di layar pendek. Dialog Payload, SNI/host TLS, Tema, Impor
    config, Profil, dan Tentang semuanya berfungsi.
  - Log ditampilkan `[jam:menit:detik] pesan` dengan garis pemisah tipis dan
    warna per level; tab LOG punya tombol Ikuti, Salin, dan Bersihkan.
  - `Profile.usePayload` ditambahkan; mematikan "Pakai payload" benar-benar
    menghentikan pengiriman payload tanpa menghapus teksnya (diverifikasi di
    emulator: log tidak lagi menulis "Mengirim payload").
  - `LogActivity`, `ActionBarView`, `StatusRailView`, `PingBarsView`, dan
    `Glyphs` dihapus; log kini satu tempat di tab LOG beranda. Tautan "Buka log
    penuh" di Pengaturan membuka tab LOG lewat `extra "tab"`.
  - Status bar/navigation bar diperbaiki: `applyWindowChrome()` dipanggil setelah
    `super.onCreate()` supaya `WindowInsetsController` sudah tersedia; ikon
    status bar tidak lagi hitam di atas latar gelap.
  - Unit test bertambah untuk parser `ip:port@user:pass` (port/akun opsional,
    IPv6, format balik): total **21 unit test, 0 gagal**.
  - `design_gate.py` memberi pengecualian kapital untuk label aksi
    HUBUNGKAN/PUTUSKAN/COBA LAGI; gerbang lulus 0 galat, 0 peringatan.
  - Dialog memakai palet eksplisit (`WanzDialogLight` / `WanzDialogDark`):
    sudut 4dp, garis rambut, aksen hijau — bukan ungu bawaan Android.
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
- [Roboto](https://fonts.google.com/specimen/Roboto) 400/500 — seluruh teks
  antarmuka; Apache License 2.0.
- [Roboto Mono](https://fonts.google.com/specimen/Roboto+Mono) 400/500 — alamat,
  angka, dan log; Apache License 2.0. (Roboto Mono sendiri berlisensi SIL OFL;
  berkas yang dibundel diambil dari paket Google Fonts dan lisensinya disertakan.)
- [Material Icons](https://fonts.google.com/icons) — 11 ikon vektor; Apache
  License 2.0.
  Font diambil dari Google Fonts lalu dipotong (fonttools) ke karakter yang
  dipakai aplikasi: Latin dasar plus `· — • … ← → × −`, total ± 100 KB untuk
  empat berkas. Dibundel di `app/src/main/res/font/`; lisensi di
  `app/src/main/assets/legal/`.
- Foto latar (belum dipakai): sumber Pinterest, fotografer belum diketahui.
  Lihat `design/wallpaper/README.md` sebelum APK-nya diedarkan luas.
