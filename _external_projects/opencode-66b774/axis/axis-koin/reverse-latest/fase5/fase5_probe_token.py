"""Fase 5 — probe token login NYATA ke semua host Alifetime.

Token dari `POST /otplogin/v2` = `data.token` (UUID, pesan "generate new token").
Pertanyaan yang dijawab script ini: apakah host points/profile/order/flashwar
menganggap UUID itu sesi sah, dan apakah cara mengirim Authorization
(`Bearer <uuid>` vs polos) berpengaruh. Endpoint `profile/v1/alifetime`
dipakai sebagai kontrol karena menurut smali (`getLevelAlifetime`) ia TIDAK
pakai interceptor HMAC — hanya `x-app-version` + `Authorization`.

Pakai: python3 fase5_probe_token.py
"""
import json
import os
import sys
import urllib.error
import urllib.request

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
import axisnet_api as A  # noqa: E402

TOKEN = A.load_cached_token()
if not TOKEN:
    sys.exit("tidak ada token di cache — jalankan `login` dulu")
RAW = TOKEN.removeprefix("Bearer ").strip()

UJI = [
    ("level_profile", "no-hmac"),
    ("coin_profile", "hmac"),
    ("coin_point_v2", "hmac"),
    ("bonus_list", "hmac"),
    ("bonus_voucher", "hmac"),
    ("flashwar_info", "hmac"),
]


def call(url, hdr):
    hdr = dict(hdr)
    hdr.setdefault("User-Agent", A.APP_USER_AGENT)
    hdr.setdefault("Connection", "keep-alive")
    req = urllib.request.Request(url, headers=hdr, method="GET")
    try:
        with urllib.request.urlopen(req, timeout=30) as r:
            return r.status, r.read().decode()
    except urllib.error.HTTPError as e:
        return e.code, e.read().decode()
    except Exception as e:  # noqa: BLE001
        return "ERR", repr(e)[:150]


c = A.AxisnetClient()
c.auth_token = TOKEN
print(f"token cache = {TOKEN[:26]}…")
print(f"msisdn uji  = 083135486619\n")

for authname, auth in [("dengan 'Bearer '", TOKEN), ("polos (tanpa Bearer)", RAW)]:
    c.auth_token = auth
    print(f"### Authorization: {authname}")
    for key, mode in UJI:
        url = A.AXIS_API[key]
        hs = c.make_handshake()
        if mode == "no-hmac":
            hdr = {"Authorization": auth, "x-app-version": c.app_version}
        else:
            hdr = c._tempest_headers("GET", url, None, handshake=hs)
        st, txt = call(url, hdr)
        one = " ".join(txt.split())
        print(f"  {key:14s} {mode:8s} -> {st} {one[:120]}")
    print()
