package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzanl implements Runnable {
    private /* synthetic */ zzani zzdlf;

    public zzanl(zzani zzaniVar) {
        this.zzdlf = zzaniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzano zzanoVar;
        zzano zzanoVar2;
        this.zzdlf.zzbyk.zzth();
        com.google.android.gms.ads.internal.overlay.zzd zzsv = this.zzdlf.zzbyk.zzsv();
        if (zzsv != null) {
            zzsv.zzmv();
        }
        zzanoVar = this.zzdlf.zzdkq;
        if (zzanoVar != null) {
            zzanoVar2 = this.zzdlf.zzdkq;
            zzanoVar2.zzdc();
            zzani.zza(this.zzdlf, (zzano) null);
        }
    }
}
