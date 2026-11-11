package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzalt implements Runnable {
    private /* synthetic */ zzalr zzdgk;

    public zzalt(zzalr zzalrVar) {
        this.zzdgk = zzalrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzama zzamaVar;
        zzama zzamaVar2;
        zzamaVar = this.zzdgk.zzdgj;
        if (zzamaVar != null) {
            zzamaVar2 = this.zzdgk.zzdgj;
            zzamaVar2.zzrq();
        }
    }
}
