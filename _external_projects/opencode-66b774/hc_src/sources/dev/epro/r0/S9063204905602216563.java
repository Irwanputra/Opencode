package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S9063204905602216563 {
    public final N1420218926656397722 a;
    public final Q17957571128037780363 b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final C10671975960037781546 f;
    public final C8185053590072587931 g;
    public final O9176062718639849859 h;
    public long i;
    public R7332211110819204002 j;
    public final String k;

    public S9063204905602216563(N1420218926656397722 n1420218926656397722, Q17957571128037780363 q17957571128037780363, boolean z, boolean z2, float f, C10671975960037781546 c10671975960037781546) {
        this.a = n1420218926656397722;
        this.b = q17957571128037780363;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = c10671975960037781546;
        M4722199849958580248 h = T8598786036980488824.h();
        F4096073349764486348 e = h != null ? h.e() : null;
        M4722199849958580248 o2 = T8598786036980488824.o(h);
        try {
            C8185053590072587931 d = n1420218926656397722.d();
            this.g = d;
            this.h = (O9176062718639849859) n1420218926656397722.d.getValue();
            T8598786036980488824.x(h, o2, e);
            this.i = d.d;
            this.k = d.c.toString();
        } catch (Throwable th) {
            T8598786036980488824.x(h, o2, e);
            throw th;
        }
    }

    public final void a() {
        if (this.k.length() > 0) {
            C8185053590072587931 c8185053590072587931 = this.g;
            boolean d = F12478849263529740365.d(c8185053590072587931.d);
            N1420218926656397722 n1420218926656397722 = this.a;
            if (d) {
                N1420218926656397722.i(n1420218926656397722, "", T1335862270807194835.d((int) (c8185053590072587931.d >> 32), (int) (this.i & 4294967295L)), !this.c, this.d, 4);
            } else {
                n1420218926656397722.c(this.d);
            }
            this.i = this.a.d().d;
            this.j = R7332211110819204002.a;
        }
    }

    public final boolean b() {
        Q17957571128037780363 q17957571128037780363 = this.b;
        if (q17957571128037780363 == null) {
            return true;
        }
        long j = this.i;
        int i = F12478849263529740365.c;
        return q17957571128037780363.i((int) (j & 4294967295L)) == O16392062884302746898.a;
    }

    public final int c(Q17957571128037780363 q17957571128037780363, int i) {
        long j = this.i;
        int i2 = F12478849263529740365.c;
        int i3 = (int) (j & 4294967295L);
        C10671975960037781546 c10671975960037781546 = this.f;
        if (Float.isNaN(c10671975960037781546.a)) {
            c10671975960037781546.a = q17957571128037780363.c(i3).a;
        }
        V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
        int d = v11538895333762958192.d(i3) + i;
        if (d < 0) {
            return Integer.MIN_VALUE;
        }
        if (d >= v11538895333762958192.f) {
            return Integer.MAX_VALUE;
        }
        float b = v11538895333762958192.b(d) - 1.0f;
        float f = c10671975960037781546.a;
        if ((b() && f >= q17957571128037780363.g(d)) || (!b() && f <= q17957571128037780363.f(d))) {
            return v11538895333762958192.c(d, true);
        }
        return v11538895333762958192.g((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(b) & 4294967295L));
    }

    public final int d(int i) {
        long j = this.g.d;
        int i2 = F12478849263529740365.c;
        int i3 = (int) (j & 4294967295L);
        Q17957571128037780363 q17957571128037780363 = this.b;
        if (q17957571128037780363 != null) {
            V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
            float f = this.e;
            if (!Float.isNaN(f)) {
                S6349823729575121924 j2 = q17957571128037780363.c(i3).j(0.0f, f * i);
                float f2 = j2.d;
                float f3 = j2.b;
                float b = v11538895333762958192.b(v11538895333762958192.e(f3));
                if (Math.abs(f3 - b) > Math.abs(f2 - b)) {
                    return v11538895333762958192.g(j2.f());
                }
                return v11538895333762958192.g((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(j2.a) << 32));
            }
        }
        return i3;
    }

    public final void e() {
        Q17957571128037780363 q17957571128037780363 = this.b;
        int c = q17957571128037780363 != null ? c(q17957571128037780363, 1) : Integer.MAX_VALUE;
        if (c == Integer.MAX_VALUE) {
            this.f.a = Float.NaN;
        }
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            int length = str.length();
            if (c > length) {
                c = length;
            }
            long f = Z14316276734425062790.f(c, i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void f() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(d(1), i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void g() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(Z14316276734425062790.m(i2, str), i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void h() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int g = O17574792317020433029.g(str, F12478849263529740365.f(j));
            if (g == F12478849263529740365.f(this.i) && g != str.length()) {
                g = O17574792317020433029.g(str, g + 1);
            }
            long f = Z14316276734425062790.f(g, i, this.a);
            int i2 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i2 != i || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i2, i2);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void i() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            Q17957571128037780363 q17957571128037780363 = this.b;
            if (q17957571128037780363 != null) {
                int i3 = i2;
                while (true) {
                    C8185053590072587931 c8185053590072587931 = this.g;
                    if (i3 < c8185053590072587931.c.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long k = q17957571128037780363.k(length2);
                        int i4 = F12478849263529740365.c;
                        int i5 = (int) (k & 4294967295L);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = c8185053590072587931.c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long f = Z14316276734425062790.f(length, i2, this.a);
            int i6 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i6 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i6, i6);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void j() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(Z14316276734425062790.n(i2, str), i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void k() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = (int) (4294967295L & j);
            int h = O17574792317020433029.h(str, F12478849263529740365.g(j));
            if (h == F12478849263529740365.g(this.i) && h != 0) {
                h = O17574792317020433029.h(str, h - 1);
            }
            long f = Z14316276734425062790.f(h, i, this.a);
            int i2 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i2 != i || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i2, i2);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void l() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            int i3 = 0;
            Q17957571128037780363 q17957571128037780363 = this.b;
            if (q17957571128037780363 != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long k = q17957571128037780363.k(length);
                    int i5 = F12478849263529740365.c;
                    int i6 = (int) (k >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                    i4--;
                }
            }
            long f = Z14316276734425062790.f(i3, i2, this.a);
            int i7 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i7 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i7, i7);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void m() {
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(str.length(), i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void n() {
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(0, i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void o() {
        int length;
        this.f.a = Float.NaN;
        String str = this.k;
        if (str.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (4294967295L & j);
            Q17957571128037780363 q17957571128037780363 = this.b;
            if (q17957571128037780363 != null) {
                V11538895333762958192 v11538895333762958192 = q17957571128037780363.b;
                length = v11538895333762958192.c(v11538895333762958192.d(F12478849263529740365.f(j)), true);
            } else {
                length = str.length();
            }
            long f = Z14316276734425062790.f(length, i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void p() {
        int i;
        this.f.a = Float.NaN;
        if (this.k.length() > 0) {
            long j = this.i;
            int i2 = F12478849263529740365.c;
            int i3 = (int) (4294967295L & j);
            Q17957571128037780363 q17957571128037780363 = this.b;
            if (q17957571128037780363 != null) {
                i = q17957571128037780363.h(q17957571128037780363.b.d(F12478849263529740365.g(j)));
            } else {
                i = 0;
            }
            long f = Z14316276734425062790.f(i, i3, this.a);
            int i4 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i4 != i3 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i4, i4);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void q() {
        Q17957571128037780363 q17957571128037780363 = this.b;
        int c = q17957571128037780363 != null ? c(q17957571128037780363, -1) : Integer.MIN_VALUE;
        if (c == Integer.MIN_VALUE) {
            this.f.a = Float.NaN;
        }
        if (this.k.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            if (c < 0) {
                c = 0;
            }
            long f = Z14316276734425062790.f(c, i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void r() {
        if (this.k.length() > 0) {
            long j = this.i;
            int i = F12478849263529740365.c;
            int i2 = (int) (j & 4294967295L);
            long f = Z14316276734425062790.f(d(-1), i2, this.a);
            int i3 = (int) (f >> 32);
            R7332211110819204002 Q = C775827382551829194.Q(f);
            if (i3 != i2 || !F12478849263529740365.d(this.i)) {
                this.i = T1335862270807194835.d(i3, i3);
            }
            if (Q != null) {
                this.j = Q;
            }
        }
    }

    public final void s() {
        if (this.k.length() > 0) {
            long j = this.g.d;
            int i = F12478849263529740365.c;
            this.i = T1335862270807194835.d((int) (j >> 32), (int) (this.i & 4294967295L));
        }
    }
}
