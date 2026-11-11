import struct
MASK=0xffffffff
def xxtea_decrypt(data, key):
    n=len(data)//4
    v=list(struct.unpack("<%dI"%n, data[:n*4]))
    k=list(struct.unpack("<4I", key[:16]))
    delta=0x9e3779b9
    rounds=6+52//n
    sum_=(rounds*delta)&MASK
    y=v[0]
    for _ in range(rounds):
        e=(sum_>>2)&3
        for p in range(n-1,0,-1):
            z=v[p-1]
            mx=((((z>>5)^((y<<2)&MASK))+((y>>3)^((z<<4)&MASK)))&MASK)^(((sum_^y)+(k[(p&3)^e]^z))&MASK)
            v[p]=(v[p]-mx)&MASK
            y=v[p]
        z=v[n-1]
        mx=((((z>>5)^((y<<2)&MASK))+((y>>3)^((z<<4)&MASK)))&MASK)^(((sum_^y)+(k[0^e]^z))&MASK)
        v[0]=(v[0]-mx)&MASK
        y=v[0]
        sum_=(sum_-delta)&MASK
    return struct.pack("<%dI"%n,*v)

data=open("hc/assets/eCrypt.bin","rb").read()
key=b"eCrypt_v2.1.6_k3"
out=xxtea_decrypt(data,key)
open("/tmp/opencode/ecrypt_dec.bin","wb").write(out)
print("decrypted size",len(out))
# parse dex header
def dex_header(b, off):
    magic=b[off:off+8]
    if magic[:4]!=b'dex\n': return None
    checksum,=struct.unpack("<I",b[off+8:off+12])
    sig=b[off+12:off+32]
    file_size,header_size,endian_tag=struct.unpack("<III",b[off+32:off+44])
    return dict(magic=magic.decode('latin1'),ver=magic[4:7].decode(),file_size=file_size,header_size=header_size,endian=hex(endian_tag))
off=0; idx=0
while off < len(out)-112:
    h=dex_header(out,off)
    if not h:
        print("no dex at",off); break
    print("dex",idx,"at",off,h)
    if h['file_size']<=0: break
    off+=h['file_size']; idx+=1
print("remaining", len(out)-off)
