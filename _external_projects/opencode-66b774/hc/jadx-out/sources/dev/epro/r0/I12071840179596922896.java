package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I12071840179596922896 {
    public final Z18433174440109049358 a;
    public final Z18433174440109049358 b;
    public final V697849047308847220 c;
    public final V697849047308847220 d;
    public final V697849047308847220 e;
    public final V697849047308847220 f;
    public final T14340690021504685682 g;

    public I12071840179596922896() {
        Z18433174440109049358 z18433174440109049358 = new Z18433174440109049358();
        this.a = z18433174440109049358;
        this.b = z18433174440109049358;
        B14824868959299866349 b14824868959299866349 = B14824868959299866349.k;
        this.c = new V697849047308847220(null, b14824868959299866349);
        this.d = new V697849047308847220(null, b14824868959299866349);
        this.e = new V697849047308847220(null, b14824868959299866349);
        this.f = V4416135141588678913.t(new A891803927997771281(0.0f));
        this.g = new T14340690021504685682();
    }

    public final long a(long j) {
        S6349823729575121924 s6349823729575121924E;
        B1029012102904255937 b1029012102904255937E = e();
        S6349823729575121924 s6349823729575121924 = S6349823729575121924.e;
        if (b1029012102904255937E != null) {
            if (b1029012102904255937E.C()) {
                B1029012102904255937 b1029012102904255937B = b();
                s6349823729575121924E = b1029012102904255937B != null ? b1029012102904255937B.E(b1029012102904255937E, true) : null;
            } else {
                s6349823729575121924E = s6349823729575121924;
            }
            if (s6349823729575121924E != null) {
                s6349823729575121924 = s6349823729575121924E;
            }
        }
        return V4416135141588678913.i(j, s6349823729575121924);
    }

    public final B1029012102904255937 b() {
        return (B1029012102904255937) this.e.getValue();
    }

    public final Q17957571128037780363 c() {
        return (Q17957571128037780363) this.b.getValue();
    }

    public final int d(long j, boolean z) {
        Q17957571128037780363 q17957571128037780363C = c();
        if (q17957571128037780363C == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return q17957571128037780363C.b.g(V4416135141588678913.m(this, j));
    }

    public final B1029012102904255937 e() {
        return (B1029012102904255937) this.c.getValue();
    }

    public final boolean f(long j) {
        Q17957571128037780363 q17957571128037780363C = c();
        if (q17957571128037780363C == null) {
            return false;
        }
        long jM = V4416135141588678913.m(this, a(j));
        int iE = q17957571128037780363C.b.e(Float.intBitsToFloat((int) (4294967295L & jM)));
        int i = (int) (jM >> 32);
        return Float.intBitsToFloat(i) >= q17957571128037780363C.f(iE) && Float.intBitsToFloat(i) <= q17957571128037780363C.g(iE);
    }
}
