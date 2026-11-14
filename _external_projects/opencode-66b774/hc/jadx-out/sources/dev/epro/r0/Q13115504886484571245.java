package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q13115504886484571245 implements K6937929821947263863 {
    public final int a;
    public final J6301524036964264730 b;
    public final long c;
    public final long d;

    public Q13115504886484571245(int i, int i2, J6301524036964264730 j6301524036964264730) {
        this.a = i;
        this.b = j6301524036964264730;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final long b(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final float c(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fC = this.b.c(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fC) + ((1.0f - fC) * f);
    }

    @Override // dev.epro.r0.K6937929821947263863
    public final float d(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (c(f, f2, f3, j4) - c(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }
}
