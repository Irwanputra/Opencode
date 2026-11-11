#!/usr/bin/env python3
"""Emulate lib_eCrypt.so easyCrypt() under Unicorn with a fake JNI env.

Usage: python3 emu_easycrypt.py <hexblob> [more hexblobs...]
Prints decrypted UTF-8 strings.
"""
import struct, sys, os
from unicorn import *
from unicorn.arm_const import *
from elftools.elf.elffile import ELFFile

SO = "/tmp/opencode/target/lib_eCrypt.so"
data = open(SO, "rb").read()

f = open(SO, "rb")
elf = ELFFile(f)
segs = []
for seg in elf.iter_segments():
    if seg['p_type'] == 'PT_LOAD':
        segs.append((seg['p_vaddr'], seg['p_offset'], seg['p_filesz'], seg['p_memsz'], seg['p_flags']))
segs.sort()
dynsym = elf.get_section_by_name('.dynsym')
sym_by_index = {i: s.name for i, s in enumerate(dynsym.iter_symbols())}
relocations = []
for secname in ('.rel.dyn', '.rel.plt'):
    sec = elf.get_section_by_name(secname)
    if sec is None:
        continue
    for r in sec.iter_relocations():
        relocations.append((r['r_offset'], r['r_info_sym'], r['r_info_type']))

mu = Uc(UC_ARCH_ARM, UC_MODE_ARM)

def map_mem(addr, size, perm=UC_PROT_ALL):
    base = addr & ~0xfff
    end = (addr + size + 0xfff) & ~0xfff
    mu.mem_map(base, end - base, perm)

for vaddr, off, filesz, memsz, flags in segs:
    map_mem(vaddr, memsz)
    mu.mem_write(vaddr, data[off:off + filesz])

# regions
STACK = 0x20000000; STACK_SIZE = 0x400000
HEAP  = 0x30000000; HEAP_SIZE  = 0x400000
JNI   = 0x40000000; JNI_SIZE   = 0x100000   # fake env/vm tables + thunks
ARRAYS= 0x50000000; ARRAYS_SIZE= 0x200000
HOOK  = 0x70000000; HOOK_SIZE  = 0x2000
RET_MAGIC = 0x60000000
for a,s in [(STACK,STACK_SIZE),(HEAP,HEAP_SIZE),(JNI,JNI_SIZE),(ARRAYS,ARRAYS_SIZE),(HOOK,HOOK_SIZE),(RET_MAGIC,0x1000)]:
    map_mem(a,s)
SP = STACK + STACK_SIZE//2

# ---- bump allocator ----
heap_ptr = HEAP
def umalloc(n):
    global heap_ptr
    n = (n+15)&~15
    p = heap_ptr; heap_ptr += n
    if heap_ptr >= HEAP+HEAP_SIZE: raise RuntimeError("heap oom")
    return p

# ---- import hooks ----
import_tbl = {}
idx = 1
for r_off, sym, rtype in relocations:
    name = sym_by_index.get(sym, "")
    if rtype in (21, 22, 2) and sym != 0:
        if name not in import_tbl:
            import_tbl[name] = HOOK + idx*8; idx += 1
        mu.mem_write(r_off, struct.pack("<I", import_tbl[name]))
lookup_hook = {v:k for k,v in import_tbl.items()}

def mread(addr,n):
    return bytes(mu.mem_read(addr,n))
def mwrite(addr,b):
    mu.mem_write(addr, b)
def rd32(a): return struct.unpack("<I", mread(a,4))[0]
def cstr(a, maxn=512):
    out = bytearray()
    for i in range(maxn):
        try:
            b = mread(a + i, 1)
        except Exception:
            break
        if b == b"\0":
            break
        out += b
    return bytes(out)

# shared arrays (handle -> (data_ptr, length))
arrays = {}

def on_libhook(uc, address, size, user):
    name = lookup_hook.get(address, "?")
    sp = uc.reg_read(UC_ARM_REG_SP)
    a0,a1,a2,a3 = [uc.reg_read(r) for r in (UC_ARM_REG_R0,UC_ARM_REG_R1,UC_ARM_REG_R2,UC_ARM_REG_R3)]
    lr = uc.reg_read(UC_ARM_REG_LR)
    ret = 0
    if os.environ.get("DBG_IMPORTS"):
        print(f"   [lib] {name} a0={hex(a0)} a1={hex(a1)} a2={hex(a2)} a3={hex(a3)}")
    if name in ("__aeabi_memcpy","__aeabi_memcpy4","__aeabi_memcpy8","memcpy"):
        mwrite(a0, mread(a1,a2)); ret=a0
    elif name in ("__aeabi_memclr","__aeabi_memclr4","__aeabi_memclr8","memset"):
        n = a2 if name.startswith("__aeabi") else a2
        mwrite(a0, bytes([a1 & 0xff])*n); ret=a0
    elif name == "__aeabi_memset":
        mwrite(a0, bytes([a1 & 0xff])*a2); ret=a0
    elif name == "memmove":
        mwrite(a0, mread(a1,a2)); ret=a0
    elif name == "memcmp":
        x=mread(a0,a2); y=mread(a1,a2); ret=(x>y)-(x<y)
    elif name == "strlen":
        ret=len(cstr(a0, 256))
    elif name == "strcmp":
        x=cstr(a0); y=cstr(a1); ret=(x>y)-(x<y)
    elif name in ("strcpy","strcat"):
        src=cstr(a1); dst=cstr(a0) if name=="strcat" else b""
        mwrite(a0, dst+src+b"\0"); ret=a0
    elif name == "malloc":
        ret=umalloc(a0)
    elif name == "calloc":
        p=umalloc(a0*a1); mwrite(p, b"\0"*(a0*a1)); ret=p
    elif name == "realloc":
        if a0==0: ret=umalloc(a1)
        else:
            old=0
            # unknown size; copy a1
            p=umalloc(a1); mwrite(p, mread(a0,a1)); ret=p
    elif name == "free":
        ret=0
    elif name in ("__stack_chk_fail","abort"):
        print("  !! abort/stack_chk_fail"); uc.emu_stop(); return
    elif name in ("__errno",):
        ret=umalloc(4)
    else:
        ret=0
    uc.reg_write(UC_ARM_REG_R0, ret & 0xffffffff)
    uc.reg_write(UC_ARM_REG_PC, lr)

mu.hook_add(UC_HOOK_CODE, on_libhook, begin=HOOK, end=HOOK+HOOK_SIZE)

# ---- fake JNI env ----
ENV = 0x40010000
ENVTBL = 0x40011000
VM  = 0x40020000
VMTBL = 0x40021000
THUNKS = 0x40030000
# thunk for env index i: THUNKS + i*8 (i up to 300)
env_index = {}   # thunk addr -> index
for i in range(0, 300):
    ta = THUNKS + i*8
    env_index[ta] = ('env', i)
    mu.mem_write(ENVTBL + i*4, struct.pack("<I", ta))
vm_index = {}
for i in range(0, 20):
    ta = THUNKS + 0x1000 + i*8
    vm_index[ta] = ('vm', i)
    mu.mem_write(VMTBL + i*4, struct.pack("<I", ta))
mu.mem_write(ENV, struct.pack("<I", ENVTBL))
mu.mem_write(VM,  struct.pack("<I", VMTBL))

# current input
CUR = {'data': b'', 'out_handle': None}

def on_jni(uc, address, size, user):
    kind, i = env_index.get(address) or vm_index.get(address)
    sp = uc.reg_read(UC_ARM_REG_SP)
    r = [uc.reg_read(x) for x in (UC_ARM_REG_R0,UC_ARM_REG_R1,UC_ARM_REG_R2,UC_ARM_REG_R3)]
    # also read stack args for >4
    st = [struct.unpack("<I", mread(sp+k*4,4))[0] for k in range(6)]
    args = r + st
    lr = uc.reg_read(UC_ARM_REG_LR)
    ret = 0
    if kind == 'vm':
        # JNIInvokeInterface: [0x18]=GetEnv(vm, void** penv, jint ver)
        if i in (4, 6):  # AttachCurrentThread / GetEnv
            penv = args[1]
            mu.mem_write(penv, struct.pack("<I", ENV))
            ret = 0  # JNI_OK
        uc.reg_write(UC_ARM_REG_R0, ret)
        uc.reg_write(UC_ARM_REG_PC, lr)
        return
    # env functions
    print(f"   [jni] env[{i}] args={[hex(x) for x in args[:5]]}")
    if i == 167:   # GetArrayLength(env, array)
        h = args[1]; ret = arrays.get(h,(0,0))[1]
    elif i == 172: # NewByteArray(env, len)
        n = args[1]; p = umalloc(n if n>0 else 1); h = ARRAYS + (len(arrays)+1)*0x100
        arrays[h] = (p, n); ret = h
    elif i == 180: # GetByteArrayElements(env, array, isCopy) -> ptr
        h = args[1]; p, n = arrays.get(h, (0,0))
        if p == 0:
            p = umalloc(max(n,1) or 1)
        ret = p
    elif i == 188: # ReleaseByteArrayElements
        ret = 0
    elif i == 204: # SetByteArrayRegion(env, array, start, len, buf)  (args: env,arr,start,len,buf)
        h = args[1]; start = args[2]; ln = args[3]; buf = args[4]
        p, n = arrays.get(h, (0,0))
        if p:
            mwrite(p+start, mread(buf, ln))
        ret = 0
    elif i == 196: # GetByteArrayRegion
        h=args[1]; start=args[2]; ln=args[3]; buf=args[4]
        p,n=arrays.get(h,(0,0))
        if p: mwrite(buf, mread(p+start,ln))
        ret=0
    elif i == 109: # GetStaticMethodID -> non-null
        ret = 0x1234
    elif i == 110: # CallStaticObjectMethod -> non-null object
        ret = 0x1234
    elif i == 6:   # FindClass -> dummy class
        ret = 0x1234
    elif i == 14:  # ThrowNew
        ret = 0
    else:
        ret = 0
    uc.reg_write(UC_ARM_REG_R0, ret & 0xffffffff)
    uc.reg_write(UC_ARM_REG_PC, lr)

mu.hook_add(UC_HOOK_CODE, on_jni, begin=THUNKS, end=THUNKS+0x2000)

# easyCrypt fetches a global JavaVM/env pointer via PC-relative addressing.
# Patch the resolved global slot to point at our fake JNIEnv each time.
def fix_env_global(uc, address, size, user):
    r4 = uc.reg_read(UC_ARM_REG_R4)
    uc.mem_write(r4, struct.pack("<I", ENV))
    # also directly set r0 to the env table so the next ldr works
    uc.reg_write(UC_ARM_REG_R0, ENV)
# hooks disabled: speculative GOT patching corrupted data

def force_env(uc, address, size, user):
    uc.reg_write(UC_ARM_REG_R0, ENV)

def dbgregs(uc, address, size, user):
    r4=uc.reg_read(UC_ARM_REG_R4); r0=uc.reg_read(UC_ARM_REG_R0)
    print(f"   [reg] at {hex(address)} r4={hex(r4)} r0={hex(r0)} mem_r4={mread(r4,4).hex() if r4 not in (0,) else 'n/a'}")
for addr in (0x2805c,0x2805e,0x28060,0x28652,0x28654,0x28656):
    mu.hook_add(UC_HOOK_CODE, dbgregs, begin=addr, end=addr)


def run(addr, timeout=0, maxc=0):
    if addr & 1:
        mu.reg_write(UC_ARM_REG_CPSR, mu.reg_read(UC_ARM_REG_CPSR) | 0x20)
    mu.reg_write(UC_ARM_REG_SP, SP)
    mu.reg_write(UC_ARM_REG_LR, RET_MAGIC | 1)
    try:
        mu.emu_start(addr, RET_MAGIC, timeout=timeout, count=maxc)
    except UcError as e:
        print(f"  emu error at pc={hex(mu.reg_read(UC_ARM_REG_PC))}: {e}")

def dbg_crypto(uc, address, size, user):
    r0,r1,r2,r3=[uc.reg_read(x) for x in (UC_ARM_REG_R0,UC_ARM_REG_R1,UC_ARM_REG_R2,UC_ARM_REG_R3)]
    print(f"   [crypto in] data={hex(r0)} len={r1} key={hex(r2)} out={hex(r3)}")
    print(f"      keybytes={mread(r2,24)!r}")
    print(f"      databytes={mread(r0,min(r1,64))!r}")
mu.hook_add(UC_HOOK_CODE, dbg_crypto, begin=0x3bf0c, end=0x3bf0c)
def dbg_after(uc, address, size, user):
    r0=uc.reg_read(UC_ARM_REG_R0)
    sp=uc.reg_read(UC_ARM_REG_SP)
    outlen=struct.unpack("<I", mread(sp+4,4))[0]
    print(f"   [crypto out] ptr={hex(r0)} outlen={outlen} data={mread(r0,min(outlen,64))!r}" if r0 and outlen else f"   [crypto out] ptr={hex(r0)} outlen={outlen}")
mu.hook_add(UC_HOOK_CODE, dbg_after, begin=0x2b686, end=0x2b686)

# ---- init: datadiv + init_array ----
datadiv = [(s.name, s['st_value']) for s in dynsym.iter_symbols() if s.name.startswith('.datadiv_decode')]
for name, va in sorted(datadiv, key=lambda x:x[1]):
    run(va)
init_sec = elf.get_section_by_name('.init_array')
if init_sec:
    raw = init_sec.data()
    for i in range(0,len(raw),4):
        a = struct.unpack_from("<I",raw,i)[0]
        if a: run(a)

# panggil JNI_OnLoad supaya lib menyimpan JavaVM/env & cache metode Java
mu.reg_write(UC_ARM_REG_R0, VM)
mu.reg_write(UC_ARM_REG_R1, 0)
run(0x2a25d)
print("   [dbg] after JNI_OnLoad, bss[0x9eb78]=", hex(rd32(0x9eb78)))

import os
EASY = int(os.environ.get("EASY_ADDR","0x27fbd"),16)

def easy(blob):
    inp = umalloc(len(blob) or 1)
    mwrite(inp, blob)
    h = ARRAYS + 0x10000  # input handle
    arrays[h] = (inp, len(blob))
    CUR['out_handle']=None
    mu.reg_write(UC_ARM_REG_R0, ENV)
    mu.reg_write(UC_ARM_REG_R1, 0)
    mu.reg_write(UC_ARM_REG_R2, h)
    run(EASY, timeout=20000000)
    ret = mu.reg_read(UC_ARM_REG_R0)
    print(f"   [dbg] easyCrypt ret={hex(ret)} pc={hex(mu.reg_read(UC_ARM_REG_PC))} arrays={ {hex(k):(hex(v[0]),v[1]) for k,v in arrays.items()} }")
    p,n = arrays.get(ret,(0,0))
    if p and n>0:
        return mread(p,n)
    return None

if __name__ == "__main__":
    for hx in sys.argv[1:]:
        out = easy(bytes.fromhex(hx))
        print(hx, "->", None if out is None else (out, ))
        if out:
            try: print("   utf8:", out.decode('utf-8'))
            except Exception: print("   latin1:", out.decode('latin1'))