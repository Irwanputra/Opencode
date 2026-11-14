package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E2203666118840183905 {
    public final M11181104712105445833 a;
    public M11181104712105445833 b;
    public boolean c = false;
    public A852747196519157633 d = null;

    public E2203666118840183905(M11181104712105445833 m11181104712105445833, M11181104712105445833 m111811047121054458332) {
        this.a = m11181104712105445833;
        this.b = m111811047121054458332;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2203666118840183905)) {
            return false;
        }
        E2203666118840183905 e2203666118840183905 = (E2203666118840183905) obj;
        return S10823041268949770285.t(this.a, e2203666118840183905.a) && S10823041268949770285.t(this.b, e2203666118840183905.b) && this.c == e2203666118840183905.c && S10823041268949770285.t(this.d, e2203666118840183905.d);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        A852747196519157633 a852747196519157633 = this.d;
        return i + (a852747196519157633 == null ? 0 : a852747196519157633.hashCode());
    }

    public final String toString() {
        M11181104712105445833 m11181104712105445833 = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) m11181104712105445833) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
