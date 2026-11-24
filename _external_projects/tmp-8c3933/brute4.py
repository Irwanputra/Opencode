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
def hkdf(salt,ikm,info):
    prk=H.new(salt,ikm,hashlib.sha256).digest(); return H.new(prk,info+b'\x01',hashlib.sha256).digest()
def native(dom,ip,op,prefix,salt,info):
    m=bytes([dom])+R.CERT+prefix; return hkdf(salt,R.finish_state(op,R.finish_state(ip,m)),info)
parts=["ssh,profiles","ssh|profiles","ssh+profiles","ssh","ssh,profiles,","sshprofiles"]
bases=set()
cvals=["s1","XCHACHA20P1305","XCHACHA20_POLY1305"]
dvals=["h1","NATIVE-HKDF-SHA256"]
evals=["n17","n15"]
cv=["13","12"]
for pv in parts:
  for c in cvals:
    for d in dvals:
      for e in evals:
        for ver in cv:
          core=f"HCCFG|{ver}|{c}|{d}|{e}|{PKG}|1|{pv}"
          for tail in ("|0|942","|0|942|cp-20260820-01","|0|cp-20260820-01|942","|0","|942","","|0|942|1","|942|0","|0|942|2","|0|942|cp-20260820-01|1|ssh"):
            bases.add((core+tail).encode())
# json canonical header variants
hdr={k:env.get(k) for k in "abcd"} ; hdr.update({"e":env.get("e"),"f":env.get("f"),"g":env.get("g"),"h":0,"n":env.get("n")})
for sort in (True,False):
  for sep in ((",",":"),(", ",": ")):
    try: bases.add(json.dumps(hdr,sort_keys=sort,separators=sep).encode())
    except: pass
bases=list(bases)
infos=[b"hc-config-content-v12",b"hc-config-content-v13",b"hc-config-content-v17",b"hc-config-content",b"hc-config-content-v13.0"]
partinfos=[b"hc-config-part-v12",b"hc-config-part-v13",b"hc-config-part-v17"]
domains=[0xf1,0xf3,0xf5,0xe9]
seps=[b"\x00",b"|"]
ctxs=[b"m",b"i",b"manifest"]
print("bases",len(bases))
n=0
for base in bases:
  for dom in domains:
    for info in infos:
      sk=native(dom,V5I,V5O,base,salt,info); n+=1
      for pi in partinfos:
        for sep in seps:
          for ctx in ctxs:
            aad=base+sep+ctx; pk=hkdf(pi,sk,aad)
            try:
              pt=dec(ct,aad,nonce,pk); print("HIT",hex(dom),info,pi,sep,ctx,base); print(pt[:400]); sys.exit(0)
            except Exception: pass
      for sep in seps:
        for ctx in ctxs:
          aad=base+sep+ctx
          try:
            pt=dec(ct,aad,nonce,sk); print("HITD",hex(dom),info,sep,ctx,base); print(pt[:400]); sys.exit(0)
          except Exception: pass
print("no hit",n)
