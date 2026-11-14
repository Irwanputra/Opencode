package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class K2801700247884787149 extends A8269341136279542501 {
    public final boolean a;
    public final S9385204271696540760 b;
    public final H15322912479122270765 c;
    public final boolean d;
    public final H10924029057425269323 e;
    public final B13729205492206812220 f;

    public K2801700247884787149(boolean z, S9385204271696540760 s9385204271696540760, H15322912479122270765 h15322912479122270765, boolean z2, H10924029057425269323 h10924029057425269323, B13729205492206812220 b13729205492206812220) {
        this.a = z;
        this.b = s9385204271696540760;
        this.c = h15322912479122270765;
        this.d = z2;
        this.e = h10924029057425269323;
        this.f = b13729205492206812220;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        V313381100522526334 v313381100522526334 = new V313381100522526334(this.b, this.c, false, this.d, null, this.e, this.f);
        v313381100522526334.M = this.a;
        return v313381100522526334;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        V313381100522526334 v313381100522526334 = (V313381100522526334) r15896830329318850690;
        boolean z = v313381100522526334.M;
        boolean z2 = this.a;
        if (z != z2) {
            v313381100522526334.M = z2;
            E10717724117948616506.n(v313381100522526334);
        }
        v313381100522526334.x1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K2801700247884787149.class != obj.getClass()) {
            return false;
        }
        K2801700247884787149 k2801700247884787149 = (K2801700247884787149) obj;
        return this.a == k2801700247884787149.a && S10823041268949770285.t(this.b, k2801700247884787149.b) && S10823041268949770285.t(this.c, k2801700247884787149.c) && this.d == k2801700247884787149.d && S10823041268949770285.t(this.e, k2801700247884787149.e) && this.f == k2801700247884787149.f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        S9385204271696540760 s9385204271696540760 = this.b;
        int hashCode2 = (hashCode + (s9385204271696540760 != null ? s9385204271696540760.hashCode() : 0)) * 31;
        H15322912479122270765 h15322912479122270765 = this.c;
        int i = G6547577305291411977.i(G6547577305291411977.i((hashCode2 + (h15322912479122270765 != null ? h15322912479122270765.hashCode() : 0)) * 31, 31, false), 31, this.d);
        H10924029057425269323 h10924029057425269323 = this.e;
        return this.f.hashCode() + ((i + (h10924029057425269323 != null ? Integer.hashCode(h10924029057425269323.a) : 0)) * 31);
    }
}
