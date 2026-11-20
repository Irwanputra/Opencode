#!/usr/bin/env python3
"""Phase 3: static analysis of libfgazvajhxc.so (V-Key DexObfuscator loader).
- Disassemble .text with Capstone, resolve ADRP+ADD targets, annotate .rodata strings.
- Build PLT->import map from readelf -r, resolve BL targets.
- Find xrefs to interesting .rodata strings (tmp* names, JNI class/method names).
- Scan .data.rel.ro for JNINativeMethod-like triples (name,sig,fnPtr).
- List .rodata addresses referenced by V-Key-region code that are NOT strings
  (candidate key/IV blobs).
No secrets are printed in full: blobs are shown truncated (first 8 bytes hex).
"""
import re, struct, subprocess, sys
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from capstone.arm64 import ARM64_OP_REG, ARM64_OP_IMM, ARM64_OP_MEM

SO = "/home/hatch/workspace/axis-koin/reverse-latest/extract/axis/so/lib/arm64-v8a/libfgazvajhxc.so"
OUT = "/tmp/fase3"
data = open(SO, "rb").read()

TEXT_OFF, TEXT_SIZE = 0x1A970, 0x23504
RODATA_OFF, RODATA_SIZE = 0xFAD0, 0x4C2C
DATARELRO_VADDR, DATARELRO_OFF, DATARELRO_SIZE = 0x42660, 0x3E660, 0x32C0
VKEY_START, VKEY_END = 0x1A970, 0x1C498   # before mbedtls_gcm_init

def cstr(addr):
    """read NUL-terminated printable string at vaddr==fileoff in .rodata"""
    if not (RODATA_OFF <= addr < RODATA_OFF + RODATA_SIZE):
        return None
    end = data.find(b"\x00", addr)
    if end < 0:
        return None
    s = data[addr:end]
    if len(s) < 3 or any(b < 9 or (13 < b < 32) or b > 126 for b in s):
        return None
    return s.decode()

# ---- PLT map: parse readelf -r ----
plt_map = {}   # plt stub addr -> import name
r = subprocess.run(["readelf", "-r", SO], capture_output=True, text=True).stdout
relocs = []
for line in r.splitlines():
    m = re.match(r"([0-9a-f]{8,})\s+[0-9a-f]+\s+R_AARCH64_JUMP_SL\s+[0-9a-f]+\s+(.+?)\s*\+ 0$", line.strip())
    if m:
        relocs.append((int(m.group(1), 16), m.group(2).strip()))
# PLT0 at 0x3de80 (16B), stub i at 0x3de90+16*i ; got slot = 0x45c10+8*i
for i, (got, name) in enumerate(relocs):
    plt_map[0x3DEA0 + 16 * i] = name
    assert got == 0x45C10 + 8 * i, (hex(got), i)

# ---- dynsym map ----
sym_map = {}
r = subprocess.run(["nm", "-D", SO], capture_output=True, text=True).stdout
for line in r.splitlines():
    m = re.match(r"([0-9a-f]{16}) [TtDdBbRr] (\S+)", line.strip())
    if m:
        sym_map[int(m.group(1), 16)] = m.group(2)

# ---- disassemble .text ----
md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
md.detail = True
insns = list(md.disasm(data[TEXT_OFF:TEXT_OFF + TEXT_SIZE], TEXT_OFF))
print(f"disassembled {len(insns)} instructions, .text {hex(TEXT_OFF)}..{hex(TEXT_OFF+TEXT_SIZE)}")
by_addr = {i.address: i for i in insns}

# ---- resolve ADRP/ADD chains (linear per-function, reset on BL/RET) ----
# regval: reg name -> known absolute value (or None)
def regname(op):
    return insn.reg_name(op.reg) if hasattr(insn, "reg_name") else str(op.reg)

targets = {}   # insn addr -> resolved target addr (adrp/add result)
xrefs = {}     # target addr -> list of (insn addr, mnemonic)
regval = {}
for insn in insns:
    mn = insn.mnemonic
    ops = insn.operands
    if mn == "adrp" and len(ops) == 2 and ops[1].type == ARM64_OP_IMM:
        regval[insn.reg_name(ops[0].reg)] = ops[1].imm
    elif mn == "add" and len(ops) == 3 and ops[1].type == ARM64_OP_REG and ops[2].type == ARM64_OP_IMM:
        src = insn.reg_name(ops[1].reg)
        if src in regval and regval[src] is not None:
            v = regval[src] + ops[2].imm
            regval[insn.reg_name(ops[0].reg)] = v
            targets[insn.address] = v
            xrefs.setdefault(v, []).append((insn.address, mn))
        else:
            regval.pop(insn.reg_name(ops[0].reg), None)
    elif mn == "mov" and len(ops) == 2 and ops[1].type == ARM64_OP_IMM:
        regval[insn.reg_name(ops[0].reg)] = ops[1].imm
    elif mn in ("bl", "b") and len(ops) == 1 and ops[0].type == ARM64_OP_IMM:
        pass  # direct branch: registers survive in reality; keep simple, keep vals
    elif mn in ("ret", "blr", "br"):
        regval = {}
    elif mn.startswith("ldr") and len(ops) >= 2:
        # ldr xd, [xn, #off] with known xn -> record load target
        if ops[1].type == ARM64_OP_MEM and ops[1].mem.base != 0:
            base = insn.reg_name(ops[1].mem.base)
            if base in regval and regval[base] is not None:
                v = regval[base] + ops[1].mem.disp
                xrefs.setdefault(v, []).append((insn.address, mn))
        # writing a reg invalidates simple tracking for that reg
        if ops[0].type == ARM64_OP_REG:
            regval.pop(insn.reg_name(ops[0].reg), None)
    elif mn.startswith("str") and len(ops) >= 2:
        if ops[1].type == ARM64_OP_MEM and ops[1].mem.base != 0:
            base = insn.reg_name(ops[1].mem.base)
            if base in regval and regval[base] is not None:
                v = regval[base] + ops[1].mem.disp
                xrefs.setdefault(v, []).append((insn.address, mn))
    else:
        # any other insn writing a reg: drop tracking for its dest reg (conservative)
        if ops and ops[0].type == ARM64_OP_REG:
            regval.pop(insn.reg_name(ops[0].reg), None)

# also record adrp results as xrefs
for insn in insns:
    if insn.mnemonic == "adrp" and len(insn.operands) == 2 and insn.operands[1].type == ARM64_OP_IMM:
        xrefs.setdefault(insn.operands[1].imm, []).append((insn.address, "adrp"))

# ---- function starts: BL targets + prologue scan ----
func_starts = {0x1A9C0}  # JNI_OnLoad
for insn in insns:
    if insn.mnemonic == "bl" and insn.operands and insn.operands[0].type == ARM64_OP_IMM:
        t = insn.operands[0].imm
        if TEXT_OFF <= t < TEXT_OFF + TEXT_SIZE:
            func_starts.add(t)
# prologue: stp x29, x30, [sp, #-..]!  (bytes  FD 7B ... ) - use mnemonic scan
for i, insn in enumerate(insns):
    if insn.mnemonic == "stp" and "x29" in insn.op_str and "x30" in insn.op_str and "[sp" in insn.op_str:
        func_starts.add(insn.address)
func_starts = sorted(s for s in func_starts if VKEY_START <= s < VKEY_END)
print(f"V-Key region function starts ({len(func_starts)}): " + ", ".join(hex(s) for s in func_starts))

def func_of(addr):
    import bisect
    idx = bisect.bisect_right(func_starts, addr) - 1
    return func_starts[idx] if idx >= 0 else None

# ---- interest strings ----
INTEREST = {}
for a in range(RODATA_OFF, RODATA_OFF + RODATA_SIZE):
    s = cstr(a)
    if s and (s.startswith("tmp") or s in ("makeInMemoryDexElements", "makeDexElements",
        "ClassEncryption", "VKEYObfuscation", "attach", "getAssets", "getClassLoader",
        "dalvik/system/DexPathList$Element", "com.axis.net.helper.AxisNetApplication",
        "com/axis/net/helper/AxisNetApplication", "dexElements", "mApplication",
        "mInitialApplication", "mAllApplications", "mApplicationInfo",
        "android/app/Application", "Landroid/content/pm/ApplicationInfo;",
        "android/os/Build$VERSION", "[dex_buffer] decompress: %d",
        "********** V-Key DexObfuscator version: %s **********") or "DexPathList" in s
        or "AES-" in s or s.startswith("AES")):
        INTEREST[a] = s

print("\n=== XREFS to interesting .rodata strings ===")
for addr, s in sorted(INTEREST.items()):
    refs = xrefs.get(addr, [])
    # also page-level refs: adrp to same page
    page = addr & ~0xFFF
    page_refs = xrefs.get(page, [])
    print(f"{hex(addr)} {s!r}: direct refs {[(hex(a), m) for a, m in refs]} "
          f"in funcs {[hex(func_of(a)) if func_of(a) else None for a, _ in refs]}")

# ---- BL target report in V-Key region ----
print("\n=== BL calls from V-Key region (resolved) ===")
calls = []
for insn in insns:
    if not (VKEY_START <= insn.address < VKEY_END):
        continue
    if insn.mnemonic == "bl" and insn.operands and insn.operands[0].type == ARM64_OP_IMM:
        t = insn.operands[0].imm
        name = plt_map.get(t) or sym_map.get(t) or ("local_%s" % hex(t) if TEXT_OFF <= t < TEXT_OFF + TEXT_SIZE else hex(t))
        calls.append((insn.address, t, name))
for a, t, name in calls:
    print(f"  {hex(a)} (func {hex(func_of(a))}) -> {name} ({hex(t)})")

# ---- full disassembly of V-Key region with annotations ----
with open(f"{OUT}/disasm-vkey-region.txt", "w") as f:
    for insn in insns:
        if not (VKEY_START <= insn.address < VKEY_END):
            continue
        ann = ""
        if insn.address in func_starts:
            ann += "   <== FUNCTION START"
            nm = sym_map.get(insn.address)
            if nm:
                ann += f" [{nm}]"
        # annotate resolved target
        if insn.address in targets:
            t = targets[insn.address]
            s = cstr(t)
            ann += f"   ; -> {hex(t)}" + (f" {s!r}" if s else f" bytes {data[t:t+16].hex()}" if RODATA_OFF <= t < RODATA_OFF + RODATA_SIZE else "")
        if insn.mnemonic == "bl" and insn.operands and insn.operands[0].type == ARM64_OP_IMM:
            t = insn.operands[0].imm
            name = plt_map.get(t) or sym_map.get(t)
            if name:
                ann += f"   ; call {name}"
        f.write(f"{insn.address:08x}: {insn.mnemonic:8s} {insn.op_str}{ann}\n")
print("\nwrote disasm-vkey-region.txt")

# ---- .data.rel.ro scan for JNINativeMethod triples ----
print("\n=== .data.rel.ro pointer scan (JNINativeMethod candidates) ===")
drr = data[DATARELRO_OFF:DATARELRO_OFF + DATARELRO_SIZE]
def read_qword(vaddr):
    off = vaddr - DATARELRO_VADDR + DATARELRO_OFF
    if 0 <= off <= len(data) - 8:
        return struct.unpack_from("<Q", data, off)[0]
    return None
for base in range(DATARELRO_VADDR, DATARELRO_VADDR + DATARELRO_SIZE - 24, 8):
    p0, p1, p2 = read_qword(base), read_qword(base + 8), read_qword(base + 16)
    s0, s1 = cstr(p0) if p0 else None, cstr(p1) if p1 else None
    if s0 and s1 and p2 and (TEXT_OFF <= p2 < TEXT_OFF + TEXT_SIZE or p2 in sym_map):
        print(f"  triple at {hex(base)}: name={s0!r} sig={s1!r} fn={hex(p2)} ({sym_map.get(p2, '')})")

# ---- referenced .rodata addrs that are NOT strings (candidate key blobs) ----
print("\n=== referenced .rodata addrs (non-string) in V-Key region ===")
seen = set()
for insn in insns:
    if not (VKEY_START <= insn.address < VKEY_END):
        continue
    for t in [targets.get(insn.address)]:
        if t is None or t in seen:
            continue
        seen.add(t)
        if RODATA_OFF <= t < RODATA_OFF + RODATA_SIZE and not cstr(t):
            print(f"  {hex(t)} ref from {hex(insn.address)} (func {hex(func_of(insn.address))}): "
                  f"first16={data[t:t+16].hex()} next32={data[t+16:t+48].hex()}")
