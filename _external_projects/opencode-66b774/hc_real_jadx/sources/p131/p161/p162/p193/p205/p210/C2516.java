package p131.p161.p162.p193.p205.p210;

import java.util.Collections;
import java.util.List;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.びぐびあび.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2516 {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Object f9858 = new Object();

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static volatile C2516 f9859;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<String> f9860;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final List<String> f9861;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final List<String> f9862;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final List<String> f9863;

    public C2516() {
        List<String> list = Collections.EMPTY_LIST;
        this.f9862 = list;
        this.f9860 = list;
        this.f9861 = list;
        this.f9863 = list;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C2516 m4528() {
        if (f9859 == null) {
            synchronized (f9858) {
                if (f9859 == null) {
                    f9859 = new C2516();
                }
            }
        }
        return f9859;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4529(android.content.Context r4, android.content.Intent r5, android.content.ServiceConnection r6, int r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r5.getComponent()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = 0
            goto L22
        L9:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r0)
            com.google.android.gms.internal.zzbhe r2 = com.google.android.gms.internal.zzbhf.zzdb(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7
            int r0 = r0.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L7
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L7
            r0 = 1
        L22:
            if (r0 == 0) goto L25
            return r1
        L25:
            boolean r4 = r4.bindService(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p193.p205.p210.C2516.m4529(android.content.Context, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }
}
