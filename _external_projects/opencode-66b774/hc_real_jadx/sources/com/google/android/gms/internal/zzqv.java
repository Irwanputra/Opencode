package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzqv extends zzeu implements zzqt {
    public zzqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.zzqt
    public final void zza(zzqi zzqiVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqiVar);
        zzb(1, zzbe);
    }
}
