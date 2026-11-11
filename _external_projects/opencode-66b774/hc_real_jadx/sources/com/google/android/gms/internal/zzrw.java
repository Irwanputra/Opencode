package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzrw extends zzeu implements zzrv {
    public zzrw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.zzrv
    public final ParcelFileDescriptor zza(zzrr zzrrVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzrrVar);
        Parcel zza = zza(1, zzbe);
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzew.zza(zza, ParcelFileDescriptor.CREATOR);
        zza.recycle();
        return parcelFileDescriptor;
    }
}
