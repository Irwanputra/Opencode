package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.zzakb;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class NativeContentAdView extends NativeAdView {
    public NativeContentAdView(Context context) {
        super(context);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final View getAdvertiserView() {
        return m1199(NativeContentAd.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return m1199(NativeContentAd.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return m1199(NativeContentAd.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return m1199(NativeContentAd.ASSET_HEADLINE);
    }

    public final View getImageView() {
        return m1199(NativeContentAd.ASSET_IMAGE);
    }

    public final View getLogoView() {
        return m1199(NativeContentAd.ASSET_LOGO);
    }

    public final MediaView getMediaView() {
        View m1199 = m1199(NativeContentAd.ASSET_MEDIA_VIDEO);
        if (m1199 instanceof MediaView) {
            return (MediaView) m1199;
        }
        if (m1199 == null) {
            return null;
        }
        zzakb.zzbx("View is not an instance of MediaView");
        return null;
    }

    public final void setAdvertiserView(View view) {
        m1198(NativeContentAd.ASSET_ADVERTISER, view);
    }

    public final void setBodyView(View view) {
        m1198(NativeContentAd.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        m1198(NativeContentAd.ASSET_CALL_TO_ACTION, view);
    }

    public final void setHeadlineView(View view) {
        m1198(NativeContentAd.ASSET_HEADLINE, view);
    }

    public final void setImageView(View view) {
        m1198(NativeContentAd.ASSET_IMAGE, view);
    }

    public final void setLogoView(View view) {
        m1198(NativeContentAd.ASSET_LOGO, view);
    }

    public final void setMediaView(MediaView mediaView) {
        m1198(NativeContentAd.ASSET_MEDIA_VIDEO, mediaView);
    }
}
