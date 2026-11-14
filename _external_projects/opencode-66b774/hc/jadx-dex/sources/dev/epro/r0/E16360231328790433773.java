package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class E16360231328790433773 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.F4096073349764486348 a;
    public final dev.epro.r0.F4096073349764486348 b;

    public E16360231328790433773(dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482) {
        this.a = f4096073349764486348;
        this.b = f40960733497644863482;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.W1433264446200197743 w1433264446200197743 = new dev.epro.r0.W1433264446200197743();
        w1433264446200197743.o = this.a;
        w1433264446200197743.p = this.b;
        return w1433264446200197743;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.W1433264446200197743 w1433264446200197743 = (dev.epro.r0.W1433264446200197743) r15896830329318850690;
        w1433264446200197743.o = this.a;
        w1433264446200197743.p = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E16360231328790433773)) {
            return false;
        }
        dev.epro.r0.E16360231328790433773 e16360231328790433773 = (dev.epro.r0.E16360231328790433773) obj;
        return this.a == e16360231328790433773.a && this.b == e16360231328790433773.b;
    }

    public final int hashCode() {
        dev.epro.r0.F4096073349764486348 f4096073349764486348 = this.a;
        int iHashCode = (f4096073349764486348 != null ? f4096073349764486348.hashCode() : 0) * 31;
        dev.epro.r0.F4096073349764486348 f40960733497644863482 = this.b;
        return iHashCode + (f40960733497644863482 != null ? f40960733497644863482.hashCode() : 0);
    }
}
