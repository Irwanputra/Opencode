package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class F4745638527783833984 extends A8269341136279542501 {
    public final T1241271073913685060 a;

    public F4745638527783833984(T1241271073913685060 t1241271073913685060) {
        this.a = t1241271073913685060;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        J11590886181213258237 j11590886181213258237 = new J11590886181213258237();
        j11590886181213258237.f302o = this.a;
        return j11590886181213258237;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((J11590886181213258237) r15896830329318850690).f302o = this.a;
    }

    public final boolean equals(Object obj) {
        F4745638527783833984 f4745638527783833984 = obj instanceof F4745638527783833984 ? (F4745638527783833984) obj : null;
        if (f4745638527783833984 == null) {
            return false;
        }
        return S10823041268949770285.t(this.a, f4745638527783833984.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
