package dev.epro.r0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A17493290252326224231 extends H5732944296146006561 {
    public final D14731132657808549702 a;

    public A17493290252326224231(D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.a != D14731132657808549702.M;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A17493290252326224231) && ((A17493290252326224231) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(A17493290252326224231.class, this.a);
    }

    public final String toString() {
        return G6547577305291411977.s("Ed25519 Parameters (variant: ", String.valueOf(this.a), ")");
    }
}
