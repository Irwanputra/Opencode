#!/usr/bin/env python3
"""Uji ulang server SSH pakai payload HTTP Custom ASLI dari log pemakai.

Payload yang terbaca dari log HTTP Custom (18:19:12):

  GET / HTTP/1.1\\r\\nHost: edu.ruangguru.com\\r\\n\\r\\n
  PATCH / HTTP/1.1\\r\\nHost: id3-1forcr.zivpn.site\\r\\nUpgrade: websocket\\r\\n\\r\\n

Pembeda dari probe sebelumnya: request KEDUA (upgrade websocket) memakai
Host milik server itu sendiri, bukan host topeng. Yang dicek per server:

  1. banner SSH muncul nggak setelah preamble HTTP dilewati;
  2. metode auth yang ditawarkan (auth "none");
  3. login dengan kredensial profil pemakai.
"""
from __future__ import annotations

import socket
import sys

import paramiko

TIMEOUT = 12
PORT = 80
FAKE_HOST = "edu.ruangguru.com"          # Host topeng di request pertama

# host-asli, ip-yang-dihubungi, user, sandi
TARGETS = [
    ("bansos.sunekvpn.cc.cd", "104.17.70.206", "sunek-coolmaxx", "Coolmaxx"),
    ("bansos.sunekvpn.cc.cd", None, "sunek-coolmaxx", "Coolmaxx"),
    ("id3-1forcr.zivpn.site", "104.17.70.206", "probe", "probe"),
]


def payload_for(host: str) -> bytes:
    """Persis seperti yang dikirim HTTP Custom."""
    return (f"GET / HTTP/1.1\r\nHost: {FAKE_HOST}\r\n\r\n"
            f"PATCH / HTTP/1.1\r\nHost: {host}\r\nUpgrade: websocket\r\n\r\n").encode()


class Prepend:
    """Socket dengan sisa byte yang sudah terlanjur dibaca (baris banner SSH)."""

    def __init__(self, sock: socket.socket, pre: bytes):
        self.sock, self.pre = sock, pre

    def recv(self, n: int) -> bytes:
        if self.pre:
            out, self.pre = self.pre[:n], self.pre[n:]
            return out
        return self.sock.recv(n)

    def recv_into(self, buf, n: int = 0) -> int:
        data = self.recv(n or len(buf))
        buf[:len(data)] = data
        return len(data)

    def __getattr__(self, name):
        return getattr(self.sock, name)


def read_until_banner(s: socket.socket) -> bytes:
    s.settimeout(6)
    buf = b""
    try:
        while True:
            i = buf.find(b"SSH-")
            if i >= 0 and buf.find(b"\n", i) >= 0:
                break
            chunk = s.recv(4096)
            if not chunk:
                break
            buf += chunk
            if len(buf) > 128 * 1024:
                break
    except socket.timeout:
        pass
    return buf


def try_auth(sock: socket.socket, banner: bytes, user: str, pw: str) -> bool:
    t = paramiko.Transport(Prepend(sock, banner))
    try:
        t.start_client(timeout=TIMEOUT)
    except Exception as e:
        print(f"    handshake SSH gagal: {type(e).__name__}: {e}")
        return False
    print(f"    banner diterima: {t.remote_version}")
    if not user:
        print("    (tanpa kredensial: banner + handshake saja)")
        t.close()
        return True
    try:  # auth pertama memaksa KEX selesai; baru host key bisa dibaca
        t.auth_none(user)
        print(f"    host key: {t.get_remote_server_key().get_name()}")
        print(f"    auth none ({user}) -> PARTIAL/SUCCESS, metode lanjutan diminta")
    except Exception as e:
        try:
            print(f"    host key: {t.get_remote_server_key().get_name()}")
        except Exception:
            pass
        print(f"    auth none -> {type(e).__name__}: {e}")
    try:
        t.auth_password(user, pw)
        if t.is_active():
            print(f"    LOGIN BERHASIL: {user} di {t.remote_version}")
            t.close()
            return True
        print("    auth password -> ditolak")
    except Exception as e:
        print(f"    auth password -> {type(e).__name__}: {e}")
    t.close()
    return False


def probe(host: str, ip: str | None, user: str, pw: str) -> bool:
    dst = ip or host
    print(f"\n=== {host}:{PORT} -> koneksi ke {dst}:{PORT}")
    try:
        s = socket.create_connection((dst, PORT), timeout=TIMEOUT)
    except Exception as e:
        print(f"    koneksi gagal: {type(e).__name__}: {e}")
        return False
    s.sendall(payload_for(host))
    raw = read_until_banner(s)
    i = raw.find(b"SSH-")
    if i < 0:
        print(f"    balas {len(raw)} byte, TIDAK ada banner SSH. Isi:")
        for ln in raw[:400].split(b"\r\n")[:6]:
            print("      ", ln[:120])
        s.close()
        return False
    print(f"    preamble {i} byte; baris SSH:")
    for ln in raw[:i].split(b"\r\n")[:5]:
        print("      ", ln[:120])
    j = raw.find(b"\n", i)
    print("      ", raw[i:j].strip()[:120])
    ok = try_auth(s, raw[i:j + 1], user, pw)
    if not ok:
        s.close()
    return ok


def main() -> int:
    out = {}
    for host, ip, user, pw in TARGETS:
        out[f"{host} via {ip or 'DNS'}"] = probe(host, ip, user, pw)
    print("\nKESIMPULAN")
    for k, v in out.items():
        print(f"  {'OK   ' if v else 'GAGAL'} {k}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
