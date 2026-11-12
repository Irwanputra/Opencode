#!/bin/bash
# Bukti nyata: login SSH ke server pemakai pakai payload HTTP Custom dari log,
# lalu teruskan trafik lewat terowongan (direct-tcpip) seperti yang dilakukan
# aplikasi. Kalau curl lewat terowongan balas 200 = internet beneran jalan.
export WANZ_EDGE=104.17.70.206
export WANZ_PORT=80
export WANZ_HOST=bansos.sunekvpn.cc.cd
export WANZ_FAKE=edu.ruangguru.com
USER_SSH=sunek-coolmaxx
PASS_SSH='Coolmaxx'

for attempt in 1 2 3; do
  echo "=== percobaan $attempt"
  PORT_FWD=$((17800 + RANDOM % 200))
  sshpass -p "$PASS_SSH" ssh -v \
    -o "ProxyCommand=python3 /tmp/opencode/payload_proxy.py" \
    -o KexAlgorithms=diffie-hellman-group14-sha1 \
    -o HostKeyAlgorithms=ssh-rsa \
    -o PubkeyAcceptedAlgorithms=ssh-rsa \
    -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null \
    -o PreferredAuthentications=password -o PubkeyAuthentication=no \
    -o NumberOfPasswordPrompts=1 -o ConnectTimeout=25 -o ServerAliveInterval=5 \
    -N -L "127.0.0.1:${PORT_FWD}:example.com:80" \
    "${USER_SSH}@${WANZ_HOST}" > /tmp/opencode/ssh_auth.log 2>&1 &
  SSH_PID=$!

  HELLO=""
  for i in $(seq 1 30); do
    sleep 1
    HELLO=$(curl -s -m 3 -o /dev/null -w '%{http_code}' "http://127.0.0.1:${PORT_FWD}/" 2>/dev/null)
    [ "$HELLO" = "200" ] && break
    kill -0 $SSH_PID 2>/dev/null || break
  done

  echo "  curl lewat terowongan: HTTP ${HELLO:-tidak ada jawaban}"
  grep -E "kex: algorithm|Server host key|Authentications that can continue|Authenticated to|Permission denied|authentications that can continue|channel_setup_fwd_listener_tcpip|Could not request local forwarding|Connection closed|kex_exchange_identification: read|banner:" /tmp/opencode/ssh_auth.log | head -12
  kill $SSH_PID 2>/dev/null; wait $SSH_PID 2>/dev/null

  if [ "$HELLO" = "200" ]; then
    echo "HASIL: LOGIN + INTERNET OK lewat payload HTTP Custom"
    exit 0
  fi
  sleep 3
done
echo "HASIL: belum berhasil (lihat /tmp/opencode/ssh_auth.log)"
tail -25 /tmp/opencode/ssh_auth.log
exit 1
