"""Fase 5 — coba decode kunci Tempest secara STATIS.

Bahan: blob ciphertext dari libnative-lib.so (fase4/native_keys.json) +
saltKey plaintext yang juga string statis di .so yang sama.
Rumus Java (hasil fase 4): CryptoTool.decryptString(v, saltKey)
  key = pad(saltKey, 24, '\0');  ct = base64url_decode(v);  DESede/ECB/padding
"""
import base64, json, sys

from cryptography.hazmat.primitives.ciphers import Cipher, algorithms, modes

NK = json.load(open("../fase4/native_keys.json"))


def pad(s, n, ch="\0"):
    s = s.encode()
    rem = (n - len(s) % n) % n
    return s + ch.encode() * rem


def triple_des(data: bytes, key: bytes, decrypt=True):
    c = Cipher(algorithms.TripleDES(key), modes.ECB()).decryptor() if decrypt \
        else Cipher(algorithms.TripleDES(key), modes.ECB()).encryptor()
    return c.update(data) + c.finalize()


def b64url_decode(v: str) -> bytes:
    v = v.replace("\n", "").replace("\r", "")
    v = v.replace("-", "+").replace("_", "/")
    v += "=" * (-len(v) % 4)
    return base64.b64decode(v)


def unpad_pkcs5(b: bytes) -> bytes:
    n = b[-1]
    if 1 <= n <= 8 and b[-n:] == bytes([n]) * n:
        return b[:-n]
    return b


def show(tag, raw):
    printable = all(32 <= c < 127 for c in raw)
    txt = raw.decode("latin-1")
    print(f"  {tag:12s} len={len(raw):3d} printable={printable!s:5s} {txt!r}")


SALTS = {
    "saltKey/getMsisdnSaltKey": NK["Java_com_axis_net_helper_AxisnetHelpers_getSaltKey"]["value"],
    "secretKey": NK["Java_com_axis_net_helper_AxisnetHelpers_getSecretKey"]["value"],
}

TARGETS = [k for k in NK if "Signature_keyTempest" in k or "Signature_apiKey" in k]

for saltname, salt in SALTS.items():
    print(f"\n=== salt = {saltname} ({salt!r}) ===")
    key = pad(salt, 24)
    for t in TARGETS:
        v = NK[t]["value"]
        name = t.split("Signature_")[-1]
        ct = b64url_decode(v)
        print(f"{name}: blob={v}  ct_len={len(ct)} ({len(ct)//8} DES blok)")
        for padmode in ("PKCS5", "NoPadding"):
            try:
                pt = triple_des(ct, key)
                raw = unpad_pkcs5(pt) if padmode == "PKCS5" else pt
                show(padmode, raw)
            except Exception as e:
                print(f"  {padmode:12s} ERROR {e}")
