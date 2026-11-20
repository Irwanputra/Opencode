import os, glob, logging, json
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
outdir="/home/hatch/workspace/axis-koin/reverse-latest/fase4"
dexes={}
for p in sorted(glob.glob(base+"/tmp*.dex")):
    dexes[os.path.basename(p)]=DEX(open(p,'rb').read())

def find_class(name_sub):
    for fn,dex in dexes.items():
        for c in dex.get_classes():
            if name_sub in c.get_name():
                return fn, c
    return None, None

def dump(name_sub, outfile):
    fn, cls = find_class(name_sub)
    if cls is None:
        print("NOT FOUND", name_sub); return
    lines=[f"# {cls.get_name()} in {fn}", f"super: {cls.get_superclassname()}"]
    lines.append("## fields")
    for f in cls.get_fields():
        lines.append(f"  {f.get_name()} : {f.get_descriptor()}")
    lines.append("## methods")
    for m in cls.get_methods():
        lines.append(f"\n### {m.get_name()} {m.get_descriptor()} access={m.get_access_flags_string()}")
        try:
            anns=m.get_annotations()
            if anns: lines.append(f"  ANNOTATIONS: {anns}")
        except Exception as e:
            lines.append(f"  (ann err {e})")
        code=m.get_code()
        if code is None:
            lines.append("  (no code)"); continue
        try:
            for ins in code.get_bc().get_instructions():
                lines.append(f"  {ins.get_name():28s} {ins.get_output()}")
        except Exception as e:
            lines.append(f"  (bc err {e})")
    open(os.path.join(outdir,outfile),'w').write("\n".join(lines))
    print("wrote", outfile, cls.get_name(), "in", fn)

# CryptoTool + helpers
dump("Lcom/axis/net/helper/CryptoTool;", "crypto-tool.txt")
dump("Lcom/axis/net/helper/AxisnetHelpers;", "axisnet-helpers.txt")
dump("Lcom/axis/net/helper/DateHelper;", "date-helper.txt")
dump("Lcom/axis/net/helper/HMACHeader;", "hmac-header.txt")
dump("Lcom/axis/net/features/alifetime/dashboard/repositories/AlifetimeDashboardRepository;", "alifetime-repo.txt")
dump("Lcom/axis/net/features/alifetime/general/models/BonusProductModel;", "bonus-product-model.txt")
dump("Lcom/axis/net/features/alifetime/general/models/AlifetimeClaimBonusModel;", "alifetime-claim-bonus-model.txt")

# Annotations on AxisnetApiServices methods of interest
fn, cls = find_class("Lcom/axis/net/api/AxisnetApiServices;")
lines=[]
for m in cls.get_methods():
    if m.get_name() in ("alifetimeClaimBonus","claimBonus","getPointProfile","getAlifetimeBonus","getCoinWordingLevel","getLevelAlifetime","redeemBonusFlashWar","claimVoucher","purchaseTicketFlashWar"):
        try:
            anns=m.get_annotations()
        except Exception as e:
            anns=f"ERR {e}"
        lines.append(f"{m.get_name()} {m.get_descriptor()}\n  annotations={anns}")
open(os.path.join(outdir,"api-annotations.txt"),'w').write("\n".join(lines))
print("wrote api-annotations.txt")
print("\n".join(lines))
