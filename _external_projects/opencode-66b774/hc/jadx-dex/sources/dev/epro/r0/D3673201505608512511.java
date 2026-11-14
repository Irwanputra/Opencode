package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D3673201505608512511 extends dev.epro.r0.V6719956433280724295 {
    public final dev.epro.r0.D14731132657808549702 a;
    public final int b;

    public D3673201505608512511(int i, dev.epro.r0.D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
        this.b = i;
    }

    public static dev.epro.r0.D3673201505608512511 b(int i, dev.epro.r0.D14731132657808549702 d14731132657808549702) {
        if (i >= 8 && i <= 12) {
            return new dev.epro.r0.D3673201505608512511(i, d14731132657808549702);
        }
        dev.epro.r0.W4415201450379021245.c("Salt size must be between 8 and 12 bytes");
        return null;
    }

    public final boolean a() {
        return this.a != dev.epro.r0.D14731132657808549702.y0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.D3673201505608512511)) {
            return false;
        }
        dev.epro.r0.D3673201505608512511 d3673201505608512511 = (dev.epro.r0.D3673201505608512511) obj;
        return d3673201505608512511.a == this.a && d3673201505608512511.b == this.b;
    }

    public final int hashCode() {
        return java.util.Objects.hash(dev.epro.r0.D3673201505608512511.class, this.a, java.lang.Integer.valueOf(this.b));
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.p(this.b, "X-AES-GCM Parameters (variant: ", java.lang.String.valueOf(this.a), "salt_size_bytes: ", ")");
    }
}
