package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
final class W16788523502141893535 extends A8269341136279542501 {
    public final B13729205492206812220 a;
    public final C16999414938027834076 b;
    public final R7000310675073492254 c;
    public final boolean d;

    public W16788523502141893535(B13729205492206812220 b13729205492206812220, C16999414938027834076 c16999414938027834076, R7000310675073492254 r7000310675073492254, boolean z) {
        this.a = b13729205492206812220;
        this.b = c16999414938027834076;
        this.c = r7000310675073492254;
        this.d = z;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new L7222411163342326563(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        L7222411163342326563 l7222411163342326563 = (L7222411163342326563) r15896830329318850690;
        l7222411163342326563.f350o = this.a;
        l7222411163342326563.p = this.b;
        R7000310675073492254 r7000310675073492254 = l7222411163342326563.q;
        R7000310675073492254 r70003106750734922542 = this.c;
        if (r7000310675073492254 != r70003106750734922542) {
            l7222411163342326563.q = r70003106750734922542;
            E10717724117948616506.n(l7222411163342326563);
        }
        boolean z = l7222411163342326563.r;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        l7222411163342326563.r = z2;
        l7222411163342326563.h1();
        E10717724117948616506.n(l7222411163342326563);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W16788523502141893535)) {
            return false;
        }
        W16788523502141893535 w16788523502141893535 = (W16788523502141893535) obj;
        return this.a == w16788523502141893535.a && S10823041268949770285.t(this.b, w16788523502141893535.b) && this.c == w16788523502141893535.c && this.d == w16788523502141893535.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + G6547577305291411977.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
