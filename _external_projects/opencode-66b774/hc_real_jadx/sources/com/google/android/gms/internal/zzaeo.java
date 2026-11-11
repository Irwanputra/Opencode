package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaeo extends zzeu implements zzaem {
    public zzaeo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zza(InterfaceC2455 interfaceC2455, zzaeq zzaeqVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzaeqVar);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzc(InterfaceC2455 interfaceC2455, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeInt(i);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzd(InterfaceC2455 interfaceC2455, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeInt(i);
        zzb(9, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzm(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(1, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzn(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzo(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(4, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzp(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzq(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(6, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzr(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(8, zzbe);
    }

    @Override // com.google.android.gms.internal.zzaem
    public final void zzs(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(10, zzbe);
    }
}
