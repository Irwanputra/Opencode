package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X14709748109620942100 implements B9345618057833789735 {
    public final B9345618057833789735 a;
    public final B9345618057833789735 b;

    public X14709748109620942100(B9345618057833789735 b9345618057833789735, B9345618057833789735 b93456180578337897352) {
        this.a = b9345618057833789735;
        this.b = b93456180578337897352;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int a(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        int a = this.a.a(r8540738700654750557, f10342546226345611902) - this.b.a(r8540738700654750557, f10342546226345611902);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int b(R8540738700654750557 r8540738700654750557) {
        int b = this.a.b(r8540738700654750557) - this.b.b(r8540738700654750557);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int c(R8540738700654750557 r8540738700654750557, F10342546226345611902 f10342546226345611902) {
        int c = this.a.c(r8540738700654750557, f10342546226345611902) - this.b.c(r8540738700654750557, f10342546226345611902);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // dev.epro.r0.B9345618057833789735
    public final int d(R8540738700654750557 r8540738700654750557) {
        int d = this.a.d(r8540738700654750557) - this.b.d(r8540738700654750557);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X14709748109620942100)) {
            return false;
        }
        X14709748109620942100 x14709748109620942100 = (X14709748109620942100) obj;
        return S10823041268949770285.t(x14709748109620942100.a, this.a) && S10823041268949770285.t(x14709748109620942100.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
