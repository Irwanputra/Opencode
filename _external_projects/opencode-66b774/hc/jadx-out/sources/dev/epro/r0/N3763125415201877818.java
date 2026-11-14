package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class N3763125415201877818 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public N3763125415201877818(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        B14405503716495929962 b14405503716495929962 = new B14405503716495929962();
        b14405503716495929962.f168o = this.a;
        b14405503716495929962.p = -9223372034707292160L;
        return b14405503716495929962;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        B14405503716495929962 b14405503716495929962 = (B14405503716495929962) r15896830329318850690;
        b14405503716495929962.f168o = this.a;
        b14405503716495929962.p = -9223372034707292160L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof N3763125415201877818) {
            return this.a == ((N3763125415201877818) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
