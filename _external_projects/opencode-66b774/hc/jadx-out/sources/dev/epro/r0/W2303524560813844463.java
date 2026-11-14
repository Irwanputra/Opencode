package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class W2303524560813844463 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public W2303524560813844463(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        G10321484793877969976 g10321484793877969976 = new G10321484793877969976();
        g10321484793877969976.f242o = this.a;
        return g10321484793877969976;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((G10321484793877969976) r15896830329318850690).f242o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W2303524560813844463) {
            return this.a == ((W2303524560813844463) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
