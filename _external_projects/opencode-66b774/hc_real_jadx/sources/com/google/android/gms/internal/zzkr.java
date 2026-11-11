package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkr extends zzeu implements zzkq {
    public zzkr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.zzkq
    public final IBinder zza(InterfaceC2455 interfaceC2455, String str, zzux zzuxVar, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(11910000);
        Parcel zza = zza(1, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
