"""Fase 5 — bukti: flag `decryptResponse` pada jalur API biasa adalah FALSE.

`NativeLibImpl.decryptResponse(boolean flag, String value)` (evidence/nativelibimpl.txt):

    flag != 0 -> T5/g.a(value, saltKey, algorithm, mode, padding)   # DESede
    flag == 0 -> T5/g.b(value)   # UTF-8 bytes -> Base64.decode -> String -> trim

Script ini menjalankan konstanta-propagasi SEDERHANA di setiap method yang
memanggil `NativeLib->decryptResponse(Z, String)`:

  * `const/4 vN, K`            -> vN = K
  * `move vA, vB`              -> vA = vB
  * idiom Kotlin `if-eqz vC, +4h ; move vF, vONE ; goto +2h ; move vF, vZERO`
    (= `flag = (kondisi != 0)`); kalau nilai vC diketahui, cabang yang diambil
    dihitung dan tiga instruksi berikutnya dilewati.
  * instruksi yang menulis ulang register flag -> nilainya dibuang.

Register flag diambil dari bentuk panggilan Dalvik (interface, jadi ada 3
operand register): `invoke-interface vOBJ, vFLAG, vDATA, L...;->decryptResponse(...)`.

Pakai:  python3 fase5_decrypt_flag.py > evidence/decrypt-flag.txt
"""
import glob
import re

from loguru import logger

logger.remove()

from androguard.core.dex import DEX  # noqa: E402

ROOT = "../"
DEXES = sorted(
    glob.glob(f"{ROOT}scratch-apk/classes*.dex")
    + glob.glob(f"{ROOT}extract/axis/dex/classes*.dex")
    + glob.glob(f"{ROOT}fase3/tmp*.dex")
)

CALL = re.compile(r"NativeLib;->decryptResponse\(Z")
CONST = re.compile(r"^const/(?:4|16)\s+v(\d+),\s*(-?\d+)\s*$")
MOVE = re.compile(r"^move(?:/from16|/16)?\s+v(\d+),\s*v(\d+)\s*$")
IF_EQZ = re.compile(r"^if-eqz\s+v(\d+),\s*\+\w+\s*$")
UNKNOWN = "?"


def flag_register(ins):
    """Register flag dari `invoke... vOBJ, vFLAG, vDATA, <klass>;->decryptResponse(...)`."""
    head = ins.split("Lcom/")[0]
    head = head[head.find(" ") + 1:]          # buang mnemonic
    regs = [t.strip() for t in head.split(",") if re.fullmatch(r"[vp]\d+", t.strip())]
    return regs[1] if len(regs) >= 3 else None


def analyze(outs):
    """Daftar (idx_call, nilai_flag, catatan) untuk tiap call-site decryptResponse."""
    env, hits, skip = {}, [], 0
    for idx, ins in enumerate(outs):
        if skip:
            skip -= 1
            continue
        m = CONST.match(ins)
        if m:
            env[f"v{m.group(1)}"] = int(m.group(2))
            continue
        m = MOVE.match(ins)
        if m:
            env[f"v{m.group(1)}"] = env.get(f"v{m.group(2)}", UNKNOWN)
            continue
        if IF_EQZ.match(ins) and idx + 3 < len(outs):
            cond = re.match(r"^if-eqz\s+v(\d+)", ins).group(1)
            nxt = [MOVE.match(outs[idx + k]) for k in (1, 2, 3)]
            if nxt[0] and outs[idx + 2].startswith("goto") and nxt[2]:
                # flag = (kondisi != 0); jika kondisi konstan, pilih cabangnya
                val = env.get(f"v{cond}", UNKNOWN)
                if val is not UNKNOWN:
                    take_jump = val == 0            # if-eqz: lompat bila 0
                    src = nxt[2] if take_jump else nxt[0]
                    env[f"v{src.group(1)}"] = env.get(f"v{src.group(2)}", UNKNOWN)
                    skip = 3 if take_jump else 2
                continue
        if CALL.search(ins):
            flag = flag_register(ins)
            hits.append((idx, env.get(flag, UNKNOWN) if flag else UNKNOWN, ins))
            continue
        # instruksi lain: kalau menulis register flag (operand pertama), buangnya
        m = re.match(r"^(?:move-result(?:/object|/wide)?|move-exception|const-string.*"
                     r"|const-class.*|iget[\w/-]*|array-length|new-instance|add[\w/-]*"
                     r"|sub[\w/-]*|mul[\w/-]*|div[\w/-]*|rem[\w/-]*|and[\w/-]*|or[\w/-]*"
                     r"|xor[\w/-]*|not[\w/-]*|neg[\w/-]*|filled-new-array.*)\s+v(\d+)", ins)
        if m:
            env[f"v{m.group(1)}"] = UNKNOWN
    return hits


results = {}
for path in DEXES:
    tag = path.split("/")[-1]
    try:
        d = DEX(open(path, "rb").read())
    except Exception:  # noqa: BLE001
        continue
    for cls in d.get_classes():
        for m in cls.get_methods():
            code = m.get_code()
            if code is None:
                continue
            try:
                # androguard: get_output() HANYA operand; mnemonic dari get_name()
                outs = [f"{i.get_name()} {i.get_output()}"
                        for i in code.get_bc().get_instructions()]
            except Exception:  # noqa: BLE001
                continue
            if not any(CALL.search(o) for o in outs):
                continue
            hits = analyze(outs)
            if hits:
                results[(cls.get_name(), m.get_name(), tag)] = hits

tot = sum(len(v) for v in results.values())
zero = sum(1 for v in results.values() for _, val, _ in v if val == 0)
one = sum(1 for v in results.values() for _, val, _ in v if val == 1)
print(f"call-site NativeLib.decryptResponse : {tot} di {len(results)} method")
print(f"  flag = 0  (Base64 / T5/g.b)        : {zero}")
print(f"  flag = 1  (DESede / T5/g.a)        : {one}")
print(f"  tidak dipastikan (register dinamis) : {tot - zero - one}")
print("\nper method:")
for (cn, mn, tag), hits in sorted(results.items()):
    vals = "/".join(str(v) for _, v, _ in hits)
    print(f"  flag={vals:<5s} {cn}.{mn}  [{tag}]")
