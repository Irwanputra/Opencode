from capstone import *
import difflib
def insns(p, off, sz, va):
    d=open(p,'rb').read()[off:off+sz]
    md=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN); md.skipdata=True
    out=[]
    for i in md.disasm(d, va):
        out.append(i.mnemonic+' '+i.op_str)
    return out
a=insns('hc/libs/libcodec.so',0x15b0,0x19d90,0)
b=insns('w815lib/lib/arm64-v8a/libcodec.so',0x1560,0x18be0,0)
print("counts",len(a),len(b))
sm=difflib.SequenceMatcher(None,a,b,autojunk=False)
for tag,i1,i2,j1,j2 in sm.get_opcodes():
    if tag!='equal' and (i2-i1)>2:
        print(tag,i1,i2,j1,j2,"ratio",round(sm.ratio(),3))
