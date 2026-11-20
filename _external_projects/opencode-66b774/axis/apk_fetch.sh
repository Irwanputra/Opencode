#!/usr/bin/env bash
# Unduh ulang XAPK AXISnet 11.1.0 (build 858) dari APKPure pakai URL bertoken
# dari field asset.url (URL tanpa token = 0 byte). Verifikasi size + SHA256
# sesuai laporan fase 1, lalu bandingkan libnative-lib.so dengan salinan di
# reverse-latest/scratch-apk (sumber semua kunci fase 5).
set -uo pipefail
cd /tmp/opencode/axis
OUT=axisnet-11.1.0.xapk
URL=$(python3 -c "
import json;d=json.load(open('axisnet-ver.json'));print(d['version_list'][0]['asset']['url'])")
echo "URL bertoken: ${URL:0:110}..."
curl -sS -L --retry 3 \
     -H "Ual-Access-Businessid: projecta" \
     -H 'Ual-Access-ProjectA: {"device_info":{"os_ver":"33"}}' \
     -o "$OUT" "$URL"
echo "== hasil =="
ls -l "$OUT"
sha256sum "$OUT"
echo "harapan : 83504120 byte, c07ca053a22647916703282d29c11d2c1d1a42cbfd331721be98d50ec3b7cd5f"
if [ -s "$OUT" ]; then
  echo "== isi XAPK =="
  unzip -l "$OUT" | head -20
  mkdir -p xapk
  unzip -o -q "$OUT" -d xapk
  echo "== cari .so native + APK pembungkusnya =="
  find xapk -maxdepth 2 -type f | head -20
  for f in $(find xapk -name "*.apk"); do
    echo "-- $f"; unzip -l "$f" | grep -E "\.so$|resources.arsc|AndroidManifest" | head -8
  done
fi
