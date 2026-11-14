package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q2375791203937593680 extends A8269341136279542501 implements U5372921367212226273 {
    public final boolean a;
    public final F4096073349764486348 b;

    public Q2375791203937593680(F4096073349764486348 f4096073349764486348, boolean z) {
        this.a = z;
        this.b = f4096073349764486348;
    }

    @Override // dev.epro.r0.U5372921367212226273
    public final E10198359844879945462 F0() {
        E10198359844879945462 e10198359844879945462 = new E10198359844879945462();
        e10198359844879945462.c = this.a;
        this.b.invoke(e10198359844879945462);
        return e10198359844879945462;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new O13658656158066560517(this.a, false, this.b);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        O13658656158066560517 o13658656158066560517 = (O13658656158066560517) r15896830329318850690;
        o13658656158066560517.f397o = this.a;
        o13658656158066560517.q = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q2375791203937593680)) {
            return false;
        }
        Q2375791203937593680 q2375791203937593680 = (Q2375791203937593680) obj;
        return this.a == q2375791203937593680.a && this.b == q2375791203937593680.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
