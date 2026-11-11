package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.zzakb;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class NativeAppInstallAdView extends NativeAdView {
    public NativeAppInstallAdView(Context context) {
        super(context);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAppInstallAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final View getBodyView() {
        return m1199(NativeAppInstallAd.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return m1199(NativeAppInstallAd.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return m1199(NativeAppInstallAd.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return m1199(NativeAppInstallAd.ASSET_ICON);
    }

    public final View getImageView() {
        return m1199(NativeAppInstallAd.ASSET_IMAGE);
    }

    public final MediaView getMediaView() {
        View m1199 = m1199(NativeAppInstallAd.ASSET_MEDIA_VIDEO);
        if (m1199 instanceof MediaView) {
            return (MediaView) m1199;
        }
        if (m1199 == null) {
            return null;
        }
        zzakb.zzbx("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return m1199(NativeAppInstallAd.ASSET_PRICE);
    }

    public final View getStarRatingView() {
        return m1199(NativeAppInstallAd.ASSET_STAR_RATING);
    }

    public final View getStoreView() {
        return m1199(NativeAppInstallAd.ASSET_STORE);
    }

    public final void setBodyView(View view) {
        m1198(NativeAppInstallAd.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        m1198(NativeAppInstallAd.ASSET_CALL_TO_ACTION, view);
    }

    public final void setHeadlineView(View view) {
        m1198(NativeAppInstallAd.ASSET_HEADLINE, view);
    }

    public final void setIconView(View view) {
        m1198(NativeAppInstallAd.ASSET_ICON, view);
    }

    public final void setImageView(View view) {
        m1198(NativeAppInstallAd.ASSET_IMAGE, view);
    }

    public final void setMediaView(MediaView mediaView) {
        m1198(NativeAppInstallAd.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final void setPriceView(View view) {
        m1198(NativeAppInstallAd.ASSET_PRICE, view);
    }

    public final void setStarRatingView(View view) {
        m1198(NativeAppInstallAd.ASSET_STAR_RATING, view);
    }

    public final void setStoreView(View view) {
        m1198(NativeAppInstallAd.ASSET_STORE, view);
    }
}
