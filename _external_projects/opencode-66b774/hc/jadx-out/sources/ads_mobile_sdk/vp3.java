package ads_mobile_sdk;

import androidx.webkit.Profile;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import dev.epro.r0.C9731525580007922156;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.J13979756969328643311;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Y2677586711477821327;
import dev.epro.r0.Z3437138737604933638;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vp3 extends R14062301455140331524 implements L12639328004344855510 {
    public tx0 a;
    public boolean b;
    public final /* synthetic */ yp3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C9731525580007922156 e;
    public final /* synthetic */ mi3 f;
    public final /* synthetic */ eg2 g;
    public final /* synthetic */ m31 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ x60 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ fs3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp3(yp3 yp3Var, boolean z, C9731525580007922156 c9731525580007922156, mi3 mi3Var, eg2 eg2Var, m31 m31Var, boolean z2, x60 x60Var, String str, fs3 fs3Var, R4833348786910499294 r4833348786910499294) {
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

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new vp3(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((vp3) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws IOException {
        th3 th3VarA;
        tx0 tx0Var;
        Profile profile;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        Object xu0Var = av0.c;
        ao aoVar = ao.a$11;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        boolean z = this.b;
        if (!z) {
            E17665849472693074628.k(obj);
            xj xjVar = this.c.p;
            boolean z2 = this.d;
            ql1 ql1Var = xjVar.a;
            jr0 jr0Var = ql1Var.a;
            jr0Var.getClass();
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) jr0Var.a("gads:webview_capping:enabled", bool, aoVar)).booleanValue() || z2) {
                int iIncrementAndGet = ql1Var.b.incrementAndGet();
                ql1Var.c = iIncrementAndGet;
                xu0Var = new xu0(Integer.valueOf(iIncrementAndGet));
            } else {
                jr0 jr0Var2 = ql1Var.a;
                jr0Var2.getClass();
                if (!((Boolean) jr0Var2.a("gads:webview_capping:enabled", bool, aoVar)).booleanValue() || ql1Var.b.get() < 5) {
                    while (true) {
                        int i = ql1Var.b.get();
                        if (i >= 5) {
                            break;
                        }
                        int i2 = i + 1;
                        if (ql1Var.b.compareAndSet(i, i2)) {
                            ql1Var.c = i2;
                            xu0Var = new xu0(Integer.valueOf(i2));
                            break;
                        }
                    }
                }
            }
            if (xu0Var instanceof pu0) {
                return xu0Var;
            }
            wv0 wv0Var = wv0.CUI_NAME_WEBVIEW_INITIALIZATION;
            yp3 yp3Var = this.c;
            x60 x60Var = this.j;
            String str = this.k;
            fs3 fs3Var = this.l;
            th3VarA = ji3.a(wv0Var, o2161699089510411363, false);
            try {
                tx0 tx0Var2 = new tx0(yp3Var.d, yp3Var.c, yp3Var.b, x60Var, yp3Var.g, yp3Var.f, yp3Var.a, str, fs3Var, yp3Var.m, yp3Var.j, yp3Var.l, yp3Var.p);
                th3VarA.close();
                AtomicBoolean atomicBoolean = tx0Var2.l;
                xj xjVar2 = this.c.p;
                xjVar2.getClass();
                atomicBoolean.getClass();
                ii iiVar = new ii();
                iiVar.a = xjVar2;
                iiVar.b = atomicBoolean;
                hf2 hf2Var = this.c.q;
                this.a = tx0Var2;
                this.b = true;
                hf2Var.getClass();
                if (hf2.a(hf2Var, tx0Var2, iiVar, this) == z3437138737604933638) {
                    return z3437138737604933638;
                }
                tx0Var = tx0Var2;
            } catch (Throwable th) {
                try {
                    th3VarA.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        th3VarA.a(th);
                    }
                    if (th instanceof P2480554073835519965) {
                        throw new lw0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new du0(th);
                    }
                    if (th instanceof dv0) {
                        throw th;
                    }
                    throw new iu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tx0 tx0Var3 = this.a;
            E17665849472693074628.k(obj);
            tx0Var = tx0Var3;
        }
        C9731525580007922156 lq3Var = this.e;
        if (lq3Var == null) {
            yp3 yp3Var2 = this.c;
            lq3Var = new lq3(tx0Var, yp3Var2.e, this.f, yp3Var2.h, yp3Var2.b, yp3Var2.l);
        }
        Y2677586711477821327 y2677586711477821327 = iy0.v;
        yp3 yp3Var3 = this.c;
        W5797197595347441198 w5797197595347441198 = yp3Var3.b;
        rw0 rw0Var = yp3Var3.h;
        k8 k8Var = yp3Var3.f;
        jr0 jr0Var3 = yp3Var3.l;
        w81 w81Var = yp3Var3.r;
        O12043144740933444288 o12043144740933444288 = yp3Var3.n;
        y2677586711477821327.getClass();
        tx0Var.getClass();
        w5797197595347441198.getClass();
        rw0Var.getClass();
        k8Var.getClass();
        jr0Var3.getClass();
        o12043144740933444288.getClass();
        tx0 tx0Var4 = tx0Var;
        iy0 iy0Var = new iy0(lq3Var, tx0Var4, w5797197595347441198, rw0Var, k8Var, jr0Var3, w81Var, o12043144740933444288);
        ie1 ie1Var = this.c.k;
        mi3 mi3Var = this.f;
        eg2 eg2Var = this.g;
        m31 m31Var = this.h;
        r6 r6Var = ie1Var.a;
        tx0Var4.addJavascriptInterface(new ge1(tx0Var4, mi3Var, eg2Var, m31Var, (kz2) ((V2597580950516131749) r6Var.a).get(), (k8) ((V2597580950516131749) r6Var.b).get(), (jr0) ((V2597580950516131749) r6Var.c).get()), "googleAdsJsInterface");
        tx0Var4.setWebViewClient(iy0Var);
        tx0Var4.y = iy0Var;
        tx0Var4.setWebChromeClient(new xw0(iy0Var));
        tx0Var4.x = lq3Var;
        if (!this.i) {
            jr0 jr0Var4 = this.c.l;
            jr0Var4.getClass();
            if (((Boolean) jr0Var4.a("creative_webview_init_set_profile:enabled", Boolean.FALSE, aoVar)).booleanValue()) {
                op3 op3Var = this.c.m;
                op3Var.getClass();
                try {
                    bs3 bs3Var = op3Var.b;
                    if (Q6344330807969154194.b(WebViewFeature.MULTI_PROFILE)) {
                        bs3Var.getClass();
                        try {
                            profile = bs3Var.m;
                        } catch (Throwable unused) {
                        }
                        String name = profile != null ? profile.getName() : null;
                        if (name == null && ((Boolean) bs3Var.s.getValue()).booleanValue()) {
                            R7033599853981556291.E(bs3Var.e, null, null, new J13979756969328643311((Object) bs3Var, (R4833348786910499294) null, (byte) 4), 3);
                        } else if (name != null && name.equals("GMA_WEBVIEW_PROFILE")) {
                        }
                        th3VarA = ji3.a(wv0.CUI_NAME_WEBVIEW_PROFILE_SET, o2161699089510411363, true);
                        try {
                            WebViewCompat.setProfile(tx0Var4, "GMA_WEBVIEW_PROFILE");
                            th3VarA.close();
                        } catch (Throwable th3) {
                            try {
                                th3VarA.b(th3);
                                if (th3 instanceof N340633841638932414) {
                                    throw th3;
                                }
                                if (!(th3 instanceof P2480554073835519965) && !(th3 instanceof CancellationException)) {
                                    th3VarA.a(th3);
                                }
                                if (th3 instanceof P2480554073835519965) {
                                    throw new lw0(th3);
                                }
                                if (th3 instanceof CancellationException) {
                                    throw new du0(th3);
                                }
                                if (th3 instanceof dv0) {
                                    throw th3;
                                }
                                throw new iu0(th3);
                            } finally {
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return new xu0(tx0Var4);
    }
}
