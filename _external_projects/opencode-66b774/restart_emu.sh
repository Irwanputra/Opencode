#!/bin/bash
export ANDROID_HOME=/usr/local/lib/android/sdk
export ANDROID_AVD_HOME=/home/runner/.config/.android/avd
pkill -9 -f qemu-system 2>/dev/null
pkill -9 -f "emulator -avd" 2>/dev/null
sleep 3
$ANDROID_HOME/platform-tools/adb kill-server 2>/dev/null
$ANDROID_HOME/platform-tools/adb start-server 2>/dev/null
nohup $ANDROID_HOME/emulator/emulator -avd test34 \
  -no-window -gpu swiftshader_indirect -no-audio -no-boot-anim \
  -no-snapshot -accel off -memory 2048 -cores 2 -wipe-data \
  -skin 1080x2340 > /tmp/opencode/emu3.log 2>&1 &
echo "emulator pid=$!"
