package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A4677720871826919358 {
    public final float a;
    public final float b;

    public A4677720871826919358(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dev.epro.r0.A4677720871826919358)) {
            return false;
        }
        dev.epro.r0.A4677720871826919358 a4677720871826919358 = (dev.epro.r0.A4677720871826919358) obj;
        return dev.epro.r0.A891803927997771281.b(this.a, a4677720871826919358.a) && dev.epro.r0.A891803927997771281.b(0.0f, 0.0f) && dev.epro.r0.A891803927997771281.b(0.0f, 0.0f) && dev.epro.r0.A891803927997771281.b(this.b, a4677720871826919358.b) && dev.epro.r0.A891803927997771281.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(0.0f) + dev.epro.r0.E12098517352909843120.e(this.b, dev.epro.r0.E12098517352909843120.e(0.0f, dev.epro.r0.E12098517352909843120.e(0.0f, java.lang.Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
