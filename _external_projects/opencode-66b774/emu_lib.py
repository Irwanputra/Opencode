#!/usr/bin/env python3
"""Emulate lib_eCrypt.so init (.datadiv_decode*) under Unicorn to recover
deobfuscated .data (string/key material), then decrypt eCrypt.bin.

Usage: python3 emu_lib.py [--call NATIVE] [--input file] [--out file]
"""
import struct, sys
from unicorn import *
from unicorn.arm_const import *
from capstone import *

SO = "/tmp/opencode/target/lib_eCrypt.so"
data = open(SO, "rb").read()

# ---------- ELF parsing ----------
from elftools.elf.elffile import ELFFile
f = open(SO, "rb")
elf = ELFFile(f)

segs = []
for seg in elf.iter_segments():
    if seg['p_type'] == 'PT_LOAD':
        segs.append((seg['p_vaddr'], seg['p_offset'], seg['p_filesz'], seg['p_memsz'], seg['p_flags']))
segs.sort()

# dynamic symbols
dynsym = elf.get_section_by_name('.dynsym')
sym_by_index = {}
for i, s in enumerate(dynsym.iter_symbols()):
    sym_by_index[i] = s.name

relocations = []  # (offset, sym_index, type)
for secname in ('.rel.dyn', '.rel.plt'):
    sec = elf.get_section_by_name(secname)
    if sec is None:
        continue
    for r in sec.iter_relocations():
        relocations.append((r['r_offset'], r['r_info_sym'], r['r_info_type']))

# smooth relocations list
print(f"segments: {[(hex(a),hex(b),hex(c),hex(d)) for a,b,c,d,_ in segs]}")
print(f"relocations: {len(relocations)}")

# ---------- Unicorn setup ----------
STACK = 0x20000000
STACK_SIZE = 0x200000
HOOK = 0x70000000
HOOK_SIZE = 0x1000
RET_MAGIC = 0x60000000

mu = Uc(UC_ARCH_ARM, UC_MODE_ARM)

MAPPED = []
def map_mem(addr, size, perm=UC_PROT_ALL):
    base = addr & ~0xfff
    end = (addr + size + 0xfff) & ~0xfff
    mu.mem_map(base, end - base, perm)
    MAPPED.append((base, end))

for vaddr, off, filesz, memsz, flags in segs:
    map_mem(vaddr, memsz)
    mu.mem_write(vaddr, data[off:off + filesz])

# stack
map_mem(STACK, STACK_SIZE)
SP = STACK + STACK_SIZE // 2

# hook region
map_mem(HOOK, HOOK_SIZE)
map_mem(RET_MAGIC, 0x1000)

# ---------- imports / hooks ----------
hooks = {}
hook_names = []
def hook_addr(idx):
    return HOOK + idx * 8

import_tbl = {}
idx = 1
for r_off, sym, rtype in relocations:
    name = sym_by_index.get(sym, "")
    if rtype in (21, 22, 2) and sym != 0:  # GLOB_DAT, JUMP_SLOT, ABS32
        if name not in import_tbl:
            import_tbl[name] = hook_addr(idx); idx += 1
        mu.mem_write(r_off, struct.pack("<I", import_tbl[name]))
    elif rtype == 23:  # RELATIVE
        addend = struct.unpack_from("<I", data, 0)[0] if False else None
        # in-place addend already written by segment copy; base 0 => no change
        pass

lookup_hook = {v: k for k, v in import_tbl.items()}
print("imports:", import_tbl)

def on_hook(uc, address, size, user):
    name = lookup_hook.get(address, "?")
    if address == import_tbl.get("__stack_chk_fail", 0):
        print("  [hook] __stack_chk_fail -> abort")
        uc.emu_stop(); return
    lr = uc.reg_read(UC_ARM_REG_LR)
    print(f"  [hook] {name} called -> return 0 (lr={hex(lr)})")
    uc.reg_write(UC_ARM_REG_R0, 0)
    uc.reg_write(UC_ARM_REG_PC, lr)

mu.hook_add(UC_HOOK_CODE, on_hook, begin=HOOK, end=HOOK + HOOK_SIZE)

def run(addr, timeout=0, maxc=0):
    if addr & 1:
        mu.reg_write(UC_ARM_REG_CPSR, mu.reg_read(UC_ARM_REG_CPSR) | 0x20)
    mu.reg_write(UC_ARM_REG_SP, SP)
    mu.reg_write(UC_ARM_REG_LR, RET_MAGIC | 1)
    try:
        mu.emu_start(addr, RET_MAGIC, timeout=timeout, count=maxc)
    except UcError as e:
        print(f"  emu error at pc={hex(mu.reg_read(UC_ARM_REG_PC))}: {e}")

# ---------- run datadiv functions ----------
datadiv = [(s.name, s['st_value']) for s in dynsym.iter_symbols() if s.name.startswith('.datadiv_decode')]
datadiv.sort(key=lambda x: x[1])
print(f"datadiv funcs: {len(datadiv)}")
for name, va in datadiv:
    print(f"running {name} @ {hex(va)}")
    run(va)

# run init_array
init_sec = elf.get_section_by_name('.init_array')
if init_sec:
    raw = init_sec.data()
    for i in range(0, len(raw), 4):
        a = struct.unpack_from("<I", raw, i)[0]
        if a:
            print(f"running init_array {hex(a)}")
            run(a)

# ---------- dump .data / keys ----------
def read_cstr(vaddr, maxlen=64):
    b = mu.mem_read(vaddr, maxlen)
    e = b.find(b"\x00")
    return bytes(b[:e]) if e >= 0 else bytes(b)

print("\n=== deobfuscated .data region 0x9e000..0x9e700 (as cstrings) ===")
base = 0x9e000
blob = bytes(mu.mem_read(base, 0x700))
# print printable runs
cur = b""
for i, ch in enumerate(blob):
    if 32 <= ch < 127:
        cur += bytes([ch])
    else:
        if len(cur) >= 4:
            print(f"  {hex(base+ i-len(cur))}: {cur.decode()!r}")
        cur = b""
if len(cur) >= 4:
    print(f"  0x{base+len(blob)-len(cur):x}: {cur.decode()!r}")

print("\n=== DAT_000ae5a8 (key?) ===")
print(bytes(mu.mem_read(0x9e5a8, 32)).hex())
print(repr(read_cstr(0x9e5a8)))

# Save full deobfuscated data segment for offline crypto work
full = bytes(mu.mem_read(0x9d9c0, 0x15a0))
open("/tmp/opencode/libecrypt_data_dec.bin", "wb").write(full)
print("saved deobfuscated second segment -> /tmp/opencode/libecrypt_data_dec.bin")
