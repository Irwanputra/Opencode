package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8171957064035740491 {
    public final long a;
    public final long b;

    public E8171957064035740491(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E8171957064035740491)) {
            return false;
        }
        dev.epro.r0.E8171957064035740491 e8171957064035740491 = (dev.epro.r0.E8171957064035740491) obj;
        long j = e8171957064035740491.a;
        int i = dev.epro.r0.U10174709222559481877.i;
        return dev.epro.r0.P15388715743159210616.a(this.a, j) && dev.epro.r0.P15388715743159210616.a(this.b, e8171957064035740491.b);
    }

    public final int hashCode() {
        int i = dev.epro.r0.U10174709222559481877.i;
        return java.lang.Long.hashCode(this.b) + (java.lang.Long.hashCode(this.a) * 31);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.m("SelectionColors(selectionHandleColor=", dev.epro.r0.U10174709222559481877.h(this.a), ", selectionBackgroundColor=", dev.epro.r0.U10174709222559481877.h(this.b), ")");
    }
}
