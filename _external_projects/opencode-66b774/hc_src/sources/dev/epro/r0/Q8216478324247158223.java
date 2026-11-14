package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
final class Q8216478324247158223 extends A8269341136279542501 {
    public final boolean a;
    public final S9385204271696540760 b;
    public final boolean c;
    public final boolean d;
    public final H10924029057425269323 e;
    public final F4096073349764486348 f;

    public Q8216478324247158223(boolean z, S9385204271696540760 s9385204271696540760, boolean z2, boolean z3, H10924029057425269323 h10924029057425269323, F4096073349764486348 f4096073349764486348) {
        this.a = z;
        this.b = s9385204271696540760;
        this.c = z2;
        this.d = z3;
        this.e = h10924029057425269323;
        this.f = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new H18342467550201167414(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        H18342467550201167414 h18342467550201167414 = (H18342467550201167414) r15896830329318850690;
        boolean z = h18342467550201167414.M;
        boolean z2 = this.a;
        if (z != z2) {
            h18342467550201167414.M = z2;
            E10717724117948616506.n(h18342467550201167414);
        }
        h18342467550201167414.N = this.f;
        h18342467550201167414.x1(this.b, null, this.c, this.d, null, this.e, h18342467550201167414.O);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q8216478324247158223.class != obj.getClass()) {
            return false;
        }
        Q8216478324247158223 q8216478324247158223 = (Q8216478324247158223) obj;
        return this.a == q8216478324247158223.a && S10823041268949770285.t(this.b, q8216478324247158223.b) && this.c == q8216478324247158223.c && this.d == q8216478324247158223.d && this.e.equals(q8216478324247158223.e) && this.f == q8216478324247158223.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        S9385204271696540760 s9385204271696540760 = this.b;
        return this.f.hashCode() + X2485016533998461232.f(this.e.a, G6547577305291411977.i(G6547577305291411977.i((hashCode + (s9385204271696540760 != null ? s9385204271696540760.hashCode() : 0)) * 961, 31, this.c), 31, this.d), 31);
    }
}
