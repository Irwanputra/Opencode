#!/usr/bin/env python3
import socket, time
import paramiko

EDGE = ("104.17.70.206", 80)
SSH_HOST = "indo5.vpnjz.com"
USER, PASS = "Taekkk67-vpnjantit.com", "123"

GET = "GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH = f"PATCH / HTTP/1.1\r\nHost: {SSH_HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT = "HTTP/ 69\r\n\r\n"


class Prefix:
    def __init__(self, s, p):
        self.s = s; self.p = bytearray(p)
    def recv(self, n, flags=0):
        if self.p:
            d = bytes(self.p[:n]); del self.p[:n]; return d
        return self.s.recv(n, flags)
    def send(self, d): return self.s.send(d)
    def sendall(self, d): return self.s.sendall(d)
    def settimeout(self, t): return self.s.settimeout(t)
    def gettimeout(self): return self.s.gettimeout()
    def close(self): return self.s.close()
    def __getattr__(self, n): return getattr(self.s, n)


s = socket.create_connection(EDGE, timeout=15)
s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
for c in (GET, PATCH, SPLIT):
    s.sendall(c.encode()); time.sleep(0.05)
s.settimeout(15)
buf = b""
while b"SSH-" not in buf:
    b = s.recv(4096)
    if not b:
        raise SystemExit("closed")
    buf += b
sock = Prefix(s, buf[buf.find(b"SSH-"):])

t = paramiko.Transport(sock)
t.banner_timeout = 15
t.start_client(timeout=15)
t.auth_password(USER, PASS)
print("auth", t.is_authenticated())

# direct-tcpip channel, like the app's SOCKS5
for host, port in [("example.com", 80), ("www.google.com", 80), ("1.1.1.1", 80)]:
    try:
        ch = t.open_channel("direct-tcpip", (host, port), ("127.0.0.1", 0), timeout=15)
        req = f"GET / HTTP/1.0\r\nHost: {host}\r\nConnection: close\r\n\r\n"
        ch.sendall(req.encode())
        time.sleep(1)
        data = b""
        ch.settimeout(8)
        while True:
            b = ch.recv(4096)
            if not b:
                break
            data += b
            if len(data) > 400:
                break
        print(f"[{host}:{port}] {len(data)} bytes -> {data.splitlines()[:1]}")
        ch.close()
    except Exception as e:
        print(f"[{host}:{port}] ERROR {type(e).__name__} {e}")
t.close()
