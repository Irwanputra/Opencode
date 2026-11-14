package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S6349823729575121924 {
    public static final S6349823729575121924 e = new S6349823729575121924(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public S6349823729575121924(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static S6349823729575121924 b(S6349823729575121924 s6349823729575121924, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = s6349823729575121924.a;
        }
        float f4 = s6349823729575121924.b;
        if ((i & 4) != 0) {
            f2 = s6349823729575121924.c;
        }
        if ((i & 8) != 0) {
            f3 = s6349823729575121924.d;
        }
        return new S6349823729575121924(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.d)) & 4294967295L);
    }

    public final long d() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S6349823729575121924)) {
            return false;
        }
        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) obj;
        return Float.compare(this.a, s6349823729575121924.a) == 0 && Float.compare(this.b, s6349823729575121924.b) == 0 && Float.compare(this.c, s6349823729575121924.c) == 0 && Float.compare(this.d, s6349823729575121924.d) == 0;
    }

    public final long f() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final S6349823729575121924 g(S6349823729575121924 s6349823729575121924) {
        return new S6349823729575121924(Math.max(this.a, s6349823729575121924.a), Math.max(this.b, s6349823729575121924.b), Math.min(this.c, s6349823729575121924.c), Math.min(this.d, s6349823729575121924.d));
    }

    public final boolean h() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final boolean i(S6349823729575121924 s6349823729575121924) {
        return (this.a < s6349823729575121924.c) & (s6349823729575121924.a < this.c) & (this.b < s6349823729575121924.d) & (s6349823729575121924.b < this.d);
    }

    public final S6349823729575121924 j(float f, float f2) {
        return new S6349823729575121924(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final S6349823729575121924 k(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new S6349823729575121924(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        String strK = D15913187640519482289.K(this.a);
        String strK2 = D15913187640519482289.K(this.b);
        return G6547577305291411977.w(G6547577305291411977.y("Rect.fromLTRB(", strK, ", ", strK2, ", "), D15913187640519482289.K(this.c), ", ", D15913187640519482289.K(this.d), ")");
    }
}
