import os, re, sys
KEY=[0x78,0x52,0x5f]
def junescape(s):
    out=[];i=0
    while i<len(s):
        c=s[i]
        if c=='\\' and i+1<len(s):
            n=s[i+1]
            if n=='u': out.append(chr(int(s[i+2:i+6],16)));i+=6;continue
            mp={'n':'\n','t':'\t','r':'\r','b':'\b','f':'\f','\\':'\\',"'":"'",'"':'"'}
            if n in mp: out.append(mp[n]);i+=2;continue
            out.append(n);i+=2;continue
        out.append(c);i+=1
    return ''.join(out)
def xrc(t): return ''.join(chr(ord(ch)^KEY[i%3]) for i,ch in enumerate(t))
pat=re.compile(r'Crypt\.xrc\("((?:[^"\\]|\\.)*)"\)')
kw=sys.argv[1] if len(sys.argv)>1 else None
for root,_,files in os.walk("hc_real_jadx/sources"):
    for f in files:
        if not f.endswith('.java'):continue
        p=os.path.join(root,f)
        try: lines=open(p,encoding='utf-8',errors='replace').read().split('\n')
        except: continue
        for ln,line in enumerate(lines,1):
            for m in pat.finditer(line):
                raw=junescape(m.group(1))
                dec=xrc(raw)
                if any(ord(ch)<32 and ch not in '\n\t' for ch in dec): continue
                if len(dec)>120: continue
                low=dec.lower()
                if kw and kw.lower() not in low: continue
                print(f"{p.split('sources/')[-1]}:{ln}: {dec!r}")
