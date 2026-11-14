package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A891803927997771281 implements java.lang.Comparable {
    public final float a;

    public static int a(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0;
        }
        return java.lang.Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    public static java.lang.String c(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return a(this.a, ((dev.epro.r0.A891803927997771281) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.A891803927997771281) {
            return java.lang.Float.compare(this.a, ((dev.epro.r0.A891803927997771281) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return c(this.a);
    }
}
