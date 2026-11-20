import os, sys, glob, logging
logging.disable(logging.CRITICAL)
os.environ["LOGURU_LEVEL"]="ERROR"
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
targets=["Signature","RequestInterceptor","RewardClaimParam","AxisnetApiServices","Alifetime","OtpApiService","AuthApiService","AxisnetHelpers","LicenseClient"]
for p in sorted(glob.glob(base+"/tmp*.dex")):
    dex=DEX(open(p,'rb').read())
    classes=dex.get_classes()
    names=[c.get_name() for c in classes]
    hits=[n for n in names if any(t in n for t in targets)]
    print(os.path.basename(p), "classes:", len(names))
    for h in hits:
        print("  HIT", h)
    # also strings of interest
    strs=dex.get_strings()
    for needle in ["x-signature","HmacSHA","Tempest","tempest"]:
        c=sum(1 for s in strs if needle.lower() in s.lower())
        if c: print(f"  strings containing {needle!r}: {c}")
