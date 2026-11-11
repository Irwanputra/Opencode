#!/usr/bin/env python3
import socket, time

PROXY = ("104.17.70.206", 80)
HOST = "id3-1forcr.zivpn.site"
GET = "GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH = f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT = "HTTP/ 69\r\n\r\n"

def recv_for(s, seconds):
    s.settimeout(0.3)
    end = time.time() + seconds
    out = b""
    while time.time() < end:
        try:
            b = s.recv(65536)
            if not b:
                break
            out += b
        except socket.timeout:
            pass
    return out

def case(name, chunks, gaps, wait=6):
    print("="*72); print(name, "gaps", gaps)
    s = socket.create_connection(PROXY, timeout=10)
    try:
        for c, gap in zip(chunks, gaps):
            s.sendall(c.encode())
            if gap: time.sleep(gap)
        out = recv_for(s, wait)
        print(" total", len(out), "301", b"301" in out, "101", b"101 Switching" in out, "SSH", b"SSH-" in out)
        i301 = out.find(b"301"); i101 = out.find(b"101 Switching"); ish = out.find(b"SSH-")
        print(" indexes 301/101/SSH:", i301, i101, ish)
        if ish >= 0:
            print(" prefix tail:", repr(out[max(0, ish-120):ish+80]))
            print(" after SSH:", repr(out[ish:ish+120]))
            print(" body around 101:", repr(out[max(0,i101-80):i101+200]))
        else:
            print(" head:", repr(out[:300]))
    finally:
        s.close()

case("3 chunks, no gaps", [GET, PATCH, SPLIT], [0,0,0])
case("3 chunks, 0.05/0.05", [GET, PATCH, SPLIT], [0.05,0.05,0])
case("3 chunks, 0.2/0.2", [GET, PATCH, SPLIT], [0.2,0.2,0])
case("2 chunks GP then SPLIT 0.5", [GET+PATCH, SPLIT], [0.5,0])
case("2 chunks GP then SPLIT 1.0", [GET+PATCH, SPLIT], [1.0,0])
case("3 chunks, 0.5/0.5", [GET, PATCH, SPLIT], [0.5,0.5,0])
case("2 chunks GET then PATCH+SPLIT 0.5", [GET, PATCH+SPLIT], [0.5,0])
