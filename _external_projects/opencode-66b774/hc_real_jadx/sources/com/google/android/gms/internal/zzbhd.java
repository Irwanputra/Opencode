package com.google.android.gms.internal;

import android.content.Context;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbhd {
    private static Context zzgfe;
    private static Boolean zzgff;

    public static synchronized boolean zzcz(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (zzbhd.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = zzgfe;
            if (context2 != null && (bool2 = zzgff) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            zzgff = null;
            if (!C1687.m3704()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzgff = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                zzgfe = applicationContext;
                return zzgff.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            zzgff = bool;
            zzgfe = applicationContext;
            return zzgff.booleanValue();
        }
    }
}
