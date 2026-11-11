package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.p195.C2353;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f2549;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f2550;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f2551;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final VideoOptions f2552;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f2553;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public VideoOptions f2558;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f2556 = false;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2554 = -1;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f2555 = false;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int f2557 = 1;

        public final NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public final Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f2557 = i;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.f2554 = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.f2555 = z;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.f2556 = z;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.f2558 = videoOptions;
            return this;
        }
    }

    public NativeAdOptions(Builder builder, C2353 c2353) {
        this.f2551 = builder.f2556;
        this.f2549 = builder.f2554;
        this.f2550 = builder.f2555;
        this.f2553 = builder.f2557;
        this.f2552 = builder.f2558;
    }

    public final int getAdChoicesPlacement() {
        return this.f2553;
    }

    public final int getImageOrientation() {
        return this.f2549;
    }

    public final VideoOptions getVideoOptions() {
        return this.f2552;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.f2550;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.f2551;
    }
}
