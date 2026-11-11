package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoc extends zzeu implements zzoa {
    public zzoc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.zzoa
    public final void zza(zznx zznxVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zznxVar);
        zzb(1, zzbe);
    }
}
