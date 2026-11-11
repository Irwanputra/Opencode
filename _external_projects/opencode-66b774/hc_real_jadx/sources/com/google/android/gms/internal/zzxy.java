package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzxy implements Runnable {
    private /* synthetic */ zzafo zzaox;
    private /* synthetic */ zzxw zzcjq;

    public zzxy(zzxw zzxwVar, zzafo zzafoVar) {
        this.zzcjq = zzxwVar;
        this.zzaox = zzafoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzcjq.mLock) {
            zzxw zzxwVar = this.zzcjq;
            zzxwVar.zzcjj.zzb(this.zzaox);
        }
    }
}
