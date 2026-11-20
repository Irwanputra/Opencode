# Jalur 2 — AXISnet 11.1.0 via Play Store image: STATUS LOGIN

Tanggal: **2026-11-20 (WIB)**. Kerja di dark-wren (boxd).
**TIDAK sampai layar login. TIDAK ada login/OTP/nomor telepon yang dipakai,
tidak ada redeem, tidak ada hook pemaksa lisensi yang ditulis atau dipakai.**
Hook yang dipakai hanya dua script fase 3 yang sudah ada
(`axisnet-hooks.js`, `ssl-unpin.js`) — dan keduanya **tidak pernah jalan**
karena Frida spawn gagal (lihat §4).

## 0. Ringkasan eksekutif

| Pertanyaan | Jawaban |
|---|---|
| Image Play Store boot? | **YA.** `google_apis_playstore` API 34 r14, AVD `axis34ps`, `sys.boot_completed=1` dalam ~60 dtk, KVM. |
| Play Store asli ada? | **YA.** `com.android.vending` 35.6.11-21 (system app `/product/priv-app/Phonesky/Phonesky.apk`), plus `com.google.android.gms` + `gsf`. |
| Aplikasi lolos lisensi secara alami? | **TIDAK.** LicenseClient gagal 4× bind ke `com.android.vending.licensing.IBackgroundLicensingService` → `Retry limit reached` → proses crash (signal 6) → kembali ke launcher. Terjadi 2× identik (PID 5826 pk 13:05, PID 6418 pk 13:06). |
| Sampai layar login? | **TIDAK.** Paling jauh: `OnboardingActivity` sempat tampil ±10 dtk, lalu aplikasi mati. Layar login (`SplashActivity`/login) tidak pernah tampil. |
| Trafik startup tertangkap? | **Hampir nol.** mitmproxy aktif, tapi 0 flow ke `*.api.axis.co.id`; tidak ada `x-signature` / `x-handshake`. Satu-satunya trafik dari aplikasi: `CONNECT miniprogram.alipay-eco.com:443` (SDK WeChat MiniGame) yang gagal DNS. |
| Nilai kunci runtime tertangkap? | **TIDAK.** Frida tidak bisa spawn/inject di image ini (production build, tanpa root) — `Signature`/`CryptoTool`/getter native tidak pernah ter-hook. |
| Jalur ini masih bisa dilanjutkan? | **Tidak di emulator ini.** Satu-satunya jalur alami yang tersisa adalah **perangkat Android fisik** dengan Play Store + AXISnet yang di-install dari Play (lihat §6). |

## 1. Akar masalah: service lisensi yang dicari PairIP tidak ada di Play Store ini

Logcat run 1 (`logcat-axisnet-ps-run1.txt`):

```
11-20 13:05:19.296 D/LicenseClient( 5826): Connecting to the background licensing service...
11-20 13:05:19.297 W/ActivityManager(  502): Unable to start service Intent
    { act=com.android.vending.licensing.IBackgroundLicensingService pkg=com.android.vending } U=0: not found
11-20 13:05:19.784 D/LicenseClient( 5826): Retry #1. License check failed with error
    'Could not bind with the licensing service: com.android.vending.licensing.IBackgroundLicensingService'. Next try in 2s...
... Retry #2, #3 (interval 2 dtk) ...
11-20 13:05:33.831 E/LicenseClient( 5826): Retry limit reached for:
    com.pairip.licensecheck.LicenseCheckException: Could not bind with the licensing service:
    com.android.vending.licensing.IBackgroundLicensingService
```

Bukti service-nya memang tidak ada (bukan sekadar gagal bind sesaat):

- `adb shell dumpsys package com.android.vending | grep -i licensing` →
  hanya service **klasik** yang dideklarasikan:
  `com.android.vending.licensing.ILicensingService`
  (`com.google.android.finsky.services.LicensingService`,
  permission `com.android.vending.CHECK_LICENSE`).
- `adb shell dumpsys package | grep -ci BackgroundLicensing` → **0 di semua
  package**, bahkan setelah Play Store dibuka dan dibiarkan settle 60 dtk
  (versi tetap 35.6.11-21).
- Play Store sendiri tampil sebagai
  `com.google.android.finsky.unauthenticated.activity.UnauthenticatedMainActivity`
  — layar sign-in, **tanpa akun Google** di perangkat. (Menambah akun butuh
  kredensial user; tidak dilakukan dan tidak diminta.)

Jadi PairIP `LicenseClient` di AXISnet 11.1.0 memakai API lisensi latar
belakang yang baru (`IBackgroundLicensingService`), sementara Play Store
35.6.11 di image emulator ini tidak menyediakannya. Beda dengan fase 3 di
image `google_apis`: di sana tidak ada Play Store sama sekali sehingga
`checkLicenseInternal` gagal `transact(2)`; di sini Play Store ada tapi
service yang dicari tidak terdaftar — hasil akhirnya sama: lisensi mentok.

## 2. Yang terjadi setelah lisensi gagal: crash native, bukan restart loop

Setelah `Retry limit reached` (±13:05:33), proses tidak me-restart tiap
15 dtk seperti di image `google_apis`. Yang terjadi:

```
11-20 13:05:34.169 F/ndk_translation( 5826): Unsupported guest syscall number in PR_SET_SECCOMP
11-20 13:05:38.980 F/DEBUG ( 5826): ... libndk_translation.so (PrctlForGuest ...) / __android_log_assert
11-20 13:05:39.185 I/Zygote  (  333): Process 5826 exited due to signal 6 (Aborted)
11-20 13:05:39.207 W/ActivityManager(  502): Process com.axis.net (pid 5826) has died: fg TOP
```

Aplikasi arm64 yang berjalan lewat penerjemah ARM→x86 (`ndk_translation`)
abort saat memanggil `prctl(PR_SET_SECCOMP)` — syscall yang tidak didukung
penerjemah. Top activity kembali ke launcher
(`com.google.android.apps.nexuslauncher/.NexusLauncherActivity`),
`pidof com.axis.net` kosong.

Run kedua (PID 6418, pk 13:06:16–18, proses ter-restart otomatis oleh sistem
setelah crash) mengulang urutan yang persis sama: 4× gagal bind →
`Retry limit reached` → proses dibekukan di background tanpa activity
(`freezing 6418 com.axis.net`). Deterministik, bukan kebetulan sesaat.

## 3. Sejauh mana aplikasi sempat jalan (bukti activity)

| Waktu | `topResumedActivity` |
|---|---|
| pk 13:05:19 | launch `com.axis.net/.ui.splashLogin.SplashActivity` (intent terkirim) |
| ±13:05:29 | `com.axis.net/.features.onboarding.ui.activities.OnboardingActivity` (sempat resumed) |
| pk 13:05:39 | proses mati (signal 6) → launcher |
| pk 13:06:18 | run ke-2 gagal lisensi lagi, proses dibekukan, tanpa activity |

Screenshot `screen-onboarding-ps.png` (diambil pk 13:05, setelah proses mati)
menunjukkan **home screen launcher** — Play Store, Gmail, Photos, YouTube,
Phone, Messages, Chrome, dan ikon AXIS — bukan layar login. Itu bukti
visual bahwa aplikasi sudah keluar, bukan bukti login (tidak ada screenshot
layar login karena layar itu tidak pernah tercapai).

Detail install (terverifikasi): APK dari XAPK yang sama dengan fase 1
(SHA256 `c07ca053a22647916703282d29c11d2c1d1a42cbfd331721be98d50ec3b7cd5f`,
cocok lokal ↔ dark-wren), `adb install-multiple -i com.android.vending`
→ `Success`, versionCode 858, versionName 11.1.0,
`installerPackageName=com.android.vending`.

## 4. Frida + mitmproxy: apa yang jalan, apa yang tidak

- **mitmproxy 8.1.1 jalan** di dark-wren (`mitmdump -p 8080 -w mitm/startup.flows`),
  proxy emulator di-set `settings put global http_proxy 10.0.2.2:8080`
  (terverifikasi `settings get global http_proxy` → `10.0.2.2:8080`;
  cek `curl --proxy http://127.0.0.1:8080 http://example.com/` → HTTP 200).
- **Isi `mitm-startup-ps.flows` (4 flow, tidak satu pun ke AXIS):**
  1. `GET http://example.com/` → 200 — cek proxy saya sendiri, bukan aplikasi.
  2. `CONNECT miniprogram.alipay-eco.com:443` → 502, DNS gagal
     (`Name or service not known`) — dari aplikasi: SDK WeChat MiniGame
     (`WxaApiManager` di logcat) mencoba memuat modul `plugin_wmpf`;
     User-Agent WebView `sdk_gphone64_x86_64 ... Chrome/113.0.5672.136`.
     Ini satu-satunya trafik jaringan aplikasi yang terlihat sebelum mati.
  3–4. `CONNECT localhost:8843` (grpc-java-okhttp) → 502 — trafik host
     dark-wren sendiri, bukan emulator.
  - **0 flow ke `*.api.axis.co.id`, 0 header `x-signature`/`x-handshake`,
    0 body API.** Aplikasi mati sebelum sempat memanggil API AXISnet.
- **Frida 17.27.4: server jalan, inject tidak bisa.**
  - `frida-server` 17.27.4 ter-push ke `/data/local/tmp/frida-server` dan
    jalan; `frida-ps -U` berhasil list proses (Chrome, Gmail, Play Store, …).
  - Tapi image `google_apis_playstore` adalah **production build**:
    `adb root` → `adbd cannot run as root in production builds`.
    Tanpa root, tidak bisa install CA mitmproxy sebagai system cert dan
    tidak bisa inject ke aplikasi non-debuggable.
  - Percobaan spawn (script yang diizinkan saja):
    `frida -U -f com.axis.net -l axisnet-hooks.js -l ssl-unpin.js -o mitm/frida-spawn.log`
    → `Failed to spawn: unexpectedly timed out while waiting for app to launch`
    (log: `frida-spawn-ps.log`). Tidak ada `[BOOT] hooks loaded`, tidak ada
    log `SIG`/`HELP`/`HTTP`/`JCA` — hook tidak pernah aktif.
  - Catatan: flag `--no-pause` tidak dikenal frida 17
    (`frida: error: unrecognized arguments: --no-pause`); spawn default
    sudah resume (`--pause` adalah opt-in). Satu kali percobaan, tidak
    di-retry berkali-kali, sesuai instruksi.
- **Nilai kunci runtime: TIDAK ADA yang tertangkap.**
  `keyTempestMarketCapital`, `keyTempestCapital`, `apiKey`, `saltKey`,
  `sharedKey` tetap kosong. Tidak ada nilai mentah yang ditulis di laporan
  ini maupun di file mana pun (tidak ada yang berhasil dibaca).

## 5. Perintah persis mengulang sesi (di dark-wren)

Semua perintah dari VM ini via `boxd machine exec dark-wren bash -c '...'`
dan `boxd machine cp <lokal> dark-wren:<path>` / sebaliknya.
`ANDROID_HOME=$HOME/Android/Sdk`,
`PATH=$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH`.

```bash
# 1. Image + AVD (sudah ada; tidak perlu diulang kecuali AVD dihapus)
sdkmanager "system-images;android-34;google_apis_playstore;x86_64"
echo no | avdmanager create avd -n axis34ps \
  -k "system-images;android-34;google_apis_playstore;x86_64" -d pixel_7 --force
# avdmanager membuat PlayStore.enabled=no -> perbaiki manual:
sed -i "s/^PlayStore.enabled=.*/PlayStore.enabled=yes/; s/^hw.ramSize=.*/hw.ramSize=3072M/; s/^hw.cpu.ncore=.*/hw.cpu.ncore=2/" \
  /home/boxd/.android/avd/axis34ps.avd/config.ini

# 2. Boot (headless, KVM)
nohup emulator -avd axis34ps -no-window -no-audio -no-boot-anim \
  -gpu swiftshader_indirect -memory 3072 -cores 2 -netdelay none -netspeed full \
  > /home/boxd/emu-axis34ps.log 2>&1 &
adb shell getprop sys.boot_completed   # tunggu = 1 (di sini ~60 dtk)

# 3. mitmproxy + proxy emulator + logcat
mkdir -p /home/boxd/mitm
nohup mitmdump -p 8080 -w /home/boxd/mitm/startup.flows --set block_global=false \
  > /home/boxd/mitm/mitmdump.log 2>&1 &
adb shell settings put global http_proxy 10.0.2.2:8080
nohup adb logcat -v time > /home/boxd/mitm/axisnet-logcat.txt 2>&1 &

# 4. Frida server (jalan sebagai shell user; inject tetap gagal, lihat §4)
adb push /home/boxd/frida-server /data/local/tmp/frida-server
adb shell chmod 755 /data/local/tmp/frida-server
adb shell "nohup /data/local/tmp/frida-server > /data/local/tmp/frida.log 2>&1 &"

# 5. Install (APK sudah di dark-wren: ~/AXISnet-11.1.0-858.xapk, ~/axisapk/*.apk)
adb install-multiple -i com.android.vending ~/axisapk/com.axis.net.apk \
  ~/axisapk/config.arm64_v8a.apk ~/axisapk/config.en.apk ~/axisapk/config.xxhdpi.apk

# 6. Jalankan + amati (TANPA hook lisensi apa pun)
adb shell am start -n com.axis.net/.ui.splashLogin.SplashActivity
adb shell dumpsys activity activities | grep topResumedActivity
grep -E "LicenseClient" /home/boxd/mitm/axisnet-logcat.txt
adb exec-out screencap -p > /home/boxd/mitm/screen-onboarding.png

# 7. Matikan (sudah dilakukan pk ~13:12 WIB)
adb emu kill; pkill -f mitmdump   # hati-hati: pkill -f bisa membunuh shell pembungkus sendiri
```

Keadaan akhir dark-wren: emulator **mati** (`adb devices` kosong, port 8080
tertutup, RAM kembali 7,3 Gi available), mitmdump mati. AVD `axis34ps`
(4,3 GB) dan `axis34` tetap tersimpan untuk percobaan ulang; mesin dark-wren
sendiri tetap jalan seperti sebelumnya. File bukti di bawah sudah disalin ke
VM ini.

## 6. File bukti (VM ini, `~/workspace/axis-koin/reverse-latest/fase3/`)

- `LOGIN-STATUS.md` — file ini.
- `screen-onboarding-ps.png` — home screen launcher setelah aplikasi mati
  (ikon AXIS terlihat; bukan layar login).
- `logcat-axisnet-ps-run1.txt` (1,38 MB) — logcat lengkap run 1, termasuk
  baris `LicenseClient` pk 13:05:19–33 dan crash `ndk_translation` pk 13:05:39.
- `frida-spawn-ps.log` — output CLI Frida: `Failed to spawn: unexpectedly
  timed out while waiting for app to launch`.
- `mitmdump-ps.log` — log mitmdump.
- `mitm-startup-ps.flows` — 4 flow (cek curl + alipay miniprogram + 2×
  localhost:8843); 0 flow ke `*.api.axis.co.id`.
- Di dark-wren (tidak disalin): `/home/boxd/mitm/` (logcat, flows, screenshot),
  `/home/boxd/axisnet-hooks.js`, `/home/boxd/ssl-unpin.js`,
  AVD `axis34ps` + image `google_apis_playstore` API 34 r14.

## 7. Langkah yang TINGGAL BUTUH USER (jangan dilakukan agen sendiri)

Jalur emulator sudah habis secara alami — **jangan** coba bypass lisensi
dengan cara lain (hook pemaksa lisensi, repackaging APK, gadget injection,
atau memalsukan service lisensi). Yang tersisa butuh perangkat/kehadiran user:

1. **Perangkat Android fisik (jalur utama yang tersisa).** User install
   AXISnet **dari Play Store** di HP Android-nya sendiri (bukan sideload
   XAPK), lalu jalankan sambil perangkat terhubung ke alat rekam:
   - Opsi A (paling bersih): HP user + laptop/PC user menjalankan
     mitmproxy + Frida dengan HP yang sudah di-root / atau Frida Gadget —
     tetapi itu mengubah perangkat user; putuskan bersama user dulu.
   - Opsi B: HP user dipinjamkan akses adb-nya (USB debugging) ke sesi
     agen — agen hanya merekam trafik startup, tidak memasukkan nomor/OTP.
   - Di perangkat fisik, `IBackgroundLicensingService` hampir pasti ada
     (Play Store di HP nyata melayani lisensi aplikasi yang di-install
     dari Play), sehingga gate lisensi lolos alami dan layar login tercapai.
2. **Login (hanya dengan user hadir).** Setelah layar login tercapai
   (di HP fisik), user sendiri yang: buka AXISnet → masukkan **nomor AXIS
   miliknya** → masukkan **OTP dari HP-nya** → buka layar **Alifetime**
   → (opsional, hanya bila user meminta) tap redeem bonus pilihannya.
   Selama itu mitmproxy + hook fase 3 merekam: endpoint
   `*.api.axis.co.id`, header `x-signature` / `x-handshake` nyata, dan
   nilai kunci hasil decrypt (dicatat by lokasi/format saja di laporan;
   nilai mentah hanya di file lokal bertanda rahasia).
3. **Verifikasi rumus Tempest.** Dengan `x-signature` + `x-handshake` +
   body mentah dari trafik nyata, cocokkan dengan
   `axisnet_api.py --self-test` / `tempest_sign_h` (input sama harus
   menghasilkan signature sama), lalu isi kunci via env var
   (`AXIS_TEMPEST_KEY_MARKET_CAPITAL`, `AXIS_TEMPEST_KEY_CAPITAL`,
   `AXIS_TEMPEST_SHARED_KEY`, …) dan uji `get_coin_profile()`.
   Padding DESede (`PKCS5Padding` vs `NoPadding`) baru bisa dipastikan
   dari trafik/handshake nyata ini.

### Yang SUDAH dicoba dan TIDAK boleh diulang

- Hook pemaksa lisensi (LicenseClient/LicenseActivity) — **diblokir safety**,
  tidak ditulis, tidak dipakai, jangan dicoba lagi.
- Image `google_apis` tanpa Play Store (fase 3) — mentok `transact(2)`.
- Image `google_apis_playstore` dengan Play Store asli (sesi ini) — mentok
  `IBackgroundLicensingService` tidak ada + crash `ndk_translation`.
