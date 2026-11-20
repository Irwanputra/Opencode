"""Fase 5 — decode string obfuscated getPosN() + blob native lain.

Rumus (dari smali EnumCrypto.<clinit>, O5/a$a.c()/b(), Consta$Companion.toString):
  1. Regex("[A-Zg-z]").replace(getPosN, "")     # buangan huruf kapital & g..z
  2. Consta.toString(s): reverse, lalu per 2 karakter -> parseInt(radix 16) -> char
"""
import base64
import json
import re

from cryptography.hazmat.decrepit.ciphers.algorithms import TripleDES
from cryptography.hazmat.primitives.ciphers import Cipher, modes

NK = json.load(open("../fase4/native_keys.json"))
REGEX = re.compile(r"[A-Zg-z]")


def consta_to_string(s: str) -> str:
    s = s[::-1]
    out = []
    i = 0
    while i < len(s):
        pair = s[i:i + 2]
        if len(pair) < 2:
            break
        out.append(chr(int(pair, 16)))
        i += 2
    return "".join(out)


def decode_pos(s: str) -> str:
    return consta_to_string(REGEX.sub("", s))


def pad(s: str, n=24) -> bytes:
    b = s.encode()
    return b + b"\x00" * ((n - len(b) % n) % n)


def b64u(v: str) -> bytes:
    v = v.replace("\n", "").replace("\r", "")
    v = v.replace("-", "+").replace("_", "/")
    return base64.b64decode(v + "=" * (-len(v) % 4))


def desede(ct: bytes, salt: str) -> bytes:
    d = Cipher(TripleDES(pad(salt)), modes.ECB()).decryptor()
    return (d.update(ct) + d.finalize()).rstrip(b"\x00")


print("== getPos1..12 (Regex strip + Consta.toString) ==")
for k, v in NK.items():
    if "getPos" not in k or "value" not in v:
        continue
    name = k.split("AxisnetHelpers_")[-1]
    stripped = REGEX.sub("", v["value"])
    try:
        dec = decode_pos(v["value"])
    except Exception as e:  # noqa: BLE001
        dec = f"<err {e}>  strip={stripped!r}"
    print(f"{name:8s} raw={v['value'][:40]!r}\n         strip={stripped!r}\n         DECODE={dec!r}")

print("\n== blob lain (DESede/ECB, salt berbeda) ==")
salts = {
    "saltKey": NK["Java_com_axis_net_helper_AxisnetHelpers_getSaltKey"]["value"],
    "secretKey": NK["Java_com_axis_net_helper_AxisnetHelpers_getSecretKey"]["value"],
}
for keyname in ("Java_com_axis_net_helper_AxisnetHelpers_getOtpCode",
                "Java_com_axis_net_helper_AxisnetHelpers_getAppsFlayerKey"):
    v = NK[keyname]["value"]
    short = keyname.split("AxisnetHelpers_")[-1]
    ct = b64u(v)
    print(f"{short}: blob={v!r} ct_len={len(ct)}")
    for sname, salt in salts.items():
        try:
            print(f"   {sname:8s} -> {desede(ct, salt)!r}")
        except Exception as e:  # noqa: BLE001
            print(f"   {sname:8s} -> err {e}")
