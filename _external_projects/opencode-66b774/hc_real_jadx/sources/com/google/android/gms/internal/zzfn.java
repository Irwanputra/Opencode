package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfn extends zzeu implements zzfl {
    public zzfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zza(InterfaceC2455 interfaceC2455, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zza(InterfaceC2455 interfaceC2455, String str, String str2) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzbe.writeString(null);
        zzb(8, zzbe);
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zza(int[] iArr) {
        Parcel zzbe = zzbe();
        zzbe.writeIntArray(null);
        zzb(4, zzbe);
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zzbk() {
        zzb(3, zzbe());
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zzc(byte[] bArr) {
        Parcel zzbe = zzbe();
        zzbe.writeByteArray(bArr);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zzg(int i) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzb(6, zzbe);
    }

    @Override // com.google.android.gms.internal.zzfl
    public final void zzh(int i) {
        Parcel zzbe = zzbe();
        zzbe.writeInt(i);
        zzb(7, zzbe);
    }
}
