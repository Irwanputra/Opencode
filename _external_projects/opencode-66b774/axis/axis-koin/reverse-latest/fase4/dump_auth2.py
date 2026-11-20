import logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

def dump(dexpath, classname, outfile):
    dex=DEX(open(dexpath,'rb').read())
    out=[]
    for c in dex.get_classes():
        if c.get_name()==classname:
            out.append(f"# {classname}")
            for m in c.get_methods():
                out.append(f"\n### {m.get_name()} {m.get_descriptor()}")
                code=m.get_code()
                if code is None:
                    out.append("  (no code)"); continue
                try:
                    for ins in code.get_bc().get_instructions():
                        out.append(f"  {ins.get_name():28s} {ins.get_output()}")
                except Exception as e:
                    out.append(f"  (bc error {e})")
    open(outfile,'w').write("\n".join(out))
    print("wrote", outfile, len(out), "lines")

dump("/home/hatch/workspace/axis-koin/reverse-latest/fase3/tmp13997699941173334308.dex",
     "Lcom/axis/net/ui/splashLogin/usecases/AuthUseCase$getOtpLogin$1;",
     "/home/hatch/workspace/axis-koin/reverse-latest/fase4/auth-getotplogin-1.txt")
dump("/home/hatch/workspace/axis-koin/reverse-latest/fase3/tmp13997699941173334308.dex",
     "Lcom/axis/net/ui/splashLogin/viewModel/x;",
     "/home/hatch/workspace/axis-koin/reverse-latest/fase4/otp-viewmodel-full.txt")
