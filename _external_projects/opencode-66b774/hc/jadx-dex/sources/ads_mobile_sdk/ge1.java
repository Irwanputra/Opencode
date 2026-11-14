package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ge1 {
    public final ads_mobile_sdk.tx0 a;
    public final ads_mobile_sdk.mi3 b;
    public final ads_mobile_sdk.eg2 c;
    public final ads_mobile_sdk.m31 d;
    public final ads_mobile_sdk.kz2 e;
    public final ads_mobile_sdk.k8 f;
    public final ads_mobile_sdk.jr0 g;

    public ge1(ads_mobile_sdk.tx0 tx0Var, ads_mobile_sdk.mi3 mi3Var, ads_mobile_sdk.eg2 eg2Var, ads_mobile_sdk.m31 m31Var, ads_mobile_sdk.kz2 kz2Var, ads_mobile_sdk.k8 k8Var, ads_mobile_sdk.jr0 jr0Var) {
        mi3Var.getClass();
        kz2Var.getClass();
        k8Var.getClass();
        jr0Var.getClass();
        this.a = tx0Var;
        this.b = mi3Var;
        this.c = eg2Var;
        this.d = m31Var;
        this.e = kz2Var;
        this.f = k8Var;
        this.g = jr0Var;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getClickSignals(java.lang.String str) {
        str.getClass();
        if (str.length() == 0) {
            return "";
        }
        ads_mobile_sdk.kz2 kz2Var = this.e;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_CLICK_SIGNALS;
        ads_mobile_sdk.mi3 mi3Var = this.b;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                java.lang.String strA = this.f.a(this.a, str);
                em2VarA.close();
                return strA;
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
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
            try {
                java.lang.String strA2 = this.f.a(this.a, str);
                th3VarA.close();
                return strA2;
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
                    if (th2 instanceof ads_mobile_sdk.dv0) {
                        throw th2;
                    }
                    throw new ads_mobile_sdk.iu0(th2);
                } finally {
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getViewSignals() {
        ads_mobile_sdk.kz2 kz2Var = this.e;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_VIEW_SIGNALS;
        ads_mobile_sdk.mi3 mi3Var = this.b;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                java.lang.String strA = this.f.a(this.a);
                em2VarA.close();
                return strA;
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
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
            try {
                java.lang.String strA2 = this.f.a(this.a);
                th3VarA.close();
                return strA2;
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
                    if (th2 instanceof ads_mobile_sdk.dv0) {
                        throw th2;
                    }
                    throw new ads_mobile_sdk.iu0(th2);
                } finally {
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getViewSignalsJson() {
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        ads_mobile_sdk.kz2 kz2Var = this.e;
        ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_VIEW_SIGNALS;
        ads_mobile_sdk.mi3 mi3Var = this.b;
        dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
        if (ads_mobile_sdk.ji3.b().a == null) {
            ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                ads_mobile_sdk.jr0 jr0Var = this.g;
                jr0Var.getClass();
                boolean zBooleanValue = ((java.lang.Boolean) jr0Var.a("gads:add_placement_id_in_view_signals:enabled", java.lang.Boolean.TRUE, aoVar)).booleanValue();
                ads_mobile_sdk.k8 k8Var = this.f;
                ads_mobile_sdk.tx0 tx0Var = this.a;
                if (zBooleanValue) {
                    java.lang.String strA = k8Var.a(tx0Var, this.c, this.d);
                    em2VarA.close();
                    return strA;
                }
                java.lang.String strA2 = k8Var.a(tx0Var);
                em2VarA.close();
                return strA2;
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
                    if (th instanceof ads_mobile_sdk.dv0) {
                        throw th;
                    }
                    throw new ads_mobile_sdk.iu0(th);
                } finally {
                }
            }
        } else {
            ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
            try {
                ads_mobile_sdk.jr0 jr0Var2 = this.g;
                jr0Var2.getClass();
                boolean zBooleanValue2 = ((java.lang.Boolean) jr0Var2.a("gads:add_placement_id_in_view_signals:enabled", java.lang.Boolean.TRUE, aoVar)).booleanValue();
                ads_mobile_sdk.k8 k8Var2 = this.f;
                ads_mobile_sdk.tx0 tx0Var2 = this.a;
                if (zBooleanValue2) {
                    java.lang.String strA3 = k8Var2.a(tx0Var2, this.c, this.d);
                    th3VarA.close();
                    return strA3;
                }
                java.lang.String strA4 = k8Var2.a(tx0Var2);
                th3VarA.close();
                return strA4;
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
                    if (th2 instanceof ads_mobile_sdk.dv0) {
                        throw th2;
                    }
                    throw new ads_mobile_sdk.iu0(th2);
                } finally {
                }
            }
        }
    }

    @android.webkit.JavascriptInterface
    public final void notify(java.lang.String str) {
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        ads_mobile_sdk.iy0 iy0VarB = this.a.b();
        android.net.Uri uri = android.net.Uri.parse(str);
        uri.getClass();
        dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.vx0(iy0VarB, uri, null, (byte) 1));
    }

    @android.webkit.JavascriptInterface
    public final void notifyResult(java.lang.String str) {
        str.getClass();
        dev.epro.r0.J8045362843799184672.s0(new ads_mobile_sdk.fb(this.a.b(), str, (dev.epro.r0.R4833348786910499294) null, (byte) 29));
    }
}
