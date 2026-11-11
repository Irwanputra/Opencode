package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzakb;

@KeepName
/* loaded from: /tmp/opencode/hc_real.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public CustomEventBanner f2833;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public CustomEventInterstitial f2834;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View f2835;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public CustomEventNative f2836;

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$〺つふすそ, reason: contains not printable characters */
    public class C0378 implements CustomEventInterstitialListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediationInterstitialListener f2837;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CustomEventAdapter f2839;

        public C0378(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f2839 = customEventAdapter;
            this.f2837 = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzakb.zzbx("Custom event adapter called onAdClicked.");
            this.f2837.onAdClicked(this.f2839);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzakb.zzbx("Custom event adapter called onAdClosed.");
            this.f2837.onAdClosed(this.f2839);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2837.onAdFailedToLoad(this.f2839, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzakb.zzbx("Custom event adapter called onAdLeftApplication.");
            this.f2837.onAdLeftApplication(this.f2839);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
        public final void onAdLoaded() {
            zzakb.zzbx("Custom event adapter called onReceivedAd.");
            this.f2837.onAdLoaded(CustomEventAdapter.this);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzakb.zzbx("Custom event adapter called onAdOpened.");
            this.f2837.onAdOpened(this.f2839);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$くし〴〺ぅ, reason: contains not printable characters */
    public static class C0379 implements CustomEventNativeListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediationNativeListener f2840;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CustomEventAdapter f2841;

        public C0379(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.f2841 = customEventAdapter;
            this.f2840 = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzakb.zzbx("Custom event adapter called onAdClicked.");
            this.f2840.onAdClicked(this.f2841);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzakb.zzbx("Custom event adapter called onAdClosed.");
            this.f2840.onAdClosed(this.f2841);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzakb.zzbx("Custom event adapter called onAdFailedToLoad.");
            this.f2840.onAdFailedToLoad(this.f2841, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdImpression() {
            zzakb.zzbx("Custom event adapter called onAdImpression.");
            this.f2840.onAdImpression(this.f2841);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzakb.zzbx("Custom event adapter called onAdLeftApplication.");
            this.f2840.onAdLeftApplication(this.f2841);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzakb.zzbx("Custom event adapter called onAdLoaded.");
            this.f2840.onAdLoaded(this.f2841, nativeAdMapper);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzakb.zzbx("Custom event adapter called onAdOpened.");
            this.f2840.onAdOpened(this.f2841);
        }
    }

    /* renamed from: com.google.android.gms.ads.mediation.customevent.CustomEventAdapter$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0380 implements CustomEventBannerListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediationBannerListener f2842;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CustomEventAdapter f2843;

        public C0380(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f2843 = customEventAdapter;
            this.f2842 = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClicked() {
            zzakb.zzbx("Custom event adapter called onAdClicked.");
            this.f2842.onAdClicked(this.f2843);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdClosed() {
            zzakb.zzbx("Custom event adapter called onAdClosed.");
            this.f2842.onAdClosed(this.f2843);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdFailedToLoad(int i) {
            zzakb.zzbx("Custom event adapter called onAdFailedToLoad.");
            this.f2842.onAdFailedToLoad(this.f2843, i);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdLeftApplication() {
            zzakb.zzbx("Custom event adapter called onAdLeftApplication.");
            this.f2842.onAdLeftApplication(this.f2843);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
        public final void onAdLoaded(View view) {
            zzakb.zzbx("Custom event adapter called onAdLoaded.");
            CustomEventAdapter customEventAdapter = this.f2843;
            customEventAdapter.f2835 = view;
            this.f2842.onAdLoaded(customEventAdapter);
        }

        @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
        public final void onAdOpened() {
            zzakb.zzbx("Custom event adapter called onAdOpened.");
            this.f2842.onAdOpened(this.f2843);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static <T> T m1245(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + String.valueOf(str).length() + 46);
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzakb.zzcu(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f2835;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f2833;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2834;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f2836;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        CustomEventBanner customEventBanner = this.f2833;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f2834;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f2836;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        CustomEventBanner customEventBanner = this.f2833;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f2834;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f2836;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m1245(bundle.getString("class_name"));
        this.f2833 = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
        } else {
            this.f2833.requestBannerAd(context, new C0380(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m1245(bundle.getString("class_name"));
        this.f2834 = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
        } else {
            this.f2834.requestInterstitialAd(context, new C0378(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m1245(bundle.getString("class_name"));
        this.f2836 = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
        } else {
            this.f2836.requestNativeAd(context, new C0379(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f2834.showInterstitial();
    }
}
