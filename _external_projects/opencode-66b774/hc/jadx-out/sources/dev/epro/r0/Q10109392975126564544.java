package dev.epro.r0;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Q10109392975126564544 {
    public static /* bridge */ /* synthetic */ CloseGuard h(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ void n() {
    }
}
