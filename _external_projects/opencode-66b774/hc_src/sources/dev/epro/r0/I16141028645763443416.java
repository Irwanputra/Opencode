package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I16141028645763443416 extends Y4989033692226475498 {
    public static final O3228356295430981133 e0;
    public final E6101237837392211295 c0;
    public N2516046390769984807 d0;

    static {
        O3228356295430981133 g = E12775674050813925581.g();
        int i = U10174709222559481877.i;
        g.o(U10174709222559481877.e);
        g.u(1.0f);
        g.v(1);
        e0 = g;
    }

    public I16141028645763443416(H11725168162114556860 h11725168162114556860) {
        super(h11725168162114556860);
        E6101237837392211295 e6101237837392211295 = new E6101237837392211295();
        e6101237837392211295.d = 0;
        this.c0 = e6101237837392211295;
        e6101237837392211295.h = this;
        this.d0 = h11725168162114556860.h != null ? new N2516046390769984807(this) : null;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int V(int i) {
        V10300877997588547986 t = this.u.t();
        A10838822263452390785 n = t.n();
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) t.b;
        return n.b((Y4989033692226475498) h11725168162114556860.F.e, h11725168162114556860.m(), i);
    }

    @Override // dev.epro.r0.Y4989033692226475498
    public final void Z0() {
        if (this.d0 == null) {
            this.d0 = new N2516046390769984807(this);
        }
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int a0(int i) {
        V10300877997588547986 t = this.u.t();
        A10838822263452390785 n = t.n();
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) t.b;
        return n.d((Y4989033692226475498) h11725168162114556860.F.e, h11725168162114556860.m(), i);
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int b0(int i) {
        V10300877997588547986 t = this.u.t();
        A10838822263452390785 n = t.n();
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) t.b;
        return n.a((Y4989033692226475498) h11725168162114556860.F.e, h11725168162114556860.m(), i);
    }

    @Override // dev.epro.r0.Y4989033692226475498
    public final L5844152868342410893 c1() {
        return this.d0;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final Z17471428274427141949 d(long j) {
        r0(j);
        H11725168162114556860 h11725168162114556860 = this.u;
        D389890677992184566 z = h11725168162114556860.z();
        Object[] objArr = z.a;
        int i = z.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((H11725168162114556860) objArr[i2]).G.p.l = Q8181337811809788579.c;
        }
        y1(h11725168162114556860.w.c(this, h11725168162114556860.m(), j));
        p1();
        return this;
    }

    @Override // dev.epro.r0.Y4989033692226475498
    public final R15896830329318850690 e1() {
        return this.c0;
    }

    @Override // dev.epro.r0.G17613326942144185441
    public final int f(int i) {
        V10300877997588547986 t = this.u.t();
        A10838822263452390785 n = t.n();
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) t.b;
        return n.e((Y4989033692226475498) h11725168162114556860.F.e, h11725168162114556860.m(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // dev.epro.r0.Y4989033692226475498
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l1(dev.epro.r0.W5631948913832446850 r12, long r13, dev.epro.r0.Z12993664435766561681 r15, int r16, boolean r17) {
        /*
            r11 = this;
            dev.epro.r0.H11725168162114556860 r0 = r11.u
            boolean r1 = r12.j(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.G1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.d1()
            float r11 = r11.W0(r13, r4)
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r11 = r11 & r1
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r11 >= r1) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r11 = r15.c
            dev.epro.r0.D389890677992184566 r0 = r0.y()
            java.lang.Object[] r1 = r0.a
            int r0 = r0.c
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r1[r0]
            r5 = r2
            dev.epro.r0.H11725168162114556860 r5 = (dev.epro.r0.H11725168162114556860) r5
            boolean r2 = r5.I()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.c(r5, r6, r8, r9, r10)
            long r2 = r15.a()
            float r6 = dev.epro.r0.C9869900372345142877.G(r2)
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L73
            boolean r6 = dev.epro.r0.C9869900372345142877.L(r2)
            if (r6 == 0) goto L73
            boolean r2 = dev.epro.r0.C9869900372345142877.K(r2)
            if (r2 != 0) goto L73
            boolean r2 = r12.n(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.c = r11
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I16141028645763443416.l1(dev.epro.r0.W5631948913832446850, long, dev.epro.r0.Z12993664435766561681, int, boolean):void");
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final void n0(long j, float f, F4096073349764486348 f4096073349764486348) {
        v1(j, f, f4096073349764486348, null);
        if (this.n) {
            return;
        }
        this.u.G.p.z0();
    }

    @Override // dev.epro.r0.I11965759855724288421
    public final int u0(P777117574205674816 p777117574205674816) {
        N2516046390769984807 n2516046390769984807 = this.d0;
        if (n2516046390769984807 != null) {
            return n2516046390769984807.u0(p777117574205674816);
        }
        T8458668874796040341 t8458668874796040341 = this.u.G.p;
        V13058232089047844042 v13058232089047844042 = t8458668874796040341.y;
        if (!t8458668874796040341.m) {
            if (t8458668874796040341.f.d == J4327291511168983093.a) {
                v13058232089047844042.f = true;
                if (v13058232089047844042.b) {
                    t8458668874796040341.w = true;
                    t8458668874796040341.x = true;
                }
            } else {
                v13058232089047844042.g = true;
            }
        }
        I16141028645763443416 p = t8458668874796040341.p();
        boolean z = p.f283o;
        p.f283o = true;
        t8458668874796040341.x();
        p.f283o = z;
        Integer num = (Integer) v13058232089047844042.i.get(p777117574205674816);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
