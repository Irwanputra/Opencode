package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class K14729567235970348628 extends A8269341136279542501 {
    public final N18033783269298797248 a;

    public K14729567235970348628(N18033783269298797248 n18033783269298797248) {
        this.a = n18033783269298797248;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new W10496849627779906797(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((W10496849627779906797) r15896830329318850690).h1(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K14729567235970348628) {
            return S10823041268949770285.t(this.a, ((K14729567235970348628) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
