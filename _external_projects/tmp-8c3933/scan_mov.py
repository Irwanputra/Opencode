import sys
from capstone import *
from capstone.arm64 import *
V4=[0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181,
    0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381]
V5=[0xaabd3a1e,0x3d63a211,0xe615b378,0x46a07517,0x11f5cab4,0xa7aef829,0x83c7543b,0x2d971ab7,
    0x423fcb79,0xc4dd3dc8,0x57d814ac,0x1660ed59,0xdbb328b7,0xcc389261,0x06f1803e,0xe3130c6b]
CERT=[0x95dd433d,0x7e4a0be0,0x2d55cc62,0x553edcfc,0x8f077fe7,0x80be5a7d,0xa7f861c2,0x558dc181]
targets={}
for v in V4: targets.setdefault(v,'V4')
for v in V5: targets.setdefault(v,'V5')
for v in CERT: targets.setdefault(v,'CERT')
def scan(path, base_va=None, off=None, size=None):
    d=open(path,'rb').read()
    if off is None: off=0; size=len(d)
    md=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN); md.detail=True; md.skipdata=True
    st={}  # reg -> (val, addr, kind)
    hits=[]
    for ins in md.disasm(d[off:off+size], base_va if base_va is not None else off):
        try:
            regs_written,_=ins.regs_access()
        except Exception:
            regs_written=[]
        m=ins.mnemonic
        if m in ('movz','movk','movn'):
            ops=ins.operands
            if len(ops)>=2 and ops[0].type==ARM64_OP_REG:
                rd=ops[0].reg
                if m=='movz':
                    val=ops[1].imm << (ops[2].imm if len(ops)>2 else 0)
                    st[rd]=(val,ins.address,m)
                elif m=='movn':
                    imm=ops[1].imm << (ops[2].imm if len(ops)>2 else 0)
                    val=(~imm)&0xffffffffffffffff
                    st[rd]=(val,ins.address,m)
                else:
                    sh=ops[2].imm if len(ops)>2 else 0
                    if rd in st and st[rd][2]=='movn': pass
                    prev=st.get(rd,(0,0,'movz'))[0]
                    val=(prev & ~(0xffff<<sh)) | (ops[1].imm<<sh)
                    st[rd]=(val,ins.address,m)
                v=st[rd][0]
                for w in (v&0xffffffff,(v>>32)&0xffffffff):
                    if w in targets and w>0xffff:
                        hits.append((ins.address,targets[w],hex(w)))
                continue
        for r in regs_written:
            if r in st: del st[r]
    return hits
for nm,p,va,off,sz in (("934",'hc/libs/libf2c.so',0x400000,None,None),("942",'/tmp/hc815lib/lib/arm64-v8a/libf2c.so',0x400000,None,None)):
    print("==",nm,"scanning",flush=True)
    h=scan(p,va)
    print(nm,"hits",len(h),h[:20])
