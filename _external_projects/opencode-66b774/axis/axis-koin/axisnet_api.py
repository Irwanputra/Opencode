#!/usr/bin/env python3
"""
AXISnet 11.1.0 — prototipe API (fase 5, hasil reverse-engineering statis 2026-11-20)
====================================================================================
Status jujur: SEMUA kriptonya sudah terpecahkan STATIS (fase 4 + fase 5). Yang
tersisa hanya token login (OTP dari nomor user sendiri). Kunci Tempest tidak lagi
perlu Frida/emulator: blob ciphertext-nya ada di `libnative-lib.so` dan saltKey-nya
juga string statis di .so yang sama, jadi kunci bisa dihitung di sini.
Laporan fase 5: reverse-latest/LAPORAN-FASE5.md

YANG SUDAH TERVERIFIKASI (dari RN bundle assets/index.android.bundle, @modula/react-native 1.0.58):
  - Signing Modula "OneBackend": HMAC-SHA256, nonce = HMAC-SHA256(key=brandSecret,
    msg=brandCode.lower() + brandSecret + deviceId + timestamp_detik) dalam hex,
    header: Content-Type, User-Agent, X-Brand-Code, X-Source-Env, X-Device-Id,
    X-Msisdn (opsional), X-Sdk-Version, X-Platform, X-App-Version, X-Timestamp (detik),
    X-Nonce, Authorization: Bearer <authToken>.
    Fungsi ini DIIMPLEMENTASIKAN di bawah (modula_nonce / modula_headers) + self-test.
  - Modula init: POST {gateway}/api/data/sdk/init body {brandCode, env} -> response berisi
    wrapKey, signature, uiUrl, dataUrl; wrapKey di-RSA-decrypt (node-forge) -> aesKey
    untuk decrypt envelope response (AES, fallback base64 JSON, gunzip didukung).
  - Gateway: https://gateway.modula.xlsmart.co.id (prod), sit/uat/pre-prod sejenis.
    clientCode (== brandCode) = 'JGH5T9ZQ2' (ada di bundle, bukan secret).

YANG SUDAH TERVERIFIKASI (dari DEX hasil dekripsi fase 3, tmp14169616706995394833.dex
+ tmp3065699920606524921.dex — bukti smali lengkap di reverse-latest/LAPORAN-FASE4.md):
  - Rumus Tempest (com.axis.net.config.Signature):
      x-signature = hex-lower(HMAC-SHA256(key, message))   [method f + c: "%02x"]
      Keluarga h (dipakai interceptor + redeem/claim-bonus/flashwar):
        message = method + ";" + path + ";" + json + ";" + token + ";" + handShake
        key     = g() = staging ? decrypt(keyTempestMarket) : decrypt(keyTempestMarketCapital)
      Keluarga m (tanpa token; dipakai checkNumberPrefix -> POST /prefix):
        message = method + ";" + path + ";" + json + ";" + handShake
        key     = u() = staging ? decrypt(keyTempest) : decrypt(keyTempestCapital)
      Keluarga j/v (OTP/login; 8 field + apiKey di akhir, method selalu POST):
        message = "POST;" + path + ";" + f1..f8 (null -> "") + ";" + apiKey()
        key     = u()  (sama seperti keluarga m)
        Contoh nyata: v("/otplogin/v2", msisdn, otp_code, fcm_token, fb_id, model,
        brand, device_os, device_type); w("/v1/otp", encMsisdn, deviceType, null x6).
      token   = nilai persis header Authorization. VERIFIKASI LIVE (fase 5,
                `reverse-latest/fase5/fase5_probe_token.py`): AXISnet mengisi
                header itu dengan token MENTAH dari `otplogin/v2` (UUID, TANPA
                awalan "Bearer "). Dengan "Bearer <uuid>" semua host membalas
                `401 session invalid`; dengan UUID polos → `200 OK`. Interceptor
                mengambilnya via request.header("Authorization"), jadi field
                token di pesan signature = UUID polos yang sama.
      json    = string mentah body request ("" bila tidak ada body, mis. GET).
      path    = URI.getPath() saja (tanpa query string).
      handShake = i() = encryptSSO(str(milis-detik-sekarang)) tanpa "\n";
                encryptSSO = CryptoTool.encryptString(timestamp, sharedKey) dengan
                sharedKey = AxisnetHelpers.getMsisdnSaltKey() (native).
      decrypt(x) = CryptoTool.decryptString(x, AxisnetHelpers.getSaltKey()):
                kunci = saltKey di-pad '\0' sampai 24 byte, cipher = KeyClass
                algorithm/mode/padding. DULU literalnya tersembunyi di balik
                string obfuskasi O5/a + Consta; FASE 5 membacanya:
                DESede/ECB/NoPadding (lihat APP_CIPHER + pos_obfuscated_decode).
      x() = true bila env saat ini == STAGING (ServerEnv.STAGING.key equalsIgnoreCase
            M5/b.c()); jadi prod memakai varian *Capital, staging memakai varian biasa.
  - Interceptor (com.axis.net.helper.HMACSignatureInterceptor, selalu terpasang di
    Client.generateClient): hanya untuk method Retrofit beranotasi @HMACHeader —
    claimBonus, getAlifetimeBonus(+Detail/+Profiling), getAlifetimeMembership,
    getAlifetimeVoucher, getPointProfile, levelUpAlifetime. Ia menghitung
    Signature.h(method.upper(ROOT), path, rawBody, Authorization, Signature.i())
    lalu menambah header x-signature + x-handshake.
  - Redeem Alifetime TIDAK lewat interceptor: usecase memanggil Signature.e(token,
    jsonBody, handshake) = h("POST", "/v1/transaction/redeem/alifetime", ...) lalu
    mengirim x-signature + x-handshake sebagai @Header eksplisit ke
    AxisnetApiServices.alifetimeClaimBonus. Body-nya AlifetimeClaimBonusRequest
    (Ld6/a): {productId, productType, merchantCode} — tanpa @SerializedName, jadi
    nama field JSON = nama field persis.
  - RewardClaimParam (descPackage, userId, product:BonusProductModel, position, type,
    merchantCode) adalah parameter NAVIGASI layar claim, BUKAN body HTTP redeem.
  - RequestInterceptor (hanya bila M5/b.g()/e() — env non-prod): menambah header
    x-app-request-id = UUID acak + menulis ulang host (UAT/staging/new/prod).
  - OTP: https://otp.api.axis.co.id/v1/otp (+ /otplogin/v2, /logout, /fcm);
    OAuth client_credentials (clientID/clientSecret ada di .so sebagai plaintext,
    grantType='client_credentials', saltKey/randomKey='ae432353a4eb4eb9').
  - Cek koin/level: https://points.api.axis.co.id/v1/alifetime,
    https://points.api.axis.co.id/v2/alifetime/point,
    https://profile.api.axis.co.id/v1/alifetime
  - Katalog bonus: https://profile.api.axis.co.id/v2/alifetime/bonus,
    https://profile.api.axis.co.id/v1/alifetime/bonus/voucher
  - Tukar koin: POST https://order.api.axis.co.id/v1/transaction/redeem/alifetime
  - Flash War: https://flashwar.api.axis.co.id/v1/info
  - Response homepage: AlifetimeResponse.getCoin() / getLevel() (keduanya String).

YANG DITAMBAHKAN FASE 5 (bukti: reverse-latest/LAPORAN-FASE5.md):
  - Nilai LITERAL ALGORITHM/MODE/PADDING akhirnya terbaca statis: string obfuskasi
    getPosN() di-dekode dengan aturan yang persis dilakukan EnumCrypto.<clinit> —
    Regex("[A-Zg-z]").replace(s, EMPTY="") lalu Consta.toString() (reverse string,
    per 2 karakter -> Integer.parseInt(radix 16) -> char). Hasil:
      getPos9  -> "DESede"     getPos10 -> "ECB"     getPos11 -> "NoPadding"
    Dikonfirmasi silang oleh getter native NativeLibImpl.getAlgorithmKey/getModeKey/
    getPaddingKey yang mengembalikan string obfuskasi yang sama.
    => Cipher CryptoTool = DESede/ECB/NoPadding (bukan PKCS5Padding), dibuktikan
       juga oleh plaintext blob yang berujung byte NUL (zero-pad) — kalau Java-nya
       PKCS5Padding, decrypt akan melempar BadPaddingException.
  - saltKey / getMsisdnSaltKey (sharedKey handshake & encryptSSO) = 'ae432353a4eb4eb9'
    (string statis di .so; sama dengan randomKey/saltKey OTP lama).
  - Blob kunci (native getter) + hasil decrypt-nya (semuanya app-embedded, bukan
    secret user): lihat APP_BLOBS / static_keys() di bawah.
  - Response API: `NativeLib.decryptResponse(false, data)` = Base64.decode + UTF-8 +
    trim (T5/g.b) — TIDAK pakai cipher. Flag true baru memakai DESede (T5/g.a).
  - Body + header OTP nyata: POST /v1/otp {msisdn: encryptSSO(nomor), deviceType:
    "android"}; POST /otplogin/v2 body sc/c {msisdn, brand, model, otp_code,
    device_type, device_os, fcm_token, fb_id, imei} dengan msisdn & otp_code
    di-encryptSSO, fb_id = MD5("xl" + MD5(msisdn format 62..) + "axis").
    Header kedua endpoint: Content-Type, Connection: keep-alive, X-API-KEY (blob
    mentah dari .so), x-app-version, x-signature (keluarga j/v, apiKey = BLOB
    mentah, bukan hasil decrypt).

  - Header OTP nyata: lihat blok di bawah. Catatan operasional: API berada di
    belakang Cloudflare — request tanpa User-Agent khas HTTP client (mis. default
    Python) ditolak `403 error code: 1010`. Karena itu semua request mengirim
    `User-Agent` (default `okhttp/4.9.3`, env `AXIS_USER_AGENT`). Tanpa token,
    server membalas JSON POLOS: {"status":false,"status_code":401,"error_message":
    "session invalid","data":null}; field `tracking_firebase` TIDAK berubah walau
    signature salah/absen, jadi ia bukan oracle validasi signature.

YANG MASIH KURANG:
  - Token login (Authorization): butuh OTP nomor user sendiri (user harus hadir).
    `otp` + `login` di CLI sudah siap; tinggal nomor + kode OTP. Signature
    `POST /v1/otp` sudah **diterima server** (dites live pakai nomor mustahil
    00000000000000 → `400 "Nomor Axis yang kamu masukkan salah"`, bukan
    `Invalid signature`; lihat reverse-latest/LAPORAN-FASE5.md §5.1).
  - Verifikasi penerimaan server untuk jalur Alifetime/redeem (keluarga h/m):
    gateway memeriksa session lebih dulu sehingga token palsu selalu `401
    "session invalid"`. self-test hanya membuktikan konsistensi dengan
    smali/bukti statis (butuh token asli).
  - Nilai runtime lain yang tidak dibutuhkan jalur koin: string obfuskasi AES
    (getPos1..8/12), beberapa URL native non-Alifetime, body claimBonus (LA8/a).

Pakai:
  python3 axisnet_api.py --self-test        # tanpa network: rumus + kunci statis + vkey decode
  python3 axisnet_api.py keys               # daftar kunci app-embedded (hasil decrypt)
  python3 axisnet_api.py handshake          # contoh x-handshake + x-signature
  python3 axisnet_api.py otp 0812xxxxxxxx   # kirim OTP ke nomor sendiri (SMS nyata!)
  python3 axisnet_api.py login 0812xxxx 123456   # tukar OTP -> token (di-cache ke axis-token.txt)
  python3 axisnet_api.py token              # token yang sekarang dipakai + sumbernya
  python3 axisnet_api.py coin               # cek koin/level
  python3 axisnet_api.py bonus [level]      # daftar bonus Alifetime (level otomatis)
  python3 axisnet_api.py products <bonusId> # produk dalam satu grup bonus (+decrypt service_id)
  python3 axisnet_api.py level              # profil level Alifetime
  python3 axisnet_api.py redeem <productId> [productType] [merchantCode]
                                              # HATI-HATI: ini klaim beneran, jangan
                                              # dijalankan tanpa diminta user.
                                              # productId = BLOB service_id, mis.
                                              # redeem 'Dd3FS0Ocl62DNVkreoumPw==' bonus_quota

Dependensi: hanya standard library (hmac, hashlib, json, urllib) untuk signing
HMAC. tempest_handshake()/tempest_decrypt_string() butuh DESede: memakai paket
`cryptography` bila ada, fallback `Crypto` (pycryptodome), bila keduanya tidak ada
melempar TempestHandshakeUnavailable yang menjelaskan.
"""

import base64
import hashlib
import hmac
import json
import os
import sys
import tempfile
import time
import urllib.error
import urllib.parse
import urllib.request

# ---------------------------------------------------------------------------
# 1. Modula OneBackend signing — TERVERIFIKASI dari bundle (verbatim JS):
#    l(e,t){var n=e.brandCode.toLowerCase()+e.brandSecret+e.deviceId+t,
#            i=r.default.hmac.create();
#            return i.start("sha256",e.brandSecret),i.update(n),i.digest().toHex()}
# ---------------------------------------------------------------------------

MODULA_PROD_GATEWAY = "https://gateway.modula.xlsmart.co.id"
MODULA_CLIENT_CODE = "JGH5T9ZQ2"  # == brandCode; ada di bundle, bukan secret


def modula_nonce(brand_code: str, brand_secret: str, device_id: str, timestamp_s: str) -> str:
    """X-Nonce = HMAC-SHA256(key=brandSecret, msg=brandCode.lower()+brandSecret+deviceId+timestamp) hex."""
    msg = brand_code.lower() + brand_secret + device_id + timestamp_s
    return hmac.new(brand_secret.encode(), msg.encode(), hashlib.sha256).hexdigest()


def modula_headers(*, brand_code: str, brand_secret: str, device_id: str, env: str,
                   auth_token: str, user_agent: str, app_version: str,
                   msisdn: str = "", sdk_version: str = "", platform: str = "React-Native",
                   timestamp_s: str = "") -> dict:
    """Header OneBackend, sesuai fungsi d(e) di bundle. timestamp detik (string)."""
    ts = timestamp_s or str(int(time.time()))
    headers = {
        "Content-Type": "application/json",
        "User-Agent": user_agent,
        "X-Brand-Code": brand_code,
        "X-Source-Env": env,
        "X-Device-Id": device_id,
    }
    if msisdn:
        headers["X-Msisdn"] = msisdn
    headers.update({
        "X-Sdk-Version": sdk_version,
        "X-Platform": platform,
        "X-App-Version": app_version,
        "X-Timestamp": ts,
        "X-Nonce": modula_nonce(brand_code, brand_secret, device_id, ts),
        "Authorization": f"Bearer {auth_token}",
    })
    return headers


# ---------------------------------------------------------------------------
# 2. Tempest signing — TERPECAHKAN dari DEX fase 3 (lihat docstring modul).
#    Kunci TIDAK ada di file ini: semuanya dari env (nilai hasil decrypt runtime).
# ---------------------------------------------------------------------------

class TempestNotImplemented(NotImplementedError):
    """Kunci/material Tempest belum tersedia (env kosong).

    Rumusnya sudah diimplementasikan di bawah; exception ini hanya berarti
    nilai kunci hasil decrypt / token / sharedKey belum diisi lewat env,
    sehingga request tidak boleh dikirim (server pasti menolak).
    """


class TempestHandshakeUnavailable(RuntimeError):
    """DESede tidak tersedia: install `cryptography` atau `pycryptodome`.

    Handshake (Signature.i) butuh cipher DESede; HMAC signing (x-signature)
    tidak butuh paket ini dan tetap bisa dipakai dengan handshake eksplisit.
    """


def tempest_hmac_hex(message: str, key: str) -> str:
    """Signature.f + c: hex-lower(HMAC-SHA256(key UTF-8, message UTF-8)).

    f(msg, key): Mac HmacSHA256, SecretKeySpec(key bytes), doFinal(msg bytes),
    lalu c() memformat tiap byte "%02x" (hex kecil, 64 karakter).
    """
    return hmac.new(key.encode("utf-8"), message.encode("utf-8"),
                    hashlib.sha256).hexdigest()


def tempest_message_h(method: str, path: str, json_body: str, token: str,
                      handshake: str) -> str:
    """Signature.h: method;path;json;token;handShake (5 field, pemisah ';')."""
    return ";".join([method, path, json_body, token, handshake])


def tempest_message_m(method: str, path: str, json_body: str, handshake: str) -> str:
    """Signature.m: method;path;json;handShake (4 field, tanpa token)."""
    return ";".join([method, path, json_body, handshake])


def tempest_message_j(path: str, fields, api_key: str) -> str:
    """Signature.j/v: "POST;" + path + ";" + 8 field (null -> "") + ";" + apiKey().

    `fields` harus berisi tepat 8 string/None, sesuai urutan pemanggil
    (mis. OTP login: msisdn, otp_code, fcm_token, fb_id, model, brand,
    device_os, device_type). j/v selalu memakai method POST.
    """
    fields = list(fields)
    if len(fields) != 8:
        raise ValueError(f"tempest_message_j butuh tepat 8 field, dapat {len(fields)}")
    parts = ["POST", path] + [("" if f is None else f) for f in fields] + [api_key]
    return ";".join(parts)


def tempest_sign_h(method: str, path: str, json_body: str, token: str,
                   handshake: str, key: str) -> str:
    """x-signature keluarga h (interceptor, redeem, claim-bonus, flashwar)."""
    return tempest_hmac_hex(tempest_message_h(method, path, json_body, token, handshake), key)


def tempest_sign_m(method: str, path: str, json_body: str, handshake: str, key: str) -> str:
    """x-signature keluarga m (tanpa token; mis. POST /prefix)."""
    return tempest_hmac_hex(tempest_message_m(method, path, json_body, handshake), key)


def tempest_sign_j(path: str, fields, api_key: str, key: str) -> str:
    """x-signature keluarga j/v (OTP/login)."""
    return tempest_hmac_hex(tempest_message_j(path, fields, api_key), key)


def tempest_sign_redeem(token: str, body_json: str, handshake: str, key: str) -> str:
    """Signature.e: h("POST", "/v1/transaction/redeem/alifetime", json, token, handShake)."""
    return tempest_sign_h("POST", "/v1/transaction/redeem/alifetime",
                          body_json, token, handshake, key)


# --- CryptoTool.encryptString / decryptString (DESede) -----------------------
# Bukti (CryptoTool$Companion, tmp3065699920606524921.dex):
#   encryptString(plaintext, key): plaintext di-pad '\0' ke kelipatan 8,
#     key di-pad '\0' ke 24 byte, Cipher.getInstance(algorithm/mode/padding),
#     init ENCRYPT (tanpa IV -> mode ECB), doFinal, lalu Base64 standar
#     dijadikan URL-safe ('+'->'-', '/'->'_'). decryptString kebalikannya
#     (URL-safe -> standar, Base64 decode, decrypt, trim Kotlin).
#   doPadWithString: pad = (n - len%n) % n, TIDAK nambah bila sudah kelipatan.
#   Kunci 24 byte + blok 8 byte => DESede (3DES) adalah satu-satunya kandidat
#   JCA standar; mode ECB dipastikan oleh tidak adanya IV.
#   Padding TERKONFIRMASI FASE 5: literalnya terbaca statis dari string obfuskasi
#   getPos9/10/11 (lihat pos_obfuscated_decode) = "DESede" / "ECB" / "NoPadding",
#   dan plaintext blob native memang berujung byte NUL (zero-pad manual) — tidak
#   mungkin hasil PKCS5Padding. Default di file ini karena itu "NoPadding";
#   AXIS_TEMPEST_PADDING=PKCS5Padding tetap tersedia bila perlu membanding.

DEFAULT_PADDING = "NoPadding"


def pos_obfuscated_decode(value: str) -> str:
    """Dekode string obfuskasi ala EnumCrypto: Regex("[A-Zg-z]") dihapus lalu Consta.toString.

    Consta$Companion.toString(s): reverse(s), lalu tiap 2 karakter dibaca
    Integer.parseInt(radix 16) -> char. Dipakai app untuk menyembunyikan literal
    ALGORITHM/MODE/PADDING (getPos9/10/11) dan beberapa blob lain.
    """
    import re

    stripped = re.sub(r"[A-Zg-z]", "", value)
    rev = stripped[::-1]
    return "".join(chr(int(rev[i:i + 2], 16)) for i in range(0, len(rev) - 1, 2))


def _pad_zero(text: str, block: int) -> bytes:
    raw = text.encode("utf-8")
    pad = (block - len(raw) % block) % block
    return raw + b"\x00" * pad


def _kotlin_trim(text: str) -> str:
    """Kotlin String.trim(): buang karakter <= ' ' (0x20) di kedua ujung."""
    i, j = 0, len(text)
    while i < j and ord(text[i]) <= 0x20:
        i += 1
    while j > i and ord(text[j - 1]) <= 0x20:
        j -= 1
    return text[i:j]


def _desede_cipher(key24: bytes, encrypt: bool, padding: str):
    """Buat cipher DESede/ECB via `cryptography` (diutamakan) atau pycryptodome."""
    try:
        from cryptography.hazmat.primitives.ciphers import Cipher as _Cipher
        try:
            from cryptography.hazmat.decrepit.ciphers.algorithms import TripleDES
        except ImportError:  # cryptography < 43
            from cryptography.hazmat.primitives.ciphers.algorithms import TripleDES
        from cryptography.hazmat.primitives.ciphers.modes import ECB
        from cryptography.hazmat.primitives.padding import PKCS7
        if padding == "PKCS5Padding":
            padder = PKCS7(64).padder() if encrypt else PKCS7(64).unpadder()
        elif padding == "NoPadding":
            padder = None
        else:
            raise ValueError(f"padding tidak dikenal: {padding!r}")
        cipher = _Cipher(TripleDES(key24), ECB())
        ctx = cipher.encryptor() if encrypt else cipher.decryptor()
        return ("cryptography", ctx, padder)
    except ImportError:
        pass
    try:
        from Crypto.Cipher import DES3
        if padding not in ("PKCS5Padding", "NoPadding"):
            raise ValueError(f"padding tidak dikenal: {padding!r}")
        cipher = DES3.new(key24, DES3.MODE_ECB)
        return ("pycryptodome", cipher, padding)
    except ImportError:
        pass
    raise TempestHandshakeUnavailable(
        "DESede butuh paket `cryptography` atau `pycryptodome` "
        "(pip install cryptography). HMAC signing tetap bisa dipakai dengan "
        "handshake eksplisit.")


def _desede_process(backend, data: bytes, encrypt: bool) -> bytes:
    kind, ctx, extra = backend
    if kind == "cryptography":
        padder = extra
        if encrypt:
            if padder is not None:
                data = padder.update(data) + padder.finalize()
            return ctx.update(data) + ctx.finalize()
        out = ctx.update(data) + ctx.finalize()
        if padder is not None:
            out = padder.update(out) + padder.finalize()
        return out
    # pycryptodome
    if encrypt:
        if extra == "PKCS5Padding":
            pad_len = 8 - len(data) % 8
            data = data + bytes([pad_len]) * pad_len
        return ctx.encrypt(data)
    out = ctx.decrypt(data)
    if extra == "PKCS5Padding":
        pad_len = out[-1]
        if 1 <= pad_len <= 8:
            out = out[:-pad_len]
    return out


def tempest_encrypt_string(plaintext: str, key: str, padding: str = DEFAULT_PADDING) -> str:
    """CryptoTool.encryptString: DESede/ECB, base64 URL-safe (tanpa strip '=')."""
    key24 = _pad_zero(key, 24)
    backend = _desede_cipher(key24, True, padding)
    ct = _desede_process(backend, _pad_zero(plaintext, 8), True)
    return base64.b64encode(ct).decode("ascii").replace("+", "-").replace("/", "_")


def tempest_decrypt_string(blob: str, salt_key: str, padding: str = DEFAULT_PADDING) -> str:
    """CryptoTool.decryptString(blob, saltKey): kunci = saltKey pad-24, trim hasil."""
    key24 = _pad_zero(salt_key, 24)
    raw = blob.replace("-", "+").replace("_", "/")
    ct = base64.b64decode(raw.encode("ascii"))
    backend = _desede_cipher(key24, False, padding)
    pt = _desede_process(backend, ct, False)
    return _kotlin_trim(pt.decode("utf-8"))


def tempest_handshake(timestamp_ms: int, shared_key: str,
                      padding: str = DEFAULT_PADDING) -> str:
    """Signature.i: encryptSSO(str(milis-sekarang)) lalu buang "\\n".

    encryptSSO(value) = encryptString(value, KeyClass.sharedKey) dengan
    sharedKey = AxisnetHelpers.getMsisdnSaltKey() (native). timestamp_ms di sini
    = DateHelper.getTodayTimeStamp() = Date.getTime() dari Calendar.getInstance()
    = milidetik epoch saat ini (BUKAN tengah malam — getTodayDate() hanya
    mengembalikan Calendar.getInstance().getTime()).
    """
    return tempest_encrypt_string(str(timestamp_ms), shared_key,
                                  padding).replace("\n", "")


# ---------------------------------------------------------------------------
# 2b. Konstanta app-embedded dari libnative-lib.so (fase 5) — STATIS, bukan secret user
# ---------------------------------------------------------------------------
# Nilai di bawah adalah konstanta yang ditanamkan di APK: getter native mengembalikan
# string .rodata (kadang sebagian di-patch mov/movk). Diambil dengan membaca mesin
# ARM64 tiap getter (script reverse-latest/fase5/extract_native_strings.py, hasilnya
# 272 getter di reverse-latest/fase5/native_strings.json). Ini BUKAN data user:
# siapa pun yang membongkar APK yang sama mendapat nilai yang sama. Karena itu file
# ini boleh memuatnya sebagai default — env var tetap bisa menimpa.

APP_SALT_KEY = "ae432353a4eb4eb9"      # AxisnetHelpers.getSaltKey() (juga OtpApiService.saltKey/randomKey)
APP_SHARED_KEY = APP_SALT_KEY          # KeyClass.sharedKey = AxisnetHelpers.getMsisdnSaltKey()
APP_SECRET_KEY = "2eb9362dd64b1e56"    # AxisnetHelpers.getSecretKey()
APP_NEW_SALT_KEY = "saltkey"           # AxisnetHelpers.getNewSaltKey()
APP_MD5_SALT = {"xl": "xl", "axis": "axis", "hash": "MD5", "msisdn": "msisdn",
                "decrypt": "decrypt", "axisnet": "axisnet"}
APP_OTP_OAUTH = {"client_id": "26NLLzLEZaLwngG0wUVI",
                 "client_secret": "gU8ya9VoMTFa0LYF3xkjVYpXAAGRwz",
                 "grant_type": "client_credentials"}
# User-Agent. API AXIS ada di belakang Cloudflare: request tanpa User-Agent
# khas HTTP client (mis. default Python) ditolak `403 error code: 1010`
# (bot fight mode). Dengan UA apa pun yang wajar, server membalas JSON biasa.
# App asli memakai okhttp, jadi nilai ini yang dipakai default (env boleh menimpa).
APP_USER_AGENT = "okhttp/4.9.3"
# Literal cipher, hasil dekode string obfuskasi getPos9/10/11 (lihat
# pos_obfuscated_decode) — sama dengan yang dikembalikan NativeLibImpl.get*Key().
APP_CIPHER = {"algorithm": pos_obfuscated_decode("5LuLv64KzyK656HwtHJ35GxG54S4tACA4"),
              "mode": pos_obfuscated_decode("2FtEyF43DKoJzD45SzS4TA"),
              "padding": pos_obfuscated_decode("7r6tEe6EGgD9pS64E6h46z1A6r0t5Cf6ze4k")}

# Blob ciphertext yang dikembalikan getter native (Signature.apiKey/keyTempest*).
# Ini CIPHERTEXT (base64 URL-safe), bukan kunci — kuncinya hasil decrypt di static_keys().
APP_API_KEY_BLOB = "ipRsTxOLbgogxEiXj1P73JVWgQk9CEXMSuIsaFO8t6I="
APP_TEMPEST_BLOBS = {
    "keyTempest": "hOc36lLcbQ8JLLGvhekVMVGy0w9hTM9EazVL1Z2aF9BiUG5Ov88rQg==",
    "keyTempestCapital": ("d9kKoBWgOltACb1_e7kjkYxD6HaX1eVQ9Ap0xh3xcetx__gFYyStSRw2x5t5"
                          "4y9VBl7xZ5dIDZqcEtYpxTzLHyuQaBvNrPkl"),
    "keyTempestMarket": "VEOXH8EAnFARSFDtbNnvxA==",
    "keyTempestMarketCapital": ("bA7mQfB73531XTWqAt4ItWgEARlLPqrLNOiuznUg0QZ3kO4I8beMw"
                                "gQT066-ulysRzQTvflCIPsr52R9E4iNbq3IXUNwP9wp"),
}


def static_keys(salt_key: str = APP_SALT_KEY, padding: str = DEFAULT_PADDING) -> dict:
    """Kunci Tempest plaintext: CryptoTool.decryptString(blob, saltKey), semua statis.

    Fase 4 menyimpulkan nilai ini "hanya ada saat runtime" karena getter-nya native.
    Ternyata blob-nya string .rodata biasa dan saltKey-nya juga string statis, jadi
    decryptString bisa dihitung offline (bukti + vektor: LAPORAN-FASE5.md §2).
    Butuh backend DESede (cryptography / pycryptodome); kalau tidak ada,
    melempar TempestHandshakeUnavailable.
    """
    keys = {name: tempest_decrypt_string(blob, salt_key, padding)
            for name, blob in APP_TEMPEST_BLOBS.items()}
    keys["apiKey"] = tempest_decrypt_string(APP_API_KEY_BLOB, salt_key, padding)
    return keys


def tempest_encrypt_sso(value: str, shared_key: str = APP_SHARED_KEY,
                        padding: str = DEFAULT_PADDING) -> str:
    """CryptoTool.encryptSSO(x) = encryptString(x, sharedKey); buang "\\n" ala caller."""
    return tempest_encrypt_string(value, shared_key, padding).replace("\n", "")


def msisdn_id_format(msisdn: str) -> str:
    """Utils.msisdnIDFormat: 0812... / 812... -> 62812... (untuk fb_id)."""
    s = _kotlin_trim(msisdn).replace("-", "").replace(" ", "")
    if s.startswith("0"):
        return "62" + s[1:]
    if s.startswith("8"):
        return "62" + s
    return s


def encryp_msisdn_md5(msisdn: str) -> str:
    """CryptoTool.encrypMsisdnMD5 = MD5("xl" + MD5(msisdnIDFormat(nomor)) + "axis") hex."""
    inner = hashlib.md5(msisdn_id_format(msisdn).encode()).hexdigest()
    return hashlib.md5((APP_MD5_SALT["xl"] + inner + APP_MD5_SALT["axis"]).encode()).hexdigest()


def decrypt_response_data(value, salt_key: str = APP_SALT_KEY):
    """Dekode isi field `data` respons AXIS (bukti smali: LAPORAN-FASE5.md §4).

    Ada dua jalur di app dan keduanya dicoba di sini, berurutan:
      1. NativeLib.decryptResponse(false, x) = T5/g.b: getBytes(UTF_8) ->
         Base64.decode -> new String(UTF_8) -> trim. TIDAK pakai cipher.
      2. CryptoTool$Companion.decryptResponse(x) = decryptString(x, saltKey)
         (DESede/ECB/NoPadding).
    Jalur 2 diperlukan karena `data` hasil jalur 1 bisa berupa teks acak kalau
    server sebenarnya mengirim ciphertext; kita deteksi dari kegagalan decode
    UTF-8 / hasil yang tidak masuk akal, lalu coba DESede.
    """
    if value is None or not isinstance(value, str):
        return value
    s = _kotlin_trim(value)
    if not s or s[0] in "{[":
        return value
    # 1) Base64 polos (T5/g.b)
    try:
        raw = base64.b64decode(s.replace("-", "+").replace("_", "/"), validate=True)
        text = _kotlin_trim(raw.decode("utf-8"))
    except Exception:  # noqa: BLE001
        text = None
    if text and _looks_plain(text):
        return _json_or_text(text)
    # 2) DESede dengan saltKey (CryptoTool.decryptResponse)
    try:
        text = _kotlin_trim(tempest_decrypt_string(s, salt_key, DEFAULT_PADDING))
    except Exception:  # noqa: BLE001  (backend tiada / padding salah / bukan cipher)
        return value
    return _json_or_text(text) if text else value


def _looks_plain(text: str) -> bool:
    """Sebagian besar karakter tercetak -> benar-benar teks, bukan ciphertext."""
    if not text:
        return False
    printable = sum(1 for ch in text if 32 <= ord(ch) < 127 or ch in "\n\t\r")
    return printable / len(text) > 0.9


def _json_or_text(text: str):
    try:
        return json.loads(text)
    except json.JSONDecodeError:
        return text


def decode_envelope(payload):
    """Dekode `data` di envelope respons (kalau dibungkus base64) jadi objek Python."""
    if isinstance(payload, dict) and "data" in payload:
        out = dict(payload)
        out["data"] = decrypt_response_data(payload.get("data"))
        return out
    return decrypt_response_data(payload)


def _http_error(e: urllib.error.HTTPError):
    """Error HTTP (401/400/...) tetap envelope JSON — jangan dilempar mentah.

    Server AXIS membalas {status:false, status_code:401, error_message:..., data:...}
    dengan kode non-2xx, jadi body-nya tetap dipakai; itu yang dipakai untuk
    membedakan 'signature ditolak' vs 'session invalid'.
    """
    try:
        payload = json.loads(e.read().decode())
    except Exception:  # noqa: BLE001
        return {"status": False, "status_code": e.code,
                "error_message": f"HTTP {e.code} {e.reason}", "data": None}
    if isinstance(payload, dict):
        payload.setdefault("status_code", e.code)
        return decode_envelope(payload)
    return {"status": False, "status_code": e.code, "error_message": str(payload),
            "data": None}


def token_from_response(resp):
    """Ambil token login dari respons OTP (fb/s.data).

    `data` sudah didekode decode_envelope: kalau JSON, cari kunci token yang
    umum dipakai app (token/access_token/...). Kalau cuma string base64/polos,
    string itu sendiri yang jadi token.
    """
    if not isinstance(resp, dict):
        return None
    data = resp.get("data")
    if isinstance(data, str):
        s = _kotlin_trim(data)
        if not s:
            return None
        if s[:1] in "{[":
            try:
                data = json.loads(s)
            except json.JSONDecodeError:
                return s
        else:
            return s
    if isinstance(data, dict):
        for k in ("token", "access_token", "accessToken", "auth_token", "authToken"):
            v = data.get(k)
            if isinstance(v, str) and v:
                return v
    return None


# --- Cache token login ------------------------------------------------------
#
# `login` menghasilkan token yang dipakai ulang oleh perintah lain (coin/bonus/
# redeem). Env `AXIS_AUTH_TOKEN` tetap yang paling utama; kalau kosong, token
# dibaca dari file `AXIS_TOKEN_FILE` (default `axis-token.txt` di samping modul,
# format 1 baris: nilai header Authorization). File seperti ini berisi secret
# user — jangan ikut di-commit/diarsip.

def token_file() -> str:
    return os.environ.get("AXIS_TOKEN_FILE") or os.path.join(
        os.path.dirname(os.path.abspath(__file__)), "axis-token.txt")


def load_cached_token() -> str:
    path = token_file()
    try:
        with open(path, encoding="utf-8") as fh:
            return fh.read().strip()
    except OSError:
        return ""


def save_cached_token(token: str) -> str:
    path = token_file()
    try:
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(token.strip() + "\n")
        os.chmod(path, 0o600)
    except OSError:
        pass
    return path


# ---------------------------------------------------------------------------
# 3. AXISnet native API — Tempest TERIMPLEMENTASI (rumus + kunci statis)
# ---------------------------------------------------------------------------

AXIS_API = {
    "otp_request": "https://otp.api.axis.co.id/v1/otp",
    "otp_login": "https://otp.api.axis.co.id/otplogin/v2",
    "otp_logout": "https://otp.api.axis.co.id/logout",
    "otp_fcm": "https://otp.api.axis.co.id/fcm",
    "coin_profile": "https://points.api.axis.co.id/v1/alifetime",
    "coin_point_v2": "https://points.api.axis.co.id/v2/alifetime/point",
    "coin_history": "https://points.api.axis.co.id/v1/alifetime/history",
    "level_profile": "https://profile.api.axis.co.id/v1/alifetime",
    "level_up": "https://profile.api.axis.co.id/v1/alifetime/level-up",
    "level_migration": "https://profile.api.axis.co.id/v1/alifetime/migration",
    "bonus_list": "https://profile.api.axis.co.id/v2/alifetime/bonus",
    "bonus_list_v1": "https://profile.api.axis.co.id/v1/alifetime/bonus",
    "bonus_voucher": "https://profile.api.axis.co.id/v2/alifetime/bonus/voucher",
    "redeem": "https://order.api.axis.co.id/v1/transaction/redeem/alifetime",
    "flashwar_info": "https://flashwar.api.axis.co.id/v1/list-bonus",
    "flashwar_claim": "https://flashwar.api.axis.co.id/v1/claim-bonus",
}

# Body redeem — AlifetimeClaimBonusRequest (Ld6/a), TANPA @SerializedName:
# nama field JSON = nama field persis, urutan ctor: productId, productType, merchantCode.
REDEEM_PATH = "/v1/transaction/redeem/alifetime"


class AxisnetClient:
    """Client AXISnet. Default = konstanta app-embedded (fase 5); env boleh menimpa.

    Env override (isi kalau mau memaksa nilai lain, mis. hasil tangkapan runtime):
      AXIS_AUTH_TOKEN                 token MENTAH hasil otplogin (tanpa "Bearer "),
                                      dipakai apa adanya sebagai header Authorization
      AXIS_TOKEN_FILE                 file cache token login (default axis-token.txt
                                      di samping modul; ditulis otomatis oleh `login`)
      AXIS_API_KEY_BLOB               blob X-API-KEY mentah dari .so (bukan hasil decrypt)
      AXIS_API_KEY_DECRYPTED          hasil decrypt apiKey()
      AXIS_TEMPEST_KEY_MARKET         kunci h STAGING   (decrypt keyTempestMarket)
      AXIS_TEMPEST_KEY_MARKET_CAPITAL kunci h PROD      (decrypt keyTempestMarketCapital)
      AXIS_TEMPEST_KEY                kunci m/j STAGING (decrypt keyTempest)
      AXIS_TEMPEST_KEY_CAPITAL        kunci m/j PROD    (decrypt keyTempestCapital)
      AXIS_TEMPEST_SHARED_KEY         sharedKey handshake = getMsisdnSaltKey
      AXIS_SALT_KEY                   saltKey CryptoTool / decryptResponse
      AXIS_ENV                        "prod" (default) / "staging"
      AXIS_APP_VERSION                default "11.1.0" (x-app-version)
      AXIS_OTP_CLIENT_ID / AXIS_OTP_CLIENT_SECRET
      AXIS_TEMPEST_PADDING            default "NoPadding" (hasil fase 5)
      AXIS_DEVICE_BRAND / AXIS_DEVICE_MODEL / AXIS_DEVICE_OS / AXIS_DEVICE_TYPE /
      AXIS_FCM_TOKEN / AXIS_IMEI      identitas perangkat untuk OTP login

    `AxisnetClient(use_static_defaults=False)` mengosongkan semua default — dipakai
    self-test untuk memastikan kode tetap menolak request tanpa kunci.

    Pemilihan kunci mengikuti Signature.g()/u()/x():
      keluarga h (interceptor + redeem): staging -> MARKET, prod -> MARKET_CAPITAL
      keluarga m/j (prefix/OTP):         staging -> KEY,      prod -> KEY_CAPITAL
    """

    def __init__(self, use_static_defaults: bool = True):
        static = {}
        if use_static_defaults:
            try:
                static = static_keys()
            except TempestHandshakeUnavailable:
                static = {}

        def pick(env: str, default: str) -> str:
            """Env menang; kalau tidak ada, pakai default statis (kalau diizinkan)."""
            val = os.environ.get(env, "")
            if val:
                return val
            return default if use_static_defaults else ""

        self.otp_client_id = pick("AXIS_OTP_CLIENT_ID", APP_OTP_OAUTH["client_id"])
        self.otp_client_secret = pick("AXIS_OTP_CLIENT_SECRET", APP_OTP_OAUTH["client_secret"])
        self.salt_key = pick("AXIS_SALT_KEY", APP_SALT_KEY)
        self.api_key_blob = pick("AXIS_API_KEY_BLOB", APP_API_KEY_BLOB)
        self.api_key = pick("AXIS_API_KEY_DECRYPTED", static.get("apiKey", ""))
        self.auth_token = os.environ.get("AXIS_AUTH_TOKEN") or load_cached_token()
        self.token_file = token_file()
        self.tempest_key_market = pick("AXIS_TEMPEST_KEY_MARKET", static.get("keyTempestMarket", ""))
        self.tempest_key_market_capital = pick(
            "AXIS_TEMPEST_KEY_MARKET_CAPITAL", static.get("keyTempestMarketCapital", ""))
        self.tempest_key = pick("AXIS_TEMPEST_KEY", static.get("keyTempest", ""))
        self.tempest_key_capital = pick("AXIS_TEMPEST_KEY_CAPITAL", static.get("keyTempestCapital", ""))
        self.tempest_shared_key = pick("AXIS_TEMPEST_SHARED_KEY", APP_SHARED_KEY)
        self.staging = os.environ.get("AXIS_ENV", "prod").strip().lower() == "staging"
        self.app_version = os.environ.get("AXIS_APP_VERSION", "11.1.0")
        # Padding cipher: DESede/ECB/NoPadding (terkonfirmasi statis, fase 5).
        self.tempest_padding = os.environ.get("AXIS_TEMPEST_PADDING", DEFAULT_PADDING)
        # Identitas perangkat untuk OTP login: server tidak menguji nilainya
        # (signature dihitung dari nilai yang kita kirim), asal konsisten.
        self.device_brand = os.environ.get("AXIS_DEVICE_BRAND", "samsung")
        self.device_model = os.environ.get("AXIS_DEVICE_MODEL", "SM-G991B")
        self.device_os = os.environ.get("AXIS_DEVICE_OS", "34")
        self.device_type = os.environ.get("AXIS_DEVICE_TYPE", "android")
        self.fcm_token = os.environ.get("AXIS_FCM_TOKEN", "")
        self.imei = os.environ.get("AXIS_IMEI", "")
        # UA: Cloudflare menolak UA default Python (403 error code: 1010).
        self.user_agent = os.environ.get("AXIS_USER_AGENT", APP_USER_AGENT)

    # -- pemilihan kunci (Signature.g / u) --
    def tempest_key_h(self) -> str:
        """Kunci keluarga h: staging -> Market, prod -> MarketCapital."""
        return self.tempest_key_market if self.staging else self.tempest_key_market_capital

    def tempest_key_mj(self) -> str:
        """Kunci keluarga m/j: staging -> keyTempest, prod -> keyTempestCapital."""
        return self.tempest_key if self.staging else self.tempest_key_capital

    def _require(self, value: str, env_name: str):
        if not value:
            raise TempestNotImplemented(
                f"Nilai {env_name} kosong. Default-nya konstanta app-embedded "
                "(di-decrypt dari libnative-lib.so); isi env hanya kalau mau memaksa "
                "nilai lain, atau pakai AxisnetClient(use_static_defaults=False).")
        return value

    def make_handshake(self, timestamp_ms: int | None = None) -> str:
        """Signature.i() — butuh AXIS_TEMPEST_SHARED_KEY."""
        shared = self._require(self.tempest_shared_key, "AXIS_TEMPEST_SHARED_KEY")
        ts = timestamp_ms if timestamp_ms is not None else int(time.time() * 1000)
        return tempest_handshake(ts, shared, self.tempest_padding)

    def _post(self, url, body, headers, raw_body: str | None = None):
        data = (raw_body if raw_body is not None else json.dumps(
            body, separators=(",", ":"), ensure_ascii=False)).encode()
        headers = dict(headers)
        headers.setdefault("User-Agent", self.user_agent)
        req = urllib.request.Request(url, data=data, headers=headers, method="POST")
        try:
            with urllib.request.urlopen(req, timeout=30) as r:
                return decode_envelope(json.loads(r.read().decode()))
        except urllib.error.HTTPError as e:
            return _http_error(e)

    def _get(self, url, headers):
        headers = dict(headers)
        headers.setdefault("User-Agent", self.user_agent)
        req = urllib.request.Request(url, headers=headers, method="GET")
        try:
            with urllib.request.urlopen(req, timeout=30) as r:
                return decode_envelope(json.loads(r.read().decode()))
        except urllib.error.HTTPError as e:
            return _http_error(e)

    # -- OTP: POST /v1/otp + POST /otplogin/v2 (bukti smali, fase 5) --
    def otp_headers(self, method: str, url: str, fields) -> dict:
        """Header OtpApiService: Content-Type, Connection, X-API-KEY,
        x-app-version, x-signature (keluarga j/v — TANPA x-handshake/Authorization).

        `fields` = 8 string untuk Signature.j/v; field apiKey() yang ke-9 diisi
        BLOB mentah `apiKey()` (sama dengan header X-API-KEY), bukan hasil decrypt.
        """
        key = self._require(self.tempest_key_mj(),
                            "AXIS_TEMPEST_KEY" if self.staging
                            else "AXIS_TEMPEST_KEY_CAPITAL")
        blob = self._require(self.api_key_blob, "AXIS_API_KEY_BLOB")
        path = urllib.parse.urlparse(url).path
        return {
            "Content-Type": "application/json",
            "Connection": "keep-alive",
            "X-API-KEY": blob,
            "x-app-version": self.app_version,
            "x-signature": tempest_sign_j(path, fields, blob, key),
            "User-Agent": self.user_agent,
        }

    def request_otp(self, msisdn: str):
        """POST https://otp.api.axis.co.id/v1/otp — KIRIM SMS OTP NYATA ke nomor.

        Body OtpPayload {msisdn: encryptSSO(nomor), deviceType: "android"}:
        nomor di-DESede-encrypt dengan sharedKey dulu (CryptoTool.encryptSSO),
        lalu "\\n" dibuang (kotlin.text.u.J di caller).

        Signature j/v (dikonfirmasi LIVE, fase 5 — server membalas
        `400 Nomor Axis yang kamu masukkan salah`, bukan `Invalid signature`,
        artinya signature diterima):

            "POST;/v1/otp;<encMsisdn>;;;;;;;;<apiKey BLOB>"

        yaitu field#1 = msisdn terenkripsi dan field#2..#8 kosong; `deviceType`
        dikirim di body tapi TIDAK ikut signature (lihat fase5_probe_otp.py).
        """
        enc = tempest_encrypt_sso(_kotlin_trim(msisdn), self.tempest_shared_key,
                                  self.tempest_padding)
        body = {"msisdn": enc, "deviceType": self.device_type}
        headers = self.otp_headers("POST", AXIS_API["otp_request"],
                                   self.otp_sign_fields(enc))
        return self._post(AXIS_API["otp_request"], body, headers)

    @staticmethod
    def otp_sign_fields(enc_msisdn: str) -> list:
        """8 field Signature.w('/v1/otp', ...): hanya field#1 (msisdn) yang terisi.

        `deviceType` ada di body tapi TIDAK ikut signature — terbukti live:
        begitu deviceType disisipkan ke field#2 atau #8, server membalas
        `Invalid signature`; dengan field#2..#8 kosong signature diterima.
        """
        return [enc_msisdn] + [""] * 7

    def login_otp(self, msisdn: str, otp_code: str, fcm_token: str | None = None,
                  fb_id: str | None = None, save_token: bool = True):
        """POST https://otp.api.axis.co.id/otplogin/v2 — tukar OTP -> token.

        Body sc/c: {msisdn, brand, model, otp_code, device_type, device_os,
        fcm_token, fb_id, imei}. msisdn dan otp_code di-encryptSSO; fb_id =
        CryptoTool.encrypMsisdnMD5 = MD5("xl"+MD5(62812..)+"axis").
        Signature v(): "POST;/otplogin/v2;<encMsisdn>;<encOtp>;<fcm>;<fb_id>;
        <model>;<brand>;<device_os>;<device_type>;<apiKeyBlob>".
        Respons fb/s{status, status_code, error_message, data}: `data` = string
        (base64 ala decryptResponse) yang berisi token; lihat token_from_response.
        """
        enc_msisdn = tempest_encrypt_sso(_kotlin_trim(msisdn), self.tempest_shared_key,
                                         self.tempest_padding)
        enc_otp = tempest_encrypt_sso(_kotlin_trim(otp_code), self.tempest_shared_key,
                                      self.tempest_padding)
        fcm = self.fcm_token if fcm_token is None else fcm_token
        fb = fb_id if fb_id is not None else encryp_msisdn_md5(msisdn)
        body = {"msisdn": enc_msisdn, "brand": self.device_brand,
                "model": self.device_model, "otp_code": enc_otp,
                "device_type": self.device_type, "device_os": self.device_os,
                "fcm_token": fcm, "fb_id": fb, "imei": self.imei}
        headers = self.otp_headers("POST", AXIS_API["otp_login"],
                                   [enc_msisdn, enc_otp, fcm, fb, self.device_model,
                                    self.device_brand, self.device_os, self.device_type])
        resp = self._post(AXIS_API["otp_login"], body, headers)
        tok = token_from_response(resp)
        if tok:
            # BUKAN "Bearer <tok>": host points/profile/order minta token MENTAH
            # (terbukti live, fase5_probe_token.py — dengan awalan Bearer semua
            # endpoint membalas 401 "session invalid").
            self.auth_token = tok
            if save_token:
                self.token_file = save_cached_token(self.auth_token)
        return resp

    # -- Signing Tempest (keluarga h) untuk semua call *.api.axis.co.id --
    def _tempest_headers(self, method: str, url: str, body: dict | None,
                         token: str | None = None, handshake: str | None = None) -> dict:
        """Header Tempest mengikuti HMACSignatureInterceptor + Signature.h/i.

        - path = url path saja (URI.getPath(), tanpa query), method di-UPPER.
        - json = string mentah body persis seperti dikirim ("" bila tanpa body);
          serialisasi di sini compact tanpa spasi, seperti Gson.
        - token = nilai persis header Authorization; bila None, dipakai
          AXIS_AUTH_TOKEN; bila keduanya kosong, token "null" (meniru
          String.valueOf(header) di interceptor) dan header Authorization
          tidak dikirim.
        - handshake = Signature.i(); bila None, dihitung dari sharedKey env.
        - kunci = keluarga h (Market/MarketCapital menurut AXIS_ENV).
        """
        key = self._require(self.tempest_key_h(),
                            "AXIS_TEMPEST_KEY_MARKET" if self.staging
                            else "AXIS_TEMPEST_KEY_MARKET_CAPITAL")
        method_up = method.upper()
        path = urllib.parse.urlparse(url).path
        json_str = "" if body is None else json.dumps(body, separators=(",", ":"),
                                                      ensure_ascii=False)
        tok = token if token is not None else (self.auth_token or "null")
        hs = handshake if handshake is not None else self.make_handshake()
        sig = tempest_sign_h(method_up, path, json_str, tok, hs, key)
        headers = {"x-signature": sig, "x-handshake": hs,
                   "x-app-version": self.app_version}
        if tok != "null":
            headers["Authorization"] = tok
        if body is not None:
            headers["Content-Type"] = "application/json"
        return headers

    def get_coin_profile(self, token: str | None = None):
        """GET points.api.axis.co.id/v1/alifetime — @HMACHeader (interceptor)."""
        headers = self._tempest_headers("GET", AXIS_API["coin_profile"], None, token)
        return self._get(AXIS_API["coin_profile"], headers)

    def get_level_profile(self, token: str | None = None):
        """GET profile.api.axis.co.id/v1/alifetime — TIDAK ber-@HMACHeader:
        hanya Authorization + x-app-version, tanpa x-signature/x-handshake."""
        tok = token if token is not None else self.auth_token
        if not tok:
            raise TempestNotImplemented("Isi AXIS_AUTH_TOKEN dulu (token login).")
        return self._get(AXIS_API["level_profile"],
                         {"Authorization": tok, "x-app-version": self.app_version})

    def current_level(self, token: str | None = None) -> str:
        """`current_level` dari GET profile.api.axis.co.id/v1/alifetime."""
        data = self.get_level_profile(token).get("data") or {}
        return data.get("current_level", "")

    def list_bonus(self, level: str | None = None, token: str | None = None):
        """GET profile.api.axis.co.id/v2/alifetime/bonus?level=<level> — @HMACHeader.

        `level` WAJIB: tanpa query itu server membalas `500 "Terjadi kesalahan
        pada server"` (bukan error signature) — terbukti live, fase 5 §7.2.
        Anotasi Retrofit aslinya (`getAlifetimeBonus`) punya `?level&from`;
        `from` boleh dilepas.
        """
        level = level or self.current_level(token)
        url = AXIS_API["bonus_list"] + "?level=" + urllib.parse.quote(level)
        headers = self._tempest_headers("GET", url, None, token)
        return self._get(url, headers)

    def bonus_detail(self, bonus_id: str, token: str | None = None):
        """GET profile.api.axis.co.id/v2/alifetime/bonus/<bonusId> — @HMACHeader.

        `bonusId` bentuknya `<level>*<tipe>` (mis. `kenalan*bonus_quota`), dari
        smali `getBonusAlifetimeDetail`: url = getBonusAlifetimeUrl() + "/" + id.
        `*` sengaja TIDAK di-quote: signature dihitung atas `URI.getPath()` asli
        (versi `%2A` bikin server balas `401 "Invalid signature"` — terbukti live).
        Produk di dalamnya (`data.card.products`) menyimpan `service_id` /
        `price_plan_code` sebagai blob DESede (`saltKey`) + `type` + `merchant_code`.
        """
        url = AXIS_API["bonus_list"] + "/" + str(bonus_id)
        headers = self._tempest_headers("GET", url, None, token)
        return self._get(url, headers)

    def bonus_products(self, bonus_id: str, token: str | None = None) -> list:
        """Produk siap-redeem dari satu grup bonus, plus service_id yang sudah
        di-decrypt (`productId` yang dikirim ke /redeem/alifetime tetap blob)."""
        data = (self.bonus_detail(bonus_id, token) or {}).get("data") or {}
        out = []
        for p in (data.get("card") or {}).get("products") or []:
            sid = p.get("service_id") or ""
            try:
                decoded = tempest_decrypt_string(sid, self.salt_key, self.tempest_padding) if sid else ""
            except Exception:  # noqa: BLE001
                decoded = ""
            out.append({"name": p.get("name"), "point": p.get("point"),
                        "status": p.get("status"), "product_id_blob": sid,
                        "service_id_decrypted": decoded,
                        "product_type": p.get("type"),
                        "merchant_code": p.get("merchant_code") or ""})
        return out

    def redeem(self, product_id: str, product_type: str = "", merchant_code: str = "",
               token: str | None = None, handshake: str | None = None):
        """POST order.api.axis.co.id/v1/transaction/redeem/alifetime.

        Body = AlifetimeClaimBonusRequest {productId, productType, merchantCode}
        (Ld6/a, tanpa @SerializedName). Pemetaan field terbukti dari smali
        `AlifetimeDetailActivity.claimProduct`:

            new-instance Ld6/a; getServiceId() → productId   (BLOB service_id!)
                                  getType()     → productType (mis. "bonus_quota")
                                  getMerchantCode() → merchantCode (sering "")

        Signing meniru Signature.e(): h("POST", "/v1/transaction/redeem/alifetime",
        bodyJson, token, handshake) dengan kunci g() = d(keyTempestMarketCapital);
        x-signature + x-handshake dikirim sebagai header eksplisit (endpoint ini
        TIDAK lewat interceptor). Token = nilai MENTAH (tanpa "Bearer "), §7.1.
        """
        body = {"productId": product_id, "productType": product_type,
                "merchantCode": merchant_code}
        headers = self._tempest_headers("POST", AXIS_API["redeem"], body,
                                        token, handshake)
        return self._post(AXIS_API["redeem"], body, headers)


# ---------------------------------------------------------------------------
# 4. Self-test (tanpa network)
# ---------------------------------------------------------------------------

def self_test() -> bool:
    ok = True
    # --- Modula (seperti sebelumnya) ---
    n1 = modula_nonce("JGH5T9ZQ2", "SECRET-UJI", "device-123", "1763635200")
    expect = hmac.new(b"SECRET-UJI",
                      b"jgh5t9zq2SECRET-UJIdevice-1231763635200",
                      hashlib.sha256).hexdigest()
    assert n1 == expect, f"nonce mismatch: {n1} != {expect}"
    assert len(n1) == 64 and all(c in "0123456789abcdef" for c in n1)
    assert modula_nonce("JGH5T9ZQ2", "SECRET-UJI", "device-123", "1763635201") != n1
    h = modula_headers(brand_code="JGH5T9ZQ2", brand_secret="SECRET-UJI",
                       device_id="device-123", env="prod", auth_token="TOKEN-UJI",
                       user_agent="AXISnet/11.1.0", app_version="11.1.0",
                       msisdn="6283812345678", timestamp_s="1763635200")
    assert h["X-Brand-Code"] == "JGH5T9ZQ2" and h["X-Timestamp"] == "1763635200"
    assert h["X-Nonce"] == n1 and h["Authorization"] == "Bearer TOKEN-UJI"
    assert h["X-Msisdn"] == "6283812345678" and h["X-Platform"] == "React-Native"

    # --- Tempest: konstruksi pesan keluarga h (vektor literal, independen) ---
    msg_h = tempest_message_h("POST", "/v1/transaction/redeem/alifetime",
                              '{"productId":"P1","productType":"QUOTA","merchantCode":"M1"}',
                              "Bearer TOKEN-UJI", "HS-UJI")
    assert msg_h == ("POST;/v1/transaction/redeem/alifetime;"
                     '{"productId":"P1","productType":"QUOTA","merchantCode":"M1"};'
                     "Bearer TOKEN-UJI;HS-UJI"), f"msg_h salah: {msg_h!r}"
    sig_h = tempest_sign_h("POST", "/v1/transaction/redeem/alifetime",
                           '{"productId":"P1","productType":"QUOTA","merchantCode":"M1"}',
                           "Bearer TOKEN-UJI", "HS-UJI", "KUNCI-UJI")
    expect_h = hmac.new(b"KUNCI-UJI", msg_h.encode(), hashlib.sha256).hexdigest()
    assert sig_h == expect_h and len(sig_h) == 64
    assert sig_h == tempest_sign_redeem(
        "Bearer TOKEN-UJI",
        '{"productId":"P1","productType":"QUOTA","merchantCode":"M1"}',
        "HS-UJI", "KUNCI-UJI"), "Signature.e harus == h() untuk redeem"
    # deterministik + sensitif terhadap tiap field
    assert tempest_sign_h("POST", "/v1/transaction/redeem/alifetime", "{}", "T", "H", "K") == \
        tempest_sign_h("POST", "/v1/transaction/redeem/alifetime", "{}", "T", "H", "K")
    assert tempest_sign_h("GET", "/v1/alifetime", "", "T", "H", "K") != \
        tempest_sign_h("POST", "/v1/alifetime", "", "T", "H", "K")
    assert tempest_sign_h("GET", "/v1/alifetime", "", "T", "H", "K") != \
        tempest_sign_h("GET", "/v1/alifetime", "", "T", "H2", "K")

    # --- Tempest: keluarga m (4 field, tanpa token) ---
    msg_m = tempest_message_m("POST", "/prefix", '{"msisdn":"6281"}', "HS-UJI")
    assert msg_m == 'POST;/prefix;{"msisdn":"6281"};HS-UJI'
    assert tempest_sign_m("POST", "/prefix", '{"msisdn":"6281"}', "HS-UJI", "K") == \
        hmac.new(b"K", msg_m.encode(), hashlib.sha256).hexdigest()

    # --- Tempest: keluarga j/v (OTP login; null -> "", apiKey di akhir) ---
    msg_j = tempest_message_j("/otplogin/v2",
                              ["6283812345678", "123456", "FCM", "FB", "Pixel 7",
                               "Google", "14", "Android"], "APIKEY-UJI")
    assert msg_j == ("POST;/otplogin/v2;6283812345678;123456;FCM;FB;Pixel 7;"
                     "Google;14;Android;APIKEY-UJI"), f"msg_j salah: {msg_j!r}"
    # `/v1/otp`: HANYA field#1 (encMsisdn) yang ikut signature — terbukti live
    # (fase5_probe_otp.py: begitu deviceType disisipkan, server balas
    # "Invalid signature"; tanpa sisipan → 400 "Nomor Axis ... salah").
    msg_j2 = tempest_message_j("/v1/otp", AxisnetClient.otp_sign_fields("ENC-MSISDN"),
                               "APIKEY-UJI")
    assert msg_j2 == "POST;/v1/otp;ENC-MSISDN;;;;;;;;APIKEY-UJI", \
        f"msg_j2 salah: {msg_j2!r}"
    assert AxisnetClient.otp_sign_fields("ENC") == ["ENC"] + [""] * 7, \
        "field signature /v1/otp berubah (deviceType tidak boleh ikut)"
    # token login disimpan MENTAH (tanpa "Bearer ") — terbukti live fase 5:
    # host points/profile menolak `Bearer <uuid>` dengan 401 "session invalid"
    tok = token_from_response({
        "status": True, "status_code": 200,
        "data": {"id": "", "name": "", "token": "e7f1a267-f068-48ca-af52-4f760cb85670",
                 "message": "generate new token"}})
    assert tok == "e7f1a267-f068-48ca-af52-4f760cb85670", f"token salah: {tok!r}"
    # cache token login (dipakai CLI `login` -> `coin`/`bonus`/`redeem`)
    os.environ["AXIS_TOKEN_FILE"] = os.path.join(
        tempfile.gettempdir(), "axisnet-selftest-token.txt")
    fp = save_cached_token("UJI-TOKEN")
    assert load_cached_token() == "UJI-TOKEN"
    assert AxisnetClient().auth_token == "UJI-TOKEN"
    os.remove(fp)
    del os.environ["AXIS_TOKEN_FILE"]
    try:
        tempest_message_j("/x", ["a"] * 7, "K")
        ok = False
        print("FAIL: tempest_message_j harus menolak field != 8")
    except ValueError:
        pass

    # --- Tempest: handshake DESede round-trip (bila backend tersedia) ---
    try:
        hs = tempest_handshake(1763635200000, "SHARED-UJI")
        assert "\n" not in hs and "+" not in hs and "/" not in hs
        assert tempest_decrypt_string(hs, "SHARED-UJI") == "1763635200000", \
            "round-trip handshake gagal"
        # pad kunci: decrypt dengan kunci yang sama harus konsisten dua arah
        enc = tempest_encrypt_string("6283812345678", "SALT-UJI")
        assert tempest_decrypt_string(enc, "SALT-UJI") == "6283812345678"
        print(f"  handshake DESede OK (contoh: {hs})")
    except TempestHandshakeUnavailable as e:
        print(f"  SKIP handshake DESede: {e}")

    # --- FASE 5: literal cipher hasil dekode string obfuskasi (vektor statis) ---
    assert APP_CIPHER == {"algorithm": "DESede", "mode": "ECB", "padding": "NoPadding"}, \
        f"APP_CIPHER salah: {APP_CIPHER}"
    assert pos_obfuscated_decode("5LuLv64KzyK656HwtHJ35GxG54S4tACA4") == "DESede"
    assert pos_obfuscated_decode("2FtEyF43DKoJzD45SzS4TA") == "ECB"
    assert pos_obfuscated_decode("7r6tEe6EGgD9pS64E6h46z1A6r0t5Cf6ze4k") == "NoPadding"
    assert DEFAULT_PADDING == "NoPadding" == APP_CIPHER["padding"]

    # --- FASE 5: saltKey statis + hasil decrypt blob native (vektor literal) ---
    assert APP_SALT_KEY == "ae432353a4eb4eb9"
    assert APP_SHARED_KEY == APP_SALT_KEY
    assert APP_SECRET_KEY == "2eb9362dd64b1e56"
    expect_keys = {
        "apiKey": "4x1sNetMod3rn1zATi0N2020Kd5",
        "keyTempest": "640cf31351a236bb0a5d0407ba7ae40fe7749f10",
        "keyTempestMarket": "ae432353a41b4eb9",
        "keyTempestCapital": ("7L20wW59wJkXG1z2vR8Q6pmnssgRptOHdC3xO9CrtOFE2u6mF7Xk9Is11S44aPTPu5"),
        "keyTempestMarketCapital": ("a0A38QY0HwkMGLwLq5zrmpC17cGBj01I2pZ91v42K26X57SThVsdfBuSut7RXkJ9eR"),
    }
    try:
        got = static_keys()
        for name, want in expect_keys.items():
            assert got[name] == want, f"{name}: {got[name]!r} != {want!r}"
        # round-trip: encryptString(hasil, saltKey) harus menghasilkan blob aslinya
        for name, blob in list(APP_TEMPEST_BLOBS.items()) + [("apiKey", APP_API_KEY_BLOB)]:
            assert tempest_encrypt_string(got[name], APP_SALT_KEY) == blob, \
                f"round-trip {name} gagal"
        print("  static_keys() DESede/ECB/NoPadding == vektor literal .so (OK)")
    except TempestHandshakeUnavailable as e:
        print(f"  SKIP static_keys (backend DESede tidak ada): {e}")

    # --- FASE 5: decryptResponse(false, x) = Base64 + UTF-8 + trim (bukan cipher) ---
    wrap = base64.b64encode(b'{"bonus":[{"id":7}]}\x00\x00').decode()
    assert decrypt_response_data(wrap) == {"bonus": [{"id": 7}]}, "decryptResponse gagal"
    # varian ciphertext: bila server mengirim data hasil DESede (CryptoTool
    # .decryptResponse), decoder harus tetap bisa membacanya
    try:
        cipher = tempest_encrypt_string('{"a":1}', APP_SALT_KEY)
        assert decrypt_response_data(cipher) == {"a": 1}, "fallback DESede gagal"
    except TempestHandshakeUnavailable:
        pass
    assert decode_envelope({"status": True, "status_code": 200,
                            "error_message": None, "data": wrap})["data"] == \
        {"bonus": [{"id": 7}]}
    assert decode_envelope({"status": False, "status_code": 401,
                            "error_message": "session invalid",
                            "data": None})["status"] is False
    assert decrypt_response_data("bukan base64 !!") == "bukan base64 !!"
    assert decrypt_response_data(None) is None

    # --- FASE 5: encryptSSO + fb_id (MD5 berlapis dengan salt statis "xl"/"axis") ---
    assert msisdn_id_format("083812345678") == "6283812345678"
    assert msisdn_id_format("83812345678") == "6283812345678"
    assert msisdn_id_format("6283812345678") == "6283812345678"
    inner = hashlib.md5(b"6283812345678").hexdigest()
    assert encryp_msisdn_md5("083812345678") == hashlib.md5(
        ("xl" + inner + "axis").encode()).hexdigest()
    try:
        sso = tempest_encrypt_sso("083812345678")
        assert "\n" not in sso and tempest_decrypt_string(sso, APP_SHARED_KEY) == "083812345678"
        print(f"  encryptSSO round-trip OK (contoh: {sso})")
    except TempestHandshakeUnavailable:
        pass

    # --- FASE 5: token_from_response (fb/s.data string atau JSON) ---
    assert token_from_response({"data": "ABC.TOKEN.XYZ"}) == "ABC.TOKEN.XYZ"
    assert token_from_response({"data": '{"token":"T1","msisdn":"6281"}'}) == "T1"
    assert token_from_response({"data": None}) is None
    assert token_from_response({"status": False}) is None

    # --- FASE 5: vektor respons NYATA (§7) — decode_envelope + decrypt service_id ---
    live_coin = ("eyJpc19hY3RpdmUiOnRydWUsImlzX2hpc3RvcnkiOjF9")  # {"is_active":true,"is_history":1}
    env = decode_envelope({"status": True, "status_code": 200, "data": live_coin})
    assert env["data"] == {"is_active": True, "is_history": 1}, f"data salah: {env}"
    # service_id produk bonus = blob DESede/saltKey (fase 5 §7.3)
    assert tempest_decrypt_string("Dd3FS0Ocl62DNVkreoumPw==", APP_SALT_KEY) == "3210491_KN"
    assert tempest_decrypt_string("LA6PVvmRRYmDNVkreoumPw==", APP_SALT_KEY) == "3215687_KN"
    # body redeem mengikuti pemetaan claimProduct: productId(service_id);type;merchantCode
    msg_r = tempest_message_h("POST", "/v1/transaction/redeem/alifetime",
                              '{"productId":"SID","productType":"bonus_quota","merchantCode":""}',
                              "TOKEN-POLOS", "HS-UJI")
    assert msg_r == ('POST;/v1/transaction/redeem/alifetime;'
                     '{"productId":"SID","productType":"bonus_quota","merchantCode":""};'
                     "TOKEN-POLOS;HS-UJI"), f"msg redeem salah: {msg_r!r}"

    # --- Tempest: header builder end-to-end lokal (tanpa network) ---
    c = AxisnetClient()
    c.tempest_key_market_capital = "KUNCI-UJI"
    c.auth_token = "Bearer TOKEN-UJI"
    hdrs = c._tempest_headers("GET", AXIS_API["coin_profile"], None,
                              handshake="HS-UJI")
    assert hdrs["x-signature"] == tempest_sign_h(
        "GET", "/v1/alifetime", "", "Bearer TOKEN-UJI", "HS-UJI", "KUNCI-UJI")
    assert hdrs["x-handshake"] == "HS-UJI"
    assert hdrs["Authorization"] == "Bearer TOKEN-UJI"
    assert hdrs["x-app-version"] == "11.1.0"
    assert len(hdrs["x-signature"]) == 64
    # staging memilih kunci Market (bukan MarketCapital)
    c.staging = True
    c.tempest_key_market = "KUNCI-STAGING"
    hdrs2 = c._tempest_headers("GET", AXIS_API["coin_profile"], None,
                               handshake="HS-UJI")
    assert hdrs2["x-signature"] == tempest_sign_h(
        "GET", "/v1/alifetime", "", "Bearer TOKEN-UJI", "HS-UJI", "KUNCI-STAGING")

    # --- FASE 5: path URL harus sama dengan konstanta path di smali ---
    # (signature dihitung dari path, jadi URL yang salah = signature salah)
    expect_path = {
        "otp_request": "/v1/otp",              # Signature.w di sendDataOtp
        "otp_login": "/otplogin/v2",           # Signature.v di getOtpLoginSignature
        "coin_profile": "/v1/alifetime",
        "redeem": "/v1/transaction/redeem/alifetime",
        "bonus_list": "/v2/alifetime/bonus",
    }
    for name, want in expect_path.items():
        got = urllib.parse.urlparse(AXIS_API[name]).path
        assert got == want, f"AXIS_API[{name!r}] path {got!r} != {want!r}"

    # --- FASE 5: header OTP memakai keluarga j + BLOB apiKey (bukan hasil decrypt) ---
    c3 = AxisnetClient()
    c3.tempest_key_capital = "KUNCI-MJ"
    c3.api_key_blob = "BLOB-UJI"
    oh = c3.otp_headers("POST", AXIS_API["otp_login"],
                        ["EM", "EO", "FCM", "FB", "Model", "Brand", "34", "android"])
    assert oh["X-API-KEY"] == "BLOB-UJI" and oh["Connection"] == "keep-alive"
    assert "x-handshake" not in oh and "Authorization" not in oh
    assert oh["x-signature"] == hmac.new(
        b"KUNCI-MJ",
        b"POST;/otplogin/v2;EM;EO;FCM;FB;Model;Brand;34;android;BLOB-UJI",
        hashlib.sha256).hexdigest(), "signature OTP (keluarga v) salah"

    # --- FASE 5: default statis terisi, mode "tanpa statis" tetap menolak ---
    full = AxisnetClient()
    if APP_CIPHER["padding"] == full.tempest_padding:
        assert full.tempest_padding == "NoPadding"
    bare = AxisnetClient(use_static_defaults=False)
    assert bare.tempest_key_capital == "" and bare.api_key_blob == ""
    try:
        bare.get_coin_profile()
        ok = False
        print("FAIL: request tanpa kunci seharusnya raise TempestNotImplemented")
    except TempestNotImplemented:
        pass
    try:
        bare.otp_headers("POST", AXIS_API["otp_request"], ["x"] * 8)
        ok = False
        print("FAIL: OTP tanpa apiKey seharusnya raise TempestNotImplemented")
    except TempestNotImplemented:
        pass
    # dengan default statis, request harus bisa menyiapkan header (tanpa network)
    if full.api_key_blob and full.tempest_key_capital:
        h = full.otp_headers("POST", AXIS_API["otp_request"],
                             ["ENC", "android", None, None, None, None, None, None])
        assert h["x-signature"].startswith(
            hmac.new(full.tempest_key_capital.encode(),
                     b"POST;/v1/otp;ENC;android;;;;;;;" + full.api_key_blob.encode(),
                     hashlib.sha256).hexdigest()[:8])
    print("self-test OK: Modula konsisten; Tempest h/m/j + header + handshake konsisten; "
          "kunci statis .so + DESede/ECB/NoPadding + decryptResponse + OTP payload cocok; "
          "tanpa kunci tetap diblokir (benar).")
    return ok


def main():  # noqa: C901
    args = sys.argv[1:]
    if "--self-test" in args or not args:
        if "--self-test" in args:
            sys.exit(0 if self_test() else 1)
        print("AXISnet 11.1.0 — status (fase 5, reverse statis):")
        print("  Modula signing      : TERIMPLEMENTASI (verifikasi bundle RN)")
        print("  Tempest h/m/j/v     : TERIMPLEMENTASI + kunci statis dari libnative-lib.so")
        print("  Cipher CryptoTool   : DESede/ECB/NoPadding (literal terbaca statis)")
        print("  decryptResponse     : TERIMPLEMENTASI (base64+trim; auto-decode `data`)")
        print("  OTP /v1/otp + login : TERIMPLEMENTASI (body & signature dari smali)")
        print("  Koin/bonus/redeem   : TERIMPLEMENTASI, tinggal butuh AXIS_AUTH_TOKEN")
        print("  Yang kurang         : token login (OTP nomor user) + konfirmasi server")
        print("  Laporan             : reverse-latest/LAPORAN-FASE5.md")
        print()
        print("Pakai: --self-test | keys | handshake | otp <nomor> |")
        print("       login <nomor> <otp> | token | coin | bonus | level |")
        print("       redeem <productId> [tipe] [merchant]")
        print("Token login otomatis di-cache ke axis-token.txt (lihat AXIS_TOKEN_FILE).")
        return
    cmd = args[0]
    c = AxisnetClient()
    if cmd == "keys":
        print(f"{'saltKey':24s} = {c.salt_key}")
        print(f"{'sharedKey':24s} = {c.tempest_shared_key}")
        for name, blob in list(APP_TEMPEST_BLOBS.items()) + [("apiKey", APP_API_KEY_BLOB)]:
            try:
                val = static_keys()[name]
            except TempestHandshakeUnavailable as e:
                print(f"{name:24s} = ({e})"); break
            print(f"{name:24s} = {val}")
            print(f"{'  (blob)':24s}   {blob}")
        print(f"{'cipher':24s} = {APP_CIPHER['algorithm']}/{APP_CIPHER['mode']}/"
              f"{APP_CIPHER['padding']}")
        print(f"{'X-API-KEY (blob)':24s} = {c.api_key_blob}")
        print(f"{'env':24s} = {'staging' if c.staging else 'prod'}"
              f"  app_version={c.app_version}")
    elif cmd == "handshake":
        hs = c.make_handshake()
        print("x-handshake =", hs)
        tok = c.auth_token or "null"
        hdr = c._tempest_headers("GET", AXIS_API["coin_profile"], None, handshake=hs)
        print("Authorization =", tok)
        print("x-signature   =", hdr["x-signature"])
        print("pesan         =", tempest_message_h("GET", "/v1/alifetime", "", tok, hs))
    elif cmd == "otp":
        if len(args) < 2:
            sys.exit("otp <nomor>  (contoh: otp 083812345678)")
        print("Kirim OTP ke", args[1], "(SMS nyata)...")
        print(json.dumps(c.request_otp(args[1]), indent=2, ensure_ascii=False))
    elif cmd == "login":
        if len(args) < 3:
            sys.exit("login <nomor> <kode-otp>")
        r = c.login_otp(args[1], args[2])
        print(json.dumps(r, indent=2, ensure_ascii=False))
        if c.auth_token:
            print("token tersimpan di client:", (c.auth_token or "")[:60], "…")
            print("cache token :", c.token_file)
        else:
            print("TIDAK ada token di respons — periksa error_message di atas")
    elif cmd == "token":
        print("token  :", (c.auth_token or "(kosong)")[:80], "…")
        print("sumber :", "env AXIS_AUTH_TOKEN" if os.environ.get("AXIS_AUTH_TOKEN")
              else f"cache {c.token_file}")
    elif cmd == "coin":
        print(json.dumps(c.get_coin_profile(), indent=2, ensure_ascii=False))
    elif cmd == "bonus":
        level = args[1] if len(args) > 1 else None
        print(json.dumps(c.list_bonus(level), indent=2, ensure_ascii=False))
    elif cmd == "products":
        if len(args) < 2:
            sys.exit("products <bonusId>   (contoh: products kenalan*bonus_quota)")
        print(json.dumps(c.bonus_products(args[1]), indent=2, ensure_ascii=False))
    elif cmd == "level":
        print(json.dumps(c.get_level_profile(), indent=2, ensure_ascii=False))
    elif cmd == "redeem":
        if len(args) < 2:
            sys.exit("redeem <productId> [productType] [merchantCode]")
        print(json.dumps(c.redeem(args[1], *args[2:4]), indent=2, ensure_ascii=False))
    else:
        sys.exit(f"perintah tidak dikenal: {cmd}")


if __name__ == "__main__":
    main()
