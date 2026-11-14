package dev.epro.r0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D2728421111140880766 extends T5990920249823963282 {
    public final int a;

    public D2728421111140880766(int i) {
        this.a = i;
    }

    public static D2728421111140880766 b(int i) {
        if (i == 16 || i == 32) {
            return new D2728421111140880766(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D2728421111140880766) && ((D2728421111140880766) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(D2728421111140880766.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        return G6547577305291411977.o(this.a, "AesCmac PRF Parameters (", "-byte key)");
    }
}
