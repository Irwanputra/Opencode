package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvc extends zzeu implements zzva {
    public zzvc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.zzva
    public final void destroy() {
        zzb(5, zzbe());
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle getInterstitialAdapterInfo() {
        Parcel zza = zza(18, zzbe());
        Bundle bundle = (Bundle) zzew.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzll getVideoController() {
        Parcel zza = zza(26, zzbe());
        zzll zzh = zzlm.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.zzva
    public final InterfaceC2455 getView() {
        Parcel zza = zza(2, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzva
    public final boolean isInitialized() {
        Parcel zza = zza(13, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzva
    public final void pause() {
        zzb(8, zzbe());
    }

    @Override // com.google.android.gms.internal.zzva
    public final void resume() {
        zzb(9, zzbe());
    }

    @Override // com.google.android.gms.internal.zzva
    public final void setImmersiveMode(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(25, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showInterstitial() {
        zzb(4, zzbe());
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showVideo() {
        zzb(12, zzbe());
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(zzjj zzjjVar, String str, String str2) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzbe.writeString(str2);
        zzb(20, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzaem zzaemVar, List<String> list) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzaemVar);
        zzbe.writeStringList(list);
        zzb(23, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzaem zzaemVar, String str2) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzaemVar);
        zzbe.writeString(str2);
        zzb(10, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzvd zzvdVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzvdVar);
        zzb(3, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzbe.writeString(str2);
        zzew.zza(zzbe, zzvdVar);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar, zzpe zzpeVar, List<String> list) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzbe.writeString(str2);
        zzew.zza(zzbe, zzvdVar);
        zzew.zza(zzbe, zzpeVar);
        zzbe.writeStringList(list);
        zzb(14, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, zzvd zzvdVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzvdVar);
        zzb(1, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzbe.writeString(str2);
        zzew.zza(zzbe, zzvdVar);
        zzb(6, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzc(zzjj zzjjVar, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjjVar);
        zzbe.writeString(str);
        zzb(11, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzg(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(21, zzbe);
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvj zzme() {
        zzvj zzvlVar;
        Parcel zza = zza(15, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzvlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzvlVar = queryLocalInterface instanceof zzvj ? (zzvj) queryLocalInterface : new zzvl(readStrongBinder);
        }
        zza.recycle();
        return zzvlVar;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvm zzmf() {
        zzvm zzvoVar;
        Parcel zza = zza(16, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzvoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzvoVar = queryLocalInterface instanceof zzvm ? (zzvm) queryLocalInterface : new zzvo(readStrongBinder);
        }
        zza.recycle();
        return zzvoVar;
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmg() {
        Parcel zza = zza(17, zzbe());
        Bundle bundle = (Bundle) zzew.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmh() {
        Parcel zza = zza(19, zzbe());
        Bundle bundle = (Bundle) zzew.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.zzva
    public final boolean zzmi() {
        Parcel zza = zza(22, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzqm zzmj() {
        Parcel zza = zza(24, zzbe());
        zzqm zzn = zzqn.zzn(zza.readStrongBinder());
        zza.recycle();
        return zzn;
    }
}
