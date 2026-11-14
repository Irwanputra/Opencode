package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D3673201505608512511 extends V6719956433280724295 {
    public final D14731132657808549702 a;
    public final int b;

    public D3673201505608512511(int i, D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
        this.b = i;
    }

    public static D3673201505608512511 b(int i, D14731132657808549702 d14731132657808549702) {
        if (i >= 8 && i <= 12) {
            return new D3673201505608512511(i, d14731132657808549702);
        }
        W4415201450379021245.c("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.a != D14731132657808549702.y0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D3673201505608512511)) {
            return false;
        }
        D3673201505608512511 d3673201505608512511 = (D3673201505608512511) obj;
        return d3673201505608512511.a == this.a && d3673201505608512511.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(D3673201505608512511.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return G6547577305291411977.p(this.b, "X-AES-GCM Parameters (variant: ", String.valueOf(this.a), "salt_size_bytes: ", ")");
    }
}
