package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X6737430859549363790 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public X6737430859549363790(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof X6737430859549363790)) {
            return false;
        }
        X6737430859549363790 x6737430859549363790 = (X6737430859549363790) obj;
        if (A891803927997771281.b(this.a, x6737430859549363790.a) && A891803927997771281.b(this.b, x6737430859549363790.b) && A891803927997771281.b(this.c, x6737430859549363790.c)) {
            return A891803927997771281.b(this.d, x6737430859549363790.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
