package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C8208478698997814570 {
    public final U16834965109098959004 a;
    public long b;

    public C8208478698997814570(U16834965109098959004 u16834965109098959004, long j) {
        this.a = u16834965109098959004;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8208478698997814570) {
            C8208478698997814570 c8208478698997814570 = (C8208478698997814570) obj;
            if (this.a == c8208478698997814570.a && Q13254524308163418711.a(this.b, c8208478698997814570.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + Q13254524308163418711.b(this.b) + ")";
    }
}
