#!/bin/bash
for pat in NK XK KK; do for ci in chacha aesgcm; do for ha in blake2s sha256; do
  export DNSTT_PATTERN=$pat DNSTT_CIPHER=$ci DNSTT_HASH=$ha
  PL="dnstt 2020-04-13"; CI=$ci; HA=$ha
  PORT=$((25000 + RANDOM % 20000))
  cd /tmp/dnstt-dbg
  DNSTT_PROLOGUE="$PL" DNSTT_PATTERN=$pat DNSTT_CIPHER=$ci DNSTT_HASH=$ha DNSTT_DBG=1 ./dnstt-client-dbg -udp 64.120.92.118:53 -pubkey f9b6ccc9860bdd5124fb6c0c90cba678a68df991d88002f80c3ae0ed1229cb51 ns-freeserver.nevpn.my.id 127.0.0.1:$PORT > /tmp/opencode/m2_last.log 2>&1 &
  CPID=$!; sleep 4; timeout 10 python3 /tmp/opencode/rawtest.py $PORT >/dev/null 2>&1; sleep 1; kill $CPID 2>/dev/null; wait $CPID 2>/dev/null
  R=$(grep -oE "payload=[0-9]+ bytes" /tmp/opencode/m2_last.log | sort -u | tr '\n' ' ')
  echo "pat=$pat cipher=$ci hash=$ha => ${R:-ACK-only}"
done; done; done
