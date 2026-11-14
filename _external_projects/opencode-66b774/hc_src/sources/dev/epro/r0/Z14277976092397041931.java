package dev.epro.r0;

import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Z14277976092397041931 extends V6719956433280724295 {
    public final int a;
    public final D14731132657808549702 b;

    public Z14277976092397041931(int i, D14731132657808549702 d14731132657808549702) {
        this.a = i;
        this.b = d14731132657808549702;
    }

    public static W8455343525638953052 b() {
        W8455343525638953052 w8455343525638953052 = new W8455343525638953052((byte) 2, false);
        w8455343525638953052.b = null;
        w8455343525638953052.c = D14731132657808549702.w;
        return w8455343525638953052;
    }

    @Override // dev.epro.r0.T5990920249823963282
    public final boolean a() {
        return this.b != D14731132657808549702.w;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z14277976092397041931)) {
            return false;
        }
        Z14277976092397041931 z14277976092397041931 = (Z14277976092397041931) obj;
        return z14277976092397041931.a == this.a && z14277976092397041931.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(Z14277976092397041931.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return G6547577305291411977.p(this.a, "AesGcmSiv Parameters (variant: ", String.valueOf(this.b), ", ", "-byte key)");
    }
}
