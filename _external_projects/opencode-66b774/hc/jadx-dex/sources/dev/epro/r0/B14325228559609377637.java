package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B14325228559609377637 extends dev.epro.r0.A8269341136279542501 {
    public static final dev.epro.r0.V10450421848591554621 f = new dev.epro.r0.V10450421848591554621((byte) 15);
    public final dev.epro.r0.Q13637171669401920315 a;
    public final boolean b;
    public final boolean c;
    public final dev.epro.r0.J12078565427869724451 d;
    public final dev.epro.r0.J12078565427869724451 e;

    public B14325228559609377637(dev.epro.r0.Q13637171669401920315 q13637171669401920315, boolean z, boolean z2, dev.epro.r0.J12078565427869724451 j12078565427869724451, dev.epro.r0.J12078565427869724451 j120785654278697244512) {
        this.a = q13637171669401920315;
        this.b = z;
        this.c = z2;
        this.d = j12078565427869724451;
        this.e = j120785654278697244512;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.K16683514573337866527 k16683514573337866527 = new dev.epro.r0.K16683514573337866527(f, this.b, (dev.epro.r0.S9385204271696540760) null, dev.epro.r0.R7000310675073492254.a);
        k16683514573337866527.J = this.a;
        k16683514573337866527.K = this.c;
        k16683514573337866527.L = this.d;
        k16683514573337866527.M = this.e;
        return k16683514573337866527;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        boolean z;
        dev.epro.r0.K16683514573337866527 k16683514573337866527 = (dev.epro.r0.K16683514573337866527) r15896830329318850690;
        dev.epro.r0.Q13637171669401920315 q13637171669401920315 = k16683514573337866527.J;
        dev.epro.r0.Q13637171669401920315 q136371716694019203152 = this.a;
        if (dev.epro.r0.S10823041268949770285.t(q13637171669401920315, q136371716694019203152)) {
            z = false;
        } else {
            k16683514573337866527.J = q136371716694019203152;
            z = true;
        }
        boolean z2 = z;
        k16683514573337866527.L = this.d;
        k16683514573337866527.M = this.e;
        k16683514573337866527.K = this.c;
        k16683514573337866527.B1(f, this.b, (dev.epro.r0.S9385204271696540760) null, dev.epro.r0.R7000310675073492254.a, z2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.B14325228559609377637.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.B14325228559609377637 b14325228559609377637 = (dev.epro.r0.B14325228559609377637) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b14325228559609377637.a) && this.b == b14325228559609377637.b && this.c == b14325228559609377637.c && dev.epro.r0.S10823041268949770285.t(this.d, b14325228559609377637.d) && dev.epro.r0.S10823041268949770285.t(this.e, b14325228559609377637.e);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + ((this.e.hashCode() + ((this.d.hashCode() + dev.epro.r0.G6547577305291411977.i(dev.epro.r0.G6547577305291411977.i((dev.epro.r0.R7000310675073492254.a.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.b), 31, this.c)) * 31)) * 31);
    }
}
