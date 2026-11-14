package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Z3383101362411723454;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class zi3 {
    public static final zi3 a = new zi3();

    public static void a(pu0 pu0Var, boolean z) {
        String str;
        pu0Var.getClass();
        if (pu0Var instanceof tu0) {
            str = ((tu0) pu0Var).c;
        } else if (pu0Var instanceof qu0) {
            qu0 qu0Var = (qu0) pu0Var;
            String str2 = qu0Var.e;
            str = str2 == null ? qu0Var.c.getClass().getName() : str2;
        } else if (pu0Var instanceof bv0) {
            str = "WebView destroyed when method invoked.";
        } else if (pu0Var instanceof zu0) {
            zu0 zu0Var = (zu0) pu0Var;
            str = zu0Var.c + ": " + zu0Var.d + " on url: " + zu0Var.e;
        } else if (pu0Var instanceof su0) {
            S12306309242770307923 s12306309242770307923 = ((su0) pu0Var).c;
            str = s12306309242770307923.L() + ": " + s12306309242770307923.N();
        } else if (pu0Var instanceof ru0) {
            ru0 ru0Var = (ru0) pu0Var;
            str = "Code: " + ru0Var.c + ", Message: " + ru0Var.d;
        } else if (pu0Var instanceof wu0) {
            str = ((wu0) pu0Var).c;
        } else if (pu0Var instanceof uu0) {
            str = ((uu0) pu0Var).c;
        } else if (pu0Var instanceof yu0) {
            str = ((yu0) pu0Var).c;
        } else if (pu0Var instanceof av0) {
            str = "Live WebView cap reached. Too many WebViews are currently open in the application.";
        } else {
            if (!(pu0Var instanceof vu0)) {
                Z3383101362411723454.g();
                return;
            }
            str = ((vu0) pu0Var).c;
        }
        a(false, str, pu0Var.b(), z);
    }

    public static void a(String str) {
        th3 a2 = ji3.a();
        a2.e().m = false;
        a2.e().s.add(str);
    }

    public static X7175349259954592591 a(W5797197595347441198 w5797197595347441198, L12639328004344855510 l12639328004344855510) {
        w5797197595347441198.getClass();
        return R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(l12639328004344855510, null, (byte) 1), 2);
    }

    public static void a(Exception exc) {
        ArrayList arrayList = G6547577305291411977.l(exc).s;
        String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        }
        arrayList.add(message);
    }

    public static void a(int i, String str, Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        str.getClass();
        a(true, str, th, false);
    }

    public static void a(boolean z, String str, Throwable th, boolean z2) {
        th3 a2;
        if (z2) {
            a2 = ji3.b().a;
            if (a2 == null) {
                return;
            }
        } else {
            a2 = ji3.a();
        }
        if (str != null) {
            a2.e().s.add(str);
        }
        a2.e().m = false;
        if (th != null) {
            if (z) {
                a2.a(th);
            } else {
                a2.b(th);
            }
        }
    }
}
