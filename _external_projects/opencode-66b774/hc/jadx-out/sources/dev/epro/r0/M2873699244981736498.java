package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class M2873699244981736498 extends A8269341136279542501 {
    public final D5961215468735357278 a;
    public final boolean b;
    public final M7102034154292440921 c;

    public M2873699244981736498(D5961215468735357278 d5961215468735357278, boolean z, M7102034154292440921 m7102034154292440921) {
        this.a = d5961215468735357278;
        this.b = z;
        this.c = m7102034154292440921;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        W1857259450685235819 w1857259450685235819 = new W1857259450685235819();
        w1857259450685235819.f560o = this.a;
        w1857259450685235819.p = this.b;
        w1857259450685235819.q = this.c;
        w1857259450685235819.u = Float.NaN;
        w1857259450685235819.v = Float.NaN;
        return w1857259450685235819;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        W1857259450685235819 w1857259450685235819 = (W1857259450685235819) r15896830329318850690;
        w1857259450685235819.f560o = this.a;
        boolean z = w1857259450685235819.p;
        boolean z2 = this.b;
        if (z != z2) {
            D1286559660607336098.v(w1857259450685235819);
        }
        w1857259450685235819.p = z2;
        w1857259450685235819.q = this.c;
        if (w1857259450685235819.t == null && !Float.isNaN(w1857259450685235819.v)) {
            w1857259450685235819.t = E12775674050813925581.a(w1857259450685235819.v);
        }
        if (w1857259450685235819.s != null || Float.isNaN(w1857259450685235819.u)) {
            return;
        }
        w1857259450685235819.s = E12775674050813925581.a(w1857259450685235819.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2873699244981736498)) {
            return false;
        }
        M2873699244981736498 m2873699244981736498 = (M2873699244981736498) obj;
        return S10823041268949770285.t(this.a, m2873699244981736498.a) && this.b == m2873699244981736498.b && this.c.equals(m2873699244981736498.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + G6547577305291411977.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
