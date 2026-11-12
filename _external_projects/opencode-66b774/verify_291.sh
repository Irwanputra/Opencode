#!/bin/bash
# Bukti visual v2.9.1 di emulator: field multi-baris tidak lagi jadi blok warna,
# dan tipografi baru (JetBrains Mono + Space Grotesk) terbaca tegas.
# Semua ditulis ke log supaya bisa dibaca dari shell lain.
export ANDROID_HOME=/usr/local/lib/android/sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/emulator:$ANDROID_HOME/platform-tools
export ANDROID_AVD_HOME=/tmp/opencode/avd
OUT=/tmp/opencode/shots
APK=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.1.apk
mkdir -p "$ANDROID_AVD_HOME" "$OUT"

echo "== emulator"
DEV=$(adb devices 2>/dev/null | awk '/^emulator-[0-9]+[[:space:]]+device$/{print $1; exit}')
BOOT=$(adb ${DEV:+-s $DEV} shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
if [ -n "$DEV" ] && [ "$BOOT" = "1" ]; then
  echo "  pakai emulator yang sudah hidup: $DEV"
else
  if ! avdmanager list avd 2>/dev/null | grep -q "wanz29"; then
    printf 'no\n' | avdmanager create avd -n wanz29 \
      -k "system-images;android-34;google_apis;x86_64" -d pixel_5 --force >/dev/null 2>&1
  fi
  echo "  boot (tanpa KVM, ini lama)"
  nohup emulator -avd wanz29 -no-window -no-audio -no-boot-anim -no-snapshot \
    -accel off -gpu swiftshader_indirect -memory 2048 >/tmp/opencode/emu.log 2>&1 &
  sleep 8
  adb wait-for-device
  for i in $(seq 1 360); do
    BOOT=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
    [ "$BOOT" = "1" ] && break
    sleep 5
    [ $((i % 24)) -eq 0 ] && echo "  menunggu boot... $((i * 5)) detik"
  done
fi
echo "BOOT=$BOOT"
if [ "$BOOT" != "1" ]; then tail -12 /tmp/opencode/emu.log; exit 1; fi

adb shell settings put global window_animation_scale 0 >/dev/null 2>&1
adb shell settings put global transition_animation_scale 0 >/dev/null 2>&1
adb shell settings put global animator_duration_scale 0 >/dev/null 2>&1

echo "== pasang APK"
for i in $(seq 1 120); do [ -f "$APK" ] && break; sleep 10; done
ls -la "$APK"
install_apk() {  # $1 = apk; coba beberapa kali, package service emulator sering "Broken pipe"
  for t in 1 2 3 4 5 6; do
    out=$(adb install -r -d -g "$1" 2>&1 | tail -1)
    echo "  percobaan $t: $out"
    case "$out" in *Success*) return 0 ;; esac
    sleep 12
  done
  return 1
}
install_apk "$APK" || { adb root >/dev/null 2>&1; sleep 3; install_apk "$APK" || {
  echo "  install gagal; restart framework"; adb shell stop >/dev/null 2>&1; sleep 5
  adb shell start >/dev/null 2>&1; adb wait-for-device
  for i in $(seq 1 240); do
    B=$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')
    [ "$B" = "1" ] && break; sleep 5
  done
  install_apk "$APK" || { echo "INSTALL GAGAL"; exit 1; }
} }
adb shell dumpsys package id.wanz.tunnel 2>/dev/null | grep -m1 versionName

shot() { adb exec-out screencap -p > "$OUT/$1"; echo "  -> $1"; }

echo "== Pengaturan, mode gelap"
adb shell cmd uimode night yes >/dev/null 2>&1
sleep 2
adb shell am start -n id.wanz.tunnel/.MainActivity >/dev/null 2>&1
sleep 5
shot 01_beranda_gelap.png
adb shell input tap 970 237 >/dev/null 2>&1
sleep 4
shot 02_pengaturan_gelap.png

echo "== gulir ke kolom Payload & Impor config"
adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
sleep 1
adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
sleep 1
adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
sleep 2
shot 03_gulir_gelap.png

echo "== fokus kolom isian (tebel 2dp, tanpa blok warna)"
adb shell input tap 540 1200 >/dev/null 2>&1
sleep 2
shot 04_fokus_tengah_gelap.png
adb shell input tap 540 1700 >/dev/null 2>&1
sleep 2
shot 05_fokus_bawah_gelap.png

echo "== mode terang"
adb shell cmd uimode night no >/dev/null 2>&1
sleep 2
adb shell am start -n id.wanz.tunnel/.MainActivity >/dev/null 2>&1
sleep 5
shot 06_beranda_terang.png
adb shell input tap 970 237 >/dev/null 2>&1
sleep 4
shot 07_pengaturan_terang.png
adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
sleep 1
adb shell input swipe 540 1900 540 500 500 >/dev/null 2>&1
sleep 2
shot 08_gulir_terang.png

echo "== perbesahan label micro (crop 2x, cek 'geter')"
python3 - <<'PY'
from PIL import Image
import pathlib
d = pathlib.Path('/tmp/opencode/shots')
for src, box in [('01_beranda_gelap.png', (0, 250, 1080, 900)),
                 ('06_beranda_terang.png', (0, 250, 1080, 900)),
                 ('02_pengaturan_gelap.png', (0, 300, 1080, 1000))]:
    p = d / src
    if not p.exists():
        continue
    im = Image.open(p).crop(box)
    im = im.resize((int(im.width * 1.6), int(im.height * 1.6)), Image.LANCZOS)
    out = d / (p.stem + '_zoom.png')
    im.save(out)
    print('  zoom ->', out.name, im.size)
PY

adb shell am force-stop id.wanz.tunnel >/dev/null 2>&1
echo "== selesai"
ls -la "$OUT" | grep -v font_
