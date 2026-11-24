#!/bin/bash
# $1=prologue $2=cipher $3=hash $4=pubkey(optional, default raw)
PL="$1"; CI="$2"; HA="$3"; PK="${4:-f9b6ccc9860bdd5124fb6c0c90cba678a68df991d88002f80c3ae0ed1229cb51}"
PORT=$((20000 + RANDOM % 20000))
cd /tmp/dnstt-dbg
DNSTT_PROLOGUE="$PL" DNSTT_CIPHER="$CI" DNSTT_HASH="$HA" DNSTT_DBG=1 ./dnstt-client-dbg -udp 64.120.92.118:53 -pubkey "$PK" ns-freeserver.nevpn.my.id 127.0.0.1:$PORT > /tmp/opencode/try_last.log 2>&1 &
CPID=$!
sleep 5
timeout 12 python3 /tmp/opencode/rawtest.py $PORT >/dev/null 2>&1
sleep 1
kill $CPID 2>/dev/null
wait $CPID 2>/dev/null
# hasil: cari payload > 26 byte (bukan ACK)
R=$(grep -oE "payload=[0-9]+ bytes" /tmp/opencode/try_last.log | sort -u | tr '\n' ' ')
echo "prologue='$PL' cipher=$CI hash=$HA key=${PK:0:8}.. => ${R:-hanya-ACK/tidak-ada}"
