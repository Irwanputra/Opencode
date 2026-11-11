package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlq extends zzeu implements zzlo {
    public zzlq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoEnd() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoMute(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoPause() {
        zzb(3, zzbe());
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoPlay() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzlo
    public final void onVideoStart() {
        zzb(1, zzbe());
    }
}
