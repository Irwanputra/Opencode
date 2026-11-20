# Laporan Fase 2 — Interceptor & Signing Tempest AXISnet 11.1.0 (Analisis Statis)

Tanggal: **20 Nov 2026 (WIB)**. Kerja statis saja (DEX + `.so` + RN bundle).
**Tidak login, tidak OTP, tidak menjalankan APK.** Nilai secret mentah (clientSecret,
blob kunci) TIDAK dikutip di laporan ini — hanya nama + panjang/format. File bukti JSON
di folder ini sebagian berisi nilai mentah hasil ekstraksi dan hanya untuk lokal.

## 0. Ringkasan eksekutif

| Pertanyaan | Jawaban |
|---|---|
| Signing Tempest bisa diturunkan dari statis saja? | **TIDAK.** Rumus + kunci hasil decrypt-nya ada di dex terenkripsi (lihat §1–§3). |
| Interceptor berhasil dipetakan? | **Sebagian.** `RequestInterceptor` hanya punya 4 getter JNI hostname; logika penambahan header/signing-nya ada di dex terenkripsi, 0 call-site-nya terlihat di kode yang bisa dibaca (§2). |
| Alur OTP → cek koin → redeem berhasil dipetakan? | **Ya, di level endpoint + signature method.** URL, method Kotlin, dan model response ketemu; body JSON redeem (RewardClaimParam) TIDAK ketemu (§4–§5). |
| Ada signing yang berhasil dipecahkan penuh? | **Ya — signing Modula "OneBackend"** (HMAC-SHA256 + header lengkap), terverifikasi dari RN bundle dan diuji silang dengan openssl (§6). Ini jalur gateway Modula, BUKAN Tempest untuk `*.api.axis.co.id` — jangan dicampur. |
| Prototipe Python dibuat? | **Ya:** `~/workspace/axis-koin/axisnet_api.py` — signing Modula terimplementasi + self-test lolos; call AXISnet diblokir sengaja sampai Tempest terpecahkan (§8). |
| Yang dibutuhkan selanjutnya? | Analisis dinamis minimal di perangkat (Frida/mitmproxy, trafik akun sendiri) — spek di §7. VM ini tidak bisa menjalankannya (tidak ada adb/emulator/KVM/SDK/Frida). |

## 1. Temuan kunci: kode aplikasi terenkripsi (V-Key DexObfuscator) — batas keras statis

Bukti (sudah diverifikasi dua parser independen: androguard 4.1.4 + parser DEX mentah `struct`):

- **583 tipe `Lcom/axis/net/*` punya method/field di method_ids/field_ids, tapi 0 class_def** di
  kedelapan DEX (`classes.dex`–`classes8.dex`). Contoh: `AxisnetApiServices`, `Signature`,
  `OtpApiService`, `AuthApiService`, `AlifetimeDashboardRepository`, `RequestInterceptor`.
  String pool tetap berisi nama-nama itu (1.074 referensi), tapi badan kodenya tidak ada.
- **Penyebabnya teridentifikasi:** `libfgazvajhxc.so` berisi string
  `********** V-Key DexObfuscator version: %s **********`, `[dex_buffer] decompress: %d`,
  `makeInMemoryDexElements`, `dalvik/system/DexPathList$Element` — dex asli dimuat
  in-memory saat runtime dari buffer terenkripsi.
- **Buffer dex terenkripsi ketemu di `base.apk/assets/`** — 5 file `tmp<angka>` total ±3,4 MB,
  semuanya entropi 8,00 (terenkripsi, tanpa magic header): 1.566.803, 879.003, 476.185,
  340.018, 111.456 byte. Ditambah `assets/signature` (259.782 byte) dan `assets/firmware`
  (780.126 byte) yang isinya base64 — setelah di-decode jadi biner tanpa magic yang dikenal
  (blob metadata V-Guard, bukan dex).
- **Konsekuensi:** semua implementasi Kotlin/Java aplikasi (interceptor, signing Tempest,
  repository Alifetime, OTP/login, model request) TIDAK BISA dibaca statis. Yang tersisa:
  (a) metadata DEX (nama method + signature + nama field), (b) getter native di
  `libnative-lib.so`, (c) kode library + sebagian kecil kode aplikasi yang tidak
  terproteksi dan berhasil di-decode (±62% method per DEX; sisanya ekornya terenkripsi —
  dibuktikan dari pola instruksi sampah setelah prolog yang valid), (d) RN bundle JS
  (tidak terenkripsi, 3,5 MB).
- Metode kerja fase ini: parser DEX mentah (`fase2-tracer.py`, tabel panjang instruksi
  Dalvik, decode per-method dengan retensi prefix valid) + androguard per-DEX satu proses
  (menghindari OOM fase 1) + `nm`/`readelf`/capstone untuk `.so` + grep bundle.
  Total method yang berhasil di-trace: ±321 ribu entri (file `trace-*.json` di /tmp,
  diringkas ke `fase2-call-sites.json`, 523 entri relevan).

## 2. Interceptor (`RequestInterceptor`) — yang bisa dan tidak bisa dipetakan

- JNI di `libnative-lib.so` untuk `com.axis.net.config.RequestInterceptor` hanya 4 getter:
  `hostNameNew`, `hostNameProduction`, `hostNameStaging`, `hostNameUat` — semuanya
  mengembalikan string hostname, tanpa logika apa pun.
- **0 invoke ke `RequestInterceptor` di seluruh kode yang bisa di-decode** (dari 612 method
  yang memanggil target yang diawasi). Artinya pemasangan interceptor ke OkHttpClient
  (`addInterceptor`/`addNetworkInterceptor`) dan penambahan header terjadi di dex
  terenkripsi. Konfirmasi negatif: **0 invoke ke `okhttp3/OkHttpClient`, `Retrofit`,
  `okhttp3/Request$Builder` di kode yang bisa dibaca** — seluruh setup HTTP stack ada di
  dex terenkripsi.
- Pola call-site yang MASIH terlihat (dari kode yang bisa dibaca, `LHa/b` SIM-replace dan
  `Lca/b` reactivation): `Signature.apiKey()` dipanggil, hasilnya dioper sebagai
  **parameter String pertama** ke method `AxisnetApiServices` (mis.
  `checkNumberSimReplace(apiKey, …)`). Jadi apiKey ikut di tiap request — apakah sebagai
  `@Header("x-api-key")`, `@Query`, atau `@Field` tidak bisa dipastikan tanpa anotasi
  Retrofit (anotasi ikut hilang bersama class_def).
- Header yang namanya muncul di string pool tapi TIDAK bisa diikat ke interceptor:
  `Content-Type: application/json`, `Authorization`, `X-Timestamp`, `X-Nonce`,
  `X-Device-Id`, `X-App-Version`, `X-Platform`, `X-Msisdn` — sebagian besar berasal dari
  SDK Modula di bundle (§6), bukan dari interceptor native. **Tidak ada string
  `X-Signature` / `x-signature` / `X-Api-Key` di bundle maupun di string yang bisa
  diikat ke interceptor.** Nama header Tempest yang sebenarnya (jika ada) tidak diketahui
  statis.

## 3. Signing Tempest — kenapa tidak bisa diturunkan statis

- `com.axis.net.config.Signature` di JNI hanya punya **6 getter**, semuanya mengembalikan
  blob ciphertext (base64 dari byte acak, sudah dibuktikan fase 1): `apiKey`,
  `keyTempest`, `keyTempestCapital`, `keyTempestMarket`, `keyTempestMarketCapital`,
  `keyTempestGuardian`. **Tidak ada satu pun fungsi JNI yang menghitung signature.**
  `libnative-lib.so` juga TIDAK punya import crypto sama sekali (hanya
  `liblog/libm/libdl/libc`) dan tidak ada string `HmacSHA*`/`AES` di dalamnya
  (hanya 3 hash `sha256/…` untuk certificate pinning). Jadi semua crypto Tempest
  dikerjakan di Kotlin/Java (dex terenkripsi) memakai JCA.
- Dari 755 pemakaian crypto di kode yang bisa dibaca, hampir semuanya kode library
  (Base64, MessageDigest untuk pinning sertifikat, BiometricPrompt). **Tidak ada satu
  pun pemakaian `javax/crypto/Mac` (HMAC) di luar biometrik, dan tidak ada pemakaian
  `SecretKeySpec`/`Cipher` yang terikat ke Tempest.**
- Satu-satunya invoke ke `Signature` di kode yang bisa dibaca: **4 kali, semuanya
  `apiKey()`** dari `LHa/b`. Getter `keyTempest*` **tidak pernah dipanggil** dari kode
  yang bisa dibaca — pemakainya hanya ada di dex terenkripsi (interceptor/signing).
- **Perakitan kunci di runtime (bukti tidak langsung):**
  - `AxisnetHelpers` punya getter `getPos1`–`getPos7`, `getPos9`–`getPos12`
    (tidak ada `getPos8`) yang mengembalikan string panjang (23–185 karakter,
    diawali `A`, campuran huruf+angka) — lihat `fase2-axis-helpers.json` /
    `fase2-axis-pos-filters.json`.
  - Helper `LO5/a$a` (kode yang BISA dibaca) memakai regex `[A-Zg-z]` + getter
    `getPos10/11/12`: method `b()`/`c()`/`d(I)` merakit string dari potongan-potongan
    itu. Dua tafsir yang konsisten dengan bukti: (a) buang huruf `[A-Zg-z]` sehingga
    tersisa digit (+ huruf a–f), lalu ambil karakter pada indeks tertentu;
    (b) sebaliknya, ekstrak hurufnya. Contoh hasil saringan ada di
    `fase2-axis-pos-filters.json` (mis. `getPos12` tersisa 9 huruf / 138 digit).
    Pemanggil `LO5/a$a` hanya ada di dex terenkripsi, jadi perakitan finalnya
    tidak bisa dipastikan statis.
  - `AxisnetHelpers.getStringDecrypt` (JNI 0x34cc0) adalah fungsi yang menerima
    string terenkripsi dan mengembalikan string plaintext (disassembly: membangun
    string stack `"decrypt"`, memanggil fungsi lewat tabel JNI, stack-canary).
    Input-nya (ciphertext) dan kuncinya tidak terlihat statis.
  - `getSaltKey`/`getMsisdnSaltKey` (16 hex) dan `getSecretKey` (16 hex) tersedia
    sebagai string pendek; `getPassword` 32 hex. Peran pastinya dalam derivasi
    kunci Tempest tidak diketahui statis.
- **Kesimpulan §3: rumus Tempest (algoritma HMAC/AES, urutan field yang di-sign,
  pemisah, dan kunci hasil decrypt) TIDAK ADA di materi statis.** Yang diketahui
  hanya: ada 6 kunci ciphertext + mekanisme perakitan/dekripsi string di runtime.

## 4. Alur end-to-end (dipetakan dari method_ids + getter native + Dagger)

### 4.1 OTP / login

- URL (getter native): `OtpApiService.uOtp` = `https://otp.api.axis.co.id/v1/otp`;
  `AuthApiService.otpUrl`, `otpLoginUrl` (= `/v1/otplogin/v2` — dari fase 1),
  `logoutUrl`, `createTokenAutoLoginUrl`, `biometricRequestOTPUrl`,
  `biometricValidateOTPUrl`, `biometricLoginUrl`, `xApiKey`.
- OAuth: `OtpApiService` membawa `clientID`, `clientSecret` (plaintext di `.so`),
  `grantType` = `client_credentials`, `saltKey`/`randomKey` = 16 hex (nilai sama
  dengan `AxisnetHelpers.getSaltKey`). Token endpoint persisnya tidak ada di JNI
  (kemungkinan path OAuth standar di host OTP).
- Method login (nama ter-obfuscasi, signature dari method_ids):
  `AuthApiService.b(OtpPayload, String, String, Continuation)`,
  `c(Lsc/c;, String, String, Continuation)`, `d(String, LEc/g;, String, Continuation)`,
  `e(LEc/c;, String, String, Continuation)`, `f(String, String, String, String, Continuation)`,
  `g(String, String, Continuation)`, `h(String, String, Continuation)`,
  `i(String, LEc/d;, String, Continuation)` — semuanya `suspend` Kotlin
  (parameter terakhir `LYk/b;` = `Continuation`). **Field dari `OtpPayload`,
  `LEc/c`, `LEc/d`, `LEc/g`, `Lsc/c` tidak ada di DEX stub** → isi body JSON
  request OTP/login tidak bisa dipulihkan statis.
- Dagger: `ApiModule.provideOtpService()`, `provideAuthService()`,
  `provideAuthRepository(AuthApiService)`, `provideApi() -> AxisnetApiServices`.

### 4.2 Cek koin / level / katalog bonus

- URL (getter native, sudah di fase 1): cek koin `points.api.axis.co.id/v1/alifetime`,
  `points.api.axis.co.id/v2/alifetime/point`, histori
  `points.api.axis.co.id/v1/alifetime/history`, level
  `profile.api.axis.co.id/v1/alifetime`, naik level
  `profile.api.axis.co.id/v1/alifetime/level-up`, katalog
  `profile.api.axis.co.id/v2/alifetime/bonus` (+ profiling
  `/v2/alifetime/bonus/profiling`), voucher
  `/v1/alifetime/bonus/voucher` dan `/v2/alifetime/bonus/voucher`.
- Repository: `AlifetimeDashboardRepository.<init>(AxisnetApiServices)`,
  `ProfileSectionRepository` (claim bonus + histori poin). Di kode yang bisa dibaca
  hanya ada wiring Dagger-nya (`AlifetimeDashboardUseCase.<init>(repository)`,
  inject ke ViewModel); pemanggilan method repository-nya ada di dex terenkripsi.
- Model response (dari method_ids):
  - `AlifetimeResponse.getCoin() / getLevel()` — keduanya `String`.
  - `PointModel.<init>(int, int, int, int, int, PointFormattedModel)` — 5 angka
    (kemungkinan: total/available/used/expired/bonus coin — urutannya tidak diketahui).
  - `LevelModel.<init>(String, String, int, LevelStatus, String, String, boolean,
    String, LevelFormattedModel)`.
  - `BonusModel.<init>` 18 parameter + getter `getTitle/getSubtitle/getType/getStatus/
    getProducts/getFormatted`; `BonusProductModel` getter `getName/getQuota/getValidity`
    (+ `getIcon` di varian dashboard); `BonusAlifetimeModel`, `BonusFormattedModel`,
    `VoucherAlifetimeModel`, `FlowSuccessModel`.
  - Nama field JSON persisnya (mis. apakah `coin` atau `point`) tidak bisa dipastikan
    tanpa anotasi `@SerializedName` (ikut hilang bersama class_def).

### 4.3 Redeem (tukar koin)

- **Endpoint: `POST https://order.api.axis.co.id/v1/transaction/redeem/alifetime`**
  (getter `claimBonusAlifetimeUrl` di `AlifetimeDashboardRepository` dan
  `alifetimeClaimBonusUrl` di `ProfileSectionRepository` — keduanya menunjuk URL yang sama).
- **Body request TIDAK DIKETAHUI statis.** Class `RewardClaimParam` hanya muncul sebagai
  nama tipe di string pool; tidak ada field/ctor-nya di DEX stub. Tebakan paling masuk
  akal dari konvensi API (`bonusId`) ditulis sebagai UNVERIFIED di prototipe dan
  HARUS dikonfirmasi dari trafik asli. Response sukses/gagal juga tidak diketahui
  (kemungkinan mengikuti envelope standar AXISnet; tidak ada buktinya statis).
- **Redeem tidak bisa dieksekusi dari prototipe** — butuh header Tempest (§3) +
  body yang benar. Keduanya tertutup statis.

### 4.4 Flash War (singkat)

- `FWRepository.<init>(AxisnetApiServices)` → `FWUseCase`; URL
  `flashwar.api.axis.co.id/v1/info` + getter native `FWRepository.flashWarListBonusUrl`,
  `flashWarPurchaseTicketUrl`, `flashWarRedeemBonusUrl`. Detail alurnya sama
  tertutupnya dengan Alifetime (dex terenkripsi).

### 4.5 Lapisan `nativelib` (Kotlin Multiplatform)

- `NativeLibModule` menyediakan `BonusesApi` (`getBonusesUrl`, `getClaimBonusUrl`,
  `getParadeBonusUrl`, `getMccmParadeBonusUrl`, `getBonusLocalQuotaUrl`),
  `SureprizeApi`, `TopUpSureprizeApi`, `StampApi`, `PackageBalanceApi`
  (`getTopUpBalancePackagesApi` — dipakai `LOa/a.balancePackages` bersama
  `AxisnetApiServices.topUpBalancePackages`), `ProductApi`, `GeminiApi`, `IouApi`,
  `MiniProgramApi`, `NotificationApi`, `TrxHistoryApi`, `DataLoanApi`, `GameTokenApi`,
  `ReactivationApi`, `SimReplaceApi`. Ini lapisan API kedua (KMP) di samping Retrofit
  `AxisnetApiServices` — endpoint bonus/parade di sini kemungkinan relevan untuk
  klaim bonus, tapi pemakaiannya (header + body) juga ada di dex terenkripsi.

## 5. Yang TIDAK ditemukan (negatif yang sudah diperiksa)

- Tidak ada `X-Signature`/`x-signature`/`X-Api-Key` di bundle dan tidak ada yang bisa
  diikat ke interceptor native.
- Tidak ada pemakaian HMAC (`javax/crypto/Mac`) di luar biometrik di kode yang bisa dibaca.
- Tidak ada pemakaian `okhttp3`/`Retrofit` builder di kode yang bisa dibaca.
- Tidak ada `alifetime`/`redeem`/`api.axis.co.id` di RN bundle (0 hit) — Alifetime
  murni native.
- Tidak ada `getPos8` di `AxisnetHelpers` (hanya 1–7, 9–12).
- Tidak ada token endpoint OAuth eksplisit di JNI (hanya `grantType` + clientID/secret).

## 6. Signing Modula — TERPECAHKAN PENUH (terverifikasi, dari bundle JS)

> Cakupan: ini signing untuk **gateway Modula** (`gateway.*-modula.xlsmart.co.id`),
> tempat UI Alifetime dirender server-driven. BUKAN signing Tempest untuk
> `*.api.axis.co.id`. Keduanya jangan dicampur — tapi polanya (HMAC-SHA256 atas
> gabungan field + timestamp) kemungkinan mirip dengan yang dipakai Tempest.

Sumber: `assets/index.android.bundle`, `@modula/react-native` v1.0.58, offset ±1.165.192
(fungsi nonce) dan ±1.165.742 (fungsi header). Verbatim (minified):

```js
function l(e,t){var n=e.brandCode.toLowerCase()+e.brandSecret+e.deviceId+t,
  i=r.default.hmac.create();
  return i.start("sha256",e.brandSecret),i.update(n),i.digest().toHex()}
```

```js
function d(e){var t,n,r=Math.floor(Date.now()/1e3).toString();
  return Object.assign({"Content-Type":"application/json",
    "User-Agent":e.userAgent,"X-Brand-Code":e.brandCode,
    "X-Source-Env":e.env,"X-Device-Id":e.deviceId},
    e.msisdn?{"X-Msisdn":e.msisdn}:{},
    {"X-Sdk-Version":e.sdkVersion??<versi SDK>,"X-Platform":e.platform??"React-Native",
     "X-App-Version":e.appVersion,"X-Timestamp":r,"X-Nonce":l(e,r),
     Authorization:`Bearer ${e.authToken}`})}
```

Rumus (Python, terimplementasi di `axisnet_api.py`):

```python
nonce = HMAC-SHA256(key=brandSecret,
                    msg=brandCode.lower() + brandSecret + deviceId + timestamp_detik).hex()
# timestamp = detik epoch (string), bukan milidetik
```

Header: `Content-Type: application/json`, `User-Agent`, `X-Brand-Code` (= clientCode),
`X-Source-Env`, `X-Device-Id`, `X-Msisdn` (opsional), `X-Sdk-Version`, `X-Platform`
(default `React-Native`), `X-App-Version`, `X-Timestamp`, `X-Nonce`,
`Authorization: Bearer <authToken>`.

Alur init Modula:

1. `POST {gateway}/api/data/sdk/init` body `{brandCode, env}` + header OneBackend di atas.
2. Response (base64 JSON) berisi `wrapKey`/`wrap_key`, `signature`,
   `uiUrl`/`ui_url`, `dataUrl`/`data_url`.
3. `wrapKey` di-RSA-decrypt dengan public key PEM dari `signature`
   (node-forge `pki.rsa.decrypt`, buang prefix `\x00`) → `aesKey`.
4. Envelope response berikutnya di-decrypt AES dengan `aesKey`, fallback base64 JSON,
   didukung gunzip (`tryDecryptOneBackendEnvelope`).
5. `brandCode = clientCode = 'JGH5T9ZQ2'` (di bundle, bukan secret);
   `brandSecret` disuplai native saat `ModulaSDK.init()` — nilainya tidak ada di bundle.
   Gateway: prod `https://gateway.modula.xlsmart.co.id`, SIT
   `https://gateway.sit-modula.xlsmart.co.id`, UAT
   `https://gateway.uat-modula.xlsmart.co.id`, Pre-Prod
   `https://gateway.pre-modula.xlsmart.co.id`.

## 7. Penilaian akhir + eksperimen dinamis minimal yang dibutuhkan

**Yang masih tertutup (blocker, berurutan):**

1. Kunci Tempest hasil decrypt — 6 blob ciphertext di `Signature` + kunci perakitannya
   (`getPos*` + `getStringDecrypt` + salt/secret). Input derivasi kuncinya tidak
   teridentifikasi statis.
2. Rumus signing Tempest — field yang di-sign (method/path/body/timestamp/nonce?),
   pemisah, algoritma (HMAC-SHA256 vs SHA512), dan nama header-nya.
3. Body JSON redeem (`RewardClaimParam`) + body OTP/login + field response Alifetime.
4. (Opsional) cara V-Guard mendekripsi dex buffer (`assets/tmp*`) — kuncinya ada di
   native loader; membaliknya butuh analisis `libfgazvajhxc.so` + `libchecks.so`
   (anti-tamper/anti-debug aktif — `NativeThreatsChecker`, `FuncPtrCheck`).

**Eksperimen dinamis minimal (butuh akun + perangkat sendiri, jangan pakai akun orang lain):**

1. Perangkat Android (fisik lebih baik) + APK AXISnet 11.1.0 terpasang + akun AXIS sendiri.
2. `mitmproxy` + sertifikat CA terpasang di perangkat (atau Frida + `frida --codeshare`
   SSL-unpinning) untuk merekam trafik HTTPS ke `*.api.axis.co.id` saat: request OTP →
   login → buka Alifetime → tukar bonus. Dari rekaman ini langsung terbaca: header
   Tempest (nama + format nilai), body redeem, dan response.
3. Frida (opsional, lebih dalam): hook `Signature.apiKey/keyTempest*` dan
   `AxisnetHelpers.getStringDecrypt` + fungsi interceptor untuk menangkap kunci
   hasil decrypt dan input signing di memori — ini yang memecahkan blocker 1–2.
4. Alternatif tanpa root: jalankan APK di emulator + Frida gadget; tanpa KVM akan
   sangat lambat untuk ARM.

**Ketersediaan di VM ini (dicek 2026-11-20): tidak ada** `adb`, `emulator`,
`qemu-system-*`, `frida`, Android SDK, maupun `/dev/kvm`. Jadi langkah dinamis
**tidak bisa dilakukan di VM ini** dan tidak dipaksakan (install emulator tanpa KVM
tidak feasible untuk APK 80 MB). Langkah ini harus dilakukan di perangkat/laptop
yang punya Android tooling, atau ditunda.

## 8. Prototipe Python

File: `~/workspace/axis-koin/axisnet_api.py` (stdlib saja).

- `modula_nonce()` + `modula_headers()` — TERIMPLEMENTASI sesuai §6.
- `AxisnetClient` — endpoint AXISnet (§4) + OTP best-effort; semua secret dari
  environment (`AXIS_OTP_CLIENT_ID`, `AXIS_OTP_CLIENT_SECRET`,
  `AXIS_API_KEY_DECRYPTED`, `AXIS_TEMPEST_KEY`); **tidak ada secret mentah
  yang di-hardcode**.
- `get_coin_profile()` / `list_bonus()` / `redeem()` sengaja raise
  `TempestNotImplemented` — prototipe tidak boleh pura-pura bisa menukar koin.
- Self-test: `python3 axisnet_api.py --self-test` → **lolos**. Nilai nonce
  diverifikasi silang dengan `openssl dgst -sha256 -hmac` (hasil identik,
  `7219238a…` untuk data uji) — ini verifikasi rumus, bukan vektor resmi server.

## 9. File bukti

Di `~/workspace/axis-koin/reverse-latest/`:

- `LAPORAN-FASE2.md` (file ini)
- `fase2-axis-surface.json` — 583 tipe `com.axis.net.*` tanpa class_def + method/field-nya
- `fase2-call-sites.json` — 523 method (kode yang bisa dibaca) yang memanggil target
  yang diawasi (ApiServices/Otp/Auth/Signature/Alifetime/Order/BonusesApi/Helpers/…)
- `fase2-axis-helpers.json` — nilai getter `AxisnetHelpers` (berisi nilai mentah — lokal saja)
- `fase2-axis-pos-filters.json` — hasil saringan regex/digit untuk string `getPos*`
- `fase2-modula-evidence.json` — kutipan fungsi nonce/header Modula + host gateway
- `fase2-tracer.py` — parser DEX mentah yang dipakai (reproduksi)
- `LAPORAN.md` (fase 1), `axis-*.json` (fase 1), `*.xapk`, `extract/` (DEX + `.so`)
- `~/workspace/axis-koin/axisnet_api.py` — prototipe fase 2

## 10. Cara reproduksi

```bash
# 1. Daftar tipe tanpa class_def (parser DEX mentah, tanpa androguard):
python3 reverse-latest/fase2-tracer.py extract/axis/dex/classes2.dex /tmp/out.json
# 2. Getter native:
python3 extract_keys2.py extract/axis/so/lib/arm64-v8a/libnative-lib.so \
  Java_com_axis_net_helper_AxisnetHelpers_ /tmp/helpers.json
# 3. Bundle Modula:
grep -ao "X-Nonce" extract/axis/assets/index.android.bundle
# 4. Self-test prototipe:
python3 ~/workspace/axis-koin/axisnet_api.py --self-test
```
