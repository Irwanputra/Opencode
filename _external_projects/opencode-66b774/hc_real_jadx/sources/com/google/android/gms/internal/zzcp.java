package com.google.android.gms.internal;

import android.os.Build;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzcp {
    private static final ConditionVariable zzags = new ConditionVariable();
    public static volatile zzix zzagt = null;
    private static volatile Random zzagv = null;
    private zzdm zzagr;
    public volatile Boolean zzagu;

    public zzcp(zzdm zzdmVar) {
        this.zzagr = zzdmVar;
        zzdmVar.zzag().execute(new zzcq(this));
    }

    public static int zzac() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : zzad().nextInt();
        } catch (RuntimeException unused) {
            return zzad().nextInt();
        }
    }

    private static Random zzad() {
        if (zzagv == null) {
            synchronized (zzcp.class) {
                if (zzagv == null) {
                    zzagv = new Random();
                }
            }
        }
        return zzagv;
    }

    public final void zza(int i, int i2, long j) {
        try {
            zzags.block();
            if (!this.zzagu.booleanValue() || zzagt == null) {
                return;
            }
            zzav zzavVar = new zzav();
            zzavVar.zzcn = this.zzagr.zzair.getPackageName();
            zzavVar.zzco = Long.valueOf(j);
            zziz zzd = zzagt.zzd(zzfjs.zzc(zzavVar));
            zzd.zzp(i2);
            zzd.zzq(i);
            zzd.zzbk();
        } catch (Exception unused) {
        }
    }
}
