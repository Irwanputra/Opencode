package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.zzlt;
import com.google.android.gms.internal.zzlu;
import java.util.Date;
import java.util.List;
import java.util.Set;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p197.C2356;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzlt f2545;

    public static final class Builder {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final zzlu f2546 = new zzlu();

        public final Builder addCategoryExclusion(String str) {
            this.f2546.zzaj(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f2546.zzb(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.f2546.zzd(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.f2546.zzd(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addKeyword(String str) {
            this.f2546.zzad(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f2546.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f2546.zza(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f2546.zzae(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this, null);
        }

        public final Builder setBirthday(Date date) {
            this.f2546.zza(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            C1687.m3726(str, "Content URL must be non-null.");
            C1687.m3661(str, "Content URL must be non-empty.");
            C1687.m3668(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f2546.zzag(str);
            return this;
        }

        public final Builder setGender(int i) {
            this.f2546.zzr(i);
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.f2546.zzj(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f2546.zzb(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f2546.setManualImpressionsEnabled(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.f2546.zzah(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f2546.zzai(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f2546.zzi(z);
            return this;
        }
    }

    public PublisherAdRequest(Builder builder, C2356 c2356) {
        this.f2545 = new zzlt(builder.f2546);
    }

    public static void updateCorrelator() {
    }

    public final Date getBirthday() {
        return this.f2545.getBirthday();
    }

    public final String getContentUrl() {
        return this.f2545.getContentUrl();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f2545.getCustomEventExtrasBundle(cls);
    }

    public final Bundle getCustomTargeting() {
        return this.f2545.getCustomTargeting();
    }

    public final int getGender() {
        return this.f2545.getGender();
    }

    public final Set<String> getKeywords() {
        return this.f2545.getKeywords();
    }

    public final Location getLocation() {
        return this.f2545.getLocation();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f2545.getManualImpressionsEnabled();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.f2545.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f2545.getNetworkExtrasBundle(cls);
    }

    public final String getPublisherProvidedId() {
        return this.f2545.getPublisherProvidedId();
    }

    public final boolean isTestDevice(Context context) {
        return this.f2545.isTestDevice(context);
    }

    public final zzlt zzbg() {
        return this.f2545;
    }
}
