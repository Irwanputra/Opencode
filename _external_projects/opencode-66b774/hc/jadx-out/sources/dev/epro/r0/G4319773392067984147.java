package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G4319773392067984147 implements B9345618057833789735 {
    public final T1241271073913685060 a;

    public G4319773392067984147(T1241271073913685060 t1241271073913685060) {
        this.a = t1241271073913685060;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return r8540738700654750557.g0(this.a.d(f10342546226345611902));
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        return r8540738700654750557.g0(this.a.b());
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return r8540738700654750557.g0(this.a.c(f10342546226345611902));
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        return r8540738700654750557.g0(this.a.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G4319773392067984147) {
            return S10823041268949770285.t(((G4319773392067984147) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        T1241271073913685060 t1241271073913685060 = this.a;
        F10342546226345611902 f10342546226345611902 = F10342546226345611902.a;
        float fD = t1241271073913685060.d(f10342546226345611902);
        float fB = t1241271073913685060.b();
        float fC = t1241271073913685060.c(f10342546226345611902);
        float fA = t1241271073913685060.a();
        String strC = A891803927997771281.c(fD);
        String strC2 = A891803927997771281.c(fB);
        return G6547577305291411977.w(G6547577305291411977.y("PaddingValues(", strC, ", ", strC2, ", "), A891803927997771281.c(fC), ", ", A891803927997771281.c(fA), ")");
    }
}
