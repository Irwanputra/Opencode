package ads_mobile_sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.libraries.ads.mobile.sdk.common.AdActivity;
import dev.epro.r0.D15596191924284547207;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H2607093550274855851;
import dev.epro.r0.H4776669175763245653;
import dev.epro.r0.H8032588520594078423;
import dev.epro.r0.I1522261947689746118;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M16672281404726864930;
import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.N17192714187392118750;
import dev.epro.r0.O17574792317020433029;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S3454875417302688768;
import dev.epro.r0.S7186231212856355878;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.U6333859635337865127;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X5670102799181443745;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Y8405992380652585640;
import dev.epro.r0.Z5540756766699434826;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class et0 extends Y8405992380652585640 implements H8032588520594078423 {
    public static final /* synthetic */ D15596191924284547207[] D = {T1335862270807194835.f("hasContentViewBeenSet", "getHasContentViewBeenSet()Z", et0.class)};
    public boolean A;
    public X7175349259954592591 B;
    public boolean C;
    public final Context a;
    public final W5797197595347441198 b;
    public final G8001132634698687269 c;
    public final W5797197595347441198 d;
    public final jr0 e;
    public final ci3 f;
    public final String g;
    public final rw0 h;
    public final c7 i;
    public final Optional j;
    public X7175349259954592591 k;
    public AdActivity l;
    public final ii m;
    public final AtomicBoolean n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f31o;
    public RelativeLayout p;
    public ViewGroup q;
    public iu r;
    public boolean s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public Toolbar x;
    public final H15186625828076266306 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(Context context, W5797197595347441198 w5797197595347441198, G8001132634698687269 g8001132634698687269, W5797197595347441198 w57971975953474411982, jr0 jr0Var, ci3 ci3Var, String str, rw0 rw0Var, c7 c7Var, Optional optional) {
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
        this.m = new ii((Object) null, Boolean.FALSE);
        this.n = new AtomicBoolean(false);
        this.f31o = new AtomicBoolean(false);
        this.y = new H15186625828076266306();
    }

    public abstract void a(int i);

    @Override // dev.epro.r0.H8032588520594078423
    public final void a(AdActivity adActivity) {
        byte b;
        Window window;
        this.l = adActivity;
        if (this.f31o.get()) {
            adActivity.finish();
            return;
        }
        byte b2 = 1;
        if (this.n.getAndSet(true)) {
            b = 2;
        } else {
            X7175349259954592591 x7175349259954592591 = this.k;
            R4833348786910499294 r4833348786910499294 = null;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c(null);
            }
            adActivity.a().a(adActivity, this);
            ao aoVar = ao.a$11;
            o();
            if (i()) {
                j().setLayerType(1, null);
            } else {
                Window window2 = adActivity.getWindow();
                if (window2 != null) {
                    window2.setFlags(16777216, 16777216);
                }
            }
            RelativeLayout relativeLayout = new RelativeLayout(adActivity);
            relativeLayout.setId(View.generateViewId());
            relativeLayout.setBackgroundColor(this.v ? 0 : -16777216);
            this.p = relativeLayout;
            int i = Build.VERSION.SDK_INT;
            jr0 jr0Var = this.e;
            if (i >= 31) {
                jr0Var.getClass();
                if (((Boolean) jr0Var.a("gads:enable_blur_transparent_background", Boolean.TRUE, aoVar)).booleanValue() && (window = adActivity.getWindow()) != null) {
                    window.setBackgroundBlurRadius(this.z);
                }
            }
            if (this.w) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(j(), false);
                jr0Var.getClass();
                Boolean bool = Boolean.FALSE;
                if (((Boolean) jr0Var.a("gads:custom_webview_disable_text_classifier:enabled", bool, aoVar)).booleanValue() && i >= 27) {
                    j().setTextClassifier(TextClassifier.NO_OP);
                }
                if (((Boolean) jr0Var.a("gads:custom_webview_disable_downloads:enabled", bool, aoVar)).booleanValue()) {
                    j().setDownloadListener(new I1522261947689746118());
                }
                if (i >= 28) {
                    adActivity.setShowWhenLocked(true);
                } else {
                    adActivity.getWindow().addFlags(524288);
                }
                this.x = a(relativeLayout);
            } else {
                relativeLayout.addView(g(), -1, -1);
                int intValue = ((Number) jr0Var.a("gad:interstitial:close_button_padding_dip", O17574792317020433029.c(jr0Var, "gad:interstitial:close_button_padding_dip", 20), ao.a$18)).intValue();
                boolean booleanValue = ((Boolean) jr0Var.a("gads:force_top_right_close_button:enabled", Boolean.TRUE, aoVar)).booleanValue();
                iu iuVar = new iu(adActivity, (String) jr0Var.a("gads:close_button_asset_name", "white", ao.a$6), new ju(booleanValue ? intValue : 0, booleanValue ? 0 : intValue, intValue));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(10);
                if (booleanValue) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(9);
                }
                this.r = iuVar;
                iuVar.a = new H2607093550274855851(this, (byte) 4);
                if ((!this.s || h()) && !f()) {
                    iu iuVar2 = this.r;
                    if (iuVar2 != null) {
                        iuVar2.setVisibility(0);
                    }
                    this.s = false;
                } else {
                    iu iuVar3 = this.r;
                    if (iuVar3 != null) {
                        iuVar3.setVisibility(8);
                    }
                    this.s = true;
                }
                RelativeLayout relativeLayout2 = this.p;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(iuVar, layoutParams);
                }
                a(iuVar);
            }
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
            adActivity.setContentView(relativeLayout, layoutParams2);
            J8045362843799184672.s0(new ct0(this, r4833348786910499294, b2));
            fb fbVar = new fb((Object) this, (Object) relativeLayout, r4833348786910499294, (byte) 22);
            W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            b = 2;
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(fbVar, null, (byte) 1), 2);
        }
        this.j.ifPresent(new M16672281404726864930(b));
    }

    public void a$1(int i) {
        if (i == 0) {
            throw null;
        }
        this.t = i;
        AdActivity adActivity = this.l;
        if (adActivity != null) {
            adActivity.finish();
        }
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void a$2() {
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new M16672281404726864930((byte) 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r4 != r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r7.c("aes2", r0) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
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

    public abstract Object b(K14749510448791472029 k14749510448791472029);

    @Override // dev.epro.r0.H8032588520594078423
    public final void c() {
        this.j.ifPresent(new M16672281404726864930((byte) 6));
    }

    public O9245300239821758723 d(R4833348786910499294 r4833348786910499294) {
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void e() {
        this.m.setValue(this, D[0], Boolean.TRUE);
    }

    public boolean f() {
        return false;
    }

    public final View g() {
        ViewGroup viewGroup = this.q;
        if (viewGroup != null) {
            return viewGroup;
        }
        S10823041268949770285.b0("contentView");
        throw null;
    }

    public boolean h() {
        return false;
    }

    @Override // dev.epro.r0.Y8405992380652585640
    public final void handleOnBackPressed() {
        U6333859635337865127 a;
        if (j().canGoBack()) {
            j().goBack();
            return;
        }
        if (!((AtomicBoolean) this.i.a).get() && !j().k.get()) {
            ct0 ct0Var = new ct0(this, null, (byte) 3);
            W5797197595347441198 w5797197595347441198 = this.b;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ct0Var, null, (byte) 1), 2);
            return;
        }
        this.t = 1;
        setEnabled(false);
        AdActivity adActivity = this.l;
        if (adActivity == null || (a = adActivity.a()) == null) {
            return;
        }
        a.c();
    }

    public boolean i() {
        return false;
    }

    public abstract tx0 j();

    public abstract int k();

    public final void l() {
        N12893830608069839869 n12893830608069839869 = new N12893830608069839869(this, null, (byte) 6);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        this.k = R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n12893830608069839869, null, (byte) 1), 2);
    }

    public final void n() {
        AdActivity adActivity = this.l;
        if (adActivity == null || !adActivity.isFinishing() || this.f31o.get()) {
            return;
        }
        ct0 ct0Var = new ct0(this, null, (byte) 0);
        W5797197595347441198 w5797197595347441198 = this.b;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ct0Var, null, (byte) 1), 2);
    }

    public final void o() {
        try {
            AdActivity adActivity = this.l;
            if (adActivity == null) {
                return;
            }
            adActivity.setRequestedOrientation(k());
        } catch (IllegalStateException e) {
            xv.c("Unable to update orientation: " + e, null);
        }
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onDestroy() {
        n();
        this.j.ifPresent(new M16672281404726864930((byte) 3));
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onPause() {
        n();
        this.j.ifPresent(new M16672281404726864930((byte) 1));
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onResume() {
        AdActivity adActivity;
        Window window;
        AdActivity adActivity2 = this.l;
        if (adActivity2 != null && !adActivity2.isInMultiWindowMode() && (adActivity = this.l) != null && (window = adActivity.getWindow()) != null) {
            M9197813449740923653 m9197813449740923653 = new M9197813449740923653(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            H4776669175763245653 s7186231212856355878 = i >= 35 ? new S7186231212856355878(window, m9197813449740923653) : i >= 30 ? new S3454875417302688768(window, m9197813449740923653) : i >= 26 ? new N17192714187392118750(window, m9197813449740923653) : new Z5540756766699434826(window, m9197813449740923653);
            if (this.u) {
                s7186231212856355878.o();
            }
            s7186231212856355878.i(this.u ? 519 : 1);
        }
        if (!j().k.get()) {
            j().onResume();
        }
        this.j.ifPresent(new M16672281404726864930((byte) 0));
    }

    @Override // dev.epro.r0.H8032588520594078423
    public void onStop() {
        if (!j().k.get()) {
            j().onPause();
        }
        n();
        this.j.ifPresent(new M16672281404726864930((byte) 5));
    }

    public Object c(R14062301455140331524 r14062301455140331524) {
        return a(this, r14062301455140331524);
    }

    public Object e(N12893830608069839869 n12893830608069839869) {
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // dev.epro.r0.H8032588520594078423
    public final void b() {
        this.j.ifPresent(new M16672281404726864930((byte) 7));
    }

    public void a(iu iuVar) {
    }

    public Object a(boolean z, kg0 kg0Var) {
        return O9245300239821758723.a;
    }

    public O9245300239821758723 a(K14749510448791472029 k14749510448791472029) {
        return O9245300239821758723.a;
    }

    public Toolbar a(RelativeLayout relativeLayout) {
        return a(relativeLayout, "");
    }

    public final Toolbar a(RelativeLayout relativeLayout, String str) {
        Toolbar toolbar = new Toolbar(this.l);
        toolbar.setId(View.generateViewId());
        g().setId(View.generateViewId());
        toolbar.setBackgroundColor(-12303292);
        byte b = 0;
        toolbar.setTitleMarginStart(0);
        toolbar.setSubtitle(str);
        toolbar.setVisibility(0);
        toolbar.setContentDescription("gma_custom_webview_toolbar");
        try {
            toolbar.setNavigationIcon(this.a.getResources().getDrawable(R.drawable.admob_close_button_white_cross, null));
        } catch (Resources.NotFoundException | NullPointerException unused) {
        }
        toolbar.setNavigationOnClickListener(new X5670102799181443745(this, b));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        relativeLayout.addView(toolbar, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, toolbar.getId());
        layoutParams2.addRule(12);
        relativeLayout.addView(g(), layoutParams2);
        return toolbar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0132, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r12, r3, r0) == r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r12 != r8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (r12 == r8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        if (r12 != r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009a, code lost:
    
        if (dev.epro.r0.R7033599853981556291.d0(r1, r9, r0) == r8) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ads_mobile_sdk.et0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v19, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Boolean, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.et0 r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.a(ads_mobile_sdk.et0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (r14 != r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r13.a(r1, "onhide", r0) == r8) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.tx0 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.et0.a(ads_mobile_sdk.tx0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean a(Context context) {
        ci3 ci3Var = this.f;
        W5797197595347441198 w5797197595347441198 = this.d;
        context.getClass();
        byte b = 4;
        R4833348786910499294 r4833348786910499294 = null;
        try {
            j().f113o = this;
            context.startActivity(this.h.a(context, this));
            l();
            return true;
        } catch (ActivityNotFoundException e) {
            zi3.a(w5797197595347441198, new ct0(this, r4833348786910499294, b));
            zi3.a(4, "Exception starting Activity", e);
            ci3Var.a("AdActivityLauncher.show", (Throwable) e);
            return false;
        } catch (SecurityException e2) {
            zi3.a(w5797197595347441198, new ct0(this, r4833348786910499294, (byte) 5));
            zi3.a(4, "Exception starting Activity", e2);
            ci3Var.a("AdActivityLauncher.show", (Throwable) e2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r6.b(r0) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        if (r8.c(r0) == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0077, B:15:0x007b, B:16:0x007e, B:17:0x0082), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:29:0x0057, B:31:0x005b, B:33:0x005f, B:35:0x0065), top: B:28:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v9, types: [dev.epro.r0.R8015591507171738907] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, dev.epro.r0.K14749510448791472029 r8) {
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

    public Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        return O9245300239821758723.a;
    }

    public Object a(View view, R4833348786910499294 r4833348786910499294) {
        return O9245300239821758723.a;
    }
}
