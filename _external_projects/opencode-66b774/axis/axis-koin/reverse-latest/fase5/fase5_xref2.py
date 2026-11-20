"""Fase 5 — cari call-site sebuah method dengan membaca hasil render instruction.

Bedanya dengan fase5_xref.py: xref pakai `bc.get_raw()` yang TIDAK memuat nama
method (jadi selalu meleset). Di sini tiap instruction di-render lewat
`get_output()` lalu di-cocokkan — lebih lambat, tapi benar.

Pakai: python3 fase5_xref2.py "decryptResponse" ["Lcom/axis/net/helper/CryptoTool;"]
"""
import glob
import sys

from loguru import logger

logger.remove()

from androguard.core.dex import DEX  # noqa: E402

ROOT = "../"
DEXES = sorted(
    glob.glob(f"{ROOT}scratch-apk/classes*.dex")
    + glob.glob(f"{ROOT}extract/axis/dex/classes*.dex")
    + glob.glob(f"{ROOT}fase3/tmp*.dex")
)

want = sys.argv[1]
cache = []
for path in DEXES:
    try:
        cache.append((path.split("/")[-1], DEX(open(path, "rb").read())))
    except Exception as e:  # noqa: BLE001
        print(f"# skip {path}: {e}", file=sys.stderr)

print(f"##### call-site `{want}`")
seen = set()
for tag, d in cache:
    for cls in d.get_classes():
        cn = cls.get_name()
        for m in cls.get_methods():
            if m.get_code() is None:
                continue
            try:
                ins_list = m.get_code().get_bc().get_instructions()
                hits = [i.get_output() for i in ins_list if want in i.get_output()]
            except Exception:  # noqa: BLE001
                continue
            if hits and (cn, m.get_name()) not in seen:
                seen.add((cn, m.get_name()))
                print(f"\n  ## {cn}.{m.get_name()}  [{tag}]")
                for h in hits:
                    print(f"     {h}")
