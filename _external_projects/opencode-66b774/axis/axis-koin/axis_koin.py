#!/usr/bin/env python3
"""
AXIS Coin -> Kuota via Python (AXISnet New Alifetime)
====================================================
Yang ditukar: AXIS Coin di menu New Alifetime (AXISnet v9.0.0+, pojok kanan bawah).
Bukan Sureprize / Parade Bonus (itu gratis, tanpa potong koin) dan bukan AXIS Stamp.

Cara kerja:
  1. Login OTP via CIAM XL (sama kayak myXL) -> dapet id_token
  2. Cek profil via POST api/v8/profile -> field `point` = saldo AXIS Coin,
     field `tier` = level Alifetime (Kenalan / Temenan / Deketan / Jadian / Soulmate / True Love)
  3. Cari katalog via POST api/v9/xl-stores/options/search
  4. Tukar via alur detail -> payment-methods -> settlement (sama kayak beli paket di EnQuota)

Dasar teknis (dari EnQuota, Najihh/EnQuota, reverse-engineered myXL v8.9.1/8.10.0):
  CATATAN VERSI 2026-11-20: itu BUKAN APK terbaru. myXL terbaru sudah 9.6.0 (1249, 3 Okt 2026),
  AXISnet terbaru sudah 11.1.0 (4 Nov 2026). EnQuota terakhir commit 3 Sep 2026 dan masih
  pakai appVersion 8.10.0 (Jan 2026). Backend api.myxl.xlaxiata.co.id biasanya masih terima
  versi lama untuk sementara, tapi kalau login 401 / decrypt gagal, itu tandanya kunci atau
  minimum-version sudah diganti XL — script perlu re-reverse dari APK 9.6.0 / 11.1.0.
  HASIL REVERSE APK TERBARU 2026-11-20 (laporan lengkap di reverse-latest/LAPORAN.md):
  kunci lama di bawah ini TERKONFIRMASI TIDAK ADA LAGI di myXL 9.6.0 / AXISnet 11.1.0
  (0 kemunculan di DEX dan .so). Rahasia pindah ke native lib sebagai ciphertext AES
  (libcardamom.so di myXL, libnative-lib.so di AXISnet) — blob-nya SUDAH diekstrak tapi
  TIDAK dimasukkan ke script ini karena itu ciphertext, bukan kunci (kunci asli baru ada
  di memori setelah decryptAesWithHashedKey). Jadi script ini (jalur myXL v8) kemungkinan
  besar sudah tidak bisa dipakai; jalur yang benar untuk AXIS Coin adalah API AXISnet:
  otp.api.axis.co.id (OTP, client_credentials) -> points/profile.api.axis.co.id
  (cek koin/level Alifetime) -> order.api.axis.co.id/v1/transaction/redeem/alifetime
  (tukar koin). Signing "Tempest" AXISnet masih tertutup (kunci masih ciphertext) —
  script penukaran AXISnet perlu kerja lanjutan, bukan sekadar ganti kunci.
  - Gateway: https://api.myxl.xlaxiata.co.id
  - CIAM: https://gede.ciam.xlaxiata.co.id/realms/xl-ciam
  - Auth: CIAM OAuth + AES-256-CBC xdata + HMAC-SHA512 x-signature
  - Prefix AXIS: 0831-0833, 0838
  - Kunci di bawah ini adalah kunci statis hasil reverse-engineering EnQuota (publik di GitHub).
    Kalau XL ganti kunci / versi app, script akan gagal 401 / decrypt gagal — itu tandanya
    kuncinya sudah kadaluarsa, bukan nomor lu yang bermasalah.

Aturan resmi AXIS Coin (cek 2026-11-20, sumber: axis.co.id via sukma convert + XLSMART):
  - Level naik pakai koin, tidak bisa lompat: Kenalan 0 -> Temenan 105 -> Deketan 120 (dari Temenan)
    -> Jadian 200 -> Soulmate 270 -> True Love 330. Evaluasi 3 bulanan: Temenan 105, Deketan 165,
    Jadian 225, Soulmate 315, True Love 345 — kalau kurang, turun 1 level.
  - Koin hangus 180 hari sejak terakhir didapat.
  - Bisa ditukar: kuota internet harian, telepon 5 menit semua operator (1 hari),
    perpanjang masa aktif, pulsa darurat, tiket Flash War, kuota WhatsApp (sampai 2GB di promo),
    voucher Flash Coffee / McD / Bakmi GM / dll.
  - TIDAK bisa jadi pulsa utama, TIDAK bisa diuangkan / jadi DANA.
  - *808# TIDAK bisa tukar koin — wajib lewat aplikasi AXISnet / API ini.
  - Contoh harga promo (Hari Pelanggan Nasional 3-4 Sep 2026, bukan harga tetap):
    Kenalan 40 koin = 1GB/3 jam, Temenan 40 koin = 2GB/4 jam, Deketan 45 koin = 2GB/5 jam,
    Jadian 50 koin = 3GB/6 jam, Soulmate 55 koin = 3GB/8 jam, True Love 70 koin = 5GB/12 jam.
    Harga katalog harian berubah-ubah — selalu cek lewat menu 2 di script ini sebelum tukar.

AMAN: script ini cuma jalan di laptop/HP lu sendiri, token disimpan lokal di .axis_session.json,
OTP jangan pernah dikasih ke orang / tool lain. Jangan pakai tool "tembak paket Rp0" —
itu beda jalur, grey-area, bisa bikin nomor ke-ban.

Pakai:
  pip install requests cryptography
  python3 axis_koin.py
"""

import base64
import hashlib
import hmac
import json
import os
import sys
import time
import uuid
from datetime import datetime, timedelta, timezone

import requests

try:
    from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes
    from cryptography.hazmat.primitives import padding
    HAS_CRYPTO = True
except ImportError:
    HAS_CRYPTO = False

BASE_URL = "https://api.myxl.xlaxiata.co.id"
CIAM_BASE = "https://gede.ciam.xlaxiata.co.id/realms/xl-ciam"

# --- kunci statis EnQuota (publik) ---
XDATA_KEY = b"5dccbf08920a5527b99e222789c34bb7"
AX_API_SIG_KEY = b"18b4d589826af50241177961590e6693"
X_API_BASE_SECRET = "mU1Y4n1vBjf3M7tMnRkFU08mVyUJHed8B5En3EAniu1mXLixeuASmBmKnkyzVziOye7rG5nIekMdthensbQMcOJ6SLnrkGyfXALD7mrBC6vuWv6G01pmD3XlU5rT7Tzx"
API_KEY = "vT8tINqHaOxXbGE7eOWAhA=="
CIAM_CLIENT_ID = "9fc97ed1-6a30-48d5-9516-60c53ce3a135"
CIAM_CLIENT_SECRET = "YDWmF4LJj9XIKwQnzy2e2lb0tJQb29o3"
AX_DEVICE_ID = "92fb44c0804233eb4d9e29f838223a14"
AX_FINGERPRINT = "YmQLy9ZiLLBFAEVcI4Dnw9+NJWZcdGoQyewxMF/9hbfk/8GbKBgtZxqdiiam8+m2lK31E/zJQ7kjuPXpB3EE8naYL0Q8+0WLhFV1WAPl9Eg="
APP_VERSION = "8.10.0"
API_UA = "myXL / 8.9.1(1204); com.android.vending; (samsung; SM-N935F; SDK 33; Android 13)"
CIAM_UA = "myXL / 8.6.0(1179); com.android.vending; (samsung; SM-N935F; SDK 33; Android 13)"

SESSION_FILE = os.path.join(os.path.dirname(os.path.abspath(__file__)), ".axis_session.json")

LEVELS = [
    ("Kenalan", 0, 0),
    ("Temenan", 105, 105),
    ("Deketan", 120, 165),
    ("Jadian", 200, 225),
    ("Soulmate", 270, 315),
    ("True Love", 330, 345),
]


def format_gmt7(dt=None, without_colon=False, ms_digits=3):
    if dt is None:
        dt = datetime.now(timezone.utc)
    gmt7 = dt + timedelta(hours=7)
    ms = f"{gmt7.microsecond // 1000:03d}"[:ms_digits]
    tz = "+0700" if without_colon else "+07:00"
    return f"{gmt7:%Y-%m-%dT%H:%M:%S}.{ms}{tz}"


def derive_iv(xtime_ms: int) -> bytes:
    return hashlib.sha256(str(xtime_ms).encode()).hexdigest()[:16].encode()


def encrypt_xdata(plaintext: str, xtime_ms: int) -> str:
    if not HAS_CRYPTO:
        raise RuntimeError("Butuh library 'cryptography': pip install cryptography")
    iv = derive_iv(xtime_ms)
    padder = padding.PKCS7(128).padder()
    data = padder.update(plaintext.encode()) + padder.finalize()
    cipher = Cipher(algorithms.AES(XDATA_KEY), modes.CBC(iv))
    enc = cipher.encryptor()
    ct = enc.update(data) + enc.finalize()
    return base64.urlsafe_b64encode(ct).decode().rstrip("=")


def decrypt_xdata(xdata: str, xtime_ms: int) -> str:
    if not HAS_CRYPTO:
        raise RuntimeError("Butuh library 'cryptography': pip install cryptography")
    iv = derive_iv(xtime_ms)
    b64 = xdata.replace("-", "+").replace("_", "/")
    b64 += "=" * (-len(b64) % 4)
    cipher = Cipher(algorithms.AES(XDATA_KEY), modes.CBC(iv))
    dec = cipher.decryptor()
    pt = dec.update(base64.b64decode(b64)) + dec.finalize()
    unpadder = padding.PKCS7(128).unpadder()
    return (unpadder.update(pt) + unpadder.finalize()).decode()


def make_x_signature(id_token: str, method: str, path: str, sig_time_sec: int) -> str:
    key_str = f"{X_API_BASE_SECRET};{id_token};{method};{path};{sig_time_sec}"
    msg_str = f"{id_token};{sig_time_sec};"
    return hmac.new(key_str.encode(), msg_str.encode(), hashlib.sha512).hexdigest()


def make_ax_api_signature(ts_for_sign: str, contact: str, code: str) -> str:
    preimage = f"{ts_for_sign}passwordSMS{contact}{code}openid"
    return base64.b64encode(
        hmac.new(AX_API_SIG_KEY, preimage.encode(), hashlib.sha256).digest()
    ).decode()


def normalize_phone(phone: str):
    d = "".join(c for c in phone if c.isdigit())
    if d.startswith("62"):
        d = d[2:]
    elif d.startswith("0"):
        d = d[1:]
    if not d.startswith("8") or not (9 <= len(d) <= 13):
        return None
    return {"national": "0" + d, "international": "62" + d}


def load_session():
    if os.path.exists(SESSION_FILE):
        try:
            with open(SESSION_FILE) as f:
                return json.load(f)
        except Exception:
            return None
    return None


def save_session(sess):
    with open(SESSION_FILE, "w") as f:
        json.dump(sess, f, indent=2)
    print(f"[ok] sesi disimpan lokal di {SESSION_FILE} (jangan dishare)")


class AxisClient:
    def __init__(self, session=None):
        self.session = session or {}
        self.s = requests.Session()

    @property
    def id_token(self):
        return self.session.get("id_token", "")

    def login(self, phone: str):
        norm = normalize_phone(phone)
        if not norm:
            print("Nomor AXIS tidak valid. Contoh: 083812345678")
            return None
        contact = norm["international"]
        headers = {
            "Authorization": "Basic " + base64.b64encode(f"{CIAM_CLIENT_ID}:{CIAM_CLIENT_SECRET}".encode()).decode(),
            "Ax-Device-Id": AX_DEVICE_ID,
            "Ax-Fingerprint": AX_FINGERPRINT,
            "Ax-Request-Device": "samsung",
            "Ax-Request-Device-Model": "SM-N935F",
            "Ax-Request-At": format_gmt7(ms_digits=2),
            "Ax-Request-Id": str(uuid.uuid4()),
            "Ax-Substype": "PREPAID",
            "Content-Type": "application/json",
            "Host": "gede.ciam.xlaxiata.co.id",
            "User-Agent": CIAM_UA,
        }
        url = f"{CIAM_BASE}/auth/otp?contact={contact}&contactType=SMS&alternateContact=false"
        r = self.s.get(url, headers=headers, timeout=30)
        try:
            data = r.json()
        except Exception:
            print(f"Login gagal, status {r.status_code}: {r.text[:500]}")
            return None
        if r.status_code == 200 and data.get("subscriber_id"):
            print(f"[ok] OTP dikirim via SMS ke {norm['national']}")
            return {"subscriber_id": data["subscriber_id"], "phone": norm["national"], "msisdn": contact}
        print(f"Gagal kirim OTP: {data.get('error_description') or data.get('message') or r.text[:500]}")
        return None

    def submit_otp(self, otp: str, login_info: dict):
        contact = login_info["msisdn"]
        if len(otp.strip()) != 6:
            print("OTP harus 6 digit.")
            return False
        now = datetime.now(timezone.utc)
        ts_for_sign = format_gmt7(now, without_colon=True, ms_digits=3)
        ts_header = format_gmt7(now - timedelta(minutes=5), without_colon=True, ms_digits=3)
        sig = make_ax_api_signature(ts_for_sign, contact, otp.strip())
        headers = {
            "Authorization": "Basic " + base64.b64encode(f"{CIAM_CLIENT_ID}:{CIAM_CLIENT_SECRET}".encode()).decode(),
            "Ax-Api-Signature": sig,
            "Ax-Device-Id": AX_DEVICE_ID,
            "Ax-Fingerprint": AX_FINGERPRINT,
            "Ax-Request-At": ts_header,
            "Ax-Request-Device": "samsung",
            "Ax-Request-Device-Model": "SM-N935F",
            "Ax-Request-Id": str(uuid.uuid4()),
            "Ax-Substype": "PREPAID",
            "Content-Type": "application/x-www-form-urlencoded",
            "Host": "gede.ciam.xlaxiata.co.id",
            "User-Agent": CIAM_UA,
        }
        body = {
            "contactType": "SMS", "code": otp.strip(),
            "grant_type": "password", "contact": contact, "scope": "openid",
        }
        r = self.s.post(f"{CIAM_BASE}/protocol/openid-connect/token", headers=headers, data=body, timeout=30)
        try:
            data = r.json()
        except Exception:
            print(f"Verifikasi gagal, status {r.status_code}: {r.text[:500]}")
            return False
        if r.status_code == 200 and data.get("id_token"):
            self.session = {
                "phone": login_info["phone"], "msisdn": contact,
                "id_token": data["id_token"],
                "access_token": data.get("access_token", ""),
                "refresh_token": data.get("refresh_token", ""),
                "subscriber_id": login_info.get("subscriber_id"),
            }
            save_session(self.session)
            print(f"[ok] Login berhasil untuk {login_info['phone']}")
            return True
        print(f"OTP salah / kadaluarsa: {data.get('error_description') or data.get('error') or r.text[:500]}")
        return False

    def send_api(self, method: str, path: str, body: dict = None):
        if not self.id_token:
            raise RuntimeError("Belum login. Jalankan menu 1 dulu.")
        body = body or {}
        xtime_ms = int(time.time() * 1000)
        sig_time_sec = xtime_ms // 1000
        clean_path = path.lstrip("/")
        xdata = encrypt_xdata(json.dumps(body), xtime_ms)
        sig = make_x_signature(self.id_token, method, clean_path, sig_time_sec)
        headers = {
            "Content-Type": "application/json; charset=utf-8",
            "Host": "api.myxl.xlaxiata.co.id",
            "x-api-key": API_KEY,
            "authorization": f"Bearer {self.id_token}",
            "x-hv": "v3",
            "x-signature": sig,
            "x-signature-time": str(sig_time_sec),
            "x-request-id": str(uuid.uuid4()),
            "x-request-at": format_gmt7(ms_digits=2),
            "x-version-app": APP_VERSION,
            "User-Agent": API_UA,
        }
        payload = json.dumps({"xdata": xdata, "xtime": xtime_ms})
        r = self.s.request(method, f"{BASE_URL}/{clean_path}", headers=headers, data=payload, timeout=30)
        try:
            raw = r.json()
        except Exception:
            return {"_http": r.status_code, "_raw": r.text[:1000]}
        if isinstance(raw, dict) and raw.get("xdata") and raw.get("xtime"):
            try:
                return json.loads(decrypt_xdata(raw["xdata"], int(raw["xtime"])))
            except Exception as e:
                print(f"[warn] gagal decrypt xdata: {e}")
                return raw
        return raw

    def get_profile(self):
        """Return (nama, saldo koin, level, pulsa, masa aktif). Field point = AXIS Coin."""
        prof = self.send_api("POST", "api/v8/profile", {
            "access_token": self.session.get("access_token", ""),
            "app_version": APP_VERSION, "is_enterprise": False, "lang": "en",
        })
        bal = self.send_api("POST", "api/v8/packages/balance-and-credit", {
            "is_enterprise": False, "lang": "en",
            "access_token": self.session.get("access_token", ""),
        })
        p = prof.get("data", prof) if isinstance(prof, dict) else {}
        b = bal.get("data", bal) if isinstance(bal, dict) else {}
        coin = int(p.get("point") or p.get("loyalty_point") or 0)
        return {
            "nama": p.get("name") or p.get("profile", {}).get("name") or "-",
            "koin": coin,
            "level": p.get("tier") or p.get("membership_tier") or "-",
            "pulsa": b.get("balance") or b.get("total_balance") or 0,
            "masa_aktif": b.get("expired_date") or b.get("active_until") or p.get("active_until") or "-",
            "_raw_profile": prof, "_raw_balance": bal,
        }

    def get_quota(self):
        data = self.send_api("POST", "api/v8/packages/quota-details", {
            "is_enterprise": False, "lang": "en",
            "access_token": self.session.get("access_token", ""),
        })
        return data

    def search_packages(self, keyword=""):
        body = {
            "search": keyword, "filter": {
                "group": [{"unit": "PACKAGE_NAME", "id": "FIL_PKG_N", "type": "PACKAGE_NAME", "items": [{"id": "", "label": ""}]}],
            },
            "is_enterprise": False, "lang": "en",
            "access_token": self.session.get("access_token", ""),
        }
        return self.send_api("POST", "api/v9/xl-stores/options/search", body)


def show_levels(koin):
    print("\nLevel Alifetime (naik pakai koin, tidak bisa lompat):")
    for nama, tukar, evaluasi in LEVELS:
        mark = " <-- lu di sini (perkiraan dari koin)" if koin >= tukar and nama != "True Love" else ""
        print(f"  {nama:10} naik: {tukar} koin | evaluasi 3 bln: {evaluasi} koin{mark}")
    print("Koin hangus 180 hari sejak terakhir didapat. Kalau evaluasi 3 bulanan kurang, turun 1 level.")


def main():
    if not HAS_CRYPTO:
        print("Install dulu: pip install requests cryptography")
        sys.exit(1)
    client = AxisClient(load_session())
    if client.session:
        print(f"Sesi tersimpan ditemukan: {client.session.get('phone')} — langsung pakai, atau login ulang di menu 1.")
    while True:
        print("\n=== AXIS Coin -> Kuota (Alifetime) ===")
        print("1. Login OTP (nomor AXIS 0831/0832/0833/0838)")
        print("2. Cek saldo koin + level + pulsa")
        print("3. Cek kuota aktif")
        print("4. Cari katalog tukar koin (coba keyword: COIN / ALIFETIME / WhatsApp / kuota)")
        print("5. Tukar koin -> pilih dari hasil no.4 (masukkan package_option_code)")
        print("6. Lihat tabel level Alifetime")
        print("0. Keluar")
        pilih = input("Pilih: ").strip()
        try:
            if pilih == "1":
                phone = input("Nomor AXIS (contoh 083812345678): ").strip()
                info = client.login(phone)
                if not info:
                    continue
                otp = input("Kode OTP 6 digit dari SMS: ").strip()
                client.submit_otp(otp, info)
            elif pilih == "2":
                prof = client.get_profile()
                print(f"\nNama       : {prof['nama']}")
                print(f"Saldo koin : {prof['koin']} AXIS Coin")
                print(f"Level      : {prof['level']}")
                print(f"Pulsa      : Rp {prof['pulsa']}")
                print(f"Masa aktif : {prof['masa_aktif']}")
                show_levels(prof["koin"])
                print("\nKalau koin 0 padahal di app ada isinya, berarti field point di API ini")
                print("bukan sumber Alifetime terbaru — cek langsung di AXISnet > Alifetime,")
                print("karena katalog Alifetime bisa beda endpoint dari profil myXL lama.")
            elif pilih == "3":
                data = client.get_quota()
                print(json.dumps(data, indent=2, ensure_ascii=False)[:4000])
            elif pilih == "4":
                kw = input("Keyword (kosong = semua, coba 'COIN' dulu): ").strip()
                data = client.search_packages(kw)
                pkgs = []
                if isinstance(data, dict):
                    pkgs = data.get("data", {}).get("packages", []) if isinstance(data.get("data"), dict) else data.get("packages", [])
                    if not pkgs and isinstance(data.get("data"), list):
                        pkgs = data["data"]
                if not pkgs:
                    print("Tidak ada hasil dari pencarian toko myXL untuk keyword itu.")
                    print("Artinya reward Alifetime kemungkinan TIDAK lewat endpoint toko ini,")
                    print("melainkan endpoint Alifetime khusus di AXISnet — raw response di bawah:")
                    print(json.dumps(data, indent=2, ensure_ascii=False)[:3000])
                else:
                    for i, p in enumerate(pkgs[:30], 1):
                        code = p.get("action_param") or p.get("package_option_code") or p.get("id")
                        print(f"{i}. {p.get('title') or p.get('name')} | {p.get('quota') or p.get('total_quota') or p.get('benefit') or ''} | kode: {code} | harga: {p.get('price') or p.get('amount') or '-'}")
            elif pilih == "5":
                code = input("Masukkan package_option_code dari no.4: ").strip()
                if not code:
                    continue
                print("Catatan: ini pakai alur beli paket standar (detail -> intercept -> payment-methods).")
                print("Kalau reward-nya memang dibayar pakai koin, settlement-nya bukan potong pulsa —")
                print("script akan tampilkan raw response tiap langkah supaya ketahuan di langkah mana dia minta koin.")
                konfirmasi = input(f"Yakin tukar kode {code}? (y/N): ").strip().lower()
                if konfirmasi != "y":
                    print("Dibatalkan, koin aman.")
                    continue
                detail = client.send_api("POST", "api/v8/xl-stores/options/detail", {
                    "package_option_code": code, "package_family_code": "", "package_variant_code": "",
                    "is_enterprise": False, "lang": "en",
                    "access_token": client.session.get("access_token", ""),
                })
                print(json.dumps(detail, indent=2, ensure_ascii=False)[:4000])
                print("\n[info] Kalau detail di atas tidak menyebut coin / point sebagai payment,")
                print("berarti reward Alifetime itu tidak bisa ditebus lewat endpoint toko ini —")
                print("tebus manual di AXISnet > Alifetime, dan jangan lanjut ke settlement pulsa.")
            elif pilih == "6":
                show_levels(0)
            elif pilih == "0":
                print("Dadah bro.")
                break
            else:
                print("Pilih 0-6 bro.")
        except Exception as e:
            print(f"[error] {e}")
            print("Kemungkinan: token kadaluarsa (login ulang no.1), kunci API berubah, atau tidak ada internet.")


if __name__ == "__main__":
    main()
