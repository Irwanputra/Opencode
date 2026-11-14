package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q1290609947622074263 extends A8269341136279542501 {
    public final A4300800680137755387 a;

    public Q1290609947622074263(A4300800680137755387 a4300800680137755387) {
        this.a = a4300800680137755387;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        V5304935804128802104 v5304935804128802104 = new V5304935804128802104();
        v5304935804128802104.f546o = this.a;
        return v5304935804128802104;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((V5304935804128802104) r15896830329318850690).f546o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Q1290609947622074263 q1290609947622074263 = obj instanceof Q1290609947622074263 ? (Q1290609947622074263) obj : null;
        if (q1290609947622074263 == null) {
            return false;
        }
        return this.a.equals(q1290609947622074263.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }
}
