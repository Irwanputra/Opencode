package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A916399900972467586 {
    public final Q9908018528090167751 a;
    public S15936456347642006474 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public A916399900972467586() {
        Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
        this.a = new Q9908018528090167751();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(S15936456347642006474 s15936456347642006474, long j, long j2, float[] fArr, long j3) {
        long j4 = s15936456347642006474.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            s15936456347642006474.g = j3;
            s15936456347642006474.a(s15936456347642006474.e, s15936456347642006474.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (Q2551293802323679034.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!Q2551293802323679034.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
