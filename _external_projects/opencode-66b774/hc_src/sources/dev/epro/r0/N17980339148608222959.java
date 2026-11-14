package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N17980339148608222959 {
    public final Q17957571128037780363 a;
    public B1029012102904255937 b = null;
    public B1029012102904255937 c;

    public N17980339148608222959(Q17957571128037780363 q17957571128037780363, B1029012102904255937 b1029012102904255937) {
        this.a = q17957571128037780363;
        this.c = b1029012102904255937;
    }

    public final long a(long j) {
        S6349823729575121924 s6349823729575121924;
        B1029012102904255937 b1029012102904255937 = this.b;
        S6349823729575121924 s63498237295751219242 = S6349823729575121924.e;
        if (b1029012102904255937 != null) {
            if (b1029012102904255937.C()) {
                B1029012102904255937 b10290121029042559372 = this.c;
                s6349823729575121924 = b10290121029042559372 != null ? b10290121029042559372.E(b1029012102904255937, true) : null;
            } else {
                s6349823729575121924 = s63498237295751219242;
            }
            if (s6349823729575121924 != null) {
                s63498237295751219242 = s6349823729575121924;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = s63498237295751219242.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = s63498237295751219242.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = s63498237295751219242.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = s63498237295751219242.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        Q17957571128037780363 q17957571128037780363 = this.a;
        int e = q17957571128037780363.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= q17957571128037780363.f(e) && Float.intBitsToFloat(i) <= q17957571128037780363.g(e);
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
