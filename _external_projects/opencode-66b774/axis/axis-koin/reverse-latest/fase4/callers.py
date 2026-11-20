import os, glob, logging, re
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
dexes={}
for p in sorted(glob.glob(base+"/tmp*.dex")):
    dexes[os.path.basename(p)]=DEX(open(p,'rb').read())

# 1. strings of interest in main dex
dex=dexes["tmp14169616706995394833.dex"]
strs=dex.get_strings()
for needle in ["HMACHeader","/v1/transaction/redeem","/v1/claim-bonus","x-signature","x-handshake","Authorization"]:
    hits=[s for s in strs if needle in s]
    print(f"STR {needle!r}: {hits[:10]} (n={len(hits)})")

# 2. callers of Signature methods across all dexes
targets=["Lcom/axis/net/config/Signature;->e(","Lcom/axis/net/config/Signature;->h(","Lcom/axis/net/config/Signature;->i(","Lcom/axis/net/config/Signature;->p(","Lcom/axis/net/config/Signature;->l(","Lcom/axis/net/config/Signature;->j(","Lcom/axis/net/config/Signature;->v(","Lcom/axis/net/config/Signature;->m(","Lcom/axis/net/config/Signature;->g(","Lcom/axis/net/config/Signature;->u("]
for fn,d in dexes.items():
    for c in d.get_classes():
        for m in c.get_methods():
            code=m.get_code()
            if code is None: continue
            try:
                out=" ".join(ins.get_output() for ins in code.get_bc().get_instructions())
            except Exception:
                continue
            for t in targets:
                if t in out:
                    print(f"CALLER {fn} {c.get_name()}->{m.get_name()}{m.get_descriptor()}  calls {t}")
                    break
