package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q14128584391259813747 {
    public final int a;
    public final int b;

    public Q14128584391259813747(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            Y16081827717826519461.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        Y16081827717826519461.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q14128584391259813747)) {
            return false;
        }
        Q14128584391259813747 q14128584391259813747 = (Q14128584391259813747) obj;
        return this.a == q14128584391259813747.a && this.b == q14128584391259813747.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return G11450220448113054352.h(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
