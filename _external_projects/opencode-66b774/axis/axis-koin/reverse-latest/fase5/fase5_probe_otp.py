"""Fase 5 — probe signature OTP ke server NYATA memakai nomor mustahil.

Nomor 00000000000000 tidak mungkin berisi nomor AXIS aktif, dan server membalas
"Invalid signature" SEBELUM soal nomor, jadi percobaan ini tidak mengirim SMS.

Signature keluarga j/v (bukti smali Signature.j/v + w di viewModel/g.sendDataOtp):
    message = "POST;" + path + ";" + f1..f8 (null -> "") + ";" + apiKey()
    key     = u() = staging ? decrypt(keyTempest) : decrypt(keyTempestCapital)
Mask argumen `Signature.w` = 252 -> yang eksplisit hanya path, f1 (msisdn) dan
f8 (deviceType); f2..f7 default (null -> "").

Pakai: python3 fase5_probe_otp.py
"""
import hashlib
import hmac
import json
import os
import sys
import urllib.request
import urllib.error

sys.path.insert(0, os.path.join(os.path.dirname(os.path.abspath(__file__)), "..", ".."))
import axisnet_api as A  # noqa: E402

URL = A.AXIS_API["otp_request"]
PATH = "/v1/otp"
MSISDN = "00000000000000"
ENC = A.tempest_encrypt_sso(MSISDN)
BLOB = A.APP_API_KEY_BLOB
K = A.static_keys()

# urutan field dalam pesan (8 field sebelum apiKey)
FIELD_SETS = {}
# Semua penempatan 2 field yang mungkin (encMsisdn & deviceType) di antara 8 slot.
for _i in range(8):
    for _j in range(8):
        if _i == _j:
            continue
        f = [""] * 8
        f[_i] = ENC
        f[_j] = "android"
        FIELD_SETS[f"msisdn@f{_i + 1} tipe@f{_j + 1}"] = list(f)
FIELD_SETS["hanya msisdn@f1"] = [ENC] + [""] * 7
FIELD_SETS["hanya msisdn@f8"] = [""] * 7 + [ENC]

KEYS = {
    "u()=keyTempestCapital(prod)": K["keyTempestCapital"],
    "t()=keyTempest(staging)": K["keyTempest"],
    "g()/h() marketCapital": K["keyTempestMarketCapital"],
}
APIKEYS = {"blob": BLOB, "apiKeyPlaintext": K["apiKey"], "clientID": A.APP_OTP_OAUTH["client_id"]}
BODY = {"msisdn": ENC, "deviceType": "android"}


def post(msg, key, api_key_header):
    sig = hmac.new(key.encode(), msg.encode(), hashlib.sha256).hexdigest()
    hdr = {"Content-Type": "application/json", "Connection": "keep-alive",
           "X-API-KEY": api_key_header, "x-app-version": "11.1.0",
           "x-signature": sig, "User-Agent": A.APP_USER_AGENT}
    req = urllib.request.Request(URL, data=json.dumps(BODY).encode(),
                                 headers=hdr, method="POST")
    try:
        with urllib.request.urlopen(req, timeout=30) as r:
            return r.status, r.read().decode()[:200]
    except urllib.error.HTTPError as e:
        return e.code, e.read().decode()[:200]


print("encMsisdn =", ENC)
best = []
for kname, key in KEYS.items():
    for fname, fields in FIELD_SETS.items():
        for aname, akey in APIKEYS.items():
            msg = ";".join(["POST", PATH] + fields + [akey])
            st, txt = post(msg, key, BLOB)
            ok = "Invalid signature" not in txt
            mark = "  <<<" if ok else ""
            print(f"{kname:28s} {fname:20s} {aname:16s} -> {st} {txt[:96]!r}{mark}")
            if ok:
                best.append((kname, fname, aname, st, txt))
                break

print("\nPesan yang lolos signature:")
for b in best:
    print("  ", b)
if not best:
    print("  (tidak ada — semua kombinasi ditolak 'Invalid signature')")
