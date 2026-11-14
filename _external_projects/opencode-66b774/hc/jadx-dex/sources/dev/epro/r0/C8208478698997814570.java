package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C8208478698997814570 {
    public final dev.epro.r0.U16834965109098959004 a;
    public long b;

    public C8208478698997814570(dev.epro.r0.U16834965109098959004 u16834965109098959004, long j) {
        this.a = u16834965109098959004;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.C8208478698997814570) {
            dev.epro.r0.C8208478698997814570 c8208478698997814570 = (dev.epro.r0.C8208478698997814570) obj;
            if (this.a == c8208478698997814570.a && dev.epro.r0.Q13254524308163418711.a(this.b, c8208478698997814570.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + dev.epro.r0.Q13254524308163418711.b(this.b) + ")";
    }
}
