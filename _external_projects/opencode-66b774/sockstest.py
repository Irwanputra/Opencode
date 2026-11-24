import socket, sys, time
port=int(sys.argv[1]); target=sys.argv[2] if len(sys.argv)>2 else "1.2.3.4:80"
host,tport=target.rsplit(':',1)
s=socket.create_connection(('127.0.0.1',port),timeout=10)
s.sendall(b'\x05\x01\x00')  # socks5 greet
r=s.recv(2)
if r!=b'\x05\x00': print("greet fail",r); sys.exit(1)
addr=socket.inet_aton(host)+struct.pack('>H',int(tport)) if ':' in target else None
import struct
s.sendall(b'\x05\x01\x00\x01'+socket.inet_aton(host)+struct.pack('>H',int(tport)))
r=s.recv(10)
if r[1]!=0: print("connect fail rep=",r[1]); sys.exit(1)
print("socks connected, reading banner...")
s.settimeout(15)
try:
    data=s.recv(128); print("DATA:",data[:60])
except socket.timeout: print("TIMEOUT no data")
s.close()
