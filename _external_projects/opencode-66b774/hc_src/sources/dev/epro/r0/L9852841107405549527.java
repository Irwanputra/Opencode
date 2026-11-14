package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L9852841107405549527 {
    public final H15529255554432066394 A;
    public boolean B;
    public final C1808610572029789795 a;
    public I2076339260272013590 d;
    public B13729205492206812220 g;
    public L3957284589981577691 h;
    public W5797197595347441198 i;
    public S16869475527240117894 j;
    public I16162375839174538453 k;
    public H10681976249452161517 l;
    public final V697849047308847220 m;
    public final V697849047308847220 n;

    /* renamed from: o, reason: collision with root package name */
    public long f356o;
    public F12478849263529740365 p;
    public long q;
    public final V697849047308847220 r;
    public final V697849047308847220 s;
    public int t;
    public F13241018602672925865 u;
    public H13046841657673666323 v;
    public F12478849263529740365 w;
    public final V697849047308847220 x;
    public final J13325455942816235854 y;
    public final J11637152230098458126 z;
    public R17143752899285419206 b = N2420111770332391767.a;
    public F4096073349764486348 c = new S11108027743417284456((byte) 6);
    public final V697849047308847220 e = V4416135141588678913.t(new F13241018602672925865((String) null, 7, 0));
    public H14763425654620554740 f = P2382941533350862833.y;

    public L9852841107405549527(C1808610572029789795 c1808610572029789795) {
        this.a = c1808610572029789795;
        Boolean bool = Boolean.TRUE;
        this.m = V4416135141588678913.t(bool);
        this.n = V4416135141588678913.t(bool);
        this.f356o = 0L;
        this.q = 0L;
        this.r = V4416135141588678913.t(null);
        this.s = V4416135141588678913.t(null);
        this.t = -1;
        this.u = new F13241018602672925865((String) null, 7, 0L);
        this.x = V4416135141588678913.t(Boolean.FALSE);
        this.y = new J13325455942816235854();
        this.z = new J11637152230098458126(this);
        this.A = new H15529255554432066394(this);
    }

    public static F13241018602672925865 b(M11181104712105445833 m11181104712105445833, long j) {
        return new F13241018602672925865(m11181104712105445833, j, (F12478849263529740365) null);
    }

    public final X7175349259954592591 a(boolean z) {
        W5797197595347441198 w5797197595347441198 = this.i;
        R4833348786910499294 r4833348786910499294 = null;
        if (w5797197595347441198 == null) {
            return null;
        }
        return R7033599853981556291.E(w5797197595347441198, null, L856869997670741194.d, new W6362393430097503357(this, z, r4833348786910499294, (byte) 0), 1);
    }

    public final void c() {
        W5797197595347441198 w5797197595347441198 = this.i;
        if (w5797197595347441198 != null) {
            R7033599853981556291.E(w5797197595347441198, null, L856869997670741194.d, new G16212247282630895364(this, null, (byte) 18), 1);
        }
    }

    public final void d(L2216691091636065972 l2216691091636065972) {
        if (!F12478849263529740365.d(l().b)) {
            I2076339260272013590 i2076339260272013590 = this.d;
            N17980339148608222959 d = i2076339260272013590 != null ? i2076339260272013590.d() : null;
            int f = (l2216691091636065972 == null || d == null) ? F12478849263529740365.f(l().b) : this.b.p(d.b(l2216691091636065972.a, true));
            F13241018602672925865 a = F13241018602672925865.a(l(), null, T1335862270807194835.d(f, f), 5);
            this.c.invoke(a);
            this.w = new F12478849263529740365(a.b);
        }
        r((l2216691091636065972 == null || l().a.b.length() <= 0) ? I3645473568512758926.a : I3645473568512758926.c);
        u(false);
    }

    public final void e(boolean z) {
        H10681976249452161517 h10681976249452161517;
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 != null && !i2076339260272013590.b() && (h10681976249452161517 = this.l) != null) {
            H10681976249452161517.a(h10681976249452161517);
        }
        this.u = l();
        u(z);
        r(I3645473568512758926.b);
    }

    public final H9390398899829886498 f() {
        String str;
        F12478849263529740365 f12478849263529740365;
        M11181104712105445833 k = k();
        if (k == null || (str = k.b) == null || (f12478849263529740365 = this.w) == null) {
            return null;
        }
        long j = f12478849263529740365.a;
        return new H9390398899829886498(str, new F12478849263529740365(T1335862270807194835.d(this.b.s((int) (j >> 32)), this.b.s((int) (j & 4294967295L)))));
    }

    public final L2216691091636065972 g() {
        return (L2216691091636065972) this.s.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        N17980339148608222959 d;
        long j;
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 == null || (d = i2076339260272013590.d()) == null) {
            return 9205357640488583168L;
        }
        Q17957571128037780363 q17957571128037780363 = d.a;
        M11181104712105445833 k = k();
        if (k == null) {
            return 9205357640488583168L;
        }
        if (!S10823041268949770285.t(k.b, q17957571128037780363.a.a.b)) {
            return 9205357640488583168L;
        }
        F13241018602672925865 l = l();
        if (z) {
            long j2 = l.b;
            int i = F12478849263529740365.c;
            j = j2 >> 32;
        } else {
            long j3 = l.b;
            int i2 = F12478849263529740365.c;
            j = j3 & 4294967295L;
        }
        return E17665849472693074628.e(q17957571128037780363, this.b.s((int) j), z, F12478849263529740365.h(l().b));
    }

    public final M11181104712105445833 k() {
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 != null) {
            return (M11181104712105445833) i2076339260272013590.a.b;
        }
        return null;
    }

    public final F13241018602672925865 l() {
        return (F13241018602672925865) this.e.getValue();
    }

    public final void m() {
        X7175349259954592591 x7175349259954592591;
        J8749144669333390587 j8749144669333390587 = this.y.a;
        if (j8749144669333390587 == null || (x7175349259954592591 = j8749144669333390587.u) == null) {
            return;
        }
        x7175349259954592591.c(null);
        j8749144669333390587.u = null;
    }

    public final void n(F12478849263529740365 f12478849263529740365) {
        M11181104712105445833 k;
        String str;
        W5797197595347441198 w5797197595347441198;
        if (f12478849263529740365 == null) {
            return;
        }
        long j = f12478849263529740365.a;
        S16869475527240117894 s16869475527240117894 = this.j;
        if (s16869475527240117894 == null || (k = k()) == null || (str = k.b) == null) {
            return;
        }
        R17143752899285419206 r17143752899285419206 = this.b;
        long d = T1335862270807194835.d(r17143752899285419206.s((int) (j >> 32)), r17143752899285419206.s((int) (j & 4294967295L)));
        if (str.length() <= 0 || F12478849263529740365.d(d) || (w5797197595347441198 = this.i) == null) {
            return;
        }
        R7033599853981556291.E(w5797197595347441198, null, null, new L2357058196026577384(s16869475527240117894, str, d, f12478849263529740365, this, r17143752899285419206, null), 3);
    }

    public final void o() {
        W5797197595347441198 w5797197595347441198 = this.i;
        if (w5797197595347441198 != null) {
            R7033599853981556291.E(w5797197595347441198, null, L856869997670741194.d, new I7536547207406987564(this, null, (byte) 1), 1);
        }
    }

    public final void p(L2216691091636065972 l2216691091636065972) {
        this.s.setValue(l2216691091636065972);
    }

    public final void q(V8323072410254082725 v8323072410254082725) {
        this.r.setValue(v8323072410254082725);
    }

    public final void r(I3645473568512758926 i3645473568512758926) {
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 != null) {
            if (i2076339260272013590.a() == i3645473568512758926) {
                i2076339260272013590 = null;
            }
            if (i2076339260272013590 != null) {
                i2076339260272013590.k.setValue(i3645473568512758926);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.q.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
            dev.epro.r0.M4722199849958580248 r0 = dev.epro.r0.T8598786036980488824.h()
            if (r0 == 0) goto Lb
            dev.epro.r0.F4096073349764486348 r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            dev.epro.r0.M4722199849958580248 r2 = dev.epro.r0.T8598786036980488824.o(r0)
            boolean r3 = r4.i()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            dev.epro.r0.I2076339260272013590 r3 = r4.d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            dev.epro.r0.V697849047308847220 r3 = r3.q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            dev.epro.r0.T8598786036980488824.x(r0, r2, r1)
            dev.epro.r0.J13325455942816235854 r4 = r4.y
            r4.a()
            return
        L32:
            r4 = move-exception
            goto L38
        L34:
            dev.epro.r0.T8598786036980488824.x(r0, r2, r1)
            return
        L38:
            dev.epro.r0.T8598786036980488824.x(r0, r2, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9852841107405549527.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dev.epro.r0.R17315201391738974046
            if (r0 == 0) goto L13
            r0 = r5
            dev.epro.r0.R17315201391738974046 r0 = (dev.epro.r0.R17315201391738974046) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.R17315201391738974046 r0 = new dev.epro.r0.R17315201391738974046
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            dev.epro.r0.L9852841107405549527 r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L54
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.L3957284589981577691 r5 = r4.h
            if (r5 == 0) goto L5e
            r0.t = r4
            r0.w = r2
            android.content.ClipboardManager r5 = dev.epro.r0.J8045362843799184672.S(r5)
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L45
            r5 = 0
            goto L4b
        L45:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L54
            return r0
        L54:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            dev.epro.r0.V697849047308847220 r4 = r4.x
            r4.setValue(r5)
        L5e:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L9852841107405549527.t(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void u(boolean z) {
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 != null) {
            i2076339260272013590.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    public final long v(F13241018602672925865 f13241018602672925865, long j, boolean z, boolean z2, S6976414540931251790 s6976414540931251790, boolean z3, U11239405163472986846 u11239405163472986846) {
        N17980339148608222959 d;
        char c;
        I16162375839174538453 i16162375839174538453;
        I2076339260272013590 i2076339260272013590 = this.d;
        if (i2076339260272013590 == null || (d = i2076339260272013590.d()) == null) {
            return F12478849263529740365.b;
        }
        R17143752899285419206 r17143752899285419206 = this.b;
        long j2 = f13241018602672925865.b;
        M11181104712105445833 m11181104712105445833 = f13241018602672925865.a;
        int i = F12478849263529740365.c;
        long d2 = T1335862270807194835.d(r17143752899285419206.s((int) (j2 >> 32)), this.b.s((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int b = d.b(j, false);
        int i2 = (z2 || z) ? b : (int) (d2 >> 32);
        int i3 = (!z2 || z) ? b : (int) (d2 & 4294967295L);
        H13046841657673666323 h13046841657673666323 = this.v;
        int i4 = -1;
        if (z || h13046841657673666323 == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = this.t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        H13046841657673666323 n = U8836654130139556418.n(d.a, i2, i3, i4, d2, z, z2);
        if (n.k(h13046841657673666323)) {
            this.v = n;
            this.t = b;
            V5656221289452463152 a = s6976414540931251790.a(n);
            long d3 = T1335862270807194835.d(this.b.p(a.a.b), this.b.p(a.b.b));
            if (!F12478849263529740365.c(d3, j2)) {
                boolean z5 = F12478849263529740365.h(d3) != F12478849263529740365.h(j2) && F12478849263529740365.c(T1335862270807194835.d((int) (4294967295L & d3), (int) (d3 >> c)), j2);
                boolean z6 = F12478849263529740365.d(d3) && F12478849263529740365.d(j2);
                if (z3 && m11181104712105445833.b.length() > 0 && !z5 && !z6 && u11239405163472986846 != null && (i16162375839174538453 = this.k) != null) {
                    ((D1743966822371805936) i16162375839174538453).a(u11239405163472986846.a);
                }
                this.c.invoke(b(m11181104712105445833, d3));
                this.w = new F12478849263529740365(d3);
                if (!z3) {
                    u(!F12478849263529740365.d(d3));
                }
                I2076339260272013590 i20763392602720135902 = this.d;
                if (i20763392602720135902 != null) {
                    i20763392602720135902.q.setValue(Boolean.valueOf(z3));
                }
                I2076339260272013590 i20763392602720135903 = this.d;
                if (i20763392602720135903 != null) {
                    i20763392602720135903.m.setValue(Boolean.valueOf(!F12478849263529740365.d(d3) && Q3791352212346016950.h(this, true)));
                }
                I2076339260272013590 i20763392602720135904 = this.d;
                if (i20763392602720135904 != null) {
                    i20763392602720135904.n.setValue(Boolean.valueOf(!F12478849263529740365.d(d3) && Q3791352212346016950.h(this, false)));
                }
                I2076339260272013590 i20763392602720135905 = this.d;
                if (i20763392602720135905 != null) {
                    if (F12478849263529740365.d(d3) && Q3791352212346016950.h(this, true)) {
                        z4 = true;
                    }
                    i20763392602720135905.f290o.setValue(Boolean.valueOf(z4));
                }
                return d3;
            }
        }
        return j2;
    }
}
