package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E2203666118840183905 {
    public final dev.epro.r0.M11181104712105445833 a;
    public dev.epro.r0.M11181104712105445833 b;
    public boolean c = false;
    public dev.epro.r0.A852747196519157633 d = null;

    public E2203666118840183905(dev.epro.r0.M11181104712105445833 m11181104712105445833, dev.epro.r0.M11181104712105445833 m111811047121054458332) {
        this.a = m11181104712105445833;
        this.b = m111811047121054458332;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E2203666118840183905)) {
            return false;
        }
        dev.epro.r0.E2203666118840183905 e2203666118840183905 = (dev.epro.r0.E2203666118840183905) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, e2203666118840183905.a) && dev.epro.r0.S10823041268949770285.t(this.b, e2203666118840183905.b) && this.c == e2203666118840183905.c && dev.epro.r0.S10823041268949770285.t(this.d, e2203666118840183905.d);
    }

    public final int hashCode() {
        int i = dev.epro.r0.G6547577305291411977.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        dev.epro.r0.A852747196519157633 a852747196519157633 = this.d;
        return i + (a852747196519157633 == null ? 0 : a852747196519157633.hashCode());
    }

    public final java.lang.String toString() {
        return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
