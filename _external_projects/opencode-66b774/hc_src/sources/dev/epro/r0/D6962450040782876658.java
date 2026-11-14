package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D6962450040782876658 implements T1241271073913685060 {
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
            O9477331075629462156.a("Padding must be non-negative");
        }
    }

    @Override // dev.epro.r0.T1241271073913685060
    public final float a() {
        return this.d;
    }

    @Override // dev.epro.r0.T1241271073913685060
    public final float b() {
        return this.b;
    }

    @Override // dev.epro.r0.T1241271073913685060
    public final float c(F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == F10342546226345611902.a ? this.c : this.a;
    }

    @Override // dev.epro.r0.T1241271073913685060
    public final float d(F10342546226345611902 f10342546226345611902) {
        return f10342546226345611902 == F10342546226345611902.a ? this.a : this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D6962450040782876658)) {
            return false;
        }
        D6962450040782876658 d6962450040782876658 = (D6962450040782876658) obj;
        return A891803927997771281.b(this.a, d6962450040782876658.a) && A891803927997771281.b(this.b, d6962450040782876658.b) && A891803927997771281.b(this.c, d6962450040782876658.c) && A891803927997771281.b(this.d, d6962450040782876658.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String c = A891803927997771281.c(this.a);
        String c2 = A891803927997771281.c(this.b);
        return G6547577305291411977.w(G6547577305291411977.y("PaddingValues(start=", c, ", top=", c2, ", end="), A891803927997771281.c(this.c), ", bottom=", A891803927997771281.c(this.d), ")");
    }
}
