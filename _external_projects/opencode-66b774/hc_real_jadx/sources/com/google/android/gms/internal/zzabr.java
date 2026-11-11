package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabr implements zzalk<com.google.android.gms.ads.internal.js.zzaj> {
    private /* synthetic */ zzabq zzcqq;

    public zzabr(zzabq zzabqVar) {
        this.zzcqq = zzabqVar;
    }

    @Override // com.google.android.gms.internal.zzalk
    public final /* synthetic */ void zzf(com.google.android.gms.ads.internal.js.zzaj zzajVar) {
        com.google.android.gms.ads.internal.gmsg.zzy zzyVar;
        try {
            zzajVar.zzb("AFMA_getAdapterLessMediationAd", this.zzcqq.zzcqo);
        } catch (Exception e) {
            zzakb.zzb("Error requesting an ad url", e);
            zzyVar = zzabo.zzcqk;
            zzyVar.zzat(this.zzcqq.zzcqp);
        }
    }
}
