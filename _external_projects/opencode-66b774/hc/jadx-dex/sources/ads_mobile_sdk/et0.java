package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class et0 extends dev.epro.r0.Y8405992380652585640 implements dev.epro.r0.H8032588520594078423 {
    public static final /* synthetic */ dev.epro.r0.D15596191924284547207[] D = {dev.epro.r0.T1335862270807194835.f("hasContentViewBeenSet", "getHasContentViewBeenSet()Z", ads_mobile_sdk.et0.class)};
    public boolean A;
    public dev.epro.r0.X7175349259954592591 B;
    public boolean C;
    public final android.content.Context a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final dev.epro.r0.G8001132634698687269 c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final ads_mobile_sdk.jr0 e;
    public final ads_mobile_sdk.ci3 f;
    public final java.lang.String g;
    public final ads_mobile_sdk.rw0 h;
    public final ads_mobile_sdk.c7 i;
    public final java.util.Optional j;
    public dev.epro.r0.X7175349259954592591 k;
    public com.google.android.libraries.ads.mobile.sdk.common.AdActivity l;
    public final ads_mobile_sdk.ii m;
    public final java.util.concurrent.atomic.AtomicBoolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f31o;
    public android.widget.RelativeLayout p;
    public android.view.ViewGroup q;
    public ads_mobile_sdk.iu r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public android.widget.Toolbar x;
    public final dev.epro.r0.H15186625828076266306 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(android.content.Context context, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.ci3 ci3Var, java.lang.String str, ads_mobile_sdk.rw0 rw0Var, ads_mobile_sdk.c7 c7Var, java.util.Optional optional) {
        super(true);
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        str.getClass();
        rw0Var.getClass();
        this.a = context;
        this.b = w5797197595347441198;
        this.c = g8001132634698687269;
        this.d = w57971975953474411982;
        this.e = jr0Var;
        this.f = ci3Var;
        this.g = str;
        this.h = rw0Var;
        this.i = c7Var;
        this.j = optional;
        this.m = new ads_mobile_sdk.ii((java.lang.Object) null, java.lang.Boolean.FALSE);
        this.n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f31o = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.y = new dev.epro.r0.H15186625828076266306();
    }

    public abstract void a(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.google.android.libraries.ads.mobile.sdk.common.AdActivity adActivity) {
        byte b;
        android.view.Window window;
        this.l = adActivity;
        if (this.f31o.get()) {
            adActivity.finish();
            return;
        }
        byte b2 = 1;
        if (this.n.getAndSet(true)) {
            b = 2;
        } else {
            dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.k;
            dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c((java.util.concurrent.CancellationException) null);
            }
            adActivity.a().a(adActivity, this);
            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
            o();
            if (i()) {
                j().setLayerType(1, null);
            } else {
                android.view.Window window2 = adActivity.getWindow();
                if (window2 != null) {
                    window2.setFlags(16777216, 16777216);
                }
            }
            android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(adActivity);
            relativeLayout.setId(android.view.View.generateViewId());
            relativeLayout.setBackgroundColor(this.v ? 0 : -16777216);
            this.p = relativeLayout;
            int i = android.os.Build.VERSION.SDK_INT;
            ads_mobile_sdk.jr0 jr0Var = this.e;
            if (i >= 31) {
                jr0Var.getClass();
                if (((java.lang.Boolean) jr0Var.a("gads:enable_blur_transparent_background", java.lang.Boolean.TRUE, aoVar)).booleanValue() && (window = adActivity.getWindow()) != null) {
                    dev.epro.r0.R10617406068291706632.s(window, this.z);
                }
            }
            if (this.w) {
                android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(j(), false);
                jr0Var.getClass();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (((java.lang.Boolean) jr0Var.a("gads:custom_webview_disable_text_classifier:enabled", bool, aoVar)).booleanValue() && i >= 27) {
                    dev.epro.r0.S14644675364543608827.e(j());
                }
                if (((java.lang.Boolean) jr0Var.a("gads:custom_webview_disable_downloads:enabled", bool, aoVar)).booleanValue()) {
                    j().setDownloadListener(new dev.epro.r0.I1522261947689746118());
                }
                if (i >= 28) {
                    dev.epro.r0.S14644675364543608827.i(adActivity);
                } else {
                    adActivity.getWindow().addFlags(524288);
                }
                this.x = a(relativeLayout);
            } else {
                relativeLayout.addView(g(), -1, -1);
                int iIntValue = ((java.lang.Number) jr0Var.a("gad:interstitial:close_button_padding_dip", dev.epro.r0.O17574792317020433029.c(jr0Var, "gad:interstitial:close_button_padding_dip", 20), ads_mobile_sdk.ao.a$18)).intValue();
                boolean zBooleanValue = ((java.lang.Boolean) jr0Var.a("gads:force_top_right_close_button:enabled", java.lang.Boolean.TRUE, aoVar)).booleanValue();
                ads_mobile_sdk.iu iuVar = new ads_mobile_sdk.iu(adActivity, (java.lang.String) jr0Var.a("gads:close_button_asset_name", "white", ads_mobile_sdk.ao.a$6), new ads_mobile_sdk.ju(zBooleanValue ? iIntValue : 0, zBooleanValue ? 0 : iIntValue, iIntValue));
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(10);
                if (zBooleanValue) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(9);
                }
                this.r = iuVar;
                iuVar.a = new dev.epro.r0.H2607093550274855851(this, (byte) 4);
                if ((!this.s || h()) && !f()) {
                    ads_mobile_sdk.iu iuVar2 = this.r;
                    if (iuVar2 != null) {
                        iuVar2.setVisibility(0);
                    }
                    this.s = false;
                } else {
                    ads_mobile_sdk.iu iuVar3 = this.r;
                    if (iuVar3 != null) {
                        iuVar3.setVisibility(8);
                    }
                    this.s = true;
                }
                android.widget.RelativeLayout relativeLayout2 = this.p;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(iuVar, layoutParams);
                }
                a(iuVar);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
            adActivity.setContentView(relativeLayout, layoutParams2);
            dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.ct0(this, r4833348786910499294, b2));
            ads_mobile_sdk.fb fbVar = new ads_mobile_sdk.fb((java.lang.Object) this, (java.lang.Object) relativeLayout, r4833348786910499294, (byte) 22);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            b = 2;
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(fbVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
        }
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930(b));
    }

    public void a$1(int i) {
        if (i == 0) {
            throw null;
        }
        this.t = i;
        dev.epro.r0.T17336508261397230716 t17336508261397230716 = this.l;
        if (t17336508261397230716 != null) {
            t17336508261397230716.finish();
        }
    }

    public final void a$2() {
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r4 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.tx0 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.ns0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ns0 r0 = (ads_mobile_sdk.ns0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ns0 r0 = new ads_mobile_sdk.ns0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L71
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L31:
            ads_mobile_sdk.tx0 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L5b
        L37:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.I16631908410500040363 r8 = new dev.epro.r0.I16631908410500040363
            r8.<init>()
            java.lang.String r6 = r6.g
            java.lang.String r1 = "version"
            r8.t(r1, r6)
            ads_mobile_sdk.aq1 r6 = new ads_mobile_sdk.aq1
            r6.<init>(r7, r8, r4, r2)
            dev.epro.r0.J8045362843799184672.s0(r6)
            r0.a = r7
            r0.d = r3
            java.lang.String r6 = "aes2"
            java.lang.Object r6 = r7.c(r6, r0)
            if (r6 != r5) goto L5b
            goto L70
        L5b:
            r0.a = r4
            r0.d = r2
            ads_mobile_sdk.x60 r6 = r7.d
            if (r6 == 0) goto L6e
            java.lang.String r7 = "native:view_show"
            java.lang.Object r4 = ads_mobile_sdk.x60.a(r6, r7, r0)
            if (r4 != r5) goto L6c
            goto L6e
        L6c:
            ads_mobile_sdk.kh3 r4 = (ads_mobile_sdk.kh3) r4
        L6e:
            if (r4 != r5) goto L71
        L70:
            return r5
        L71:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.b(ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public abstract java.lang.Object b(dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public final void c() {
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 6));
    }

    public dev.epro.r0.O9245300239821758723 d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final void e() {
        this.m.setValue(this, D[0], java.lang.Boolean.TRUE);
    }

    public boolean f() {
        return false;
    }

    public final android.view.View g() {
        android.view.ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            return viewGroup;
        }
        dev.epro.r0.S10823041268949770285.b0("contentView");
        throw null;
    }

    public boolean h() {
        return false;
    }

    public final void handleOnBackPressed() {
        dev.epro.r0.U6333859635337865127 u6333859635337865127A;
        if (j().canGoBack()) {
            j().goBack();
            return;
        }
        if (!((java.util.concurrent.atomic.AtomicBoolean) this.i.a).get() && !j().k.get()) {
            ads_mobile_sdk.ct0 ct0Var = new ads_mobile_sdk.ct0(this, null, (byte) 3);
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
            w5797197595347441198.getClass();
            dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ct0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
            return;
        }
        this.t = 1;
        setEnabled(false);
        com.google.android.libraries.ads.mobile.sdk.common.AdActivity adActivity = this.l;
        if (adActivity == null || (u6333859635337865127A = adActivity.a()) == null) {
            return;
        }
        u6333859635337865127A.c();
    }

    public boolean i() {
        return false;
    }

    public abstract ads_mobile_sdk.tx0 j();

    public abstract int k();

    public final void l() {
        dev.epro.r0.N12893830608069839869 n12893830608069839869 = new dev.epro.r0.N12893830608069839869(this, (dev.epro.r0.R4833348786910499294) null, (byte) 6);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        this.k = dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n12893830608069839869, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    public final void n() {
        dev.epro.r0.T17336508261397230716 t17336508261397230716 = this.l;
        if (t17336508261397230716 == null || !t17336508261397230716.isFinishing() || this.f31o.get()) {
            return;
        }
        ads_mobile_sdk.ct0 ct0Var = new ads_mobile_sdk.ct0(this, null, (byte) 0);
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.b;
        w5797197595347441198.getClass();
        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(ct0Var, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    public final void o() {
        try {
            dev.epro.r0.T17336508261397230716 t17336508261397230716 = this.l;
            if (t17336508261397230716 == null) {
                return;
            }
            t17336508261397230716.setRequestedOrientation(k());
        } catch (java.lang.IllegalStateException e) {
            ads_mobile_sdk.xv.c("Unable to update orientation: " + e, null);
        }
    }

    public final void onDestroy() {
        n();
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 3));
    }

    public final void onPause() {
        n();
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 1));
    }

    public final void onResume() {
        dev.epro.r0.T17336508261397230716 t17336508261397230716;
        android.view.Window window;
        dev.epro.r0.T17336508261397230716 t173365082613972307162 = this.l;
        if (t173365082613972307162 != null && !t173365082613972307162.isInMultiWindowMode() && (t17336508261397230716 = this.l) != null && (window = t17336508261397230716.getWindow()) != null) {
            dev.epro.r0.M9197813449740923653 m9197813449740923653 = new dev.epro.r0.M9197813449740923653(window.getDecorView());
            int i = android.os.Build.VERSION.SDK_INT;
            dev.epro.r0.S7186231212856355878 s7186231212856355878 = i >= 35 ? new dev.epro.r0.S7186231212856355878(window, m9197813449740923653) : i >= 30 ? new dev.epro.r0.S3454875417302688768(window, m9197813449740923653) : i >= 26 ? new dev.epro.r0.N17192714187392118750(window, m9197813449740923653) : new dev.epro.r0.Z5540756766699434826(window, m9197813449740923653);
            if (this.u) {
                s7186231212856355878.o();
            }
            s7186231212856355878.i(this.u ? 519 : 1);
        }
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 0));
    }

    public void onStop() {
        if (!j().k.get()) {
            j().onPause();
        }
        n();
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 5));
    }

    public java.lang.Object c(dev.epro.r0.R14062301455140331524 r14062301455140331524) {
        return a(this, (dev.epro.r0.K14749510448791472029) r14062301455140331524);
    }

    public java.lang.Object e(dev.epro.r0.N12893830608069839869 n12893830608069839869) {
        return dev.epro.r0.O9245300239821758723.a;
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    public final void b() {
        this.j.ifPresent(new dev.epro.r0.M16672281404726864930((byte) 7));
    }

    public void a(ads_mobile_sdk.iu iuVar) {
    }

    public java.lang.Object a(boolean z, ads_mobile_sdk.kg0 kg0Var) {
        return dev.epro.r0.O9245300239821758723.a;
    }

    public dev.epro.r0.O9245300239821758723 a(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        return dev.epro.r0.O9245300239821758723.a;
    }

    public android.widget.Toolbar a(android.widget.RelativeLayout relativeLayout) {
        return a(relativeLayout, "");
    }

    public final android.widget.Toolbar a(android.widget.RelativeLayout relativeLayout, java.lang.String str) {
        android.widget.Toolbar toolbar = new android.widget.Toolbar(this.l);
        toolbar.setId(android.view.View.generateViewId());
        g().setId(android.view.View.generateViewId());
        toolbar.setBackgroundColor(-12303292);
        toolbar.setTitleMarginStart(0);
        toolbar.setSubtitle(str);
        toolbar.setVisibility(0);
        toolbar.setContentDescription("gma_custom_webview_toolbar");
        try {
            toolbar.setNavigationIcon(this.a.getResources().getDrawable(2131230841, null));
        } catch (android.content.res.Resources.NotFoundException | java.lang.NullPointerException unused) {
        }
        toolbar.setNavigationOnClickListener(new dev.epro.r0.X5670102799181443745(this, (byte) 0));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        relativeLayout.addView(toolbar, layoutParams);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, toolbar.getId());
        layoutParams2.addRule(12);
        relativeLayout.addView(g(), layoutParams2);
        return toolbar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0132, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r12, r3, r0) != r8) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe A[Catch: all -> 0x0039, PHI: r1 r11
      0x00fe: PHI (r1v6 ??) = (r1v11 ??), (r1v12 ??) binds: [B:59:0x00fb, B:22:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r11v7 dev.epro.r0.R8015591507171738907) = (r11v6 dev.epro.r0.R8015591507171738907), (r11v16 dev.epro.r0.R8015591507171738907) binds: [B:59:0x00fb, B:22:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:16:0x0034, B:61:0x00fe, B:64:0x0104, B:66:0x0108, B:67:0x011f), top: B:74:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v13, types: [ads_mobile_sdk.et0] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.et0 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.a(ads_mobile_sdk.et0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[PHI: r12 r13
      0x00bd: PHI (r12v4 ads_mobile_sdk.tx0) = (r12v3 ads_mobile_sdk.tx0), (r12v10 ads_mobile_sdk.tx0) binds: [B:39:0x00ba, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x00bd: PHI (r13v4 ads_mobile_sdk.et0) = (r13v3 ads_mobile_sdk.et0), (r13v10 ads_mobile_sdk.et0) binds: [B:39:0x00ba, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.a(ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean a(android.content.Context context) {
        ads_mobile_sdk.ci3 ci3Var = this.f;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
        context.getClass();
        byte b = 4;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        try {
            j().f113o = this;
            context.startActivity(this.h.a(context, this));
            l();
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.ct0(this, r4833348786910499294, b));
            ads_mobile_sdk.zi3.a(4, "Exception starting Activity", e);
            ci3Var.a("AdActivityLauncher.show", (java.lang.Throwable) e);
            return false;
        } catch (java.lang.SecurityException e2) {
            ads_mobile_sdk.zi3.a(w5797197595347441198, new ads_mobile_sdk.ct0(this, r4833348786910499294, (byte) 5));
            ads_mobile_sdk.zi3.a(4, "Exception starting Activity", e2);
            ci3Var.a("AdActivityLauncher.show", (java.lang.Throwable) e2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r6.b(r0) == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:35:0x0077, B:37:0x007b, B:38:0x007e, B:40:0x0082), top: B:47:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, dev.epro.r0.K14749510448791472029 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.dt0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.dt0 r0 = (ads_mobile_sdk.dt0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.dt0 r0 = new ads_mobile_sdk.dt0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            dev.epro.r0.R8015591507171738907 r6 = r0.b
            ads_mobile_sdk.et0 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2f
            goto L77
        L2f:
            r7 = move-exception
            goto L88
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L37:
            boolean r7 = r0.c
            dev.epro.r0.R8015591507171738907 r6 = r0.b
            ads_mobile_sdk.et0 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r6
            r6 = r1
            goto L57
        L43:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r8 = r6.y
            r0.b = r8
            r0.c = r7
            r0.f = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L57
            goto L71
        L57:
            boolean r1 = r6.C     // Catch: java.lang.Throwable -> L72
            if (r1 != 0) goto L81
            r6.A = r7     // Catch: java.lang.Throwable -> L72
            if (r7 != 0) goto L81
            r6.C = r3     // Catch: java.lang.Throwable -> L72
            dev.epro.r0.X7175349259954592591 r7 = r6.B     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L75
            r0.a = r6     // Catch: java.lang.Throwable -> L72
            r0.b = r8     // Catch: java.lang.Throwable -> L72
            r0.f = r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = r6.b(r0)     // Catch: java.lang.Throwable -> L72
            if (r7 != r5) goto L75
        L71:
            return r5
        L72:
            r7 = move-exception
            r6 = r8
            goto L88
        L75:
            r7 = r6
            r6 = r8
        L77:
            dev.epro.r0.X7175349259954592591 r8 = r7.B     // Catch: java.lang.Throwable -> L2f
            if (r8 == 0) goto L7e
            r8.c(r4)     // Catch: java.lang.Throwable -> L2f
        L7e:
            r7.B = r4     // Catch: java.lang.Throwable -> L2f
            goto L82
        L81:
            r6 = r8
        L82:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2f
            r6.b(r4)
            return r7
        L88:
            r6.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.a(boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public java.lang.Object a(dev.epro.r0.T913357428039952817 t913357428039952817, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return dev.epro.r0.O9245300239821758723.a;
    }

    public java.lang.Object a(android.view.View view, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        return dev.epro.r0.O9245300239821758723.a;
    }
}
