import logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX
dex=DEX(open("/home/hatch/workspace/axis-koin/reverse-latest/fase3/tmp13997699941173334308.dex",'rb').read())
out=[]
for c in dex.get_classes():
    if c.get_name()=="Lcom/axis/net/ui/splashLogin/viewModel/x;":
        out.append(f"# {c.get_name()}")
        for m in c.get_methods():
            if m.get_name() not in ("validateOtpCode", "getOtpLoginSignature", "getOtp", "requestOtp"):
                continue
            out.append(f"\n### {m.get_name()} {m.get_descriptor()}")
            code=m.get_code()
            if code is None:
                out.append("  (no code)"); continue
            try:
                for ins in code.get_bc().get_instructions():
                    out.append(f"  {ins.get_name():28s} {ins.get_output()}")
            except Exception as e:
                out.append(f"  (bc error {e})")
open("/home/hatch/workspace/axis-koin/reverse-latest/fase4/otp-viewmodel.txt",'w').write("\n".join(out))
print("wrote", len(out), "lines")
