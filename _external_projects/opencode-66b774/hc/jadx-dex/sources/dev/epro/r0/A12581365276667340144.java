package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A12581365276667340144 implements dev.epro.r0.Y1249283782686518426 {
    public final dev.epro.r0.H11725168162114556860 a;
    public dev.epro.r0.Y5209789131793062978 b;
    public dev.epro.r0.V7541548809599293348 c;
    public int d;
    public int e;
    public final dev.epro.r0.A4559761392562572984 f;
    public final dev.epro.r0.A4559761392562572984 g;
    public final dev.epro.r0.M8258878446506793937 h;
    public final dev.epro.r0.A12484292429157515813 i;
    public final dev.epro.r0.A4559761392562572984 j;
    public final dev.epro.r0.R4355002902395871978 k;
    public final dev.epro.r0.A4559761392562572984 l;
    public final dev.epro.r0.D389890677992184566 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f149o;
    public final java.lang.String p;

    public A12581365276667340144(dev.epro.r0.H11725168162114556860 h11725168162114556860, dev.epro.r0.V7541548809599293348 v7541548809599293348) {
        this.a = h11725168162114556860;
        this.c = v7541548809599293348;
        long[] jArr = dev.epro.r0.X4026756943680612204.a;
        this.f = new dev.epro.r0.A4559761392562572984();
        this.g = new dev.epro.r0.A4559761392562572984();
        this.h = new dev.epro.r0.M8258878446506793937(this);
        this.i = new dev.epro.r0.A12484292429157515813(this);
        this.j = new dev.epro.r0.A4559761392562572984();
        this.k = new dev.epro.r0.R4355002902395871978();
        this.l = new dev.epro.r0.A4559761392562572984();
        this.m = new dev.epro.r0.D389890677992184566(0, new java.lang.Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void b(dev.epro.r0.C10361380324006518393 c10361380324006518393) {
        dev.epro.r0.E13273723708836014930 e13273723708836014930;
        dev.epro.r0.Y979168416190219423 y979168416190219423 = c10361380324006518393.f;
        if (y979168416190219423 != null) {
            y979168416190219423.h.set(dev.epro.r0.Z3361759032029918772.b);
            dev.epro.r0.E1005111105761972824 e1005111105761972824 = y979168416190219423.k;
            if (((dev.epro.r0.E13273723708836014930) e1005111105761972824.g).h()) {
                e13273723708836014930 = (dev.epro.r0.E13273723708836014930) e1005111105761972824.g;
                dev.epro.r0.E13273723708836014930 e132737237088360149302 = dev.epro.r0.L12621230156277355451.a;
                e1005111105761972824.g = new dev.epro.r0.E13273723708836014930();
                ((dev.epro.r0.D389890677992184566) e1005111105761972824.c).i();
            } else {
                e13273723708836014930 = null;
            }
            e1005111105761972824.c();
            dev.epro.r0.S12944751221596631194 s12944751221596631194 = y979168416190219423.a;
            s12944751221596631194.q = null;
            if (e13273723708836014930 != null) {
                s12944751221596631194.u.i = e13273723708836014930;
                s12944751221596631194.w = (byte) 2;
            }
            c10361380324006518393.f = null;
            dev.epro.r0.S12944751221596631194 s129447512215966311942 = c10361380324006518393.c;
            if (s129447512215966311942 != null) {
                s129447512215966311942.p();
            }
            c10361380324006518393.c = null;
        }
    }

    public final void a(dev.epro.r0.C10361380324006518393 c10361380324006518393, boolean z) {
        dev.epro.r0.Y979168416190219423 y979168416190219423 = c10361380324006518393.f;
        if (y979168416190219423 != null) {
            dev.epro.r0.M4722199849958580248 m4722199849958580248H = dev.epro.r0.T8598786036980488824.h();
            dev.epro.r0.F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            dev.epro.r0.M4722199849958580248 m4722199849958580248O = dev.epro.r0.T8598786036980488824.o(m4722199849958580248H);
            try {
                dev.epro.r0.H11725168162114556860 h11725168162114556860 = this.a;
                h11725168162114556860.q = true;
                if (z) {
                    while (!y979168416190219423.c()) {
                        try {
                            y979168416190219423.e(new dev.epro.r0.D11988991656201568495((byte) 4));
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                y979168416190219423.a();
                c10361380324006518393.f = null;
                h11725168162114556860.q = false;
            } finally {
                dev.epro.r0.T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            }
        }
    }

    public final dev.epro.r0.N12973910657118401350 c(java.lang.Object obj) {
        return !this.a.H() ? new dev.epro.r0.V10811459894919367810() : new dev.epro.r0.S17347912324758884158(this, obj);
    }

    public final void d(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        dev.epro.r0.K7217096618580727896 k7217096618580727896O = this.a.o();
        dev.epro.r0.K7217096618580727896 k7217096618580727896 = k7217096618580727896O;
        int i2 = (((dev.epro.r0.D389890677992184566) k7217096618580727896.b).c - this.f149o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    java.lang.Object objG = this.f.g((dev.epro.r0.H11725168162114556860) k7217096618580727896.get(i3));
                    objG.getClass();
                    ((dev.epro.r0.K18075763046227786881) this.k.b).a(((dev.epro.r0.C10361380324006518393) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.c(this.k);
            dev.epro.r0.M4722199849958580248 m4722199849958580248H = dev.epro.r0.T8598786036980488824.h();
            dev.epro.r0.F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            dev.epro.r0.M4722199849958580248 m4722199849958580248O = dev.epro.r0.T8598786036980488824.o(m4722199849958580248H);
            z = false;
            while (i2 >= i) {
                try {
                    dev.epro.r0.H11725168162114556860 h11725168162114556860 = (dev.epro.r0.H11725168162114556860) k7217096618580727896O.get(i2);
                    java.lang.Object objG2 = this.f.g(h11725168162114556860);
                    objG2.getClass();
                    dev.epro.r0.C10361380324006518393 c10361380324006518393 = (dev.epro.r0.C10361380324006518393) objG2;
                    java.lang.Object obj = c10361380324006518393.a;
                    if (((dev.epro.r0.K18075763046227786881) this.k.b).c(obj)) {
                        this.n++;
                        if (((java.lang.Boolean) c10361380324006518393.g.getValue()).booleanValue()) {
                            dev.epro.r0.R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
                            dev.epro.r0.T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
                            dev.epro.r0.Q8181337811809788579 q8181337811809788579 = dev.epro.r0.Q8181337811809788579.c;
                            t8458668874796040341.l = q8181337811809788579;
                            dev.epro.r0.L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
                            if (l8383256292871170816 != null) {
                                l8383256292871170816.j = q8181337811809788579;
                            }
                            l(c10361380324006518393, false);
                            if (c10361380324006518393.h) {
                                z = true;
                            }
                        }
                    } else {
                        dev.epro.r0.H11725168162114556860 h117251681621145568602 = this.a;
                        h117251681621145568602.q = true;
                        this.f.l(h11725168162114556860);
                        dev.epro.r0.S12944751221596631194 s12944751221596631194 = c10361380324006518393.c;
                        if (s12944751221596631194 != null) {
                            s12944751221596631194.p();
                        }
                        this.a.R(i2, 1);
                        h117251681621145568602.q = false;
                    }
                    this.g.l(obj);
                    i2--;
                } catch (java.lang.Throwable th) {
                    dev.epro.r0.T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                    throw th;
                }
            }
            dev.epro.r0.T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
        } else {
            z = false;
        }
        if (z) {
            synchronized (dev.epro.r0.D459204867321966484.c) {
                dev.epro.r0.E13273723708836014930 e13273723708836014930 = dev.epro.r0.D459204867321966484.j.h;
                if (e13273723708836014930 != null) {
                    if (e13273723708836014930.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                dev.epro.r0.D459204867321966484.c();
            }
        }
        h();
    }

    public final void e(java.lang.Object obj) {
        h();
        dev.epro.r0.H11725168162114556860 h11725168162114556860 = (dev.epro.r0.H11725168162114556860) this.j.l(obj);
        dev.epro.r0.H11725168162114556860 h117251681621145568602 = this.a;
        if (h11725168162114556860 != null) {
            if (this.f149o <= 0) {
                dev.epro.r0.P753981624812481271.b("No pre-composed items to dispose");
            }
            int iK = ((dev.epro.r0.D389890677992184566) h117251681621145568602.o().b).k(h11725168162114556860);
            if (iK < ((dev.epro.r0.D389890677992184566) h117251681621145568602.o().b).c - this.f149o) {
                dev.epro.r0.P753981624812481271.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.f149o--;
            dev.epro.r0.C10361380324006518393 c10361380324006518393 = (dev.epro.r0.C10361380324006518393) this.f.g(h11725168162114556860);
            if (c10361380324006518393 != null) {
                b(c10361380324006518393);
            }
            int i = (((dev.epro.r0.D389890677992184566) h117251681621145568602.o().b).c - this.f149o) - this.n;
            j(iK, i);
            d(i);
        }
        if (this.m.j(obj)) {
            dev.epro.r0.H11725168162114556860.W(h117251681621145568602, true, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            dev.epro.r0.H11725168162114556860 r2 = r0.a
            r2.q = r1
            dev.epro.r0.A4559761392562572984 r1 = r0.f
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            dev.epro.r0.C10361380324006518393 r13 = (dev.epro.r0.C10361380324006518393) r13
            dev.epro.r0.S12944751221596631194 r13 = r13.c
            if (r13 == 0) goto L47
            r13.p()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.Q()
            r2.q = r6
            r1.a()
            dev.epro.r0.A4559761392562572984 r1 = r0.g
            r1.a()
            r0.f149o = r6
            r0.n = r6
            dev.epro.r0.A4559761392562572984 r1 = r0.j
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A12581365276667340144.f():void");
    }

    public final void g() {
        i(true);
    }

    public final void h() {
        int i = ((dev.epro.r0.D389890677992184566) this.a.o().b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            dev.epro.r0.P753981624812481271.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.n;
        int i4 = this.f149o;
        if ((i - i3) - i4 < 0) {
            java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbP.append(i4);
            dev.epro.r0.P753981624812481271.a(sbP.toString());
        }
        int i5 = this.j.e;
        int i6 = this.f149o;
        if (i5 == i6) {
            return;
        }
        dev.epro.r0.P753981624812481271.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.f149o = 0;
        this.j.a();
        dev.epro.r0.K7217096618580727896 k7217096618580727896O = this.a.o();
        int i = ((dev.epro.r0.D389890677992184566) k7217096618580727896O.b).c;
        if (this.n != i) {
            this.n = i;
            dev.epro.r0.M4722199849958580248 m4722199849958580248H = dev.epro.r0.T8598786036980488824.h();
            dev.epro.r0.F4096073349764486348 f4096073349764486348E = m4722199849958580248H != null ? m4722199849958580248H.e() : null;
            dev.epro.r0.M4722199849958580248 m4722199849958580248O = dev.epro.r0.T8598786036980488824.o(m4722199849958580248H);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    dev.epro.r0.H11725168162114556860 h11725168162114556860 = (dev.epro.r0.H11725168162114556860) k7217096618580727896O.get(i2);
                    dev.epro.r0.C10361380324006518393 c10361380324006518393 = (dev.epro.r0.C10361380324006518393) this.f.g(h11725168162114556860);
                    if (c10361380324006518393 != null && ((java.lang.Boolean) c10361380324006518393.g.getValue()).booleanValue()) {
                        dev.epro.r0.R8000300579679385019 r8000300579679385019 = h11725168162114556860.G;
                        dev.epro.r0.T8458668874796040341 t8458668874796040341 = r8000300579679385019.p;
                        dev.epro.r0.Q8181337811809788579 q8181337811809788579 = dev.epro.r0.Q8181337811809788579.c;
                        t8458668874796040341.l = q8181337811809788579;
                        dev.epro.r0.L8383256292871170816 l8383256292871170816 = r8000300579679385019.q;
                        if (l8383256292871170816 != null) {
                            l8383256292871170816.j = q8181337811809788579;
                        }
                        l(c10361380324006518393, z);
                        c10361380324006518393.a = dev.epro.r0.Z860808776098365610.i;
                    }
                } catch (java.lang.Throwable th) {
                    dev.epro.r0.T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
                    throw th;
                }
            }
            dev.epro.r0.T8598786036980488824.x(m4722199849958580248H, m4722199849958580248O, f4096073349764486348E);
            this.g.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        dev.epro.r0.H11725168162114556860 h11725168162114556860 = this.a;
        h11725168162114556860.q = true;
        h11725168162114556860.M(i, i2, 1);
        h11725168162114556860.q = false;
    }

    public final void k(java.lang.Object obj, dev.epro.r0.L12639328004344855510 l12639328004344855510, boolean z) {
        dev.epro.r0.H11725168162114556860 h11725168162114556860 = this.a;
        if (h11725168162114556860.H()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.l.l(obj);
            dev.epro.r0.A4559761392562572984 a4559761392562572984 = this.j;
            java.lang.Object objG = a4559761392562572984.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).k(objG), ((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).c);
                    this.f149o++;
                } else {
                    int i = ((dev.epro.r0.D389890677992184566) h11725168162114556860.o().b).c;
                    dev.epro.r0.H11725168162114556860 h117251681621145568602 = new dev.epro.r0.H11725168162114556860(2);
                    h11725168162114556860.q = true;
                    h11725168162114556860.B(i, h117251681621145568602);
                    h11725168162114556860.q = false;
                    this.f149o++;
                    objG = h117251681621145568602;
                }
                a4559761392562572984.n(obj, objG);
            }
            m((dev.epro.r0.H11725168162114556860) objG, obj, z, l12639328004344855510);
        }
    }

    public final void l(dev.epro.r0.C10361380324006518393 c10361380324006518393, boolean z) {
        dev.epro.r0.S12944751221596631194 s12944751221596631194;
        if (z || !c10361380324006518393.h) {
            c10361380324006518393.g = dev.epro.r0.V4416135141588678913.t(java.lang.Boolean.FALSE);
        } else {
            c10361380324006518393.g.setValue(java.lang.Boolean.FALSE);
        }
        if (c10361380324006518393.f != null) {
            b(c10361380324006518393);
            return;
        }
        if (z) {
            dev.epro.r0.S12944751221596631194 s129447512215966311942 = c10361380324006518393.c;
            if (s129447512215966311942 != null) {
                s129447512215966311942.o();
                return;
            }
            return;
        }
        dev.epro.r0.S7974369370986781936 outOfFrameExecutor = dev.epro.r0.P12010630787994328224.a(this.a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.I(new dev.epro.r0.W2269277550458425547(c10361380324006518393, (byte) 8));
        } else {
            if (c10361380324006518393.h || (s12944751221596631194 = c10361380324006518393.c) == null) {
                return;
            }
            s12944751221596631194.o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:78:0x011b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:72:0x0108, B:76:0x0112, B:75:0x010d, B:77:0x0118, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:81:0x0125, B:82:0x012f), top: B:85:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(dev.epro.r0.H11725168162114556860 r10, java.lang.Object r11, boolean r12, dev.epro.r0.L12639328004344855510 r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A12581365276667340144.m(dev.epro.r0.H11725168162114556860, java.lang.Object, boolean, dev.epro.r0.L12639328004344855510):void");
    }

    public final dev.epro.r0.H11725168162114556860 n(java.lang.Object obj) {
        dev.epro.r0.A4559761392562572984 a4559761392562572984;
        int i;
        if (this.n == 0) {
            return null;
        }
        dev.epro.r0.K7217096618580727896 k7217096618580727896O = this.a.o();
        int i2 = ((dev.epro.r0.D389890677992184566) k7217096618580727896O.b).c - this.f149o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            a4559761392562572984 = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            java.lang.Object objG = a4559761392562572984.g((dev.epro.r0.H11725168162114556860) k7217096618580727896O.get(i5));
            objG.getClass();
            if (dev.epro.r0.S10823041268949770285.t(((dev.epro.r0.C10361380324006518393) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                java.lang.Object objG2 = a4559761392562572984.g((dev.epro.r0.H11725168162114556860) k7217096618580727896O.get(i4));
                objG2.getClass();
                dev.epro.r0.C10361380324006518393 c10361380324006518393 = (dev.epro.r0.C10361380324006518393) objG2;
                java.lang.Object obj2 = c10361380324006518393.a;
                if (obj2 == dev.epro.r0.Z860808776098365610.i || this.c.e(obj, obj2)) {
                    c10361380324006518393.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.n--;
        dev.epro.r0.H11725168162114556860 h11725168162114556860 = (dev.epro.r0.H11725168162114556860) k7217096618580727896O.get(i3);
        java.lang.Object objG3 = a4559761392562572984.g(h11725168162114556860);
        objG3.getClass();
        dev.epro.r0.C10361380324006518393 c103613803240065183932 = (dev.epro.r0.C10361380324006518393) objG3;
        c103613803240065183932.g = dev.epro.r0.V4416135141588678913.t(java.lang.Boolean.TRUE);
        c103613803240065183932.e = true;
        c103613803240065183932.d = true;
        return h11725168162114556860;
    }
}
