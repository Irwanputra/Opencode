# Laporan Fase 4 — AXISnet 11.1.0: rumus signing Tempest TERPECAHKAN (statis)

Tanggal: **2026-11-20 (WIB)**. Kerja di VM ini saja (bukan dark-wren).
**Tidak login, tidak OTP, tidak redeem, tidak ada nomor telepon yang dipakai,
tidak ada hook lisensi yang ditulis.**

## 0. Ringkasan eksekutif

| Pertanyaan | Jawaban |
|---|---|
| Rumus Tempest ketemu? | **YA — lengkap untuk ketiga keluarganya (h, m, j/v).** HMAC-SHA256, hex kecil, pesan dipisah `;`, kunci dipilih menurut env staging/prod. |
| Seberapa lengkap? | Pesan + fungsi hash + encoding + pemilihan kunci + handshake + interceptor + body redeem — semuanya diturunkan dari smali dan **diverifikasi ulang mandiri** (bukan hanya memakai dump sesi sebelumnya). |
| Signing bisa diuji lokal? | **Ya.** `python3 axisnet_api.py --self-test` lolos; handshake DESede dicocokkan dengan `openssl` (kedua varian padding). |
| Bisa redeem/cek koin sekarang? | **Belum.** Nilai kunci hasil decrypt + token login masih kosong (hanya dari env). Tanpa itu request tidak dikirim — prototipe tetap memblokir. |
| Yang masih tebak-tebakan? | Padding cipher CryptoTool (PKCS5Padding vs NoPadding) dan nilai literal ALGORITHM/MODE/PADDING — ditandai **BELUM TERVERIFIKASI** di §1.5/§7. |

Sumber: DEX hasil dekripsi fase 3 (`fase3/tmp14169616706995394833.dex` 5.033.568 byte
dan `fase3/tmp3065699920606524921.dex` 2.885.408 byte). Direktori `fase4/` sudah
berisi dump dari sesi sebelumnya (12:36–12:51 WIB); **semua klaim inti di laporan
ini saya verifikasi ulang sendiri** dengan script androguard baru
(`/tmp/fase4_verify.py`, `fase4_verify2.py`, `fase4_verify3.py`, `fase4_verify5.py`)
— dump lama hanya dipakai sebagai peta awal, bukan sebagai bukti.

---

## 1. Rumus Tempest — `com.axis.net.config.Signature`

Kelas ada di `tmp14169616706995394833.dex`. `<clinit>` hanya membuat singleton
`Signature.a`; tidak ada kunci di `<clinit>`.

### 1.1 Inti: `f` + `c` — HMAC-SHA256, output hex kecil

```smali
# Signature.f(String msg, String key)  — register: this=v5, msg=v6, key=v7
const-string v0, "HmacSHA256"
invoke-static v0, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;
# SecretKeySpec DARI v7 (= argumen ke-2 = key), doFinal DARI v6 (= argumen ke-1 = msg)
invoke-virtual v7, v3, Ljava/lang/String;->getBytes(...)   # key UTF-8
invoke-direct  v2, v7, v0, Ljavax/crypto/spec/SecretKeySpec;-><init>([B Ljava/lang/String;)V
invoke-virtual v1, v2, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
invoke-virtual v6, v3, Ljava/lang/String;->getBytes(...)   # msg UTF-8
invoke-virtual v1, v6, Ljavax/crypto/Mac;->doFinal([B)[B
invoke-virtual v5, v6, Lcom/axis/net/config/Signature;->c([B)Ljava/lang/String;
# Signature.c(byte[]): Formatter "%02x" per byte  => hex KECIL, 64 karakter
```

Jadi: **`x-signature = hex-lower(HMAC-SHA256(key=UTF-8, message=UTF-8))`**.
Urutan argumen sudah dicek dua arah: di `h`, `invoke-virtual v1, v2, v3, f`
dengan v2 = pesan hasil StringBuilder dan v3 = hasil `g()` (kunci) — konsisten
dengan `f` yang memakai v7 (arg-2) sebagai kunci.

### 1.2 Keluarga `h` — 5 field, dipakai interceptor + redeem + flashwar

```smali
# Signature.h(method, path, json, token, handShake)
# message = method + ";" + path + ";" + json + ";" + token + ";" + handShake
# key     = g()
invoke-virtual v1, v2, v3, Lcom/axis/net/config/Signature;->f(...)  # f(message, g())
```

Pembungkusnya (semua memanggil `h`):

| Method | Isi |
|---|---|
| `e(token, json, handShake)` | `h("POST", "/v1/transaction/redeem/alifetime", json, token, handShake)` — **redeem** |
| `l(token, path, json, handShake)` | `h("GET", path, json, token, handShake)` |
| `p(token, json, handShake)` | `h("POST", "/v1/claim-bonus", json, token, handShake)` |
| `o(token, json, handShake)` | `h("POST", "/v1/purchase-ticket", json, token, handShake)` |
| interceptor | `h(method.toUpperCase(ROOT), path, rawBody, Authorization, i())` (§3) |

### 1.3 Keluarga `m` — 4 field, tanpa token

```smali
# Signature.m(method, path, json, handShake)
# message = method + ";" + path + ";" + json + ";" + handShake
# key     = u()
# Signature.n(json, handShake) = m("POST", "/prefix", json, handShake)
```

Pemanggil `n`: `RegistrationUseCase.checkNumberPrefix` (dengan `i()` sebagai
handShake). Dipakai untuk cek prefix nomor.

### 1.4 Keluarga `j` / `v` — 9 field, OTP/login, method selalu POST

```smali
# Signature.j/v(path, f1..f8): null -> ""
# message = "POST;" + path + ";" + f1 + ";" + ... + ";" + f8 + ";" + apiKey()
# key     = u()
# k/w = pembungkus sintetik Kotlin (default-arg) untuk j/v
```

Pemanggil nyata (terverifikasi dari smali pemanggil):

| Pemanggil | Path | 8 field |
|---|---|---|
| `splashLogin/viewModel/x.getOtpLoginSignature` | `/otplogin/v2` | msisdn, otp_code, fcm_token, fb_id, model, brand, device_os, device_type |
| `homePage/home/viewModel/g.sendDataOtp` | `/v1/otp` | msisdn-terenkripsi-SSO, deviceType, lalu 6× null → `""` (mask bit 252) |
| `splashLogin/viewModel/g.getTokenAutoLoginSignature` | (via `w` → `v`) | — (tidak dibedah sampai field; pola sama) |
| `splashLogin/viewModel/x.loginBiometric` | (via `k` → `j`) | — (pola sama) |

Pesan contoh `/v1/otp`: `POST;/v1/otp;<encMsisdn>;<deviceType>;;;;;;;<apiKey>`.

### 1.5 Pemilihan kunci: `g`, `u`, `x` — staging vs prod

```smali
# Signature.x(): ServerEnv.STAGING.key equalsIgnoreCase(M5/b.c())  -> true = staging
# Signature.g(): x() ? r() : s()     ;  r() = d(keyTempestMarket())
#                                  ;  s() = d(keyTempestMarketCapital())
# Signature.u(): x() ? t() : q()     ;  t() = d(keyTempest())
#                                  ;  q() = d(keyTempestCapital())
# Signature.d(x) = a(x) = CryptoTool.decryptString(x, AxisnetHelpers.getSaltKey())
```

| Keluarga | Staging (`x()` true) | Prod (`x()` false) |
|---|---|---|
| `h` (kunci `g()`) | decrypt(`keyTempestMarket()`) | decrypt(`keyTempestMarketCapital()`) |
| `m`, `j/v` (kunci `u()`) | decrypt(`keyTempest()`) | decrypt(`keyTempestCapital()`) |

`keyTempest*` dan `apiKey()` adalah **method native** (`libnative-lib.so`) yang
mengembalikan blob ciphertext; `d`/`a` men-decrypt-nya (lihat §1.6). Nilai
plaintext kunci **tidak ada di DEX** — hanya bisa didapat saat runtime
(Frida/mitmproxy) atau dari trafik.

### 1.6 Rantai decrypt kunci + handshake — `CryptoTool`, `KeyClass`, `AxisnetHelpers`

```smali
# Signature.a(blob): CryptoTool.decryptString(blob, AxisnetHelpers.getSaltKey())
#   getSaltKey() = native getter (libnative-lib.so)
# CryptoTool.decryptString(v, saltKey):
#   key  = doPadWithString(saltKey, 24, '\0')          # pad ke 24 byte
#   v    = v.replace("-", "+").replace("_", "/")       # base64url -> standar
#   ct   = Base64.decode(v);  pt = Cipher(algorithm/mode/padding).decrypt(ct)
#   return pt.trim()  (Kotlin trim: buang karakter <= ' ' di kedua ujung)
# CryptoTool.encryptString(plaintext, key):
#   plaintext = doPadWithString(plaintext, 8, '\0')   # pad ke kelipatan 8
#   key       = doPadWithString(key, 24, '\0')
#   ct = Cipher(algorithm/mode/padding).init(ENCRYPT, key-tanpa-IV).doFinal(pt)
#   return Base64(ct).replace("+", "-").replace("/", "_")   # URL-safe, '=' dipertahankan
# doPadWithString(s, n, pad): pad = (n - len%n) % n; TIDAK nambah bila sudah kelipatan.
# Cipher.init TANPA IvParameterSpec  => mode ECB.
# KeyClass.getAlgorithm/Mode/Padding: EnumCrypto.ALGORITHM/MODE/PADDING.toString()
#   -> nilainya dirakit runtime dari O5/a.d(i) (= AxisnetHelpers.getPosN(), native)
#      + Regex-replace + Consta.toString()  => literal TIDAK terbaca statis.
```

**Batasan cipher (disimpulkan dengan batas, bukan ditebak bebas):**
kunci 24 byte + blok 8 byte hanya cocok dengan **DESede (TripleDES)** di JCA
standar; tanpa IV berarti **ECB**. Jadi cipher = `DESede/ECB/<padding>`.
**BELUM TERVERIFIKASI:** padding — `PKCS5Padding` vs `NoPadding` keduanya
konsisten dengan kode (plaintext sudah di-zero-pad manual; decrypt lalu
di-trim, sehingga sisa zero-pad hilang di kedua varian). Prototipe memakai
default `PKCS5Padding` (paling umum) dan menyediakan parameter/env
`AXIS_TEMPEST_PADDING` untuk beralih bila trafik nyata membuktikan sebaliknya.

### 1.7 Handshake — `Signature.i`

```smali
# Signature.i():
#   ts = DateHelper.getTodayTimeStamp()          # = Date.getTime() dari
#       Calendar.getInstance().getTime() = milidetik epoch SAAT INI
#       (BUKAN tengah malam; yang tengah malam itu getTodayDateOnly())
#   hs = CryptoTool.encryptSSO(String.valueOf(ts))   # encryptString(ts, sharedKey)
#       sharedKey = KeyClass.getSharedKey() = AxisnetHelpers.getMsisdnSaltKey() (native)
#   return hs.replace("\n", "")
```

Jadi `x-handshake` = DESede-encrypt(milis-sekarang-sebagai-string, sharedKey),
base64 URL-safe, tanpa `\n`. Handshake dihitung **baru tiap request**
(interceptor memanggil `i()` per request; usecase redeem juga memanggil `i()`
per klaim) — nilainya berubah tiap milidetik, tidak bisa dipakai ulang.

### 1.8 Arti field `token` dan `json` (penting, sering salah tafsir)

- `token` = **nilai persis header `Authorization`** (termasuk awalan `Bearer `
  bila ada). Interceptor: `String.valueOf(request.header("Authorization"))`;
  bila header tidak ada, nilainya string `"null"`. Di usecase redeem, `$token`
  yang sama dipakai sebagai header Authorization SEKALIGUS field token signing.
- `json` = **string mentah body persis seperti dikirim** (serialisasi Gson
  dari objek body). Bila tidak ada body (GET), `json = ""`.
- `path` = `URI.getPath()` saja — **tanpa query string**. Query (`?level=...`)
  tidak masuk pesan signing.
- `method` = method HTTP di-UPPER dengan `Locale.ROOT` (interceptor) /
  literal `"POST"`/`"GET"` (pembungkus `e/l/p/o`).

---

## 2. Peta header & interceptor

### 2.1 `HMACSignatureInterceptor` (`tmp3065699920606524921.dex`)

```smali
# intercept(chain): bila method Retrofit TIDAK beranotasi @HMACHeader -> teruskan apa adanya
#   findAnnotation(): cari @HMACHeader di anotasi method Retrofit (cache per hashCode URL)
#   bila ada:
#     method  = request.method().toUpperCase(Locale.ROOT)
#     path    = request.url().toURI().getPath()
#     json    = tag String di request bila ada, else raw body (getRawBodyString) else ""
#     hs      = Signature.i()
#     token   = String.valueOf(request.header("Authorization"))
#     sig     = Signature.h(method, path, json, token, hs)
#     tambah header: x-signature = sig ; x-handshake = hs
```

**Method Retrofit ber-`@HMACHeader`** (dari `fase4/api-annotations2.json`,
diverifikasi ulang dari anotasi DEX):

| Method | HTTP | Keterangan |
|---|---|---|
| `claimBonus` | POST | body `A8/a` (lihat §4.3 — class tidak ditemukan di DEX) |
| `getAlifetimeBonus` | GET | query `level`, `from` |
| `getAlifetimeBonusDetail` | GET | |
| `getAlifetimeBonusProfiling` | GET | |
| `getAlifetimeMembership` | GET | |
| `getAlifetimeVoucher` | GET | |
| `getPointProfile` | GET | query `level` — **cek koin/level utama** |
| `levelUpAlifetime` | POST | |

**Tidak ber-`@HMACHeader`** (tidak kena interceptor): `alifetimeClaimBonus`
(redeem — signing manual via `Signature.e`, §4.1), `getLevelAlifetime`
(hanya Authorization + x-app-version), `getOtp`, `getOtpLogin`,
`purchaseTicketFlashWar`, `redeemBonusFlashWar`, `claimVoucher`,
`checkNumberSimReplace`, `getCoinWordingLevel`.

### 2.2 `Client.generateClient` — interceptor selalu terpasang

OkHttpClient bersama (timeout 45/45/45/65 detik, CertificatePinner):
`HMACSignatureInterceptor` **selalu** ditambahkan; `RequestInterceptor`
ditambahkan kondisional (bila `M5/b.g()` / `M5/b.e()` — flag env non-prod);
lalu Chucker + Pluto interceptor (debug).

### 2.3 `RequestInterceptor` — bukan signing, tapi header + rewrite host

`intercept` → `a(request)`: menambah header **`x-app-request-id` = UUID acak**,
lalu menulis ulang URL via `b(url)` → `d(url, host, isHttps)` (ganti host
menjadi `hostNameProduction/Staging/Uat/New` dari getter native, dan paksa
`https`→`http` bila env tidak https). Signing Tempest TIDAK dilakukan di sini.
Per-host signing tidak ada — satu interceptor untuk semua host di client ini.

### 2.4 Header akhir per jenis panggilan

| Panggilan | Header |
|---|---|
| GET/POST `@HMACHeader` (mis. cek koin) | `Authorization`, `x-app-version`, `x-signature`, `x-handshake` (+ `x-app-request-id` bila RequestInterceptor aktif) |
| Redeem `alifetimeClaimBonus` | `x-handshake`, `x-signature`, `x-app-version`, `Authorization` (sebagai @Header eksplisit), body JSON |
| `getLevelAlifetime` | `x-app-version`, `Authorization` saja |
| OTP login `getOtpLogin` | `X-API-KEY`, `x-app-version`, `x-signature` (dari `v`), `Content-Type`, `Connection`, body `sc/c` |

---

## 3. Body redeem & model Alifetime

### 3.1 Redeem yang benar — `alifetimeClaimBonus`

Rantai pemanggil (terverifikasi):
`AlifetimeDashboardUseCase$claimBonusAlifetime$1.invokeSuspend` **dan**
`AlifetimeProfileSectionUseCase$alifetimeClaimBonus$1.invokeSuspend`:
```smali
handshake = Signature.i()
signature = Signature.e($token, $contentSignature, handshake)
  # e = h("POST", "/v1/transaction/redeem/alifetime", json, token, handshake)
repository.alifetimeClaimBonus(handshake, signature, versionName, token, url, content)
```
`$contentSignature` = string JSON body (Gson) dari objek `Ld6/a`.
`url` = `AlifetimeDashboardRepository.claimBonusAlifetimeUrl()` — getter
**native** (nilai path runtime; konsisten dengan
`order.api.axis.co.id/v1/transaction/redeem/alifetime` dari fase 1).
Anotasi parameter `alifetimeClaimBonus`: `x-handshake, x-signature,
x-app-version, Authorization, @Url, @Body Ld6/a`.

### 3.2 Body HTTP redeem — `AlifetimeClaimBonusRequest` (`Ld6/a`)

```smali
# Ld6/a; fields: productId, productType, merchantCode (ctor sesuai urutan itu)
# toString: "AlifetimeClaimBonusRequest(productId=..., productType=..., merchantCode=...)"
# Anotasi field (d6_field_ann.py): HANYA @Nullable — TIDAK ADA @SerializedName
```
Body JSON: `{"productId":"...","productType":"...","merchantCode":"..."}` —
nama field = nama field persis (Gson default), urutan sesuai deklarasi.
**Koreksi atas fase 2:** body `{"bonusId": ...}` di prototipe lama adalah
tebakan dan **salah** — sudah diganti.

### 3.3 `RewardClaimParam` BUKAN body HTTP

`RewardClaimParam` (data class, `Serializable`): field `descPackage, userId,
product: BonusProductModel, position: Integer, type, merchantCode`.
Ini parameter **navigasi layar claim** (dibawa antar Activity/Fragment),
bukan body yang dikirim ke server. Jangan dipakai sebagai body redeem.
`BonusProductModel` field: `benefits, description, icon, name, pricePlanCode,
quota, serviceId, status, tnc, type, validity, voucherType`.

### 3.4 Yang tidak ketemu

- **Body `claimBonus` (`LA8/a`)**: class `LA8/a;` tidak ada definisinya di
  ketujuh DEX hasil dekripsi (bahkan string namanya tidak ada di string table).
  Kemungkinan ada di stub `classes.dex` XAPK atau modul lain. Pemakainya:
  `BonusesUseCase$claimBonus$1` (jalur playground/bonus, bukan Alifetime).
  **BELUM TERVERIFIKASI** — tidak menghambat redeem Alifetime.
- **Response model cek koin**: tetap seperti fase 2 —
  `AlifetimeResponse.getCoin()` / `getLevel()` (String). Catatan tambahan:
  usecase memanggil `NativeLib.decryptResponse(false, response.data)` —
  **response API terenkripsi** dan butuh decrypt native sebelum parsing;
  ini belum diimplementasikan di prototipe (lihat §6).
- **Path/URL runtime**: semua `*Url()` repository (`getCoinProfileUrl`,
  `getBonusAlifetimeUrl`, `claimBonusAlifetimeUrl`, dst.) adalah method
  **native** — nilai URL persisnya hanya terlihat saat runtime. Path yang
  dipakai prototipe (`points/profile/order.api.axis.co.id/...`) berasal dari
  pemetaan fase 1 dan konsisten dengan path hardcode di `Signature.e`
  (`/v1/transaction/redeem/alifetime`).

---

## 4. Perubahan di `axisnet_api.py`

File: `~/workspace/axis-koin/axisnet_api.py` (ditulis ulang bagian Tempest;
bagian Modula tidak berubah). **Tidak ada secret/kunci mentah yang di-hardcode
di mana pun** — semua nilai kunci dari env var.

Fungsi baru:

| Fungsi | Padanan smali |
|---|---|
| `tempest_hmac_hex(message, key)` | `Signature.f` + `c` |
| `tempest_message_h / tempest_sign_h` | `Signature.h` (5 field) |
| `tempest_message_m / tempest_sign_m` | `Signature.m` (4 field) |
| `tempest_message_j / tempest_sign_j` | `Signature.j/v` (9 field, null→`""`) |
| `tempest_sign_redeem(token, body_json, handshake, key)` | `Signature.e` |
| `tempest_encrypt_string / tempest_decrypt_string` | `CryptoTool.encryptString/decryptString` (DESede/ECB, pad `\0`, base64 URL-safe) |
| `tempest_handshake(timestamp_ms, shared_key, padding)` | `Signature.i` (+ `encryptSSO`) |
| `AxisnetClient._tempest_headers(method, url, body, token, handshake)` | `HMACSignatureInterceptor.intercept` (path tanpa query, json mentah, token = Authorization persis) |
| `AxisnetClient.tempest_key_h / tempest_key_mj` | `Signature.g / u` (staging→varian biasa, prod→`*Capital`) |
| `AxisnetClient.make_handshake()` | `Signature.i` |
| `AxisnetClient.redeem(product_id, product_type, merchant_code, ...)` | body `AlifetimeClaimBonusRequest`, signing `Signature.e` |
| `AxisnetClient.get_level_profile()` | GET tanpa HMAC (hanya Authorization + x-app-version) |

Env var baru: `AXIS_TEMPEST_KEY_MARKET` (kunci h staging),
`AXIS_TEMPEST_KEY_MARKET_CAPITAL` (kunci h prod),
`AXIS_TEMPEST_KEY` (kunci m/j staging), `AXIS_TEMPEST_KEY_CAPITAL`
(kunci m/j prod), `AXIS_TEMPEST_SHARED_KEY` (sharedKey handshake),
`AXIS_AUTH_TOKEN` (nilai header Authorization persis),
`AXIS_ENV` (`prod` default / `staging`), `AXIS_APP_VERSION` (default
`11.1.0`), `AXIS_TEMPEST_PADDING` (default `PKCS5Padding`).
Bila kunci kosong, `_tempest_headers` tetap melempar `TempestNotImplemented`
dengan nama env yang kurang — prototipe tidak boleh pura-pura bisa request.

---

## 5. Hasil pengujian (lokal, tanpa login, tanpa network)

`python3 axisnet_api.py --self-test` → **lolos (exit 0)**:

```
  handshake DESede OK (contoh: X7yH6EwFI48DUQaGdoY4ISjcHyNab30u)
self-test OK: Modula konsisten; Tempest h/m/j + header + handshake konsisten;
tanpa kunci tetap diblokir (benar).
```

Yang diuji:
1. Modula nonce/header — sama seperti fase 2 (tetap lolos).
2. Pesan `h`: vektor literal `POST;/v1/transaction/redeem/alifetime;{...};Bearer TOKEN-UJI;HS-UJI`
   cocok persis; `tempest_sign_redeem == tempest_sign_h` untuk redeem.
3. Determinisme: signing 2× sama; berubah bila salah satu field
   (method/path/json/token/handshake/kunci) berubah.
4. Pesan `m`: `POST;/prefix;{"msisdn":"6281"};HS-UJI`.
5. Pesan `j/v`: OTP login 8 field + apiKey; `/v1/otp` dengan 6 field null →
   `POST;/v1/otp;ENC-MSISDN;android;;;;;;;APIKEY-UJI`; field ≠ 8 ditolak.
6. Handshake DESede round-trip: `encrypt → decrypt == "1763635200000"`;
   `decrypt(encrypt("6283812345678"))` kembali utuh.
7. Header builder: `_tempest_headers("GET", coin_profile, None, handshake="HS-UJI")`
   menghasilkan `x-signature` 64-hex yang sama dengan `tempest_sign_h(...)`,
   `x-handshake` terus, `Authorization` terus; mode staging memilih kunci
   Market (bukan MarketCapital).
8. Tanpa kunci env → `get_coin_profile()` tetap raise `TempestNotImplemented`.

Verifikasi independen terhadap `openssl` (bukan self-consistency semata):

```
openssl DESede-ECB (zero-pad + PKCS5) : X7yH6EwFI48DUQaGdoY4ISjcHyNab30u
python tempest_encrypt_string         : X7yH6EwFI48DUQaGdoY4ISjcHyNab30u  -> COCOK
openssl DESede-ECB (NoPadding)        : X7yH6EwFI48DUQaGdoY4IQ==
python padding="NoPadding"            : X7yH6EwFI48DUQaGdoY4IQ==          -> COCOK
```

(dengan kunci uji `SHARED-UJI` — bukan kunci asli; nilai di atas hanya vektor
uji, bukan secret.) Selama pengujian sempat ada satu bug (unpadder dipakai
sebelum decrypt pada backend `cryptography`) — diperbaiki, lalu self-test lolos.
Perlu dicatat: `cryptography` 50.0.2 sudah memindahkan TripleDES ke
`cryptography.hazmat.decrepit...`; kode memakai lokasi baru dengan fallback lama.

Batasan pengujian: semua di atas membuktikan **konsistensi implementasi
dengan smali**, bukan penerimaan oleh server. Tanpa kunci asli + token, tidak
ada request yang dikirim dan tidak ada yang bisa membuktikan server menerima.

---

## 6. Yang MASIH KURANG untuk login/redeem end-to-end

1. **Nilai kunci hasil decrypt** (paling utama): `keyTempestMarketCapital`
   (h prod), `keyTempestCapital` (m/j prod), `apiKey()`, `saltKey`,
   `sharedKey` (getMsisdnSaltKey). Semuanya hanya ada saat runtime — butuh
   Frida di perangkat/emulator (hook `Signature.q/r/s/t`, `CryptoTool`
   decrypt, atau getter native) atau tangkapan trafik. **Jangan ditebak,
   jangan pakai blob base64 `.so` sebagai kunci** (itu ciphertext).
2. **Token login** (`Authorization`): butuh OTP dengan nomor user sendiri
   (hanya dengan user hadir).
3. **Padding cipher**: `PKCS5Padding` vs `NoPadding` — hanya trafik nyata /
   Frida yang bisa memastikan (prototipe bisa beralih lewat
   `AXIS_TEMPEST_PADDING`).
4. **Nilai literal ALGORITHM/MODE/PADDING**: tersembunyi di balik string
   obfuskasi `O5/a` + `Consta` (butuh decode native `getPosN`); tidak
   menghambat selama DESede/ECB terbukti dari panjang kunci/blok.
5. **Decrypt response**: response API terenkripsi (`NativeLib.decryptResponse`)
   — butuh rumus/native-nya sebelum response cek koin/redeem bisa dibaca.
6. **Body `claimBonus` (`LA8/a`)**: class tidak ditemukan di DEX hasil
   dekripsi (bukan jalur Alifetime; tidak menghambat redeem).
7. **URL runtime**: `*Url()` repository adalah native getter — path di
   prototipe berasal dari fase 1 + hardcode `Signature.e`; perlu dicocokkan
   dengan trafik nyata.
8. **Verifikasi server**: satu request `GET /v1/alifetime` dengan kunci +
   token asli adalah satu-satunya bukti akhir rumus ini diterima server.

## 7. Langkah berikut

- **Fase 5 (dinamis, butuh perangkat/emulator + user hadir):** lewati license
  check PairIP (image Play Store / perangkat fisik), jalankan Frida hook
  `Signature` + `CryptoTool` + OkHttp (script sudah ada di `fase3/`),
  tangkap nilai kunci hasil decrypt + `x-signature`/`x-handshake` nyata,
  lalu cocokkan dengan `tempest_sign_h` di prototipe (input yang sama harus
  menghasilkan signature yang sama).
- Bila Frida tidak memungkinkan: mitmproxy saja sudah cukup untuk
  memverifikasi *format* (header + body), meski kunci tetap tidak terlihat.
- Setelah kunci didapat (diisi via env, tidak pernah di-commit): uji
  `get_coin_profile()` → bila 200, rumus terverifikasi end-to-end; baru
  kemudian redeem (hanya bila user meminta, dengan bonus pilihannya).
