#!/usr/bin/env python3
import socket, time, sys
import paramiko

HOST = "id3-1forcr.zivpn.site"
EDGE = "104.17.70.206"
GET = "GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH = f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT = "HTTP/ 69\r\n\r\n"
USER, PASS = "trial7222", "G0kyDVD2"


def resolve(h):
    try:
        return socket.gethostbyname(h)
    except Exception as e:
        return f"ERR {e}"


print("DNS", HOST, "->", resolve(HOST))


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


def attempt(name, target, send_payload, wait):
    print("=" * 60)
    print(name, target)
    try:
        s = socket.create_connection(target, timeout=15)
    except Exception as e:
        print("  connect error", type(e).__name__, e)
        return
    s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    try:
        if send_payload:
            for c in (GET, PATCH, SPLIT):
                s.sendall(c.encode()); time.sleep(0.05)
        s.settimeout(wait)
        buf = b""
        idx = -1
        end = time.time() + wait
        while idx < 0 and time.time() < end:
            try:
                b = s.recv(4096)
            except socket.timeout:
                break
            if not b:
                print("  closed; got", len(buf), "bytes:", repr(buf[:120]))
                s.close(); return
            buf += b
            idx = buf.find(b"SSH-")
        if idx < 0:
            print("  no banner; first bytes:", repr(buf[:160]))
            s.close(); return
        print("  banner:", repr(buf[idx:idx+40]))
        sock = Prefix(s, buf[idx:])
        t = paramiko.Transport(sock)
        t.banner_timeout = 15
        t.start_client(timeout=15)
        t.auth_password(USER, PASS)
        print("  AUTH OK, authenticated =", t.is_authenticated())
        t.close()
    except paramiko.AuthenticationException as e:
        print("  AUTH FAILED:", e)
    except Exception as e:
        print("  ERROR", type(e).__name__, e)
    finally:
        try: s.close()
        except Exception: pass


if __name__ == "__main__":
    attempt("edge:80 payload", (EDGE, 80), True, 8)
    time.sleep(2)
    attempt("host:80 payload", (HOST, 80), True, 8)
    time.sleep(2)
    attempt("host:443 no payload", (HOST, 443), False, 6)
    time.sleep(2)
    attempt("host:22 no payload", (HOST, 22), False, 6)
