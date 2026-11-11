import struct, hashlib, itertools

data = open("hc/assets/eCrypt.bin","rb").read()
print("size", len(data), "mod4", len(data)%4)

MASK=0xffffffff
def xxtea_decrypt(data, key, endian="<"):
    n = len(data)//4
    if n < 2: return None
    v = list(struct.unpack(endian+"%dI"%n, data[:n*4]))
    k = list(struct.unpack(endian+"4I", key[:16]))
    delta = 0x9e3779b9
    rounds = 6 + 52//n
    sum_ = (rounds*delta) & MASK
    y = v[0]
    for _ in range(rounds):
        e = (sum_ >> 2) & 3
        for p in range(n-1,0,-1):
            z = v[p-1]
            mx = (((z>>5 ^ (y<<2)&MASK) + (y>>3 ^ (z<<4)&MASK)) & MASK) ^ (((sum_ ^ y) + (k[(p&3)^e] ^ z)) & MASK)
            v[p] = (v[p] - mx) & MASK
            y = v[p]
        p = 0
        z = v[n-1]
        mx = (((z>>5 ^ (y<<2)&MASK) + (y>>3 ^ (z<<4)&MASK)) & MASK) ^ (((sum_ ^ y) + (k[(p&3)^e] ^ z)) & MASK)
        v[0] = (v[0] - mx) & MASK
        y = v[0]
        sum_ = (sum_ - delta) & MASK
    return struct.pack(endian+"%dI"%n, *v)

def score(b):
    if b is None: return -1
    s=0
    if b[:4]==b'dex\n': s+=100
    if b[:2]==b'PK': s+=100
    if b'dex\n035' in b[:64]: s+=80
    # printable ratio
    pr = sum(1 for c in b[:4096] if 32<=c<127)/4096
    return s+pr

cands = {}
cands["raw16"]=b"eCrypt_v2.1.6_k3"
cands["full24_pad"]=(b"eCrypt_v2.1.6_k3YJn1D3x"+b"\x00"*8)[:16]
cands["md5full"]=hashlib.md5(b"eCrypt_v2.1.6_k3YJn1D3x").digest()
cands["hex"]=bytes.fromhex("1e0db84fb3ed1c750c407529b32693dd")
cands["eCrypt_asset_str"]=b"1e0db84fb3ed1c750c407529b32693dd"[:16]

# xor variants
hexk=bytes.fromhex("1e0db84fb3ed1c750c407529b32693dd")
xk=(b"eCrypt_v2.1.6_k3"[:16])
cands["xor_hex_xk"]=bytes(a^b for a,b in zip(hexk,xk))

for name,key in list(cands.items()):
    for endian in ("<",">"):
        for off in (0,):
            out=xxtea_decrypt(data[off:], key, endian)
            sc=score(out)
            print(f"{name:20s} {endian} off{off} score={sc:.3f} head={out[:8].hex() if out else None}")
