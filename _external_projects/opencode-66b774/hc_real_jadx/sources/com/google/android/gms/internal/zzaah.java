package com.google.android.gms.internal;

import android.os.Handler;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaah implements Runnable {
    private /* synthetic */ zzzy zzcmu;
    private /* synthetic */ zzalh zzcmv;

    public zzaah(zzzy zzzyVar, zzalh zzalhVar) {
        this.zzcmu = zzzyVar;
        this.zzcmv = zzalhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzaau zzaauVar;
        Runnable runnable;
        obj = this.zzcmu.zzcjn;
        synchronized (obj) {
            zzzy zzzyVar = this.zzcmu;
            zzaauVar = zzzyVar.zzcmn;
            zzzyVar.zzcmq = zzzyVar.zza(zzaauVar.zzaty, this.zzcmv);
            zzzy zzzyVar2 = this.zzcmu;
            if (zzzyVar2.zzcmq == null) {
                zzzyVar2.zzc(0, "Could not start the ad request service.");
                Handler handler = zzahn.zzdaw;
                runnable = this.zzcmu.zzcjm;
                handler.removeCallbacks(runnable);
            }
        }
    }
}
