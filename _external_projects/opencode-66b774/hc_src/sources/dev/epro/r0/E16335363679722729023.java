package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E16335363679722729023 extends V6719956433280724295 {
    public final D14731132657808549702 a;

    public E16335363679722729023(D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.a != D14731132657808549702.z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof E16335363679722729023) && ((E16335363679722729023) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(E16335363679722729023.class, this.a);
    }

    public final String toString() {
        return G6547577305291411977.s("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
