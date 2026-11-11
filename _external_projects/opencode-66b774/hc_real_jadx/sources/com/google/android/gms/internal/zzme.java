package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzme extends zzkl {
    public final /* synthetic */ zzmc zzbgr;

    private zzme(zzmc zzmcVar) {
        this.zzbgr = zzmcVar;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final boolean isLoading() {
        return false;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zza(zzjj zzjjVar, int i) {
        zzakb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzajr.zzajw.post(new zzmf(this));
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String zzcp() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zzd(zzjj zzjjVar) {
        zza(zzjjVar, 1);
    }
}
