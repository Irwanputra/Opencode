package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class dj0 {
    public final ads_mobile_sdk.g0 a;
    public final ads_mobile_sdk.jr0 b;
    public final android.os.PowerManager c;
    public final android.app.KeyguardManager d;

    public dj0(android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.jr0 jr0Var) {
        context.getClass();
        g0Var.getClass();
        jr0Var.getClass();
        this.a = g0Var;
        this.b = jr0Var;
        this.c = (android.os.PowerManager) context.getSystemService(android.os.PowerManager.class);
        this.d = (android.app.KeyguardManager) context.getSystemService(android.app.KeyguardManager.class);
    }

    public final boolean a(ads_mobile_sdk.qw2 qw2Var, ads_mobile_sdk.z1 z1Var) {
        qw2Var.getClass();
        z1Var.getClass();
        ads_mobile_sdk.jr0 jr0Var = this.b;
        jr0Var.getClass();
        dev.epro.r0.Y2677586711477821327 y2677586711477821327 = ads_mobile_sdk.qw2.b;
        if (((java.util.List) jr0Var.a("gads:lock_screen_viewable_formats", dev.epro.r0.K5751602218013079365.U("native"), ads_mobile_sdk.ao.a$23)).contains(qw2Var.a)) {
            return true;
        }
        return ((java.lang.Boolean) jr0Var.a("gads:lockscreen_display_allowlist", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() && z1Var.B;
    }

    public final android.view.WindowManager b(android.content.Context context) {
        context.getClass();
        java.lang.Object systemService = c(context).getSystemService((java.lang.Class<java.lang.Object>) android.view.WindowManager.class);
        systemService.getClass();
        return (android.view.WindowManager) systemService;
    }

    public final android.content.Context c(android.content.Context context) {
        context.getClass();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            return activity;
        }
        android.app.Activity activityB = this.a.b();
        return activityB != null ? activityB : context;
    }

    public final boolean a(android.view.View view, boolean z) {
        view.getClass();
        if (this.c.isInteractive() && view.getVisibility() == 0 && view.isShown() && view.getLocalVisibleRect(new android.graphics.Rect()) && view.getGlobalVisibleRect(new android.graphics.Rect())) {
            return z || !this.d.isKeyguardLocked();
        }
        return false;
    }
}
