#!/usr/bin/env python3
"""ProxyCommand OpenSSH: kirim payload HTTP Custom ke edge, LEWATI preamble
HTTP (301 + body + 101), lalu teruskan stream mulai baris banner SSH.

OpenSSH tidak tahan preamble sepanjang ~1,8 KB, jadi preamble dibuang di sini —
persis seperti yang dilakukan Transport.kt di aplikasi.

Pakai lewat environment:
  WANZ_EDGE=104.17.70.206 WANZ_PORT=80 WANZ_HOST=bansos.sunekvpn.cc.cd \
  WANZ_FAKE=edu.ruangguru.com
"""
import os
import select
import socket
import sys

EDGE = os.environ.get("WANZ_EDGE", "104.17.70.206")
PORT = int(os.environ.get("WANZ_PORT", "80"))
HOST = os.environ.get("WANZ_HOST", "bansos.sunekvpn.cc.cd")
FAKE = os.environ.get("WANZ_FAKE", "edu.ruangguru.com")

payload = (f"GET / HTTP/1.1\r\nHost: {FAKE}\r\n\r\n"
           f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n").encode()

sock = socket.create_connection((EDGE, PORT), timeout=20)
sock.sendall(payload)
sock.settimeout(20)

# Buang semuanya sampai baris SSH-...  (banner diteruskan utuh ke ssh)
def banner_at_line_start(data: bytes) -> int:
    """Cari awal baris `SSH-...` (harus di awal baris, sama seperti app)."""
    idx = 0
    while True:
        i = data.find(b"SSH-", idx)
        if i < 0:
            return -1
        if i == 0 or data[i - 1:i] == b"\n":
            return i
        idx = i + 1


buf = b""
banner = b""
rest = b""
while True:
    try:
        chunk = sock.recv(4096)
    except socket.timeout:
        break
    if not chunk:
        break
    buf += chunk
    i = banner_at_line_start(buf)
    if i >= 0:
        j = buf.find(b"\n", i)
        if j >= 0:
            banner = buf[i:j + 1]
            rest = buf[j + 1:]
            break
if not banner:
    print(f"proxy: tidak ada banner SSH; dapat {len(buf)} byte: {buf[:200]!r}",
          file=sys.stderr)
    sys.exit(1)
print(f"proxy: preamble {len(buf) - len(banner)} byte dilewati, banner "
      f"{banner.strip()[:60].decode(errors='replace')}", file=sys.stderr)

out = sys.stdout.buffer
# PENTING: pakai fd mentah (os.read), bukan sys.stdin.buffer. File object
# Python akan MEMBUFFER banyak byte sekaligus saat dibaca per-byte, jadi byte
# sisanya hilang dan paket KEX klien tidak pernah sampai ke server.
stdin_fd = sys.stdin.fileno()
# Baris banner HARUS ikut diteruskan: OpenSSH menunggu baris versi SSH-...
out.write(banner)
out.flush()
if rest:
    out.write(rest)
    out.flush()
try:
    while True:
        r, _, _ = select.select([sock, stdin_fd], [], [], 25)
        if sock in r:
            chunk = sock.recv(65536)
            if not chunk:
                break
            out.write(chunk)
            out.flush()
        if stdin_fd in r:
            chunk = os.read(stdin_fd, 65536)
            if not chunk:
                break
            sock.sendall(chunk)
except Exception as e:
    print(f"proxy: {type(e).__name__}: {e}", file=sys.stderr)
finally:
    sock.close()
