import sys; sys.path.insert(0,".")
import json, itertools, hc_reenc as R, struct, hmac as H, hashlib
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_decrypt as dec

raw=open('real815/SlowDnsJanda.hc','rb').read()
b=raw.decode('utf-8').encode('latin-1')
env=json.loads(dec(b[24:], b"HCX4|"+R.PKG.encode()+b"|1", b[:24], R.env_key()))
salt=bytes.fromhex(env['g'])
sec=env['i']
nonce=bytes.fromhex(sec['b']); ct=bytes.fromhex(sec['c'])

V4I=[0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181]
V4O=[0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381]
V5I=[0xaabd3a1e,0x3d63a211,0xe615b378,0x46a07517,0x11f5cab4,0xa7aef829,0x83c7543b,0x2d971ab7]
V5O=[0x423fcb79,0xc4dd3dc8,0x57d814ac,0x1660ed59,0xdbb328b7,0xcc389261,0x06f1803e,0xe3130c6b]
CERT=R.CERT
def hkdf(salt,ikm,info):
    prk=H.new(salt,ikm,hashlib.sha256).digest()
    return H.new(prk,info+b'\x01',hashlib.sha256).digest()
def native(domain,ipad,opad,prefix,salt,info):
    m=bytes([domain])+CERT+prefix
    inner=R.finish_state(ipad,m); ikm=R.finish_state(opad,inner)
    return hkdf(salt,ikm,info)
parts=",".join(env['f'])
base_aads=[]
for cv in (13,):
  for ks in ("n17","n15"):
    for rd in (942,):
      base_aads.append(f"HCCFG|{cv}|XCHACHA20P1305|NATIVE-HKDF-SHA256|{ks}|{R.PKG}|1|{parts}|0|{rd}".encode())
      base_aads.append(f"HCCFG|{cv}|XCHACHA20P1305|NATIVE-HKDF-SHA256|{ks}|{R.PKG}|1|{parts}|0".encode())
infos=[]
for v in ("v12","v13","v14","v17","v18"):
    infos.append(("hc-config-content-"+v).encode())
infos += [b"hc-config-content", b"hc-config-content-v13", b"hc-config-content-n17"]
domains=(0xf1,0xf3,0xf5,0xe9,0xef)
states=(("v5",V5I,V5O),("v4",V4I,V4O))
partinfos=[b"hc-config-part-v12",b"hc-config-part-v13",b"hc-config-part-v14",b"hc-config-part-v17"]
found=[]
for base in base_aads:
  for dom in domains:
    for sn,ip,op in states:
      for info in infos:
        try: sk=native(dom,ip,op,base,salt,info)
        except Exception: continue
        for pi in partinfos:
          aad=base+b"\x00m"
          pk=hkdf(pi,sk,aad)
          try:
            pt=dec(ct,aad,nonce,pk)
            print("HIT",dom,sn,info,pi,base); print(pt[:300]); found.append((base,dom,sn,info,pi,pt)); raise SystemExit
          except Exception: pass
        # also try direct sk without part derivation, and with context-less aad
        for aad2 in (base+b"\x00m", base, b"m"):
          try:
            pt=dec(ct,aad2,nonce,sk); print("HIT-direct",dom,sn,info,aad2); print(pt[:300]); raise SystemExit
          except Exception: pass
print("no hit")
