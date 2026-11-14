package dev.epro.r0;

import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U7463707071975914439 extends O13929443358578228167 {
    public final View getAdvertiserView() {
        return getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_BODY);
    }

    public final View getCreativeSummaryView() {
        return getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_CREATIVE_SUMMARY);
    }

    public final U11418547743224346941 getMediaView() {
        View viewB = getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_MEDIA_CONTENT);
        if (viewB instanceof U11418547743224346941) {
            return (U11418547743224346941) viewB;
        }
        return null;
    }

    public final View getPriceView() {
        return getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_PRICE);
    }

    public final View getStoreView() {
        return getNativeAdViewContainer().b(NativeAdAssetNames.ASSET_STORE);
    }

    public final void setAdvertiserView(View view) {
        getNativeAdViewContainer().a(view, NativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final void setBodyView(View view) {
        getNativeAdViewContainer().a(view, NativeAdAssetNames.ASSET_BODY);
    }

    public final void setCreativeSummaryView(View view) {
        getNativeAdViewContainer().a(view, NativeAdAssetNames.ASSET_CREATIVE_SUMMARY);
    }

    public final void setPriceView(View view) {
        getNativeAdViewContainer().a(view, NativeAdAssetNames.ASSET_PRICE);
    }

    public final void setStoreView(View view) {
        getNativeAdViewContainer().a(view, NativeAdAssetNames.ASSET_STORE);
    }
}
