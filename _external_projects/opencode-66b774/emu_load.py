#!/usr/bin/env python3
"""Emulate lib_eCrypt.so: deobfuscate .data, then call native load(byte[]) to
decrypt eCrypt.bin into a real dex (or whatever the payload is)."""
import struct, sys
from unicorn import *
from unicorn.arm_const import *
from elftools.elf.elffile import ELFFile

SO = "/tmp/opencode/target/lib_eCrypt.so"
data = open(SO, "rb").read()
INPUT = open(sys.argv[1] if len(sys.argv) > 1 else "/tmp/opencode/assets_ext/assets/eCrypt.bin", "rb").read()
OUT = sys.argv[2] if len(sys.argv) > 2 else "/tmp/opencode/eCrypt.dex"

f = open(SO, "rb")
elf = ELFFile(f)
segs = []
for seg in elf.iter_segments():
    if seg['p_type'] == 'PT_LOAD':
        segs.append((seg['p_vaddr'], seg['p_offset'], seg['p_filesz'], seg['p_memsz']))
segs.sort()
dynsym = elf.get_section_by_name('.dynsym')
sym_by_index = {i: s.name for i, s in enumerate(dynsym.iter_symbols())}
relocations = []
for secname in ('.rel.dyn', '.rel.plt'):
    sec = elf.get_section_by_name(secname)
    if sec is None: continue
    for r in sec.iter_relocations():
        relocations.append((r['r_offset'], r['r_info_sym'], r['r_info_type']))

STACK = 0x20000000; STACK_SIZE = 0x400000
HOOK = 0x70000000; HOOK_SIZE = 0x1000
JNI_HOOK = 0x71000000; JNI_HOOK_SIZE = 0x1000
RET_MAGIC = 0x60000000
TABLE = 0x78000000           # jni function table
ENVPTR = 0x78001000          # env (pointer to table)
HEAP = 0x40000000

mu = Uc(UC_ARCH_ARM, UC_MODE_ARM)
def map_mem(addr, size, perm=UC_PROT_ALL):
    base = addr & ~0xfff; end = (addr + size + 0xfff) & ~0xfff
    mu.mem_map(base, end - base, perm)
for v, o, fs, ms in segs:
    map_mem(v, ms); mu.mem_write(v, data[o:o+fs])
map_mem(STACK, STACK_SIZE); map_mem(HOOK, HOOK_SIZE); map_mem(JNI_HOOK, JNI_HOOK_SIZE)
map_mem(RET_MAGIC, 0x1000); map_mem(TABLE, 0x3000); map_mem(HEAP, 0x1000000)
SP = STACK + STACK_SIZE // 2

# imports
import_tbl = {}; idx = 1
for r_off, sym, rtype in relocations:
    name = sym_by_index.get(sym, "")
    if rtype in (21, 22, 2) and sym != 0:
        if name not in import_tbl:
            import_tbl[name] = HOOK + idx * 8; idx += 1
        mu.mem_write(r_off, struct.pack("<I", import_tbl[name]))
lookup = {v: k for k, v in import_tbl.items()}
print("imports:", import_tbl)

heap_ptr = [HEAP + 0x1000]
def alloc(n):
    p = heap_ptr[0]; heap_ptr[0] = (p + n + 0xF) & ~0xF; return p

def on_hook(uc, address, size, user):
    name = lookup.get(address, "?")
    lr = uc.reg_read(UC_ARM_REG_LR)
    r0, r1, r2, r3 = (uc.reg_read(g) for g in (UC_ARM_REG_R0, UC_ARM_REG_R1, UC_ARM_REG_R2, UC_ARM_REG_R3))
    ret = 0
    try:
        ret = _hook_impl(name, uc, r0, r1, r2, r3)
    except Exception as e:
        print(f"  [hook-err] {name} r0={hex(r0)} r1={hex(r1)} r2={hex(r2)}: {e!r}")
    uc.reg_write(UC_ARM_REG_R0, ret)
    uc.reg_write(UC_ARM_REG_PC, lr)

def _hook_impl(name, uc, r0, r1, r2, r3):
    if name in ("memcpy", "__aeabi_memcpy", "__aeabi_memcpy4", "__aeabi_memcpy8", "memmove"):
        uc.mem_write(r0, bytes(uc.mem_read(r1, r2))); return r0
    if name in ("memset", "__aeabi_memset", "__aeabi_memset4", "__aeabi_memset8"):
        uc.mem_write(r0, b"\x00" * r2); return r0
    if name in ("__aeabi_memclr", "__aeabi_memclr4", "__aeabi_memclr8"):
        uc.mem_write(r0, b"\x00" * r1); return r0
    if name == "strlen":
        a = r0
        while bytes(uc.mem_read(a, 1)) != b"\x00":
            a += 1
        return a - r0
    if name == "malloc":
        return alloc(r0)
    if name == "calloc":
        p = alloc(r0 * r1); uc.mem_write(p, b"\x00" * (r0 * r1)); return p
    if name == "realloc":
        return alloc(r1)
    if name == "free":
        return 0
    if name == "memcmp":
        a = bytes(uc.mem_read(r0, r2)); b = bytes(uc.mem_read(r1, r2))
        return 0 if a == b else (1 if a > b else -1)
    if name == "__stack_chk_fail":
        print("  !! __stack_chk_fail"); uc.emu_stop(); return 0
    print(f"  [import] {name} (r0={hex(r0)},r1={hex(r1)},r2={hex(r2)}) -> 0")
    return 0
mu.hook_add(UC_HOOK_CODE, on_hook, begin=HOOK, end=HOOK + HOOK_SIZE)

def run(addr, maxc=0, trace=False):
    if addr & 1:
        mu.reg_write(UC_ARM_REG_CPSR, mu.reg_read(UC_ARM_REG_CPSR) | 0x20)
    mu.reg_write(UC_ARM_REG_SP, SP)
    mu.reg_write(UC_ARM_REG_LR, RET_MAGIC | 1)
    try:
        mu.emu_start(addr, RET_MAGIC, count=maxc)
    except UcError as e:
        print(f"  emu error at {hex(mu.reg_read(UC_ARM_REG_PC))}: {e!r} args={e.args}")
    except Exception as e:
        print(f"  emu EXC {type(e).__name__} at {hex(mu.reg_read(UC_ARM_REG_PC))}: {e!r} args={getattr(e,'args',None)}")

def on_unmapped(uc, access, address, size, value, user):
    pc = uc.reg_read(UC_ARM_REG_PC)
    print(f"  [unmapped] access={access} addr={hex(address)} size={size} pc={hex(pc)}")
    return False
mu.hook_add(UC_HOOK_MEM_UNMAPPED, on_unmapped)

trace_buf = []
def on_trace(uc, address, size, user):
    if len(trace_buf) < 200:
        trace_buf.append(address)
mu.hook_add(UC_HOOK_CODE, on_trace, begin=0, end=0x9c87e)

# --- deobfuscate .data ---
datadiv = sorted([(s.name, s['st_value']) for s in dynsym.iter_symbols() if s.name.startswith('.datadiv_decode')], key=lambda x: x[1])
for nm, va in datadiv:
    run(va)
init_sec = elf.get_section_by_name('.init_array')
if init_sec:
    raw = init_sec.data()
    for i in range(0, len(raw), 4):
        a = struct.unpack_from("<I", raw, i)[0]
        if a:
            try:
                run(a)
            except Exception as e:
                print("init skipped", hex(a), e)

# --- JNI stubs ---
jni = {}
NEXT = [1]
arrays = {}    # handle -> (addr, len)
def jni_addr(index): return JNI_HOOK + index * 4

def on_jni(uc, address, size, user):
    lr = uc.reg_read(UC_ARM_REG_LR)
    r0, r1, r2, r3 = (uc.reg_read(g) for g in (UC_ARM_REG_R0, UC_ARM_REG_R1, UC_ARM_REG_R2, UC_ARM_REG_R3))
    print(f"  [jni-hit] addr={hex(address)} r0={hex(r0)} r1={hex(r1)} r2={hex(r2)} r3={hex(r3)}")
    ret = 0
    if address == jni_addr(6):      # FindClass
        print(f"  [jni] FindClass({r1:#x})")
    elif address == jni_addr(171):  # GetArrayLength(env, array)
        h = r1; ret = arrays[h][1]
    elif address == jni_addr(176):  # NewByteArray(env, len)
        n = r1; p = alloc(n); h = NEXT[0]; NEXT[0] += 1
        arrays[h] = (p, n); mu.mem_write(p, b"\x00" * n); ret = h
        print(f"  [jni] NewByteArray({n}) -> handle {h} @ {hex(p)}")
    elif address == jni_addr(184):  # GetByteArrayElements(env, array, isCopy)
        h = r1; ret = arrays[h][0]
    elif address == jni_addr(192):  # ReleaseByteArrayElements
        ret = 0
    elif address == jni_addr(208):  # SetByteArrayRegion(env, array, start, len, buf)
        h = r1; start = r2; ln = r3; buf = uc.reg_read(UC_ARM_REG_SP)  # 5th arg on stack
        # actually 5th arg is on stack at SP (at function entry after pop) -- read from stack frame
        # For our stub, the 5th arg is at [SP] when the bl target begins
        buf = struct.unpack("<I", uc.mem_read(uc.reg_read(UC_ARM_REG_SP), 4))[0]
        p, n = arrays[h]
        chunk = uc.mem_read(buf, ln)
        mu.mem_write(p + start, bytes(chunk))
        print(f"  [jni] SetByteArrayRegion(handle {h}, start {start}, len {ln})")
    else:
        print(f"  [jni?] addr {hex(address)} r0={hex(r0)} r1={hex(r1)} r2={hex(r2)} r3={hex(r3)}")
    uc.reg_write(UC_ARM_REG_R0, ret)
    uc.reg_write(UC_ARM_REG_PC, lr)
mu.hook_add(UC_HOOK_CODE, on_jni, begin=JNI_HOOK, end=JNI_HOOK + JNI_HOOK_SIZE)

# build table
tbl = bytearray(0x400)
for index in (6, 171, 176, 184, 192, 208):
    struct.pack_into("<I", tbl, index * 4, jni_addr(index))
mu.mem_write(TABLE, bytes(tbl))
mu.mem_write(ENVPTR, struct.pack("<I", TABLE))

# input array handle 1
INP = alloc(len(INPUT))
mu.mem_write(INP, INPUT)
arrays[1] = (INP, len(INPUT))

# call load(env, arr)  == FUN_0003b638 @ ELF 0x2b639
print(f"calling load({len(INPUT)} bytes)")
mu.reg_write(UC_ARM_REG_R0, ENVPTR)
mu.reg_write(UC_ARM_REG_R1, 0)
mu.reg_write(UC_ARM_REG_R2, 1)
trace_buf.clear()
try:
    run(0x2b639)
except Exception as e:
    print("load exception:", repr(e))
print("trace tail:", [hex(x) for x in trace_buf[-40:]])

h = mu.reg_read(UC_ARM_REG_R0)
print("returned handle:", h)
if h in arrays:
    p, n = arrays[h]
    out = bytes(mu.mem_read(p, n))
    open(OUT, "wb").write(out)
    print(f"wrote {n} bytes -> {OUT}")
    print("head:", out[:32].hex(), out[:8])
else:
    print("no valid handle")
