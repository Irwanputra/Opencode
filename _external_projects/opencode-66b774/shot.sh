#!/bin/bash
# Screenshot bukti v2.9.1 yang tahan emulator lambat: tunggu boot animation
# selesai, tutup dialog ANR, dan pastikan activity kita yang di depan sebelum
# tiap tangkapan. Kalau frame masih boot animation / layar salah, diulang.
#
# Pakai: bash shot.sh            -> verifikasi 2.9.1 (gelap + terang)
#        bash shot.sh banding    -> lama vs baru + lembar perbandingan
export ANDROID_HOME=/usr/local/lib/android/sdk
export PATH=$PATH:$ANDROID_HOME/platform-tools
OUT=/tmp/opencode/shots
NEW=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.1.apk
OLD=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.apk
mkdir -p "$OUT"

calm() {  # tunggu emulator benar-benar kalem
  for i in $(seq 1 240); do
    B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
    A=$(adb shell getprop init.svc.bootanim 2>/dev/null | tr -d '\r')
    [ "$B" = "1" ] && [ "$A" != "running" ] && break
    sleep 5
  done
  # tutup dialog ANR kalau ada
  adb shell input keyevent 4 >/dev/null 2>&1
  adb shell input keyevent 4 >/dev/null 2>&1
  adb shell settings put global window_animation_scale 0 >/dev/null 2>&1
  adb shell settings put global transition_animation_scale 0 >/dev/null 2>&1
  adb shell settings put global animator_duration_scale 0 >/dev/null 2>&1
}

focus_ok() {  # $1 = warna latar yang diharapkan (desimal)
  adb shell dumpsys window 2>/dev/null | grep -m1 mCurrentFocus | grep -q "id.wanz.tunnel"
}

shot() {  # $1=file ; $2=warna latar harapan (hex, mis 131410)
  local f="$OUT/$1" want="${2:-131410}"
  for t in 1 2 3 4 5 6; do
    adb exec-out screencap -p > "$f" 2>/dev/null
    ok=$(python3 - "$f" "$want" <<'PY'
import sys
from PIL import Image
p, want = sys.argv[1], int(sys.argv[2], 16)
try:
    im = Image.open(p).convert('RGB')
except Exception:
    print('no'); raise SystemExit
r, g, b = im.getpixel((6, 1200))
w = (want >> 16 & 255, want >> 8 & 255, want & 255)
d = abs(r - w[0]) + abs(g - w[1]) + abs(b - w[2])
print('ok' if d <= 30 else 'no')
PY
)
    [ "$ok" = "ok" ] && { echo "  -> $1"; return 0; }
    echo "  frame belum benar ($1, coba $t), nunggu…"
    adb shell input keyevent 4 >/dev/null 2>&1
    sleep 6
  done
  echo "  !! $1 dicurigai masih boot animation"
  return 1
}

open_home() {
  adb shell am start -n id.wanz.tunnel/.MainActivity >/dev/null 2>&1
  for i in $(seq 1 40); do focus_ok && break; sleep 3; done
  sleep 4
}

grab_set() {  # $1=prefix $2=mode (yes/no)
  local pre="$1" night="$2" want
  [ "$night" = "yes" ] && want=131410 || want=F1F1EC
  adb shell cmd uimode night "$night" >/dev/null 2>&1
  sleep 3
  open_home
  shot "${pre}_beranda.png" "$want"
  adb shell input tap 970 237 >/dev/null 2>&1
  sleep 4
  shot "${pre}_pengaturan.png" "$want"
  adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
  sleep 1
  adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
  sleep 2
  shot "${pre}_pengaturan_scroll.png" "$want"
}

install_apk() {
  for t in 1 2 3 4 5 6; do
    out=$(adb install -r -d -g "$1" 2>&1 | tail -1)
    echo "  install $t: $out"
    case "$out" in *Success*) return 0 ;; esac
    sleep 10
  done
  return 1
}

echo "== kondisi emulator"
calm
adb shell dumpsys window 2>/dev/null | grep -m1 mCurrentFocus | tr -d '\r'
adb shell settings put system font_scale 1.0 >/dev/null 2>&1

if [ "${1:-}" = "banding" ]; then
  echo "== APK lama (2.9)"
  install_apk "$OLD" || exit 1
  adb shell am force-stop id.wanz.tunnel
  grab_set lama yes
  echo "== APK baru (2.9.1)"
  install_apk "$NEW" || exit 1
  adb shell am force-stop id.wanz.tunnel
  grab_set baru yes
  grab_set baru_terang no
else
  echo "== APK baru (2.9.1)"
  install_apk "$NEW" || exit 1
  adb shell am force-stop id.wanz.tunnel
  grab_set v291_gelap yes
  grab_set v291_terang no
fi

echo "== susun lembar"
python3 - <<'PY'
from PIL import Image, ImageDraw, ImageFont
import pathlib

d = pathlib.Path('/tmp/opencode/shots')
BIG = ImageFont.truetype('/tmp/opencode/fonts/chivo-500.ttf', 26)
SML = ImageFont.truetype('/tmp/opencode/fonts/jbm-400.ttf', 20)


def montage(a, b, tag, la, lb, scale=0.6):
    pa, pb = d / a, d / b
    if not (pa.exists() and pb.exists()):
        print('  lewat', tag)
        return
    ia = Image.open(pa).convert('RGB')
    ib = Image.open(pb).convert('RGB')
    ia = ia.resize((int(ia.width * scale), int(ia.height * scale)), Image.LANCZOS)
    ib = ib.resize((int(ib.width * scale), int(ib.height * scale)), Image.LANCZOS)
    head, w, h = 52, ia.width, ia.height
    s = Image.new('RGB', (w * 2 + 26, h + head), (12, 13, 10))
    s.paste(ia, (0, head)); s.paste(ib, (w + 26, head))
    dr = ImageDraw.Draw(s)
    dr.text((12, 12), la, font=BIG, fill=(200, 200, 192))
    dr.text((w + 38, 12), lb, font=BIG, fill=(201, 162, 47))
    s.save(d / f'banding_{tag}.png')
    print('  ->', f'banding_{tag}.png', s.size)


def zoom(src, out, box, f=2.4):
    p = d / src
    if not p.exists():
        return
    im = Image.open(p).convert('RGB').crop(box)
    im = im.resize((int(im.width * f), int(im.height * f)), Image.LANCZOS)
    im.save(d / out)
    print('  ->', out, im.size)


for trio, tag in (((('v291_gelap', 'v291_gelap'), 'gelap'),
                   (('v291_terang', 'v291_terang'), 'terang'))):
    pass

montage('lama_beranda.png', 'baru_beranda.png', 'beranda',
        'lama 2.9 — IBM Plex Mono + Roboto', 'baru 2.9.1 — JetBrains Mono + Chivo')
montage('lama_pengaturan_scroll.png', 'baru_pengaturan_scroll.png', 'pengaturan',
        'lama 2.9 — field jadi blok krem', 'baru 2.9.1 — tetap garis bawah')

for pre in ('lama', 'baru'):
    zoom(f'{pre}_beranda.png', f'zoom_{pre}.png', (0, 100, 1080, 760))
for pre in ('v291_gelap', 'v291_terang'):
    zoom(f'{pre}_beranda.png', f'zoom_{pre}.png', (0, 100, 1080, 760))
    zoom(f'{pre}_pengaturan_scroll.png', f'zoom_{pre}_field.png', (0, 300, 1080, 1200))
PY
echo "== selesai"
ls -la "$OUT" | grep -E "banding|zoom_|v291|_beranda|_pengaturan"
