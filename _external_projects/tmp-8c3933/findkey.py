import sys, struct, glob, time
sys.path.insert(0,'.')
import hc_reenc as R
IV=[0x6a09e667,0xbb67ae85,0x3c6ef372,0xa54ff53a,0x510e527f,0x9b05688c,0x1f83d9ab,0x5be0cd19]
targets={
 'V4I':[0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181],
 'V4O':[0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381],
 'V5I':[0xaabd3a1e,0x3d63a211,0xe615b378,0x46a07517,0x11f5cab4,0xa7aef829,0x83c7543b,0x2d971ab7],
 'V5O':[0x423fcb79,0xc4dd3dc8,0x57d814ac,0x1660ed59,0xdbb328b7,0xcc389261,0x06f1803e,0xe3130c6b],
}
def st_for(block):
    return R.compress(IV, bytes(b^0x36 for b in block))
pads={}
t0=time.time(); tested=0
for p in [p for p in glob.glob('/tmp/hc942_dump/*.bin') if '_rw' in p]:
    d=open(p,'rb').read(); n=len(d)
    # 32-byte keys (zero padded to 64)
    for off in range(0, n-32, 4):
        w=d[off:off+32]
        if not any(w): continue
        blk=w+b'\x00'*32
        s=st_for(blk); tested+=1
        for k,v in targets.items():
            if s==v: print("HIT32",k,p,hex(off),w.hex())
    # 64-byte keys
    for off in range(0, n-64, 4):
        w=d[off:off+64]
        if not any(w[10:]): continue
        s=st_for(w); tested+=1
        for k,v in targets.items():
            if s==v: print("HIT64",k,p,hex(off),w.hex())
    print("done",p,"tested",tested,"t",round(time.time()-t0,1),flush=True)
print("total",tested)
