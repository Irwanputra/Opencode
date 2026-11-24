import socket, sys, time
port=int(sys.argv[1]); mode=sys.argv[2] if len(sys.argv)>2 else "r"
s=socket.create_connection(('127.0.0.1',port),timeout=10)
if 'w' in mode: s.sendall(b'\x00'*16)
s.settimeout(20)
try:
    d=s.recv(128); print(f"port {port}: DATA {len(d)} bytes: {d[:60]!r}")
except socket.timeout: print(f"port {port}: TIMEOUT")
s.close()
