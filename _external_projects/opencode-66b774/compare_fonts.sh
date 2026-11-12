#!/bin/bash
# Bandingkan font lama vs baru pada emulator yang sama, lalu susun side-by-side.
export ANDROID_HOME=/usr/local/lib/android/sdk
export PATH=$PATH:$ANDROID_HOME/platform-tools
OUT=/tmp/opencode/shots
LAMA=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.apk
BARU=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.1.apk
mkdir -p "$OUT"

grab() {  # $1 = prefix
  adb shell settings put system font_scale 1.0 >/dev/null 2>&1
  adb shell cmd uimode night yes >/dev/null 2>&1
  sleep 2
  adb shell am start -n id.wanz.tunnel/.MainActivity >/dev/null 2>&1
  sleep 6
  adb exec-out screencap -p > "$OUT/${1}_beranda.png"
  adb shell input tap 970 237 >/dev/null 2>&1
  sleep 4
  adb exec-out screencap -p > "$OUT/${1}_pengaturan.png"
  adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
  sleep 1
  adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
  sleep 2
  adb exec-out screencap -p > "$OUT/${1}_pengaturan_scroll.png"
  echo "  diambil: $1"
}

echo "== pasang APK lama (2.9, IBM Plex Mono + Roboto)"
# -d: 2.9 punya versionCode 14, lebih rendah dari 2.9.1 (15)
adb install -r -d -g "$LAMA" 2>&1 | tail -1
adb shell am force-stop id.wanz.tunnel
grab lama

echo "== pasang APK baru (2.9.1, JetBrains Mono + Chivo)"
adb install -r -g "$BARU" 2>&1 | tail -1
adb shell am force-stop id.wanz.tunnel
grab baru

echo "== susun perbandingan"
python3 - <<'PY'
from PIL import Image, ImageDraw, ImageFont
import pathlib

d = pathlib.Path('/tmp/opencode/shots')
LABEL = ImageFont.truetype('/tmp/opencode/fonts/chivo-500.ttf', 26)
SMALL = ImageFont.truetype('/tmp/opencode/fonts/jbm-400.ttf', 20)
GAP = 26
BG = (12, 13, 10)


def montage(a, b, tag, scale=0.62):
    pa, pb = d / a, d / b
    if not (pa.exists() and pb.exists()):
        print('  lewat', tag)
        return
    ia, ib = (Image.open(p).convert('RGB') for p in (pa, pb))
    ia = ia.resize((int(ia.width * scale), int(ia.height * scale)), Image.LANCZOS)
    ib = ib.resize((int(ib.width * scale), int(ib.height * scale)), Image.LANCZOS)
    head, w, h = 52, ia.width, ia.height
    sheet = Image.new('RGB', (w * 2 + GAP, h + head), BG)
    sheet.paste(ia, (0, head)); sheet.paste(ib, (w + GAP, head))
    dr = ImageDraw.Draw(sheet)
    dr.text((12, 12), 'lama 2.9 — IBM Plex Mono + Roboto', font=LABEL, fill=(200, 200, 192))
    dr.text((w + GAP + 12, 12), 'baru 2.9.1 — JetBrains Mono + Chivo', font=LABEL, fill=(201, 162, 47))
    out = d / f'banding_{tag}.png'
    sheet.save(out)
    print('  ->', out.name, sheet.size)


def zoom(src, out, box, factor=2.4):
    p = d / src
    if not p.exists():
        return
    im = Image.open(p).convert('RGB').crop(box)
    im = im.resize((int(im.width * factor), int(im.height * factor)), Image.LANCZOS)
    im.save(d / out)
    print('  ->', out, im.size)


montage('lama_beranda.png', 'baru_beranda.png', 'beranda')
montage('lama_pengaturan_scroll.png', 'baru_pengaturan_scroll.png', 'pengaturan')

# pembesaran 2,4x: di sini tepi huruf yang kabur/bergetar paling kelihatan
for pre in ('lama', 'baru'):
    zoom(f'{pre}_beranda.png', f'zoom_{pre}_angka.png', (0, 300, 1080, 700))
    zoom(f'{pre}_beranda.png', f'zoom_{pre}_judul.png', (0, 100, 1080, 320))
PY
echo "== selesai"
ls -la "$OUT" | grep -E "banding|zoom_"
