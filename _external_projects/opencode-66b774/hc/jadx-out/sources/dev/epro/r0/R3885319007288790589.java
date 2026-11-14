package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class R3885319007288790589 extends A8269341136279542501 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public R3885319007288790589(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            O9477331075629462156.a("Padding must be non-negative");
        }
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        A6241039206372053110 a6241039206372053110 = new A6241039206372053110();
        a6241039206372053110.f162o = this.a;
        a6241039206372053110.p = this.b;
        a6241039206372053110.q = this.c;
        a6241039206372053110.r = this.d;
        a6241039206372053110.s = true;
        return a6241039206372053110;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        A6241039206372053110 a6241039206372053110 = (A6241039206372053110) r15896830329318850690;
        a6241039206372053110.f162o = this.a;
        a6241039206372053110.p = this.b;
        a6241039206372053110.q = this.c;
        a6241039206372053110.r = this.d;
        a6241039206372053110.s = true;
    }

    public final boolean equals(Object obj) {
        R3885319007288790589 r3885319007288790589 = obj instanceof R3885319007288790589 ? (R3885319007288790589) obj : null;
        return r3885319007288790589 != null && A891803927997771281.b(this.a, r3885319007288790589.a) && A891803927997771281.b(this.b, r3885319007288790589.b) && A891803927997771281.b(this.c, r3885319007288790589.c) && A891803927997771281.b(this.d, r3885319007288790589.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + E12098517352909843120.e(this.d, E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
