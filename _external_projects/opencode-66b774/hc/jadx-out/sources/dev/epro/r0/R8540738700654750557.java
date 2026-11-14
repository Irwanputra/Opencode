package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public interface R8540738700654750557 {
    default long E0(float f) {
        return G(P0(f));
    }

    default long G(float f) {
        float[] fArr = G2105242400535572210.a;
        if (s() < 1.03f) {
            return V3311072669930093336.n(f / s(), 4294967296L);
        }
        V15138624659649446319 v15138624659649446319A = G2105242400535572210.a(s());
        return V3311072669930093336.n(v15138624659649446319A != null ? v15138624659649446319A.a(f) : f / s(), 4294967296L);
    }

    default long I(long j) {
        if (j != 9205357640488583168L) {
            return D1286559660607336098.c(P0(Float.intBitsToFloat((int) (j >> 32))), P0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float K(float f) {
        return c() * f;
    }

    default float M0(int i) {
        return i / c();
    }

    default float P0(float f) {
        return f / c();
    }

    default int X(long j) {
        return Math.round(v0(j));
    }

    default float Y(long j) {
        if (!E6417708602094478350.a(J5593409210068682756.b(j), 4294967296L)) {
            N17315172036749737048.b("Only Sp can convert to Px");
        }
        float[] fArr = G2105242400535572210.a;
        if (s() < 1.03f) {
            return s() * J5593409210068682756.c(j);
        }
        V15138624659649446319 v15138624659649446319A = G2105242400535572210.a(s());
        if (v15138624659649446319A != null) {
            return v15138624659649446319A.b(J5593409210068682756.c(j));
        }
        return s() * J5593409210068682756.c(j);
    }

    float c();

    default int g0(float f) {
        float fK = K(f);
        if (Float.isInfinite(fK)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fK);
    }

    float s();

    default long t0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fK = K(T17307533667608403708.b(j));
        float fK2 = K(T17307533667608403708.a(j));
        return (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(fK2)) & 4294967295L);
    }

    default float v0(long j) {
        if (!E6417708602094478350.a(J5593409210068682756.b(j), 4294967296L)) {
            N17315172036749737048.b("Only Sp can convert to Px");
        }
        return K(Y(j));
    }
}
