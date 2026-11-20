"""Fase 5 — cari produk Spotify di SEMUA level Alifetime + ambil detailnya.

    GET https://profile.api.axis.co.id/v2/alifetime/bonus?level=<level>
    GET https://profile.api.axis.co.id/v2/alifetime/bonus/<bonusId>

`bonusId` bentuknya `<level>*<tipe_bonus>` (mis. `kenalan*bonus_quota`) — dari
smali `getBonusAlifetimeDetail`: URL = getBonusAlifetimeUrl() + "/" + id.

Pakai: python3 fase5_find_bonus.py [kata-kunci]   (default: spotify)
"""
import sys
import os
import urllib.parse

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
import axisnet_api as A  # noqa: E402

KEY = (sys.argv[1] if len(sys.argv) > 1 else "spotify").lower()
LEVELS = ["kenalan", "temenan", "deketan", "jadian", "soulmate"]
c = A.AxisnetClient()
if not c.auth_token:
    sys.exit("tidak ada token — jalankan `login` dulu")


def get(url):
    return c._get(url, c._tempest_headers("GET", url, None, handshake=c.make_handshake()))


def items(node, out):
    """Semua dict yang punya (id, title) — grup bonus maupun produk."""
    if isinstance(node, dict):
        if node.get("id") and (node.get("title") or node.get("name")):
            out.append(node)
        for v in node.values():
            items(v, out)
    elif isinstance(node, list):
        for v in node:
            items(v, out)


hits = []
for lvl in LEVELS:
    url = A.AXIS_API["bonus_list"] + "?level=" + lvl
    data = (get(url) or {}).get("data") or {}
    found = []
    items(data, found)
    zero = [f for f in found if f.get("point") == 0]
    spot = [f for f in found if KEY in str(f).lower()]
    print(f"{lvl:9s} item={len(found):3d}  0-koin={len(zero):2d}  "
          f"'{KEY}'={len(spot)}")
    for f in spot:
        print(f"    GROUP {f.get('id')}  {f.get('title')!r} point={f.get('point')} "
              f"status={f.get('status')}")
        hits.append((lvl, f))
    for f in zero:
        print(f"    0c    {f.get('id')}  {f.get('title')!r}")

print(f"\n=== detail grup yang mengandung '{KEY}' ===")
for lvl, g in hits:
    bid = g["id"]
    url = A.AXIS_API["bonus_list"] + "/" + urllib.parse.quote(str(bid), safe="")
    d = (get(url) or {})
    print(f"\n-- {bid}  (status {d.get('status_code')} {d.get('error_message')})")
    dd = d.get("data")
    if isinstance(dd, dict):
        for k, v in dd.items():
            if isinstance(v, list) and v and isinstance(v[0], dict):
                print(f"   daftar {k!r}: {len(v)} item")
                for p in v:
                    print("     ", {kk: p.get(kk) for kk in
                                    ("id", "title", "name", "point", "type", "status",
                                     "service_id", "price_plan_code", "merchant_code",
                                     "product_type", "voucher_type", "quota")
                                    if kk in p})
            elif k in ("title", "subtitle", "type", "status", "point", "id"):
                print(f"   {k} = {v}")
    else:
        print("   data:", str(dd)[:300])
