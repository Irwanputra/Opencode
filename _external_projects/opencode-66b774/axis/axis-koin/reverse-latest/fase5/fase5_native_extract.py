"""Fase 5 — ekstraksi ulang string/JNI getter di libnative-lib.so (perbaikan fase 4).

Perbaikan:
  - patch strb/strh/str diperlakukan sesuai lebar sebenarnya (fase 4 menulis 4 byte
    untuk patch strh sehingga string ikut rusak),
  - panjang string dipotong pada NUL pertama setelah patch,
  - semua simbol Java_* diekstrak (bukan hanya daftar target fase 4),
  - getter yang tidak pakai adrp+add ditandai supaya bisa dilihat manual.
"""
import json
import re
import subprocess


def off_of(txt):
    """Offset capstone: bisa desimal (#1) atau hex (#0x2c)."""
    if txt is None:
        return 0
    txt = txt.lstrip("-") if txt.startswith("-") else txt
    neg = txt.startswith("-")
    v = int(txt[2:], 16) if txt.startswith("0x") else int(txt, 10)
    return -v if neg else v

from capstone import CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN, Cs

SO = "../scratch-apk/native/lib/arm64-v8a/libnative-lib.so"
OUT = "native_strings.json"

data = open(SO, "rb").read()
syms = {}
for line in subprocess.check_output(["nm", "-D", SO]).decode().splitlines():
    p = line.split()
    if len(p) == 3 and p[2].startswith("Java_"):
        syms[p[2]] = int(p[0], 16)

md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
md.detail = True
order = sorted(syms.values())

REG = [
    ("adrp", re.compile(r"adrp\s+x\d+, #0x([0-9a-f]+)")),
    ("add", re.compile(r"add\s+x\d+, x\d+, #0x([0-9a-f]+)")),
    ("mov", re.compile(r"mov\s+w\d+, #0x([0-9a-f]+)")),
    ("movk", re.compile(r"movk\s+w\d+, #0x([0-9a-f]+)(?:, lsl #(\d+))?")),
    ("movn", re.compile(r"movn\s+w\d+, #0x([0-9a-f]+)")),
    ("strb", re.compile(r"strb\s+w(\d+|zr), \[(x\d+|sp)(?:, #(-?(?:0x)?[0-9a-f]+))?\]")),
    ("strh", re.compile(r"strh\s+w(\d+|zr), \[(x\d+|sp)(?:, #(-?(?:0x)?[0-9a-f]+))?\]")),
    ("stur", re.compile(r"stur\s+w(\d+), \[(x\d+|sp), #(-?(?:0x)?[0-9a-f]+)\]")),
    ("sturh", re.compile(r"sturh\s+w(\d+|zr), \[(x\d+|sp), #(-?(?:0x)?[0-9a-f]+)\]")),
    ("str", re.compile(r"str\s+w(\d+), \[(x\d+|sp), #(-?(?:0x)?[0-9a-f]+)\]")),
    ("bl", re.compile(r"bl\s+#?(0x[0-9a-f]+)")),
]
REGD = {name: rx for name, rx in REG}


def val(reg):
    return 0 if reg == "zr" else None


def extract(name):
    addr = syms[name]
    i = order.index(addr)
    end = order[i + 1] if i + 1 < len(order) else addr + 0x400
    page = None
    src = None
    swrite = {}          # indeks -> byte (string yang dirakit di stack, bukan di .rodata)
    stag = None          # byte tag libc++ std::string (len = tag >> 1)
    pending = None          # (reg, value, bits)
    patches = []            # (offset, bytes)
    nul_off = None
    notes = []
    for ins in md.disasm(data[addr:end], addr):
        mn = ins.mnemonic
        o = mn + " " + ins.op_str  # regex memakai mnemonic sebagai awalan (konvensi fase 4)
        if mn == "adrp":
            m = REGD["adrp"].match(o)
            if m:
                page = int(m.group(1), 16)
        elif mn == "add" and page is not None and src is None:
            m = REGD["add"].match(o)
            if m:
                src = page + int(m.group(1), 16)
        elif mn in ("mov", "movk", "movn"):
            m = REGD["mov"].match(o) or REGD["movn"].match(o)
            if m:
                v = int(m.group(1), 16)
                if mn == "movn":
                    v = (~v) & 0xFFFFFFFF
                rd = o.split(None, 1)[1].split(",")[0].strip()
                pending = (rd, v, 32)
            else:
                m = REGD["movk"].match(o)
                if m and pending and pending[0] == o.split(None, 1)[1].split(",")[0].strip():
                    shift = int(m.group(2) or 0)
                    pending = (pending[0], pending[1] | int(m.group(1), 16) << shift, 32)
        elif mn in ("strb", "strh", "sturh"):
            m = REGD[mn].match(o)
            if m:
                rn = m.group(2)
                raw_off = int(m.group(3), 16) if m.group(3) else 0
                # salinan ke stack mulai dari sp+1 -> indeks buffer = offset-1 (konvensi fase 4)
                idx = raw_off - 1 if rn == "sp" else raw_off
                reg = m.group(1)
                w = 2 if mn in ("strh", "sturh") else 1
                if reg == "zr":
                    if rn == "sp" and src is None:
                        swrite[idx] = b"\x00"
                    else:
                        nul_off = max(nul_off or 0, idx)
                elif pending and pending[0] == "w" + reg:
                    b = (pending[1] & ((1 << (8 * w)) - 1)).to_bytes(w, "little")
                    if rn == "sp" and src is None:
                        if raw_off == 0:            # strb tag -> byte[0] std::string
                            stag = pending[1] >> 1
                        swrite[idx] = b
                    else:
                        patches.append((idx, b))
        elif mn in ("stur", "str"):
            m = REGD[mn].match(o)
            if m and pending and pending[0] == "w" + m.group(1):
                raw_off = off_of(m.group(3))
                idx = raw_off - 1 if m.group(2) == "sp" else raw_off
                b = (pending[1] & 0xFFFFFFFF).to_bytes(4, "little")
                if m.group(2) == "sp" and src is None:
                    swrite[idx] = b
                else:
                    patches.append((idx, b))
        elif mn == "blr":
            notes.append("blr")
    if src is None:
        if swrite:      # string dirakit di stack dari konstanta mov/movk
            n = stag if stag else (max(i + len(b) for i, b in swrite.items()))
            buf = bytearray(n)
            for i, b in sorted(swrite.items()):
                for k, byte in enumerate(b):
                    if i + k < n:
                        buf[i + k] = byte
            val = bytes(buf).split(b"\x00")[0]
            return {"src": None, "raw_len": len(val), "patches": [],
                    "value": val.decode("latin-1"), "notes": ["stack-constructed"]}
        return {"error": "no static string source (adrp+add) found", "notes": notes[:6]}
    best = max([nul_off or 0] + [o + len(b) for o, b in patches] + [1])
    buf = bytearray(data[src:src + min(best + 8, 4096)])
    for off, b in patches:
        buf[off:off + len(b)] = b
    raw = bytes(buf).split(b"\x00")[0]
    return {
        "src": hex(src),
        "raw_len": len(raw),
        "patches": [(hex(o), b.hex()) for o, b in patches],
        "value": raw.decode("latin-1"),
        "notes": notes[:6],
    }


res = {}
for n in sorted(syms):
    try:
        res[n] = extract(n)
    except Exception as e:  # noqa: BLE001
        res[n] = {"error": str(e)}
json.dump(res, open(OUT, "w"), indent=1)
ok = sum(1 for v in res.values() if "value" in v)
print(f"{len(syms)} simbol Java_*, {ok}string statis terekstrak -> {OUT}")
for n, v in res.items():
    short = n.replace("Java_com_axis_net_", "")
    if "value" in v:
        print(f"  {short}\n      = {v['value']!r}  len={v['raw_len']} patches={v['patches']}")
    else:
        print(f"  {short}\n      [{v['error']}]")
