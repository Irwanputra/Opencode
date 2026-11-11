package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzado extends zzeu implements zzadn {
    public zzado(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.zzadn
    public final IBinder zza(InterfaceC2455 interfaceC2455, zzux zzuxVar, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(11910000);
        Parcel zza = zza(1, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
