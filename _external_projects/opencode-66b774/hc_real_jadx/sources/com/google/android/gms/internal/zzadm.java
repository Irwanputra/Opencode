package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadm extends zzeu implements zzadk {
    public zzadm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void destroy() {
        zzb(8, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadk
    public final String getMediationAdapterClassName() {
        Parcel zza = zza(12, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzadk
    public final boolean isLoaded() {
        Parcel zza = zza(5, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void pause() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void resume() {
        zzb(7, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void setImmersiveMode(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(34, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void setUserId(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzb(13, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void show() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zza(zzadp zzadpVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzadpVar);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zza(zzadv zzadvVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzadvVar);
        zzb(1, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzb(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(9, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzc(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(10, zzbe);
    }

    @Override // com.google.android.gms.internal.zzadk
    public final void zzd(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(11, zzbe);
    }
}
