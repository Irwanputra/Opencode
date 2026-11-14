package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
final class E17188963320188453807 extends A8269341136279542501 {
    public final S9385204271696540760 a;
    public final boolean b;
    public final B13729205492206812220 c;
    public final B13729205492206812220 d;

    public E17188963320188453807(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, S9385204271696540760 s9385204271696540760, boolean z) {
        this.a = s9385204271696540760;
        this.b = z;
        this.c = b13729205492206812220;
        this.d = b137292054922068122202;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new Q10422068430669049930(this.c, this.d, this.a, this.b);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        boolean z;
        Q10422068430669049930 q10422068430669049930 = (Q10422068430669049930) r15896830329318850690;
        q10422068430669049930.L = true;
        boolean z2 = q10422068430669049930.K == null;
        B13729205492206812220 b13729205492206812220 = this.d;
        if (z2 != (b13729205492206812220 == null)) {
            q10422068430669049930.m1();
            E10717724117948616506.n(q10422068430669049930);
            z = true;
        } else {
            z = false;
        }
        q10422068430669049930.K = b13729205492206812220;
        boolean z3 = !q10422068430669049930.v ? true : z;
        q10422068430669049930.x1(this.a, null, this.b, true, null, null, this.c);
        if (z3) {
            q10422068430669049930.y1(false);
            q10422068430669049930.y1(true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E17188963320188453807.class != obj.getClass()) {
            return false;
        }
        E17188963320188453807 e17188963320188453807 = (E17188963320188453807) obj;
        return S10823041268949770285.t(this.a, e17188963320188453807.a) && this.b == e17188963320188453807.b && this.c == e17188963320188453807.c && this.d == e17188963320188453807.d;
    }

    public final int hashCode() {
        S9385204271696540760 s9385204271696540760 = this.a;
        int iF = L11610354117192841236.f(G6547577305291411977.i(G6547577305291411977.i((s9385204271696540760 != null ? s9385204271696540760.hashCode() : 0) * 961, 31, this.b), 29791, true), 961, this.c);
        B13729205492206812220 b13729205492206812220 = this.d;
        return Boolean.hashCode(true) + ((iF + (b13729205492206812220 != null ? b13729205492206812220.hashCode() : 0)) * 961);
    }
}
