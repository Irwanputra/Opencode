package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A4677720871826919358 {
    public final float a;
    public final float b;

    public A4677720871826919358(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A4677720871826919358)) {
            return false;
        }
        A4677720871826919358 a4677720871826919358 = (A4677720871826919358) obj;
        return A891803927997771281.b(this.a, a4677720871826919358.a) && A891803927997771281.b(0.0f, 0.0f) && A891803927997771281.b(0.0f, 0.0f) && A891803927997771281.b(this.b, a4677720871826919358.b) && A891803927997771281.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + E12098517352909843120.e(this.b, E12098517352909843120.e(0.0f, E12098517352909843120.e(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
