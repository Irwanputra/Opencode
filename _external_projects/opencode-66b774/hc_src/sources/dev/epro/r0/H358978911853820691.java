package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H358978911853820691 extends V6719956433280724295 {
    public final D14731132657808549702 a;

    public H358978911853820691(D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.a != D14731132657808549702.B0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof H358978911853820691) && ((H358978911853820691) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(H358978911853820691.class, this.a);
    }

    public final String toString() {
        return G6547577305291411977.s("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
