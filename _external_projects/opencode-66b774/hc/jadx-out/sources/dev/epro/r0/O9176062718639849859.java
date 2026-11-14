package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O9176062718639849859 {
    public final R7332211110819204002 a;
    public final R7332211110819204002 b;

    public O9176062718639849859(R7332211110819204002 r7332211110819204002, R7332211110819204002 r73322111108192040022) {
        this.a = r7332211110819204002;
        this.b = r73322111108192040022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O9176062718639849859)) {
            return false;
        }
        O9176062718639849859 o9176062718639849859 = (O9176062718639849859) obj;
        return this.a == o9176062718639849859.a && this.b == o9176062718639849859.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ")";
    }
}
