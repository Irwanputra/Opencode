package com.google.android.gms.internal;

import java.util.concurrent.CountDownLatch;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyh implements Runnable {
    private /* synthetic */ CountDownLatch zzans;
    private /* synthetic */ zzyg zzcjz;

    public zzyh(zzyg zzygVar, CountDownLatch countDownLatch) {
        this.zzcjz = zzygVar;
        this.zzans = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzanh zzanhVar;
        synchronized (this.zzcjz.zzcjn) {
            zzyg zzygVar = this.zzcjz;
            zzanhVar = zzygVar.zzbyk;
            zzygVar.zzcjy = com.google.android.gms.ads.internal.zzaq.zza(zzanhVar, this.zzcjz.zzcjx, this.zzans);
        }
    }
}
