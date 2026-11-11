package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkm extends zzeu implements zzkk {
    public zzkm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String getMediationAdapterClassName() {
        Parcel zza = zza(2, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final boolean isLoading() {
        Parcel zza = zza(3, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zza(zzjj zzjjVar, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeInt(i);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String zzcp() {
        Parcel zza = zza(4, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zzd(zzjj zzjjVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjjVar);
        zzb(1, zzbe);
    }
}
