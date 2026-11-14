package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class O4842575202620284556 extends A8269341136279542501 {
    public final S9385204271696540760 a;

    public O4842575202620284556(S9385204271696540760 s9385204271696540760) {
        this.a = s9385204271696540760;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new O7079424195051088996(this.a, (L2088545775067967710) null, 6);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((O7079424195051088996) r15896830329318850690).m1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O4842575202620284556) {
            return S10823041268949770285.t(this.a, ((O4842575202620284556) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        S9385204271696540760 s9385204271696540760 = this.a;
        if (s9385204271696540760 != null) {
            return s9385204271696540760.hashCode();
        }
        return 0;
    }
}
