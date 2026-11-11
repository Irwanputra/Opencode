package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaag implements Runnable {
    private /* synthetic */ zzzy zzcmu;

    public zzaag(zzzy zzzyVar) {
        this.zzcmu = zzzyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzcmu.zzcjn;
        synchronized (obj) {
            zzzy zzzyVar = this.zzcmu;
            if (zzzyVar.zzcmq == null) {
                return;
            }
            zzzyVar.onStop();
            this.zzcmu.zzc(2, "Timed out waiting for ad response.");
        }
    }
}
