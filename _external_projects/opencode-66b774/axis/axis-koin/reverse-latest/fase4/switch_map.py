"""Map LO5/a$a.d(I) packed-switch keys to getPos* bodies.

Reads the switch payload (keys + signed 32-bit target offsets relative to
the switch instruction) from the raw DEX bytes and walks each target block
to find which getPos* it calls.
"""
import logging, struct
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX

dex=DEX(open("/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/classes3.dex",'rb').read())
raw=open("/home/hatch/workspace/axis-koin/reverse-latest/scratch-apk/classes3.dex",'rb').read()
for c in dex.get_classes():
    if c.get_name()!="LO5/a$a;":
        continue
    for m in c.get_methods():
        if m.get_name()!="d":
            continue
        code=m.get_code()
        bc=code.get_bc()
        insns=list(bc.get_instructions())
        for i, ins in enumerate(insns):
            if ins.get_name()=="packed-switch":
                # address of switch instruction (code offset)
                sw_addr=ins.get_addr() if hasattr(ins,'get_addr') else None
                print("switch ins:", ins.get_name(), ins.get_output(), "addr:", sw_addr)
                # operands: (reg, payload_offset) - get raw via get_operands
                try:
                    print("operands:", ins.get_operands())
                except Exception as e:
                    print("operands err", e)
                # The payload offset is a code-unit offset from switch addr.
                # Find payload in raw dex: search for the switch instruction bytes is complex;
                # instead use androguard's instruction offset: ins.get_off() is file offset?
                try:
                    print("off:", ins.get_off())
                except Exception as e:
                    print("off err", e)
                # Dump following instructions with addresses
                for j in range(i, min(i+90, len(insns))):
                    print(f"  {insns[j].get_addr() if hasattr(insns[j],'get_addr') else '?'}: {insns[j].get_name():28s} {insns[j].get_output()}")
        break
    break
