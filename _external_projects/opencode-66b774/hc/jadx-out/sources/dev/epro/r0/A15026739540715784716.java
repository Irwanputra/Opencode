package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A15026739540715784716 {

    @O7462376509978667369("runtime_free")
    public Long a;

    @O7462376509978667369("runtime_max")
    public Long b;

    @O7462376509978667369("runtime_total")
    public Long c;

    @O7462376509978667369("web_view_count")
    public Integer d;

    public A15026739540715784716(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A15026739540715784716)) {
            return false;
        }
        A15026739540715784716 a15026739540715784716 = (A15026739540715784716) obj;
        return S10823041268949770285.t(this.a, a15026739540715784716.a) && S10823041268949770285.t(this.b, a15026739540715784716.b) && S10823041268949770285.t(this.c, a15026739540715784716.c) && S10823041268949770285.t(this.d, a15026739540715784716.d);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MemorySignals(runtimeFreeMemory=" + this.a + ", runtimeMaxMemory=" + this.b + ", runtimeTotalMemory=" + this.c + ", webviewCount=" + this.d + ")";
    }

    public A15026739540715784716() {
        this(0);
    }
}
