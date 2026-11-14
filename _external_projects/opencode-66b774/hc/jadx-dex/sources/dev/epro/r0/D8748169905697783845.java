package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D8748169905697783845 extends dev.epro.r0.A8269341136279542501 {
    public final boolean a;
    public final dev.epro.r0.B13729205492206812220 b;
    public final dev.epro.r0.S11237161986419267460 c;
    public final float d;

    public D8748169905697783845(boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.S11237161986419267460 s11237161986419267460, float f) {
        this.a = z;
        this.b = b13729205492206812220;
        this.c = s11237161986419267460;
        this.d = f;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        return new dev.epro.r0.K14640285359526119410(this.a, this.b, this.c, this.d);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.K14640285359526119410 k14640285359526119410 = (dev.epro.r0.K14640285359526119410) r15896830329318850690;
        k14640285359526119410.r = this.b;
        k14640285359526119410.s = true;
        k14640285359526119410.t = this.c;
        k14640285359526119410.u = this.d;
        boolean z = k14640285359526119410.q;
        boolean z2 = this.a;
        if (z != z2) {
            k14640285359526119410.q = z2;
            dev.epro.r0.R7033599853981556291.E(k14640285359526119410.V0(), (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.N12893830608069839869(k14640285359526119410, (dev.epro.r0.R4833348786910499294) null, (byte) 9), 3);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D8748169905697783845)) {
            return false;
        }
        dev.epro.r0.D8748169905697783845 d8748169905697783845 = (dev.epro.r0.D8748169905697783845) obj;
        return this.a == d8748169905697783845.a && this.b == d8748169905697783845.b && dev.epro.r0.S10823041268949770285.t(this.c, d8748169905697783845.c) && dev.epro.r0.A891803927997771281.b(this.d, d8748169905697783845.d);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.d) + ((this.c.hashCode() + dev.epro.r0.L11610354117192841236.f(dev.epro.r0.G6547577305291411977.i(java.lang.Boolean.hashCode(this.a) * 31, 31, true), 31, this.b)) * 31);
    }
}
