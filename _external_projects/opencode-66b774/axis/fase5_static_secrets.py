"""Fase 5 — katalog secrets statis AXISnet 11.1.0 (semua dari libnative-lib.so).

Pipeline yang dipakai (semuanya hasil baca smali, bukan tebakan):
  getPosN()      -> Regex("[A-Zg-z]").replace(s, "") -> Consta.toString (reverse + hex pair)
  decryptString  -> DESede/ECB/NoPadding (bukti: getPos9/10/11), kunci = salt dipad '\\0' s/d 24
  hasil decrypt  -> Kotlin trim (buang karakter <= ' ')
"""
import base64
import json
import re

from cryptography.hazmat.decrepit.ciphers.algorithms import TripleDES
from cryptography.hazmat.primitives.ciphers import Cipher, modes

STR = json.load(open("/tmp/opencode/axis/fase5-native-strings.json"))
REGEX = re.compile(r"[A-Zg-z]")
B64 = re.compile(r"^[A-Za-z0-9+/_-]+={0,2}$")

SALT = "ae432353a4eb4eb9"          # getSaltKey / getMsisdnSaltKey
SECRET = "2eb9362dd64b1e56"        # getSecretKey


def pad(s: str, n: int = 24) -> bytes:
    b = s.encode()
    return b + b"\x00" * ((n - len(b) % n) % n)


def b64u(v: str) -> bytes:
    v = v.strip().replace("\n", "").replace("\r", "")
    v = v.replace("-", "+").replace("_", "/")
    return base64.b64decode(v + "=" * (-len(v) % 4))


def desede_decrypt(ct: bytes, key24: bytes) -> bytes:
    d = Cipher(TripleDES(key24), modes.ECB()).decryptor()
    return d.update(ct) + d.finalize()


def kotlin_trim(s: str) -> str:
    """Kotlin trim(): buang semua karakter <= ' ' (termasuk NUL hasil zero-pad)."""
    return s.strip("".join(chr(c) for c in range(0, 33)))


def try_decrypt(blob: str, salts=(SALT, SECRET)):
    """decryptString gaya CryptoTool; kembalikan daftar (salt, plaintext) yang printable."""
    out = []
    try:
        ct = b64u(blob)
    except Exception:  # noqa: BLE001
        return out
    if not ct or len(ct) % 8:
        return out
    for s in salts:
        try:
            pt = desede_decrypt(ct, pad(s))
        except Exception:  # noqa: BLE001
            continue
        txt = pt.decode("latin-1")
        trimmed = kotlin_trim(txt)
        printable = all(32 <= ord(c) < 127 for c in trimmed) and trimmed != ""
        out.append({"salt": s, "printable": printable, "plain": trimmed,
                    "raw_len": len(pt), "pad_nul": len(txt) - len(trimmed)})
    return out


def consta_decode(s: str) -> str | None:
    stripped = REGEX.sub("", s)
    if len(stripped) < 4 or not re.fullmatch(r"[0-9a-f]+", stripped):
        return None
    r = stripped[::-1]
    try:
        return "".join(chr(int(r[i:i + 2], 16)) for i in range(0, len(r) - 1, 2))
    except ValueError:
        return None


cat = {}
for name, info in sorted(STR.items()):
    if "value" not in info:
        continue
    short = name.replace("Java_com_axis_net_", "")
    val = info["value"]
    entry = {"raw": val}
    dec = consta_decode(val) if ("getPos" in short or val.startswith("Ad3")) else None
    if dec:                                   # string obfuscated ala getPosN
        entry["pos_decoded"] = dec
        val = dec
    if val.startswith(("http://", "https://")):
        entry["kind"] = "url"
    elif B64.match(val) and len(val) >= 12:
        entry["kind"] = "blob"
        try:
            n = len(b64u(val))
            entry["ct_len"] = n if n % 8 == 0 else None
        except Exception:  # noqa: BLE001
            entry["ct_len"] = None
        tr = try_decrypt(val)
        good = [t for t in tr if t["printable"]]
        if good:
            entry["decrypt"] = good
    else:
        entry["kind"] = "plain"
    cat[short] = entry

json.dump(cat, open("/tmp/opencode/axis/fase5-secrets.json", "w"), indent=1)

print("=== TERDECRYPT (DESede/ECB/NoPadding, salt statis) ===")
for k, v in cat.items():
    for d in v.get("decrypt", []):
        if d["printable"]:
            print(f"{k}\n   salt={d['salt']}  nul_tail={d['pad_nul']}  =>  {d['plain']!r}")
print("\n=== POS-DECODED ===")
for k, v in cat.items():
    if "pos_decoded" in v:
        print(f"{k:70s} -> {v['pos_decoded']!r}")
print(f"\ntotal entri: {len(cat)} -> fase5-secrets.json")
