package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzlx;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class InterstitialAd {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzlx f2534;

    public InterstitialAd(Context context) {
        this.f2534 = new zzlx(context);
        C1687.m3726(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f2534.getAdListener();
    }

    public final String getAdUnitId() {
        return this.f2534.getAdUnitId();
    }

    public final String getMediationAdapterClassName() {
        return this.f2534.getMediationAdapterClassName();
    }

    public final boolean isLoaded() {
        return this.f2534.isLoaded();
    }

    public final boolean isLoading() {
        return this.f2534.isLoading();
    }

    public final void loadAd(AdRequest adRequest) {
        this.f2534.zza(adRequest.zzbg());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setAdListener(AdListener adListener) {
        this.f2534.setAdListener(adListener);
        if (adListener != 0 && (adListener instanceof zzje)) {
            this.f2534.zza((zzje) adListener);
        } else if (adListener == 0) {
            this.f2534.zza((zzje) null);
        }
    }

    public final void setAdUnitId(String str) {
        this.f2534.setAdUnitId(str);
    }

    public final void setImmersiveMode(boolean z) {
        this.f2534.setImmersiveMode(z);
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f2534.setRewardedVideoAdListener(rewardedVideoAdListener);
    }

    public final void show() {
        this.f2534.show();
    }

    public final void zza(boolean z) {
        this.f2534.zza(true);
    }
}
