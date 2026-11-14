package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class L1727297732548438554 extends A8269341136279542501 {
    public final B14178846910827721115 a;

    public L1727297732548438554(B14178846910827721115 b14178846910827721115) {
        this.a = b14178846910827721115;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        D501931552841044881 d501931552841044881 = new D501931552841044881();
        d501931552841044881.f209o = this.a;
        return d501931552841044881;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((D501931552841044881) r15896830329318850690).f209o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L1727297732548438554) && S10823041268949770285.t(this.a, ((L1727297732548438554) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ")";
    }
}
