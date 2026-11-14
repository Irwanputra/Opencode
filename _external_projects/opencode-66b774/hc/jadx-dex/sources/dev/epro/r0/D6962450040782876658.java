package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6962450040782876658 implements dev.epro.r0.T1241271073913685060 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public D6962450040782876658(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            dev.epro.r0.O9477331075629462156.a("Padding must be non-negative");
        }
    }

    public final float a() {
        return this.d;
    }

    public final float b() {
        return this.b;
    }

    public final float c(dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == dev.epro.r0.F10342546226345611902.a ? this.c : this.a;
    }

    public final float d(dev.epro.r0.F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == dev.epro.r0.F10342546226345611902.a ? this.a : this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.D6962450040782876658)) {
            return false;
        }
        dev.epro.r0.D6962450040782876658 d6962450040782876658 = (dev.epro.r0.D6962450040782876658) obj;
        return dev.epro.r0.A891803927997771281.b(this.a, d6962450040782876658.a) && dev.epro.r0.A891803927997771281.b(this.b, d6962450040782876658.b) && dev.epro.r0.A891803927997771281.b(this.c, d6962450040782876658.c) && dev.epro.r0.A891803927997771281.b(this.d, d6962450040782876658.d);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.d) + dev.epro.r0.E12098517352909843120.e(this.c, dev.epro.r0.E12098517352909843120.e(this.b, java.lang.Float.hashCode(this.a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.String strC = dev.epro.r0.A891803927997771281.c(this.a);
        java.lang.String strC2 = dev.epro.r0.A891803927997771281.c(this.b);
        return dev.epro.r0.G6547577305291411977.w(dev.epro.r0.G6547577305291411977.y("PaddingValues(start=", strC, ", top=", strC2, ", end="), dev.epro.r0.A891803927997771281.c(this.c), ", bottom=", dev.epro.r0.A891803927997771281.c(this.d), ")");
    }
}
