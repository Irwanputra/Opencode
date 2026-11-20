"""Fase 5 — cross-reference: kelas mana saja yang memanggil method tertentu.

Pakai: python3 fase5_xref.py "decryptResponse" ["encryptSSO" ...]
Cocokan: nama method di dalam opcode invoke-* (string match, cepat).
"""
import glob
import sys

from loguru import logger

logger.remove()

from androguard.core.dex import DEX  # noqa: E402

ROOT = "../"
DEXES = sorted(
    glob.glob(f"{ROOT}/scratch-apk/classes*.dex")
    + glob.glob(f"{ROOT}/extract/axis/dex/classes*.dex")
    + glob.glob(f"{ROOT}/fase3/tmp*.dex")
)

wants = sys.argv[1:]
cache = []
for path in DEXES:
    try:
        cache.append((path.split("/")[-1], DEX(open(path, "rb").read())))
    except Exception as e:  # noqa: BLE001
        print(f"# skip {path}: {e}", file=sys.stderr)

for want in wants:
    print(f"\n##### pemanggil `{want}`")
    seen = set()
    for tag, d in cache:
        for cls in d.get_classes():
            cn = cls.get_name()
            for m in cls.get_methods():
                code = m.get_code()
                if code is None:
                    continue
                try:
                    b = str(code.get_bc().get_raw())
                except Exception:  # noqa: BLE001
                    continue
                if want in b:
                    key = (cn, m.get_name())
                    if key not in seen:
                        seen.add(key)
                        print(f"  {cn}.{m.get_name()}  [{tag}]")
