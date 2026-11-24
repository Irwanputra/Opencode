import re, bisect, subprocess, sys
SO='lib/arm64-v8a/libaio.so'
data=open(SO,'rb').read()
funcs=[]
for ln in open('funcsmap2.txt'):
    a,n=ln.split(' ',1); funcs.append((int(a,16),n.strip()))
funcs.sort(); keys=[a for a,_ in funcs]
def fname(va):
    i=bisect.bisect_right(keys,va)-1
    if i<0: return None
    n=funcs[i][1].replace('www.bamsoftware.com/git/dnstt.git/','')
    return n if len(n)<48 else n[:45]+'…'
def cstr(va, maxlen=48):
    if va<0x4af580 or va>=0x553e70: return None
    end=data.find(b'\x00',va,va+4096)
    if end<0: end=va+maxlen
    s=data[va:end]
    try: t=s.decode('ascii')
    except: return None
    if len(t)>=3 and all(31<ord(c)<127 for c in t): return t[:maxlen]
    return None
start=int(sys.argv[1],16); stop=int(sys.argv[2],16)
OD='/usr/local/lib/android/sdk/ndk/27.3.13750724/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-objdump'
out=subprocess.run([OD,'-d','--no-show-raw-insn','--start-address='+hex(start),'--stop-address='+hex(stop),SO],capture_output=True,text=True).stdout
reg={}
for line in out.splitlines():
    m=re.match(r'^\s*([0-9a-f]+):\s+(.*)$',line)
    if not m: continue
    addr=int(m.group(1),16); ins=m.group(2).strip()
    note=''
    m2=re.match(r'adrp\s+(x\d+),\s+#?(0x[0-9a-f]+|\d+)',ins)
    if m2: reg[m2.group(1)]=int(m2.group(2),0); ins=f"adrp {m2.group(1)}, page"
    else:
        m2=re.match(r'add\s+(x\d+),\s+(x\d+),\s+#(0x[0-9a-f]+|\d+)',ins)
        if m2 and m2.group(2) in reg:
            va=reg[m2.group(2)]+int(m2.group(3),0)
            s=cstr(va)
            ins+=f"   ; ={hex(va)}"+(f' "{s}"' if s else '')
        else:
            m2=re.match(r'(bl|b|adr)\s+(x\d+,\s+)?(0x[0-9a-f]+)',ins)
            if m2:
                t=int(m2.group(3),16); fn=fname(t)
                if fn: ins+=f"   ; <{fn}>"
            else:
                m2=re.match(r'(cbz|cbnz|tbz|tbnz)\s+\w+.*?(0x[0-9a-f]+)$',ins)
                if m2:
                    t=int(m2.group(2),16); fn=fname(t)
                    if fn and fn!='?': ins+=f"   ; -> {fn}"
    print(f"{addr:x}  {ins}")
