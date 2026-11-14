package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D2728421111140880766 extends dev.epro.r0.T5990920249823963282 {
    public final int a;

    public D2728421111140880766(int i) {
        this.a = i;
    }

    public static dev.epro.r0.D2728421111140880766 b(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new dev.epro.r0.D2728421111140880766(i);
        }
        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit are supported", java.lang.Integer.valueOf(i * 8)));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof dev.epro.r0.D2728421111140880766) && ((dev.epro.r0.D2728421111140880766) obj).a == this.a;
    }

    public final int hashCode() {
        return java.util.Objects.hash(dev.epro.r0.D2728421111140880766.class, java.lang.Integer.valueOf(this.a));
    }

    public final java.lang.String toString() {
        return dev.epro.r0.G6547577305291411977.o(this.a, "AesCmac PRF Parameters (", "-byte key)");
    }
}
