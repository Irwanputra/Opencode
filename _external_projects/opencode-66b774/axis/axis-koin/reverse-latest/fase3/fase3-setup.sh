#!/bin/bash
# Fase 3 setup on dark-wren: JDK 17 + Android SDK (cmdline-tools, platform-tools,
# emulator, system image API 34 google_apis x86_64, build-tools) + frida-tools.
# Log: /home/boxd/fase3-setup.log ; run with: bash ~/fase3-setup.sh
set -x
exec > /home/boxd/fase3-setup.log 2>&1
date -u '+START %F %T UTC'
echo '== machine baseline =='
ls -l /dev/kvm; grep -m1 -E 'svm|vmx' /proc/cpuinfo || echo 'NO VMX/SVM FLAG'
free -h; df -h /home/boxd; nproc
python3 --version; pip3 --version
mitmproxy --version 2>&1 | head -3
echo '== apt: openjdk-17 =='
sudo apt-get update -qq
sudo DEBIAN_FRONTEND=noninteractive apt-get install -y -qq openjdk-17-jdk unzip curl wget libgl1 libpulse0 socat 2>&1 | tail -5
java -version 2>&1
echo '== Android cmdline-tools =='
export ANDROID_HOME=/home/boxd/Android/Sdk ANDROID_SDK_ROOT=/home/boxd/Android/Sdk
mkdir -p "$ANDROID_HOME/cmdline-tools"
cd /tmp || exit 1
curl -sSL -o cmdtools.zip https://dl.google.com/android/repository/commandlinetools-linux-11076708_latest.zip
ls -l cmdtools.zip
rm -rf "$ANDROID_HOME/cmdline-tools/tmp" "$ANDROID_HOME/cmdline-tools/latest"
unzip -q -o cmdtools.zip -d "$ANDROID_HOME/cmdline-tools/tmp"
mv "$ANDROID_HOME/cmdline-tools/tmp/cmdline-tools" "$ANDROID_HOME/cmdline-tools/latest"
export PATH="$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator"
echo '== sdkmanager: licenses + packages =='
yes | sdkmanager --licenses >/dev/null 2>&1; echo "licenses rc=$?"
sdkmanager "platform-tools" "emulator" "system-images;android-34;google_apis;x86_64" "build-tools;34.0.0" 2>&1 | tail -15
echo '== versions =='
adb version
emulator -version 2>&1 | head -5
sdkmanager --list_installed 2>&1 | tail -20
echo '== frida-tools =='
pip3 install --user -q frida-tools 2>&1 | tail -3
export PATH="$PATH:/home/boxd/.local/bin"
frida --version
frida-ps --version 2>&1 | head -2
mitmproxy --version 2>&1 | head -3
echo '== disk after install =='
df -h /home/boxd
date -u '+END %F %T UTC'
echo SETUP_DONE
