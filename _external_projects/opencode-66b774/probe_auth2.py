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
    s = socket.create_connection(PROXY, timeout=15)
    s.setsockopt(socket.IPPROTO_TCP, socket.TCP_NODELAY, 1)
    for chunk in (GET, PATCH, SPLIT):
        s.sendall(chunk.encode())
        time.sleep(0.05)
    s.settimeout(20)
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
    print("   preamble", len(buf), "bytes")
    return PrefixedSocket(s, buf[idx:])


def try_auth(user, passwd):
    print("=" * 60)
    print("TRY", repr(user), repr(passwd))
    try:
        sock = handshake()
    except Exception as e:
        print("   HANDSHAKE ERROR", type(e).__name__, e)
        return None
    t = paramiko.Transport(sock)
    t.banner_timeout = 20
    try:
        t.start_client(timeout=20)
        methods = t.auth_handler.auth_methods if t.auth_handler else None
        print("   remote version", t.remote_version, "methods", methods)
    except Exception as e:
        print("   KEX ERROR", type(e).__name__, e)
        try: t.close()
        except Exception: pass
        return None

    ok = False
    try:
        t.auth_password(user, passwd)
        ok = t.is_authenticated()
        print("   password auth ->", ok)
    except paramiko.AuthenticationException as e:
        print("   password auth FAILED", e)
    except Exception as e:
        print("   password auth ERROR", type(e).__name__, e)

    if not ok:
        def ki(title, instructions, prompt_list):
            print("   [ki prompt]", title, instructions, prompt_list)
            return [passwd] * len(prompt_list)
        try:
            t.auth_interactive(user, ki)
            ok = t.is_authenticated()
            print("   keyboard-interactive ->", ok)
        except paramiko.AuthenticationException as e:
            print("   keyboard-interactive FAILED", e)
        except Exception as e:
            print("   keyboard-interactive ERROR", type(e).__name__, e)

    if ok:
        try:
            chan = t.open_session(timeout=10)
            chan.exec_command("echo WANZ_OK; id; uname -a")
            out = chan.makefile("rb").read().decode(errors="replace")
            print("   OUTPUT:", out)
            chan.close()
        except Exception as e:
            print("   exec error", type(e).__name__, e)
    t.close()
    return ok


if __name__ == "__main__":
    combos = [
        ("trial7222", "G0kyDVD2"),
        ("trial", "7222G0kyDVD2"),
        ("trial7222G0kyDVD2", "trial7222G0kyDVD2"),
        ("trial7222G0kyDVD2", ""),
    ]
    for u, p in combos:
        try:
            if try_auth(u, p):
                print(">>> SUCCESS with", repr(u), repr(p))
                break
        except Exception as e:
            print("   unexpected", type(e).__name__, e)
        time.sleep(3)
