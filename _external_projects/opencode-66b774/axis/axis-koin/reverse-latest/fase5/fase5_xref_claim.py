"""Fase 5 — xref: siapa yang membangun body redeem `Ld6/a;` dan field apa yang diisi.

Cari semua method yang memanggil
  Ld6/a;-><init>(Ljava/lang/String; Ljava/lang/String; Ljava/lang/String;)V
  Lcom/axis/net/api/AxisnetApiServices;->alifetimeClaimBonus(
lalu tampilkan 40 instruksi di sekitarnya supaya kelihatan pemetaan
productId / productType / merchantCode dari model bonus (service_id / type /
merchant_code).

Pakai: python3 fase5_xref_claim.py
"""
import glob
import re

from loguru import logger

logger.remove()

from androguard.core.dex import DEX  # noqa: E402

ROOT = "../"
DEXES = sorted(
    glob.glob(f"{ROOT}scratch-apk/classes*.dex")
    + glob.glob(f"{ROOT}extract/axis/dex/classes*.dex")
    + glob.glob(f"{ROOT}fase3/tmp*.dex")
)
NEEDLE = re.compile(r"(Ld6/a;-><init>|alifetimeClaimBonus|claimBonusAlifetime|getBonusAlifetimeDetail)")

seen = set()
for path in DEXES:
    tag = path.split("/")[-1]
    try:
        d = DEX(open(path, "rb").read())
    except Exception:  # noqa: BLE001
        continue
    for cls in d.get_classes():
        name = cls.get_name()
        if not re.search(r"alifetime|bonus|claim|reward", name, re.I):
            continue
        for m in cls.get_methods():
            code = m.get_code()
            if code is None:
                continue
            try:
                outs = [f"{i.get_name()} {i.get_output()}"
                        for i in code.get_bc().get_instructions()]
            except Exception:  # noqa: BLE001
                continue
            for idx, o in enumerate(outs):
                if not NEEDLE.search(o):
                    continue
                key = (tag, name, m.get_name(), idx)
                if key in seen:
                    continue
                seen.add(key)
                print(f"\n### {name}.{m.get_name()}  [{tag}]  idx={idx}")
                print(f"    {o}")
                lo = max(0, idx - 22)
                for j in range(lo, min(len(outs), idx + 6)):
                    mark = "  >>" if j == idx else "    "
                    print(f"  {mark} {outs[j]}")
                break
