package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzip extends zzeu implements zzio {
    public zzip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.zzio
    public final zzii zza(zzil zzilVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzilVar);
        Parcel zza = zza(1, zzbe);
        zzii zziiVar = (zzii) zzew.zza(zza, zzii.CREATOR);
        zza.recycle();
        return zziiVar;
    }
}
