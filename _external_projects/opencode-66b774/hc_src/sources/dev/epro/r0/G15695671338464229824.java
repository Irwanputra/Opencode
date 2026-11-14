package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class G15695671338464229824 extends A8269341136279542501 {
    public final J12078565427869724451 a;

    public G15695671338464229824(J12078565427869724451 j12078565427869724451) {
        this.a = j12078565427869724451;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        D3709498820708474817 d3709498820708474817 = new D3709498820708474817();
        d3709498820708474817.f208o = this.a;
        return d3709498820708474817;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((D3709498820708474817) r15896830329318850690).f208o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G15695671338464229824) {
            return this.a == ((G15695671338464229824) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
