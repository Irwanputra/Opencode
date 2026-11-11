package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzks;
import com.google.android.gms.internal.zzlv;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class PublisherAdView extends ViewGroup {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzlv f2547;

    public PublisherAdView(Context context) {
        super(context);
        this.f2547 = new zzlv(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2547 = new zzlv(this, attributeSet, true);
        C1687.m3726(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2547 = new zzlv(this, attributeSet, true);
    }

    public final void destroy() {
        this.f2547.destroy();
    }

    public final AdListener getAdListener() {
        return this.f2547.getAdListener();
    }

    public final AdSize getAdSize() {
        return this.f2547.getAdSize();
    }

    public final AdSize[] getAdSizes() {
        return this.f2547.getAdSizes();
    }

    public final String getAdUnitId() {
        return this.f2547.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.f2547.getAppEventListener();
    }

    public final String getMediationAdapterClassName() {
        return this.f2547.getMediationAdapterClassName();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f2547.getOnCustomRenderedAdLoadedListener();
    }

    public final VideoController getVideoController() {
        return this.f2547.getVideoController();
    }

    public final VideoOptions getVideoOptions() {
        return this.f2547.getVideoOptions();
    }

    public final boolean isLoading() {
        return this.f2547.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.f2547.zza(publisherAdRequest.zzbg());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzakb.zzb("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void pause() {
        this.f2547.pause();
    }

    public final void recordManualImpression() {
        this.f2547.recordManualImpression();
    }

    public final void resume() {
        this.f2547.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.f2547.setAdListener(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f2547.zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.f2547.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f2547.setAppEventListener(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.f2547.setCorrelator(correlator);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f2547.setManualImpressionsEnabled(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f2547.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.f2547.setVideoOptions(videoOptions);
    }

    public final boolean zza(zzks zzksVar) {
        return this.f2547.zza(zzksVar);
    }
}
