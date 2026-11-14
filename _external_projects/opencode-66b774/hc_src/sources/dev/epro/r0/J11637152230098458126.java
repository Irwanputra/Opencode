package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J11637152230098458126 implements N235339945877347053 {
    public F12478849263529740365 b;
    public final /* synthetic */ L9852841107405549527 d;
    public boolean a = true;
    public S6976414540931251790 c = B14824868959299866349.n;

    public J11637152230098458126(L9852841107405549527 l9852841107405549527) {
        this.d = l9852841107405549527;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void b(long j, S6976414540931251790 s6976414540931251790) {
        long j2;
        N17980339148608222959 d;
        N17980339148608222959 d2;
        L9852841107405549527 l9852841107405549527 = this.d;
        if (l9852841107405549527.i() && ((V8323072410254082725) l9852841107405549527.r.getValue()) == null) {
            l9852841107405549527.q(V8323072410254082725.c);
            l9852841107405549527.t = -1;
            this.a = true;
            this.c = s6976414540931251790;
            l9852841107405549527.m();
            I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
            if (i2076339260272013590 == null || (d2 = i2076339260272013590.d()) == null || !d2.c(j)) {
                j2 = j;
                I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
                if (i20763392602720135902 != null && (d = i20763392602720135902.d()) != null) {
                    int p = l9852841107405549527.b.p(d.b(j2, true));
                    F13241018602672925865 b = L9852841107405549527.b(l9852841107405549527.l().a, T1335862270807194835.d(p, p));
                    l9852841107405549527.e(false);
                    I16162375839174538453 i16162375839174538453 = l9852841107405549527.k;
                    if (i16162375839174538453 != null) {
                        ((D1743966822371805936) i16162375839174538453).a(0);
                    }
                    l9852841107405549527.c.invoke(b);
                    l9852841107405549527.w = new F12478849263529740365(b.b);
                }
                this.a = false;
            } else {
                if (l9852841107405549527.l().a.b.length() == 0) {
                    return;
                }
                l9852841107405549527.e(false);
                long v = l9852841107405549527.v(F13241018602672925865.a(l9852841107405549527.l(), null, F12478849263529740365.b, 5), j, true, false, this.c, true, new U11239405163472986846(0));
                j2 = j;
                l9852841107405549527.p = new F12478849263529740365(v);
                this.b = new F12478849263529740365(v);
            }
            l9852841107405549527.r(I3645473568512758926.a);
            l9852841107405549527.f356o = j2;
            l9852841107405549527.p(new L2216691091636065972(j2));
            l9852841107405549527.q = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // dev.epro.r0.N235339945877347053
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r10) {
        /*
            r9 = this;
            dev.epro.r0.L9852841107405549527 r0 = r9.d
            boolean r1 = r0.i()
            if (r1 == 0) goto Le9
            dev.epro.r0.F13241018602672925865 r1 = r0.l()
            dev.epro.r0.M11181104712105445833 r1 = r1.a
            java.lang.String r1 = r1.b
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Le9
        L18:
            long r1 = r0.q
            long r10 = dev.epro.r0.L2216691091636065972.f(r1, r10)
            r0.q = r10
            dev.epro.r0.I2076339260272013590 r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le6
            dev.epro.r0.N17980339148608222959 r10 = r10.d()
            if (r10 == 0) goto Le6
            long r1 = r0.f356o
            long r3 = r0.q
            long r1 = dev.epro.r0.L2216691091636065972.f(r1, r3)
            dev.epro.r0.L2216691091636065972 r3 = new dev.epro.r0.L2216691091636065972
            r3.<init>(r1)
            r0.p(r3)
            dev.epro.r0.F12478849263529740365 r1 = r0.p
            r2 = 9
            if (r1 != 0) goto L94
            dev.epro.r0.L2216691091636065972 r1 = r0.g()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L94
            dev.epro.r0.R17143752899285419206 r1 = r0.b
            long r3 = r0.f356o
            r5 = 1
            int r3 = r10.b(r3, r5)
            int r1 = r1.p(r3)
            dev.epro.r0.R17143752899285419206 r3 = r0.b
            dev.epro.r0.L2216691091636065972 r4 = r0.g()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.b(r6, r5)
            int r10 = r3.p(r10)
            if (r1 != r10) goto L76
            dev.epro.r0.S6976414540931251790 r10 = dev.epro.r0.B14824868959299866349.n
        L74:
            r6 = r10
            goto L79
        L76:
            dev.epro.r0.S6976414540931251790 r10 = dev.epro.r0.B14824868959299866349.p
            goto L74
        L79:
            dev.epro.r0.F13241018602672925865 r1 = r0.l()
            dev.epro.r0.L2216691091636065972 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            dev.epro.r0.U11239405163472986846 r8 = new dev.epro.r0.U11239405163472986846
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
            goto Ld5
        L94:
            dev.epro.r0.F12478849263529740365 r1 = r0.p
            if (r1 == 0) goto L9f
            long r3 = r1.a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La5
        L9f:
            long r3 = r0.f356o
            int r1 = r10.b(r3, r11)
        La5:
            dev.epro.r0.L2216691091636065972 r3 = r0.g()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.b(r3, r11)
            dev.epro.r0.F12478849263529740365 r3 = r0.p
            if (r3 != 0) goto Lb9
            if (r1 != r10) goto Lb9
            goto Le9
        Lb9:
            dev.epro.r0.F13241018602672925865 r1 = r0.l()
            dev.epro.r0.L2216691091636065972 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            dev.epro.r0.S6976414540931251790 r6 = r9.c
            dev.epro.r0.U11239405163472986846 r8 = new dev.epro.r0.U11239405163472986846
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
        Ld5:
            dev.epro.r0.F12478849263529740365 r10 = new dev.epro.r0.F12478849263529740365
            r10.<init>(r1)
            r9.b = r10
            dev.epro.r0.F12478849263529740365 r10 = r0.p
            boolean r10 = dev.epro.r0.F12478849263529740365.b(r1, r10)
            if (r10 != 0) goto Le6
            r9.a = r11
        Le6:
            r0.u(r11)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J11637152230098458126.d(long):void");
    }

    public final void e() {
        L9852841107405549527 l9852841107405549527 = this.d;
        l9852841107405549527.q(null);
        l9852841107405549527.p(null);
        this.c = B14824868959299866349.n;
        l9852841107405549527.u(true);
        F12478849263529740365 f12478849263529740365 = this.b;
        boolean d = F12478849263529740365.d(f12478849263529740365 != null ? f12478849263529740365.a : l9852841107405549527.l().b);
        l9852841107405549527.r(d ? I3645473568512758926.c : I3645473568512758926.b);
        I2076339260272013590 i2076339260272013590 = l9852841107405549527.d;
        if (i2076339260272013590 != null) {
            i2076339260272013590.m.setValue(Boolean.valueOf(!d && Q3791352212346016950.h(l9852841107405549527, true)));
        }
        I2076339260272013590 i20763392602720135902 = l9852841107405549527.d;
        if (i20763392602720135902 != null) {
            i20763392602720135902.n.setValue(Boolean.valueOf(!d && Q3791352212346016950.h(l9852841107405549527, false)));
        }
        I2076339260272013590 i20763392602720135903 = l9852841107405549527.d;
        if (i20763392602720135903 != null) {
            i20763392602720135903.f290o.setValue(Boolean.valueOf(d && Q3791352212346016950.h(l9852841107405549527, true)));
        }
        if (this.a) {
            l9852841107405549527.n(l9852841107405549527.p);
        }
        l9852841107405549527.p = null;
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onCancel() {
        e();
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void onStop() {
        e();
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void a() {
    }

    @Override // dev.epro.r0.N235339945877347053
    public final void c() {
    }
}
