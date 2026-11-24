import sys, re, bisect, subprocess
SO='lib/arm64-v8a/libaio.so'
targets = {
 0x4c0539:'PROLOGUE_HC_ONLY "dnstt-hc-only/1:"',
 0x4c0549:'PROLOGUE_DNSTT "dnstt 2020-04-13"',
 0x4cc78b:'PROLOGUE_TXT_SHORT "dnstt-txt-short/1/"',
 0x4c85b1:'PROLOGUE_CALIBRATION "dnstt-calibration/1:"',
 0x4bea7b:'PROLOGUE_LIMITS "dnstt-limits/1:"',
 0x4cea1a:'ERR invalid bond frame size',
 0x4cea31:'ERR invalid bond lane count',
 0x4cea48:'ERR bond upstream not ready',
 0x4cc75f:'ERR invalid FT tunnel data',
 0x4ed2dd:'LOG FT recovery confirmed',
}
funcs=[]
for ln in open('funcsmap.txt'):
    a,n=ln.split(' ',1); funcs.append((int(a,16),n.strip()))
funcs.sort(); keys=[a for a,_ in funcs]
def fname(va):
    i=bisect.bisect_right(keys,va)-1
    if i<0: return '?'
    return funcs[i][1].replace('www.bamsoftware.com/git/dnstt.git/','')
p = subprocess.Popen(['./ndk-objdump','-d','--no-show-raw-insn','--start-address=0x138df20',SO],stdout=subprocess.PIPE,text=True,errors='replace')
reg={}
for line in p.stdout:
    m=re.search(r'^\s*([0-9a-f]+):\s+(adrp)\s+(x\d+),\s+#?([0-9a-fx]+)',line)
    if m:
        addr=int(m.group(1),16); rd=m.group(3); val=int(m.group(4),16)
        reg[rd]=(val,addr); continue
    m=re.search(r'^\s*([0-9a-f]+):\s+(add)\s+(x\d+),\s+(x\d+),\s+#(0x[0-9a-f]+|\d+)',line)
    if m:
        addr=int(m.group(1),16); rd=m.group(3); rs=m.group(4); imm=int(m.group(5),16 if m.group(5).startswith('0x') else 10)
        if rs in reg:
            base,_=reg[rs]; full=base+imm
            if full in targets:
                print(f"{targets[full]}  <- {hex(addr)} in {fname(addr)}")
p.terminate()
