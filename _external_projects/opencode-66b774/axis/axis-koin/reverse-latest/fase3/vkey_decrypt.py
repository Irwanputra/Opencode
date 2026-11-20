#!/usr/bin/env python3
"""Phase 3: reimplement the V-Key loader decrypt for AXISnet 11.1.0 tmp* assets.

Pipeline recovered from libfgazvajhxc.so (hqore @0x1aac0, decompress @0x1c218):
  per tmp file i (name table .data 0x4a1b0, order below):
    key[i] = .data[table2[i]][0:32] XOR .data[table3[i]][0:32]
      table2 @0x4a1e8 -> slots 0x4a010,0x4a050,0x4a090,0x4a0d0,0x4a110,0x4a150,0x4a190
      table3 @0x4a220 -> slots 0x49ff0,0x4a030,0x4a070,0x4a0b0,0x4a0f0,0x4a130,0x4a170
      (.data file offset = va - 0x8000; no relocs touch these slots)
    raw = file bytes; iv = raw[0:12]; ct = raw[12:len-16]; tag = raw[len-16:]
    AES-256-GCM decrypt, no AAD (add_len=0 in both call sites) -> gzip stream
    gzip inflate (inflateInit2_ wbits=31) -> DEX
"""
import gzip, struct, sys
from Crypto.Cipher import AES

SO = "/home/hatch/workspace/axis-koin/reverse-latest/extract/axis/so/lib/arm64-v8a/libfgazvajhxc.so"
ASSETS = "/tmp/fase3/assets/assets"
NAMES = ["tmp17680616876221785051", "tmp3065699920606524921", "tmp14169616706995394833",
         "tmp13997699941173334308", "tmp12794277964480025953", "tmp7028462203480471573",
         "tmp13784499609711825650"]
T2 = [0x4A010, 0x4A050, 0x4A090, 0x4A0D0, 0x4A110, 0x4A150, 0x4A190]
T3 = [0x49FF0, 0x4A030, 0x4A070, 0x4A0B0, 0x4A0F0, 0x4A130, 0x4A170]

so = open(SO, "rb").read()
def data_at(va, n):
    return so[va - 0x8000: va - 0x8000 + n]  # .data vaddr 0x49ff0 <-> file 0x41ff0

def dex_info(b):
    if len(b) < 0x70 or b[:4] != b"dex\n":
        return "NOT A DEX"
    file_size, header_size, endian = struct.unpack_from("<III", b, 0x20)
    class_defs_size = struct.unpack_from("<I", b, 0x60)[0]
    return (f"DEX OK file_size={file_size} (actual {len(b)}) header_size={header_size:#x} "
            f"endian={endian:#x} class_defs_size={class_defs_size}")

ok = 0
for i, name in enumerate(NAMES):
    k2, k3 = data_at(T2[i], 32), data_at(T3[i], 32)
    key = bytes(a ^ b for a, b in zip(k2, k3))
    raw = open(f"{ASSETS}/{name}", "rb").read()
    iv, ct, tag = raw[:12], raw[12:len(raw) - 16], raw[len(raw) - 16:]
    try:
        pt = AES.new(key, AES.MODE_GCM, nonce=iv).decrypt_and_verify(ct, tag)
        gcm = "GCM TAG OK"
    except ValueError as e:
        print(f"[{i}] {name} len={len(raw)}: GCM FAILED ({e}) key={key.hex()[:16]}...")
        continue
    print(f"[{i}] {name} len={len(raw)}: {gcm}, plaintext {len(pt)} bytes, head={pt[:8].hex()} "
          f"(gzip magic={pt[:2].hex()})")
    try:
        dex = gzip.decompress(pt)
        print(f"     gzip OK -> {len(dex)} bytes; {dex_info(dex)}")
        open(f"/tmp/fase3/{name}.dex", "wb").write(dex)
        ok += 1
    except Exception as e:
        print(f"     gzip FAILED: {e}")
        open(f"/tmp/fase3/{name}.plaintext.bin", "wb").write(pt)
print(f"\n{ok}/7 tmp files -> valid DEX")
