package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class O1604469965577560697 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public O1604469965577560697(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new W1351014327031161934(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Y4989033692226475498 y4989033692226475498;
        W1351014327031161934 w1351014327031161934 = (W1351014327031161934) r15896830329318850690;
        F4096073349764486348 f4096073349764486348 = this.a;
        w1351014327031161934.f553o = f4096073349764486348;
        if (w1351014327031161934.a.n && (y4989033692226475498 = R7033599853981556291.P(w1351014327031161934, 2).v) != null) {
            y4989033692226475498.E1(f4096073349764486348, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O1604469965577560697) {
            return this.a == ((O1604469965577560697) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
