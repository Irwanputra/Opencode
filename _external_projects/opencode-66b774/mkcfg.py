import json, sys, xml.sax.saxutils as sx
t, port, socks, vpn, sni, strict, path, wshost = sys.argv[1:9]
p = {
 "id": 1, "name": "Test SSH", "host": "10.0.2.2", "port": int(port),
 "user": "runner", "pass": "testpass123", "proxy": "", "payload": "",
 "socksPort": int(socks), "vpn": vpn == "1", "transport": t,
 "sni": sni, "wsPath": path, "wsHost": wshost, "strictTls": strict == "1",
}
raw = sx.escape(json.dumps([p], separators=(",", ":")))
print(f'''<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
    <string name="profiles">{raw}</string>
    <long name="activeProfile" value="1" />
</map>''')
