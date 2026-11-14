package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class dq2 extends ads_mobile_sdk.wo2 {
    public static final /* synthetic */ dev.epro.r0.D15596191924284547207[] C = {dev.epro.r0.T1335862270807194835.f("refreshCallback", "getRefreshCallback()Lcom/google/android/libraries/ads/mobile/sdk/banner/BannerAdRefreshCallback;", ads_mobile_sdk.dq2.class)};
    public dev.epro.r0.X7175349259954592591 A;
    public android.view.ViewGroup B;
    public final android.content.Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final dev.epro.r0.G8001132634698687269 f27o;
    public final dev.epro.r0.G8001132634698687269 p;
    public final dev.epro.r0.V2597580950516131749 q;
    public final ads_mobile_sdk.lu2 r;
    public final ads_mobile_sdk.dj0 s;
    public final dev.epro.r0.N7531780047102116757 t;
    public final ads_mobile_sdk.c7 u;
    public final ads_mobile_sdk.ii v;
    public final java.util.concurrent.atomic.AtomicBoolean w;
    public final java.util.concurrent.atomic.AtomicBoolean x;
    public ads_mobile_sdk.qd1 y;
    public ads_mobile_sdk.vw2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(android.content.Context context, dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.G8001132634698687269 g80011326346986872692, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.bb0 bb0Var, ads_mobile_sdk.lu2 lu2Var, ads_mobile_sdk.dj0 dj0Var, dev.epro.r0.N7531780047102116757 n7531780047102116757, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.kz2 kz2Var, java.lang.String str, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.b41 b41Var, boolean z, ads_mobile_sdk.b71 b71Var, dev.epro.r0.E14944621269592904532 e14944621269592904532, ads_mobile_sdk.xj xjVar) {
        super(w5797197595347441198, w57971975953474411982, mi3Var, jr0Var, kz2Var, str, qw2Var, n7531780047102116757, z, b41Var, b71Var, e14944621269592904532, xjVar);
        bb0Var.getClass();
        this.n = context;
        this.f27o = g8001132634698687269;
        this.p = g80011326346986872692;
        this.q = bb0Var;
        this.r = lu2Var;
        this.s = dj0Var;
        this.t = n7531780047102116757;
        this.u = new ads_mobile_sdk.c7((byte) 13, false);
        this.v = new ads_mobile_sdk.ii((java.lang.Object) null, (java.lang.Object) null);
        this.w = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.x = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.M16184408391440927034 r13, dev.epro.r0.F11004654978627682545 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            r12 = this;
            boolean r1 = r15 instanceof ads_mobile_sdk.tp2
            if (r1 == 0) goto L14
            r1 = r15
            ads_mobile_sdk.tp2 r1 = (ads_mobile_sdk.tp2) r1
            int r4 = r1.e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r1.e = r4
        L12:
            r6 = r1
            goto L1a
        L14:
            ads_mobile_sdk.tp2 r1 = new ads_mobile_sdk.tp2
            r1.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r6.c
            int r1 = r6.e
            r7 = 4
            r4 = 3
            r5 = 2
            r8 = 1
            dev.epro.r0.O9245300239821758723 r9 = dev.epro.r0.O9245300239821758723.a
            r10 = 0
            dev.epro.r0.Z3437138737604933638 r11 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L50
            if (r1 == r8) goto L48
            if (r1 == r5) goto L40
            if (r1 == r4) goto L3c
            if (r1 != r7) goto L35
            dev.epro.r0.E17665849472693074628.k(r0)
            return r9
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            r0 = 0
            return r0
        L3c:
            dev.epro.r0.E17665849472693074628.k(r0)
            return r9
        L40:
            dev.epro.r0.M16184408391440927034 r1 = r6.b
            ads_mobile_sdk.dq2 r2 = r6.a
            dev.epro.r0.E17665849472693074628.k(r0)
            goto L8d
        L48:
            dev.epro.r0.M16184408391440927034 r1 = r6.b
            ads_mobile_sdk.dq2 r2 = r6.a
            dev.epro.r0.E17665849472693074628.k(r0)
            goto L79
        L50:
            dev.epro.r0.E17665849472693074628.k(r0)
            boolean r0 = r13 instanceof ads_mobile_sdk.xu0
            if (r0 == 0) goto La7
            r0 = r13
            ads_mobile_sdk.xu0 r0 = (ads_mobile_sdk.xu0) r0
            java.lang.Object r0 = r0.b
            ads_mobile_sdk.od1 r0 = (ads_mobile_sdk.od1) r0
            ads_mobile_sdk.mi3 r1 = r0.a()
            ads_mobile_sdk.mi3 r7 = r12.c
            r7.a(r1)
            r6.a = r12
            r6.b = r13
            r6.e = r8
            r0.getClass()
            java.lang.Object r0 = ads_mobile_sdk.vb1.a(r0, r6)
            if (r0 != r11) goto L77
            goto Lc3
        L77:
            r2 = r12
            r1 = r13
        L79:
            r0 = r1
            ads_mobile_sdk.xu0 r0 = (ads_mobile_sdk.xu0) r0
            java.lang.Object r0 = r0.b
            ads_mobile_sdk.od1 r0 = (ads_mobile_sdk.od1) r0
            r6.a = r2
            r6.b = r1
            r6.e = r5
            java.lang.Object r0 = r2.b(r0, r6)
            if (r0 != r11) goto L8d
            goto Lc3
        L8d:
            dev.epro.r0.W5797197595347441198 r0 = r2.b
            dev.epro.r0.G8001132634698687269 r0 = r0.h()
            dev.epro.r0.E13942609761711486177 r3 = new dev.epro.r0.E13942609761711486177
            r5 = 19
            r3.<init>(r2, r1, r10, r5)
            r6.a = r10
            r6.b = r10
            r6.e = r4
            java.lang.Object r0 = dev.epro.r0.R7033599853981556291.d0(r0, r3, r6)
            if (r0 != r11) goto Lc4
            goto Lc3
        La7:
            boolean r0 = r13 instanceof ads_mobile_sdk.pu0
            if (r0 == 0) goto Lc4
            dev.epro.r0.W5797197595347441198 r0 = r12.b
            dev.epro.r0.G8001132634698687269 r8 = r0.h()
            ads_mobile_sdk.aq2 r0 = new ads_mobile_sdk.aq2
            r5 = 0
            r2 = r12
            r3 = r13
            r1 = r14
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e = r7
            java.lang.Object r0 = dev.epro.r0.R7033599853981556291.d0(r8, r0, r6)
            if (r0 != r11) goto Lc4
        Lc3:
            return r11
        Lc4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.a(dev.epro.r0.M16184408391440927034, dev.epro.r0.F11004654978627682545, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.od1 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            r12 = this;
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            java.lang.String r1 = "The backing field has not yet been initialized."
            ads_mobile_sdk.c7 r3 = r12.u
            boolean r4 = r14 instanceof ads_mobile_sdk.bq2
            if (r4 == 0) goto L1a
            r4 = r14
            ads_mobile_sdk.bq2 r4 = (ads_mobile_sdk.bq2) r4
            int r5 = r4.d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r5 & r7
            if (r8 == 0) goto L1a
            int r5 = r5 - r7
            r4.d = r5
        L18:
            r7 = r4
            goto L20
        L1a:
            ads_mobile_sdk.bq2 r4 = new ads_mobile_sdk.bq2
            r4.<init>(r12, r14)
            goto L18
        L20:
            java.lang.Object r0 = r7.b
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            int r4 = r7.d
            r5 = 0
            r9 = 1
            if (r4 == 0) goto L39
            if (r4 != r9) goto L33
            ads_mobile_sdk.od1 r1 = r7.a
            dev.epro.r0.E17665849472693074628.k(r0)
            goto La9
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r5
        L39:
            dev.epro.r0.E17665849472693074628.k(r0)
            java.lang.Object r0 = r3.a
            r4 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r3.a(r1)
            ads_mobile_sdk.od1 r0 = (ads_mobile_sdk.od1) r0
            goto L49
        L48:
            r0 = r4
        L49:
            r13.getClass()
            monitor-enter(r3)
            r3.a = r13     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r3)
            if (r0 == 0) goto L8f
            ads_mobile_sdk.eg2 r10 = r0.c()
            java.util.concurrent.atomic.AtomicLong r10 = r10.a
            long r10 = r10.get()
            java.lang.Object r1 = r3.a(r1)
            ads_mobile_sdk.od1 r1 = (ads_mobile_sdk.od1) r1
            ads_mobile_sdk.eg2 r1 = r1.c()
            java.util.concurrent.atomic.AtomicLong r1 = r1.a
            r1.set(r10)
            ads_mobile_sdk.ih0 r1 = r0.j()
            monitor-enter(r1)
            dev.epro.r0.P10281324844086052649 r3 = r1.g     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r1)
            ads_mobile_sdk.ih0 r1 = r0.j()
            r1.a(r5)
            ads_mobile_sdk.c7 r1 = r12.u
            java.lang.String r5 = "The backing field has not yet been initialized."
            java.lang.Object r1 = r1.a(r5)
            ads_mobile_sdk.od1 r1 = (ads_mobile_sdk.od1) r1
            ads_mobile_sdk.ih0 r1 = r1.j()
            r1.a(r3)
            goto L8f
        L8c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L8f:
            r7.a = r0
            r7.d = r9
            dev.epro.r0.G8001132634698687269 r9 = r12.f27o
            r1 = r0
            dev.epro.r0.H4546125934900659656 r0 = new dev.epro.r0.H4546125934900659656
            r5 = 1
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r0 = dev.epro.r0.R7033599853981556291.d0(r9, r0, r7)
            if (r0 != r8) goto La5
            goto La6
        La5:
            r0 = r6
        La6:
            if (r0 != r8) goto La9
            return r8
        La9:
            if (r1 == 0) goto Lae
            r1.destroy()
        Lae:
            return r6
        Laf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.b(ads_mobile_sdk.od1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wo2
    public final java.lang.Object c(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        java.lang.Object objA;
        return (this.y == null || (objA = this.r.a(this, this.l, k14749510448791472029)) != dev.epro.r0.Z3437138737604933638.a) ? dev.epro.r0.O9245300239821758723.a : objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.mp2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.mp2 r0 = (ads_mobile_sdk.mp2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.mp2 r0 = new ads_mobile_sdk.mp2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ads_mobile_sdk.dq2 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L42
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.X7175349259954592591 r5 = r4.A
            if (r5 == 0) goto L4d
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r5.v(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L42
            return r0
        L42:
            ads_mobile_sdk.vw2 r4 = r4.z
            if (r4 == 0) goto L47
            return r4
        L47:
            java.lang.String r4 = "_adFrame"
            dev.epro.r0.S10823041268949770285.b0(r4)
            throw r2
        L4d:
            java.lang.String r4 = "adFrameJob"
            dev.epro.r0.S10823041268949770285.b0(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.d(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.sp2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.sp2 r0 = (ads_mobile_sdk.sp2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.sp2 r0 = new ads_mobile_sdk.sp2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            ads_mobile_sdk.dj0 r6 = r0.b
            ads_mobile_sdk.dq2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L69
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L35:
            ads_mobile_sdk.dq2 r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L49
        L3b:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            r0.e = r3
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r4) goto L49
            goto L64
        L49:
            ads_mobile_sdk.vw2 r7 = (ads_mobile_sdk.vw2) r7
            android.view.ViewParent r7 = r7.getParent()
            boolean r7 = r7 instanceof android.view.View
            if (r7 != 0) goto L56
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L56:
            ads_mobile_sdk.dj0 r7 = r6.s
            r0.a = r6
            r0.b = r7
            r0.e = r2
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r4) goto L65
        L64:
            return r4
        L65:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L69:
            android.view.View r7 = (android.view.View) r7
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.w
            boolean r0 = r0.get()
            boolean r6 = r6.a(r7, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.e(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.wo2
    public final java.lang.Object b(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        byte b = 1;
        if (this.A == null) {
            ads_mobile_sdk.lp2 lp2Var = new ads_mobile_sdk.lp2(this, null, b);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
            w5797197595347441198.getClass();
            this.A = dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(lp2Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        ads_mobile_sdk.mi3 mi3Var = this.c;
        mi3Var.getClass();
        mi3Var.b = new ads_mobile_sdk.fh1();
        mi3Var.c = new ads_mobile_sdk.tu2();
        mi3Var.d = new ads_mobile_sdk.s8();
        java.lang.Object obj = this.q.get();
        obj.getClass();
        dev.epro.r0.N7531780047102116757 n7531780047102116757 = this.t;
        ads_mobile_sdk.qb0 qb0Var = (ads_mobile_sdk.qb0) a((dev.epro.r0.F3881178375678455036) obj, (dev.epro.r0.U4857089234315512256) n7531780047102116757);
        qb0Var.n = java.lang.Boolean.valueOf(this.x.getAndSet(true));
        ads_mobile_sdk.ou2 ou2Var = new ads_mobile_sdk.ou2();
        ads_mobile_sdk.lu2 lu2Var = this.r;
        ou2Var.a = lu2Var;
        qb0Var.m = ou2Var;
        qb0Var.l = lu2Var;
        qb0Var.f92o = n7531780047102116757;
        return ((ads_mobile_sdk.jc1) qb0Var.a().E0.get()).a((dev.epro.r0.K14749510448791472029) r4833348786910499294);
    }

    @Override // ads_mobile_sdk.wo2
    public java.lang.Object a(dev.epro.r0.T18397286815848089648 t18397286815848089648, ads_mobile_sdk.fo2 fo2Var) {
        return a(this, (ads_mobile_sdk.od1) t18397286815848089648, fo2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dq2 r13, ads_mobile_sdk.od1 r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            dev.epro.r0.O9245300239821758723 r0 = dev.epro.r0.O9245300239821758723.a
            boolean r1 = r15 instanceof ads_mobile_sdk.rp2
            if (r1 == 0) goto L15
            r1 = r15
            ads_mobile_sdk.rp2 r1 = (ads_mobile_sdk.rp2) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.rp2 r1 = new ads_mobile_sdk.rp2
            r1.<init>(r13, r15)
        L1a:
            java.lang.Object r15 = r1.c
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            int r3 = r1.e
            r4 = 3
            r5 = 2
            r6 = 1
            r11 = 0
            if (r3 == 0) goto L47
            if (r3 == r6) goto L3d
            if (r3 == r5) goto L37
            if (r3 != r4) goto L30
            dev.epro.r0.E17665849472693074628.k(r15)
            return r0
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            r13 = 0
            return r13
        L37:
            ads_mobile_sdk.dq2 r13 = r1.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L9d
        L3d:
            ads_mobile_sdk.od1 r14 = r1.b
            ads_mobile_sdk.dq2 r13 = r1.a
            dev.epro.r0.E17665849472693074628.k(r15)
        L44:
            r9 = r13
            r10 = r14
            goto L5b
        L47:
            dev.epro.r0.E17665849472693074628.k(r15)
            dev.epro.r0.X7175349259954592591 r15 = r13.A
            if (r15 == 0) goto Lb1
            r1.a = r13
            r1.b = r14
            r1.e = r6
            java.lang.Object r15 = r15.v(r1)
            if (r15 != r2) goto L44
            goto Lab
        L5b:
            r9.y = r11
            ads_mobile_sdk.c7 r13 = r9.u
            java.util.concurrent.atomic.AtomicBoolean r14 = r9.w
            ads_mobile_sdk.dj0 r15 = r9.s
            ads_mobile_sdk.qw2 r3 = r9.g
            ads_mobile_sdk.z1 r6 = r10.b()
            boolean r15 = r15.a(r3, r6)
            r14.set(r15)
            java.lang.Object r14 = r13.a
            if (r14 == 0) goto L7e
            java.lang.String r14 = "The backing field has not yet been initialized."
            java.lang.Object r14 = r13.a(r14)
            ads_mobile_sdk.od1 r14 = (ads_mobile_sdk.od1) r14
            r8 = r14
            goto L7f
        L7e:
            r8 = r11
        L7f:
            monitor-enter(r13)
            r13.a = r10     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r13)
            r1.a = r9
            r1.b = r11
            r1.e = r5
            dev.epro.r0.G8001132634698687269 r13 = r9.f27o
            dev.epro.r0.H4546125934900659656 r7 = new dev.epro.r0.H4546125934900659656
            r12 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r13 = dev.epro.r0.R7033599853981556291.d0(r13, r7, r1)
            if (r13 != r2) goto L98
            goto L99
        L98:
            r13 = r0
        L99:
            if (r13 != r2) goto L9c
            goto Lab
        L9c:
            r13 = r9
        L9d:
            ads_mobile_sdk.lu2 r14 = r13.r
            dev.epro.r0.E14944621269592904532 r15 = r13.l
            r1.a = r11
            r1.e = r4
            java.lang.Object r13 = r14.a(r13, r15, r1)
            if (r13 != r2) goto Lac
        Lab:
            return r2
        Lac:
            return r0
        Lad:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)
            throw r14
        Lb1:
            java.lang.String r13 = "adFrameJob"
            dev.epro.r0.S10823041268949770285.b0(r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.a(ads_mobile_sdk.dq2, ads_mobile_sdk.od1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        if (r8 == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(ads_mobile_sdk.dq2 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ads_mobile_sdk.qp2
            if (r0 == 0) goto L16
            r0 = r8
            ads_mobile_sdk.qp2 r0 = (ads_mobile_sdk.qp2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            ads_mobile_sdk.qp2 r0 = new ads_mobile_sdk.qp2
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            ads_mobile_sdk.dq2 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Exception -> L31
            goto L5a
        L31:
            r7 = move-exception
            goto L86
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r5
        L39:
            ads_mobile_sdk.dq2 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Exception -> L31
            goto L4d
        L3f:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r7     // Catch: java.lang.Exception -> L31
            r0.d = r4     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = r7.b(r0)     // Catch: java.lang.Exception -> L31
            if (r8 != r6) goto L4d
            goto L59
        L4d:
            dev.epro.r0.J12043550928838212009 r8 = (dev.epro.r0.J12043550928838212009) r8     // Catch: java.lang.Exception -> L31
            r0.a = r7     // Catch: java.lang.Exception -> L31
            r0.d = r3     // Catch: java.lang.Exception -> L31
            java.lang.Object r8 = dev.epro.r0.Y582199805280922215.s(r8, r0)     // Catch: java.lang.Exception -> L31
            if (r8 != r6) goto L5a
        L59:
            return r6
        L5a:
            dev.epro.r0.H9390398899829886498 r8 = (dev.epro.r0.H9390398899829886498) r8     // Catch: java.lang.Exception -> L31
            java.lang.Object r0 = r8.a     // Catch: java.lang.Exception -> L31
            dev.epro.r0.M16184408391440927034 r0 = (dev.epro.r0.M16184408391440927034) r0     // Catch: java.lang.Exception -> L31
            boolean r1 = r0 instanceof ads_mobile_sdk.xu0     // Catch: java.lang.Exception -> L31
            if (r1 == 0) goto L7c
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.w     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.dj0 r3 = r7.s     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.qw2 r7 = r7.g     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.xu0 r0 = (ads_mobile_sdk.xu0) r0     // Catch: java.lang.Exception -> L31
            java.lang.Object r0 = r0.b     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.od1 r0 = (ads_mobile_sdk.od1) r0     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.z1 r0 = r0.b()     // Catch: java.lang.Exception -> L31
            boolean r7 = r3.a(r7, r0)     // Catch: java.lang.Exception -> L31
            r1.set(r7)     // Catch: java.lang.Exception -> L31
            return r8
        L7c:
            boolean r7 = r0 instanceof ads_mobile_sdk.pu0     // Catch: java.lang.Exception -> L31
            if (r7 == 0) goto L85
            ads_mobile_sdk.pu0 r0 = (ads_mobile_sdk.pu0) r0     // Catch: java.lang.Exception -> L31
            ads_mobile_sdk.zi3.a(r0, r2)     // Catch: java.lang.Exception -> L31
        L85:
            return r8
        L86:
            ads_mobile_sdk.th3 r8 = ads_mobile_sdk.ji3.a()
            ads_mobile_sdk.cc2 r0 = r8.e()
            r0.m = r2
            r8.a(r7)
            dev.epro.r0.H9390398899829886498 r8 = new dev.epro.r0.H9390398899829886498
            ads_mobile_sdk.qu0 r0 = new ads_mobile_sdk.qu0
            r1 = 6
            r0.<init>(r7, r2, r5, r1)
            r8.<init>(r0, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dq2.a(ads_mobile_sdk.dq2, dev.epro.r0.K14749510448791472029):java.io.Serializable");
    }
}
