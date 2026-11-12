#!/bin/bash
url="$1"; out="${2#out=}"
[ -s "$out" ] && exit 0
curl -s -L --max-time 15 -o "$out" "$url"
[ "$(stat -c%s "$out" 2>/dev/null || echo 0)" -ge 4000 ] || rm -f "$out"
