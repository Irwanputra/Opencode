package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V17032896535665530457 extends A8269341136279542501 {
    public final V697849047308847220 a;
    public final int b;
    public final M7102034154292440921 c;

    public V17032896535665530457(V697849047308847220 v697849047308847220, int i, M7102034154292440921 m7102034154292440921) {
        this.a = v697849047308847220;
        this.b = i;
        this.c = m7102034154292440921;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        Q2935940014188319606 q2935940014188319606 = new Q2935940014188319606();
        q2935940014188319606.f447o = this.a;
        q2935940014188319606.p = this.b;
        q2935940014188319606.q = this.c;
        return q2935940014188319606;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Q2935940014188319606 q2935940014188319606 = (Q2935940014188319606) r15896830329318850690;
        q2935940014188319606.f447o = this.a;
        q2935940014188319606.p = this.b;
        q2935940014188319606.q = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V17032896535665530457) {
            V17032896535665530457 v17032896535665530457 = (V17032896535665530457) obj;
            if (this.a == v17032896535665530457.a && this.b == v17032896535665530457.b && this.c.equals(v17032896535665530457.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + G6547577305291411977.i(X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31), 31, false);
    }

    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.a + ", selectedTabIndex=" + this.b + ", followContentSize=false, animationSpec=" + this.c + ')';
    }
}
