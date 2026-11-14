package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class ProfileInstallReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            dev.epro.r0.V1475975160983963926.P(context, new dev.epro.r0.L15510417080911867038((byte) 2), new dev.epro.r0.F6942723054099263096(this, (byte) 28), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                java.lang.String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    try {
                        dev.epro.r0.V1475975160983963926.H(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        setResultCode(10);
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        setResultCode(7);
                        return;
                    }
                }
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                    return;
                }
                return;
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            android.os.Process.sendSignal(android.os.Process.myPid(), 10);
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            if (!"DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                setResultCode(16);
                return;
            }
            if (dev.epro.r0.V1475975160983963926.s(android.os.Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                setResultCode(14);
            } else {
                setResultCode(15);
            }
        }
    }
}
