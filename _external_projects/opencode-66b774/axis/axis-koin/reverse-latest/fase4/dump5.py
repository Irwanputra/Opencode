import os, glob, logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

base="/home/hatch/workspace/axis-koin/reverse-latest/fase3"
outdir="/home/hatch/workspace/axis-koin/reverse-latest/fase4"
dexes={}
for p in sorted(glob.glob(base+"/tmp*.dex")):
    dexes[os.path.basename(p)]=DEX(open(p,'rb').read())

def find_class(name):
    for fn,dex in dexes.items():
        for c in dex.get_classes():
            if c.get_name()==name:
                return fn, c
    return None, None

def dump(name, outfile):
    fn, cls = find_class(name)
    if cls is None:
        print("NOT FOUND", name); return
    lines=[f"# {cls.get_name()} in {fn}", f"super: {cls.get_superclassname()}"]
    lines.append("## fields")
    for f in cls.get_fields():
        lines.append(f"  {f.get_name()} : {f.get_descriptor()}")
    lines.append("## methods")
    for m in cls.get_methods():
        lines.append(f"\n### {m.get_name()} {m.get_descriptor()} access={m.get_access_flags_string()}")
        code=m.get_code()
        if code is None:
            lines.append("  (no code)"); continue
        try:
            for ins in code.get_bc().get_instructions():
                lines.append(f"  {ins.get_name():28s} {ins.get_output()}")
        except Exception as e:
            lines.append(f"  (bc err {e})")
    open(os.path.join(outdir,outfile),'w').write("\n".join(lines))
    print("wrote", outfile, name, "in", fn)

dump("Lcom/axis/net/helper/EnumCrypto;", "enum-crypto.txt")
dump("Lcom/axis/net/features/alifetime/detail/viewModels/a;", "alifetime-detail-viewmodel-a.txt")
# EnumCrypto string values: also print all strings in its dex that look like enum constants
for fn,dex in dexes.items():
    for c in dex.get_classes():
        if c.get_name()=="Lcom/axis/net/helper/EnumCrypto;":
            print("EnumCrypto fields:")
            for f in c.get_fields():
                print("  ", f.get_name(), f.get_descriptor())
