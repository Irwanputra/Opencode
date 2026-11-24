import sys, json, hmac as H, hashlib
sys.path.insert(0,'.')
import hc_reenc as R
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_decrypt as dec

raw=open('real815/SlowDnsJanda.hc','rb').read()
b=raw.decode('utf-8').encode('latin-1')
env=json.loads(dec(b[24:], b"HCX4|"+R.PKG.encode()+b"|1", b[:24], R.env_key()))
salt=bytes.fromhex(env['g']); sec=env['i']
nonce=bytes.fromhex(sec['b']); ct=bytes.fromhex(sec['c'])
PKG=R.PKG
V4I=[0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181]
V4O=[0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381]
V5I=[0xaabd3a1e,0x3d63a211,0xe615b378,0x46a07517,0x11f5cab4,0xa7aef829,0x83c7543b,0x2d971ab7]
V5O=[0x423fcb79,0xc4dd3dc8,0x57d814ac,0x1660ed59,0xdbb328b7,0xcc389261,0x06f1803e,0xe3130c6b]

def hkdf(salt,ikm,info):
    prk=H.new(salt,ikm,hashlib.sha256).digest()
    return H.new(prk,info+b'\x01',hashlib.sha256).digest()
def native(domain,ipad,opad,prefix,salt,info):
    m=bytes([domain])+R.CERT+prefix
    inner=R.finish_state(ipad,m); ikm=R.finish_state(opad,inner)
    return hkdf(salt,ikm,info)

parts_list=["ssh,profiles","ssh|profiles","ssh+profiles","sshprofiles","ssh","ssh,profiles,","ssh,profiles|profiles"]
cat="cp-20260820-01"
bases=set()
for parts in parts_list:
    for cv in ("13","12"):
        for ks in ("n17","n15"):
            for tail in (f"|0|942", f"|0|942|{cat}", f"|0|{cat}|942", "|0", "", f"|942", f"|0|942|1", f"|1|0|942"):
                bases.add(f"HCCFG|{cv}|XCHACHA20P1305|NATIVE-HKDF-SHA256|{ks}|{PKG}|1|{parts}{tail}".encode())
# n11-style null separated
for parts in parts_list:
    for ks in ("n17","n15"):
        for rd in ("942",""):
            bases.add(f"HCCFG\0{PKG}\x001\0{parts}\0{rd}".encode())
            bases.add(f"HCCFG\0{PKG}\x001\0{parts}\0{rd}\0".encode())
bases=list(bases)
infos=[b"hc-config-content-v12",b"hc-config-content-v13",b"hc-config-content-v14",b"hc-config-content-v17",b"hc-config-content-v18",b"hc-config-content",b"hc-config-content-n17",b"hc-config-content-v13.0",b"app-config",b"hc-config",b"hc-session-v13",b"hc-session-key-v13",b"hc-v13"]
infos += [f"app-config|n17|{PKG}|1|ssh,profiles|942".encode(), f"app-config|n17|{PKG}|1|ssh,profiles".encode(), f"app-config|n13|{PKG}|1|ssh,profiles|942".encode()]
partinfos=[b"hc-config-part-v12",b"hc-config-part-v13",b"hc-config-part-v14",b"hc-config-part-v17",b"hc-config-part",b"hc-config-part-v13.0"]
domains=[0xe9,0xf1,0xf3,0xf5,0xf7,0xf9,0xfb,0xfd,0xef,0x00,0x01]
ctxs=[b"m",b"i",b"manifest",b"cfg",b"config"]
states=(("V5",V5I,V5O),("V4",V4I,V4O))
print("bases",len(bases),"infos",len(infos),"combos",len(bases)*len(infos)*len(domains)*2)
n=0
for base in bases:
    for dom in domains:
        for sn,ip,op in states:
            for info in infos:
                sk=native(dom,ip,op,base,salt,info)
                n+=1
                for pi in partinfos:
                    for ctx in ctxs:
                        aad=base+b"\x00"+ctx
                        pk=hkdf(pi,sk,aad)
                        try:
                            pt=dec(ct,aad,nonce,pk)
                            print("HIT",sn,hex(dom),info,pi,base,ctx); print(pt[:400]); sys.exit(0)
                        except Exception: pass
                # direct key, aad variants
                for ctx in ctxs:
                    try:
                        pt=dec(ct,base+b"\x00"+ctx,nonce,sk); print("HIT-DIRECT",sn,hex(dom),info,base,ctx); print(pt[:400]); sys.exit(0)
                    except Exception: pass
    if n%2000<200: print("...",n,flush=True)
print("no hit after",n)
