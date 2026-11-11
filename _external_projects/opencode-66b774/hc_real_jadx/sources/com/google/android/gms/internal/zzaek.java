package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaek implements Runnable {
    private /* synthetic */ zzafo zzaox;
    private /* synthetic */ zzaei zzcwa;

    public zzaek(zzaei zzaeiVar, zzafo zzafoVar) {
        this.zzcwa = zzaeiVar;
        this.zzaox = zzafoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzade zzadeVar;
        zzadeVar = this.zzcwa.zzcvz;
        zzadeVar.zzb(this.zzaox);
    }
}
