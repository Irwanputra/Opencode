import sys, json, hmac as H, hashlib, itertools
sys.path.insert(0,'.')
import hc_reenc as R
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_decrypt as dec
raw=open('real815/SlowDnsJanda.hc','rb').read(); b=raw.decode('utf-8').encode('latin-1')
env=json.loads(dec(b[24:], b"HCX4|"+R.PKG.encode()+b"|1", b[:24], R.env_key()))
salt=bytes.fromhex(env['g']); sec=env['i']; nonce=bytes.fromhex(sec['b']); ct=bytes.fromhex(sec['c'])
PKG=R.PKG
V5I=[0xaabd3a1e,0x3d63a211,0xe615b378,0x46a07517,0x11f5cab4,0xa7aef829,0x83c7543b,0x2d971ab7]
V5O=[0x423fcb79,0xc4dd3dc8,0x57d814ac,0x1660ed59,0xdbb328b7,0xcc389261,0x06f1803e,0xe3130c6b]
V4I=[0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181]
V4O=[0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381]
def hkdf(salt,ikm,info):
    prk=H.new(salt,ikm,hashlib.sha256).digest(); return H.new(prk,info+b'\x01',hashlib.sha256).digest()
def native(dom,ip,op,prefix,salt,info):
    m=bytes([dom])+R.CERT+prefix; return hkdf(salt,R.finish_state(op,R.finish_state(ip,m)),info)
parts_variants=["ssh,profiles","ssh|profiles","ssh+profiles","sshprofiles","ssh","ssh,profiles,","ssh,profiles,profiles","profiles,ssh"]
tails=["|0|942","|0|942|cp-20260820-01","|0|cp-20260820-01|942","|0|942|cp","|0|942|cp-20260820-01|1","|0","|942","|0|942|1|0",""]
heads=["HCCFG","hccfg","HCCFG|13","HCCFG|12"]
mid_parts=[("XCHACHA20P1305","NATIVE-HKDF-SHA256"),("XCHACHA20P1305","NATIVE-HKDF-SHA256","n17"),("XCHACHA20P1305","NATIVE-HKDF-SHA256","n15"),("s1","h1","n17")]
bases=set()
for pv in parts_variants:
  for tail in tails:
    for hd in heads:
      for mp in mid_parts:
        base="|".join([hd]+list(mp)+[PKG,"1",pv])+tail
        bases.add(base.encode())
# null-separated
for pv in parts_variants:
    for rd in ("942",""):
        bases.add(f"HCCFG\0{PKG}\x001\0{pv}\0{rd}".encode())
        bases.add(f"HCCFG\0{PKG}\x001\0{pv}\0".encode())
bases=list(bases)
infos=[b"hc-config-content-v12",b"hc-config-content-v13",b"hc-config-content-v17",b"hc-config-content-v14",b"hc-config-content-v15",b"hc-config-content-v16",b"hc-config-content",b"hc-config-content-v13.0",f"app-config|n17|{PKG}|1|ssh,profiles|942".encode()]
partinfos=[b"hc-config-part-v12",b"hc-config-part-v13",b"hc-config-part-v17",b"hc-config-part-v14"]
domains=[0xf1,0xf3]
seps=[b"\x00",b"|",b":",b""]
ctxs=[b"m",b"i",b"manifest",b"cfg"]
print("bases",len(bases))
n=0
for base in bases:
  for dom in domains:
    for sn,ip,op in (("V5",V5I,V5O),("V4",V4I,V4O)):
      for info in infos:
        sk=native(dom,ip,op,base,salt,info); n+=1
        for pi in partinfos:
          for sep in seps:
            for ctx in ctxs:
              aad=base+sep+ctx
              pk=hkdf(pi,sk,aad)
              try:
                pt=dec(ct,aad,nonce,pk); print("HIT",sn,hex(dom),info,pi,sep,ctx,base); print(pt[:400]); sys.exit(0)
              except Exception: pass
        for sep in seps:
          for ctx in ctxs:
            aad=base+sep+ctx
            try:
              pt=dec(ct,aad,nonce,sk); print("HITD",sn,hex(dom),info,sep,ctx,base); print(pt[:400]); sys.exit(0)
            except Exception: pass
print("no hit",n)
