#!/usr/bin/env python3
import socket, time
import paramiko

EDGE = ("104.17.70.206", 80)
SSH_HOST = "indo5.vpnjz.com"
PAYLOAD_GET = "GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PAYLOAD_PATCH = f"PATCH / HTTP/1.1\r\nHost: {SSH_HOST}\r\nUpgrade: websocket\r\n\r\n"
PAYLOAD_SPLIT = "HTTP/ 69\r\n\r\n"

CANDIDATES = [
    ("Taekkk67", "vpnjantit.com:123"),
    ("Taekkk67-vpnjantit.com", "123"),
    ("Taekkk67", "123"),
    ("Taekkk67-vpnjantit.com:123", "Taekkk67-vpnjantit.com:123"),
    ("Taekkk67-vpnjantit.com", "vpnjantit.com:123"),
]


class Prefix:
    def __init__(self, s, p):
        self.s = s
        self.p = bytearray(p)

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


def handshake():
    s = socket.create_connection(EDGE, timeout=15)
    s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    for c in (PAYLOAD_GET, PAYLOAD_PATCH, PAYLOAD_SPLIT):
        s.sendall(c.encode()); time.sleep(0.05)
    s.settimeout(15)
    buf = b""
    end = time.time() + 15
    while b"SSH-" not in buf and time.time() < end:
        b = s.recv(4096)
        if not b:
            raise RuntimeError("closed: " + repr(buf[:160]))
        buf += b
    idx = buf.find(b"SSH-")
    if idx < 0:
        raise RuntimeError("no banner: " + repr(buf[:160]))
    return Prefix(s, buf[idx:])


for user, pw in CANDIDATES:
    print("=" * 60)
    print("TRY", repr(user), repr(pw))
    try:
        sock = handshake()
    except Exception as e:
        print("  handshake error", type(e).__name__, e)
        continue
    t = paramiko.Transport(sock)
    t.banner_timeout = 15
    try:
        t.start_client(timeout=15)
        print("  remote", t.remote_version)
        t.auth_password(user, pw)
        print("  >>> AUTH OK", t.is_authenticated())
        chan = t.open_session(timeout=10)
        chan.exec_command("echo WANZ_OK; id; uname -a")
        print("  OUT:", chan.makefile("rb").read().decode(errors="replace"))
        chan.close()
        t.close()
        print(">>> SUCCESS", repr(user), repr(pw))
        break
    except paramiko.AuthenticationException as e:
        print("  AUTH FAILED", e)
    except Exception as e:
        print("  ERROR", type(e).__name__, e)
    finally:
        try: t.close()
        except Exception: pass
    time.sleep(2)
