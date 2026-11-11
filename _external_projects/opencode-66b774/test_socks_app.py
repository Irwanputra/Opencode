#!/usr/bin/env python3
import socket, struct, time

SOCKS = ("127.0.0.1", 11080)


def socks5_connect(host, port):
    s = socket.create_connection(SOCKS, timeout=15)
    s.settimeout(20)
    s.sendall(b"\x05\x01\x00")
    r = s.recv(2)
    assert r == b"\x05\x00", r
    h = host.encode()
    req = b"\x05\x01\x00\x03" + bytes([len(h)]) + h + struct.pack("!H", port)
    s.sendall(req)
    r = s.recv(4)
    assert r[0] == 5 and r[1] == 0, ("reply", r)
    atyp = r[3]
    if atyp == 1:
        s.recv(4)
    elif atyp == 3:
        n = s.recv(1)[0]; s.recv(n)
    elif atyp == 4:
        s.recv(16)
    s.recv(2)
    return s


for host, port in [("example.com", 80), ("www.google.com", 80), ("ipinfo.io", 80)]:
    try:
        s = socks5_connect(host, port)
        s.sendall(f"GET / HTTP/1.0\r\nHost: {host}\r\nConnection: close\r\n\r\n".encode())
        data = b""
        while True:
            try:
                b = s.recv(4096)
            except socket.timeout:
                break
            if not b:
                break
            data += b
            if len(data) > 600:
                break
        print(f"[{host}:{port}] {len(data)} bytes -> {data.splitlines()[:1]}")
        s.close()
    except Exception as e:
        print(f"[{host}:{port}] ERROR {type(e).__name__} {e}")
