#!/usr/bin/env python3
import socket, time, sys

PROXY = ("104.17.70.206", 80)
HOST = "id3-1forcr.zivpn.site"

GET = (
    "GET / HTTP/1.1\r\n"
    "Host: edu.ruangguru.com\r\n"
    "\r\n"
)
PATCH = (
    "PATCH / HTTP/1.1\r\n"
    f"Host: {HOST}\r\n"
    "Upgrade: websocket\r\n"
    "\r\n"
)
SPLIT = "HTTP/ 69\r\n\r\n"

def dump(tag, data):
    if not data:
        print(f"{tag}: <empty>")
        return
    print(f"{tag}: {len(data)} bytes")
    print(repr(data[:800]))

def recv_some(s, timeout=4.0):
    s.settimeout(timeout)
    out = b""
    try:
        while True:
            b = s.recv(4096)
            if not b:
                break
            out += b
            if len(out) > 16384:
                break
    except socket.timeout:
        pass
    return out

def run(mode):
    print("=" * 70)
    print("MODE", mode)
    s = socket.create_connection(PROXY, timeout=10)
    s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    if mode == "get_wait":
        s.sendall(GET.encode())
        dump("resp1", recv_some(s))
        s.sendall(PATCH.encode())
        dump("resp2", recv_some(s))
        s.sendall(SPLIT.encode())
        dump("resp3", recv_some(s))
    elif mode == "all_wait":
        s.sendall((GET + PATCH).encode())
        dump("resp1", recv_some(s))
        s.sendall(SPLIT.encode())
        dump("resp2", recv_some(s))
    elif mode == "split_delay":
        s.sendall(GET.encode())
        time.sleep(0.3)
        s.sendall(PATCH.encode())
        time.sleep(0.3)
        s.sendall(SPLIT.encode())
        dump("resp", recv_some(s))
    elif mode == "get_only":
        s.sendall(GET.encode())
        dump("resp", recv_some(s))
    elif mode == "patch_only":
        s.sendall(PATCH.encode())
        dump("resp", recv_some(s))
    s.close()

for mode in sys.argv[1:] or ["get_wait", "all_wait", "split_delay", "get_only", "patch_only"]:
    try:
        run(mode)
    except Exception as e:
        print("ERROR", mode, type(e).__name__, e)
