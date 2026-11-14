package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H12638675653915429726 extends A8269341136279542501 {
    public final P777117574205674816 a;

    public H12638675653915429726(P777117574205674816 p777117574205674816) {
        this.a = p777117574205674816;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        M9302491765208466055 m9302491765208466055 = new M9302491765208466055();
        m9302491765208466055.f377o = this.a;
        return m9302491765208466055;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((M9302491765208466055) r15896830329318850690).f377o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        H12638675653915429726 h12638675653915429726 = obj instanceof H12638675653915429726 ? (H12638675653915429726) obj : null;
        if (h12638675653915429726 == null) {
            return false;
        }
        return S10823041268949770285.t(this.a, h12638675653915429726.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
