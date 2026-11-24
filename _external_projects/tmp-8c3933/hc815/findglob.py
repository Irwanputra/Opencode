import re, bisect, subprocess, sys
SO='lib/arm64-v8a/libaio.so'
data=open(SO,'rb').read()
funcs=[]
for ln in open('funcsmap2.txt'):
    a,n=ln.split(' ',1); funcs.append((int(a,16),n.strip()))
funcs.sort(); keys=[a for a,_ in funcs]
def fname(va):
    i=bisect.bisect_right(keys,va)-1
    return funcs[i][1].replace('www.bamsoftware.com/git/dnstt.git/','') if i>=0 else hex(va)
targets=set(int(x,16) for x in sys.argv[1:])
OD='/usr/local/lib/android/sdk/ndk/27.3.13750724/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-objdump'
p=subprocess.Popen([OD,'-d','--no-show-raw-insn','--start-address=0x138df20',SO],stdout=subprocess.PIPE,text=True,errors='replace')
reg={}
for line in p.stdout:
    m=re.match(r'^\s*([0-9a-f]+):\s+adrp\s+(x\d+),\s+#?(0x[0-9a-f]+|\d+)',line)
    if m: reg[m.group(2)]=int(m.group(3),0); continue
    m=re.match(r'^\s*([0-9a-f]+):\s+add\s+(x\d+),\s+(x\d+),\s+#(0x[0-9a-f]+|\d+)',line)
    if m:
        rd,rs,imm=m.group(2),m.group(3),int(m.group(4),0)
        if rs in reg:
            va=reg[rs]+imm
            if va in targets:
                print(f"{hex(va)} accessed at {hex(int(m.group(1),16))} in {fname(int(m.group(1),16))}")
p.terminate()
