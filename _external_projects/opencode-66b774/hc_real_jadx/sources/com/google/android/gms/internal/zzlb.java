package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzlb extends zzev implements zzla {
    public zzlb() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public static zzla asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
        return queryLocalInterface instanceof zzla ? (zzla) queryLocalInterface : new zzlc(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface createBannerAdManager;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                createBannerAdManager = createBannerAdManager(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), (zzjn) zzew.zza(parcel, zzjn.CREATOR), parcel.readString(), zzuy.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                createBannerAdManager = createInterstitialAdManager(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), (zzjn) zzew.zza(parcel, zzjn.CREATOR), parcel.readString(), zzuy.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                createBannerAdManager = createAdLoaderBuilder(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readString(), zzuy.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                createBannerAdManager = getMobileAdsSettingsManager(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 5:
                createBannerAdManager = createNativeAdViewDelegate(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 6:
                createBannerAdManager = createRewardedVideoAd(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), zzuy.zzu(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                createBannerAdManager = createInAppPurchaseManager(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 8:
                createBannerAdManager = createAdOverlay(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            case 9:
                createBannerAdManager = getMobileAdsSettingsManagerWithClientJarVersion(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                createBannerAdManager = createSearchAdManager(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), (zzjn) zzew.zza(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                createBannerAdManager = createNativeAdViewHolderDelegate(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        zzew.zza(parcel2, createBannerAdManager);
        return true;
    }
}
