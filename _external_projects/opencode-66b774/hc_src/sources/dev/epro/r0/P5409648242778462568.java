package dev.epro.r0;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P5409648242778462568 implements K1865709164992808030 {
    public final ViewConfiguration a;

    public P5409648242778462568(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final float e() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // dev.epro.r0.K1865709164992808030
    public final float f() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }
}
