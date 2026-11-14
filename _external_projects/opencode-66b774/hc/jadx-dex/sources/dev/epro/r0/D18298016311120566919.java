package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D18298016311120566919 implements java.io.Serializable {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public D18298016311120566919(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D18298016311120566919)) {
            return false;
        }
        dev.epro.r0.D18298016311120566919 d18298016311120566919 = (dev.epro.r0.D18298016311120566919) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, d18298016311120566919.a) && dev.epro.r0.S10823041268949770285.t(this.b, d18298016311120566919.b) && dev.epro.r0.S10823041268949770285.t(this.c, d18298016311120566919.c);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
