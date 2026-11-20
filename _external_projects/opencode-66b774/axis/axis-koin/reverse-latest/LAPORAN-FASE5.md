# LAPORAN FASE 5 — Kunci Tempest dipatahkan STATIS (tanpa emulator/Frida)

Tanggal: 2026-11-20. Mesin: Linux x86-64 tanpa Android/Frida/mitmproxy.
Bahan: arsip `axis-koin-bahan.tar.gz` (fase 1–4), APK AXISnet 11.1.0
(`reverse-latest/scratch-apk/`, hanya ABI `arm64-v8a`).

## 0. Ringkasan

Empat dari empat "gap" yang menutup fase 4 sudah tertutup **statis**:

| Gap fase 4 | Status fase 5 | Cara |
|---|---|---|
| 1. Nilai kunci hasil decrypt (`apiKey`, `keyTempest*`, `sharedKey`) | **TERPECAHKAN** | blob ciphertext = string `.rodata` di `libnative-lib.so`; saltKey juga string statis di .so yang sama → `decryptString` dihitung offline |
| 2. Token login (OTP) | **SIGNATURE OTP TERKONFIRMASI LIVE, token masih butuh user** | nomor + OTP user; `POST /v1/otp` sudah dibalas `400 Nomor Axis ... salah` (bukan `Invalid signature`) → signature diterima, hanya nomor yang kurang (§5.1) |
| 3. Padding DESede (`PKCS5Padding` vs `NoPadding`) | **TERPECAHKAN = `NoPadding`** | literalnya dibaca dari string obfuskasi `getPos9/10/11` |
| 4. `NativeLib.decryptResponse` | **TERPECAHKAN** | flag `false` = Base64+UTF-8+trim (bukan cipher); flag `true` = DESede/saltKey; ke-57 call-site dipastikan mekanis: 43× flag 0 (termasuk semua jalur koin/Alifetime), 14× flag 1 (BYOP/reaktivasi/IOU/top-up) — §4.1 |

Hasilnya: `axisnet_api.py` sekarang bisa menghitung **header lengkap**
(`x-handshake`, `x-signature`, `X-API-KEY`, `x-app-version`) untuk
`/v1/otp`, `/otplogin/v2`, cek koin, bonus, dan redeem **tanpa env var apa pun**.
Satu-satunya yang kurang adalah token hasil login — **dan itu sudah tertutup
juga**: user login live tanggal 21 Nov 2026, semua endpoint balas `200`
(§7). Yang tersisa cuma keputusan bisnis server soal kelayakan klaim bonus
(akun user berstatus `GRACE`, redeem 0 koin ditolak `404`).

Temuan baru di sisi server (percobaan nyata, tanpa nomor): API berada di
belakang Cloudflare dan **menolak User-Agent default Python**
(`403 error code: 1010`). Dengan UA wajar (mis. `okhttp/4.9.3`) server
membalas JSON polos `{"status":false,"status_code":401,"error_message":"session invalid"}`.

## 1. Alat

Semua di `reverse-latest/fase5/` (jalankan dari folder itu):

| File | Fungsi |
|---|---|
| `fase5_native_extract.py` → `native_strings.json` | Disassemble **273** fungsi `Java_*` di `libnative-lib.so` (capstone ARM64) dan rekonstruksi string yang dikembalikan: sumber `adrp+add` ke `.rodata`, **plus** patch `strb/strh/stur/stur/str` dari konstanta `mov/movk/movn`, **plus** string yang dirakit whole-di-stack (libc++ small-string: byte `[sp]` = tag, panjang = `tag>>1`). 272/273 berhasil. |
| `fase5_static_secrets.py` → `static_secrets.json` | Katalog 272 getter: nilai mentah + (bila cocok pola) hasil dekode obfuskasi atau hasil decrypt DESede → plaintext kunci. |
| `fase5_decode_pos.py` | Bukti aturan dekode obfuskasi + `getPos9/10/11` → `DESede`/`ECB`/`NoPadding`. |
| `fase5_decrypt_keys.py` | Bukti awal: blob `keyTempest*` + saltKey statis → plaintext kunci. |
| `fase5_disasm_getters.py` | Cetak listing getter native yang tidak mengembalikan string statis (untuk debugging extractor). |
| `fase5_dump_class.py` | Dump smali kelas dari semua DEX (scratch + fase 3) pakai androguard 4.1.4. |
| `fase5_xref.py` | Cari pemanggil sebuah method (eksperimen; `code.get_bc().get_raw()` tidak memuat nama method, jadi hasilnya kosong — lihat §7). |
| `evidence/*.txt` | Dump smali yang dikutip di laporan ini (`t5g`, `nativelibimpl`, `otppayload`, `homevm`, `splashvm`, `fbs`, `utils`, `nativelib`). |

Dependensi yang dipasang: `capstone`, `unicorn` (tak terpakai akhirnya),
`androguard` 4.1.4, `numpy`, `cryptography` 50.0.2 (TripleDES pindah ke
`cryptography.hazmat.decrepit.ciphers.algorithms`).

## 2. Kunci Tempest: ciphertext-nya cuma string statis

Dugaan fase 4 ("kunci hanya ada saat runtime") salah. Getter native tidak
menghitung apa pun — ia **mengembalikan string konstan** dari `.rodata`
(kadang sebagian byte-nya di-patch `mov/movk`). `CryptoTool.decryptString`
hanya butuh blob itu + `AxisnetHelpers.getSaltKey()`, dan keduanya string
statis di `.so` yang sama.

```
saltKey / getMsisdnSaltKey  = "ae432353a4eb4eb9"     (native getSaltKey)
secretKey                   = "2eb9362dd64b1e56"
newSaltKey                  = "saltkey"
```

`decryptString(blob, saltKey)` = DESede/ECB/**NoPadding**, kunci = saltKey
di-pad NUL ke 24 byte, Base64 URL-safe, hasil di-`trim()` Kotlin:

| Getter | Blob (mentah dari .so) | Plaintext |
|---|---|---|
| `Signature.apiKey()` | `ipRsTxOLbgogxEiXj1P73JVWgQk9CEXMSuIsaFO8t6I=` | `4x1sNetMod3rn1zATi0N2020Kd5` |
| `Signature.keyTempest()` | `hOc36lLcbQ8JLLGvhekVMVGy0w9hTM9EazVL1Z2aF9BiUG5Ov88rQg==` | `640cf31351a236bb0a5d0407ba7ae40fe7749f10` |
| `Signature.keyTempestMarket()` | `VEOXH8EAnFARSFDtbNnvxA==` | `ae432353a41b4eb9` |
| `Signature.keyTempestCapital()` (prod, kunci `u()`) | `d9kKoBWg…NrPkl` | `7L20wW59wJkXG1z2vR8Q6pmnssgRptOHdC3xO9CrtOFE2u6mF7Xk9Is11S44aPTPu5` |
| `Signature.keyTempestMarketCapital()` (prod, kunci `g()`) | `bA7mQfB7…P9wp` | `a0A38QY0HwkMGLwLq5zrmpC17cGBj01I2pZ91v42K26X57SThVsdfBuSut7RXkJ9eR` |

Semuanya **konstanta app-embedded**, bukan secret user: siapa pun yang
membongkar APK yang sama mendapat nilai sama. Karena itu `axisnet_api.py`
boleh memakainya sebagai default (`static_keys()`), env var tetap menimpa.
Round-trip `encryptString(plaintext, saltKey) == blob asli` dicek untuk
kelima blob (self-test).

Static lain yang ikut ketemu: `clientID`/`clientSecret`/`grantType` service
OTP (`26NLLzLEZaLwngG0wUVI` / `gU8ya9VoMTFa0LYF3xkjVYpXAAGRwz` /
`client_credentials`), salt MD5 `xl` + `axis` + hash `MD5`, dan ~40 URL
`*.api.axis.co.id`.

## 3. Padding & algoritma: `DESede / ECB / NoPadding`

`EnumCrypto.<clinit>` (fase 4, `enum-crypto.txt`) mengisi konstanta cipher
dengan string **obfuskasi** dari `AxisnetHelpers.getPosN()`. Aturan dekodenya
adalah dua langkah yang persis dilakukan app:

1. `Regex("[A-Zg-z]").replace(s, "")` (`O5/a$a.c()` + `O5/a$a.b()`) — buang
   semua huruf kapital dan huruf kecil `g`–`z`, sisakan digit + `a`–`f`;
2. `Consta$Companion.toString()` (`consta-companion.txt`) — reverse string,
   lalu tiap 2 karakter dibaca `Integer.parseInt(_, 16)` → `char`.

Hasil (lihat `fase5_decode_pos.py`):

```
getPos9  -> "DESede"      getPos10 -> "ECB"      getPos11 -> "NoPadding"
```

Konfirmasi silang: getter native `NativeLibImpl.getAlgorithmKey/getModeKey/
getPaddingKey` (`native_strings.json`) mengembalikan string obfuskasi yang
**sama**, dan `evidence/nativelibimpl.txt` menunjukkan `decryptResponse`
memakainya apa adanya:

```
NativeLibImpl.decryptResponse(Z Ljava/lang/String;)
  ... getSaltKey() ... getAlgorithmKey() ... getModeKey() ... getPaddingKey()
```

Bukti ketiga: plaintext blob §2 berujung byte NUL (`7L20wW…aPTPu5\x00`).
Kalau Java-nya `PKCS5Padding`, `doFinal` akan melempar `BadPaddingException`
— jadi padding memang `NoPadding` dan zero-pad dilakukan manual
(`doPadWithString`). Default `axisnet_api.py` sekarang `NoPadding`.

Catatan: `getPos1..8/12` + `registerTokenFcmEncrypt` mendekode ke blob
base64 yang tidak berhasil didecrypt dengan semua kandidat DESede yang ada
(dugaan AES / keperluan lain). Tidak dibutuhkan jalur koin Alifetime.
Blob `keyTempestGuardian` (`C6EwP6Rw4OeYajoNm7imW9LUWlQll0A=`) panjangnya 23
byte (bukan kelipatan 8) → ekstraksi getter itu masih meleset; tidak dipakai
di jalur Alifetime.

## 4. `decryptResponse`: ternyata bukan cipher

`CryptoTool$Companion.decryptResponse(value)` = `decryptString(value, getSaltKey())`
(fase 4, `crypto-tool-companion.txt`). Tapi jalur response-body pemakai
`NativeLib.decryptResponse(false, data)`, dan `evidence/nativelibimpl.txt`
menunjukkan flag menentukan cabangnya:

```
NativeLibImpl.decryptResponse(boolean flag, String value):
  flag != 0 -> T5/g.a(value, getSaltKey(), getAlgorithmKey(), getModeKey(), getPaddingKey())  # cipher DESede
  flag == 0 -> T5/g.b(value)                                                                  # tanpa cipher

T5/g.b(value):  value.getBytes(UTF_8) → Base64.decode(_, 0) → new String(_, UTF_8) → trim()  (trim manual, char ≤ 32)
T5/g.a(5 arg):  Cipher(algorithm/mode/padding) + SecretKeySpec(saltKey) → doFinal             (DESede)
```

Jadi field `data` pada envelope respons AXIS **hanya di-Base64**, tidak
terenkripsi. `axisnet_api.py::decrypt_response_data()` + `decode_envelope()`
mengimplementasikan ini dan dipakai otomatis oleh `_get`/`_post`.

### 4.1 Flag di tiap call-site (dipastikan mekanis)

`fase5_decrypt_flag.py` menjalankan propagasi konstanta (termasuk idiom Kotlin
`if-eqz v, +4h ; move vF, vSatu ; goto +2h ; move vF, vNol`) di **semua 57
call-site** `NativeLib->decryptResponse(Z, String)` di seluruh DEX
(`scratch-apk/`, `extract/axis/dex/`, `fase3/tmp*.dex`). Hasil lengkap:
`evidence/decrypt-flag.txt` — tidak ada satu pun yang tersisa tak pasti:

| flag | jumlah | di mana |
|---|---|---|
| `0` → `T5/g.b` (Base64+UTF-8+trim) | **43** | seluruh `HomeUseCaseImpl.a..j` (benefit/Seru, koin, bonus Alifetime), `BalanceConvertUseCase`, `SimReplaceUseCaseImpl.checkNumberSimReplace`, V-key, dll. |
| `1` → `T5/g.a` (DESede/saltKey) | **14** | `features/byop/*` (7), `ReactivationUseCase.{provisioning,validateIccid,validateImei,validateNik}`, `IouUseCase.postIouTransaction`, `TopUpSureprizeUseCase.getReloadBonus`, `TopUpBalanceUseCase.getBalancePackages` |

Jadi dua-duanya nyata — tapi **jalur Alifetime/koin memakai flag 0**, sedangkan
cipher cuma dipakai fitur BYOP / reaktivasi / IOU / top-up. Implementasi
`decrypt_response_data()` (Base64 dulu, fallback DESede/saltKey) menutup kedua
jalur tanpa perlu tahu flag-nya.

Konsisten dengan observasi nyata: error tanpa token dibalas JSON **polos**
(`data: null`), tidak ada ciphertext di jalur error.

## 5. Body & signature OTP (jalur login)

`evidence/otppayload.txt` → `OtpPayload { msisdn, deviceType }`.
`evidence/homevm.txt` `sendDataOtp`:

```
encryptSSO(msisdn) → buang "\n" (kotlin.text.u.J) → OtpPayload(encrypted, Consta.CHANNEL_ANDROID="android")
Signature.w(path="/v1/otp", msisdn, deviceType, null×5)  → x-signature
```

`evidence/splashvm.txt` `getOtpLoginPayload/getOtpLoginSignature` (fase 4,
`sc-c.txt`): body `sc/c` = 9 field urut
`msisdn, brand, model, otp_code, device_type, device_os, fcm_token, fb_id, imei`;
`msisdn` dan `otp_code` di-`encryptSSO`; `fb_id = encrypMsisdnMD5` =
`MD5("xl" + MD5(msisdnIDFormat(nomor)) + "axis")` hex, dengan
`msisdnIDFormat` menormalkan `0812… → 62812…`. Signature `v()`:

```
POST;/otplogin/v2;<encMsisdn>;<encOtp>;<fcm>;<fb_id>;<model>;<brand>;<device_os>;<device_type>;<apiKey BLOB>
```

`api-annotations2.json` (`getOtp__params` / `getOtpLogin__params`): header
persis `Content-Type`, `Connection: keep-alive`, `X-API-KEY`,
`x-app-version`, `x-signature` — **tanpa** `x-handshake` dan **tanpa**
`Authorization`. Field apiKey ke-9 memakai **blob mentah** `apiKey()` (sama
dengan header `X-API-KEY`), bukan hasil decrypt. Kunci HMAC = keluarga
`u()`/`x()` → `keyTempestCapital` (prod).

URL final (dari `.so`): `POST https://otp.api.axis.co.id/v1/otp` dan
`POST https://otp.api.axis.co.id/otplogin/v2` (tanpa `/v1` — `AXIS_API`
lama salah, sudah dikoreksi; self-test kini mengunci path ini terhadap
konstanta path di smali).

Response model `fb/s { status, status_code, error_message, data: String, premium, tracking }`
(`evidence/fbs.txt`) → `token_from_response()` membaca `data` (string token
atau JSON `{token|access_token|…}`) lalu mengisi `self.auth_token`.

### 5.1 Signature OTP **terkonfirmasi live** (nomor mustahil, tanpa SMS)

Probe `fase5_probe_otp.py`: 56 kombinasi (kunci HMAC × posisi field × nilai
field apiKey#9) dikirim ke `POST https://otp.api.axis.co.id/v1/otp` dengan
`msisdn = 00000000000000` (bukan nomor AXIS aktif; dan karena server menolak
sebelum tahap pengiriman, tidak ada SMS yang keluar).

```
POST;/v1/otp;<encMsisdn>;;;;;;;;<apiKey BLOB>          key = d(keyTempestCapital)
X-API-KEY: <blob apiKey>   x-app-version: 11.1.0   User-Agent: okhttp/4.9.3
  -> 400 {"status_code":400,"error_message":"Nomor Axis yang kamu masukkan salah"}
```

400 (bukan 401 `Invalid signature`) = **signature diterima** server. Jadi:

- kunci HMAC keluarga `j/v` prod = `d(keyTempestCapital())` (bukan staging, bukan varian *Market*);
- field#9 pesan signature = **blob mentah** `apiKey()` (sama dengan header `X-API-KEY`);
- yang ikut signature **hanya field#1 = `encMsisdn`**; field#2..#8 kosong.
  `deviceType` dikirim di body saja — begitu disisipkan ke field#2 atau #8
  server langsung membalas `Invalid signature` (semua 56 varian lain ditolak);
- `encryptSSO` nomor (DESede/ECB/NoPadding + saltKey, Base64 URL-safe) benar:
  server berhasil membacanya sampai tahap validasi nomor.

Implikasi `axisnet_api.py`: `AxisnetClient.otp_sign_fields(enc)` =
`[enc] + [""]*7` dan `request_otp()` memakainya. Nomor uji
`00000000000000` juga membuktikan alur request/response OTP sudah utuh —
satu-satunya yang tersisa adalah nomor AXIS asli + OTP user (§5.1).

Catatan tambahan: jalur OTP (keluarga `j/v`, tanpa `x-handshake`) lolos
signature dengan token/authorization kosong, sedangkan endpoint Alifetime
(keluarga `h/m`) membalas `401 session invalid` — artinya gateway Alifetime
memeriksa **session** lebih dulu, sehingga penerimaan signature di jalur itu
baru bisa dibuktikan setelah login (§6).

## 6. Observasi server nyata (tanpa token)

```
GET https://points.api.axis.co.id/v1/alifetime   (header Tempest lengkap, token palsu)
  User-Agent: <default Python>            -> 403 "error code: 1010"   (Cloudflare bot filter)
  User-Agent: okhttp/4.9.3 | Dalvik/...   -> 401 {"status":false,"status_code":401,
                                                  "error_message":"session invalid","data":null}
```

Field `tracking_firebase` kadang berisi `401-01-04-000-200`, kadang kosong,
**tidak bergantung** pada benar/salahnya signature (dites dengan signature
benar, signature `0000…`, handshake rusak, dan tanpa signature; ulangan
juga tidak stabil). Jadi field itu bukan oracle validasi signature.
Dengan token palsu, gateway memeriksa **session** lebih dulu, sehingga
penerimaan signature tidak bisa diverifikasi tanpa login.

Konsekuensi implementasi: `AxisnetClient.user_agent` (default `okhttp/4.9.3`,
env `AXIS_USER_AGENT`) selalu dikirim; error non-2xx tetap didekode sebagai
envelope (`_http_error`) supaya bedakan "session invalid" vs "signature ditolak".

## 7. Verifikasi LIVE sesudah login user (2026-11-21)

Nomor user di-OTP beneran (`otp` → `login`), semua langkah di bawah adalah
respons server asli. Artefak: `fase5_probe_token.py`, `fase5_bonus_list.py`,
`fase5_find_bonus.py`, `fase5_probe_bonus_query.py`.

| Langkah | Respons |
|---|---|
| `POST /v1/otp` (`0831…6619`) | `200` `data.can_login = true` → SMS OTP beneran terkirim |
| `POST /otplogin/v2` (+kode OTP) | `200` `data.token = <uuid>`, `data.message = "generate new token"` |
| `GET points/v1/alifetime` | `200` → `total_point=49`, `next_level=temenan (105)`, `needs=56`, `percent=46`, `status expired 28 Dec 2025` |
| `GET profile/v1/alifetime` | `200` → `current_level = "kenalan"`, `level_since_date = 2025-09-28` |
| `GET points/v1/alifetime/history?level=kenalan&page=1&size=5` | `200` → 19+ riwayat `earned` (tanpa productId) |
| `GET profile/v2/alifetime/bonus?level=kenalan` | `200` → 19 grup bonus (level lain: 23/27/27/27 item) |
| `GET profile/v2/alifetime/bonus/kenalan*bonus_quota` | `200` → 3 produk 0 koin: Genflix / Sushiroll / **Spotify** |
| `POST order/v1/transaction/redeem/alifetime` (Spotify) | `404` `404-01-06-100-200` "Maaf kamu tidak bisa mengambil bonus ini. Coba lagi besok ya." |

Temuan penting dari tahap ini:

1. **Token dipakai MENTAH, tanpa awalan `Bearer `** — bukti, bukan asumsi:
   `fase5_probe_token.py` mengirim Authorization dalam 2 bentuk ke 6 endpoint.
   Dengan `Bearer <uuid>`: semua `401 "session invalid"`. Dengan `<uuid>` polos:
   `200 OK`. Karena field token pesan signature = isi header `Authorization`
   (fase 4 §1.2), konsekuensinya `login_otp()` sekarang menyimpan token polos.
   Ini sekaligus **membuktikan signature keluarga `h` (kunci
   `keyTempestMarketCapital`) + `x-handshake` diterima server** (gap fase 4 §2
   dan laporan §6 tertutup).
2. **`level` wajib** di `/v2/alifetime/bonus` — tanpa query itu server balas
   `500 "Terjadi kesalahan pada server"` (bukan error signature); `from` boleh
   tidak ada. Query yang terbaca dari anotasi Retrofit:
   `getAlifetimeBonus` = `Authorization`, `x-app-version`, `@Url`, `?level`, `?from`;
   `getPointProfile` = `?level`. (Sebelumnya `list_bonus()` tanpa query → 500.)
3. **`service_id`/`price_plan_code` produk = blob DESede** yang sama persis
   caraan enkripsinya dengan `encryptString` fase 5 (`saltKey`):
   `Dd3FS0Ocl62DNVkreoumPw== → 3210491_KN` (Spotify),
   `LA6PVvmRRYmDNVkreoumPw== → 3215687_KN` (Genflix),
   `YK7YrZqcTXODNVkreoumPw== → 3215688_KN` (Sushiroll). Decrypt data server pake
   kunci fase 5 = validasi silang gratis.
4. **Field body redeem** dipastikan dari smali
   `AlifetimeDetailActivity.claimProduct`: `d6/a(productId = product.getServiceId(),
   productType = product.getType(), merchantCode = product.getMerchantCode())` —
   jadi `productId` = blob `service_id` (bukan id grup), `productType` = tipe
   grup (`bonus_quota`), `merchantCode` = string kosong untuk bonus kuota app.
   `Signature.e(token, json, i()) = h("POST", "/v1/transaction/redeem/alifetime", json, token, handShake)`,
   kunci `g()` — sama seperti implementasi.
5. **Redeem Spotify 0 koin ditolak server** dengan `404` + pesan "tidak bisa
   mengambil bonus ini" (signature diterima, lihat §7.2 soal token), selaras
   dengan `status: GRACE` pada akun itu (`expired: 28 Dec 2025`) padahal
   `is_active: true` dan koin 49. Artinya penolakan di sisi bisnis/eligibilitas,
   bukan kriptografi. Tidak ada transaksi yang tercipta (koin tetap 49).

### 7.1 Detail teknis yang terkonfirmasi

- **Path signature harus mentah**: `bonusId` dikirim apa adanya (`kenalan*bonus_quota`);
  begitu di-quote (`%2A`/`%2B`) server balas `401 "Invalid signature"` — karena
  signature dihitung atas `URI.getPath()` asli. Ini bukti tambahan bahwa
  signature path benar-benar divalidasi server.
- Payload `data` respons Alifetime = **base64 tanpa padding** dari JSON UTF-8
  (contoh prefix `eyJpc19hY3RpdmUiOnRydWUs...` → `{"is_active":true,...}`),
  persis `T5/g.b` / flag `false` di §4.1. `decode_envelope()` menanganinya otomatis.

### 7.2 Cache token

`login` menyimpan token ke `axis-token.txt` (mode `0600`, bisa dialihkan dengan
`AXIS_TOKEN_FILE`) supaya `coin`/`bonus`/`level`/`redeem` bisa jalan tanpa env
var. File itu secret user — **tidak** ikut arsip `axis-koin-hasil.tar.gz`.

## 8. Yang belum/berhenti di sini

1. ~~Token login~~ **SUDAH** — user login live (§7). CLI:
   `python3 axisnet_api.py otp 08xxxxxxxxxx` → `login 08xxxxxxxxxx <kode>`
   → token di-cache → `coin` / `bonus` / `level` / `redeem`.
   ⚠️ `otp` mengirim SMS nyata; `redeem` mengubah state di server.
2. ~~Verifikasi end-to-end signature~~ **SUDAH** — dengan token asli semua
   endpoint (`points`, `profile`, `order`) membalas `200`, jadi signature
   keluarga `h`/`j` + `x-handshake` diterima server (§7).
3. **Eligibilitas redeem di sisi bisnis**: request redeem Spotify 0 koin valid
   (signature diterima) tapi server balas `404 "Maaf kamu tidak bisa mengambil
   bonus ini. Coba lagi besok ya."` selama akun berstatus `GRACE`
   (`expired 28 Dec 2025`). Belum dicoba lagi setelah masa aktif diisi ulang —
   itu satu-satunya sisa yang bisa mengubah hasil, bukan kriptonya.
4. `GET /v2/alifetime/bonus/voucher` **server-side timeout** (bukan salah
   client: endpoint lain di host yang sama balas `200` dalam hitungan detik);
   `GET /v1/alifetime/membership` `404 Cannot GET` (path di `.so` tidak
   ter-route di gateway).
5. `getPos1..8/12`, `registerTokenFcmEncrypt`, `keyTempestGuardian` (§3).
6. `fase5_xref.py` tidak berguna: `get_bc().get_raw()` tidak memuat nama
   method, jadi pencarian string `decryptResponse`/`encryptSSO` selalu 0.
   Ganti dengan `ins.get_name() + ins.get_output()` (sudah dipakai di
   `fase5_dump_class.py`, `fase5_decrypt_flag.py`, `fase5_xref_claim.py`).
7. Envelope request `La8/c;` untuk OTP (fase 4) ternyata tidak dipakai di
   jalur ini — yang benar `OtpPayload`/`sc/c` (§5).

## 9. Status `axisnet_api.py`

Self-test (`python3 axisnet_api.py --self-test`) lolos, sekarang mencakup:

- Modula nonce/header (fase 2);
- `tempest_message_h/m/j` + HMAC (fase 4);
- `APP_CIPHER == DESede/ECB/NoPadding` dari `pos_obfuscated_decode` (§3);
- `static_keys()` == 5 vektor literal §2 + round-trip encrypt (§2);
- `decrypt_response_data`/`decode_envelope` round-trip (§4);
- `msisdn_id_format`, `encryp_msisdn_md5`, `encryptSSO` round-trip (§5);
- header OTP = keluarga `j/v` + **blob** apiKey, tanpa handshake/Authorization (§5);
- path `AXIS_API` harus sama dengan konstanta path di smali (§5);
- `AxisnetClient(use_static_defaults=False)` tetap menolak request (§8).

Perintah CLI baru: `keys`, `handshake`, `otp <nomor>`, `login <nomor> <otp>`,
`coin`, `bonus`, `level`, `redeem <productId> [tipe] [merchant]`.
