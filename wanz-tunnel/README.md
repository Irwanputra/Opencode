# Wanz Tunnel 2.0

Aplikasi Android untuk SSH tunnel dengan SOCKS5 lokal, mode VPN system-wide,
payload/proxy, TLS/SNI, WebSocket, dan multi-profil.

## Fitur

- SSH password authentication (JSch)
- SOCKS5 lokal `127.0.0.1:<port>` (port bisa diubah)
- Mode **VPN** memakai `VpnService` + tun2socks (hev-socks5-tunnel)
- Mode **Proxy** hanya membuka SOCKS5 lokal
- Transport:
  - SSH langsung
  - TLS / SNI (mis. stunnel)
  - WebSocket (WS)
  - WebSocket + TLS (WSS)
- Payload HTTP kustom dengan placeholder:
  `[host_port]`, `[host]`, `[port]`, `[crlf]`, `[cr]`, `[lf]`
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

## Komponen pihak ketiga

- [JSch (mwiede fork)](https://github.com/mwiede/jsch) — SSH, BSD-style license.
- [hev-socks5-tunnel](https://github.com/heiher/hev-socks5-tunnel) — tun2socks, MIT license.
