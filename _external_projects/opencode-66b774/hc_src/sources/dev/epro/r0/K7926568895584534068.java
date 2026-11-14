package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K7926568895584534068 {
    public final M11181104712105445833 a;
    public final long b;
    public final Q17957571128037780363 c;
    public final R17143752899285419206 d;
    public final Z10216649008126070808 e;
    public long f;
    public final M11181104712105445833 g;
    public final F13241018602672925865 h;
    public final N17980339148608222959 i;

    public K7926568895584534068(F13241018602672925865 f13241018602672925865, R17143752899285419206 r17143752899285419206, N17980339148608222959 n17980339148608222959, Z10216649008126070808 z10216649008126070808) {
        M11181104712105445833 m11181104712105445833 = f13241018602672925865.a;
        long j = f13241018602672925865.b;
        Q17957571128037780363 q17957571128037780363 = n17980339148608222959 != null ? n17980339148608222959.a : null;
        this.a = m11181104712105445833;
        this.b = j;
        this.c = q17957571128037780363;
        this.d = r17143752899285419206;
        this.e = z10216649008126070808;
        this.f = j;
        this.g = m11181104712105445833;
        this.h = f13241018602672925865;
        this.i = n17980339148608222959;
    }

    public final List a(F4096073349764486348 f4096073349764486348) {
        if (!F12478849263529740365.d(this.f)) {
            return K5751602218013079365.V(new J14617885194716764421("", 0), new D4827454800931329865(F12478849263529740365.g(this.f), F12478849263529740365.g(this.f)));
        }
        C2322693828285680440 c2322693828285680440 = (C2322693828285680440) f4096073349764486348.invoke(this);
        if (c2322693828285680440 != null) {
            return K5751602218013079365.U(c2322693828285680440);
        }
        return null;
    }

    public final Integer b() {
        Q17957571128037780363 q17957571128037780363 = this.c;
        if (q17957571128037780363 == null) {
            return null;
        }
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        int f = F12478849263529740365.f(this.f);
        R17143752899285419206 r17143752899285419206 = this.d;
        return Integer.valueOf(r17143752899285419206.p(v11538895333762958192.c(v11538895333762958192.d(r17143752899285419206.s(f)), true)));
    }

    public final Integer c() {
        Q17957571128037780363 q17957571128037780363 = this.c;
        if (q17957571128037780363 == null) {
            return null;
        }
        int g = F12478849263529740365.g(this.f);
        R17143752899285419206 r17143752899285419206 = this.d;
        return Integer.valueOf(r17143752899285419206.p(q17957571128037780363.h(q17957571128037780363.b.d(r17143752899285419206.s(g)))));
    }

    public final Integer d() {
        int length;
        Q17957571128037780363 q17957571128037780363 = this.c;
        if (q17957571128037780363 == null) {
            return null;
        }
        int r = r();
        while (true) {
            M11181104712105445833 m11181104712105445833 = this.a;
            if (r < m11181104712105445833.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long k = q17957571128037780363.k(length2);
                int i = F12478849263529740365.c;
                int i2 = (int) (k & 4294967295L);
                if (i2 > r) {
                    length = this.d.p(i2);
                    break;
                }
                r++;
            } else {
                length = m11181104712105445833.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        Q17957571128037780363 q17957571128037780363 = this.c;
        if (q17957571128037780363 == null) {
            return null;
        }
        int r = r();
        while (true) {
            if (r <= 0) {
                i = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (r <= length) {
                length = r;
            }
            long k = q17957571128037780363.k(length);
            int i2 = F12478849263529740365.c;
            int i3 = (int) (k >> 32);
            if (i3 < r) {
                i = this.d.p(i3);
                break;
            }
            r--;
        }
        return Integer.valueOf(i);
    }

    public final boolean f() {
        Q17957571128037780363 q17957571128037780363 = this.c;
        return (q17957571128037780363 != null ? q17957571128037780363.i(r()) : null) != O16392062884302746898.b;
    }

    public final int g(Q17957571128037780363 q17957571128037780363, int i) {
        int r = r();
        Z10216649008126070808 z10216649008126070808 = this.e;
        if (z10216649008126070808.a == null) {
            z10216649008126070808.a = Float.valueOf(q17957571128037780363.c(r).a);
        }
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        int d = v11538895333762958192.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= v11538895333762958192.f) {
            return this.g.b.length();
        }
        float b = v11538895333762958192.b(d) - 1.0f;
        Float f = z10216649008126070808.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= q17957571128037780363.g(d)) || (!f() && floatValue <= q17957571128037780363.f(d))) {
            return v11538895333762958192.c(d, true);
        }
        return this.d.p(v11538895333762958192.g((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(dev.epro.r0.N17980339148608222959 r9, int r10) {
        /*
            r8 = this;
            dev.epro.r0.B1029012102904255937 r0 = r9.b
            dev.epro.r0.Q17957571128037780363 r1 = r9.a
            if (r0 == 0) goto L13
            dev.epro.r0.B1029012102904255937 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            dev.epro.r0.S6349823729575121924 r9 = r9.E(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            dev.epro.r0.S6349823729575121924 r9 = dev.epro.r0.S6349823729575121924.e
        L15:
            dev.epro.r0.F13241018602672925865 r0 = r8.h
            long r2 = r0.b
            int r0 = dev.epro.r0.F12478849263529740365.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            dev.epro.r0.R17143752899285419206 r8 = r8.d
            int r0 = r8.s(r0)
            dev.epro.r0.S6349823729575121924 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.e()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            dev.epro.r0.V11538895333762958192 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.p(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K7926568895584534068.h(dev.epro.r0.N17980339148608222959, int):int");
    }

    public final void i() {
        Z10216649008126070808 z10216649008126070808 = this.e;
        z10216649008126070808.a = null;
        M11181104712105445833 m11181104712105445833 = this.g;
        if (m11181104712105445833.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            z10216649008126070808.a = null;
            if (m11181104712105445833.b.length() > 0) {
                String str = m11181104712105445833.b;
                long j = this.f;
                int i = F12478849263529740365.c;
                int m = Z14316276734425062790.m((int) (j & 4294967295L), str);
                if (m != -1) {
                    q(m, m);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        M11181104712105445833 m11181104712105445833 = this.g;
        String str = m11181104712105445833.b;
        String str2 = m11181104712105445833.b;
        if (str.length() > 0) {
            int g = O17574792317020433029.g(str2, F12478849263529740365.f(this.f));
            if (g == F12478849263529740365.f(this.f) && g != str2.length()) {
                g = O17574792317020433029.g(str2, g + 1);
            }
            q(g, g);
        }
    }

    public final void k() {
        this.e.a = null;
        M11181104712105445833 m11181104712105445833 = this.g;
        if (m11181104712105445833.b.length() > 0) {
            String str = m11181104712105445833.b;
            long j = this.f;
            int i = F12478849263529740365.c;
            int n = Z14316276734425062790.n((int) (j & 4294967295L), str);
            if (n != -1) {
                q(n, n);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        M11181104712105445833 m11181104712105445833 = this.g;
        String str = m11181104712105445833.b;
        String str2 = m11181104712105445833.b;
        if (str.length() > 0) {
            int h = O17574792317020433029.h(str2, F12478849263529740365.g(this.f));
            if (h == F12478849263529740365.g(this.f) && h != 0) {
                h = O17574792317020433029.h(str2, h - 1);
            }
            q(h, h);
        }
    }

    public final void m() {
        Z10216649008126070808 z10216649008126070808 = this.e;
        z10216649008126070808.a = null;
        M11181104712105445833 m11181104712105445833 = this.g;
        if (m11181104712105445833.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            z10216649008126070808.a = null;
            if (m11181104712105445833.b.length() > 0) {
                String str = m11181104712105445833.b;
                long j = this.f;
                int i = F12478849263529740365.c;
                int m = Z14316276734425062790.m((int) (j & 4294967295L), str);
                if (m != -1) {
                    q(m, m);
                }
            }
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        q(intValue, intValue);
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        q(intValue, intValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = F12478849263529740365.c;
            this.f = T1335862270807194835.d((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = T1335862270807194835.d(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = F12478849263529740365.c;
        return this.d.s((int) (j & 4294967295L));
    }
}
