package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class E13235531759824730377<T> extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.F9886074403848142923 a;
    public final boolean b;
    public final java.lang.Boolean c;

    public E13235531759824730377(dev.epro.r0.F9886074403848142923 f9886074403848142923, boolean z, java.lang.Boolean bool) {
        this.a = f9886074403848142923;
        this.b = z;
        this.c = bool;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.L18111935460025096722 l18111935460025096722 = new dev.epro.r0.L18111935460025096722(dev.epro.r0.D15445857918358799638.a, this.b, (dev.epro.r0.S9385204271696540760) null, dev.epro.r0.R7000310675073492254.b);
        l18111935460025096722.J = this.a;
        l18111935460025096722.K = this.c;
        return l18111935460025096722;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        boolean z;
        boolean z2;
        dev.epro.r0.L18111935460025096722 l18111935460025096722 = (dev.epro.r0.L18111935460025096722) r15896830329318850690;
        l18111935460025096722.getClass();
        dev.epro.r0.F9886074403848142923 f9886074403848142923 = l18111935460025096722.J;
        dev.epro.r0.F9886074403848142923 f98860744038481429232 = this.a;
        if (dev.epro.r0.S10823041268949770285.t(f9886074403848142923, f98860744038481429232)) {
            z = false;
        } else {
            l18111935460025096722.J = f98860744038481429232;
            l18111935460025096722.E1();
            z = true;
        }
        dev.epro.r0.R7000310675073492254 r7000310675073492254 = ((dev.epro.r0.T1422539684983103901) l18111935460025096722).q;
        dev.epro.r0.R7000310675073492254 r70003106750734922542 = dev.epro.r0.R7000310675073492254.b;
        if (r7000310675073492254 != r70003106750734922542) {
            ((dev.epro.r0.T1422539684983103901) l18111935460025096722).q = r70003106750734922542;
            z = true;
        }
        java.lang.Boolean bool = l18111935460025096722.K;
        java.lang.Boolean bool2 = this.c;
        if (dev.epro.r0.S10823041268949770285.t(bool, bool2)) {
            z2 = z;
        } else {
            l18111935460025096722.K = bool2;
            z2 = true;
        }
        l18111935460025096722.B1(((dev.epro.r0.T1422539684983103901) l18111935460025096722).r, this.b, (dev.epro.r0.S9385204271696540760) null, r70003106750734922542, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E13235531759824730377)) {
            return false;
        }
        dev.epro.r0.E13235531759824730377 e13235531759824730377 = (dev.epro.r0.E13235531759824730377) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, e13235531759824730377.a) && this.b == e13235531759824730377.b && this.c.equals(e13235531759824730377.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() + dev.epro.r0.G6547577305291411977.i((dev.epro.r0.R7000310675073492254.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b)) * 923521;
    }
}
