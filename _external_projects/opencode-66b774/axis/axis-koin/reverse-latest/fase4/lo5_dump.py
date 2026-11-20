import logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

dex=DEX(open("/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/classes3.dex",'rb').read())
out=[]
for c in dex.get_classes():
    if c.get_name() in ("LO5/a$a;", "LO5/a;"):
        out.append(f"# {c.get_name()} super: {c.get_superclassname()}")
        out.append("## fields")
        for f in c.get_fields():
            out.append(f"  {f.get_name()} : {f.get_descriptor()} access={f.get_access_flags_string()}")
        out.append("## methods")
        for m in c.get_methods():
            out.append(f"\n### {m.get_name()} {m.get_descriptor()} access={m.get_access_flags_string()}")
            code=m.get_code()
            if code is None:
                out.append("  (no code)")
                continue
            try:
                for ins in code.get_bc().get_instructions():
                    out.append(f"  {ins.get_name():28s} {ins.get_output()}")
            except Exception as e:
                out.append(f"  (bc error {e})")
open("/home/hatch/workspace/axis-koin/reverse-latest/fase4/lo5-a.txt",'w').write("\n".join(out))
print("wrote", len(out), "lines")
