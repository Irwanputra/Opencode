package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.internal.zzlx;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class PublisherInterstitialAd {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzlx f2548;

    public PublisherInterstitialAd(Context context) {
        this.f2548 = new zzlx(context, this);
        C1687.m3726(context, "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.f2548.getAdListener();
    }

    public final String getAdUnitId() {
        return this.f2548.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.f2548.getAppEventListener();
    }

    public final String getMediationAdapterClassName() {
        return this.f2548.getMediationAdapterClassName();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f2548.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.f2548.isLoaded();
    }

    public final boolean isLoading() {
        return this.f2548.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f2548.zza(publisherAdRequest.zzbg());
    }

    public final void setAdListener(AdListener adListener) {
        this.f2548.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.f2548.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f2548.setAppEventListener(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f2548.setCorrelator(correlator);
    }

    public final void setImmersiveMode(boolean z) {
        this.f2548.setImmersiveMode(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f2548.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.f2548.show();
    }
}
