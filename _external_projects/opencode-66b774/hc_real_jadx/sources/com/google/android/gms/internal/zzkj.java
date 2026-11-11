package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkj extends zzeu implements zzkh {
    public zzkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClicked() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdClosed() {
        zzb(1, zzbe());
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdFailedToLoad(int i) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdImpression() {
        zzb(7, zzbe());
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLeftApplication() {
        zzb(3, zzbe());
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdLoaded() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzkh
    public final void onAdOpened() {
        zzb(5, zzbe());
    }
}
