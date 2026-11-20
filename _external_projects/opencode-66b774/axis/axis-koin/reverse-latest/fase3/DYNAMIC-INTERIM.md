# Fase 3 — Dynamic track interim note (2026-11-20, WIB)

Status: BLOCKED at the PairIP license-check loop. Emulator killed 2026-11-20 ~19:35 WIB
after the dynamic subagent finished (adb emu kill confirmed: no devices, no qemu
process, dark-wren RAM back to 5.0 Gi free). AVD `axis34` and all tooling persist on
dark-wren for the next session — nothing needs reinstalling.

## What was achieved on dark-wren
- Tooling installed + verified: OpenJDK 17.0.21.1, adb 1.0.41 (platform-tools 37.0.3),
  emulator 37.3.10.0, build-tools 34.0.0, system image android-34 google_apis x86_64 r14,
  mitmproxy 8.1.1 (pre-installed), Frida 17.27.4 (venv /home/boxd/frida-venv) +
  frida-server 17.27.4 android-x86_64 pushed to /data/local/tmp/frida-server.
- Fixes: KVM group permission (sudo gpasswd -a boxd kvm + chmod 666 /dev/kvm);
  frida-tools via venv (system pip refuses, PEP 668). `boxd machine cp` needs
  `dark-wren:/path`, NOT `vm:/path`.
- Emulator AVD `axis34` (Pixel 7, Android 14, google_apis x86_64, 4 GB RAM, 2 cores,
  headless, swiftshader_indirect) booted to sys.boot_completed=1 in ~50 s, KVM usable
  (version 12), adb devices showed emulator-5554, ARM translation present
  (libndk_translation.so) so arm64-only AXISnet libs can run. adb root works.
- APK installed via adb install-multiple (base + config.arm64_v8a + config.en +
  config.xxhdpi): Success. versionCode 858, versionName 11.1.0, minSdk 24,
  targetSdk 36, primaryCpuAbi arm64-v8a. APK SHA256 on dark-wren matches Phase 1.
  Launcher: com.axis.net/.ui.splashLogin.SplashActivity.

## The blocker: PairIP license check loop
- App process starts and stays alive but never reaches Onboarding/login. Top activity
  is always com.pairip.licensecheck.LicenseActivity; process restarts ~every 15 s
  (PIDs 4533 -> 5207 -> 5604 -> 5968 -> 6578). No FATAL/AndroidRuntime lines.
- Logcat (repeated every cycle):
  - D LicenseClient: Request to licensing service sent.
  - E LicenseClient: Error while checking license:
    com.pairip.licensecheck.LicenseCheckException: Licensing service could not
    process request. at LicenseClient.checkLicenseInternal(LicenseClient.java:476),
    via lambda$onServiceConnected$0 (LicenseClient.java:408).
- Root cause (high confidence): google_apis image has NO Play Store, so the Play
  licensing service the PairIP LicenseClient binds to cannot process the request.
  LicenseClient/LicenseActivity classes ARE in the (unencrypted) DEX, so hookable.
- Consequence: no startup traffic to *.api.axis.co.id observable yet, Alifetime screen
  unreachable, no Tempest capture possible until the license gate is bypassed.

## Frida / mitmproxy state
- frida-server was running on the emulator (PID 7204); frida-ps -U worked and listed
  AXISNET. NO hook script was executed; NO keys/signatures/traffic captured.
- Hook scripts WERE saved locally (contrary to the subagent's interim note about the
  probe script): fase3/axisnet-hooks.js (Signature getters, getStringDecrypt/getPos*,
  OkHttp logging, JCA Mac/Cipher, loaded-class enumeration) and fase3/ssl-unpin.js
  (CertificatePinner, TrustManagerImpl, X509TrustManager, SSLContext, HostnameVerifier).
  The separate frida-probe.js (method enumeration for LicenseClient/Signature/etc.)
  was NOT saved and must be rewritten next session.
- mitmproxy 8.1.1 confirmed present; no proxy started, no CA installed, no flows
  recorded. Planned next: mitmdump -p 8080, emulator proxy 10.0.2.2:8080, CA as system
  cert (adb root + remount) or Frida unpinning fallback.

## Next steps for the dynamic track (do NOT do without resuming Phase 3)
1. Reboot emulator (AVD axis34 persists; frida-server must be restarted after reboot).
2. Rewrite frida-probe.js: enumerate methods/fields of LicenseClient, LicenseActivity,
   Signature, AxisnetHelpers, RequestInterceptor; delayed Java.enumerateLoadedClasses
   filtered to com.axis.net / com.pairip.
3. Bypass: hook LicenseClient to force a licensed result (exact method from probe,
   likely checkLicenseInternal or its result callback) so the app proceeds past
   LicenseActivity; then run axisnet-hooks.js + ssl-unpin.js in spawn mode.
4. mitmproxy as above; record startup traffic ONLY (no login).
5. If bypass fails twice: try google_apis_playstore image (likely same LVL failure for
   sideloaded APK), or a physical Android device with Play Store where the user
   installed AXISnet from Play.
6. User login step (only with the user present, own number+OTP): on the emulator with
   Frida+mitmproxy running, user opens AXISnet, enters own number + OTP, opens
   Alifetime/Coin screen, optionally taps a redeem — Frida logs Tempest inputs/
   decrypted keys, mitmproxy records request/response.

## Costs / state
- No live credit figure observed. Disk on dark-wren: 81 GB free after install (was 87 GB).
- Emulator killed; dark-wren itself left running. No login, OTP, phone number, or
  redeem attempted at any point.
