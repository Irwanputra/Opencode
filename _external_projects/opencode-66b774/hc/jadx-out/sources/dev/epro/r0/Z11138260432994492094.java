package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class Z11138260432994492094 extends A8269341136279542501 {
    public final L12639328004344855510 a;

    public Z11138260432994492094(L12639328004344855510 l12639328004344855510) {
        this.a = l12639328004344855510;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new D3326514432585990587(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((D3326514432585990587) r15896830329318850690).q = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z11138260432994492094) {
            return this.a == ((Z11138260432994492094) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        L12639328004344855510 l12639328004344855510 = this.a;
        if (l12639328004344855510 != null) {
            return l12639328004344855510.hashCode();
        }
        return 0;
    }
}
