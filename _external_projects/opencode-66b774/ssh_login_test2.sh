#!/bin/bash
# Login SUDAH terbukti berhasil. Sekarang cari tahu endpoint mana yang boleh
# lewat terowongan (gateway gratisan biasanya membatasi tujuan).
export WANZ_EDGE=104.17.70.206 WANZ_PORT=80 WANZ_HOST=bansos.sunekvpn.cc.cd WANZ_FAKE=edu.ruangguru.com
B=18100
sshpass -p 'Coolmaxx' ssh -v \
  -o "ProxyCommand=python3 /tmp/opencode/payload_proxy.py" \
  -o KexAlgorithms=diffie-hellman-group14-sha1 -o HostKeyAlgorithms=ssh-rsa \
  -o PubkeyAcceptedAlgorithms=ssh-rsa -o StrictHostKeyChecking=no \
  -o UserKnownHostsFile=/dev/null -o PreferredAuthentications=password \
  -o PubkeyAuthentication=no -o NumberOfPasswordPrompts=1 -o ConnectTimeout=25 \
  -N \
  -L "127.0.0.1:$((B+0)):example.com:80" \
  -L "127.0.0.1:$((B+1)):104.17.70.206:80" \
  -L "127.0.0.1:$((B+2)):one.one.one.one:443" \
  -L "127.0.0.1:$((B+3)):8.8.8.8:53" \
  -L "127.0.0.1:$((B+4)):www.google.com:443" \
  sunek-coolmaxx@bansos.sunekvpn.cc.cd > /tmp/opencode/ssh_fwd.log 2>&1 &
PID=$!
for i in $(seq 1 30); do
  grep -q "Local forwarding listening" /tmp/opencode/ssh_fwd.log && break
  kill -0 $PID 2>/dev/null || break
  sleep 1
done
grep -c "Local forwarding listening" /tmp/opencode/ssh_fwd.log | sed 's/^/  listener aktif: /'
python3 - <<'PY'
import socket, ssl, time, sys
targets = [
    ("example.com:80", "18100", "http"),
    ("104.17.70.206:80", "18101", "http"),
    ("one.one.one.one:443", "18102", "https"),
    ("8.8.8.8:53", "18103", "tcp"),
    ("www.google.com:443", "18104", "https"),
]
for label, port, kind in targets:
    try:
        s = socket.create_connection(("127.0.0.1", int(port)), timeout=8)
    except Exception as e:
        print(f"  GAGAL  {label:22} koneksi lokal: {type(e).__name__}")
        continue
    try:
        if kind == "https":
            s = ssl.create_default_context()
            s = None
            print(f"  (lewati TLS) {label}")
            continue
        if kind == "tcp":
            s.sendall(b"\x12\x34\x01\x00\x00\x01\x00\x00\x00\x00\x00\x00\x07example\x03com\x00\x00\x01\x00\x01")
            data = s.recv(512)
            print(f"  {'OK   ' if data else 'KOSED '} {label:22} balas {len(data)} byte (DNS lewat tunnel)")
        else:
            s.sendall(b"GET / HTTP/1.1\r\nHost: example.com\r\nConnection: close\r\n\r\n")
            buf = b""
            s.settimeout(10)
            while len(buf) < 400:
                c = s.recv(4096)
                if not c:
                    break
                buf += c
            first = buf.split(b"\r\n")[0][:60].decode(errors="replace")
            print(f"  {'OK   ' if buf.startswith(b'HTTP/') else 'KOSED '} {label:22} balas {len(buf)} byte | {first}")
    except Exception as e:
        print(f"  KOSED  {label:22} {type(e).__name__}: {e}")
    finally:
        try:
            s.close()
        except Exception:
            pass
PY
grep -E "Authenticated to|kex: algorithm|kex: host key|channel 1: open|channel 2: open|channel 3: open|channel 4: open|channel 5: open|channel .* open: direct-tcpip|channel .* eof|channel .* end|open failed| Administratively|connect failed" /tmp/opencode/ssh_fwd.log | head -12
kill $PID 2>/dev/null; wait $PID 2>/dev/null
