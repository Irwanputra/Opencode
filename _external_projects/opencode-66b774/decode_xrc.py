import os, re, sys

KEY=[0x78,0x52,0x5f]  # "xR_"

def junescape(s):
    out=[]; i=0
    while i < len(s):
        c=s[i]
        if c=='\\' and i+1 < len(s):
            n=s[i+1]
            if n=='u':
                out.append(chr(int(s[i+2:i+6],16))); i+=6; continue
            if n=='n': out.append('\n'); i+=2; continue
            if n=='t': out.append('\t'); i+=2; continue
            if n=='r': out.append('\r'); i+=2; continue
            if n=='b': out.append('\b'); i+=2; continue
            if n=='f': out.append('\f'); i+=2; continue
            if n in '\\\'"': out.append(n); i+=2; continue
            out.append(n); i+=2; continue
        out.append(c); i+=1
    return ''.join(out)

def xrc(text):
    return ''.join(chr(ord(ch) ^ KEY[i%3]) for i,ch in enumerate(text))

pat=re.compile(r'Crypt\.xrc\("((?:[^"\\]|\\.)*)"\)')
found={}
for root,_,files in os.walk("hc_real_jadx/sources"):
    for f in files:
        if not f.endswith(".java"): continue
        p=os.path.join(root,f)
        try: txt=open(p,encoding='utf-8',errors='replace').read()
        except: continue
        for m in pat.finditer(txt):
            raw=junescape(m.group(1))
            try: dec=xrc(raw)
            except Exception: continue
            # only keep mostly-printable
            if all(32<=ord(ch)<127 or ch=='\n' or ch=='\t' for ch in dec):
                found.setdefault(dec, set()).add(p.split('sources/')[-1])

out=open("/tmp/opencode/xrc_strings.txt","w")
for dec in sorted(found):
    locs=sorted(found[dec])[:3]
    out.write(repr(dec)+"   <- "+", ".join(locs)+"\n")
out.close()
print("unique strings:", len(found))
