package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class B17039118134107761505 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.E13074456978433253839 a;
    public final dev.epro.r0.V12816289154094534935 b;
    public final dev.epro.r0.R7000310675073492254 c;

    public B17039118134107761505(dev.epro.r0.E13074456978433253839 e13074456978433253839, dev.epro.r0.V12816289154094534935 v12816289154094534935, dev.epro.r0.R7000310675073492254 r7000310675073492254) {
        this.a = e13074456978433253839;
        this.b = v12816289154094534935;
        this.c = r7000310675073492254;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.Q5955270991419754356 q5955270991419754356 = new dev.epro.r0.Q5955270991419754356();
        q5955270991419754356.o = this.a;
        q5955270991419754356.p = this.b;
        q5955270991419754356.q = this.c;
        return q5955270991419754356;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.Q5955270991419754356 q5955270991419754356 = (dev.epro.r0.Q5955270991419754356) r15896830329318850690;
        q5955270991419754356.o = this.a;
        q5955270991419754356.p = this.b;
        q5955270991419754356.q = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B17039118134107761505)) {
            return false;
        }
        dev.epro.r0.B17039118134107761505 b17039118134107761505 = (dev.epro.r0.B17039118134107761505) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b17039118134107761505.a) && dev.epro.r0.S10823041268949770285.t(this.b, b17039118134107761505.b) && this.c == b17039118134107761505.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dev.epro.r0.G6547577305291411977.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
