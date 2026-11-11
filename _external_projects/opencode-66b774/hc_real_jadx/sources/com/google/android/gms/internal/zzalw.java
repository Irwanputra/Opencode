package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzalw implements Runnable {
    private /* synthetic */ zzalr zzdgk;
    private /* synthetic */ int zzdgn;
    private /* synthetic */ int zzdgo;

    public zzalw(zzalr zzalrVar, int i, int i2) {
        this.zzdgk = zzalrVar;
        this.zzdgn = i;
        this.zzdgo = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzama zzamaVar;
        zzama zzamaVar2;
        zzamaVar = this.zzdgk.zzdgj;
        if (zzamaVar != null) {
            zzamaVar2 = this.zzdgk.zzdgj;
            zzamaVar2.zzf(this.zzdgn, this.zzdgo);
        }
    }
}
