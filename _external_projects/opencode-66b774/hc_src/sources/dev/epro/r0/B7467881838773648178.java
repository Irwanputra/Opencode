package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B7467881838773648178 extends N27869097736109461 {
    public final R15896830329318850690 c;
    public final T17032536773975598836 d;
    public final A18377563779865231301 e;
    public Y4989033692226475498 f;
    public Y1086209215650239921 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public B7467881838773648178(R15896830329318850690 r15896830329318850690) {
        this.c = r15896830329318850690;
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.b = new long[2];
        this.d = t17032536773975598836;
        this.e = new A18377563779865231301(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // dev.epro.r0.N27869097736109461
    public final boolean a(A18377563779865231301 a18377563779865231301, B1029012102904255937 b1029012102904255937, N10542843603712830247 n10542843603712830247, boolean z) {
        T17032536773975598836 t17032536773975598836;
        A18377563779865231301 a183775637798652313012;
        Object obj;
        boolean z2;
        boolean z3;
        Y1086209215650239921 y1086209215650239921;
        boolean z4;
        int i;
        int i2;
        boolean z5;
        int i3;
        boolean z6;
        int i4;
        int i5;
        N13196868278329319633 n13196868278329319633;
        B1029012102904255937 b10290121029042559372 = b1029012102904255937;
        boolean a = super.a(a18377563779865231301, b1029012102904255937, n10542843603712830247, z);
        J2215566372910931965 j2215566372910931965 = this.c;
        boolean z7 = true;
        if (j2215566372910931965.n) {
            ?? r8 = 0;
            while (j2215566372910931965 != 0) {
                if (j2215566372910931965 instanceof B18307494358031290147) {
                    this.f = R7033599853981556291.P((B18307494358031290147) j2215566372910931965, 16);
                } else if ((j2215566372910931965.c & 16) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                    R15896830329318850690 r15896830329318850690 = j2215566372910931965.p;
                    int i6 = 0;
                    j2215566372910931965 = j2215566372910931965;
                    r8 = r8;
                    while (r15896830329318850690 != null) {
                        if ((r15896830329318850690.c & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                j2215566372910931965 = r15896830329318850690;
                            } else {
                                if (r8 == 0) {
                                    r8 = new D389890677992184566(0, new R15896830329318850690[16]);
                                }
                                if (j2215566372910931965 != 0) {
                                    r8.b(j2215566372910931965);
                                    j2215566372910931965 = 0;
                                }
                                r8.b(r15896830329318850690);
                            }
                        }
                        r15896830329318850690 = r15896830329318850690.f;
                        j2215566372910931965 = j2215566372910931965;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                j2215566372910931965 = R7033599853981556291.M(r8);
            }
            if (this.f != null) {
                int f = a18377563779865231301.f();
                int i7 = 0;
                while (true) {
                    t17032536773975598836 = this.d;
                    a183775637798652313012 = this.e;
                    if (i7 >= f) {
                        break;
                    }
                    long c = a18377563779865231301.c(i7);
                    N13196868278329319633 n131968682783293196332 = (N13196868278329319633) a18377563779865231301.g(i7);
                    if (t17032536773975598836.c(c)) {
                        boolean z8 = z7;
                        long j = n131968682783293196332.g;
                        long j2 = n131968682783293196332.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z6 = z8;
                            z5 = a;
                            ArrayList arrayList = new ArrayList(n131968682783293196332.b().size());
                            List b = n131968682783293196332.b();
                            i3 = f;
                            int size = b.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list = b;
                                H18070649131661950539 h18070649131661950539 = (H18070649131661950539) b.get(i8);
                                A18377563779865231301 a183775637798652313013 = a183775637798652313012;
                                long j3 = c;
                                long j4 = h18070649131661950539.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    n13196868278329319633 = n131968682783293196332;
                                    long j5 = h18070649131661950539.a;
                                    i5 = size;
                                    Y4989033692226475498 y4989033692226475498 = this.f;
                                    y4989033692226475498.getClass();
                                    arrayList.add(new H18070649131661950539(j5, y4989033692226475498.h(b10290121029042559372, j4), h18070649131661950539.c, h18070649131661950539.d, h18070649131661950539.e));
                                } else {
                                    i5 = size;
                                    n13196868278329319633 = n131968682783293196332;
                                }
                                i8++;
                                size = i5;
                                b = list;
                                a183775637798652313012 = a183775637798652313013;
                                c = j3;
                                n131968682783293196332 = n13196868278329319633;
                            }
                            A18377563779865231301 a183775637798652313014 = a183775637798652313012;
                            long j6 = c;
                            Y4989033692226475498 y49890336922264754982 = this.f;
                            y49890336922264754982.getClass();
                            long h = y49890336922264754982.h(b10290121029042559372, j);
                            Y4989033692226475498 y49890336922264754983 = this.f;
                            y49890336922264754983.getClass();
                            N13196868278329319633 n131968682783293196333 = new N13196868278329319633(n131968682783293196332.a, n131968682783293196332.b, y49890336922264754983.h(b10290121029042559372, j2), n131968682783293196332.d, n131968682783293196332.e, n131968682783293196332.f, h, n131968682783293196332.h, n131968682783293196332.i, arrayList, n131968682783293196332.j, n131968682783293196332.k, n131968682783293196332.l, n131968682783293196332.n);
                            N13196868278329319633 n131968682783293196334 = n131968682783293196332.q;
                            if (n131968682783293196334 == null) {
                                n131968682783293196334 = n131968682783293196332;
                            }
                            n131968682783293196333.q = n131968682783293196334;
                            N13196868278329319633 n131968682783293196335 = n131968682783293196332.q;
                            if (n131968682783293196335 != null) {
                                n131968682783293196332 = n131968682783293196335;
                            }
                            n131968682783293196333.q = n131968682783293196332;
                            a183775637798652313014.d(j6, n131968682783293196333);
                        } else {
                            z5 = a;
                            i3 = f;
                            i4 = i7;
                            z6 = z8;
                        }
                    } else {
                        z5 = a;
                        i3 = f;
                        z6 = z7;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    b10290121029042559372 = b1029012102904255937;
                    z7 = z6;
                    f = i3;
                    a = z5;
                }
                boolean z9 = a;
                boolean z10 = z7;
                if (a183775637798652313012.f() == 0) {
                    t17032536773975598836.a = 0;
                    this.a.i();
                    return z10;
                }
                int i9 = t17032536773975598836.a;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) t17032536773975598836.b)[i9];
                    if (a18377563779865231301.a) {
                        int i10 = a18377563779865231301.d;
                        long[] jArr = a18377563779865231301.b;
                        Object[] objArr = a18377563779865231301.c;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != U16229988784104357932.g) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        a18377563779865231301.a = false;
                        a18377563779865231301.d = i11;
                    }
                    if (I3887072968740112330.p(a18377563779865231301.b, a18377563779865231301.d, j7) < 0 && i9 < (i2 = t17032536773975598836.a)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) t17032536773975598836.b;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        t17032536773975598836.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(a183775637798652313012.f());
                int f2 = a183775637798652313012.f();
                for (int i16 = 0; i16 < f2; i16++) {
                    arrayList2.add(a183775637798652313012.g(i16));
                }
                Y1086209215650239921 y10862092156502399212 = new Y1086209215650239921(arrayList2, n10542843603712830247);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (n10542843603712830247.a(((N13196868278329319633) obj).a)) {
                        break;
                    }
                    i17++;
                }
                N13196868278329319633 n131968682783293196336 = (N13196868278329319633) obj;
                if (n131968682783293196336 != null) {
                    boolean z11 = n131968682783293196336.d;
                    if (z) {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z11 || n131968682783293196336.h)) {
                            Y4989033692226475498 y49890336922264754984 = this.f;
                            y49890336922264754984.getClass();
                            long j8 = y49890336922264754984.c;
                            long j9 = n131968682783293196336.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            z4 = !((intBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z10 : false) | (intBitsToFloat2 < 0.0f ? z10 : false) | (intBitsToFloat > ((float) i18) ? z10 : false) | (intBitsToFloat < 0.0f ? z10 : false));
                            this.i = z4;
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    }
                    boolean z12 = this.h;
                    if (z4 == z12 || !((i = y10862092156502399212.f) == 3 || i == 4 || i == 5)) {
                        int i19 = y10862092156502399212.f;
                        if (i19 == 4 && z12 && !this.j) {
                            y10862092156502399212.f = 3;
                        } else if (i19 == 5 && z4 && z11) {
                            y10862092156502399212.f = 3;
                        }
                    } else {
                        y10862092156502399212.f = z4 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z9 && y10862092156502399212.f == 3 && (y1086209215650239921 = this.g) != null) {
                    ?? r1 = y1086209215650239921.a;
                    int size3 = r1.size();
                    ?? r4 = y10862092156502399212.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (L2216691091636065972.b(((N13196868278329319633) r1.get(r5)).c, ((N13196868278329319633) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = y10862092156502399212;
                        return z3;
                    }
                }
                z3 = z10;
                this.g = y10862092156502399212;
                return z3;
            }
        }
        return true;
    }

    @Override // dev.epro.r0.N27869097736109461
    public final void b(N10542843603712830247 n10542843603712830247) {
        super.b(n10542843603712830247);
        Y1086209215650239921 y1086209215650239921 = this.g;
        if (y1086209215650239921 == null) {
            return;
        }
        this.h = this.i;
        List list = y1086209215650239921.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            N13196868278329319633 n13196868278329319633 = (N13196868278329319633) list.get(i);
            boolean z = n13196868278329319633.d;
            long j = n13196868278329319633.a;
            boolean a = n10542843603712830247.a(j);
            boolean z2 = this.i;
            if ((!z && !a) || (!z && !z2)) {
                this.d.l(j);
            }
        }
        this.i = false;
        this.j = y1086209215650239921.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        D389890677992184566 d389890677992184566 = this.a;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((B7467881838773648178) objArr[i2]).c();
        }
        J2215566372910931965 j2215566372910931965 = this.c;
        ?? r1 = 0;
        while (j2215566372910931965 != 0) {
            if (j2215566372910931965 instanceof B18307494358031290147) {
                ((B18307494358031290147) j2215566372910931965).x0();
            } else if ((j2215566372910931965.c & 16) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                R15896830329318850690 r15896830329318850690 = j2215566372910931965.p;
                int i3 = 0;
                r1 = r1;
                j2215566372910931965 = j2215566372910931965;
                while (r15896830329318850690 != null) {
                    if ((r15896830329318850690.c & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            j2215566372910931965 = r15896830329318850690;
                        } else {
                            if (r1 == 0) {
                                r1 = new D389890677992184566(0, new R15896830329318850690[16]);
                            }
                            if (j2215566372910931965 != 0) {
                                r1.b(j2215566372910931965);
                                j2215566372910931965 = 0;
                            }
                            r1.b(r15896830329318850690);
                        }
                    }
                    r15896830329318850690 = r15896830329318850690.f;
                    r1 = r1;
                    j2215566372910931965 = j2215566372910931965;
                }
                if (i3 == 1) {
                }
            }
            j2215566372910931965 = R7033599853981556291.M(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(N10542843603712830247 n10542843603712830247) {
        H11725168162114556860 h11725168162114556860;
        A18377563779865231301 a18377563779865231301 = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (a18377563779865231301.f() != 0) {
            R15896830329318850690 r15896830329318850690 = this.c;
            if (r15896830329318850690.n) {
                Y4989033692226475498 y4989033692226475498 = r15896830329318850690.h;
                if ((y4989033692226475498 == null || (h11725168162114556860 = y4989033692226475498.u) == null) ? false : h11725168162114556860.I()) {
                    Y1086209215650239921 y1086209215650239921 = this.g;
                    y1086209215650239921.getClass();
                    Y4989033692226475498 y49890336922264754982 = this.f;
                    y49890336922264754982.getClass();
                    long j = y49890336922264754982.c;
                    J2215566372910931965 j2215566372910931965 = r15896830329318850690;
                    ?? r8 = 0;
                    while (j2215566372910931965 != 0) {
                        if (j2215566372910931965 instanceof B18307494358031290147) {
                            ((B18307494358031290147) j2215566372910931965).n0(y1086209215650239921, J17191566391535857141.c, j);
                        } else if ((j2215566372910931965.c & 16) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                            R15896830329318850690 r158968303293188506902 = j2215566372910931965.p;
                            int i = 0;
                            j2215566372910931965 = j2215566372910931965;
                            r8 = r8;
                            while (r158968303293188506902 != null) {
                                if ((r158968303293188506902.c & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        j2215566372910931965 = r158968303293188506902;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (j2215566372910931965 != 0) {
                                            r8.b(j2215566372910931965);
                                            j2215566372910931965 = 0;
                                        }
                                        r8.b(r158968303293188506902);
                                    }
                                }
                                r158968303293188506902 = r158968303293188506902.f;
                                j2215566372910931965 = j2215566372910931965;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        j2215566372910931965 = R7033599853981556291.M(r8);
                    }
                    if (r15896830329318850690.n) {
                        D389890677992184566 d389890677992184566 = this.a;
                        Object[] objArr = d389890677992184566.a;
                        int i2 = d389890677992184566.c;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((B7467881838773648178) objArr[i3]).d(n10542843603712830247);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r6v10, types: [dev.epro.r0.R15896830329318850690] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [dev.epro.r0.D389890677992184566] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(N10542843603712830247 n10542843603712830247, boolean z) {
        H11725168162114556860 h11725168162114556860;
        if (this.e.f() == 0) {
            return false;
        }
        J2215566372910931965 j2215566372910931965 = this.c;
        if (j2215566372910931965.n) {
            Y4989033692226475498 y4989033692226475498 = j2215566372910931965.h;
            if ((y4989033692226475498 == null || (h11725168162114556860 = y4989033692226475498.u) == null) ? false : h11725168162114556860.I()) {
                Y1086209215650239921 y1086209215650239921 = this.g;
                y1086209215650239921.getClass();
                Y4989033692226475498 y49890336922264754982 = this.f;
                y49890336922264754982.getClass();
                long j = y49890336922264754982.c;
                J2215566372910931965 j22155663729109319652 = j2215566372910931965;
                ?? r7 = 0;
                while (j22155663729109319652 != 0) {
                    if (j22155663729109319652 instanceof B18307494358031290147) {
                        ((B18307494358031290147) j22155663729109319652).n0(y1086209215650239921, J17191566391535857141.a, j);
                    } else if ((j22155663729109319652.c & 16) != 0 && (j22155663729109319652 instanceof J2215566372910931965)) {
                        R15896830329318850690 r15896830329318850690 = j22155663729109319652.p;
                        int i = 0;
                        j22155663729109319652 = j22155663729109319652;
                        r7 = r7;
                        while (r15896830329318850690 != null) {
                            if ((r15896830329318850690.c & 16) != 0) {
                                i++;
                                r7 = r7;
                                if (i == 1) {
                                    j22155663729109319652 = r15896830329318850690;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new D389890677992184566(0, new R15896830329318850690[16]);
                                    }
                                    if (j22155663729109319652 != 0) {
                                        r7.b(j22155663729109319652);
                                        j22155663729109319652 = 0;
                                    }
                                    r7.b(r15896830329318850690);
                                }
                            }
                            r15896830329318850690 = r15896830329318850690.f;
                            j22155663729109319652 = j22155663729109319652;
                            r7 = r7;
                        }
                        if (i == 1) {
                        }
                    }
                    j22155663729109319652 = R7033599853981556291.M(r7);
                }
                if (j2215566372910931965.n) {
                    D389890677992184566 d389890677992184566 = this.a;
                    Object[] objArr = d389890677992184566.a;
                    int i2 = d389890677992184566.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        B7467881838773648178 b7467881838773648178 = (B7467881838773648178) objArr[i3];
                        this.f.getClass();
                        b7467881838773648178.e(n10542843603712830247, z);
                    }
                }
                if (j2215566372910931965.n) {
                    ?? r13 = 0;
                    while (j2215566372910931965 != 0) {
                        if (j2215566372910931965 instanceof B18307494358031290147) {
                            ((B18307494358031290147) j2215566372910931965).n0(y1086209215650239921, J17191566391535857141.b, j);
                        } else if ((j2215566372910931965.c & 16) != 0 && (j2215566372910931965 instanceof J2215566372910931965)) {
                            R15896830329318850690 r158968303293188506902 = j2215566372910931965.p;
                            int i4 = 0;
                            j2215566372910931965 = j2215566372910931965;
                            r13 = r13;
                            while (r158968303293188506902 != null) {
                                if ((r158968303293188506902.c & 16) != 0) {
                                    i4++;
                                    r13 = r13;
                                    if (i4 == 1) {
                                        j2215566372910931965 = r158968303293188506902;
                                    } else {
                                        if (r13 == 0) {
                                            r13 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (j2215566372910931965 != 0) {
                                            r13.b(j2215566372910931965);
                                            j2215566372910931965 = 0;
                                        }
                                        r13.b(r158968303293188506902);
                                    }
                                }
                                r158968303293188506902 = r158968303293188506902.f;
                                j2215566372910931965 = j2215566372910931965;
                                r13 = r13;
                            }
                            if (i4 == 1) {
                            }
                        }
                        j2215566372910931965 = R7033599853981556291.M(r13);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, U9803441765912152712 u9803441765912152712) {
        T17032536773975598836 t17032536773975598836 = this.d;
        if (t17032536773975598836.c(j) && u9803441765912152712.g(this) < 0) {
            t17032536773975598836.l(j);
            this.e.e(j);
        }
        D389890677992184566 d389890677992184566 = this.a;
        Object[] objArr = d389890677992184566.a;
        int i = d389890677992184566.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((B7467881838773648178) objArr[i2]).f(j, u9803441765912152712);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
