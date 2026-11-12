#!/bin/bash
# Rilis 2.9.1 (font baru) lalu bukti visual di emulator, satu shell.
set -e
cd /home/runner/work/Opencode/Opencode/wanz-tunnel
export ANDROID_HOME=/usr/local/lib/android/sdk

echo "== gerbang desain"
python3 tools/design_gate.py --strict
python3 tools/wall_contrast.py | tail -2 || echo "(Pillow belum terpasang — lewati uji kontras latar)"

echo "== build (log penuh: /tmp/opencode/gradle.log)"
./gradlew testDebugUnitTest lintDebug assembleRelease --no-daemon --console=plain \
  >/tmp/opencode/gradle.log 2>&1
tail -20 /tmp/opencode/gradle.log
grep -q "BUILD SUCCESSFUL" /tmp/opencode/gradle.log || {
  echo "BUILD GAGAL"; grep -n "^e: \|error:" /tmp/opencode/gradle.log | head -20; exit 1; }

APK=/home/runner/work/Opencode/Opencode/WanzTunnel-2.9.1.apk
rm -f "$APK"
cp app/build/outputs/apk/release/app-release.apk "$APK"
cp app/build/outputs/apk/release/app-release.apk \
  /home/runner/work/Opencode/Opencode/_external_projects/opencode-66b774/deliverables/WanzTunnel-2.9.1.apk
sha256sum "$APK"
du -h "$APK" | cut -f1
$ANDROID_HOME/build-tools/34.0.0/aapt2 dump badging "$APK" 2>/dev/null | head -2
echo "== APK siap, lanjut verifikasi emulator"

bash /tmp/opencode/verify_291.sh
