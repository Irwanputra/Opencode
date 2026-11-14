package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A17493290252326224231 extends dev.epro.r0.H5732944296146006561 {
    public final dev.epro.r0.D14731132657808549702 a;

    public A17493290252326224231(dev.epro.r0.D14731132657808549702 d14731132657808549702) {
        this.a = d14731132657808549702;
    }

    public final boolean a() {
        return this.a != dev.epro.r0.D14731132657808549702.M;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof dev.epro.r0.A17493290252326224231) && ((dev.epro.r0.A17493290252326224231) obj).a == this.a;
    }

    public final int hashCode() {
        return java.util.Objects.hash(dev.epro.r0.A17493290252326224231.class, this.a);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.s("Ed25519 Parameters (variant: ", java.lang.String.valueOf(this.a), ")");
    }
}
