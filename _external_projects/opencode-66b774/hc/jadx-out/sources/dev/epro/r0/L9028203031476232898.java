package dev.epro.r0;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L9028203031476232898 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public L9028203031476232898(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int d() {
        return this.a;
    }

    public void e(float f) {
        this.b = f;
    }
}
