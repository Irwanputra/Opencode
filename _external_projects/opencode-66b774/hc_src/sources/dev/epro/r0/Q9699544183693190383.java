package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
final class Q9699544183693190383 extends A8269341136279542501 {
    public final L739450498903353996 a;
    public final boolean b;

    public Q9699544183693190383(L739450498903353996 l739450498903353996, boolean z) {
        this.a = l739450498903353996;
        this.b = z;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        F16495874760089114025 f16495874760089114025 = new F16495874760089114025();
        f16495874760089114025.f233o = this.a;
        f16495874760089114025.p = this.b;
        return f16495874760089114025;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        F16495874760089114025 f16495874760089114025 = (F16495874760089114025) r15896830329318850690;
        f16495874760089114025.f233o = this.a;
        f16495874760089114025.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Q9699544183693190383 q9699544183693190383 = obj instanceof Q9699544183693190383 ? (Q9699544183693190383) obj : null;
        return q9699544183693190383 != null && this.a.equals(q9699544183693190383.a) && this.b == q9699544183693190383.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
