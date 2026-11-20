"""Fase 5 — probe query yang WAJIB ada di endpoint bonus/voucher Alifetime.

Dari anotasi Retrofit (`fase4/api-annotations2.json`):

    getAlifetimeBonus          GET @Url?level=..&from=..   (Authorization, x-app-version)
    getAlifetimeBonusProfiling GET @Url?level=..&from=..
    getPointProfile            GET @Url?level=..
    getAlifetimeVoucher/Detail GET @Url                    (tanpa query)

Tanpa `level`/`from`, server membalas 500 "Terjadi kesalahan pada server" —
bukan error signature. Script ini mencari bentuk `from` yang diterima
(pakai level dari `GET /v1/alifetime` = `kenalan`).

Pakai: python3 fase5_probe_bonus_query.py
"""
import os
import sys
import urllib.error
import urllib.parse
import urllib.request

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
import axisnet_api as A  # noqa: E402

TOKEN = A.load_cached_token()
if not TOKEN:
    sys.exit("tidak ada token di cache — jalankan `login` dulu")
LEVEL = "kenalan"
TODAY = "2026-11-21"
CANDIDATES = [
    {"level": LEVEL, "from": TODAY},
    {"level": LEVEL, "from": "2026-11-01"},
    {"level": LEVEL, "from": "2025-09-28"},
    {"level": LEVEL, "from": "0"},
    {"level": LEVEL},
    {"from": TODAY},
    {},
]
HOSTS = [
    ("bonus_v2", A.AXIS_API["bonus_list"]),
    ("bonus_v1", A.AXIS_API["bonus_list_v1"]),
    ("profiling", "https://profile.api.axis.co.id/v2/alifetime/bonus/profiling"),
    ("point_v2", A.AXIS_API["coin_point_v2"]),
    ("voucher_v2", A.AXIS_API["bonus_voucher"]),
    ("membership", "https://profile.api.axis.co.id/v1/alifetime/membership"),
]


def get(url, hdr):
    hdr = dict(hdr, **{"User-Agent": A.APP_USER_AGENT, "Connection": "keep-alive"})
    try:
        with urllib.request.urlopen(urllib.request.Request(url, headers=hdr), timeout=25) as r:
            return r.status, r.read().decode()
    except urllib.error.HTTPError as e:
        return e.code, e.read().decode()
    except Exception as e:  # noqa: BLE001
        return "ERR", repr(e)[:120]


c = A.AxisnetClient()
c.auth_token = TOKEN
for name, base in HOSTS:
    for q in CANDIDATES:
        url = base + ("?" + urllib.parse.urlencode(q) if q else "")
        hs = c.make_handshake()
        hdr = c._tempest_headers("GET", url, None, handshake=hs)
        st, txt = get(url, hdr)
        one = " ".join(txt.split())
        flag = "" if st == 200 else "   <-- bukan 200"
        print(f"{name:11s} {str(q):40s} -> {st} {one[:80]}{flag}")
        if st == 200:
            break
    print()
