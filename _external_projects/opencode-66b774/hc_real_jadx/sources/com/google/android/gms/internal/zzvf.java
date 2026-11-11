package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvf extends zzeu implements zzvd {
    public zzvf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdClicked() {
        zzb(1, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdClosed() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdFailedToLoad(int i) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdImpression() {
        zzb(8, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdLeftApplication() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdLoaded() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAdOpened() {
        zzb(5, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onAppEvent(String str, String str2) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzbe.writeString(str2);
        zzb(9, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void onVideoEnd() {
        zzb(11, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void zza(zzvg zzvgVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzvgVar);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvd
    public final void zzb(zzqm zzqmVar, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqmVar);
        zzbe.writeString(str);
        zzb(10, zzbe);
    }
}
