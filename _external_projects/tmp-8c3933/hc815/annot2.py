import re, bisect, subprocess
SO='lib/arm64-v8a/libaio.so'
funcs=[]
for ln in open('funcsmap2.txt'):
    a,n=ln.split(' ',1); funcs.append((int(a,16),n.strip()))
funcs.sort(); keys=[a for a,_ in funcs]
idx={n:i for i,(a,n) in enumerate(funcs)}
def fname(va):
    i=bisect.bisect_right(keys,va)-1
    return funcs[i][1].replace('www.bamsoftware.com/git/dnstt.git/','') if i>=0 else '?'
P='www.bamsoftware.com/git/dnstt.git/'
tmap={}
for nm in ['noise.NewClient','noise.NewBondClient','noise.NewCalibrationClient','noise.NewLimitClient','noise.NewShortTXTClient','noise.newClientWithAuth','noise.NewShortTXTCalibrationClient','bond.Bridge','noise.NewBondServer']:
    try: tmap[funcs[idx[P+nm]][0]]=nm
    except KeyError: pass
OD='/usr/local/lib/android/sdk/ndk/27.3.13750724/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-objdump'
p=subprocess.Popen([OD,'-d','--no-show-raw-insn','--start-address=0x138df20',SO],stdout=subprocess.PIPE,text=True,errors='replace')
for line in p.stdout:
    m=re.search(r'^\s*([0-9a-f]+):.*\bbl\s+(0x[0-9a-f]+)',line)
    if m:
        site=int(m.group(1),16); tgt=int(m.group(2),16)
        if tgt in tmap:
            print(f"{tmap[tgt]:28s} <- dipanggil di {fname(site)} ({hex(site)})")
p.terminate()
