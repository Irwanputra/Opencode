#!/bin/bash
IFS=$'\t' read -r name orig alt < "$1"
key="${name%%.*}"
out="pin/$key.jpg"
[ -f "$out" ] && exit 0
UA="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120 Safari/537.36"
for u in "$orig" "$alt"; do
  curl -s -L --max-time 25 -A "$UA" -o "$out" "$u"
  sz=$(stat -c%s "$out" 2>/dev/null || echo 0)
  if [ "$sz" -ge 40000 ] && file "$out" | grep -q "image data"; then
    exit 0
  fi
done
rm -f "$out"
