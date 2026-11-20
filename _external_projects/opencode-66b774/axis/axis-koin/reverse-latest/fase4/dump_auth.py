import logging, glob
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

def dump(dexpath, classname, methods, outfile):
    dex=DEX(open(dexpath,'rb').read())
    out=[]
    for c in dex.get_classes():
        if c.get_name()==classname:
            out.append(f"# {classname} in {dexpath}")
            out.append("## fields")
            for f in c.get_fields():
                out.append(f"  {f.get_name()} : {f.get_descriptor()}")
            for m in c.get_methods():
                if methods and m.get_name() not in methods:
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
    open(outfile,'w').write("\n".join(out))
    print("wrote", outfile, len(out), "lines")

dump("/home/hatch/workspace/axis-koin/reverse-latest/fase3/tmp13997699941173334308.dex",
     "Lcom/axis/net/ui/splashLogin/usecases/AuthUseCase;", {"d"},
     "/home/hatch/workspace/axis-koin/reverse-latest/fase4/auth-usecase-d.txt")
# find Lsc/c in base apk dex
for path in sorted(glob.glob("/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/classes*.dex")):
    dex=DEX(open(path,'rb').read())
    for c in dex.get_classes():
        if c.get_name()=="Lsc/c;":
            print("Lsc/c in", path)
            dump(path, "Lsc/c;", None, "/home/hatch/workspace/axis-koin/reverse-latest/fase4/sc-c.txt")
            raise SystemExit
print("Lsc/c not found in base dex")
