import os, sys, logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
outdir="/home/hatch/workspace/axis-koin/reverse-latest/fase4"

def dump(dexfile, classname, outfile):
    dex=DEX(open(os.path.join(base,dexfile),'rb').read())
    cls=None
    for c in dex.get_classes():
        if c.get_name()==classname:
            cls=c; break
    if cls is None:
        print("NOT FOUND", classname, "in", dexfile); return
    lines=[]
    lines.append(f"# {classname} in {dexfile}")
    lines.append(f"super: {cls.get_superclassname()}  interfaces: {cls.get_interfaces()}")
    lines.append("## fields")
    for f in cls.get_fields():
        lines.append(f"  {f.get_name()} : {f.get_descriptor()}  access={f.get_access_flags_string()}")
    lines.append("## methods")
    for m in cls.get_methods():
        lines.append(f"\n### {m.get_name()} {m.get_descriptor()}  access={m.get_access_flags_string()}")
        code=m.get_code()
        if code is None:
            lines.append("  (no code - abstract/native)")
            continue
        try:
            bc=code.get_bc()
            for ins in bc.get_instructions():
                lines.append(f"  {ins.get_name():28s} {ins.get_output()}")
        except Exception as e:
            lines.append(f"  (bc error {e})")
    open(os.path.join(outdir,outfile),'w').write("\n".join(lines))
    print("wrote", outfile, len(lines), "lines")

if __name__=="__main__":
    dump("tmp14169616706995394833.dex","Lcom/axis/net/config/Signature;","signature.txt")
    dump("tmp14169616706995394833.dex","Lcom/axis/net/config/RequestInterceptor;","request-interceptor.txt")
    dump("tmp14169616706995394833.dex","Lcom/axis/net/features/alifetime/general/models/RewardClaimParam;","reward-claim-param.txt")
    dump("tmp3065699920606524921.dex","Lcom/axis/net/helper/HMACSignatureInterceptor;","hmac-signature-interceptor.txt")
    dump("tmp14169616706995394833.dex","Lcom/axis/net/api/AxisnetApiServices;","axisnet-api-services.txt")
