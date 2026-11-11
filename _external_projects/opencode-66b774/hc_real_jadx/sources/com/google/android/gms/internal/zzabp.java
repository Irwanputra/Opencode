package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabp implements Runnable {
    private /* synthetic */ zzafp zzanv;
    private /* synthetic */ zzabo zzcqn;

    public zzabp(zzabo zzaboVar, zzafp zzafpVar) {
        this.zzcqn = zzaboVar;
        this.zzanv = zzafpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzzx zzzxVar;
        com.google.android.gms.ads.internal.js.zzaa zzaaVar;
        com.google.android.gms.ads.internal.js.zzaa zzaaVar2;
        zzzxVar = this.zzcqn.zzcmm;
        zzzxVar.zza(this.zzanv);
        zzaaVar = this.zzcqn.zzcqm;
        if (zzaaVar != null) {
            zzaaVar2 = this.zzcqn.zzcqm;
            zzaaVar2.release();
            this.zzcqn.zzcqm = null;
        }
    }
}
