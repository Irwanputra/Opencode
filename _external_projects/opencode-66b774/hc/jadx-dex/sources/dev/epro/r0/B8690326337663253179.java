package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B8690326337663253179 {
    public final int a;
    public final java.lang.Object b;

    public B8690326337663253179(int i, java.lang.Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B8690326337663253179)) {
            return false;
        }
        dev.epro.r0.B8690326337663253179 b8690326337663253179 = (dev.epro.r0.B8690326337663253179) obj;
        return this.a == b8690326337663253179.a && dev.epro.r0.S10823041268949770285.t(this.b, b8690326337663253179.b);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.a) * 31;
        java.lang.Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
