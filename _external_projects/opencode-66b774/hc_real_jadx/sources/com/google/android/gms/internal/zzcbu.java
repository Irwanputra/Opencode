package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzcbu extends zzeu implements zzcbt {
    public zzcbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.zzcbt
    public final zzcbr zza(zzcbp zzcbpVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzcbpVar);
        Parcel zza = zza(1, zzbe);
        zzcbr zzcbrVar = (zzcbr) zzew.zza(zza, zzcbr.CREATOR);
        zza.recycle();
        return zzcbrVar;
    }
}
