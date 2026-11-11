import socket, time, sys
import paramiko

PROXY=("104.17.70.206",80)
HOST="id3-1forcr.zivpn.site"
GET="GET / HTTP/1.1\r\nHost: edu.ruangguru.com\r\n\r\n"
PATCH=f"PATCH / HTTP/1.1\r\nHost: {HOST}\r\nUpgrade: websocket\r\n\r\n"
SPLIT="HTTP/ 69\r\n\r\n"

def open_tunnel():
    s=socket.create_connection(PROXY,timeout=15)
    s.sendall(GET.encode()); time.sleep(0.05)
    s.sendall(PATCH.encode()); time.sleep(0.05)
    s.sendall(SPLIT.encode())
    return s

class Raw(paramiko.Transport):
    pass

def try_auth(user,pw):
    s=open_tunnel()
    t=paramiko.Transport(s)
    t.start_client(timeout=20)
    print(f"[{user!r}/{pw!r}] banner={t.remote_version!r} auth_methods={t.auth_handler.auth_methods if hasattr(t,'auth_handler') and t.auth_handler else None}")
    try:
        t.auth_password(user,pw)
        print("  AUTH OK")
    except Exception as e:
        print("  auth_password failed:", type(e).__name__, e)
        # try keyboard-interactive
        def ki(title,instructions,prompt_list):
            return [pw]*len(prompt_list)
        try:
            t.auth_interactive(user, ki)
            print("  INTERACTIVE OK")
        except Exception as e2:
            print("  interactive failed:", type(e2).__name__, e2)
    t.close()

for cand in [("trial","7222G0kyDVD2"),("trial7222","G0kyDVD2"),("trial7222G0kyDVD2","trial7222G0kyDVD2")]:
    try:
        try_auth(*cand)
    except Exception as e:
        print(cand, "ERROR", type(e).__name__, e)
