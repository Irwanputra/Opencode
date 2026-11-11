package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzakb;

@KeepName
/* loaded from: /tmp/opencode/hc_real.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public CustomEventBanner f2514;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public CustomEventInterstitial f2515;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View f2516;

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$〺つふすそ, reason: contains not printable characters */
    public class C0371 implements CustomEventInterstitialListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediationInterstitialListener f2517;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CustomEventAdapter f2519;

        public C0371(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f2519 = customEventAdapter;
            this.f2517 = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onDismissScreen() {
            zzakb.zzbx("Custom event adapter called onDismissScreen.");
            this.f2517.onDismissScreen(this.f2519);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onFailedToReceiveAd() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2517.onFailedToReceiveAd(this.f2519, AdRequest.ErrorCode.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onLeaveApplication() {
            zzakb.zzbx("Custom event adapter called onLeaveApplication.");
            this.f2517.onLeaveApplication(this.f2519);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onPresentScreen() {
            zzakb.zzbx("Custom event adapter called onPresentScreen.");
            this.f2517.onPresentScreen(this.f2519);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventInterstitialListener
        public final void onReceivedAd() {
            zzakb.zzbx("Custom event adapter called onReceivedAd.");
            this.f2517.onReceivedAd(CustomEventAdapter.this);
        }
    }

    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0372 implements CustomEventBannerListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final MediationBannerListener f2520;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final CustomEventAdapter f2521;

        public C0372(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.f2521 = customEventAdapter;
            this.f2520 = mediationBannerListener;
        }

        @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
        public final void onClick() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2520.onClick(this.f2521);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onDismissScreen() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2520.onDismissScreen(this.f2521);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onFailedToReceiveAd() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2520.onFailedToReceiveAd(this.f2521, AdRequest.ErrorCode.NO_FILL);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onLeaveApplication() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2520.onLeaveApplication(this.f2521);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventListener
        public final void onPresentScreen() {
            zzakb.zzbx("Custom event adapter called onFailedToReceiveAd.");
            this.f2520.onPresentScreen(this.f2521);
        }

        @Override // com.google.ads.mediation.customevent.CustomEventBannerListener
        public final void onReceivedAd(View view) {
            zzakb.zzbx("Custom event adapter called onReceivedAd.");
            CustomEventAdapter customEventAdapter = this.f2521;
            customEventAdapter.f2516 = view;
            this.f2520.onReceivedAd(customEventAdapter);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static <T> T m1194(String str) {
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

    @Override // com.google.ads.mediation.MediationAdapter
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f2514;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2515;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f2516;
    }

    @Override // com.google.ads.mediation.MediationAdapter
    public final Class<CustomEventServerParameters> getServerParametersType() {
        return CustomEventServerParameters.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(MediationBannerListener mediationBannerListener, Activity activity, CustomEventServerParameters customEventServerParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m1194(customEventServerParameters.className);
        this.f2514 = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.f2514.requestBannerAd(new C0372(this, mediationBannerListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, adSize, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(MediationInterstitialListener mediationInterstitialListener, Activity activity, CustomEventServerParameters customEventServerParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m1194(customEventServerParameters.className);
        this.f2515 = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
        } else {
            this.f2515.requestInterstitialAd(new C0371(this, mediationInterstitialListener), activity, customEventServerParameters.label, customEventServerParameters.parameter, mediationAdRequest, customEventExtras == null ? null : customEventExtras.getExtra(customEventServerParameters.label));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f2515.showInterstitial();
    }
}
