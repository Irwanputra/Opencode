package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q17473336027866080022 extends A8269341136279542501 implements U5372921367212226273 {
    public final F4096073349764486348 a;

    public Q17473336027866080022(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.U5372921367212226273
    public final E10198359844879945462 F0() {
        E10198359844879945462 e10198359844879945462 = new E10198359844879945462();
        e10198359844879945462.c = false;
        e10198359844879945462.d = true;
        this.a.invoke(e10198359844879945462);
        return e10198359844879945462;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new O13658656158066560517(false, true, this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((O13658656158066560517) r15896830329318850690).q = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q17473336027866080022) {
            return this.a == ((Q17473336027866080022) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
