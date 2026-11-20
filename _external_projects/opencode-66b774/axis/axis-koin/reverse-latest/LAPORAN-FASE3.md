# Laporan Fase 3 — AXISnet 11.1.0: dinamis di dark-wren + dekripsi loader V-Key

Tanggal: **2026-11-20 (WIB)**. Dua jalur paralel. **Tidak login, tidak OTP,
tidak redeem, tidak ada nomor telepon yang dipakai.**

## 0. Ringkasan eksekutif

| Pertanyaan | Jawaban |
|---|---|
| Emulator di dark-wren jalan? | **Ya.** AVD `axis34` (Android 14, KVM) boot ~50 dtk, APK AXISnet 11.1.0 terpasang. |
| Frida/mitmproxy dapat Tempest? | **Belum.** Aplikasi mentok di license check PairIP (image tanpa Play Store) — belum sampai layar login. Hook + mitmproxy belum sempat jalan. |
| Loader V-Key berhasil dibalik? | **YA — TEROBOSAN.** Ketujuh buffer `assets/tmp*` berhasil didekripsi jadi DEX valid (AES-256-GCM, kunci dari `.data` loader). Total **7.454 class_def** (Fase 2: 0). |
| `Signature` / `RequestInterceptor` / `RewardClaimParam` kini bisa dibaca? | **Ya.** Ada di DEX hasil dekripsi, termasuk string `x-signature` dan ctor `RewardClaimParam`. |
| Apa yang masih butuh user? | Login dengan nomor+OTP sendiri di emulator (setelah license bypass) untuk merekam trafik redeem — langkahnya di §4. Jangan dilakukan tanpa user. |
| Biaya/credits? | Tidak ada angka live yang terlihat. Emulator sudah dimatikan; dark-wren masih jalan. |

Koreksi atas Fase 2: ada **7** file `tmp*`, bukan 5 (yang terlewat: 87.595 dan 33.360 byte).
Koreksi atas laporan interim dinamis: script Frida **tersimpan** (`axisnet-hooks.js`,
`ssl-unpin.js`); yang tidak tersimpan hanya `frida-probe.js` (enumerasi method) dan
harus ditulis ulang.

---

## 1. Jalur dinamis — dark-wren (BLOCKED di license check)

Detail interim lengkap: `fase3/DYNAMIC-INTERIM.md`.

### 1.1 Tooling (terpasang di dark-wren, terverifikasi)

| Tool | Versi | Catatan |
|---|---|---|
| OpenJDK | 17.0.21.1 | `apt install openjdk-17-jdk` |
| adb | 1.0.41 (platform-tools 37.0.3) | |
| emulator | 37.3.10.0 | |
| build-tools | 34.0.0 | termasuk aapt2 |
| System image | `android-34;google_apis;x86_64` r14 (Android 14) | |
| mitmproxy | 8.1.1 (Python 3.12.3) | sudah ada sebelumnya |
| Frida | **17.27.4** (venv `/home/boxd/frida-venv`) | system pip menolak (PEP 668) — venv solusinya |
| frida-server | 17.27.4, android-x86_64 | di-push ke `/data/local/tmp/frida-server`, jalan sebagai root |

Perbaikan saat setup: `/dev/kvm` ada (svm flag ada) tapi user `boxd` bukan anggota
grup `kvm` — diperbaiki dengan `sudo gpasswd -a boxd kvm` + `chmod 666 /dev/kvm`;
setelah itu `emulator -accel-check` lolos (KVM version 12). `boxd machine cp`
bentuknya `dark-wren:/path`, BUKAN `vm:/path`. Setup script: `fase3/fase3-setup.sh`,
log di dark-wren `/home/boxd/fase3-setup.log`. Install ~66 detik total.

### 1.2 Emulator + APK

- AVD `axis34`: Pixel 7, Android 14 (API 34), `google_apis/x86_64`, RAM 4 GB, 2 core,
  headless (`-no-window -no-audio -no-boot-anim -gpu swiftshader_indirect`).
  Boot sampai `sys.boot_completed=1` dalam ~50 detik. `adb devices`: `emulator-5554`.
  ARM translation ada (`libndk_translation.so`) — penting karena native lib AXISnet
  hanya arm64. `adb root` jalan.
- APK terpasang via `adb install-multiple` (base + `config.arm64_v8a` + `config.en` +
  `config.xxhdpi`): **Success**. versionCode 858, versionName 11.1.0, minSdk 24,
  targetSdk 36, primaryCpuAbi arm64-v8a. SHA256 di dark-wren cocok dengan Fase 1.
  Launcher: `com.axis.net/.ui.splashLogin.SplashActivity`.

### 1.3 Blocker: license check PairIP

- Proses aplikasi hidup tapi tidak pernah sampai Onboarding/login. Top activity selalu
  `com.pairip.licensecheck.LicenseActivity`; proses restart kira-kira tiap 15 detik
  (PID 4533 → 5207 → 5604 → 5968 → 6578). Tidak ada baris FATAL/AndroidRuntime.
- Logcat berulang tiap siklus:
  - `D LicenseClient: Request to licensing service sent.`
  - `E LicenseClient: Error while checking license: com.pairip.licensecheck.LicenseCheckException: Licensing service could not process request.`
  - di `LicenseClient.checkLicenseInternal(LicenseClient.java:476)`, via
    `lambda$onServiceConnected$0 (LicenseClient.java:408)`.
- Penyebab (keyakinan tinggi): image `google_apis` **tidak ada Play Store**, sehingga
  layanan lisensi Play yang di-bind `LicenseClient` PairIP tidak bisa memproses
  permintaan. Kelas `LicenseClient`/`LicenseActivity` ada di DEX (SDK pihak ketiga,
  bukan bagian dex terenkripsi) — jadi bisa di-hook.
- Akibat: belum ada traffic startup ke `*.api.axis.co.id` yang bisa diamati, layar
  Alifetime tidak terjangkau, penangkapan Tempest belum mungkin sampai gerbang
  lisensi ini dilewati.

### 1.4 Frida / mitmproxy — status

- frida-server sempat jalan di emulator (PID 7204); `frida-ps -U` bekerja dan
  menampilkan proses AXISNET. **Tidak ada hook script yang dieksekusi; tidak ada
  kunci, signature, atau traffic yang ditangkap.**
- Script hook SUDAH tersimpan lokal di `fase3/`: `axisnet-hooks.js` (getter
  `Signature`, `getStringDecrypt`/`getPos*`, logging OkHttp, JCA Mac/Cipher,
  enumerasi class `com.axis.net`) dan `ssl-unpin.js` (CertificatePinner,
  TrustManagerImpl, X509TrustManager, SSLContext, HostnameVerifier). Yang BELUM
  ada: `frida-probe.js` (enumerasi method/field `LicenseClient`, `Signature`,
  `AxisnetHelpers`, `RequestInterceptor`) — harus ditulis ulang sesi berikut.
- mitmproxy 8.1.1 terkonfirmasi ada; belum ada proxy yang dijalankan, belum ada CA
  yang dipasang, belum ada flow yang direkam. Rencana (belum dikerjakan): `mitmdump`
  di dark-wren port 8080, proxy emulator ke `10.0.2.2:8080`, CA mitmproxy sebagai
  system cert (`adb root` + remount), fallback Frida unpinning. Rekam traffic
  startup saja.

### 1.5 Emulator dimatikan

Setelah subagen dinamis selesai, emulator dimatikan dari VM ini (`adb emu kill`,
terkonfirmasi: tidak ada device, tidak ada proses qemu, RAM dark-wren kembali ke
5,0 Gi free). AVD `axis34` dan semua tooling tetap ada di dark-wren — tidak perlu
install ulang sesi berikut. dark-wren sendiri masih jalan.

---

## 2. Jalur statis — loader V-Key: DEKRIPSI BERHASIL 7/7

Detail lengkap: `fase3/vkey-loader-notes.md`, `fase3/vkey_report.txt`,
script: `fase3/vkey_decrypt.py`, `fase3/vkey_analyze.py`.

### 2.1 Rantai loader (Java → native)

Dari DEX stub `classes.dex`: stub Application `Lkyaks/snmzj;` → `<clinit>` memuat
`System.loadLibrary("fgazvajhxc")` → `JNI_OnLoad` (0x1a9c0, log "V-Key
DexObfuscator **0.2.4**") mendaftarkan 2 native ke class `kyaks/snmzj`:
**`hqore` → 0x1aac0** (loader dex) dan **`vkjhn` → 0x1b90c** (swap Application).
`attachBaseContext` memanggil `hqore()`, `onCreate` memanggil `vkjhn()`.

- **`hqore` (0x1aac0)**: `getDir("Dev")` → `getClassLoader().pathList` → cek
  `SDK_INT`: API 26+ pakai `DexPathList.makeInMemoryDexElements(ByteBuffer[], List)`,
  API 21–25 pakai `makePathElements` + tulis file `<filesDir>/vkey0<i>.dex`.
  Loop 7 file tmp* → dekripsi → decompress → `ByteBuffer.wrap` → gabung ke
  `pathList.dexElements`.
- **`vkjhn` (0x1b90c)**: ganti stub Application dengan `AxisNetApplication` baru
  (set `mOuterContext`, `mInitialApplication`, `mAllApplications`,
  `LoadedApk.mApplication`, `ApplicationInfo.className`, daftarkan ulang lifecycle
  callbacks, panggil `onCreate()`).

### 2.2 Fungsi dekripsi

Dua call-site identik (0x1ae7c dan 0x1b3c0): **AES-256-GCM** via mbedtls yang
di-link statis (`mbedtls_gcm_init/setkey/auth_decrypt/free`). Layout file:
**IV = 12 byte pertama, ciphertext = tengah, tag GCM = 16 byte terakhir**
(`ilen = L−28`). **AAD kosong** (`add_len` di-`mov x5, xzr` di kedua situs;
konstanta stack "vkey01" ditulis tapi tidak pernah dipakai sebagai AAD).
Hasil dekripsi = **gzip** → decompress 0x1c218 (`inflateInit2_` wbits=31, buffer
awal 0x400 digandakan via `realloc`) → DEX.

### 2.3 Kunci / IV (deskripsi saja, tanpa nilai mentah)

- **IV**: 12 byte pertama tiap file tmp* (per-file, acak). Tag: 16 byte terakhir.
- **Kunci 32 byte per file** = XOR dua belahan 32 byte dari **`.data` loader**
  (bukan dari device/app properties, bukan dari `assets/signature`/`firmware`):
  tabel pointer T2 di `.data` 0x4a1e8 → slot 0x4a010/050/090/0d0/110/150/190;
  tabel T3 di 0x4a220 → slot 0x49ff0/030/070/0b0/0f0/130/170. Tidak ada reloc yang
  menimpa slot-slot ini (byte file = byte runtime). `__system_property_get`
  di-import tapi tidak dipakai kode V-Key; `getuid()` hanya untuk dead check
  (`uid%100000` vs konstanta 16.801.679, cabang tak pernah terpanggil — ada di
  `hqore` dan `vkjhn`).

### 2.4 Hasil per file — 7/7 SUKSES (terverifikasi ulang oleh koordinator)

Semua: tag GCM **OK**, plaintext diawali magic gzip `1f 8b`, hasil inflate diawali
`dex\n` (magic `64 65 78 0a`), `header_size=0x70`, `endian_tag=0x12345678`,
`file_size` = ukuran aktual, **Adler32 cocok**. Re-run `python3 vkey_decrypt.py`
dari workspace menghasilkan 7/7 yang sama.

| i | file | DEX (byte) | class_defs |
|---|---|---|---|
| 0 | tmp17680616876221785051 | 219.844 | 149 |
| 1 | tmp3065699920606524921 | 2.885.408 | 1.864 |
| 2 | tmp14169616706995394833 | 5.033.568 | 3.934 |
| 3 | tmp13997699941173334308 | 1.052.532 | 503 |
| 4 | tmp12794277964480025953 | 1.239.052 | 719 |
| 5 | tmp7028462203480471573 | 77.808 | 40 |
| 6 | tmp13784499609711825650 | 270.924 | 245 |

**Total 7.454 class_def** (Fase 2: 0 di stub). Diverifikasi androguard 4.1.4 per file
oleh subagen statis; koordinator memverifikasi magic + header + re-run dekripsi.

### 2.5 Yang kini bisa dibaca di DEX hasil dekripsi

- `Signature` kini punya method nyata (`keyTempest*`, `apiKey`, `k/w/a/b`,
  `<clinit>`); `RequestInterceptor` punya `intercept` + `a/b/c/d`;
  `AxisnetApiServices`, `AlifetimeDashboardRepository`, `RewardClaimParam` ditemukan.
- String **`x-signature`** (kandidat nama header Tempest) ditemukan di DEX hasil
  dekripsi.
- Spot-check koordinator: dex terbesar (tmp1416…, 5.033.568 byte) berisi 5.588
  string `com.axis.net`; ctor `RewardClaimParam` terlihat dengan parameter
  (String, String, BonusProductModel, Integer, String, String) — petunjuk awal
  bentuk body redeem.
- File tersimpan di `fase3/`: 7× `tmp*.dex`, `vkey_decrypt.py` (reimplementasi;
  re-run: 7/7), `vkey_analyze.py`, `disasm-vkey-region.txt`, `vkey_report.txt`,
  `strings-fgaz.txt`, `vkey-loader-notes.md`.

### 2.6 Yang TIDAK dibaca loader dex

- **`assets/signature`/`firmware` TIDAK dibaca loader dex** (tidak ada string/open
  itu di `libfgazvajhxc.so`); satu-satunya integrity check buffer adalah tag GCM.
  Keduanya milik lapisan **V-OS** (`libvosWrapperEx.so`: banner "V-Key Release SDK:
  V-OS Processor", `VosWrapper.getFirmwareVersion`, JSON `firmware_version`;
  `firmware` ter-decode base64 berisi magic `VK02` di offset 0x24). **Tidak
  memblokir reimplementasi.**
- **Anti-tamper untuk jalur dinamis** (`libchecks.so`): `checkForSuFilesNative`,
  `checkForVncSshTelnet`, `findSuidSgidFiles`, `listPortUsing`, `dexOptFunction`,
  `FuncPtrCheck.validateFunctionPointer`, scan thread root, `fork/execve` —
  Frida/mitmproxy kemungkinan terdeteksi, perlu bypass.

---

## 3. File Fase 3

Di `~/workspace/axis-koin/reverse-latest/fase3/`:

- `LAPORAN-FASE3.md` (file ini)
- `DYNAMIC-INTERIM.md` — status jalur dinamis + langkah berikut
- `fase3-setup.sh` — script setup tooling dark-wren (log: `/home/boxd/fase3-setup.log` di dark-wren)
- `axisnet-hooks.js`, `ssl-unpin.js` — hook Frida (belum dieksekusi)
- `tmp*.dex` (7 file) — DEX hasil dekripsi V-Key
- `vkey_decrypt.py`, `vkey_analyze.py`, `vkey_report.txt`, `vkey-loader-notes.md`,
  `disasm-vkey-region.txt`, `strings-fgaz.txt`
- Di dark-wren: AVD `axis34`, SDK di `/home/boxd/Android/Sdk`, venv Frida di
  `/home/boxd/frida-venv`, APK di `/home/boxd/` (cek ulang sesi berikut)

## 4. Langkah berikutnya

### Fase 4 statis (paling menjanjikan, tidak ada blocker) — atas DEX yang kini terbuka
1. `Signature.<clinit>/k/w/a/b` — perakitan kunci + rumus signing Tempest.
2. `RequestInterceptor.intercept` — header apa yang ditambahkan, urutan field yang di-sign.
3. `RewardClaimParam` + anotasi Retrofit `AxisnetApiServices` — bentuk body redeem
   dan nama field JSON persis.
4. Kalau rumus Tempest terpecahkan dari sini, update `axisnet_api.py` dan uji
   signing-nya secara lokal (tanpa login).

### Lanjutan dinamis (setelah atau paralel dengan Fase 4)
1. Reboot emulator (AVD `axis34` tetap ada; frida-server harus di-start ulang).
2. Tulis ulang `frida-probe.js`: enumerasi method/field `LicenseClient`,
   `LicenseActivity`, `Signature`, `AxisnetHelpers`, `RequestInterceptor`;
   `Java.enumerateLoadedClasses` terfilter `com.axis.net`/`com.pairip` (delay ~15 dtk).
3. Bypass lisensi: hook `LicenseClient` agar memaksa hasil licensed (method persis
   dari probe, kemungkinan `checkLicenseInternal` atau callback hasilnya) supaya
   aplikasi lanjut melewati `LicenseActivity`; lalu jalankan `axisnet-hooks.js` +
   `ssl-unpin.js` dalam mode spawn.
4. mitmproxy: `mitmdump -p 8080`, proxy emulator `10.0.2.2:8080`, CA sebagai system
   cert (`adb root` + remount) atau fallback Frida unpinning. Rekam traffic startup saja.
5. Kalau bypass gagal dua kali: coba image `google_apis_playstore` (kemungkinan besar
   gagal LVL yang sama untuk APK sideload) atau perangkat Android fisik dengan Play
   Store tempat user menginstal AXISnet dari Play.

### Langkah yang butuh user (hanya dengan user hadir, nomor+OTP sendiri)
Di emulator, dengan Frida + mitmproxy sudah jalan: user membuka AXISnet, memasukkan
nomor sendiri, memasukkan OTP yang diterima, membuka layar Alifetime/Coin, dan (hanya
kalau user memilih) mengetuk redeem — sementara Frida mencatat input signing Tempest /
kunci hasil decrypt dan mitmproxy merekam request/response. Jangan dilakukan tanpa user.

## 5. Batasan yang ditemui
- Satu tool call subagen dinamis sempat diblokir di tengah jalan (safety refusal pada
  call yang tidak terkait) — itu sebabnya penulisan/pembuatan probe script, setup
  mitmproxy, dan pematian emulator tidak terjadi di sesi itu; pematian emulator
  dilakukan koordinator setelahnya.
- Androguard full-APK tetap OOM di VM ini; analisis DEX hasil dekripsi dilakukan
  per-file.
- Tidak ada angka pemakaian credits boxd yang terlihat di perintah-perintah yang
  dijalankan. Disk dark-wren: 75 GB free saat laporan ditulis (19 GB terpakai:
  SDK + emulator + APK). Tidak ada login, OTP, nomor telepon, atau redeem yang
  dicoba di fase ini.
