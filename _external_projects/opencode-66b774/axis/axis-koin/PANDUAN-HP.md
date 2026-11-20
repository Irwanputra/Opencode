# Rekam trafik AXISnet di HP Android fisik — panduan

Tanggal: 2026-11-20. Tujuan: menangkap 4 hal yang masih kurang untuk login +
redeem end-to-end lewat Python (lihat `reverse-latest/LAPORAN-FASE4.md`):

1. Nilai kunci hasil decrypt saat runtime (`apiKey`, `keyTempestMarketCapital`,
   `keyTempestCapital`, `sharedKey`) — ini secret-nya, cuma ada pas aplikasi jalan.
2. Header `x-signature` / `x-handshake` + body mentah dari trafik nyata
   (login OTP, cek koin, redeem) — buat verifikasi rumus Tempest.
3. Kepastian padding DESede (`PKCS5Padding` vs `NoPadding`).
4. Bentuk response API terenkripsi (`NativeLib.decryptResponse`).

Yang TIDAK dilakukan: login pakai akun orang lain, kirim OTP/nomor di chat,
bypass lisensi, repack APK tanpa diskusi. Semua login dilakukan user sendiri
dengan nomor + OTP miliknya.

## Yang dibutuhkan

- HP Android fisik (bukan emulator — emulator sudah habis, dua image mentok
  di lisensi; lihat `reverse-latest/fase3/LOGIN-STATUS.md`).
- AXISnet **di-install dari Play Store** di HP itu (bukan sideload XAPK),
  supaya cek lisensi PairIP lolos alami.
- Nomor AXIS milik user + OTP yang masuk ke HP itu.
- WiFi (HP dan proxy mitmproxy tidak harus satu jaringan kalau proxy-nya
  lewat dark-wren, lihat Opsi A).

## Opsi A (utama, tanpa root, tanpa Frida): mitmproxy di dark-wren

mitmproxy sudah terpasang di mesin boxd `dark-wren`. Cara kerjanya: HP
mengarahkan trafiknya lewat mitmproxy di dark-wren, mitmproxy merekam
request/response HTTPS ke `*.api.axis.co.id`.

### Langkah 1 — Gue nyalain mitmproxy (bilang "nyalain proxy" di chat)

Yang gue jalankan di dark-wren (bukan tugas user):

```bash
# di dark-wren, via: boxd machine exec dark-wren <perintah>
mkdir -p /home/boxd/mitm-hp
nohup mitmdump -p 8080 -w /home/boxd/mitm-hp/hp.flows --set block_global=false \
  > /home/boxd/mitm-hp/mitmdump.log 2>&1 &
# expose port 8080 ke internet:
boxd machine proxy add dark-wren 8080
# (cek nama host/port hasil publish dengan: boxd machine proxy list)
```

mitmproxy membuat CA sendiri saat pertama jalan. Gue ambil **hanya file
sertifikat publiknya** (`mitmproxy-ca-cert.pem`) dan kasih ke user.
File private key (`mitmproxy-ca.pem`) **tidak pernah** dibagikan.

### Langkah 2 — Install sertifikat CA di HP

1. Terima file `mitmproxy-ca-cert.pem` dari gue, simpan di HP.
2. Android: Settings → Security → Encryption & credentials → Install a
   certificate → CA certificate → pilih file itu → beri nama misal `mitmproxy`.
   (Di sebagian HP: Settings → Security → Install from storage.)
3. Catatan: ini sertifikat **user**, bukan system. Aplikasi yang tidak
   mengizinkan user CA akan menolak koneksi — itu yang diuji di langkah 4.
   Sertifikat ini hanya untuk sesi rekam; hapus lagi setelah selesai
   (Settings → Security → Trusted credentials → User → hapus `mitmproxy`).

### Langkah 3 — Arahkan HP ke proxy dark-wren

1. HP → Settings → WiFi → tahan nama WiFi yang dipakai → Modify network →
   Advanced options → Proxy: **Manual**.
2. Proxy hostname: host hasil `boxd machine proxy add` (gue yang kasih,
   misal alamat publik dark-wren), Proxy port: port hasil publish.
3. Save. Tes: buka browser HP, buka `http://example.com` — harus kebuka
   (dan mitmproxy di dark-wren mencatatnya).

### Langkah 4 — Rekam di aplikasi (user sendiri)

1. Pastikan mitmproxy di dark-wren masih jalan (gue yang cek).
2. Buka AXISnet di HP → masukkan **nomor AXIS milikmu** → masukkan **OTP
   yang masuk ke HP-mu** → buka menu **Alifetime** → lihat koin/level.
3. (Opsional, hanya kalau user mau) tap redeem bonus pilihannya.
4. Jangan kirim nomor/OTP ke chat. Yang gue butuhkan hanya file rekaman.

### Langkah 5 — Kirim rekaman ke gue

Gue ambil file `/home/boxd/mitm-hp/hp.flows` dari dark-wren dan analisis:
cocokkan `x-signature`/`x-handshake` dengan `axisnet_api.py`, isi env keys,
uji `get_coin_profile()`.

Kemungkinan hasil Opsi A:

- **Berhasil** — flow ke `*.api.axis.co.id` terekam lengkap dengan header +
  body. Selesai, lanjut verifikasi rumus + uji redeem via script.
- **Gagal TLS** — aplikasi menolak sertifikat (pinning / user CA tidak
  dipercaya): di mitmproxy terlihat `TLS handshake failed` / `certificate
  verify failed`, tidak ada flow API. Berarti butuh Opsi B.

## Opsi B (hanya kalau Opsi A gagal TLS): Frida

Butuh salah satu dari:

- **HP yang sudah di-root** — `frida-server` jalan sebagai root, lalu
  `frida -U -f com.axis.net -l axisnet-hooks.js -l ssl-unpin.js`
  (script sudah ada di `reverse-latest/fase3/`).
- **Frida Gadget via repack APK** — APK dibongkar, disisipi gadget, di-sign
  ulang. Ini mengubah aplikasi dan bisa memicu anti-tamper V-Guard;
  **diputuskan bersama dulu**, jangan dilakukan diam-diam.

Opsi B tidak dikerjakan sebelum Opsi A dicoba, karena Opsi A lebih bersih
dan tidak mengubah perangkat user.

## Setelah rekaman didapat (gue yang kerjakan)

1. Cocokkan signature trafik nyata dengan `tempest_sign_h` /
   `tempest_sign_redeem` di `axisnet_api.py --self-test`.
2. Isi kunci via env var (tanpa hardcode):
   `AXIS_API_KEY_DECRYPTED`, `AXIS_TEMPEST_KEY_MARKET_CAPITAL`,
   `AXIS_TEMPEST_KEY_CAPITAL`, `AXIS_TEMPEST_SHARED_KEY`,
   `AXIS_TEMPEST_KEY_MARKET`, `AXIS_TEMPEST_KEY`, `AXIS_AUTH_TOKEN`,
   `AXIS_ENV=prod`, `AXIS_TEMPEST_PADDING` (PKCS5Padding/NoPadding
   sesuai hasil trafik).
3. Uji `get_coin_profile()` lalu `redeem(product_id, product_type,
   merchant_code)` — redeem hanya dengan persetujuan user.
4. Matikan mitmproxy + hapus publish proxy di dark-wren
   (`boxd machine proxy remove dark-wren 8080`), dan user hapus sertifikat
   CA di HP.
