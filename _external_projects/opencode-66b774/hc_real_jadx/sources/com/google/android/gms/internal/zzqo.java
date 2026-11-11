package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzqo extends zzeu implements zzqm {
    public zzqo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void destroy() {
        zzb(8, zzbe());
    }

    @Override // com.google.android.gms.internal.zzqm
    public final List<String> getAvailableAssetNames() {
        Parcel zza = zza(3, zzbe());
        ArrayList<String> createStringArrayList = zza.createStringArrayList();
        zza.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.zzqm, com.google.android.gms.internal.zzou
    public final String getCustomTemplateId() {
        Parcel zza = zza(4, zzbe());
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final zzll getVideoController() {
        Parcel zza = zza(7, zzbe());
        zzll zzh = zzlm.zzh(zza.readStrongBinder());
        zza.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void performClick(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        zzb(5, zzbe);
    }

    @Override // com.google.android.gms.internal.zzqm
    public final void recordImpression() {
        zzb(6, zzbe());
    }

    @Override // com.google.android.gms.internal.zzqm
    public final String zzap(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        Parcel zza = zza(1, zzbe);
        String readString = zza.readString();
        zza.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final zzpq zzaq(String str) {
        zzpq zzpsVar;
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        Parcel zza = zza(2, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzpsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzpsVar = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new zzps(readStrongBinder);
        }
        zza.recycle();
        return zzpsVar;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final boolean zzf(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        Parcel zza = zza(10, zzbe);
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final InterfaceC2455 zzjt() {
        Parcel zza = zza(11, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }

    @Override // com.google.android.gms.internal.zzqm
    public final InterfaceC2455 zzka() {
        Parcel zza = zza(9, zzbe());
        InterfaceC2455 m4503 = InterfaceC2455.AbstractBinderC2456.m4503(zza.readStrongBinder());
        zza.recycle();
        return m4503;
    }
}
