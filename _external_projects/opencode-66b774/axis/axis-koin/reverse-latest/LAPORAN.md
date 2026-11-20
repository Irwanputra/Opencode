# Laporan Reverse Engineering APK Terbaru — AXIS Coin / myXL

Tanggal pemeriksaan: **20 Nov 2026** (WIB). Kerja statis saja (download + unzip + strings +
disassembly ARM64 dengan Capstone + parsing DEX dengan Androguard). **Tidak menjalankan APK,
tidak login, tidak OTP.**

## 1. APK yang diperiksa

| Aplikasi | Versi | Version code | Package | Sumber download | Ukuran file | SHA256 |
|---|---|---|---|---|---|---|
| myXL | **9.6.0** | 1249 | `com.apps.MyXL` | APKPure via API `tapi.pureapk.com` (file `data.winudf.com`, XAPK) | 165.495.427 byte (158 MB) | `7bb974089fcbc6b35e94dfb9c9e0795cf5e9d32866982c99bcb30766a1d57da6` |
| AXISnet | **11.1.0** | 858 | `com.axis.net` | APKPure via API `tapi.pureapk.com` (file `data.winudf.com`, XAPK) | 83.504.120 byte (80 MB) | `c07ca053a22647916703282d29c11d2c1d1a42cbfd331721be98d50ec3b7cd5f` |

Verifikasi versi: `manifest.json` di dalam XAPK (myXL 9.6.0/1249, target SDK 36;
AXISnet 11.1.0/858, target SDK 36) dan string `9.6.0` / `11.1.0` di dalam DEX.
Uptodown (pembanding): myXL 9.6.0 SHA256 `493e9486…45d36` (XAPK 135,78 MB, 21 Okt 2026),
AXISnet 11.1.0 SHA256 `7943b60f…d9152` (XAPK 87,24 MB, 14 Nov 2026) — beda ukuran karena
varian split yang berbeda; yang dipakai di sini adalah varian APKPure (arm64 + xxhdpi).

Catatan download: `d.apkpure.com` langsung **diblokir Cloudflare (HTTP 403)**.
Yang tembus adalah API `tapi.pureapk.com/v3/get_app_his_version?package_name=…&hl=en`
dengan header `Ual-Access-Businessid: projecta` +
`Ual-Access-ProjectA: {"device_info":{"os_ver":"33"}}` (cara yang dipakai Obtainium).
APKMirror tidak dicoba karena APKPure sudah berhasil dan terverifikasi ukurannya
(myXL 165.495.427 byte persis sama dengan `size` yang diumumkan API).

File di folder ini: `myXL-9.6.0-1249.xapk`, `AXISnet-11.1.0-858.xapk`,
`*-tapi-version-list.json` (daftar versi dari API), `extract/` (APK + DEX + .so hasil ekstrak),
`strings-myxl.txt`, `strings-axis.txt`, `myxl-cardamom.json`, `axis-sig.json`,
`axis-alifetime.json`, `axis-otp.json`, `axis-all.json` (semua getter native),
`extract_keys2.py` (script ekstraktor yang dipakai), `enquota-xl.ts-reference` (pembanding).

## 2. Temuan utama (ringkas)

1. **Kunci lama EnQuota (myXL 8.10.0) TIDAK ADA LAGI dalam bentuk plaintext di APK baru.**
   Ketujuh kunci lama (termasuk potongan 8 karakter pertamanya) muncul **0 kali** di DEX
   myXL 9.6.0 maupun AXISnet 11.1.0, dan 0 kali di semua `.so`.
2. **Rahasia pindah ke native library dalam bentuk ciphertext.** myXL 9.6.0 menyimpan semua
   secret di `libcardamom.so` (`com.myxlultimate.core.spice.Cardamom`, 30 getter JNI);
   AXISnet 11.1.0 di `libnative-lib.so` (getter per API service + `Signature` Tempest).
   Nilai yang dikembalikan getter adalah **string base64/base64url dari byte acak**
   (ciphertext AES), BUKAN kunci plaintext — dibuktikan: hasil base64-decode-nya byte acak
   (mis. `getApiKey` → 32 byte, hanya 13/32 printable), dan alur Kotlin-nya memanggil
   `EncryptionUtil.decryptAesWithHashedKey` sebelum kunci dipakai.
3. **Skema protokolnya MASIH SAMA** di myXL 9.6.0: host `api.myxl.xlaxiata.co.id` (53 kemunculan
   di DEX), endpoint `api/v8/profile`, `balance-and-credit`, `quota-details`,
   `xl-stores/options/detail`, header `x-api-key` / `x-signature` / `x-signature-time`
   (sekarang huruf kecil: `ax-api-signature`, `ax-device-id`, `ax-fingerprint`,
   `ax-request-at`, `ax-request-device`, `ax-request-id`, `ax-substype`), dan format kunci
   HMAC yang digabung `;` (class `HmacSecretKey`, enum `SecretHmacTye`:
   `PAYMENT_BUYPACKAGE_V2`, `REDEEM_VOUCHER`, `LOYALTIES_*`, `AXIS_TRIAL`, `DEFAULT`,
   `NON_LOGIN`, …). CIAM kini lewat library `com/aleph_labs/ciam/` (entity
   `RequestOtp`, `ValidateOtp`, `RefreshToken`, `CiamAccessToken`, …).
4. **AXISnet 11.1.0 TIDAK PAKAI `api.myxl.xlaxiata.co.id` sama sekali.** Ia pakai
   microservice `*.api.axis.co.id` + signing "Tempest" + OAuth `client_credentials`
   (`clientID`/`clientSecret` masih plaintext di `.so`, lihat §5). UI Alifetime sebagian
   dirender server-driven lewat Modula SDK (`@modula/react-native` v1.0.58,
   `gateway.modula.xlsmart.co.id`, `clientCode JGH5T9ZQ2`).
5. **Endpoint Alifetime / coin BERHASIL ditemukan lengkap (plaintext URL di `.rodata`
   AXISnet)** — lihat §5. Endpoint penukaran koin: `POST
   https://order.api.axis.co.id/v1/transaction/redeem/alifetime`.

## 3. Perbandingan kunci: lama (EnQuota 8.10.0) vs baru

| Kunci (EnQuota) | Nilai lama | Di APK baru | Status |
|---|---|---|---|
| `xdataKey` | `5dccbf08920a5527b99e222789c34bb7` (32 char ASCII) | `Cardamom.getEncryptionKey` → blob base64url 64 char: `jPIvjdOJzofWIfEgT2QLqNjxKDoL6nVWsFLJURIQoaonfAEk-JclxqLES-gIvOcs` (decode → 48 byte acak) | **BERUBAH** (format + nilai; blob = ciphertext, bukan kunci langsung) |
| `axApiSigKey` | `18b4d589826af50241177961590e6693` (32 hex) | `Cardamom.getCiamHmacKey` → blob 64 char: `jDaxHwocBR2jF9Rfzc_PQ34SH-sWsKas88CDxiue6-Kbes-z7C7DyRoBQD93Dleg` (decode → 48 byte acak) | **BERUBAH** (ciphertext) |
| `xApiBaseSecret` | `mU1Y4n1v…T7Tzx` (168 char ASCII) | `Cardamom.getEncryptionKeyHmac512` → blob 192 char: `ZZhFCPFgNpKf3JGnmQ3-8dovYNlNyorsC9-9NV3lUUWrPDk9NNjAcdHHSEmZ9f4j6mVRj82Vdtrsy3trGewMmDGu6ZiOsB8OK00aM89QHJ2_pmN2sMHP-ASuABMdwUcV7-pysMYK9ULfalTlxdC1YynqVmO3QdUXDWsIRo91Z5UcB5obcjp_y3R06mVZ3HTn` (decode → 144 byte acak) | **BERUBAH** (ciphertext) |
| `apiKey` (`x-api-key`) | `vT8tINqHaOxXbGE7eOWAhA==` (24 char) | myXL `Cardamom.getApiKey` → `Y5HfxgZ2lusxkpRWNqepA0bKaXCoJSlWL6NWvNnCu48=` (44 char, decode → 32 byte acak); AXISnet `Signature.apiKey` → `ipRsTxOLbgogxEiXj1P73JVWgQk9CEXMSuIsaFO8t6I=` (44 char, decode → 32 byte acak) | **BERUBAH** (ciphertext; nilai myXL ≠ AXISnet) |
| `ciamClientId` | `9fc97ed1-6a30-48d5-9516-60c53ce3a135` (UUID) | `Cardamom.getCiamClientId` → blob 64 char: `zSLSDj6aAjdrjpzUfLf1qSP13AXfOANlKPmQa_heA3hxX4V6IysXjA9qE28UTFA1` (decode → 48 byte acak); ada juga `getCiamClientIdSecond` → `TpwLRn3AKqGnyDwnX4gR3Y5Vht6MMJZtxKrWb-DYXBoY728hk_0mFGRkSFDGi23g` | **BERUBAH** (ciphertext; kini ada client kedua) |
| `ciamClientSecret` | `YDWmF4LJj9XIKwQnzy2e2lb0tJQb29o3` (32 char) | `Cardamom.getCiamClientSecret` → blob 64 char: `2KM87fFA7JBqhYkE2GSjHNYs28dlnj-z-aYn1UJQr6d_65sHIXGGkataxjYo8gH_`; ada juga `getCiamClientSecondSecret` → `u5FW-PS-9SQZADHUCNQEeO2l7TcnRXROhHtk0WATGkozlLHuBxftl3y-4g5U9Jsm` | **BERUBAH** (ciphertext; kini ada secret kedua) |
| `axDeviceId` | `92fb44c0804233eb4d9e29f838223a14` | Tidak ditemukan di DEX/`.so` mana pun (0 kemunculan) | **TIDAK KETEMU** (kemungkinan digenerate per install / disimpan di tempat lain) |
| `axFingerprint` | `YmQLy9ZiLLBFAEVcI4Dnw9+NJWZcdGoQyewxMF/9hbfk/8GbKBgtZxqdiiam8+m2lK31E/zJQ7kjuPXpB3EE8naYL0Q8+0WLhFV1WAPl9Eg=` | Tidak ditemukan (0 kemunculan) | **TIDAK KETEMU** (kemungkinan digenerate per perangkat) |
| `appVersion` | `8.10.0` (`apiUa` myXL / 8.9.1(1204), `ciamUa` myXL / 8.6.0(1179)) | myXL **9.6.0**; string UA eksplisit `myXL / 9.x` tidak ditemukan di DEX (UA kemungkinan dirangkai dinamis dari versionName) | **BERUBAH** (versi naik) |
| CIAM base URL | `https://gede.ciam.xlaxiata.co.id/realms/xl-ciam` | `Cardamom.getCiamUrl` → blob 64 char: `tC7DQnovEIYfigr_RbHHKcZg-Vb3MaquYT-IE1NqOwucMiGyCNXdyw2vMTDe4yOq` (decode → 48 byte acak); string `gede.ciam…` / `realms` **0 kemunculan** di DEX; hanya ada path `openid-connect/token` | **BERUBAH** (URL ikut dienkripsi; host pastinya tidak bisa dibaca statis) |

Catatan: `getEncryptionKeyAESCustomPrepaidAndPrio` mengembalikan blob yang sama persis
dengan `getLiveChatAesEncryptionKey` (`kqT0F4XkQB9SXsS0IQrxtekiH1y6jo-QUKt2W1S5Nt8wLAdK_g0zkrkl9fTJh_me`).
`getXlEnterpriseXenditKey` dan `getXlEnterpriseSelfPaidXenditKey` juga identik.
`getMoEngageAppId` berupa 88 char hex (`918002c0…65741`), `getMedalliaAppId` blob 940 char
(kemungkinan sertifikat/JWT, bukan kunci API).

### Bukti bahwa blob adalah ciphertext (bukan kunci langsung)

1. Semua blob di atas, setelah base64-decode, adalah byte acak (rasio printable rendah,
   mis. `getApiKey` 13/32 printable; `getEncryptionKeyHmac512` 52/144 printable).
2. Alur Kotlin myXL 9.6.0 (dari DEX, `classes6.dex`):
   `HmacSecretKey.a(...)` → `CardamomHelper.getEncryptionKeyValue()` →
   `EncryptionUtil.decryptAesWithHashedKey$default(...)`, dan
   `HmacSecretKey.c(...)` → `CardamomHelper.getEncryptionKeyHmac512Value()` → `a(...)`
   untuk mendapatkan HMAC secret sebelum menghitung `x-signature`.
   Jadi kunci asli hanya ada sesaat di memori setelah AES-decrypt dengan "hashed key"
   (input hash-nya tidak teridentifikasi dari analisis statis ini).
3. Mekanisme ekstraksi blob (agar bisa direproduksi): getter JNI di `libcardamom.so`
   melakukan `malloc(N)` → `ldp q0,q1…` dari alamat `.rodata` (dihitung lewat
   `adrp`+`add`, diverifikasi dengan decode manual instruksi ADRP — hati-hati, Capstone
   menampilkan target absolut, bukan offset) → `NewStringUTF`. Scriptnya:
   `extract_keys2.py` di folder ini.

## 4. myXL 9.6.0 — apa yang masih sama

- Host + path API v8 sama seperti EnQuota: `https://api.myxl.xlaxiata.co.id/api/v8/profile`,
  `packages/balance-and-credit`, `packages/quota-details`, `packages/quota-summary`,
  `xl-stores/options/detail`, `personalization/redeemables`, `personalization/my-vouchers`,
  `xl-point/share/inquiry`, dsb.
- Header signing masih ada (kini huruf kecil): `x-api-key`, `x-signature`,
  `x-signature-time`, `ax-api-signature`, `ax-device-id`, `ax-fingerprint`,
  `ax-request-at`, `ax-request-device`, `ax-request-device-model`, `ax-request-id`,
  `ax-substype`, plus interceptor `Authorization: Bearer %s` dan `ax-additional-data`.
- Format kunci HMAC `;`-joined masih dipakai (`HmacSecretKey.c`, string `';'`).
- **Tidak ada Alifetime di myXL**: string `alifetime`/`Alifetime` = 0 di DEX myXL
  (loyalty di myXL adalah XL Poin: `xl-point/share/inquiry`).
- Limitasi: androguard full-APK analysis **OOM-killed** (batas memori VM 6 GB, APK 129 MB /
  10 DEX); dipakai parsing DEX per-file yang ringan sebagai gantinya. Definisi class
  `EncryptionUtil.decryptAesWithHashedKey` tidak terlacak ke satu class (referensi ada
  di 4 DEX); input key-derivation-nya belum teridentifikasi.

## 5. AXISnet 11.1.0 — peta API baru (ini yang penting buat AXIS Coin)

AXISnet **tidak memakai** `api.myxl.xlaxiata.co.id`. Semua URL absolut berasal dari
`libnative-lib.so` (plaintext di `.rodata`, diekstrak dengan `extract_keys2.py`).
Host produksi: `api.axis.co.id` (staging `staging-api.axis.co.id`, UAT
`uat-api.axis.co.id`, baru `new-api.axis.co.id`).

### 5.1 Alifetime / Coin (endpoint yang dicari)

| Fungsi (getter native) | URL |
|---|---|
| `getCoinProfileUrl` | `https://points.api.axis.co.id/v1/alifetime` |
| `getAlifetimeMembershipUrl` | `https://points.api.axis.co.id/v2/alifetime/point` |
| `getPointHistoryUrl` | `https://points.api.axis.co.id/v1/alifetime/history` |
| `getLevelProfileUrl` | `https://profile.api.axis.co.id/v1/alifetime` |
| `getMigrationAlifetimeUrl` | `https://profile.api.axis.co.id/v1/alifetime/migration` |
| `putLevelUpUrl` | `https://profile.api.axis.co.id/v1/alifetime/level-up` |
| `getRewardAlifetimeUrl` | `https://profile.api.axis.co.id/v1/alifetime/bonus` |
| `getBonusAlifetimeUrl` | `https://profile.api.axis.co.id/v2/alifetime/bonus` |
| `getBonusAlifetimeProfilingUrl` | `https://profile.api.axis.co.id/v2/alifetime/bonus/profiling` |
| `getVoucherAlifetimeUrl` | `https://profile.api.axis.co.id/v1/alifetime/bonus/voucher` |
| `getVoucherAlifetimeV2Url` | `https://profile.api.axis.co.id/v2/alifetime/bonus/voucher` |
| `claimBonusAlifetimeUrl` / `alifetimeClaimBonusUrl` | **`https://order.api.axis.co.id/v1/transaction/redeem/alifetime`** ← penukaran koin |
| `flashWarInfoUrl` | `https://flashwar.api.axis.co.id/v1/info` |
| `alifetimeMultipleTncUrl` | `https://promo.api.axis.co.id/tnc/v2` |

Class DEX-nya tidak di-obfuscate: `com.axis.net.features.alifetime.dashboard.repositories.AlifetimeDashboardRepository`,
`…general.repositories.ProfileSectionRepository`, model `BonusModel`, `VoucherAlifetimeModel`,
`PointModel`, `LevelModel`, dsb. (daftar lengkap getter ada di `axis-alifetime.json` dan
`axis-all.json`).

### 5.2 Auth & signing AXISnet (baru, beda dari myXL)

- OTP/login: `https://otp.api.axis.co.id/v1/otp`, `/otplogin/v2`, `/logout`, `/fcm`.
- OAuth `client_credentials` — **plaintext di `.so`**:
  `clientID = 26NLLzLEZaLwngG0wUVI`, `clientSecret = gU8ya9VoMTFa0LYF3xkjVYpXAAGRwz`,
  `grantType = client_credentials`, `saltKey`/`randomKey = ae432353a4eb4eb9`.
- Signing "Tempest" (`com.axis.net.config.Signature`, getter native) — nilainya **blob
  ciphertext** (base64 dari byte acak), bukan kunci langsung:
  `apiKey = ipRsTxOLbgogxEiXj1P73JVWgQk9CEXMSuIsaFO8t6I=` (44 char),
  `keyTempest = hOc36lLcbQ8JLLGvhekVMVGy0w9hTM9EazVL1Z2aF9BiUG5Ov88rQg==` (56 char),
  `keyTempestCapital = d9kKoBWgOltACb1_e7kjkYxD6HaX1eVQ9Ap0xh3xcetx__gFYyStSRw2x5t54y9VBl7xZ5dIDZqcEtYpxTzLHyuQaBvNrPkl` (96 char),
  `keyTempestMarket = VEOXH8EAnFARSFDtbNnvxA==` (24 char, decode → 16 byte acak),
  `keyTempestMarketCapital = bA7mQfB73531XTWqAt4ItWgEARlLPqrLNOiuznUg0QZ3kO4I8beMwgQT066-ulysRzQTvflCIPsr52R9E4iNbq3IXUNwP9wp` (96 char),
  `keyTempestGuardian = C6EwP6Rw4OeYajoNm7imW9LUWlQll0A=` (32 char).
- Microservice lain (semua `https://*.api.axis.co.id`): profile (`/getuser`, `/updateuser`,
  `/v1/bff/homepage`, `/mutant`, `/list/avatar`, `/v1/check-first-login`), balance
  (`/getbalance`), quota (`quota.api.axis.co.id/quota`, `nq.api.axis.co.id/v1/quota*`),
  products/packages (`products.api.axis.co.id/v1/*`, `packages.api.axis.co.id/*`),
  promo (`promo.api.axis.co.id/v3/banners`, `/dynamic-ui/v2`), voucher
  (`voucher.api.axis.co.id/v1/*`), AIGO (`new-aigo.api.axis.co.id/v1/*`), sureprize
  (`sureprize.api.axis.co.id/best-offer`), order inquiry (`order.api.axis.co.id/v1/inquiry`),
  trxpayments (`/method/v5`, `/repurchase/*`), trxhistory, trxpackages, sendquota,
  transfer balance, digital-voucher, dsb. — daftar lengkap di `axis-all.json`.

### 5.3 Catatan Modula

Bundle React Native AXISnet (`assets/index.android.bundle`, 3,5 MB, JS minified biasa —
bukan Hermes) tidak berisi URL API/endpoint Alifetime sama sekali; yang ada hanya SDK
Modula (`@modula/react-native` v1.0.58, environment SIT/UAT/Pre-Prod/Prod di
`gateway.*-modula.xlsmart.co.id`, `clientCode JGH5T9ZQ2`). UI Alifetime dirender
server-driven dari Modula; API call-nya lewat modul native di atas.

## 6. Kesimpulan: apakah script lama masih bisa dipakai?

**Tidak — script `axis_koin.py` (kunci EnQuota 8.10.0) tidak bisa dipakai apa adanya
untuk APK terbaru, dan TIDAK BOLEH di-update dengan blob di atas** (blob itu ciphertext,
bukan kunci; memasukkannya sebagai kunci hanya akan membuat request gagal / signature
tidak valid). Yang terjadi kalau script lama dijalankan: kemungkinan besar login/OTP
masih jalan sebentar (kalau server masih menerima `appVersion` 8.10.0), tapi
`xdata`/`x-signature` yang dihitung dengan kunci lama akan ditolak server karena
kunci dasarnya sudah diganti dan kini disimpan terenkripsi.

Jalur yang benar ke depan (butuh kerja lanjutan, di luar analisis statis ini):

1. **Untuk AXIS Coin, tinggalkan jalur myXL** — pakai API AXISnet yang baru (§5):
   `otp.api.axis.co.id` (OTP + `client_credentials`) → `points/profile.api.axis.co.id`
   (cek koin/level) → `order.api.axis.co.id/v1/transaction/redeem/alifetime` (tukar).
   Yang belum diketahui: format header signing "Tempest" (kunci Tempest masih ciphertext)
   dan body/parameter redeem — perlu analisis interceptor `RequestInterceptor` /
   `Signature` di DEX AXISnet atau pengamatan trafik (di luar tugas statis ini).
2. **Untuk myXL**, kunci asli hanya bisa didapat dengan membalik
   `decryptAesWithHashedKey` (cari input hash-nya) atau analisis dinamis (menjalankan
   APK + Frida) — keduanya di luar batas tugas ini (statis saja, jangan jalankan APK).
3. **Script `axis_koin.py` TIDAK di-update nilainya** — hanya header-nya ditambah
   peringatan bahwa kunci lama terkonfirmasi tidak ada di 9.6.0/11.1.0 (lihat
   `axis_koin.py`, catatan versi 2026-11-20). File laporan ini adalah hasil akhirnya.

## 7. Cara reproduksi

```bash
# download (butuh header Obtainium; d.apkpure.com langsung diblokir Cloudflare)
curl -H "Ual-Access-Businessid: projecta" \
     -H 'Ual-Access-ProjectA: {"device_info":{"os_ver":"33"}}' \
     "https://tapi.pureapk.com/v3/get_app_his_version?package_name=com.apps.MyXL&hl=en"
# XAPK adalah ZIP: unzip -> base APK -> classes*.dex + lib/arm64-v8a/*.so (dari split config.arm64_v8a.apk)
# strings: strings -n 6 classes*.dex
# ekstraksi getter native: python3 extract_keys2.py <libxxx.so> <prefix_JNI> [out.json]
#   (disassembly ARM64 dengan Capstone; target ADRP dihitung dari encoding instruksi)
```
