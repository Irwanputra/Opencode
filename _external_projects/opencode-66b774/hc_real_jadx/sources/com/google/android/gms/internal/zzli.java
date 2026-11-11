package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzli extends zzeu implements zzlg {
    public zzli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void initialize() {
        zzb(1, zzbe());
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void setAppMuted(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(4, zzbe);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void setAppVolume(float f) {
        Parcel zzbe = zzbe();
        zzbe.writeFloat(f);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zza(String str, InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzew.zza(zzbe, interfaceC2455);
        zzb(6, zzbe);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zzb(InterfaceC2455 interfaceC2455, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzlg
    public final float zzdn() {
        Parcel zza = zza(7, zzbe());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.zzlg
    public final boolean zzdo() {
        Parcel zza = zza(8, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzlg
    public final void zzu(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzb(3, zzbe);
    }
}
