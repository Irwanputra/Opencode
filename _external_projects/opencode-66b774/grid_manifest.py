"""Cari template KDF n15 dengan oracle: manifest section (lengkap, ada tag Poly1305)."""
import json, itertools
from nacl.bindings import crypto_aead_xchacha20poly1305_ietf_decrypt as aead_open
from nacl.exceptions import CryptoError
import hc_reenc as HR

env = json.load(open("/tmp/opencode/env_parts.json"))
salt = bytes.fromhex(env["salt"])
man_nonce = bytes.fromhex(env["man_b"])
man_ct = bytes.fromhex(env["man_c"])
print(f"manifest ct: {len(man_ct)} byte; salt: {len(salt)} byte")

PKG = HR.PKG
parts = "ssh"
reader = "934"

def derive_key(prefix, salt, info):
    return HR.derive_key(prefix, salt, info)

hits = []
tried = 0
for ver in ("12", "10"):
    for cipher in ("XCHACHA20P1305", "s1"):
        for kdfn in ("NATIVE-HKDF-SHA256", "h1"):
            for scheme in ("n15", "n11"):
                for sfx in (f"|{reader}", ""):
                    aad_base = f"HCCFG|{ver}|{cipher}|{kdfn}|{scheme}|{PKG}|1|{parts}|0{sfx}"
                    for p1 in ("1", "12"):
                        for with_reader in (True, False):
                            prefix = f"HCCFG\x00{PKG}\x00{p1}\x00{parts}\x00".encode()
                            if with_reader:
                                prefix += f"{reader}\x00".encode()
                            prefix += salt
                            for info in (f"app-config|{scheme}|{PKG}|1|{parts}{sfx}",
                                         f"app-config|{scheme}|{PKG}|1|{parts}"):
                                key = derive_key(prefix, salt, info.encode())
                                for ctx in ("m", "", "s0"):
                                    aad = aad_base + ("\x00" + ctx if ctx else "")
                                    tried += 1
                                    try:
                                        pt = aead_open(man_ct, man_nonce, aad.encode(), key)
                                        hits.append((aad_base, info, p1, with_reader, ctx, pt))
                                        print("!!!!! KETEMU:", aad_base, "|", info, "| p1=", p1, "reader=", with_reader, "ctx=", ctx)
                                        print(pt[:400])
                                    except CryptoError:
                                        pass
print(f"dicek: {tried}; hit: {len(hits)}")
