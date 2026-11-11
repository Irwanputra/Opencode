# Wanz Tunnel 2.2

Aplikasi Android untuk SSH tunnel dengan SOCKS5 lokal, mode VPN system-wide,
payload/proxy, TLS/SNI, WebSocket, dan multi-profil. Tampilan bergaya modern
dark: halaman utama bersih berisi tombol koneksi melingkar beranimasi dan log
koneksi langsung, sedangkan seluruh konfigurasi berada di menu Pengaturan.

## Fitur

- SSH password authentication (JSch)
- SOCKS5 lokal `127.0.0.1:<port>` (port bisa diubah)
- Mode **VPN** memakai `VpnService` + tun2socks (hev-socks5-tunnel)
- Mode **Proxy** hanya membuka SOCKS5 lokal
- UI modern: halaman utama bersih (tombol koneksi melingkar, ringkasan profil
  aktif, panel log langsung) dan halaman Pengaturan terpisah untuk semua opsi
- Log koneksi langsung di halaman utama: timestamp, status, SSH, transport,
  payload, TLS, WS, dan SOCKS; bisa dibersihkan
- Transport:
  - SSH langsung
  - TLS / SNI (mis. stunnel)
  - WebSocket (WS)
  - WebSocket + TLS (WSS)
- Payload HTTP kustom dengan placeholder:
  `[host_port]`, `[host]`, `[port]`, `[crlf]`, `[cr]`, `[lf]`
- Payload HTTP Custom: `[split]` dan `[delay_split]`
  (potongan dikirim terpisah, lalu preamble HTTP 301/101 dilewati sampai
  banner SSH ditemukan pada mode `SSH langsung`)
- Deteksi otomatis: payload ber-`[split]` selalu diproses sebagai `SSH langsung`,
  jadi memilih transport WS/WSS tidak lagi menyebabkan `301`
- Proxy perantara opsional
- Multi-profil: tambah, ganti, hapus, simpan otomatis
- DNS mode VPN memakai mapped-DNS: domain tetap di-resolve di sisi server SSH
- Auto-reconnect saat jaringan berubah / koneksi terputus
- SSH keepalive 120 detik
- Host key TOFU; kunci yang berubah ditolak, tombol reset tersedia
- Foreground service + notifikasi
- APK release di-minify dengan R8

## Cara pakai

1. Isi nama profil, host, port SSH, username, password.
2. Pilih port SOCKS5 (default 1080).
3. Pilih mode:
   - **VPN semua aplikasi** aktif: seluruh trafik TCP aplikasi lewat tunnel.
   - Nonaktif: hanya SOCKS5 lokal; atur aplikasi agar memakai proxy
     `127.0.0.1:<port>`.
4. Pilih transport:
   - `SSH langsung` untuk server SSH biasa.
   - `TLS / SNI` untuk SSH di balik TLS (stunnel) atau CDN.
   - `WS` / `WSS` untuk SSH di balik WebSocket.
5. Isi SNI, Host header WS, dan path WS bila memakai TLS/WS.
6. Tekan Hubungkan. Mode VPN akan meminta izin VPN Android sekali.

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

Catatan penting:

- Bagian setelah `[split]` dikirim sebagai paket terpisah, persis seperti
  perilaku HTTP Custom.
- Server biasanya membalas `301` lalu `101`, baru banner SSH. Wanz Tunnel
  otomatis melewati respons HTTP itu pada mode `SSH langsung`.
- `[split]` hanya didukung untuk transport `SSH langsung`. Kombinasi dengan
  TLS/WS belum didukung.

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

## Komponen pihak ketiga

- [JSch (mwiede fork)](https://github.com/mwiede/jsch) — SSH, BSD-style license.
- [hev-socks5-tunnel](https://github.com/heiher/hev-socks5-tunnel) — tun2socks, MIT license.
