import json, hashlib, hmac as hmac_mod, struct
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_encrypt as enc
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_decrypt as dec

CERT = bytes.fromhex("95dd433d7e4a0be02d55cc62553edcfc8f077fe780be5a7da7f861c2558dc181")
IPAD = [0x82515a9a,0xf6ec05fc,0xf650b6cd,0x523f8ce6,0xedf419ec,0x1d6d6573,0x66ff1b89,0xf40a0181]
OPAD = [0x82185b01,0x35cb48be,0xdb6c3846,0xbd714ec5,0x627728af,0xdbaae4db,0x463fbf8d,0x88a24381]
PKG = "xyz.easypro.httpcustom"
K = [0x428a2f98,0x71374491,0xb5c0fbcf,0xe9b5dba5,0x3956c25b,0x59f111f1,0x923f82a4,0xab1c5ed5,
0xd807aa98,0x12835b01,0x243185be,0x550c7dc3,0x72be5d74,0x80deb1fe,0x9bdc06a7,0xc19bf174,
0xe49b69c1,0xefbe4786,0x0fc19dc6,0x240ca1cc,0x2de92c6f,0x4a7484aa,0x5cb0a9dc,0x76f988da,
0x983e5152,0xa831c66d,0xb00327c8,0xbf597fc7,0xc6e00bf3,0xd5a79147,0x06ca6351,0x14292967,
0x27b70a85,0x2e1b2138,0x4d2c6dfc,0x53380d13,0x650a7354,0x766a0abb,0x81c2c92e,0x92722c85,
0xa2bfe8a1,0xa81a664b,0xc24b8b70,0xc76c51a3,0xd192e819,0xd6990624,0xf40e3585,0x106aa070,
0x19a4c116,0x1e376c08,0x2748774c,0x34b0bcb5,0x391c0cb3,0x4ed8aa4a,0x5b9cca4f,0x682e6ff3,
0x748f82ee,0x78a5636f,0x84c87814,0x8cc70208,0x90befffa,0xa4506ceb,0xbef9a3f7,0xc67178f2]

def rotr(x, n): return ((x >> n) | (x << (32 - n))) & 0xffffffff

def compress(state, block):
    w = list(struct.unpack(">16I", block))
    for i in range(16, 64):
        s0 = rotr(w[i-15],7) ^ rotr(w[i-15],18) ^ (w[i-15] >> 3)
        s1 = rotr(w[i-2],17) ^ rotr(w[i-2],19) ^ (w[i-2] >> 10)
        w.append((w[i-16] + s0 + w[i-7] + s1) & 0xffffffff)
    a,b,c,d,e,f,g,h = state
    for i in range(64):
        S1 = rotr(e,6) ^ rotr(e,11) ^ rotr(e,25)
        ch = (e & f) ^ (~e & g & 0xffffffff)
        t1 = (h + S1 + ch + K[i] + w[i]) & 0xffffffff
        S0 = rotr(a,2) ^ rotr(a,13) ^ rotr(a,22)
        mj = (a & b) ^ (a & c) ^ (b & c)
        t2 = (S0 + mj) & 0xffffffff
        h=g; g=f; f=e; e=(d+t1)&0xffffffff; d=c; c=b; b=a; a=(t1+t2)&0xffffffff
    return [(x+y)&0xffffffff for x,y in zip(state,(a,b,c,d,e,f,g,h))]

def finish_state(state, data):
    p = data + b"\x80"
    while len(p) % 64 != 56: p += b"\x00"
    p += ((64 + len(data)) * 8).to_bytes(8, "big")
    st = list(state)
    for i in range(0, len(p), 64):
        st = compress(st, p[i:i+64])
    return b"".join(struct.pack(">I", w) for w in st)

def derive_key(prefix, salt, info):
    material = b"\xe9" + CERT + prefix
    inner = finish_state(IPAD, material)
    ikm = finish_state(OPAD, inner)
    prk = hmac_mod.new(salt, ikm, hashlib.sha256).digest()
    return hmac_mod.new(prk, info + b"\x01", hashlib.sha256).digest()

def env_key():
    return derive_key(b"hc-envelope-seal-v4 " + PKG.encode(), b"hc-envelope-seal-salt-v4", b"hc-envelope-seal-info-v4")

def seal(key, nonce, plaintext, aad):
    return enc(plaintext, aad, nonce, key)

def build_hc_text(env_dict, nonce24):
    pt = json.dumps(env_dict, separators=(",", ":")).encode()
    ct = seal(env_key(), nonce24, pt, b"HCX4|" + PKG.encode() + b"|1")
    blob = nonce24 + ct
    return "".join(chr(b) for b in blob).encode("utf-8"), blob
