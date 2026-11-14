package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q3056362356273504797 implements B9345618057833789735 {
    public final B9345618057833789735 a;
    public final G4319773392067984147 b;

    public Q3056362356273504797(B9345618057833789735 b9345618057833789735, G4319773392067984147 g4319773392067984147) {
        this.a = b9345618057833789735;
        this.b = g4319773392067984147;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return this.b.a(r8540738700654750557, f10342546226345611902) + this.a.a(r8540738700654750557, f10342546226345611902);
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        return this.b.b(r8540738700654750557) + this.a.b(r8540738700654750557);
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        return this.b.c(r8540738700654750557, f10342546226345611902) + this.a.c(r8540738700654750557, f10342546226345611902);
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        return this.b.d(r8540738700654750557) + this.a.d(r8540738700654750557);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q3056362356273504797)) {
            return false;
        }
        Q3056362356273504797 q3056362356273504797 = (Q3056362356273504797) obj;
        return S10823041268949770285.t(q3056362356273504797.a, this.a) && q3056362356273504797.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
