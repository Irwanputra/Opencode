package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7467881838773648178 extends dev.epro.r0.N27869097736109461 {
    public final dev.epro.r0.R15896830329318850690 c;
    public final dev.epro.r0.T17032536773975598836 d;
    public final dev.epro.r0.A18377563779865231301 e;
    public dev.epro.r0.Y4989033692226475498 f;
    public dev.epro.r0.Y1086209215650239921 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public B7467881838773648178(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        this.c = r15896830329318850690;
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.b = new long[2];
        this.d = t17032536773975598836;
        this.e = new dev.epro.r0.A18377563779865231301(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(dev.epro.r0.A18377563779865231301 r57, dev.epro.r0.B1029012102904255937 r58, dev.epro.r0.N10542843603712830247 r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B7467881838773648178.a(dev.epro.r0.A18377563779865231301, dev.epro.r0.B1029012102904255937, dev.epro.r0.N10542843603712830247, boolean):boolean");
    }

    public final void b(dev.epro.r0.N10542843603712830247 n10542843603712830247) {
        super.b(n10542843603712830247);
        dev.epro.r0.Y1086209215650239921 y1086209215650239921 = this.g;
        if (y1086209215650239921 == null) {
            return;
        }
        this.h = this.i;
        java.util.List list = y1086209215650239921.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dev.epro.r0.N13196868278329319633 n13196868278329319633 = (dev.epro.r0.N13196868278329319633) list.get(i);
            boolean z = n13196868278329319633.d;
            long j = n13196868278329319633.a;
            boolean zA = n10542843603712830247.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.l(j);
            }
        }
        this.i = false;
        this.j = y1086209215650239921.f == 5;
    }

    public final void c() {
        dev.epro.r0.D389890677992184566 d389890677992184566 = ((dev.epro.r0.N27869097736109461) this).a;
        java.lang.Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dev.epro.r0.B7467881838773648178) objArr[i2]).c();
        }
        dev.epro.r0.R15896830329318850690 r15896830329318850690M = this.c;
        dev.epro.r0.D389890677992184566 d3898906779921845662 = null;
        while (r15896830329318850690M != null) {
            if (r15896830329318850690M instanceof dev.epro.r0.B18307494358031290147) {
                ((dev.epro.r0.B18307494358031290147) r15896830329318850690M).x0();
            } else if ((r15896830329318850690M.c & 16) != 0 && (r15896830329318850690M instanceof dev.epro.r0.J2215566372910931965)) {
                int i3 = 0;
                for (dev.epro.r0.R15896830329318850690 r15896830329318850690 = ((dev.epro.r0.J2215566372910931965) r15896830329318850690M).p; r15896830329318850690 != null; r15896830329318850690 = r15896830329318850690.f) {
                    if ((r15896830329318850690.c & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            r15896830329318850690M = r15896830329318850690;
                        } else {
                            if (d3898906779921845662 == null) {
                                d3898906779921845662 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.R15896830329318850690[16]);
                            }
                            if (r15896830329318850690M != null) {
                                d3898906779921845662.b(r15896830329318850690M);
                                r15896830329318850690M = null;
                            }
                            d3898906779921845662.b(r15896830329318850690);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            r15896830329318850690M = dev.epro.r0.R7033599853981556291.M(d3898906779921845662);
        }
    }

    public final boolean d(dev.epro.r0.N10542843603712830247 n10542843603712830247) {
        dev.epro.r0.H11725168162114556860 h11725168162114556860;
        dev.epro.r0.A18377563779865231301 a18377563779865231301 = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (a18377563779865231301.f() != 0) {
            dev.epro.r0.R15896830329318850690 r15896830329318850690 = this.c;
            if (r15896830329318850690.n) {
                dev.epro.r0.Y4989033692226475498 y4989033692226475498 = r15896830329318850690.h;
                if ((y4989033692226475498 == null || (h11725168162114556860 = y4989033692226475498.u) == null) ? false : h11725168162114556860.I()) {
                    dev.epro.r0.Y1086209215650239921 y1086209215650239921 = this.g;
                    y1086209215650239921.getClass();
                    dev.epro.r0.Y4989033692226475498 y49890336922264754982 = this.f;
                    y49890336922264754982.getClass();
                    long j = ((dev.epro.r0.Z17471428274427141949) y49890336922264754982).c;
                    dev.epro.r0.R15896830329318850690 r15896830329318850690M = r15896830329318850690;
                    dev.epro.r0.D389890677992184566 d389890677992184566 = null;
                    while (r15896830329318850690M != null) {
                        if (r15896830329318850690M instanceof dev.epro.r0.B18307494358031290147) {
                            ((dev.epro.r0.B18307494358031290147) r15896830329318850690M).n0(y1086209215650239921, dev.epro.r0.J17191566391535857141.c, j);
                        } else if ((r15896830329318850690M.c & 16) != 0 && (r15896830329318850690M instanceof dev.epro.r0.J2215566372910931965)) {
                            int i = 0;
                            for (dev.epro.r0.R15896830329318850690 r158968303293188506902 = ((dev.epro.r0.J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                if ((r158968303293188506902.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r15896830329318850690M = r158968303293188506902;
                                    } else {
                                        if (d389890677992184566 == null) {
                                            d389890677992184566 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.R15896830329318850690[16]);
                                        }
                                        if (r15896830329318850690M != null) {
                                            d389890677992184566.b(r15896830329318850690M);
                                            r15896830329318850690M = null;
                                        }
                                        d389890677992184566.b(r158968303293188506902);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        r15896830329318850690M = dev.epro.r0.R7033599853981556291.M(d389890677992184566);
                    }
                    if (r15896830329318850690.n) {
                        dev.epro.r0.D389890677992184566 d3898906779921845662 = ((dev.epro.r0.N27869097736109461) this).a;
                        java.lang.Object[] objArr = d3898906779921845662.a;
                        int i2 = d3898906779921845662.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((dev.epro.r0.B7467881838773648178) objArr[i3]).d(n10542843603712830247);
                        }
                    }
                    z = true;
                }
            }
        }
        b(n10542843603712830247);
        a18377563779865231301.a();
        this.f = null;
        return z;
    }

    public final boolean e(dev.epro.r0.N10542843603712830247 n10542843603712830247, boolean z) {
        dev.epro.r0.H11725168162114556860 h11725168162114556860;
        if (this.e.f() == 0) {
            return false;
        }
        dev.epro.r0.R15896830329318850690 r15896830329318850690M = this.c;
        if (r15896830329318850690M.n) {
            dev.epro.r0.Y4989033692226475498 y4989033692226475498 = r15896830329318850690M.h;
            if ((y4989033692226475498 == null || (h11725168162114556860 = y4989033692226475498.u) == null) ? false : h11725168162114556860.I()) {
                dev.epro.r0.Y1086209215650239921 y1086209215650239921 = this.g;
                y1086209215650239921.getClass();
                dev.epro.r0.Y4989033692226475498 y49890336922264754982 = this.f;
                y49890336922264754982.getClass();
                long j = ((dev.epro.r0.Z17471428274427141949) y49890336922264754982).c;
                dev.epro.r0.R15896830329318850690 r15896830329318850690M2 = r15896830329318850690M;
                dev.epro.r0.D389890677992184566 d389890677992184566 = null;
                while (r15896830329318850690M2 != null) {
                    if (r15896830329318850690M2 instanceof dev.epro.r0.B18307494358031290147) {
                        ((dev.epro.r0.B18307494358031290147) r15896830329318850690M2).n0(y1086209215650239921, dev.epro.r0.J17191566391535857141.a, j);
                    } else if ((r15896830329318850690M2.c & 16) != 0 && (r15896830329318850690M2 instanceof dev.epro.r0.J2215566372910931965)) {
                        int i = 0;
                        for (dev.epro.r0.R15896830329318850690 r15896830329318850690 = ((dev.epro.r0.J2215566372910931965) r15896830329318850690M2).p; r15896830329318850690 != null; r15896830329318850690 = r15896830329318850690.f) {
                            if ((r15896830329318850690.c & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    r15896830329318850690M2 = r15896830329318850690;
                                } else {
                                    if (d389890677992184566 == null) {
                                        d389890677992184566 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.R15896830329318850690[16]);
                                    }
                                    if (r15896830329318850690M2 != null) {
                                        d389890677992184566.b(r15896830329318850690M2);
                                        r15896830329318850690M2 = null;
                                    }
                                    d389890677992184566.b(r15896830329318850690);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    r15896830329318850690M2 = dev.epro.r0.R7033599853981556291.M(d389890677992184566);
                }
                if (r15896830329318850690M.n) {
                    dev.epro.r0.D389890677992184566 d3898906779921845662 = ((dev.epro.r0.N27869097736109461) this).a;
                    java.lang.Object[] objArr = d3898906779921845662.a;
                    int i2 = d3898906779921845662.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        dev.epro.r0.B7467881838773648178 b7467881838773648178 = (dev.epro.r0.B7467881838773648178) objArr[i3];
                        this.f.getClass();
                        b7467881838773648178.e(n10542843603712830247, z);
                    }
                }
                if (r15896830329318850690M.n) {
                    dev.epro.r0.D389890677992184566 d3898906779921845663 = null;
                    while (r15896830329318850690M != null) {
                        if (r15896830329318850690M instanceof dev.epro.r0.B18307494358031290147) {
                            ((dev.epro.r0.B18307494358031290147) r15896830329318850690M).n0(y1086209215650239921, dev.epro.r0.J17191566391535857141.b, j);
                        } else if ((r15896830329318850690M.c & 16) != 0 && (r15896830329318850690M instanceof dev.epro.r0.J2215566372910931965)) {
                            int i4 = 0;
                            for (dev.epro.r0.R15896830329318850690 r158968303293188506902 = ((dev.epro.r0.J2215566372910931965) r15896830329318850690M).p; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.f) {
                                if ((r158968303293188506902.c & 16) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        r15896830329318850690M = r158968303293188506902;
                                    } else {
                                        if (d3898906779921845663 == null) {
                                            d3898906779921845663 = new dev.epro.r0.D389890677992184566(0, new dev.epro.r0.R15896830329318850690[16]);
                                        }
                                        if (r15896830329318850690M != null) {
                                            d3898906779921845663.b(r15896830329318850690M);
                                            r15896830329318850690M = null;
                                        }
                                        d3898906779921845663.b(r158968303293188506902);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        r15896830329318850690M = dev.epro.r0.R7033599853981556291.M(d3898906779921845663);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, dev.epro.r0.U9803441765912152712 u9803441765912152712) {
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = this.d;
        if (t17032536773975598836.c(j) && u9803441765912152712.g(this) < 0) {
            t17032536773975598836.l(j);
            this.e.e(j);
        }
        dev.epro.r0.D389890677992184566 d389890677992184566 = ((dev.epro.r0.N27869097736109461) this).a;
        java.lang.Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dev.epro.r0.B7467881838773648178) objArr[i2]).f(j, u9803441765912152712);
        }
    }

    public final java.lang.String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + ((dev.epro.r0.N27869097736109461) this).a + ", pointerIds=" + this.d + ")";
    }
}
