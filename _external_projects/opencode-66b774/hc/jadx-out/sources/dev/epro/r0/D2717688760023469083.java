package dev.epro.r0;

import android.content.ClipDescription;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D2717688760023469083 {
    public final N1420218926656397722 a;
    public final I12071840179596922896 b;
    public R8540738700654750557 c;
    public final J13325455942816235854 d;
    public final W5797197595347441198 e;
    public final S16869475527240117894 f;
    public L3957284589981577691 g;
    public boolean h;
    public boolean i;
    public I16162375839174538453 j;
    public B13729205492206812220 l;
    public B13729205492206812220 m;
    public final V697849047308847220 r;
    public final V697849047308847220 s;
    public final V697849047308847220 t;
    public H13046841657673666323 u;
    public int v;
    public L11334185135933894276 w;
    public final B4739506393801054036 x;
    public final Q6203700555324584864 y;
    public final V697849047308847220 k = V4416135141588678913.t(Boolean.TRUE);
    public final V697849047308847220 n = V4416135141588678913.t(new L2216691091636065972(9205357640488583168L));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V697849047308847220 f206o = V4416135141588678913.t(new L2216691091636065972(9205357640488583168L));
    public final V697849047308847220 p = V4416135141588678913.t(null);
    public final V697849047308847220 q = V4416135141588678913.t(A9296802071731955712.a);

    public D2717688760023469083(N1420218926656397722 n1420218926656397722, I12071840179596922896 i12071840179596922896, R8540738700654750557 r8540738700654750557, boolean z, J13325455942816235854 j13325455942816235854, W5797197595347441198 w5797197595347441198, S16869475527240117894 s16869475527240117894, L3957284589981577691 l3957284589981577691) {
        this.a = n1420218926656397722;
        this.b = i12071840179596922896;
        this.c = r8540738700654750557;
        this.d = j13325455942816235854;
        this.e = w5797197595347441198;
        this.f = s16869475527240117894;
        this.g = l3957284589981577691;
        this.i = z;
        Boolean bool = Boolean.FALSE;
        this.r = V4416135141588678913.t(bool);
        this.s = V4416135141588678913.t(S5779100572589057142.a);
        this.t = V4416135141588678913.t(bool);
        this.v = -1;
        this.x = Z3658309082448601011.b(new J14087722038307951427(this, (byte) 3));
        L3957284589981577691 l39572845899815776912 = this.g;
        Q6203700555324584864 q6203700555324584864 = new Q6203700555324584864();
        q6203700555324584864.b = l39572845899815776912;
        this.y = q6203700555324584864;
    }

    public static final void f(X4418276304150334445 x4418276304150334445, X4418276304150334445 x44182763041503344452, D2717688760023469083 d2717688760023469083) {
        if ((x4418276304150334445.a & 9223372034707292159L) != 9205357640488583168L) {
            x4418276304150334445.a = 9205357640488583168L;
            x44182763041503344452.a = 9205357640488583168L;
            d2717688760023469083.b();
        }
    }

    public static final void h(X4418276304150334445 x4418276304150334445, X4418276304150334445 x44182763041503344452, D2717688760023469083 d2717688760023469083) {
        if ((x4418276304150334445.a & 9223372034707292159L) != 9205357640488583168L) {
            d2717688760023469083.b();
            x4418276304150334445.a = 9205357640488583168L;
            x44182763041503344452.a = 0L;
            d2717688760023469083.v = -1;
        }
    }

    public final void A(V8323072410254082725 v8323072410254082725, long j) {
        this.p.setValue(v8323072410254082725);
        this.f206o.setValue(new L2216691091636065972(j));
    }

    public final long B(C8185053590072587931 c8185053590072587931, int i, int i2, boolean z, S6976414540931251790 s6976414540931251790, boolean z2, boolean z3, U11239405163472986846 u11239405163472986846) {
        long jD;
        I16162375839174538453 i16162375839174538453;
        long j = c8185053590072587931.d;
        F12478849263529740365 f12478849263529740365 = new F12478849263529740365(j);
        if (z3 || (!z2 && F12478849263529740365.d(j))) {
            f12478849263529740365 = null;
        }
        Q17957571128037780363 q17957571128037780363C = this.b.c();
        if (q17957571128037780363C == null) {
            jD = F12478849263529740365.b;
        } else if (f12478849263529740365 == null && S10823041268949770285.t(s6976414540931251790, B14824868959299866349.f170o)) {
            jD = T1335862270807194835.d(i, i2);
        } else {
            H13046841657673666323 h13046841657673666323N = U8836654130139556418.n(q17957571128037780363C, i, i2, this.v, f12478849263529740365 != null ? f12478849263529740365.a : F12478849263529740365.b, f12478849263529740365 == null, z);
            if (f12478849263529740365 == null || h13046841657673666323N.k(this.u)) {
                V5656221289452463152 v5656221289452463152A = s6976414540931251790.a(h13046841657673666323N);
                jD = T1335862270807194835.d(v5656221289452463152A.a.b, v5656221289452463152A.b.b);
                this.u = h13046841657673666323N;
                this.v = z ? i : i2;
            } else {
                jD = f12478849263529740365.a;
            }
        }
        if (u11239405163472986846 != null && ((F12478849263529740365.g(jD) != F12478849263529740365.g(j) || F12478849263529740365.f(jD) != F12478849263529740365.f(j)) && (i16162375839174538453 = this.j) != null)) {
            ((D1743966822371805936) i16162375839174538453).a(u11239405163472986846.a);
        }
        return jD;
    }

    public final S6349823729575121924 a(Q17957571128037780363 q17957571128037780363, C8185053590072587931 c8185053590072587931) {
        if (!F12478849263529740365.d(c8185053590072587931.d)) {
            return S6349823729575121924.e;
        }
        S6349823729575121924 s6349823729575121924C = q17957571128037780363.c((int) (c8185053590072587931.d >> 32));
        float fFloor = (float) Math.floor(this.c.K(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        float f = q17957571128037780363.a.h == F10342546226345611902.a ? (fFloor / 2.0f) + s6349823729575121924C.a : s6349823729575121924C.c - (fFloor / 2.0f);
        float f2 = fFloor / 2.0f;
        float f3 = ((int) (q17957571128037780363.c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new S6349823729575121924(fFloor2 - f2, s6349823729575121924C.b, fFloor2 + f2, s6349823729575121924C.d);
    }

    public final void b() {
        this.p.setValue(null);
        this.f206o.setValue(new L2216691091636065972(9205357640488583168L));
        this.n.setValue(new L2216691091636065972(9205357640488583168L));
    }

    public final O9245300239821758723 c(boolean z, R14062301455140331524 r14062301455140331524) {
        M11181104712105445833 m11181104712105445833;
        N1420218926656397722 n1420218926656397722 = this.a;
        if (F12478849263529740365.d(n1420218926656397722.d().d)) {
            m11181104712105445833 = null;
        } else {
            C8185053590072587931 c8185053590072587931D = n1420218926656397722.d();
            m11181104712105445833 = new M11181104712105445833(c8185053590072587931D.c.subSequence(F12478849263529740365.g(c8185053590072587931D.d), F12478849263529740365.f(c8185053590072587931D.d)).toString());
            if (z) {
                n1420218926656397722.a();
            }
        }
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (m11181104712105445833 == null) {
            return o9245300239821758723;
        }
        ((T2834513763987957608) this.g).b(O5354877807466160604.d0(m11181104712105445833));
        return o9245300239821758723;
    }

    public final O9245300239821758723 d(R14062301455140331524 r14062301455140331524) {
        M11181104712105445833 m11181104712105445833;
        N1420218926656397722 n1420218926656397722 = this.a;
        if (F12478849263529740365.d(n1420218926656397722.d().d) || !m()) {
            m11181104712105445833 = null;
        } else {
            C8185053590072587931 c8185053590072587931D = n1420218926656397722.d();
            m11181104712105445833 = new M11181104712105445833(c8185053590072587931D.c.subSequence(F12478849263529740365.g(c8185053590072587931D.d), F12478849263529740365.f(c8185053590072587931D.d)).toString());
            n1420218926656397722.c(false);
        }
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (m11181104712105445833 == null) {
            return o9245300239821758723;
        }
        ((T2834513763987957608) this.g).b(O5354877807466160604.d0(m11181104712105445833));
        return o9245300239821758723;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.S14157914735975478504 r9, dev.epro.r0.K14749510448791472029 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof dev.epro.r0.U5101994138535060813
            if (r0 == 0) goto L14
            r0 = r10
            dev.epro.r0.U5101994138535060813 r0 = (dev.epro.r0.U5101994138535060813) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dev.epro.r0.U5101994138535060813 r0 = new dev.epro.r0.U5101994138535060813
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.v
            int r0 = r6.x
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 != r1) goto L2e
            dev.epro.r0.X4418276304150334445 r9 = r6.u
            dev.epro.r0.X4418276304150334445 r1 = r6.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L2b
            goto L76
        L2b:
            r0 = move-exception
            r10 = r0
            goto L81
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            r8 = 0
            return r8
        L35:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.X4418276304150334445 r10 = new dev.epro.r0.X4418276304150334445
            r10.<init>()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r10.a = r2
            dev.epro.r0.X4418276304150334445 r7 = new dev.epro.r0.X4418276304150334445
            r7.<init>()
            r7.a = r2
            dev.epro.r0.U6413690856892394737 r2 = new dev.epro.r0.U6413690856892394737     // Catch: java.lang.Throwable -> L7c
            r0 = 21
            r2.<init>(r10, r8, r7, r0)     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.Q18254099496673145462 r3 = new dev.epro.r0.Q18254099496673145462     // Catch: java.lang.Throwable -> L7c
            r3.<init>(r10, r7, r8, r1)     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.Q18254099496673145462 r4 = new dev.epro.r0.Q18254099496673145462     // Catch: java.lang.Throwable -> L7c
            r0 = 2
            r4.<init>(r10, r7, r8, r0)     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.L8467694984959092745 r5 = new dev.epro.r0.L8467694984959092745     // Catch: java.lang.Throwable -> L7c
            r0 = 19
            r5.<init>(r7, r8, r10, r0)     // Catch: java.lang.Throwable -> L7c
            r6.t = r10     // Catch: java.lang.Throwable -> L7c
            r6.u = r7     // Catch: java.lang.Throwable -> L7c
            r6.x = r1     // Catch: java.lang.Throwable -> L7c
            r1 = r9
            java.lang.Object r9 = dev.epro.r0.F10757829603125321143.e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7c
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r9 != r0) goto L74
            return r0
        L74:
            r1 = r10
            r9 = r7
        L76:
            f(r1, r9, r8)
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        L7c:
            r0 = move-exception
            r9 = r0
            r1 = r10
            r10 = r9
            r9 = r7
        L81:
            f(r1, r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.e(dev.epro.r0.S14157914735975478504, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.S14157914735975478504 r14, boolean r15, dev.epro.r0.K14749510448791472029 r16) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof dev.epro.r0.M12730736952453254657
            if (r1 == 0) goto L16
            r1 = r0
            dev.epro.r0.M12730736952453254657 r1 = (dev.epro.r0.M12730736952453254657) r1
            int r2 = r1.y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L16
            int r2 = r2 - r3
            r1.y = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            dev.epro.r0.M12730736952453254657 r1 = new dev.epro.r0.M12730736952453254657
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.w
            int r1 = r7.y
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 != r6) goto L33
            dev.epro.r0.V8323072410254082725 r1 = r7.v
            dev.epro.r0.X4418276304150334445 r2 = r7.u
            dev.epro.r0.X4418276304150334445 r3 = r7.t
            dev.epro.r0.E17665849472693074628.k(r0)     // Catch: java.lang.Throwable -> L30
            goto L93
        L30:
            r0 = move-exception
            goto Lab
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            r0 = 0
            return r0
        L3a:
            dev.epro.r0.E17665849472693074628.k(r0)
            dev.epro.r0.X4418276304150334445 r2 = new dev.epro.r0.X4418276304150334445
            r2.<init>()
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.a = r0
            dev.epro.r0.X4418276304150334445 r3 = new dev.epro.r0.X4418276304150334445
            r3.<init>()
            r0 = 0
            r3.a = r0
            if (r15 == 0) goto L58
            dev.epro.r0.V8323072410254082725 r0 = dev.epro.r0.V8323072410254082725.b
        L56:
            r1 = r0
            goto L5b
        L58:
            dev.epro.r0.V8323072410254082725 r0 = dev.epro.r0.V8323072410254082725.c
            goto L56
        L5b:
            dev.epro.r0.C8860366629087389742 r0 = new dev.epro.r0.C8860366629087389742     // Catch: java.lang.Throwable -> La7
            r4 = r13
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La7
            r8 = r0
            dev.epro.r0.Q18254099496673145462 r9 = new dev.epro.r0.Q18254099496673145462     // Catch: java.lang.Throwable -> La7
            r0 = 3
            r9.<init>(r2, r13, r3, r0)     // Catch: java.lang.Throwable -> La7
            dev.epro.r0.Q18254099496673145462 r10 = new dev.epro.r0.Q18254099496673145462     // Catch: java.lang.Throwable -> La7
            r0 = 0
            r10.<init>(r2, r13, r3, r0)     // Catch: java.lang.Throwable -> La7
            dev.epro.r0.P6827671117164954060 r0 = new dev.epro.r0.P6827671117164954060     // Catch: java.lang.Throwable -> La7
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = r13
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La3
            r11 = r2
            r12 = r3
            r7.t = r12     // Catch: java.lang.Throwable -> L9f
            r7.u = r11     // Catch: java.lang.Throwable -> L9f
            r7.v = r1     // Catch: java.lang.Throwable -> L9f
            r7.y = r6     // Catch: java.lang.Throwable -> L9f
            r2 = r14
            r6 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            java.lang.Object r0 = dev.epro.r0.F10757829603125321143.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9f
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r2) goto L91
            return r2
        L91:
            r2 = r11
            r3 = r12
        L93:
            dev.epro.r0.V8323072410254082725 r0 = r13.l()
            if (r0 != r1) goto L9c
            h(r3, r2, r13)
        L9c:
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            return r0
        L9f:
            r0 = move-exception
        La0:
            r2 = r11
            r3 = r12
            goto Lab
        La3:
            r0 = move-exception
            r11 = r2
            r12 = r3
            goto Lab
        La7:
            r0 = move-exception
            r12 = r2
            r11 = r3
            goto La0
        Lab:
            dev.epro.r0.V8323072410254082725 r4 = r13.l()
            if (r4 != r1) goto Lb4
            h(r3, r2, r13)
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.g(dev.epro.r0.S14157914735975478504, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final Object i(S14157914735975478504 s14157914735975478504, R14062301455140331524 r14062301455140331524) {
        Object objH1 = ((P9733793856018248168) s14157914735975478504).h1(new F1249508291672721249(this, null, (byte) 2), r14062301455140331524);
        return objH1 == Z3437138737604933638.a ? objH1 : O9245300239821758723.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if ((r0 != null ? dev.epro.r0.M18113111391818111737.C(r5, dev.epro.r0.M18113111391818111737.T(r0)) : false) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.N18340289048873574260 j(boolean r12) {
        /*
            r11 = this;
            dev.epro.r0.N1420218926656397722 r0 = r11.a
            dev.epro.r0.C8185053590072587931 r0 = r0.d()
            dev.epro.r0.V697849047308847220 r1 = r11.r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            dev.epro.r0.V697849047308847220 r2 = r11.q
            java.lang.Object r2 = r2.getValue()
            dev.epro.r0.A9296802071731955712 r2 = (dev.epro.r0.A9296802071731955712) r2
            dev.epro.r0.A9296802071731955712 r3 = dev.epro.r0.A9296802071731955712.a
            r4 = 0
            if (r2 != r3) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = r4
        L22:
            dev.epro.r0.V8323072410254082725 r3 = r11.l()
            if (r1 == 0) goto L93
            if (r2 == 0) goto L93
            long r1 = r0.d
            boolean r1 = dev.epro.r0.F12478849263529740365.d(r1)
            if (r1 == 0) goto L93
            dev.epro.r0.H9390398899829886498 r1 = r0.f
            if (r1 != 0) goto L93
            java.lang.CharSequence r0 = r0.c
            int r0 = r0.length()
            if (r0 <= 0) goto L93
            dev.epro.r0.V8323072410254082725 r0 = dev.epro.r0.V8323072410254082725.a
            if (r3 == r0) goto L76
            dev.epro.r0.M4722199849958580248 r1 = dev.epro.r0.T8598786036980488824.h()
            if (r1 == 0) goto L4e
            dev.epro.r0.F4096073349764486348 r0 = r1.e()
        L4c:
            r2 = r0
            goto L50
        L4e:
            r0 = 0
            goto L4c
        L50:
            dev.epro.r0.M4722199849958580248 r3 = dev.epro.r0.T8598786036980488824.o(r1)
            dev.epro.r0.S6349823729575121924 r0 = r11.k()     // Catch: java.lang.Throwable -> L70
            long r5 = r0.c()     // Catch: java.lang.Throwable -> L70
            dev.epro.r0.T8598786036980488824.x(r1, r3, r2)
            dev.epro.r0.B1029012102904255937 r0 = r11.q()
            if (r0 == 0) goto L6d
            dev.epro.r0.S6349823729575121924 r0 = dev.epro.r0.M18113111391818111737.T(r0)
            boolean r4 = dev.epro.r0.M18113111391818111737.C(r5, r0)
        L6d:
            if (r4 == 0) goto L93
            goto L76
        L70:
            r0 = move-exception
            r11 = r0
            dev.epro.r0.T8598786036980488824.x(r1, r3, r2)
            throw r11
        L76:
            dev.epro.r0.N18340289048873574260 r4 = new dev.epro.r0.N18340289048873574260
            if (r12 == 0) goto L84
            dev.epro.r0.S6349823729575121924 r11 = r11.k()
            long r11 = r11.c()
        L82:
            r6 = r11
            goto L8a
        L84:
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            dev.epro.r0.O16392062884302746898 r9 = dev.epro.r0.O16392062884302746898.a
            r10 = 0
            r5 = 1
            r8 = 0
            r4.<init>(r5, r6, r8, r9, r10)
            return r4
        L93:
            dev.epro.r0.N18340289048873574260 r11 = dev.epro.r0.N18340289048873574260.f
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.j(boolean):dev.epro.r0.N18340289048873574260");
    }

    public final S6349823729575121924 k() {
        Q17957571128037780363 q17957571128037780363C = this.b.c();
        return q17957571128037780363C == null ? S6349823729575121924.e : a(q17957571128037780363C, this.a.d());
    }

    public final V8323072410254082725 l() {
        return (V8323072410254082725) this.p.getValue();
    }

    public final boolean m() {
        return this.i;
    }

    public final long n() {
        V697849047308847220 v697849047308847220 = this.f206o;
        if ((((L2216691091636065972) v697849047308847220.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        V697849047308847220 v6978490473088472202 = this.n;
        if ((((L2216691091636065972) v6978490473088472202.getValue()).a & 9223372034707292159L) == 9205357640488583168L) {
            return V4416135141588678913.m(this.b, ((L2216691091636065972) v697849047308847220.getValue()).a);
        }
        long j = ((L2216691091636065972) v697849047308847220.getValue()).a;
        long j2 = ((L2216691091636065972) v6978490473088472202.getValue()).a;
        B1029012102904255937 b1029012102904255937Q = q();
        return L2216691091636065972.f(j, L2216691091636065972.e(j2, b1029012102904255937Q != null ? b1029012102904255937Q.j(0L) : 9205357640488583168L));
    }

    public final long o(boolean z) {
        long j;
        Q17957571128037780363 q17957571128037780363C = this.b.c();
        if (q17957571128037780363C == null) {
            return 0L;
        }
        long j2 = this.a.d().d;
        if (z) {
            int i = F12478849263529740365.c;
            j = j2 >> 32;
        } else {
            int i2 = F12478849263529740365.c;
            j = 4294967295L & j2;
        }
        return E17665849472693074628.e(q17957571128037780363C, (int) j, z, F12478849263529740365.h(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.N18340289048873574260 p(boolean r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L7
            dev.epro.r0.V8323072410254082725 r1 = dev.epro.r0.V8323072410254082725.b
            goto L9
        L7:
            dev.epro.r0.V8323072410254082725 r1 = dev.epro.r0.V8323072410254082725.c
        L9:
            dev.epro.r0.I12071840179596922896 r2 = r0.b
            dev.epro.r0.Q17957571128037780363 r2 = r2.c()
            dev.epro.r0.N18340289048873574260 r3 = dev.epro.r0.N18340289048873574260.f
            if (r2 != 0) goto L14
            return r3
        L14:
            dev.epro.r0.N1420218926656397722 r4 = r0.a
            dev.epro.r0.C8185053590072587931 r5 = r4.d()
            long r5 = r5.d
            boolean r7 = dev.epro.r0.F12478849263529740365.d(r5)
            if (r7 == 0) goto L23
            return r3
        L23:
            long r7 = r17.o(r18)
            dev.epro.r0.V697849047308847220 r9 = r0.q
            java.lang.Object r9 = r9.getValue()
            dev.epro.r0.A9296802071731955712 r9 = (dev.epro.r0.A9296802071731955712) r9
            dev.epro.r0.A9296802071731955712 r10 = dev.epro.r0.A9296802071731955712.a
            if (r9 != r10) goto L9e
            dev.epro.r0.V8323072410254082725 r9 = r0.l()
            r10 = 0
            if (r9 == r1) goto L4c
            dev.epro.r0.B1029012102904255937 r1 = r0.q()
            if (r1 == 0) goto L49
            dev.epro.r0.S6349823729575121924 r1 = dev.epro.r0.M18113111391818111737.T(r1)
            boolean r1 = dev.epro.r0.M18113111391818111737.C(r7, r1)
            goto L4a
        L49:
            r1 = r10
        L4a:
            if (r1 == 0) goto L9e
        L4c:
            dev.epro.r0.C8185053590072587931 r1 = r4.d()
            dev.epro.r0.H9390398899829886498 r1 = r1.f
            if (r1 != 0) goto L9e
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            if (r18 == 0) goto L61
            long r9 = r5 >> r1
            int r9 = (int) r9
            goto L6a
        L61:
            long r11 = r5 & r3
            int r9 = (int) r11
            int r9 = r9 + (-1)
            int r9 = java.lang.Math.max(r9, r10)
        L6a:
            dev.epro.r0.O16392062884302746898 r15 = r2.a(r9)
            boolean r16 = dev.epro.r0.F12478849263529740365.h(r5)
            if (r19 == 0) goto L84
            dev.epro.r0.B1029012102904255937 r0 = r0.q()
            if (r0 == 0) goto L82
            dev.epro.r0.S6349823729575121924 r0 = dev.epro.r0.M18113111391818111737.T(r0)
            long r7 = dev.epro.r0.V4416135141588678913.i(r7, r0)
        L82:
            r12 = r7
            goto L8a
        L84:
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L82
        L8a:
            if (r18 == 0) goto L90
            long r0 = r5 >> r1
        L8e:
            int r0 = (int) r0
            goto L93
        L90:
            long r0 = r5 & r3
            goto L8e
        L93:
            dev.epro.r0.N18340289048873574260 r10 = new dev.epro.r0.N18340289048873574260
            r11 = 1
            float r14 = dev.epro.r0.J10256772239794345968.h(r2, r0)
            r10.<init>(r11, r12, r14, r15, r16)
            return r10
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.p(boolean, boolean):dev.epro.r0.N18340289048873574260");
    }

    public final B1029012102904255937 q() {
        B1029012102904255937 b1029012102904255937E = this.b.e();
        if (b1029012102904255937E == null || !b1029012102904255937E.C()) {
            return null;
        }
        return b1029012102904255937E;
    }

    public final void r() {
        S16869475527240117894 s16869475527240117894 = this.f;
        if (s16869475527240117894 == null) {
            return;
        }
        N1420218926656397722 n1420218926656397722 = this.a;
        CharSequence charSequence = n1420218926656397722.d().c;
        long j = n1420218926656397722.d().d;
        if (charSequence.length() <= 0 || F12478849263529740365.d(j)) {
            return;
        }
        R7033599853981556291.E(this.e, null, L856869997670741194.d, new O11111548397065333129(s16869475527240117894, charSequence, j, this, (R4833348786910499294) null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(boolean r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dev.epro.r0.E15242304253675367719
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.E15242304253675367719 r0 = (dev.epro.r0.E15242304253675367719) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.E15242304253675367719 r0 = new dev.epro.r0.E15242304253675367719
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.t
            int r1 = r0.v
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 0
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L51
            if (r1 == r4) goto L4d
            r7 = 2
            r4 = 3
            if (r1 == r7) goto L36
            if (r1 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r8)
            return r2
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L36:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.P444548812388912419 r8 = (dev.epro.r0.P444548812388912419) r8
            if (r8 != 0) goto L47
            r0.v = r4
            r7 = 0
            java.lang.Object r6 = r6.t(r7, r0)
            if (r6 != r5) goto L6c
            goto L6b
        L47:
            android.content.ClipData r6 = r8.a
            r6.getDescription()
            throw r3
        L4d:
            dev.epro.r0.E17665849472693074628.k(r8)
            return r2
        L51:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.B13729205492206812220 r8 = r6.m
            if (r8 == 0) goto L63
            java.lang.Object r8 = r8.invoke()
            if (r8 != 0) goto L5f
            goto L63
        L5f:
            dev.epro.r0.Z3383101362411723454.s()
            return r3
        L63:
            r0.v = r4
            java.lang.Object r6 = r6.t(r7, r0)
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.s(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r10 == r7) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(boolean r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof dev.epro.r0.D17666623731319242704
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.D17666623731319242704 r0 = (dev.epro.r0.D17666623731319242704) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.D17666623731319242704 r0 = new dev.epro.r0.D17666623731319242704
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 0
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            r5 = 2
            r6 = 1
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L36
            if (r1 != r5) goto L30
            boolean r9 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L6d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L36:
            boolean r9 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L4e
        L3c:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.L3957284589981577691 r10 = r8.g
            r0.t = r9
            r0.w = r6
            dev.epro.r0.T2834513763987957608 r10 = (dev.epro.r0.T2834513763987957608) r10
            dev.epro.r0.P444548812388912419 r10 = r10.a()
            if (r10 != r7) goto L4e
            goto L6c
        L4e:
            dev.epro.r0.P444548812388912419 r10 = (dev.epro.r0.P444548812388912419) r10
            if (r10 == 0) goto L79
            r0.t = r9
            r0.w = r5
            android.content.ClipData r10 = r10.a
            android.content.ClipData$Item r10 = r10.getItemAt(r3)
            if (r10 == 0) goto L69
            java.lang.CharSequence r10 = r10.getText()
            if (r10 == 0) goto L69
            java.lang.String r10 = r10.toString()
            goto L6a
        L69:
            r10 = r2
        L6a:
            if (r10 != r7) goto L6d
        L6c:
            return r7
        L6d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L72
            goto L79
        L72:
            dev.epro.r0.N1420218926656397722 r8 = r8.a
            r0 = 10
            dev.epro.r0.N1420218926656397722.h(r8, r10, r3, r9, r0)
        L79:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.t(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r20) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.u(long):boolean");
    }

    public final void v(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void x(S5779100572589057142 s5779100572589057142) {
        this.s.setValue(s5779100572589057142);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof dev.epro.r0.A9668925745135740491
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.A9668925745135740491 r0 = (dev.epro.r0.A9668925745135740491) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.A9668925745135740491 r0 = new dev.epro.r0.A9668925745135740491
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.v
            dev.epro.r0.J13325455942816235854 r2 = r8.d
            dev.epro.r0.S5779100572589057142 r3 = dev.epro.r0.S5779100572589057142.a
            dev.epro.r0.V697849047308847220 r4 = r8.s
            r5 = 0
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 != r7) goto L2f
            dev.epro.r0.E17665849472693074628.k(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4a
        L2d:
            r9 = move-exception
            goto L68
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r5
        L35:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.E13942609761711486177 r9 = new dev.epro.r0.E13942609761711486177     // Catch: java.lang.Throwable -> L2d
            r1 = 25
            r9.<init>(r8, r5, r1)     // Catch: java.lang.Throwable -> L2d
            r0.v = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = dev.epro.r0.O8620973563946607355.B(r9, r0)     // Catch: java.lang.Throwable -> L2d
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r9 != r0) goto L4a
            return r0
        L4a:
            dev.epro.r0.Q15035754882231748864 r9 = (dev.epro.r0.Q15035754882231748864) r9     // Catch: java.lang.Throwable -> L2d
            r8.w(r6)
            java.lang.Object r8 = r4.getValue()
            dev.epro.r0.S5779100572589057142 r8 = (dev.epro.r0.S5779100572589057142) r8
            if (r8 == r3) goto L65
            dev.epro.r0.J8749144669333390587 r8 = r2.a
            if (r8 == 0) goto L65
            dev.epro.r0.X7175349259954592591 r9 = r8.u
            if (r9 != 0) goto L60
            goto L65
        L60:
            r9.c(r5)
            r8.u = r5
        L65:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        L68:
            r8.w(r6)
            java.lang.Object r8 = r4.getValue()
            dev.epro.r0.S5779100572589057142 r8 = (dev.epro.r0.S5779100572589057142) r8
            if (r8 == r3) goto L81
            dev.epro.r0.J8749144669333390587 r8 = r2.a
            if (r8 == 0) goto L81
            dev.epro.r0.X7175349259954592591 r0 = r8.u
            if (r0 != 0) goto L7c
            goto L81
        L7c:
            r0.c(r5)
            r8.u = r5
        L81:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D2717688760023469083.y(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final O9245300239821758723 z() {
        ClipDescription primaryClipDescription;
        Q6203700555324584864 q6203700555324584864 = this.y;
        L3957284589981577691 l3957284589981577691 = (L3957284589981577691) q6203700555324584864.b;
        boolean z = false;
        if (J8045362843799184672.S(l3957284589981577691).hasPrimaryClip() && (primaryClipDescription = J8045362843799184672.S(l3957284589981577691).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        q6203700555324584864.a = z;
        return O9245300239821758723.a;
    }
}
