package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzm implements zzaki<zzanh> {
    private /* synthetic */ String zzcmb;
    private /* synthetic */ com.google.android.gms.ads.internal.gmsg.zzt zzcmc;

    public zzzm(zzzf zzzfVar, String str, com.google.android.gms.ads.internal.gmsg.zzt zztVar) {
        this.zzcmb = str;
        this.zzcmc = zztVar;
    }

    @Override // com.google.android.gms.internal.zzaki
    public final /* synthetic */ void onSuccess(zzanh zzanhVar) {
        zzanhVar.zzb(this.zzcmb, this.zzcmc);
    }

    @Override // com.google.android.gms.internal.zzaki
    public final void zzb(Throwable th) {
    }
}
