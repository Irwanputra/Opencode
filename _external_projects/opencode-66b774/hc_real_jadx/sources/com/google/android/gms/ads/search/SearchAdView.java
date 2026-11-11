package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzzv;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class SearchAdView extends ViewGroup {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzlv f2852;

    public SearchAdView(Context context) {
        super(context);
        this.f2852 = new zzlv(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2852 = new zzlv(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2852 = new zzlv(this, attributeSet, false);
    }

    public final void destroy() {
        this.f2852.destroy();
    }

    public final AdListener getAdListener() {
        return this.f2852.getAdListener();
    }

    public final AdSize getAdSize() {
        return this.f2852.getAdSize();
    }

    public final String getAdUnitId() {
        return this.f2852.getAdUnitId();
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!AdSize.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.f2852.zza(dynamicHeightSearchAdRequest.f2845.f2849);
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
        this.f2852.pause();
    }

    public final void resume() {
        this.f2852.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.f2852.setAdListener(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.f2852.setAdSizes(adSize);
    }

    public final void setAdUnitId(String str) {
        this.f2852.setAdUnitId(str);
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.f2852.zza(searchAdRequest.f2849);
    }
}
