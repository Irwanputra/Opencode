package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzzv;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzac {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public long f2659 = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Context f2660;

    public final void zza(Context context, zzakd zzakdVar, String str, Runnable runnable) {
        m1218(context, zzakdVar, true, null, str, null, runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
    
        if (r11.zzov() != false) goto L17;
     */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1218(android.content.Context r8, com.google.android.gms.internal.zzakd r9, boolean r10, com.google.android.gms.internal.zzafs r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
        /*
            r7 = this;
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.げつ〴ぬぐ r0 = com.google.android.gms.ads.internal.zzbs.zzeo()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.〺つふすそ r0 = (p131.p161.p162.p193.p205.p209.C2510) r0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r7.f2659
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            java.lang.String r8 = "Not retrying to fetch app settings"
            com.google.android.gms.internal.zzakb.zzcu(r8)
            return
        L1c:
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.げつ〴ぬぐ r0 = com.google.android.gms.ads.internal.zzbs.zzeo()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.〺つふすそ r0 = (p131.p161.p162.p193.p205.p209.C2510) r0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f2659 = r0
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L31
        L2f:
            r0 = 1
            goto L63
        L31:
            long r2 = r11.zzou()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.げつ〴ぬぐ r4 = com.google.android.gms.ads.internal.zzbs.zzeo()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.びぐびあび.づざかべべ.〺つふすそ r4 = (p131.p161.p162.p193.p205.p209.C2510) r4
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            com.google.android.gms.internal.zzmx<java.lang.Long> r2 = com.google.android.gms.internal.zznh.zzbpn
            com.google.android.gms.internal.zznf r3 = com.google.android.gms.internal.zzkb.zzif()
            java.lang.Object r2 = r3.zzd(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L59
            r2 = 1
            goto L5a
        L59:
            r2 = 0
        L5a:
            if (r2 != 0) goto L2f
            boolean r11 = r11.zzov()
            if (r11 != 0) goto L63
            goto L2f
        L63:
            if (r0 != 0) goto L66
            return
        L66:
            if (r8 != 0) goto L6e
            java.lang.String r8 = "Context not provided to fetch application settings"
            com.google.android.gms.internal.zzakb.zzcu(r8)
            return
        L6e:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 == 0) goto L80
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L80
            java.lang.String r8 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.internal.zzakb.zzcu(r8)
            return
        L80:
            android.content.Context r11 = r8.getApplicationContext()
            if (r11 == 0) goto L87
            goto L88
        L87:
            r11 = r8
        L88:
            r7.f2660 = r11
            com.google.android.gms.internal.zztq r11 = com.google.android.gms.ads.internal.zzbs.zzev()
            android.content.Context r0 = r7.f2660
            com.google.android.gms.internal.zztx r9 = r11.zzb(r0, r9)
            com.google.android.gms.internal.zztt<org.json.JSONObject> r11 = com.google.android.gms.internal.zztu.zzccb
            java.lang.String r0 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.zztp r9 = r9.zza(r0, r11, r11)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Le0
            r11.<init>()     // Catch: java.lang.Exception -> Le0
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Le0
            if (r0 != 0) goto Lad
            java.lang.String r13 = "app_id"
            r11.put(r13, r12)     // Catch: java.lang.Exception -> Le0
            goto Lb8
        Lad:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Le0
            if (r12 != 0) goto Lb8
            java.lang.String r12 = "ad_unit_id"
            r11.put(r12, r13)     // Catch: java.lang.Exception -> Le0
        Lb8:
            java.lang.String r12 = "is_init"
            r11.put(r12, r10)     // Catch: java.lang.Exception -> Le0
            java.lang.String r10 = "pn"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Le0
            r11.put(r10, r8)     // Catch: java.lang.Exception -> Le0
            com.google.android.gms.internal.zzakv r8 = r9.zzg(r11)     // Catch: java.lang.Exception -> Le0
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.づざかべべ r9 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.づざかべべ     // Catch: java.lang.Exception -> Le0
            r9.<init>(r7)     // Catch: java.lang.Exception -> Le0
            java.util.concurrent.Executor r10 = com.google.android.gms.internal.zzala.zzdff     // Catch: java.lang.Exception -> Le0
            com.google.android.gms.internal.zzakv r9 = com.google.android.gms.internal.zzakl.zza(r8, r9, r10)     // Catch: java.lang.Exception -> Le0
            if (r14 == 0) goto Lda
            r8.zza(r14, r10)     // Catch: java.lang.Exception -> Le0
        Lda:
            java.lang.String r8 = "ConfigLoader.maybeFetchNewAppSettings"
            com.google.android.gms.internal.zzakj.zza(r9, r8)     // Catch: java.lang.Exception -> Le0
            return
        Le0:
            r8 = move-exception
            java.lang.String r9 = "Error requesting application settings"
            com.google.android.gms.internal.zzakb.zzb(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzac.m1218(android.content.Context, com.google.android.gms.internal.zzakd, boolean, com.google.android.gms.internal.zzafs, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }
}
