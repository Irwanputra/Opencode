package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class op3 {
    public final android.content.Context a;
    public final ads_mobile_sdk.bs3 b;
    public final ads_mobile_sdk.jr0 c;

    public op3(android.content.Context context, ads_mobile_sdk.bs3 bs3Var, ads_mobile_sdk.jr0 jr0Var) {
        context.getClass();
        bs3Var.getClass();
        jr0Var.getClass();
        this.a = context;
        this.b = bs3Var;
        this.c = jr0Var;
    }

    public final void a(dev.epro.r0.F7878618420024429111 f7878618420024429111, boolean z, ads_mobile_sdk.gq3 gq3Var) {
        java.util.Set setV0;
        ads_mobile_sdk.jr0 jr0Var = this.c;
        f7878618420024429111.getClass();
        try {
            jr0Var.getClass();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
            setV0 = (((java.lang.Boolean) jr0Var.a("gads:webview_profile:enabled", bool, aoVar)).booleanValue() && ((java.lang.Boolean) jr0Var.a("gads:init_profile_during_webview_startup:enabled", java.lang.Boolean.FALSE, aoVar)).booleanValue()) ? dev.epro.r0.O5378677881740157249.V0(new java.lang.String[]{"GMA_WEBVIEW_PROFILE", "Default"}) : dev.epro.r0.T8598786036980488824.z("Default");
        } catch (java.lang.Throwable unused) {
            setV0 = dev.epro.r0.H15747516787109764287.a;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = ads_mobile_sdk.lp3.a;
        ads_mobile_sdk.lp3.a(this.a, f7878618420024429111, z, setV0, gq3Var);
    }
}
