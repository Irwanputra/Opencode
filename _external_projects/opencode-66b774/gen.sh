#!/usr/bin/env bash
# Generate one image with WaveSpeed Seedream 5.5 and save to /tmp/opencode/ai/<name>.png
set -euo pipefail
: "${WAVESPEED_API_KEY:?Set WAVESPEED_API_KEY}"
PROMPT="$1"
NAME="$2"
ASPECT="${3:-1:1}"
RES="${4:-2k}"
BG="${5:-transparent}"
OUTDIR=/tmp/opencode/ai
mkdir -p "$OUTDIR"

BODY=$(jq -n --arg p "$PROMPT" --arg a "$ASPECT" --arg r "$RES" --arg b "$BG" \
  '{prompt:$p, aspect_ratio:$a, resolution:$r, output_format:"png", background:$b}')

SUBMIT=$(curl -sS --fail-with-body -X POST "https://api.wavespeed.ai/api/v3/bytedance/seedream-v5.5" \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer $WAVESPEED_API_KEY" \
  -d "$BODY")
ID=$(printf '%s' "$SUBMIT" | jq -r 'if has("data") then .data.id else .id end')
if [ -z "$ID" ] || [ "$ID" = "null" ]; then
  echo "submit failed: $SUBMIT" >&2
  exit 1
fi
echo "task $ID"

for i in $(seq 1 90); do
  RESP=$(curl -sS --fail-with-body "https://api.wavespeed.ai/api/v3/predictions/$ID/result" \
    -H "Authorization: Bearer $WAVESPEED_API_KEY")
  STATUS=$(printf '%s' "$RESP" | jq -r 'if has("data") then .data.status else .status end')
  case "$STATUS" in
    completed)
      URL=$(printf '%s' "$RESP" | jq -r 'if has("data") then .data.outputs[0] else .outputs[0] end')
      curl -sS --fail-with-body "$URL" -o "$OUTDIR/$NAME.png"
      echo "$OUTDIR/$NAME.png"
      file "$OUTDIR/$NAME.png"
      exit 0
      ;;
    failed|cancelled|timeout|deleted)
      echo "task $STATUS: $RESP" >&2
      exit 1
      ;;
  esac
  sleep 2
done
echo "timeout waiting for $ID" >&2
exit 1
