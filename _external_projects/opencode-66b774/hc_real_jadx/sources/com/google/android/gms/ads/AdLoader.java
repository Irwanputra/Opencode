package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzjg;
import com.google.android.gms.internal.zzjm;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkn;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzrk;
import com.google.android.gms.internal.zzrl;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.internal.zzuw;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AdLoader {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzkk f2523;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f2524;

    public static class Builder {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final zzkn f2525;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final Context f2526;

        public Builder(Context context, String str) {
            C1687.m3726(context, "context cannot be null");
            Context context2 = context;
            zzkn zzb = zzkb.zzib().zzb(context, str, new zzuw());
            this.f2526 = context2;
            this.f2525 = zzb;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.f2526, this.f2525.zzdi());
            } catch (RemoteException e) {
                zzakb.zzb("Failed to build AdLoader.", e);
                return null;
            }
        }

        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.f2525.zza(new zzrk(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.f2525.zza(new zzrl(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            try {
                this.f2525.zza(str, new zzrn(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzrm(onCustomClickListener));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f2525.zza(new zzro(onPublisherAdViewLoadedListener), new zzjn(this.f2526, adSizeArr));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f2525.zzb(new zzjg(adListener));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            if (correlator == null) {
                throw new NullPointerException("null reference");
            }
            try {
                this.f2525.zzb(correlator.zzbh());
            } catch (RemoteException e) {
                zzakb.zzc("Failed to set correlator.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f2525.zza(new zzpe(nativeAdOptions));
            } catch (RemoteException e) {
                zzakb.zzc("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.f2525.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                zzakb.zzc("Failed to specify DFP banner ad options", e);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzkk zzkkVar) {
        zzjm zzjmVar = zzjm.zzbej;
        this.f2524 = context;
        this.f2523 = zzkkVar;
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.f2523.zzcp();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.f2523.isLoading();
        } catch (RemoteException e) {
            zzakb.zzc("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        try {
            this.f2523.zzd(zzjm.zza(this.f2524, adRequest.zzbg()));
        } catch (RemoteException e) {
            zzakb.zzb("Failed to load ad.", e);
        }
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.f2523.zza(zzjm.zza(this.f2524, adRequest.zzbg()), i);
        } catch (RemoteException e) {
            zzakb.zzb("Failed to load ads.", e);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        try {
            this.f2523.zzd(zzjm.zza(this.f2524, publisherAdRequest.zzbg()));
        } catch (RemoteException e) {
            zzakb.zzb("Failed to load ad.", e);
        }
    }
}
