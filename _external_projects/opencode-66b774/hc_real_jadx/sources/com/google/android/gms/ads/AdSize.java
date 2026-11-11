package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f2529;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f2530;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final int f2531;
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    public static final AdSize zzalu = new AdSize(50, 50, "50x50_mb");
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSize(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r6 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r6)
        La:
            r1 = -2
            if (r7 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r7)
        L14:
            java.lang.String r2 = "_as"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 1
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r4 = r4 + r3
            int r3 = r2.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = "x"
            r4.append(r0)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r5.<init>(r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.AdSize.<init>(int, int):void");
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f2531 = i;
            this.f2529 = i2;
            this.f2530 = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSize)) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return this.f2531 == adSize.f2531 && this.f2529 == adSize.f2529 && this.f2530.equals(adSize.f2530);
    }

    public final int getHeight() {
        return this.f2529;
    }

    public final int getHeightInPixels(Context context) {
        int i = this.f2529;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -2) {
            return zzjn.zzc(context.getResources().getDisplayMetrics());
        }
        zzkb.zzia();
        return zzajr.zzc(context, this.f2529);
    }

    public final int getWidth() {
        return this.f2531;
    }

    public final int getWidthInPixels(Context context) {
        int i = this.f2531;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i == -1) {
            return zzjn.zzb(context.getResources().getDisplayMetrics());
        }
        zzkb.zzia();
        return zzajr.zzc(context, this.f2531);
    }

    public final int hashCode() {
        return this.f2530.hashCode();
    }

    public final boolean isAutoHeight() {
        return this.f2529 == -2;
    }

    public final boolean isFluid() {
        return this.f2531 == -3 && this.f2529 == -4;
    }

    public final boolean isFullWidth() {
        return this.f2531 == -1;
    }

    public final String toString() {
        return this.f2530;
    }
}
