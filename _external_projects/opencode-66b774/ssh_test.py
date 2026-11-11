#!/usr/bin/env python3
import socket, time, sys
import paramiko

PROXY = ("104.17.70.206", 80)
HOST = "id3-1forcr.zivpn.site"
GET = "GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH = f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT = "HTTP/ 69\r\n\r\n"

class PrefixedSocket:
    def __init__(self, sock, prefix):
        self._sock = sock
        self._prefix = bytearray(prefix)
    def recv(self, n, flags=0):
        if self._prefix:
            data = bytes(self._prefix[:n])
            del self._prefix[:n]
            return data
        return self._sock.recv(n, flags)
    def send(self, data):
        return self._sock.send(data)
    def sendall(self, data):
        return self._sock.sendall(data)
    def settimeout(self, t):
        return self._sock.settimeout(t)
    def gettimeout(self):
        return self._sock.gettimeout()
    def close(self):
        return self._sock.close()
    def __getattr__(self, name):
        return getattr(self._sock, name)

def handshake():
    s = socket.create_connection(PROXY, timeout=10)
    s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    for chunk in (GET, PATCH, SPLIT):
        s.sendall(chunk.encode())
        time.sleep(0.05)
    s.settimeout(15)
    buf = b""
    idx = -1
    while idx < 0:
        b = s.recv(4096)
        if not b:
            raise RuntimeError("closed, received " + repr(buf[:200]))
        buf += b
        idx = buf.find(b"SSH-")
        if len(buf) > 1_000_000:
            raise RuntimeError("too much preamble")
    print("preamble", len(buf), "bytes; banner:", repr(buf[idx:idx+50]))
    return PrefixedSocket(s, buf[idx:])

def try_auth(user, passwd):
    print("="*60)
    print("TRY", repr(user), repr(passwd))
    sock = handshake()
    t = paramiko.Transport(sock)
    t.banner_timeout = 15
    try:
        t.start_client(timeout=15)
        print("kex done; remote version", t.remote_version)
        t.auth_password(user, passwd)
        print("AUTH OK", t.is_authenticated())
        chan = t.open_session(timeout=10)
        chan.exec_command("echo WANZ_OK; id")
        out = chan.makefile("rb").read().decode(errors="replace")
        print("OUTPUT:", out)
        chan.close()
        t.close()
        return True
    except paramiko.AuthenticationException as e:
        print("AUTH FAILED", e)
        t.close()
        return False
    except Exception as e:
        print("ERROR", type(e).__name__, e)
        try: t.close()
        except Exception: pass
        return False

if __name__ == "__main__":
    combos = [("trial", "7222G0kyDVD2"), ("trial7222", "G0kyDVD2")]
    if len(sys.argv) >= 3:
        combos = [(sys.argv[1], sys.argv[2])]
    for u, p in combos:
        try:
            if try_auth(u, p):
                break
        except Exception as e:
            print("HANDSHAKE ERROR", type(e).__name__, e)
