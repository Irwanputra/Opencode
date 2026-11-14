package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class D14907547165806780713 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.J13325455942816235854 a;
    public final dev.epro.r0.F4096073349764486348 b;
    public final dev.epro.r0.F4096073349764486348 c;
    public final dev.epro.r0.F4096073349764486348 d;

    public D14907547165806780713(dev.epro.r0.J13325455942816235854 j13325455942816235854, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483) {
        this.a = j13325455942816235854;
        this.b = f4096073349764486348;
        this.c = f40960733497644863482;
        this.d = f40960733497644863483;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        return new dev.epro.r0.J8749144669333390587(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.J8749144669333390587 j8749144669333390587 = (dev.epro.r0.J8749144669333390587) r15896830329318850690;
        j8749144669333390587.q.a = null;
        dev.epro.r0.J13325455942816235854 j13325455942816235854 = this.a;
        j8749144669333390587.q = j13325455942816235854;
        j13325455942816235854.a = j8749144669333390587;
        j13325455942816235854.b = ((dev.epro.r0.R15896830329318850690) j8749144669333390587).n ? dev.epro.r0.P9253044023867817021.c : dev.epro.r0.P9253044023867817021.b;
        j8749144669333390587.r = this.b;
        j8749144669333390587.s = this.c;
        j8749144669333390587.t = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D14907547165806780713)) {
            return false;
        }
        dev.epro.r0.D14907547165806780713 d14907547165806780713 = (dev.epro.r0.D14907547165806780713) obj;
        return this.a == d14907547165806780713.a && this.b == d14907547165806780713.b && this.c == d14907547165806780713.c && this.d == d14907547165806780713.d;
    }

    public final int hashCode() {
        int iG = dev.epro.r0.L11610354117192841236.g(this.b, this.a.hashCode() * 31, 31);
        dev.epro.r0.F4096073349764486348 f4096073349764486348 = this.c;
        return this.d.hashCode() + ((iG + (f4096073349764486348 != null ? f4096073349764486348.hashCode() : 0)) * 31);
    }
}
