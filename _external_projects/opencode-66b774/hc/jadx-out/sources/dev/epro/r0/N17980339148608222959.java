package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N17980339148608222959 {
    public final Q17957571128037780363 a;
    public B1029012102904255937 b = null;
    public B1029012102904255937 c;

    public N17980339148608222959(Q17957571128037780363 q17957571128037780363, B1029012102904255937 b1029012102904255937) {
        this.a = q17957571128037780363;
        this.c = b1029012102904255937;
    }

    public final long a(long j) {
        S6349823729575121924 s6349823729575121924E;
        B1029012102904255937 b1029012102904255937 = this.b;
        S6349823729575121924 s6349823729575121924 = S6349823729575121924.e;
        if (b1029012102904255937 != null) {
            if (b1029012102904255937.C()) {
                B1029012102904255937 b10290121029042559372 = this.c;
                s6349823729575121924E = b10290121029042559372 != null ? b10290121029042559372.E(b1029012102904255937, true) : null;
            } else {
                s6349823729575121924E = s6349823729575121924;
            }
            if (s6349823729575121924E != null) {
                s6349823729575121924 = s6349823729575121924E;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = s6349823729575121924.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = s6349823729575121924.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = s6349823729575121924.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = s6349823729575121924.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        Q17957571128037780363 q17957571128037780363 = this.a;
        int iE = q17957571128037780363.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= q17957571128037780363.f(iE) && Float.intBitsToFloat(i) <= q17957571128037780363.g(iE);
    }

    public final long d(long j) {
        B1029012102904255937 b1029012102904255937;
        B1029012102904255937 b10290121029042559372 = this.b;
        if (b10290121029042559372 != null) {
            if (!b10290121029042559372.C()) {
                b10290121029042559372 = null;
            }
            if (b10290121029042559372 != null && (b1029012102904255937 = this.c) != null) {
                B1029012102904255937 b10290121029042559373 = b1029012102904255937.C() ? b1029012102904255937 : null;
                if (b10290121029042559373 != null) {
                    return b10290121029042559372.r(b10290121029042559373, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        B1029012102904255937 b1029012102904255937;
        B1029012102904255937 b10290121029042559372 = this.b;
        if (b10290121029042559372 != null) {
            if (!b10290121029042559372.C()) {
                b10290121029042559372 = null;
            }
            if (b10290121029042559372 != null && (b1029012102904255937 = this.c) != null) {
                B1029012102904255937 b10290121029042559373 = b1029012102904255937.C() ? b1029012102904255937 : null;
                if (b10290121029042559373 != null) {
                    return b10290121029042559373.r(b10290121029042559372, j);
                }
            }
        }
        return j;
    }
}
