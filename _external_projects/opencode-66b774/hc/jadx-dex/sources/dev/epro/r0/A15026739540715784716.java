package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A15026739540715784716 {

    @dev.epro.r0.O7462376509978667369("runtime_free")
    public java.lang.Long a;

    @dev.epro.r0.O7462376509978667369("runtime_max")
    public java.lang.Long b;

    @dev.epro.r0.O7462376509978667369("runtime_total")
    public java.lang.Long c;

    @dev.epro.r0.O7462376509978667369("web_view_count")
    public java.lang.Integer d;

    public A15026739540715784716(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.A15026739540715784716)) {
            return false;
        }
        dev.epro.r0.A15026739540715784716 a15026739540715784716 = (dev.epro.r0.A15026739540715784716) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, a15026739540715784716.a) && dev.epro.r0.S10823041268949770285.t(this.b, a15026739540715784716.b) && dev.epro.r0.S10823041268949770285.t(this.c, a15026739540715784716.c) && dev.epro.r0.S10823041268949770285.t(this.d, a15026739540715784716.d);
    }

    public final int hashCode() {
        java.lang.Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        java.lang.Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        java.lang.Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MemorySignals(runtimeFreeMemory=" + this.a + ", runtimeMaxMemory=" + this.b + ", runtimeTotalMemory=" + this.c + ", webviewCount=" + this.d + ")";
    }

    public A15026739540715784716() {
        this(0);
    }
}
