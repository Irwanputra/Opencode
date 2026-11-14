package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R4833348786910499294;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ge1 {
    public final tx0 a;
    public final mi3 b;
    public final eg2 c;
    public final m31 d;
    public final kz2 e;
    public final k8 f;
    public final jr0 g;

    public ge1(tx0 tx0Var, mi3 mi3Var, eg2 eg2Var, m31 m31Var, kz2 kz2Var, k8 k8Var, jr0 jr0Var) {
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

    @JavascriptInterface
    public final String getClickSignals(String str) {
        str.getClass();
        if (str.length() == 0) {
            return "";
        }
        kz2 kz2Var = this.e;
        wv0 wv0Var = wv0.CUI_NAME_CLICK_SIGNALS;
        mi3 mi3Var = this.b;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                String a2 = this.f.a(this.a, str);
                a.close();
                return a2;
            } catch (Throwable th) {
                try {
                    a.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a.a(th);
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
                } finally {
                }
            }
        } else {
            th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                String a4 = this.f.a(this.a, str);
                a3.close();
                return a4;
            } catch (Throwable th2) {
                try {
                    a3.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a3.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } finally {
                }
            }
        }
    }

    @JavascriptInterface
    public final String getViewSignals() {
        kz2 kz2Var = this.e;
        wv0 wv0Var = wv0.CUI_NAME_VIEW_SIGNALS;
        mi3 mi3Var = this.b;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                String a2 = this.f.a(this.a);
                a.close();
                return a2;
            } catch (Throwable th) {
                try {
                    a.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a.a(th);
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
                } finally {
                }
            }
        } else {
            th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                String a4 = this.f.a(this.a);
                a3.close();
                return a4;
            } catch (Throwable th2) {
                try {
                    a3.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a3.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } finally {
                }
            }
        }
    }

    @JavascriptInterface
    public final String getViewSignalsJson() {
        ao aoVar = ao.a$11;
        kz2 kz2Var = this.e;
        wv0 wv0Var = wv0.CUI_NAME_VIEW_SIGNALS;
        mi3 mi3Var = this.b;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                jr0 jr0Var = this.g;
                jr0Var.getClass();
                boolean booleanValue = ((Boolean) jr0Var.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, aoVar)).booleanValue();
                k8 k8Var = this.f;
                tx0 tx0Var = this.a;
                if (booleanValue) {
                    String a2 = k8Var.a(tx0Var, this.c, this.d);
                    a.close();
                    return a2;
                }
                String a3 = k8Var.a(tx0Var);
                a.close();
                return a3;
            } catch (Throwable th) {
                try {
                    a.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a.a(th);
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
                } finally {
                }
            }
        } else {
            th3 a4 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                jr0 jr0Var2 = this.g;
                jr0Var2.getClass();
                boolean booleanValue2 = ((Boolean) jr0Var2.a("gads:add_placement_id_in_view_signals:enabled", Boolean.TRUE, aoVar)).booleanValue();
                k8 k8Var2 = this.f;
                tx0 tx0Var2 = this.a;
                if (booleanValue2) {
                    String a5 = k8Var2.a(tx0Var2, this.c, this.d);
                    a4.close();
                    return a5;
                }
                String a6 = k8Var2.a(tx0Var2);
                a4.close();
                return a6;
            } catch (Throwable th2) {
                try {
                    a4.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a4.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } finally {
                }
            }
        }
    }

    @JavascriptInterface
    public final void notify(String str) {
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        iy0 b = this.a.b();
        Uri parse = Uri.parse(str);
        parse.getClass();
        J8045362843799184672.s0(new vx0(b, parse, null, (byte) 1));
    }

    @JavascriptInterface
    public final void notifyResult(String str) {
        str.getClass();
        J8045362843799184672.s0(new fb(this.a.b(), str, (R4833348786910499294) null, (byte) 29));
    }
}
