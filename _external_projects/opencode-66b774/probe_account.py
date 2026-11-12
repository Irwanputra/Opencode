#!/usr/bin/env python3
"""Cek akun SSH pemakai lewat jalur yang sama dengan aplikasi:
proxy/edge -> kirim payload -> tunggu banner SSH -> coba password auth.

Kalau banner muncul dan auth lolos, masalah "terhubung tapi tidak bisa
internetan" ada di sisi aplikasi/VPN. Kalau auth ditolak, akunnya yang mati.
"""
import socket
import sys
import time

HOST = "bansos.sunekvpn.cc.cd"
PORT = 80
USER = "sunek-coolmaxx"
PW = "Coolmaxx"
PROXY = ("104.17.70.206", 80)

RAW = ("GET / HTTP/1.1[crlf]Host: edu.ruangguru.com[crlf][crlf]"
       "PATCH / HTTP/1.1[crlf]Host: [host][crlf]Upgrade: websocket[crlf][crlf]")


def build(payload: str, host: str) -> bytes:
    p = payload.replace("[host]", host)
    p = p.replace("[crlf]", "\r\n").replace("[cr]", "\r").replace("[nl]", "\n")
    return p.encode()


def connect(dst, payload: str, label: str):
    print(f"\n=== {label}: {dst[0]}:{dst[1]}")
    s = None
    try:
        s = socket.create_connection(dst, timeout=12)
        s.settimeout(12)
        if payload:
            s.sendall(build(payload, HOST))
            print("  payload terkirim")
        buf = b""
        t0 = time.time()
        while time.time() - t0 < 12:
            try:
                d = s.recv(4096)
            except socket.timeout:
                break
            if not d:
                break
            buf += d
            if b"SSH-" in buf:
                break
        head = buf[:120]
        print(f"  balas {len(buf)} byte: {head!r}")
        if b"SSH-" not in buf:
            return None
        print("  banner SSH terlihat")
        return s
    except Exception as e:
        print(f"  gagal: {type(e).__name__}: {e}")
        if s:
            s.close()
        return None


def try_auth(s, label: str):
    import paramiko
    print(f"--- auth {label}")
    try:
        t = paramiko.Transport(s)
        t.connect()
        print(f"  remote server: {t.remote_version}")
        t.auth_password(USER, PW)
        print(f"  AUTH OK untuk {USER} ({label})")
        chan = t.open_session()
        chan.exec_command("id; hostname; curl -s -m 6 -o /dev/null -w '%{http_code}' http://clients3.google.com/generate_204 || wget -q -T 6 -O- http://1.1.1.1/ >/dev/null && echo net-ok")
        time.sleep(8)
        out = ""
        while chan.recv_ready():
            out += chan.recv(4096).decode(errors="replace")
        print("  hasil perintah server:", out.strip()[:300] or "(kosong — kemungkinan restricted shell)")
        t.close()
        return True
    except Exception as e:
        print(f"  auth gagal: {type(e).__name__}: {e}")
        try:
            t.close()
        except Exception:
            pass
        return False


def main():
    try:
        ip = socket.gethostbyname(HOST)
        print(f"DNS {HOST} -> {ip}")
    except Exception as e:
        print(f"DNS gagal: {e}")
        ip = None

    ok = False
    cands = [(PROXY, "via proxy edge")]
    if ip:
        cands.append(((ip, PORT), "langsung ke DNS"))
    cands.append(((HOST, PORT), "langsung, host name"))
    for dst, label in cands:
        s = connect(dst, RAW, label)
        if s:
            if try_auth(s, label):
                ok = True
                break
            s.close()
    if not ok:
        # fallback: tanpa payload
        cands2 = [(PROXY, "via proxy, tanpa payload")]
        if ip:
            cands2.append(((ip, PORT), "langsung, tanpa payload"))
        for dst, label in cands2:
            s = connect(dst, "", label)
            if s and try_auth(s, label):
                ok = True
                break
            if s:
                s.close()
    print("\nKESIMPULAN:", "akun hidup, jalur tunnel bisa" if ok
          else "tidak ada jalur yang lolos auth")
    return 0 if ok else 1


if __name__ == "__main__":
    sys.exit(main())
