package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpw extends zzeu implements zzpu {
    public zzpw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void destroy() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zza(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzpu
    public final InterfaceC2455 zzal(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        Parcel zza = zza(2, zzbe);
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zzb(String str, InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzew.zza(zzbe, interfaceC2455);
        zzb(1, zzbe);
    }

    @Override // com.google.android.gms.internal.zzpu
    public final void zzb(InterfaceC2455 interfaceC2455, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeInt(i);
        zzb(5, zzbe);
    }
}
