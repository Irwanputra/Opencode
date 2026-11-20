#!/bin/bash
# uji cold-start 4x: matiin server, nyalain, ukur waktu /api/tb
T=https://renaissance-associated-trial-analysis.trycloudflare.com
cd /home/runner/syaliong-player
for i in 1 2 3 4; do
  PIDS=$(ss -lptnH 'sport = :8787' 2>/dev/null | grep -oE 'pid=[0-9]+' | cut -d= -f2 | sort -u)
  for p in $PIDS; do kill $p; done
  sleep 2
  setsid nohup node server.js >> server.log 2>&1 < /dev/null &
  sleep 3
  printf "cold #%s  " "$i"
  s=$(python3 -c "import time;print(int(time.time()*1000))")
  curl -s -m 60 "$T/api/tb" -o /tmp/opencode/kc.json
  e=$(python3 -c "import time;print(int(time.time()*1000))")
  python3 - "$s" "$e" <<'PY'
import json, sys
d = json.load(open('/tmp/opencode/kc.json'))
print(f"{(int(sys.argv[2]) - int(sys.argv[1]))/1000:.1f}s | ok={d.get('ok')} | file={d.get('count','-')} | host={str(d.get('host','-')).replace('https://','')} | {str(d.get('error',''))[:50]}")
PY
  :
  curl -s -m 60 "$T/tb/pl?fid=786085997243448" -D - -o /dev/null 2>/dev/null | awk 'BEGIN{RS="\r"} /x-playlist-span|X-Playlist-Span/{gsub(/[^0-9]/,"",$0);printf "span=%ss ", $0}'
  :
done
