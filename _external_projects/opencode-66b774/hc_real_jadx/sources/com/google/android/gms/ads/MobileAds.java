package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzma;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MobileAds {

    public static final class Settings {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final zzma f2535 = new zzma();

        @Deprecated
        public final String getTrackingId() {
            return null;
        }

        @Deprecated
        public final boolean isGoogleAnalyticsEnabled() {
            return false;
        }

        @Deprecated
        public final Settings setGoogleAnalyticsEnabled(boolean z) {
            return this;
        }

        @Deprecated
        public final Settings setTrackingId(String str) {
            return this;
        }
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        return zzly.zziq().getRewardedVideoAdInstance(context);
    }

    public static void initialize(Context context) {
        initialize(context, null, null);
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static void initialize(Context context, String str, Settings settings) {
        zzly.zziq().zza(context, str, settings == null ? null : settings.f2535);
    }

    public static void openDebugMenu(Context context, String str) {
        zzly.zziq().openDebugMenu(context, str);
    }

    public static void setAppMuted(boolean z) {
        zzly.zziq().setAppMuted(z);
    }

    public static void setAppVolume(float f) {
        zzly.zziq().setAppVolume(f);
    }
}
