import socket, ssl, subprocess, time, sys, os
# HTTPS lewat terowongan SSH (bukti "internet beneran", bukan cuma port terbuka)
env = dict(os.environ, WANZ_EDGE="104.17.70.206", WANZ_PORT="80",
           WANZ_HOST="bansos.sunekvpn.cc.cd", WANZ_FAKE="edu.ruangguru.com")
cmd = ["sshpass", "-p", "Coolmaxx", "ssh", "-o", "ProxyCommand=python3 /tmp/opencode/payload_proxy.py",
       "-o", "KexAlgorithms=diffie-hellman-group14-sha1", "-o", "HostKeyAlgorithms=ssh-rsa",
       "-o", "PubkeyAcceptedAlgorithms=ssh-rsa", "-o", "StrictHostKeyChecking=no",
       "-o", "UserKnownHostsFile=/dev/null", "-o", "PreferredAuthentications=password",
       "-o", "PubkeyAuthentication=no", "-o", "NumberOfPasswordPrompts=1", "-o", "ConnectTimeout=25",
       "-N", "-L", "127.0.0.1:18200:www.google.com:443",
       "sunek-coolmaxx@bansos.sunekvpn.cc.cd"]
log = open("/tmp/opencode/ssh_tls.log", "w")
p = subprocess.Popen(cmd, env=env, stderr=log, stdout=subprocess.DEVNULL, text=True)
for _ in range(40):
    time.sleep(1)
    log.flush()
    if "Local forwarding listening" in open("/tmp/opencode/ssh_tls.log").read():
        break
raw = None
for _ in range(12):
    try:
        raw = socket.create_connection(("127.0.0.1", 18200), timeout=8)
        break
    except ConnectionRefusedError:
        time.sleep(1)
try:
    ctx = ssl.create_default_context()
    with ctx.wrap_socket(raw, server_hostname="www.google.com") as s:
        print("  TLS handshake lewat tunnel : OK, cipher", s.version(), s.cipher()[0])
        s.sendall(b"GET /generate_204 HTTP/1.1\r\nHost: www.google.com\r\nConnection: close\r\n\r\n")
        buf = b""
        s.settimeout(12)
        while True:
            c = s.recv(4096)
            if not c:
                break
            buf += c
        print("  HTTPS respons              :", buf.split(b"\r\n")[0][:60].decode(errors="replace"),
              f"({len(buf)} byte)")
except Exception as e:
    print("  HTTPS gagal:", type(e).__name__, str(e)[:160])
p.terminate()
