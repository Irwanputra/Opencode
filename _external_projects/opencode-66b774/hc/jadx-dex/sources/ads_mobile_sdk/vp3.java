package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vp3 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public ads_mobile_sdk.tx0 a;
    public boolean b;
    public final /* synthetic */ ads_mobile_sdk.yp3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ dev.epro.r0.C9731525580007922156 e;
    public final /* synthetic */ ads_mobile_sdk.mi3 f;
    public final /* synthetic */ ads_mobile_sdk.eg2 g;
    public final /* synthetic */ ads_mobile_sdk.m31 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ads_mobile_sdk.x60 j;
    public final /* synthetic */ java.lang.String k;
    public final /* synthetic */ ads_mobile_sdk.fs3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp3(ads_mobile_sdk.yp3 yp3Var, boolean z, dev.epro.r0.C9731525580007922156 c9731525580007922156, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.m31 m31Var, boolean z2, ads_mobile_sdk.x60 x60Var, java.lang.String str, ads_mobile_sdk.fs3 fs3Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.c = yp3Var;
        this.d = z;
        this.e = c9731525580007922156;
        this.f = mi3Var;
        this.g = eg2Var;
        this.h = m31Var;
        this.i = z2;
        this.j = x60Var;
        this.k = str;
        this.l = fs3Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.vp3(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    /* JADX WARN: Finally extract failed */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ads_mobile_sdk.th3 th3VarA;
        ads_mobile_sdk.tx0 tx0Var;
        androidx.webkit.Profile profile;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        java.lang.Object xu0Var = ads_mobile_sdk.av0.c;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        boolean z = this.b;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            ads_mobile_sdk.xj xjVar = this.c.p;
            boolean z2 = this.d;
            ads_mobile_sdk.ql1 ql1Var = xjVar.a;
            ads_mobile_sdk.jr0 jr0Var = ql1Var.a;
            jr0Var.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!((java.lang.Boolean) jr0Var.a("gads:webview_capping:enabled", bool, aoVar)).booleanValue() || z2) {
                int iIncrementAndGet = ql1Var.b.incrementAndGet();
                ql1Var.c = iIncrementAndGet;
                xu0Var = new ads_mobile_sdk.xu0(java.lang.Integer.valueOf(iIncrementAndGet));
            } else {
                ads_mobile_sdk.jr0 jr0Var2 = ql1Var.a;
                jr0Var2.getClass();
                if (!((java.lang.Boolean) jr0Var2.a("gads:webview_capping:enabled", bool, aoVar)).booleanValue() || ql1Var.b.get() < 5) {
                    while (true) {
                        int i = ql1Var.b.get();
                        if (i >= 5) {
                            break;
                        }
                        int i2 = i + 1;
                        if (ql1Var.b.compareAndSet(i, i2)) {
                            ql1Var.c = i2;
                            xu0Var = new ads_mobile_sdk.xu0(java.lang.Integer.valueOf(i2));
                            break;
                        }
                    }
                }
            }
            if (xu0Var instanceof ads_mobile_sdk.pu0) {
                return xu0Var;
            }
            ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_WEBVIEW_INITIALIZATION;
            ads_mobile_sdk.yp3 yp3Var = this.c;
            ads_mobile_sdk.x60 x60Var = this.j;
            java.lang.String str = this.k;
            ads_mobile_sdk.fs3 fs3Var = this.l;
            th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, false);
            try {
                ads_mobile_sdk.tx0 tx0Var2 = new ads_mobile_sdk.tx0(yp3Var.d, yp3Var.c, yp3Var.b, x60Var, yp3Var.g, yp3Var.f, yp3Var.a, str, fs3Var, yp3Var.m, yp3Var.j, yp3Var.l, yp3Var.p);
                th3VarA.close();
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = tx0Var2.l;
                ads_mobile_sdk.xj xjVar2 = this.c.p;
                xjVar2.getClass();
                atomicBoolean.getClass();
                ads_mobile_sdk.ii iiVar = new ads_mobile_sdk.ii();
                iiVar.a = xjVar2;
                iiVar.b = atomicBoolean;
                ads_mobile_sdk.hf2 hf2Var = this.c.q;
                this.a = tx0Var2;
                this.b = true;
                hf2Var.getClass();
                if (ads_mobile_sdk.hf2.a(hf2Var, tx0Var2, iiVar, this) == z3437138737604933638) {
                    return z3437138737604933638;
                }
                tx0Var = tx0Var2;
            } catch (java.lang.Throwable th) {
                try {
                    th3VarA.b(th);
                    if (th instanceof dev.epro.r0.N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                        th3VarA.a(th);
                    }
                    if (th instanceof dev.epro.r0.P2480554073835519965) {
                        throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                    }
                    if (th instanceof java.util.concurrent.CancellationException) {
                        throw new ads_mobile_sdk.du0(th);
                    }
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } catch (java.lang.Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            }
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ads_mobile_sdk.tx0 tx0Var3 = this.a;
            dev.epro.r0.E17665849472693074628.k(obj);
            tx0Var = tx0Var3;
        }
        dev.epro.r0.C9731525580007922156 lq3Var = this.e;
        if (lq3Var == null) {
            ads_mobile_sdk.yp3 yp3Var2 = this.c;
            lq3Var = new ads_mobile_sdk.lq3(tx0Var, yp3Var2.e, this.f, yp3Var2.h, yp3Var2.b, yp3Var2.l);
        }
        dev.epro.r0.Y2677586711477821327 y2677586711477821327 = ads_mobile_sdk.iy0.v;
        ads_mobile_sdk.yp3 yp3Var3 = this.c;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = yp3Var3.b;
        ads_mobile_sdk.rw0 rw0Var = yp3Var3.h;
        ads_mobile_sdk.k8 k8Var = yp3Var3.f;
        ads_mobile_sdk.jr0 jr0Var3 = yp3Var3.l;
        ads_mobile_sdk.w81 w81Var = yp3Var3.r;
        dev.epro.r0.O12043144740933444288 o12043144740933444288 = yp3Var3.n;
        y2677586711477821327.getClass();
        tx0Var.getClass();
        w5797197595347441198.getClass();
        rw0Var.getClass();
        k8Var.getClass();
        jr0Var3.getClass();
        o12043144740933444288.getClass();
        ads_mobile_sdk.tx0 tx0Var4 = tx0Var;
        ads_mobile_sdk.iy0 iy0Var = new ads_mobile_sdk.iy0(lq3Var, tx0Var4, w5797197595347441198, rw0Var, k8Var, jr0Var3, w81Var, o12043144740933444288);
        ads_mobile_sdk.ie1 ie1Var = this.c.k;
        ads_mobile_sdk.mi3 mi3Var = this.f;
        ads_mobile_sdk.eg2 eg2Var = this.g;
        ads_mobile_sdk.m31 m31Var = this.h;
        ads_mobile_sdk.r6 r6Var = ie1Var.a;
        tx0Var4.addJavascriptInterface(new ads_mobile_sdk.ge1(tx0Var4, mi3Var, eg2Var, m31Var, (ads_mobile_sdk.kz2) ((dev.epro.r0.V2597580950516131749) r6Var.a).get(), (ads_mobile_sdk.k8) ((dev.epro.r0.V2597580950516131749) r6Var.b).get(), (ads_mobile_sdk.jr0) ((dev.epro.r0.V2597580950516131749) r6Var.c).get()), "googleAdsJsInterface");
        tx0Var4.setWebViewClient(iy0Var);
        tx0Var4.y = iy0Var;
        tx0Var4.setWebChromeClient(new ads_mobile_sdk.xw0(iy0Var));
        tx0Var4.x = lq3Var;
        if (!this.i) {
            ads_mobile_sdk.jr0 jr0Var4 = this.c.l;
            jr0Var4.getClass();
            if (((java.lang.Boolean) jr0Var4.a("creative_webview_init_set_profile:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue()) {
                ads_mobile_sdk.op3 op3Var = this.c.m;
                op3Var.getClass();
                try {
                    ads_mobile_sdk.bs3 bs3Var = op3Var.b;
                    if (dev.epro.r0.Q6344330807969154194.b(androidx.webkit.WebViewFeature.MULTI_PROFILE)) {
                        bs3Var.getClass();
                        try {
                            profile = bs3Var.m;
                        } catch (java.lang.Throwable unused) {
                        }
                        java.lang.String name = profile != null ? profile.getName() : null;
                        if (name == null && ((java.lang.Boolean) bs3Var.s.getValue()).booleanValue()) {
                            dev.epro.r0.R7033599853981556291.E(bs3Var.e, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.J13979756969328643311(bs3Var, (dev.epro.r0.R4833348786910499294) null, (byte) 4), 3);
                        } else if (name != null && name.equals("GMA_WEBVIEW_PROFILE")) {
                        }
                        th3VarA = ads_mobile_sdk.ji3.a(ads_mobile_sdk.wv0.CUI_NAME_WEBVIEW_PROFILE_SET, o2161699089510411363, true);
                        try {
                            androidx.webkit.WebViewCompat.setProfile(tx0Var4, "GMA_WEBVIEW_PROFILE");
                            th3VarA.close();
                        } catch (java.lang.Throwable th3) {
                            try {
                                th3VarA.b(th3);
                                if (th3 instanceof dev.epro.r0.N340633841638932414) {
                                    throw th3;
                                }
                                if (!(th3 instanceof dev.epro.r0.P2480554073835519965) && !(th3 instanceof java.util.concurrent.CancellationException)) {
                                    th3VarA.a(th3);
                                }
                                if (th3 instanceof dev.epro.r0.P2480554073835519965) {
                                    throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th3);
                                }
                                if (th3 instanceof java.util.concurrent.CancellationException) {
                                    throw new ads_mobile_sdk.du0(th3);
                                }
                                if (th3 instanceof ads_mobile_sdk.dv0) {
                                    throw th3;
                                }
                                throw new ads_mobile_sdk.iu0(th3);
                            } finally {
                            }
                        }
                    }
                } catch (java.lang.Throwable unused2) {
                }
            }
        }
        return new ads_mobile_sdk.xu0(tx0Var4);
    }
}
