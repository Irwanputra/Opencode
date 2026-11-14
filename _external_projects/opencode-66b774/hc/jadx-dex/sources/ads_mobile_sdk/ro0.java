package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ro0 extends ads_mobile_sdk.cs0 implements dev.epro.r0.J4422749016291691854 {
    public final ads_mobile_sdk.k8 M;
    public final ads_mobile_sdk.y2 N;
    public final ads_mobile_sdk.kz2 O;
    public final ads_mobile_sdk.mi3 P;
    public final java.util.concurrent.atomic.AtomicBoolean Q;

    /* JADX WARN: Illegal instructions before constructor call */
    public ro0(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ci3 ci3Var, ads_mobile_sdk.k8 k8Var, java.lang.String str, ads_mobile_sdk.y2 y2Var, dev.epro.r0.G2352924714470945535 g2352924714470945535, ads_mobile_sdk.jy0 jy0Var, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Z5089078543653785389 z5089078543653785389, ads_mobile_sdk.rw0 rw0Var, dev.epro.r0.U2595023890546017274 u2595023890546017274) {
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
        this.M = k8Var;
        this.N = y2Var;
        this.O = kz2Var;
        this.P = mi3Var;
        this.q = jy0Var;
        this.G = jy0Var;
        this.Q = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(android.content.Context context, boolean z, boolean z2) {
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        context.getClass();
        ads_mobile_sdk.kz2 kz2Var = this.O;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_ADSHOW;
        java.util.List listU = dev.epro.r0.K5751602218013079365.U(this.E.toString());
        ads_mobile_sdk.mi3 mi3Var = this.P;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, listU, mi3Var);
            try {
                ads_mobile_sdk.k8 k8Var = this.M;
                java.lang.StackTraceElement[] stackTrace = new java.lang.Exception().getStackTrace();
                stackTrace.getClass();
                k8Var.b(dev.epro.r0.O5378677881740157249.U0(stackTrace));
                if (!p()) {
                    em2VarA.close();
                    return;
                }
                ads_mobile_sdk.jr0 jr0Var = this.e;
                jr0Var.getClass();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (((java.lang.Boolean) jr0Var.a("gads:default_to_immersive:enabled", bool, aoVar)).booleanValue()) {
                    ads_mobile_sdk.jr0 jr0Var2 = this.e;
                    jr0Var2.getClass();
                    if (((java.lang.Boolean) jr0Var2.a("gads:override_pub_immersive_setting:enabled", bool, aoVar)).booleanValue() || !z2) {
                        this.u = true;
                    } else {
                        this.u = z;
                    }
                } else {
                    this.u = z;
                }
                a(context);
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
                ads_mobile_sdk.k8 k8Var2 = this.M;
                java.lang.StackTraceElement[] stackTrace2 = new java.lang.Exception().getStackTrace();
                stackTrace2.getClass();
                k8Var2.b(dev.epro.r0.O5378677881740157249.U0(stackTrace2));
                if (!p()) {
                    th3VarA.close();
                    return;
                }
                ads_mobile_sdk.jr0 jr0Var3 = this.e;
                jr0Var3.getClass();
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (((java.lang.Boolean) jr0Var3.a("gads:default_to_immersive:enabled", bool2, aoVar)).booleanValue()) {
                    ads_mobile_sdk.jr0 jr0Var4 = this.e;
                    jr0Var4.getClass();
                    if (((java.lang.Boolean) jr0Var4.a("gads:override_pub_immersive_setting:enabled", bool2, aoVar)).booleanValue() || !z2) {
                        this.u = true;
                    } else {
                        this.u = z;
                    }
                } else {
                    this.u = z;
                }
                a(context);
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[PHI: r9
      0x0073: PHI (r9v2 'this' ads_mobile_sdk.ro0) = (r9v1 'this' ads_mobile_sdk.ro0), (r9v1 'this' ads_mobile_sdk.ro0), (r9v5 'this' ads_mobile_sdk.ro0) binds: [B:23:0x0067, B:25:0x0070, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
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
            boolean r0 = r10 instanceof ads_mobile_sdk.po0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.po0 r0 = (ads_mobile_sdk.po0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.po0 r0 = new ads_mobile_sdk.po0
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
            ads_mobile_sdk.ro0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L73
        L3c:
            ads_mobile_sdk.ro0 r9 = r0.a
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
            ads_mobile_sdk.y2 r9 = r9.N
            r0.a = r2
            r0.d = r3
            r9.a(r0)
            if (r6 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro0.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final dev.epro.r0.O9245300239821758723 d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z = this.n.get();
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (z) {
            this.N.g(r4833348786910499294);
        }
        return o9245300239821758723;
    }

    @Override // ads_mobile_sdk.et0
    public final java.lang.Object e(dev.epro.r0.N12893830608069839869 n12893830608069839869) {
        a(new dev.epro.r0.T913357428039952817(1, "There was an internal error when attempting to show fullscreen content."), (dev.epro.r0.R4833348786910499294) n12893830608069839869);
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final boolean p() {
        boolean zD = dev.epro.r0.E7125458317232359087.d(this.a);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        if (zD) {
            ads_mobile_sdk.xv.a("Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies", (java.lang.Exception) null);
            ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.no0(this, null, (byte) 0));
            ads_mobile_sdk.zi3.a(6, "Application process is in background", null);
            return false;
        }
        if (!this.Q.getAndSet(true)) {
            return true;
        }
        ads_mobile_sdk.xv.a("This ad has already been shown.", (java.lang.Exception) null);
        ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.no0(this, null, (byte) 1));
        ads_mobile_sdk.zi3.a(6, "The ad has already been shown", null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.cs0, ads_mobile_sdk.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.View r8, dev.epro.r0.R4833348786910499294 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.qo0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.qo0 r0 = (ads_mobile_sdk.qo0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.qo0 r0 = new ads_mobile_sdk.qo0
            dev.epro.r0.K14749510448791472029 r9 = (dev.epro.r0.K14749510448791472029) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            dev.epro.r0.E17665849472693074628.k(r9)
            return r5
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L35:
            ads_mobile_sdk.ro0 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L48
        L3b:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r7
            r0.d = r4
            super.a(r8, r0)
            if (r5 != r6) goto L48
            goto L53
        L48:
            ads_mobile_sdk.y2 r7 = r7.N
            r0.a = r2
            r0.d = r3
            r7.o(r0)
            if (r5 != r6) goto L54
        L53:
            return r6
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro0.a(android.view.View, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final java.lang.Object a(dev.epro.r0.T913357428039952817 t913357428039952817, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        this.N.a(t913357428039952817, r4833348786910499294);
        return dev.epro.r0.O9245300239821758723.a;
    }
}
