package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class E12121029824354643887 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.F4096073349764486348 a;

    public E12121029824354643887(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.D7469959880009041630 d7469959880009041630 = new dev.epro.r0.D7469959880009041630(dev.epro.r0.E18444280280170001567.I);
        d7469959880009041630.r = this.a;
        return d7469959880009041630;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.D7469959880009041630 d7469959880009041630 = (dev.epro.r0.D7469959880009041630) r15896830329318850690;
        dev.epro.r0.F4096073349764486348 f4096073349764486348 = d7469959880009041630.r;
        dev.epro.r0.F4096073349764486348 f40960733497644863482 = this.a;
        if (f4096073349764486348 != f40960733497644863482) {
            d7469959880009041630.r = f40960733497644863482;
            dev.epro.r0.L11283005264715124852 l11283005264715124852 = d7469959880009041630.s;
            if (l11283005264715124852 != null) {
                dev.epro.r0.B9345618057833789735 b9345618057833789735 = (dev.epro.r0.B9345618057833789735) f40960733497644863482.invoke(l11283005264715124852);
                if (dev.epro.r0.S10823041268949770285.t(b9345618057833789735, ((dev.epro.r0.S3817735695007400440) d7469959880009041630).q)) {
                    return;
                }
                ((dev.epro.r0.S3817735695007400440) d7469959880009041630).q = b9345618057833789735;
                d7469959880009041630.i1();
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.E12121029824354643887) {
            return this.a == ((dev.epro.r0.E12121029824354643887) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
