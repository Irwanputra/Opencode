package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabt implements Runnable {
    private /* synthetic */ zzabo zzcqn;

    public zzabt(zzabo zzaboVar) {
        this.zzcqn = zzaboVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.js.zzaa zzaaVar;
        com.google.android.gms.ads.internal.js.zzaa zzaaVar2;
        zzaaVar = this.zzcqn.zzcqm;
        if (zzaaVar != null) {
            zzaaVar2 = this.zzcqn.zzcqm;
            zzaaVar2.release();
            this.zzcqn.zzcqm = null;
        }
    }
}
