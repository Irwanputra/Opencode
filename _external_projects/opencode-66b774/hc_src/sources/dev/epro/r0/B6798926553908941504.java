package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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
            long F = E686369837194379706.F(Integer.MAX_VALUE, Integer.MIN_VALUE, false, false);
            int i2 = q5456326841214199073.b;
            q5456326841214199073.a(E686369837194379706.F(0, 0, false, false));
            q5456326841214199073.a(0L);
            q5456326841214199073.a(F);
            q5456326841214199073.a(F);
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
        int i2 = this.d;
        int i3 = this.e;
        int i4 = i3;
        while (i2 != i3) {
            i4 = i2;
            i2 = m(i) <= m(i2) ? h(i2) : l(i2);
        }
        v(i, i4);
        if (i4 == i3) {
            this.d = i;
        } else if (m(i) <= m(i4)) {
            t(i4, i);
        } else {
            w(i4, i);
        }
        y(i4);
        while (i != this.d && f(k(i)) == 0) {
            int k = k(k(i));
            if (k(i) == h(k)) {
                int l = l(k);
                if (f(l) == 0) {
                    s(l, 1);
                    s(k(i), 1);
                    s(k, 0);
                    i = k;
                } else {
                    if (i == l(k(i))) {
                        i = k(i);
                        q(i);
                    }
                    s(k(i), 1);
                    s(k, 0);
                    r(k);
                }
            } else {
                int h = h(k);
                if (f(h) == 0) {
                    s(h, 1);
                    s(k(i), 1);
                    s(k, 0);
                    i = k;
                } else {
                    if (i == h(k(i))) {
                        i = k(i);
                        r(i);
                    }
                    s(k(i), 1);
                    s(k, 0);
                    q(k);
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
        G1892398518770611911 o2 = o();
        o2.b(p());
        int p = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            q5456326841214199073 = this.b;
            if (i >= p) {
                break;
            }
            if (E686369837194379706.O(q5456326841214199073.c(i * 4))) {
                i2++;
            }
            o2.a((i - i2) * 4);
            i++;
        }
        this.d = o2.c(this.d / 4);
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
                o2.b = 0;
                return;
            }
            long c = q5456326841214199073.c(i3);
            if (E686369837194379706.O(c)) {
                i3 += 4;
            } else {
                if (i4 != i3) {
                    q5456326841214199073.e(i4, (c & (-2147483648L)) | o2.c(((int) (2147483647L & c)) / 4));
                    long c2 = q5456326841214199073.c(i3 + 1);
                    q5456326841214199073.e(i4 + 1, (o2.c(((int) (c2 >> 32)) / 4) << 32) | (o2.c(((int) (c2 & 4294967295L)) / 4) & 4294967295L));
                    q5456326841214199073.e(i4 + 2, q5456326841214199073.c(i3 + 2));
                    q5456326841214199073.e(i4 + 3, q5456326841214199073.c(i3 + 3));
                    u9803441765912152712.n(i4 / 4, u9803441765912152712.f(i3 / 4));
                } else {
                    q5456326841214199073.e(i4, (c & (-2147483648L)) | o2.c(((int) (2147483647L & c)) / 4));
                    long c3 = q5456326841214199073.c(i3 + 1);
                    q5456326841214199073.e(i4 + 1, (o2.c(((int) (c3 >> 32)) / 4) << 32) | (o2.c(((int) (c3 & 4294967295L)) / 4) & 4294967295L));
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
        int k;
        int i2;
        int k2;
        int f = f(i);
        int h = h(i);
        int i3 = this.e;
        if (h == i3) {
            i2 = l(i);
            k = k(i);
            x(i, l(i));
            y(k);
            y(i3);
        } else if (l(i) == i3) {
            i2 = h(i);
            k = k(i);
            x(i, h(i));
            y(k);
            y(i3);
        } else {
            int l = l(i);
            while (h(l) != i3) {
                l = h(l);
            }
            int f2 = f(l);
            int l2 = l(l);
            if (k(l) == i) {
                k = l;
            } else {
                k = k(l);
                x(l, l(l));
                w(l, l(i));
                v(l(l), l);
            }
            t(l, h(i));
            v(h(l), l);
            s(l, f(i));
            u(l, this.b.c(i + 3));
            x(i, l);
            y(k);
            y(l);
            f = f2;
            i2 = l2;
        }
        if (f == 1) {
            while (i2 != this.d && f(i2) == 1) {
                if (i2 == h(k)) {
                    int l3 = l(k);
                    if (f(l3) == 0) {
                        s(l3, 1);
                        s(k, 0);
                        q(k);
                        l3 = l(k);
                    }
                    if (f(h(l3)) == 1 && f(l(l3)) == 1) {
                        s(l3, 0);
                        k2 = k(k);
                        i2 = k;
                        k = k2;
                    } else {
                        if (f(l(l3)) == 1) {
                            s(h(l3), 1);
                            s(l3, 0);
                            r(l3);
                            l3 = l(k);
                        }
                        s(l3, f(k));
                        s(k, 1);
                        s(l(l3), 1);
                        q(k);
                        i2 = this.d;
                    }
                } else {
                    int h2 = h(k);
                    if (f(h2) == 0) {
                        s(h2, 1);
                        s(k, 0);
                        r(k);
                        h2 = h(k);
                    }
                    if (f(l(h2)) == 1 && f(h(h2)) == 1) {
                        s(h2, 0);
                        k2 = k(k);
                        i2 = k;
                        k = k2;
                    } else {
                        if (f(h(h2)) == 1) {
                            s(l(h2), 1);
                            s(h2, 0);
                            q(h2);
                            h2 = h(k);
                        }
                        s(h2, f(k));
                        s(k, 1);
                        s(h(h2), 1);
                        r(k);
                        i2 = this.d;
                    }
                }
            }
            s(i2, 1);
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
        long c = q5456326841214199073.c(i);
        B6798926553908941504 b6798926553908941504 = (B6798926553908941504) obj;
        Q5456326841214199073 q54563268412141990732 = b6798926553908941504.b;
        if (c != q54563268412141990732.c(b6798926553908941504.d + 3) || p() - this.c != b6798926553908941504.p() - b6798926553908941504.c) {
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
        int i2 = 0;
        while (true) {
            Q5456326841214199073 q5456326841214199073 = this.b;
            if (i >= q5456326841214199073.b) {
                return i2;
            }
            if (!E686369837194379706.O(q5456326841214199073.c(i))) {
                int g = (g(i) + ((m(i) + (i2 * 31)) * 31)) * 31;
                Object f = this.a.f(i / 4);
                i2 = g + (f != null ? f.hashCode() : 0);
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
        int l = l(i);
        w(i, h(l));
        int h = h(l);
        int i2 = this.e;
        if (h != i2) {
            v(h(l), i);
        }
        v(l, k(i));
        if (k(i) == i2) {
            this.d = l;
        } else if (h(k(i)) == i) {
            t(k(i), l);
        } else {
            w(k(i), l);
        }
        t(l, i);
        v(i, l);
        y(i);
        y(k(i));
    }

    public final void r(int i) {
        int h = h(i);
        t(i, l(h));
        int l = l(h);
        int i2 = this.e;
        if (l != i2) {
            v(l(h), i);
        }
        v(h, k(i));
        if (k(i) == i2) {
            this.d = h;
        } else if (l(k(i)) == i) {
            w(k(i), h);
        } else {
            t(k(i), h);
        }
        w(h, i);
        v(i, h);
        y(i);
        y(k(i));
    }

    public final void s(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        long c = q5456326841214199073.c(i);
        q5456326841214199073.e(i, i2 == 0 ? c | Long.MIN_VALUE : c & Long.MAX_VALUE);
    }

    public final void t(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i + 1, (((int) (q5456326841214199073.c(r7) & 4294967295L)) & 4294967295L) | (i2 << 32));
    }

    public final void u(int i, long j) {
        this.b.e(i + 3, j);
    }

    public final void v(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i, (q5456326841214199073.c(i) & (-2147483648L)) | i2);
    }

    public final void w(int i, int i2) {
        Q5456326841214199073 q5456326841214199073 = this.b;
        q5456326841214199073.e(i + 1, (((int) (q5456326841214199073.c(r7) >> 32)) << 32) | (i2 & 4294967295L));
    }

    public final void x(int i, int i2) {
        if (i == i2) {
            return;
        }
        int k = k(i);
        int i3 = this.e;
        if (k == i3) {
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
            long c = this.b.c(i + 3);
            int min = Math.min(m(i), Math.min(j(h(i)), j(l(i))));
            int max = Math.max(g(i), Math.max(i(h(i)), i(l(i))));
            if (E686369837194379706.P(c) == min && ((int) (c & 2147483647L)) == max) {
                return;
            }
            u(i, E686369837194379706.F(min, max, false, false));
            i = k(i);
        }
    }
}
