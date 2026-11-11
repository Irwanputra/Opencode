package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzye implements Runnable {
    private /* synthetic */ zzafo zzcjr;
    private /* synthetic */ zzyd zzcjs;

    public zzye(zzyd zzydVar, zzafo zzafoVar) {
        this.zzcjs = zzydVar;
        this.zzcjr = zzafoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzyb zzybVar;
        zzybVar = this.zzcjs.zzcjj;
        zzybVar.zzb(this.zzcjr);
    }
}
