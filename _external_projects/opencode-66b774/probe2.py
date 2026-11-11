#!/usr/bin/env python3
import socket, time

PROXY = ("104.17.70.206", 80)
HOST = "id3-1forcr.zivpn.site"

GET = f"GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH = f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT = "HTTP/ 69\r\n\r\n"

def recv_until(s, seconds):
    s.settimeout(0.5)
    end = time.time() + seconds
    out = b""
    while time.time() < end:
        try:
            b = s.recv(65536)
            if not b:
                print(f"  [closed after {len(out)} bytes]")
                break
            out += b
            print(f"  [+{len(b)} bytes, total {len(out)}]")
        except socket.timeout:
            pass
    return out

def show(out):
    print("  first:", repr(out[:260]))
    print("  has SSH:", b"SSH-" in out, "has 101:", b"101 Switching" in out, "has 301:", b"301" in out[:40])

def case(name, seq, wait=5):
    print("="*70); print(name)
    s = socket.create_connection(PROXY, timeout=10)
    try:
        for label, data, delay in seq:
            if data is not None:
                print(" send", label, len(data))
                s.sendall(data.encode())
            if delay: time.sleep(delay)
        out = recv_until(s, wait)
        show(out)
    finally:
        s.close()

case("whole payload at once", [("all", GET+PATCH+SPLIT, 0)], 8)
case("GET+PATCH then SPLIT after 1s (no read)", [("gp", GET+PATCH, 1.0), ("split", SPLIT, 0)], 8)
case("PATCH then SPLIT after 1s", [("patch", PATCH, 1.0), ("split", SPLIT, 0)], 8)
case("PATCH only", [("patch", PATCH, 0)], 5)
case("GET then newline then PATCH no read, 0.5s", [("g", GET, 0.5), ("p", PATCH, 0)], 6)
case("only GET", [("g", GET, 0)], 4)
