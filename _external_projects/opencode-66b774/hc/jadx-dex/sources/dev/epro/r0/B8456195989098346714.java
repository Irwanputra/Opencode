package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B8456195989098346714 implements dev.epro.r0.P12772215240311114381 {
    public final byte a;
    public final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public B8456195989098346714(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (1 > i || i > i2) {
            dev.epro.r0.Y16081827717826519461.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.B8456195989098346714.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.B8456195989098346714 b8456195989098346714 = (dev.epro.r0.B8456195989098346714) obj;
        return this.a == b8456195989098346714.a && this.b == b8456195989098346714.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G11450220448113054352.h(this.a, this.b, "MultiLine(minHeightInLines=", ", maxHeightInLines=", ")");
    }
}
