package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qn0 extends ads_mobile_sdk.cs0 implements dev.epro.r0.J4422749016291691854 {
    public final ads_mobile_sdk.y2 M;
    public final ads_mobile_sdk.kz2 N;
    public final ads_mobile_sdk.mi3 O;

    /* JADX WARN: Illegal instructions before constructor call */
    public qn0(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ci3 ci3Var, ads_mobile_sdk.k8 k8Var, java.lang.String str, ads_mobile_sdk.y2 y2Var, dev.epro.r0.G2352924714470945535 g2352924714470945535, ads_mobile_sdk.jy0 jy0Var, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Z5089078543653785389 z5089078543653785389, ads_mobile_sdk.rw0 rw0Var, dev.epro.r0.U2595023890546017274 u2595023890546017274) {
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        k8Var.getClass();
        str.getClass();
        y2Var.getClass();
        g2352924714470945535.getClass();
        jy0Var.getClass();
        kz2Var.getClass();
        mi3Var.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        z5089078543653785389.getClass();
        rw0Var.getClass();
        u2595023890546017274.getClass();
        java.util.Optional optionalOf = java.util.Optional.of(g2352924714470945535);
        optionalOf.getClass();
        super(context, w5797197595347441198, g8001132634698687269, w57971975953474411982, jr0Var, ci3Var, str, qw2Var, z1Var, z5089078543653785389, rw0Var, u2595023890546017274, optionalOf);
        this.M = y2Var;
        this.N = kz2Var;
        this.O = mi3Var;
        this.q = jy0Var;
        this.G = jy0Var;
        new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(android.content.Context context, boolean z, boolean z2) {
        context.getClass();
        ads_mobile_sdk.kz2 kz2Var = this.N;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_ADSHOW;
        java.util.List listU = dev.epro.r0.K5751602218013079365.U(this.E.toString());
        ads_mobile_sdk.mi3 mi3Var = this.O;
        byte b = 2;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, listU, mi3Var);
            try {
                ads_mobile_sdk.xv.a("show() is not supported for cross-process ad. Use getView() instead.", (java.lang.Exception) null);
                ads_mobile_sdk.zi3.a(this.d, new ads_mobile_sdk.ln0(this, r4833348786910499294, b));
                ads_mobile_sdk.zi3.a(6, "show() is not supported for cross-process ad.", null);
                em2VarA.close();
            } catch (java.lang.Throwable th) {
                try {
                    em2VarA.b(th);
                    if (th instanceof dev.epro.r0.N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        em2VarA.a(th);
                    }
                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                    }
                    if (th instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th);
                    }
                    if (!(th instanceof ads_mobile_sdk.dv0)) {
                        throw new ads_mobile_sdk.iu0(th);
                    }
                    throw th;
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, dev.epro.r0.O2161699089510411363.a, true);
            try {
                ads_mobile_sdk.xv.a("show() is not supported for cross-process ad. Use getView() instead.", (java.lang.Exception) null);
                ads_mobile_sdk.zi3.a(this.d, new ads_mobile_sdk.ln0(this, r4833348786910499294, b));
                ads_mobile_sdk.zi3.a(6, "show() is not supported for cross-process ad.", null);
                th3VarA.close();
            } catch (java.lang.Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof dev.epro.r0.N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                    }
                    if (th2 instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th2);
                    }
                    if (!(th2 instanceof ads_mobile_sdk.dv0)) {
                        throw new ads_mobile_sdk.iu0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // ads_mobile_sdk.et0
    public final void a$1(int i) {
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        if (i == 0) {
            throw null;
        }
        ads_mobile_sdk.ln0 ln0Var = new ads_mobile_sdk.ln0(this, r4833348786910499294, (byte) 0);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ln0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[PHI: r9
      0x0073: PHI (r9v2 'this' ads_mobile_sdk.qn0) = (r9v1 'this' ads_mobile_sdk.qn0), (r9v1 'this' ads_mobile_sdk.qn0), (r9v5 'this' ads_mobile_sdk.qn0) binds: [B:23:0x0067, B:25:0x0070, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.kn0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.kn0 r0 = (ads_mobile_sdk.kn0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.kn0 r0 = new ads_mobile_sdk.kn0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            dev.epro.r0.E17665849472693074628.k(r10)
            return r6
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L36:
            ads_mobile_sdk.qn0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L73
        L3c:
            ads_mobile_sdk.qn0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L52
        L42:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r9
            r0.d = r5
            ads_mobile_sdk.tx0 r10 = r9.j()
            r10.f113o = r2
            if (r6 != r7) goto L52
            goto L7e
        L52:
            ads_mobile_sdk.jr0 r10 = r9.e
            r10.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11
            java.lang.String r8 = "gad:interstitial_notify_publisher_without_delay"
            java.lang.Object r10 = r10.a(r8, r1, r5)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L73
            r0.a = r9
            r0.d = r4
            r9.d(r0)
            if (r6 != r7) goto L73
            goto L7e
        L73:
            ads_mobile_sdk.y2 r9 = r9.M
            r0.a = r2
            r0.d = r3
            r9.a(r0)
            if (r6 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qn0.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void d() {
        ads_mobile_sdk.kz2 kz2Var = this.N;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_ADSHOW_WITH_VIEW;
        java.util.List listU = dev.epro.r0.K5751602218013079365.U(this.E.toString());
        ads_mobile_sdk.mi3 mi3Var = this.O;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        byte b = 1;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, listU, mi3Var);
            try {
                this.n.set(true);
                ((ads_mobile_sdk.tx0) this.H.getValue()).f113o = this;
                dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.ln0(this, r4833348786910499294, b));
                a$2();
                em2VarA.close();
            } catch (java.lang.Throwable th) {
                try {
                    em2VarA.b(th);
                    if (th instanceof dev.epro.r0.N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        em2VarA.a(th);
                    }
                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                    }
                    if (th instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th);
                    }
                    if (!(th instanceof ads_mobile_sdk.dv0)) {
                        throw new ads_mobile_sdk.iu0(th);
                    }
                    throw th;
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, dev.epro.r0.O2161699089510411363.a, true);
            try {
                this.n.set(true);
                ((ads_mobile_sdk.tx0) this.H.getValue()).f113o = this;
                dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.ln0(this, r4833348786910499294, b));
                a$2();
                th3VarA.close();
            } catch (java.lang.Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof dev.epro.r0.N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                    }
                    if (th2 instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th2);
                    }
                    if (!(th2 instanceof ads_mobile_sdk.dv0)) {
                        throw new ads_mobile_sdk.iu0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // ads_mobile_sdk.et0
    public final dev.epro.r0.O9245300239821758723 a(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        d(k14749510448791472029);
        return dev.epro.r0.O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.et0
    public final dev.epro.r0.O9245300239821758723 d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z = this.n.get();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (z) {
            this.M.g(r4833348786910499294);
        }
        return o9245300239821758723;
    }
}
