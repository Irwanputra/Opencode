"""Fase 5 — dump smali kelas tertentu dari semua DEX yang ada (androguard).

Pakai: python3 fase5_dump_class.py "Lcom/axis/net/ui/...;" ["pola2" ...]
Cocokan: akhiran nama kelas (case-sensitive) atau nama penuh dengan titik.
"""
import glob
import sys

from loguru import logger

logger.remove()

from androguard.core.dex import DEX  # noqa: E402

ROOT = "/tmp/opencode/axis/axis-koin/reverse-latest"
DEXES = sorted(
    glob.glob(f"{ROOT}/scratch-apk/classes*.dex")
    + glob.glob(f"{ROOT}/extract/axis/dex/classes*.dex")
    + glob.glob(f"{ROOT}/extract/myxl/dex/classes*.dex")
    + glob.glob(f"{ROOT}/fase3/tmp*.dex")
)

cache = []
for path in DEXES:
    try:
        cache.append((path.split("/")[-1], DEX(open(path, "rb").read())))
    except Exception as e:  # noqa: BLE001
        print(f"# skip {path}: {e}", file=sys.stderr)

for want in sys.argv[1:]:
    hit = False
    for tag, d in cache:
        for cls in d.get_classes():
            cn = cls.get_name()
            if cn.endswith(want) or cn.replace("/", ".") == want:
                print(f"\n##### {cn}  [{tag}]  super={cls.get_superclassname()}")
                for f in cls.get_fields():
                    try:
                        ann = ",".join(
                            a.get_type().split("/")[-1].rstrip(";")
                            for a in f.get_annotations().get_annotations()
                        )
                    except Exception:  # noqa: BLE001
                        ann = "?"
                    print(f"  field {f.get_name()} : {f.get_descriptor()} @ {ann}")
                for m in cls.get_methods():
                    print(f"\n### {m.get_name()} {m.get_descriptor()} access={m.get_access_flags_string()}")
                    code = m.get_code()
                    if code is None:
                        print("  (no code - abstract/native)"); continue
                    try:
                        for ins in code.get_bc().get_instructions():
                            print(f"  {ins.get_name():28s} {ins.get_output()}")
                    except Exception as e:  # noqa: BLE001
                        print(f"  (bc err {e})")
                hit = True
    if not hit:
        print(f"\n##### {want}: TIDAK DITEMUKAN di {len(cache)} DEX", file=sys.stderr)
