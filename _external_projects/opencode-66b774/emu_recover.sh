#!/bin/bash
# Pulihkan sistem emulator (layanan paket-nya "Broken pipe", layar hitam),
# lalu jalankan verifikasi visual + perbandingan font.
export ANDROID_HOME=/usr/local/lib/android/sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools
export ANDROID_AVD_HOME=/tmp/opencode/avd

echo "== kondisi awal"
adb devices | tail -2
adb shell dumpsys SurfaceFlinger 2>&1 | head -3

echo "== restart framework"
adb root >/dev/null 2>&1
sleep 3
adb shell stop >/dev/null 2>&1
sleep 6
adb shell start >/dev/null 2>&1
adb wait-for-device
for i in $(seq 1 400); do
  B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
  [ "$B" = "1" ] && break
  sleep 5
  [ $((i % 24)) -eq 0 ] && echo "  menunggu boot... $((i * 5)) detik"
done
echo "BOOT=$B"
[ "$B" = "1" ] || { tail -10 /tmp/opencode/emu.log; exit 1; }

adb shell settings put global window_animation_scale 0 >/dev/null 2>&1
adb shell settings put global transition_animation_scale 0 >/dev/null 2>&1
adb shell settings put global animator_duration_scale 0 >/dev/null 2>&1
sleep 8
adb shell wm size
adb exec-out screencap -p > /tmp/opencode/shots/00_boot.png
python3 - <<'PY'
from PIL import Image
import numpy as np
im = Image.open('/tmp/opencode/shots/00_boot.png').convert('RGB')
a = np.asarray(im)
print('boot.png', im.size, 'pixel unik:', len(np.unique(a.reshape(-1, 3), axis=0)))
PY

echo "== verifikasi 2.9.1"
bash /tmp/opencode/verify_291.sh
echo "== bandingkan lama vs baru"
bash /tmp/opencode/compare_fonts.sh
echo "== selesai"
