import sys, struct, json

# Dalvik instruction lengths in 16-bit code units (AOSP libdex OpcodeInfo)
# 1-unit: 00-0f, 12, 27-29(goto=1), 2d? no, 73, 79-7a, 7b-8f (12x unary/convert), d8-e2 (12x 2addr), e3-ef unused
# 2-unit: 13,15,16,19,1a,1c-23, 2d-31(cmp 23x), 32-3d(if 21t/22t), 44-51(aget/aput 23x),
#         52-5f(iget/iput 22c), 60-6d(sget/sput 21c), 90-cf(binop 23x), d0-d7(binop/lit 22s/22b)
# 3-unit: 14,17,1b,24,25,26,2a(goto/32),2b,2c,6e-72,74-78, fc,fd,fe,ff
# 4-unit: fa,fb
# 5-unit: 18 (const-wide 51l)
LEN = [1]*256
for op in [0x13,0x15,0x16,0x19,0x1a,0x1c,0x1d,0x1e,0x1f,0x20,0x21,0x22,0x23,
           0x29,0x2d,0x2e,0x2f,0x30,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x39,0x3a,0x3b,0x3c,0x3d,
           0x44,0x45,0x46,0x47,0x48,0x49,0x4a,0x4b,0x4c,0x4d,0x4e,0x4f,
           0x50,0x51,0x52,0x53,0x54,0x55,0x56,0x57,0x58,0x59,0x5a,0x5b,0x5c,0x5d,0x5e,0x5f,
           0x60,0x61,0x62,0x63,0x64,0x65,0x66,0x67,0x68,0x69,0x6a,0x6b,0x6c,0x6d,
           0x90,0x91,0x92,0x93,0x94,0x95,0x96,0x97,0x98,0x99,0x9a,0x9b,0x9c,0x9d,0x9e,0x9f,
           0xa0,0xa1,0xa2,0xa3,0xa4,0xa5,0xa6,0xa7,0xa8,0xa9,0xaa,0xab,0xac,0xad,0xae,0xaf,
           0xb0,0xb1,0xb2,0xb3,0xb4,0xb5,0xb6,0xb7,0xb8,0xb9,0xba,0xbb,0xbc,0xbd,0xbe,0xbf,
           0xc0,0xc1,0xc2,0xc3,0xc4,0xc5,0xc6,0xc7,0xc8,0xc9,0xca,0xcb,0xcc,0xcd,0xce,0xcf,
           0xd0,0xd1,0xd2,0xd3,0xd4,0xd5,0xd6,0xd7]:
    LEN[op] = 2
for op in [0x14,0x17,0x1b,0x24,0x25,0x26,0x2a,0x2b,0x2c,0x6e,0x6f,0x70,0x71,0x72,0x74,0x75,0x76,0x77,0x78,0xfc,0xfd,0xfe,0xff]:
    LEN[op] = 3
LEN[0x18] = 5
for op in [0xfa, 0xfb]:
    LEN[op] = 4

def uleb(data, off):
    r=0; s=0
    while True:
        b=data[off]; off+=1; r|=(b&0x7f)<<s
        if not (b&0x80): break
        s+=7
    return r, off

def decode_insns(data, off, size):
    """Return list of (pc, op, arg_idx_or_None, kind) ; kind in const-string/invoke/field/other"""
    insns = struct.unpack_from(f'<{size}H', data, off)
    out = []
    pc = 0
    ok = True
    while pc < size:
        u = insns[pc]
        op = u & 0xff
        if u == 0x0100:  # packed-switch payload
            n = insns[pc+1] if pc+1 < size else 0
            pc += 4 + 2*n; continue
        if u == 0x0200:  # sparse-switch payload
            n = insns[pc+1] if pc+1 < size else 0
            pc += 2 + 4*n; continue
        if u == 0x0300:  # fill-array-data payload
            w = insns[pc+1] if pc+1 < size else 1
            n = insns[pc+2] | (insns[pc+3] << 16) if pc+3 < size else 0
            pc += 4 + (w*n + 1)//2; continue
        ln = LEN[op]
        if pc + ln > size:
            ok = False; break
        kind = None; idx = None
        if op == 0x1a:
            kind='const-string'; idx = insns[pc+1]
        elif op == 0x1b:
            kind='const-string'; idx = insns[pc+1] | (insns[pc+2] << 16)
        elif op in (0x6e,0x6f,0x70,0x71,0x72,0x74,0x75,0x76,0x77,0x78,0xfa,0xfb):
            kind='invoke'; idx = insns[pc+1]
        elif op in (0x60,0x61,0x62,0x63,0x64,0x65,0x66,0x67,0x68,0x69,0x6a,0x6b,0x6c,0x6d,
                    0x52,0x53,0x54,0x55,0x56,0x57,0x58,0x59,0x5a,0x5b,0x5c,0x5d,0x5e,0x5f):
            kind='field'; idx = insns[pc+1]
        elif op == 0x1c:
            kind='const-class'; idx = insns[pc+1]
        out.append((pc, op, idx, kind))
        pc += ln
    if pc != size:
        ok = False
    return out, ok

def parse(path):
    data = open(path,'rb').read()
    (ss, so, ts, to, ps, po, fs, fo, ms, mo, cs, co) = struct.unpack_from('<12I', data, 0x38)
    strings=[]
    for i in range(ss):
        off = struct.unpack_from('<I', data, so+4*i)[0]
        _, p = uleb(data, off)
        end = data.index(b'\x00', p)
        strings.append(data[p:end].decode('utf-8','replace'))
    types=[strings[struct.unpack_from('<I', data, to+4*i)[0]] for i in range(ts)]
    protos=[]
    for i in range(ps):
        shorty, ret, params = struct.unpack_from('<III', data, po+12*i)
        plist=[]
        if params:
            size, = struct.unpack_from('<I', data, params)
            plist=[types[struct.unpack_from('<H', data, params+4+2*j)[0]] for j in range(size)]
        protos.append((types[ret], plist))
    fields=[]
    for i in range(fs):
        cl, ty, nm = struct.unpack_from('<HHI', data, fo+8*i)
        fields.append((types[cl], types[ty], strings[nm]))
    methods=[]
    for i in range(ms):
        cl, pr, nm = struct.unpack_from('<HHI', data, mo+8*i)
        methods.append((types[cl], protos[pr], strings[nm]))
    # class defs + class data
    results = []
    n_ok = 0; n_bad = 0
    for i in range(cs):
        ci, acc, sup, ifaces_off, src_idx, ann_off, data_off, static_off = struct.unpack_from('<8I', data, co+32*i)
        cls = types[ci]
        if data_off == 0: continue
        p = data_off
        n_static, p = uleb(data, p); n_inst, p = uleb(data, p)
        n_direct, p = uleb(data, p); n_virtual, p = uleb(data, p)
        for _ in range(n_static + n_inst):
            _, p = uleb(data, p); _, p = uleb(data, p)
        for section_count in (n_direct, n_virtual):
            midx = 0
            for _ in range(section_count):
                diff, p = uleb(data, p); midx += diff
                _, p = uleb(data, p)
                code_off, p = uleb(data, p)
                if code_off == 0: continue
                mcls, (ret, params), mname = methods[midx]
                regs, ins, outs, tries, dbg, insn_size = struct.unpack_from('<6H', data, code_off)
                insns, ok = decode_insns(data, code_off+16, insn_size)
                if ok: n_ok += 1
                else: n_bad += 1  # keep valid prefix: V-Guard encrypts tails of many methods
                strs=[]; inv=[]; flds=[]
                for pc, op, idx, kind in insns:
                    if kind=='const-string' and idx is not None and idx < len(strings):
                        strs.append(strings[idx])
                    elif kind=='invoke' and idx is not None and idx < len(methods):
                        tcl, (tret, tparams), tname = methods[idx]
                        inv.append(f"{tcl}->{tname}({', '.join(tparams)})->{tret}")
                    elif kind=='field' and idx is not None and idx < len(fields):
                        fcl, fty, fname = fields[idx]
                        flds.append(f"{fcl}->{fname}:{fty}")
                results.append({"class": cls, "method": f"{mname}({', '.join(params)})->{ret}",
                                "strings": strs, "invokes": inv, "fields": flds})
    return results, n_ok, n_bad

if __name__ == '__main__':
    out_path = sys.argv[-1]
    allres = []
    for path in sys.argv[1:-1]:
        res, ok, bad = parse(path)
        print(f"{path.split('/')[-1]}: methods decoded ok={ok} bad={bad} with_code={len(res)}")
        allres.extend(res)
    json.dump(allres, open(out_path, 'w'), ensure_ascii=False)
    print("TOTAL methods with code:", len(allres))
