import re,sys
KEY=[0x78,0x52,0x5f]
def unesc(s):
    out=[];i=0
    while i<len(s):
        c=s[i]
        if c=='\\' and i+1<len(s):
            n=s[i+1]
            if n=='u': out.append(chr(int(s[i+2:i+6],16)));i+=6;continue
            mp={'n':'\n','t':'\t','r':'\r','b':'\b','f':'\f','\\':'\\',"'":"'",'"':'"'}
            if n in mp: out.append(mp[n]);i+=2;continue
            if n=='"': out.append('"');i+=2;continue
            out.append(n);i+=2;continue
        out.append(c);i+=1
    return ''.join(out)
def xrc(t): return ''.join(chr(ord(ch)^KEY[i%3]) for i,ch in enumerate(t))
F=sys.argv[1]
lines=open(F,encoding='utf-8',errors='replace').read().split('\n')
pat=re.compile(r'const-string(?:-jumbo)? v\d+, "(.*)"\s*$')
for ln,line in enumerate(lines,1):
    m=pat.search(line)
    if not m: continue
    raw=unesc(m.group(1))
    dec=xrc(raw)
    nxt='\n'.join(lines[ln-1:ln+3])
    kind='xrc'
    if 'Crypt;->a(' in nxt or ';->a(' in nxt: kind='xrc+enc'
    if all(32<=ord(ch)<127 or ch in '\n\t' for ch in dec):
        print(f"{ln}: [{kind}] {dec!r}")
