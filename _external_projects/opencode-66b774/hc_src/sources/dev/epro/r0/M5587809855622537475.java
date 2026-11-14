package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M5587809855622537475 implements B9345618057833789735 {
    public final B9345618057833789735 a;
    public final B9345618057833789735 b;

    public M5587809855622537475(B9345618057833789735 b9345618057833789735, B9345618057833789735 b93456180578337897352) {
        this.a = b9345618057833789735;
        this.b = b93456180578337897352;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return Math.max(this.a.a(r8540738700654750557, f10342546226345611902), this.b.a(r8540738700654750557, f10342546226345611902));
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        return Math.max(this.a.b(r8540738700654750557), this.b.b(r8540738700654750557));
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return Math.max(this.a.c(r8540738700654750557, f10342546226345611902), this.b.c(r8540738700654750557, f10342546226345611902));
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        return Math.max(this.a.d(r8540738700654750557), this.b.d(r8540738700654750557));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M5587809855622537475)) {
            return false;
        }
        M5587809855622537475 m5587809855622537475 = (M5587809855622537475) obj;
        return S10823041268949770285.t(m5587809855622537475.a, this.a) && S10823041268949770285.t(m5587809855622537475.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
