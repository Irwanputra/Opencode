package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzku extends zzeu implements zzks {
    public zzku(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void destroy() {
        zzb(2, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getAdUnitId() {
        Parcel zza = zza(31, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getMediationAdapterClassName() {
        Parcel zza = zza(18, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzll getVideoController() {
        zzll zzlnVar;
        Parcel zza = zza(26, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzlnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzlnVar = queryLocalInterface instanceof zzll ? (zzll) queryLocalInterface : new zzln(readStrongBinder);
        }
        zza.recycle();
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isLoading() {
        Parcel zza = zza(23, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isReady() {
        Parcel zza = zza(3, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void pause() {
        zzb(5, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final void resume() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setImmersiveMode(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(34, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, z);
        zzb(22, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setUserId(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzb(25, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        zzb(9, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final void stopLoading() {
        zzb(10, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzadp zzadpVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzadpVar);
        zzb(24, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzjn zzjnVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjnVar);
        zzb(13, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzke zzkeVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzkeVar);
        zzb(20, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkh zzkhVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzkhVar);
        zzb(7, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkx zzkxVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzkxVar);
        zzb(8, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzld zzldVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzldVar);
        zzb(21, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzlr zzlrVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzlrVar);
        zzb(30, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzmr zzmrVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzmrVar);
        zzb(29, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzoaVar);
        zzb(19, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxl zzxlVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzxlVar);
        zzb(14, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxr zzxrVar, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzxrVar);
        zzbe.writeString(str);
        zzb(15, zzbe);
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean zzb(zzjj zzjjVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzjjVar);
        Parcel zza = zza(4, zzbe);
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzks
    public final InterfaceC2455 zzbr() {
        Parcel zza = zza(1, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzjn zzbs() {
        Parcel zza = zza(12, zzbe());
        zzjn zzjnVar = (zzjn) zzew.zza(zza, zzjn.CREATOR);
        zza.recycle();
        return zzjnVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zzbu() {
        zzb(11, zzbe());
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkx zzcd() {
        zzkx zzkzVar;
        Parcel zza = zza(32, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkzVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzkzVar = queryLocalInterface instanceof zzkx ? (zzkx) queryLocalInterface : new zzkz(readStrongBinder);
        }
        zza.recycle();
        return zzkzVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkh zzce() {
        zzkh zzkjVar;
        Parcel zza = zza(33, zzbe());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzkjVar = queryLocalInterface instanceof zzkh ? (zzkh) queryLocalInterface : new zzkj(readStrongBinder);
        }
        zza.recycle();
        return zzkjVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final String zzcp() {
        Parcel zza = zza(35, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }
}
