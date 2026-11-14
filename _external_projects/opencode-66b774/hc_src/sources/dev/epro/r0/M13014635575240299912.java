package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M13014635575240299912 implements W15221986049472461469 {
    public final R8540738700654750557 a;
    public final long b;

    public M13014635575240299912(L16995345256540175694 l16995345256540175694, long j) {
        this.a = l16995345256540175694;
        this.b = j;
    }

    @Override // dev.epro.r0.W15221986049472461469
    public final I1722681268793429505 a(I1722681268793429505 i1722681268793429505, L739450498903353996 l739450498903353996) {
        return i1722681268793429505.Q0(new Q9699544183693190383(l739450498903353996, false));
    }

    public final float b() {
        long j = this.b;
        if (!I16980768508151520658.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.M0(I16980768508151520658.h(j));
    }

    public final float c() {
        long j = this.b;
        if (!I16980768508151520658.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.M0(I16980768508151520658.i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M13014635575240299912)) {
            return false;
        }
        M13014635575240299912 m13014635575240299912 = (M13014635575240299912) obj;
        return S10823041268949770285.t(this.a, m13014635575240299912.a) && I16980768508151520658.c(this.b, m13014635575240299912.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + I16980768508151520658.l(this.b) + ")";
    }
}
