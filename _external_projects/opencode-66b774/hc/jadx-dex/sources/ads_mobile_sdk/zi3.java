package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zi3 {
    public static final ads_mobile_sdk.zi3 a = new ads_mobile_sdk.zi3();

    public static void a(ads_mobile_sdk.pu0 pu0Var, boolean z) {
        java.lang.String name;
        pu0Var.getClass();
        if (pu0Var instanceof ads_mobile_sdk.tu0) {
            name = ((ads_mobile_sdk.tu0) pu0Var).c;
        } else if (pu0Var instanceof ads_mobile_sdk.qu0) {
            ads_mobile_sdk.qu0 qu0Var = (ads_mobile_sdk.qu0) pu0Var;
            java.lang.String str = qu0Var.e;
            name = str == null ? qu0Var.c.getClass().getName() : str;
        } else if (pu0Var instanceof ads_mobile_sdk.bv0) {
            name = "WebView destroyed when method invoked.";
        } else if (pu0Var instanceof ads_mobile_sdk.zu0) {
            ads_mobile_sdk.zu0 zu0Var = (ads_mobile_sdk.zu0) pu0Var;
            name = zu0Var.c + ": " + zu0Var.d + " on url: " + zu0Var.e;
        } else if (pu0Var instanceof ads_mobile_sdk.su0) {
            dev.epro.r0.S12306309242770307923 s12306309242770307923 = ((ads_mobile_sdk.su0) pu0Var).c;
            name = s12306309242770307923.L() + ": " + s12306309242770307923.N();
        } else if (pu0Var instanceof ads_mobile_sdk.ru0) {
            ads_mobile_sdk.ru0 ru0Var = (ads_mobile_sdk.ru0) pu0Var;
            name = "Code: " + ru0Var.c + ", Message: " + ru0Var.d;
        } else if (pu0Var instanceof ads_mobile_sdk.wu0) {
            name = ((ads_mobile_sdk.wu0) pu0Var).c;
        } else if (pu0Var instanceof ads_mobile_sdk.uu0) {
            name = ((ads_mobile_sdk.uu0) pu0Var).c;
        } else if (pu0Var instanceof ads_mobile_sdk.yu0) {
            name = ((ads_mobile_sdk.yu0) pu0Var).c;
        } else if (pu0Var instanceof ads_mobile_sdk.av0) {
            name = "Live WebView cap reached. Too many WebViews are currently open in the application.";
        } else {
            if (!(pu0Var instanceof ads_mobile_sdk.vu0)) {
                dev.epro.r0.Z3383101362411723454.g();
                return;
            }
            name = ((ads_mobile_sdk.vu0) pu0Var).c;
        }
        a(false, name, pu0Var.b(), z);
    }

    public static void a(java.lang.String str) {
        ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a();
        th3VarA.e().m = false;
        th3VarA.e().s.add(str);
    }

    public static dev.epro.r0.X7175349259954592591 a(dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.L12639328004344855510 l12639328004344855510) {
        w5797197595347441198.getClass();
        return dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(l12639328004344855510, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
    }

    public static void a(java.lang.Exception exc) {
        java.util.ArrayList arrayList = dev.epro.r0.G6547577305291411977.l(exc).s;
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = exc.getClass().getName();
        }
        arrayList.add(message);
    }

    public static void a(int i, java.lang.String str, java.lang.Throwable th) {
        if ((i & 2) != 0) {
            th = null;
        }
        str.getClass();
        a(true, str, th, false);
    }

    public static void a(boolean z, java.lang.String str, java.lang.Throwable th, boolean z2) {
        ads_mobile_sdk.th3 th3VarA;
        if (z2) {
            th3VarA = ads_mobile_sdk.ji3.b().a;
            if (th3VarA == null) {
                return;
            }
        } else {
            th3VarA = ads_mobile_sdk.ji3.a();
        }
        if (str != null) {
            th3VarA.e().s.add(str);
        }
        th3VarA.e().m = false;
        if (th != null) {
            if (z) {
                th3VarA.a(th);
            } else {
                th3VarA.b(th);
            }
        }
    }
}
