#!/usr/bin/env python3
"""Mock SSH-over-HTTP (HTTP Custom style) gateway.

Reads the injected payload until the [split] chunk arrives, replies with an
HTTP 301 + 101 preamble, then bridges raw bytes to a local SSH server.
"""
import socket
import threading

LISTEN = ("0.0.0.0", 2222)
SSH = ("127.0.0.1", 2223)

PREAMBLE = (
    b"HTTP/1.1 301 Moved Permanently\r\n"
    b"Content-Type: text/html\r\n"
    b"Transfer-Encoding: chunked\r\n"
    b"Connection: keep-alive\r\n"
    b"\r\n"
    b"216\r\n<html><body>301 Moved Permanently</body></html>\r\n0\r\n\r\n"
    b"HTTP/1.1 101 Switching Protocols\r\n"
    b"Upgrade: websocket\r\n"
    b"Connection: upgrade\r\n"
    b"\r\n"
)


def bridge(src, dst):
    try:
        while True:
            data = src.recv(8192)
            if not data:
                break
            dst.sendall(data)
    except OSError:
        pass


def handle(client):
    try:
        client.settimeout(10)
        got = b""
        while b"HTTP/ 69" not in got:
            chunk = client.recv(4096)
            if not chunk:
                return
            got += chunk
        client.sendall(PREAMBLE)
        upstream = socket.create_connection(SSH, timeout=10)
        client.settimeout(None)
        upstream.settimeout(None)
        t1 = threading.Thread(target=bridge, args=(client, upstream), daemon=True)
        t2 = threading.Thread(target=bridge, args=(upstream, client), daemon=True)
        t1.start(); t2.start()
        t1.join(); t2.join()
    except Exception as e:
        print("mock error:", e, flush=True)
    finally:
        try: client.close()
        except Exception: pass


def main():
    server = socket.socket()
    server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server.bind(LISTEN)
    server.listen(16)
    print("mock listening on", LISTEN, flush=True)
    while True:
        conn, _ = server.accept()
        threading.Thread(target=handle, args=(conn,), daemon=True).start()


if __name__ == "__main__":
    main()
