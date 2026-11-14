package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M7976697329589061320 implements E13332886634652933381 {
    public final Q10847809900677551877 a;

    public M7976697329589061320(Q10847809900677551877 q10847809900677551877) {
        this.a = q10847809900677551877;
    }

    @Override // dev.epro.r0.E13332886634652933381
    public final int a(I11366018238968599357 i11366018238968599357, long j, int i, F10342546226345611902 f10342546226345611902) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (f10342546226345611902 == F10342546226345611902.a ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return W7808703833045379622.q(this.a.a(i, i2, f10342546226345611902), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M7976697329589061320) && this.a.equals(((M7976697329589061320) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
