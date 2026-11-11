package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvl extends zzeu implements zzvj {
    public zzvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    @Override // com.google.android.gms.internal.zzvj
    public final String getBody() {
        Parcel zza = zza(4, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final String getCallToAction() {
        Parcel zza = zza(6, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final Bundle getExtras() {
        Parcel zza = zza(15, zzbe());
        Bundle bundle = (Bundle) zzew.zza(zza, Bundle.CREATOR);
        zza.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final String getHeadline() {
        Parcel zza = zza(2, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final List getImages() {
        Parcel zza = zza(3, zzbe());
        ArrayList zzb = zzew.zzb(zza);
        zza.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final boolean getOverrideClickHandling() {
        Parcel zza = zza(14, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final boolean getOverrideImpressionRecording() {
        Parcel zza = zza(13, zzbe());
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final String getPrice() {
        Parcel zza = zza(9, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final double getStarRating() {
        Parcel zza = zza(7, zzbe());
        double readDouble = zza.readDouble();
        zza.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final String getStore() {
        Parcel zza = zza(8, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final zzll getVideoController() {
        Parcel zza = zza(17, zzbe());
        zzll zzh = zzlm.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final void recordImpression() {
        zzb(10, zzbe());
    }

    @Override // com.google.android.gms.internal.zzvj
    public final void zzh(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(11, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvj
    public final void zzi(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(12, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvj
    public final void zzj(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzb(16, zzbe);
    }

    @Override // com.google.android.gms.internal.zzvj
    public final zzpq zzjs() {
        Parcel zza = zza(5, zzbe());
        zzpq zzk = zzpr.zzk(zza.readStrongBinder());
        zza.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final InterfaceC2455 zzjx() {
        Parcel zza = zza(21, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final zzpm zzjy() {
        Parcel zza = zza(19, zzbe());
        zzpm zzj = zzpn.zzj(zza.readStrongBinder());
        zza.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final InterfaceC2455 zzmk() {
        Parcel zza = zza(18, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzvj
    public final InterfaceC2455 zzml() {
        Parcel zza = zza(20, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }
}
