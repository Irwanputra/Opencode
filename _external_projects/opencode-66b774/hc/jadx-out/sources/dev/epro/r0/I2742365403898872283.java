package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class I2742365403898872283 extends A8269341136279542501 {
    public final float a;
    public final float b;

    public I2742365403898872283(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        Q2679304883298696090 q2679304883298696090 = new Q2679304883298696090();
        q2679304883298696090.f446o = this.a;
        q2679304883298696090.p = this.b;
        q2679304883298696090.q = true;
        return q2679304883298696090;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Q2679304883298696090 q2679304883298696090 = (Q2679304883298696090) r15896830329318850690;
        float f = q2679304883298696090.f446o;
        float f2 = this.a;
        boolean zB = A891803927997771281.b(f, f2);
        float f3 = this.b;
        if (!zB || !A891803927997771281.b(q2679304883298696090.p, f3) || !q2679304883298696090.q) {
            R7033599853981556291.R(q2679304883298696090).V(false);
        }
        q2679304883298696090.f446o = f2;
        q2679304883298696090.p = f3;
        q2679304883298696090.q = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        I2742365403898872283 i2742365403898872283 = obj instanceof I2742365403898872283 ? (I2742365403898872283) obj : null;
        return i2742365403898872283 != null && A891803927997771281.b(this.a, i2742365403898872283.a) && A891803927997771281.b(this.b, i2742365403898872283.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return E12098517352909843120.m("OffsetModifierElement(x=", A891803927997771281.c(this.a), ", y=", A891803927997771281.c(this.b), ", rtlAware=true)");
    }
}
