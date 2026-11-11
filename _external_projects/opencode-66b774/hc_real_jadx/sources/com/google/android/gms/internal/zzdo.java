package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdo implements Runnable {
    private /* synthetic */ zzdm zzaji;
    private /* synthetic */ int zzajj;
    private /* synthetic */ boolean zzajk;

    public zzdo(zzdm zzdmVar, int i, boolean z) {
        this.zzaji = zzdmVar;
        this.zzajj = i;
        this.zzajk = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzaz zzb = this.zzaji.zzb(this.zzajj, this.zzajk);
        this.zzaji.zzaiz = zzb;
        zza = zzdm.zza(this.zzajj, zzb);
        if (zza) {
            this.zzaji.zza(this.zzajj + 1, this.zzajk);
        }
    }
}
