package com.google.android.gms.ads;

import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zzzv;
import p131.p161.p162.p193.p194.C2354;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class VideoOptions {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f2539;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean f2540;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final boolean f2541;

    public static final class Builder {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public boolean f2544 = true;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public boolean f2542 = false;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public boolean f2543 = false;

        public final VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.f2543 = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.f2542 = z;
            return this;
        }

        public final Builder setStartMuted(boolean z) {
            this.f2544 = z;
            return this;
        }
    }

    public VideoOptions(Builder builder, C2354 c2354) {
        this.f2541 = builder.f2544;
        this.f2539 = builder.f2542;
        this.f2540 = builder.f2543;
    }

    public VideoOptions(zzmr zzmrVar) {
        this.f2541 = zzmrVar.zzbgx;
        this.f2539 = zzmrVar.zzbgy;
        this.f2540 = zzmrVar.zzbgz;
    }

    public final boolean getClickToExpandRequested() {
        return this.f2540;
    }

    public final boolean getCustomControlsRequested() {
        return this.f2539;
    }

    public final boolean getStartMuted() {
        return this.f2541;
    }
}
