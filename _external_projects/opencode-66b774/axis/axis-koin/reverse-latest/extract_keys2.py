import struct, subprocess, sys, json
from capstone import *
from capstone.arm64 import *

def get_syms(so, prefix):
    out = subprocess.run(["nm","-D","--defined-only",so], capture_output=True, text=True).stdout
    syms = []
    for line in out.splitlines():
        p = line.split()
        if len(p)==3 and p[2].startswith(prefix):
            syms.append((p[2], int(p[0],16)))
    return sorted(syms, key=lambda x: x[1])

def adrp_target(pc, word):
    immlo = (word >> 29) & 0x3
    immhi = (word >> 5) & 0x7FFFF
    imm21 = (immhi << 2) | immlo
    if imm21 & 0x100000: imm21 -= 0x200000
    return (pc & ~0xFFF) + (imm21 << 12)

def analyze(so, prefix):
    data = open(so,'rb').read()
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    md.detail = True
    syms = get_syms(so, prefix)
    results = {}
    for i,(name, addr) in enumerate(syms):
        end = syms[i+1][1] if i+1 < len(syms) else addr + 0x300
        code = data[addr:end]
        insns = list(md.disasm(code, addr))
        page_regs = {}   # reg -> page addr
        blobs = []       # (addr, insn_addr) in order
        nul = None; malloc_size = None
        load_regs = []   # regs used in first vector loads
        for ins in insns:
            if ins.mnemonic == 'ret':
                break
            if ins.mnemonic == 'mov' and ins.op_str.startswith('w0, #'):
                try: malloc_size = int(ins.op_str.split('#')[1], 0)
                except: pass
            if ins.mnemonic == 'strb' and 'wzr' in ins.op_str and '#0x' in ins.op_str:
                try: nul = int(ins.op_str.split('#')[1].rstrip(']'), 0)
                except: pass
            if ins.mnemonic == 'adrp':
                word = struct.unpack_from('<I', data, ins.address)[0]
                reg = ins.op_str.split(',')[0].strip()
                page_regs[reg] = adrp_target(ins.address, word)
            elif ins.mnemonic == 'adr':
                # ADR reg, #imm -> absolute target (capstone gives it in op_str)
                try:
                    reg, imm = [p.strip() for p in ins.op_str.split(',')]
                    blobs.append((ins.address + int(imm[1:],0), ins.address))
                except: pass
            elif ins.mnemonic == 'add':
                parts = [p.strip() for p in ins.op_str.split(',')]
                if len(parts)==3 and parts[0] in page_regs and parts[1]==parts[0] and parts[2].startswith('#'):
                    blobs.append((page_regs[parts[0]] + int(parts[2][1:], 0), ins.address))
            elif ins.mnemonic in ('ldp','ldr') and ins.op_str:
                # record base reg of first loads
                m = ins.op_str.split(',')[-1].strip().lstrip('[').rstrip(']')
                base = m.split(',')[0].strip()
                if base.startswith('x'):
                    load_regs.append(base)
        # choose blob: first blob whose address is used by loads; else first blob
        blob_addr = blobs[0][0] if blobs else None
        ln = nul if nul is not None else (malloc_size-4 if malloc_size else None)
        val = None
        if blob_addr is not None and ln:
            raw = data[blob_addr:blob_addr+ln]
            try: val = raw.decode('utf-8')
            except: val = raw.hex()
        results[name] = {"addr": hex(addr), "blob": hex(blob_addr) if blob_addr else None,
                         "len": ln, "malloc": malloc_size, "n_blobs": len(blobs),
                         "value": val}
    return results

so = sys.argv[1]; prefix = sys.argv[2]
out = sys.argv[3] if len(sys.argv)>3 else None
res = analyze(so, prefix)
if out:
    json.dump(res, open(out,'w'), indent=1, ensure_ascii=False)
for name, r in res.items():
    print(f"{name.replace(prefix,'')} blob={r['blob']} len={r['len']} malloc={r['malloc']} n_blobs={r['n_blobs']} -> {r['value']!r}")
