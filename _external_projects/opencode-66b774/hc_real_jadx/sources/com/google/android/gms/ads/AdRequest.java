package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.internal.zzlt;
import com.google.android.gms.internal.zzlu;
import java.util.Date;
import java.util.Set;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.C2359;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzlt f2527;

    public static final class Builder {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final zzlu f2528;

        public Builder() {
            zzlu zzluVar = new zzlu();
            this.f2528 = zzluVar;
            zzluVar.zzae("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f2528.zzb(cls, bundle);
            return this;
        }

        public final Builder addKeyword(String str) {
            this.f2528.zzad(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f2528.zza(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f2528.zza(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f2528.zzaf("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f2528.zzae(str);
            return this;
        }

        public final AdRequest build() {
            return new AdRequest(this, null);
        }

        public final Builder setBirthday(Date date) {
            this.f2528.zza(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            C1687.m3726(str, "Content URL must be non-null.");
            C1687.m3661(str, "Content URL must be non-empty.");
            C1687.m3668(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f2528.zzag(str);
            return this;
        }

        public final Builder setGender(int i) {
            this.f2528.zzr(i);
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.f2528.zzj(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f2528.zzb(location);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f2528.zzai(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f2528.zzi(z);
            return this;
        }
    }

    public AdRequest(Builder builder, C2359 c2359) {
        this.f2527 = new zzlt(builder.f2528);
    }

    public final Date getBirthday() {
        return this.f2527.getBirthday();
    }

    public final String getContentUrl() {
        return this.f2527.getContentUrl();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f2527.getCustomEventExtrasBundle(cls);
    }

    public final int getGender() {
        return this.f2527.getGender();
    }

    public final Set<String> getKeywords() {
        return this.f2527.getKeywords();
    }

    public final Location getLocation() {
        return this.f2527.getLocation();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.f2527.getNetworkExtras(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f2527.getNetworkExtrasBundle(cls);
    }

    public final boolean isTestDevice(Context context) {
        return this.f2527.isTestDevice(context);
    }

    public final zzlt zzbg() {
        return this.f2527;
    }
}
