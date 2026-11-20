"""Fase 5 — daftar bonus Alifetime + Cari produk Spotify 0 koin.

`GET https://profile.api.axis.co.id/v2/alifetime/bonus?level=<level>`
(`level` WAJIB — tanpanya server balas 500; `from` boleh tidak ada).
Level aktif dibaca dari `GET /v1/alifetime` (`data.current_level`).

Pakai: python3 fase5_bonus_list.py [level] [--grep spotify]
"""
import json
import os
import sys

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
import axisnet_api as A  # noqa: E402

c = A.AxisnetClient()
if not c.auth_token:
    sys.exit("tidak ada token — jalankan `login` dulu")

level = next((a for a in sys.argv[1:] if not a.startswith("--")), None)
if not level:
    lv = c.get_level_profile()
    level = (lv.get("data") or {}).get("current_level", "kenalan")
url = A.AXIS_API["bonus_list"] + "?level=" + level
out = c._get(url, c._tempest_headers("GET", url, None, handshake=c.make_handshake()))
data = out.get("data") or {}
print(f"level = {level}   status = {out.get('status_code')} {out.get('error_message')}")

groups, seen = [], {}


def walk(node, path=""):
    """Kumpulkan semua dict yang punya kunci `products` (grup bonus) & produknya."""
    if isinstance(node, dict):
        for k, v in node.items():
            walk(v, f"{path}.{k}" if path else k)
    elif isinstance(node, list):
        for i, v in enumerate(node):
            walk(v, f"{path}[{i}]")
    elif isinstance(node, dict):  # pragma: no cover
        pass


def collect(node, path=""):
    if isinstance(node, list):
        for i, v in enumerate(node):
            collect(v, f"{path}[{i}]")
        return
    if not isinstance(node, dict):
        return
    for k, v in node.items():
        collect(v, f"{path}.{k}" if path else k)
    if "id" in node and ("point" in node or "title" in node or "name" in node):
        seen[node.get("id", "?")] = (path, node)


collect(data)
print(f"grup/produk terkumpul: {len(seen)}\n")
for bid, (path, b) in seen.items():
    pt = b.get("point")
    title = b.get("title") or b.get("name") or ""
    prods = b.get("products") or []
    mark = " <<<" if "spotify" in (str(title) + str(bid)).lower() else ""
    print(f"  [{pt} COIN] {title!r:40s} id={bid}  type={b.get('type')} "
          f"status={b.get('status')}  produk={len(prods)}{mark}")
    for p in prods:
        if not isinstance(p, dict):
            continue
        pt2 = p.get("point", "?")
        t2 = p.get("title") or p.get("name") or ""
        hit = " <<<" if "spotify" in (str(t2) + str(p)).lower() else ""
        print(f"      [{pt2} COIN] {t2!r:34s} id={p.get('id')} "
              f"service_id={p.get('service_id')} price_plan_code={p.get('price_plan_code')} "
              f"type={p.get('type')} voucher={p.get('voucher_type')} "
              f"status={p.get('status')}{hit}")

if "--dump" in sys.argv:
    print("\n" + json.dumps(data, indent=1, ensure_ascii=False)[:6000])
