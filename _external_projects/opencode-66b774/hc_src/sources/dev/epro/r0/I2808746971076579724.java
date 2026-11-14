package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class I2808746971076579724 extends A8269341136279542501 {
    public final S9385204271696540760 a;
    public final H15322912479122270765 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final H10924029057425269323 f;
    public final B13729205492206812220 g;

    public I2808746971076579724(S9385204271696540760 s9385204271696540760, H15322912479122270765 h15322912479122270765, boolean z, boolean z2, String str, H10924029057425269323 h10924029057425269323, B13729205492206812220 b13729205492206812220) {
        this.a = s9385204271696540760;
        this.b = h15322912479122270765;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = h10924029057425269323;
        this.g = b13729205492206812220;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new U3171922415799673643(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((U3171922415799673643) r15896830329318850690).x1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || I2808746971076579724.class != obj.getClass()) {
            return false;
        }
        I2808746971076579724 i2808746971076579724 = (I2808746971076579724) obj;
        return S10823041268949770285.t(this.a, i2808746971076579724.a) && S10823041268949770285.t(this.b, i2808746971076579724.b) && this.c == i2808746971076579724.c && this.d == i2808746971076579724.d && S10823041268949770285.t(this.e, i2808746971076579724.e) && S10823041268949770285.t(this.f, i2808746971076579724.f) && this.g == i2808746971076579724.g;
    }

    public final int hashCode() {
        S9385204271696540760 s9385204271696540760 = this.a;
        int hashCode = (s9385204271696540760 != null ? s9385204271696540760.hashCode() : 0) * 31;
        H15322912479122270765 h15322912479122270765 = this.b;
        int i = G6547577305291411977.i(G6547577305291411977.i((hashCode + (h15322912479122270765 != null ? h15322912479122270765.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
        H10924029057425269323 h10924029057425269323 = this.f;
        return this.g.hashCode() + ((hashCode2 + (h10924029057425269323 != null ? Integer.hashCode(h10924029057425269323.a) : 0)) * 31);
    }
}
