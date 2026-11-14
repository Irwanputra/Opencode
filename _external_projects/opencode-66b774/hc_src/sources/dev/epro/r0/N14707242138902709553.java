package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class N14707242138902709553 extends A8269341136279542501 {
    public final float a;
    public final Object b;

    public N14707242138902709553(Object obj, float f) {
        this.a = f;
        this.b = obj;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        G18158803432570020872 g18158803432570020872 = new G18158803432570020872();
        g18158803432570020872.f252o = this.a;
        g18158803432570020872.p = this.b;
        return g18158803432570020872;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        G18158803432570020872 g18158803432570020872 = (G18158803432570020872) r15896830329318850690;
        g18158803432570020872.f252o = this.a;
        g18158803432570020872.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N14707242138902709553)) {
            return false;
        }
        N14707242138902709553 n14707242138902709553 = (N14707242138902709553) obj;
        return n14707242138902709553.a == this.a && S10823041268949770285.t(n14707242138902709553.b, this.b);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        Object obj = this.b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
