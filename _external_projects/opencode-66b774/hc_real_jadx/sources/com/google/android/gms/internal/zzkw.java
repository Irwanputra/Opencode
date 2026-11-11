package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkw extends zzeu implements zzkv {
    public zzkw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.zzkv
    public final IBinder zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, String str, zzux zzuxVar, int i, int i2) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(11910000);
        zzbe.writeInt(i2);
        Parcel zza = zza(2, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
