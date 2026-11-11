package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyj implements Runnable {
    private /* synthetic */ zzafo zzaox;
    private /* synthetic */ zzyi zzckc;

    public zzyj(zzyi zzyiVar, zzafo zzafoVar) {
        this.zzckc = zzyiVar;
        this.zzaox = zzafoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyb zzybVar;
        zzybVar = this.zzckc.zzcjj;
        zzybVar.zzb(this.zzaox);
    }
}
