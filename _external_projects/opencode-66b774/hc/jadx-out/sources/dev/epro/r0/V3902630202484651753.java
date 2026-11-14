package dev.epro.r0;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V3902630202484651753 {
    static {
        B14824868959299866349.o("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "WorkManager: ProcessorForegroundLck");
        synchronized (S7483354491388813478.a) {
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
