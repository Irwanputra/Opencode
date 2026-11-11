package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzalu implements Runnable {
    private /* synthetic */ zzalr zzdgk;
    private /* synthetic */ String zzdgl;
    private /* synthetic */ String zzdgm;

    public zzalu(zzalr zzalrVar, String str, String str2) {
        this.zzdgk = zzalrVar;
        this.zzdgl = str;
        this.zzdgm = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzama zzamaVar;
        zzama zzamaVar2;
        zzamaVar = this.zzdgk.zzdgj;
        if (zzamaVar != null) {
            zzamaVar2 = this.zzdgk.zzdgj;
            zzamaVar2.zzg(this.zzdgl, this.zzdgm);
        }
    }
}
