package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlc extends zzeu implements zzla {
    public zzlc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzkn createAdLoaderBuilder(InterfaceC2455 interfaceC2455, String str, zzux zzuxVar, int i) {
        zzkn zzkpVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(i);
        Parcel zza = zza(3, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzkpVar = queryLocalInterface instanceof zzkn ? (zzkn) queryLocalInterface : new zzkp(readStrongBinder);
        }
        zza.recycle();
        return zzkpVar;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzxe createAdOverlay(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        Parcel zza = zza(8, zzbe);
        zzxe zzv = zzxf.zzv(zza.readStrongBinder());
        zza.recycle();
        return zzv;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzks createBannerAdManager(InterfaceC2455 interfaceC2455, zzjn zzjnVar, String str, zzux zzuxVar, int i) {
        zzks zzkuVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(i);
        Parcel zza = zza(1, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        zza.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzxo createInAppPurchaseManager(InterfaceC2455 interfaceC2455) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        Parcel zza = zza(7, zzbe);
        zzxo zzx = zzxp.zzx(zza.readStrongBinder());
        zza.recycle();
        return zzx;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzks createInterstitialAdManager(InterfaceC2455 interfaceC2455, zzjn zzjnVar, String str, zzux zzuxVar, int i) {
        zzks zzkuVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzbe.writeString(str);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(i);
        Parcel zza = zza(2, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        zza.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzpu createNativeAdViewDelegate(InterfaceC2455 interfaceC2455, InterfaceC2455 interfaceC24552) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, interfaceC24552);
        Parcel zza = zza(5, zzbe);
        zzpu zzl = zzpv.zzl(zza.readStrongBinder());
        zza.recycle();
        return zzl;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzpz createNativeAdViewHolderDelegate(InterfaceC2455 interfaceC2455, InterfaceC2455 interfaceC24552, InterfaceC2455 interfaceC24553) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, interfaceC24552);
        zzew.zza(zzbe, interfaceC24553);
        Parcel zza = zza(11, zzbe);
        zzpz zzm = zzqa.zzm(zza.readStrongBinder());
        zza.recycle();
        return zzm;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzadk createRewardedVideoAd(InterfaceC2455 interfaceC2455, zzux zzuxVar, int i) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzuxVar);
        zzbe.writeInt(i);
        Parcel zza = zza(6, zzbe);
        zzadk zzz = zzadl.zzz(zza.readStrongBinder());
        zza.recycle();
        return zzz;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzks createSearchAdManager(InterfaceC2455 interfaceC2455, zzjn zzjnVar, String str, int i) {
        zzks zzkuVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzew.zza(zzbe, zzjnVar);
        zzbe.writeString(str);
        zzbe.writeInt(i);
        Parcel zza = zza(10, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzkuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzkuVar = queryLocalInterface instanceof zzks ? (zzks) queryLocalInterface : new zzku(readStrongBinder);
        }
        zza.recycle();
        return zzkuVar;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzlg getMobileAdsSettingsManager(InterfaceC2455 interfaceC2455) {
        zzlg zzliVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        Parcel zza = zza(4, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzliVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzliVar = queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new zzli(readStrongBinder);
        }
        zza.recycle();
        return zzliVar;
    }

    @Override // com.google.android.gms.internal.zzla
    public final zzlg getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC2455 interfaceC2455, int i) {
        zzlg zzliVar;
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, interfaceC2455);
        zzbe.writeInt(i);
        Parcel zza = zza(9, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzliVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzliVar = queryLocalInterface instanceof zzlg ? (zzlg) queryLocalInterface : new zzli(readStrongBinder);
        }
        zza.recycle();
        return zzliVar;
    }
}
