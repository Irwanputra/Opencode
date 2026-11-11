package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznz extends zzeu implements zznx {
    public zznz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.zznx
    public final String getContent() {
        Parcel zza = zza(2, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zznx
    public final void recordClick() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zznx
    public final void recordImpression() {
        zzb(5, zzbe());
    }

    @Override // com.google.android.gms.internal.zznx
    public final void zze(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zznx
    public final String zzjj() {
        Parcel zza = zza(1, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}
