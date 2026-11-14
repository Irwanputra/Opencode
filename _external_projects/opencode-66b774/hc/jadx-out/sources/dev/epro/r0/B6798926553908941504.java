package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B6798926553908941504 {
    public final U9803441765912152712 a;
    public final Q5456326841214199073 b;
    public int c;
    public int d;
    public final int e;
    public final boolean f;
    public G1892398518770611911 g;

    public B6798926553908941504(B6798926553908941504 b6798926553908941504) {
        int i;
        if (b6798926553908941504 == null) {
            U9803441765912152712 u9803441765912152712 = new U9803441765912152712();
            this.a = u9803441765912152712;
            Q5456326841214199073 q5456326841214199073 = new Q5456326841214199073();
            this.b = q5456326841214199073;
            long jF = E686369837194379706.F(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false);
            int i2 = q5456326841214199073.b;
            q5456326841214199073.a(E686369837194379706.F(0, 0, false, false));
            q5456326841214199073.a(0L);
            q5456326841214199073.a(jF);
            q5456326841214199073.a(jF);
            u9803441765912152712.a(null);
            this.e = i2;
            this.d = i2;
            this.c = 0;
            this.f = true;
            return;
        }
        U9803441765912152712 u98034417659121527122 = new U9803441765912152712(b6798926553908941504.a.b);
        u98034417659121527122.b(b6798926553908941504.a);
        this.a = u98034417659121527122;
        Q5456326841214199073 q54563268412141990732 = new Q5456326841214199073(b6798926553908941504.b.b);
        Q5456326841214199073 q54563268412141990733 = b6798926553908941504.b;
        int i3 = q54563268412141990732.b;
        q54563268412141990733.getClass();
        if (i3 < 0 || i3 > (i = q54563268412141990732.b)) {
            W4415201450379021245.a("");
            throw null;
        }
        int i4 = q54563268412141990733.b;
        if (i4 != 0) {
            q54563268412141990732.b(i + i4);
            long[] jArr = q54563268412141990732.a;
            int i5 = q54563268412141990732.b;
            if (i3 != i5) {
                O5378677881740157249.q0(jArr, jArr, q54563268412141990733.b + i3, i3, i5);
            }
            O5378677881740157249.q0(q54563268412141990733.a, jArr, i3, 0, q54563268412141990733.b);
            q54563268412141990732.b += q54563268412141990733.b;
        }
        this.b = q54563268412141990732;
        this.e = b6798926553908941504.e;
        this.d = b6798926553908941504.d;
        this.c = b6798926553908941504.c;
        this.f = b6798926553908941504.f;
    }

    public final void a(int i) {
        int iH = this.d;
        int i2 = this.e;
        int i3 = i2;
        while (iH != i2) {
            i3 = iH;
            iH = m(i) <= m(iH) ? h(iH) : l(iH);
        }
        v(i, i3);
        if (i3 == i2) {
            this.d = i;
        } else if (m(i) <= m(i3)) {
            t(i3, i);
        } else {
            w(i3, i);
        }
        y(i3);
        while (i != this.d && f(k(i)) == 0) {
            int iK = k(k(i));
            if (k(i) == h(iK)) {
                int iL = l(iK);
                if (f(iL) == 0) {
                    s(iL, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == l(k(i))) {
                        i = k(i);
                        q(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    r(iK);
                }
            } else {
                int iH2 = h(iK);
                if (f(iH2) == 0) {
                    s(iH2, 1);
                    s(k(i), 1);
                    s(iK, 0);
                    i = iK;
                } else {
                    if (i == h(k(i))) {
                        i = k(i);
                        r(i);
                    }
                    s(k(i), 1);
                    s(iK, 0);
                    q(iK);
                }
            }
        }
        s(this.d, 1);
    }

    public final void b() {
        Q5456326841214199073 q5456326841214199073;
        if (this.c == 0) {
            return;
        }
        G1892398518770611911 g1892398518770611911O = o();
        g1892398518770611911O.b(p());
        int iP = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            q5456326841214199073 = this.b;
            if (i >= iP) {
                break;
            }
            if (E686369837194379706.O(q5456326841214199073.c(i * 4))) {
                i2++;
            }
            g1892398518770611911O.a((i - i2) * 4);
            i++;
        }
        this.d = g1892398518770611911O.c(this.d / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = q5456326841214199073.b;
            U9803441765912152712 u9803441765912152712 = this.a;
            if (i3 >= i5) {
                q5456326841214199073.d(i4, i5);
                int i6 = u9803441765912152712.b;
                u9803441765912152712.l(i6 - this.c, i6);
                this.c = 0;
                g1892398518770611911O.b = 0;
                return;
            }
            long jC = q5456326841214199073.c(i3);
            if (E686369837194379706.O(jC)) {
                i3 += 4;
            } else {
                if (i4 != i3) {
                    q5456326841214199073.e(i4, (jC & (-2147483648L)) | ((long) g1892398518770611911O.c(((int) (2147483647L & jC)) / 4)));
                    long jC2 = q5456326841214199073.c(i3 + 1);
                    q5456326841214199073.e(i4 + 1, (((long) g1892398518770611911O.c(((int) (jC2 >> 32)) / 4)) << 32) | (((long) g1892398518770611911O.c(((int) (jC2 & 4294967295L)) / 4)) & 4294967295L));
                    q5456326841214199073.e(i4 + 2, q5456326841214199073.c(i3 + 2));
                    q5456326841214199073.e(i4 + 3, q5456326841214199073.c(i3 + 3));
                    u9803441765912152712.n(i4 / 4, u9803441765912152712.f(i3 / 4));
                } else {
                    q5456326841214199073.e(i4, (jC & (-2147483648L)) | ((long) g1892398518770611911O.c(((int) (2147483647L & jC)) / 4)));
                    long jC3 = q5456326841214199073.c(i3 + 1);
                    q5456326841214199073.e(i4 + 1, (((long) g1892398518770611911O.c(((int) (jC3 >> 32)) / 4)) << 32) | (((long) g1892398518770611911O.c(((int) (jC3 & 4294967295L)) / 4)) & 4294967295L));
                }
                i3 += 4;
                i4 += 4;
            }
        }
    }

    public final void c() {
        if (p() <= 64 || this.c < p() / 2) {
            return;
        }
        b();
    }

    public final void d(int i) {
        int iK;
        int iH;
        int iK2;
        int iF = f(i);
        int iH2 = h(i);
        int i2 = this.e;
        if (iH2 == i2) {
            iH = l(i);
            iK = k(i);
            x(i, l(i));
            y(iK);
            y(i2);
        } else if (l(i) == i2) {
            iH = h(i);
            iK = k(i);
            x(i, h(i));
            y(iK);
            y(i2);
        } else {
            int iL = l(i);
            while (h(iL) != i2) {
                iL = h(iL);
            }
            int iF2 = f(iL);
            int iL2 = l(iL);
            if (k(iL) == i) {
                iK = iL;
            } else {
                iK = k(iL);
                x(iL, l(iL));
                w(iL, l(i));
                v(l(iL), iL);
            }
            t(iL, h(i));
            v(h(iL), iL);
            s(iL, f(i));
            u(iL, this.b.c(i + 3));
            x(i, iL);
            y(iK);
            y(iL);
            iF = iF2;
            iH = iL2;
        }
        if (iF == 1) {
            while (iH != this.d && f(iH) == 1) {
                if (iH == h(iK)) {
                    int iL3 = l(iK);
                    if (f(iL3) == 0) {
                        s(iL3, 1);
                        s(iK, 0);
                        q(iK);
                        iL3 = l(iK);
                    }
                    if (f(h(iL3)) == 1 && f(l(iL3)) == 1) {
                        s(iL3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(l(iL3)) == 1) {
                            s(h(iL3), 1);
                            s(iL3, 0);
                            r(iL3);
                            iL3 = l(iK);
                        }
                        s(iL3, f(iK));
                        s(iK, 1);
                        s(l(iL3), 1);
                        q(iK);
                        iH = this.d;
                    }
                } else {
                    int iH3 = h(iK);
                    if (f(iH3) == 0) {
                        s(iH3, 1);
                        s(iK, 0);
                        r(iK);
                        iH3 = h(iK);
                    }
                    if (f(l(iH3)) == 1 && f(h(iH3)) == 1) {
                        s(iH3, 0);
                        iK2 = k(iK);
                        iH = iK;
                        iK = iK2;
                    } else {
                        if (f(h(iH3)) == 1) {
                            s(l(iH3), 1);
                            s(iH3, 0);
                            q(iH3);
                            iH3 = h(iK);
                        }
                        s(iH3, f(iK));
                        s(iK, 1);
                        s(h(iH3), 1);
                        r(iK);
                        iH = this.d;
                    }
                }
            }
            s(iH, 1);
        }
    }

    public final void e(int i) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i, q5456326841214199073.c(i) | 2147483648L);
        this.c++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B6798926553908941504)) {
            return false;
        }
        int i = this.d + 3;
        Q5456326841214199073 q5456326841214199073 = this.b;
        long jC = q5456326841214199073.c(i);
        B6798926553908941504 b6798926553908941504 = (B6798926553908941504) obj;
        Q5456326841214199073 q54563268412141990732 = b6798926553908941504.b;
        if (jC != q54563268412141990732.c(b6798926553908941504.d + 3) || p() - this.c != b6798926553908941504.p() - b6798926553908941504.c) {
            return false;
        }
        int i2 = 4;
        int i3 = 4;
        while (i2 < q5456326841214199073.b && i3 < q54563268412141990732.b) {
            if (E686369837194379706.O(q5456326841214199073.c(i2))) {
                i2 += 4;
            } else {
                if (!E686369837194379706.O(q54563268412141990732.c(i3))) {
                    if (q5456326841214199073.c(i2 + 2) != q54563268412141990732.c(i3 + 2)) {
                        return false;
                    }
                    if (!S10823041268949770285.t(this.a.f(i2 / 4), b6798926553908941504.a.f(i3 / 4))) {
                        return false;
                    }
                    i2 += 4;
                }
                i3 += 4;
            }
        }
        return true;
    }

    public final int f(int i) {
        return !E686369837194379706.N(this.b.c(i)) ? 1 : 0;
    }

    public final int g(int i) {
        return (int) (n(i) & 2147483647L);
    }

    public final int h(int i) {
        return (int) (this.b.c(i + 1) >> 32);
    }

    public final int hashCode() {
        int i = 4;
        int iHashCode = 0;
        while (true) {
            Q5456326841214199073 q5456326841214199073 = this.b;
            if (i >= q5456326841214199073.b) {
                return iHashCode;
            }
            if (!E686369837194379706.O(q5456326841214199073.c(i))) {
                int iG = (g(i) + ((m(i) + (iHashCode * 31)) * 31)) * 31;
                Object objF = this.a.f(i / 4);
                iHashCode = iG + (objF != null ? objF.hashCode() : 0);
            }
            i += 4;
        }
    }

    public final int i(int i) {
        return (int) (this.b.c(i + 3) & 2147483647L);
    }

    public final int j(int i) {
        return E686369837194379706.P(this.b.c(i + 3));
    }

    public final int k(int i) {
        return (int) (this.b.c(i) & 2147483647L);
    }

    public final int l(int i) {
        return (int) (this.b.c(i + 1) & 4294967295L);
    }

    public final int m(int i) {
        return E686369837194379706.P(n(i));
    }

    public final long n(int i) {
        return this.b.c(i + 2);
    }

    public final G1892398518770611911 o() {
        G1892398518770611911 g1892398518770611911 = this.g;
        if (g1892398518770611911 != null) {
            return g1892398518770611911;
        }
        G1892398518770611911 g18923985187706119112 = new G1892398518770611911();
        this.g = g18923985187706119112;
        return g18923985187706119112;
    }

    public final int p() {
        return this.b.b / 4;
    }

    public final void q(int i) {
        int iL = l(i);
        w(i, h(iL));
        int iH = h(iL);
        int i2 = this.e;
        if (iH != i2) {
            v(h(iL), i);
        }
        v(iL, k(i));
        if (k(i) == i2) {
            this.d = iL;
        } else if (h(k(i)) == i) {
            t(k(i), iL);
        } else {
            w(k(i), iL);
        }
        t(iL, i);
        v(i, iL);
        y(i);
        y(k(i));
    }

    public final void r(int i) {
        int iH = h(i);
        t(i, l(iH));
        int iL = l(iH);
        int i2 = this.e;
        if (iL != i2) {
            v(l(iH), i);
        }
        v(iH, k(i));
        if (k(i) == i2) {
            this.d = iH;
        } else if (l(k(i)) == i) {
            w(k(i), iH);
        } else {
            t(k(i), iH);
        }
        w(iH, i);
        v(i, iH);
        y(i);
        y(k(i));
    }

    public final void s(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        long jC = q5456326841214199073.c(i);
        q5456326841214199073.e(i, i2 == 0 ? jC | Long.MIN_VALUE : jC & Long.MAX_VALUE);
    }

    public final void t(int i, int i2) {
        int i3 = i + 1;
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i3, (((long) ((int) (q5456326841214199073.c(i3) & 4294967295L))) & 4294967295L) | (((long) i2) << 32));
    }

    public final void u(int i, long j) {
        this.b.e(i + 3, j);
    }

    public final void v(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i, (q5456326841214199073.c(i) & (-2147483648L)) | ((long) i2));
    }

    public final void w(int i, int i2) {
        int i3 = i + 1;
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i3, (((long) ((int) (q5456326841214199073.c(i3) >> 32))) << 32) | (((long) i2) & 4294967295L));
    }

    public final void x(int i, int i2) {
        if (i == i2) {
            return;
        }
        int iK = k(i);
        int i3 = this.e;
        if (iK == i3) {
            this.d = i2;
        } else if (i == h(k(i))) {
            t(k(i), i2);
        } else {
            w(k(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        v(i2, k(i));
    }

    public final void y(int i) {
        while (i != this.e) {
            long jC = this.b.c(i + 3);
            int iMin = Math.min(m(i), Math.min(j(h(i)), j(l(i))));
            int iMax = Math.max(g(i), Math.max(i(h(i)), i(l(i))));
            if (E686369837194379706.P(jC) == iMin && ((int) (jC & 2147483647L)) == iMax) {
                return;
            }
            u(i, E686369837194379706.F(iMin, iMax, false, false));
            i = k(i);
        }
    }
}
