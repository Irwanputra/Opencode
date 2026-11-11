package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpy extends zzeu implements zzpx {
    public zzpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.zzpx
    public final IBinder zza(InterfaceC2455 interfaceC2455, InterfaceC2455 interfaceC24552, InterfaceC2455 interfaceC24553, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, interfaceC24552);
        zzew.zza(zzbe, interfaceC24553);
        zzbe.writeInt(11910000);
        Parcel zza = zza(1, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        zza.recycle();
        return readStrongBinder;
    }
}
