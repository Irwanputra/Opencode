package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadr extends zzeu implements zzadp {
    public zzadr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdClosed() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdFailedToLoad(int i) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdLeftApplication() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdLoaded() {
        zzb(1, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoAdOpened() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void onRewardedVideoStarted() {
        zzb(3, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadp
    public final void zza(zzadh zzadhVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzadhVar);
        zzb(5, zzbe);
    }
}
