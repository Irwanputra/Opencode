package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wl1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.tx0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ads_mobile_sdk.zl1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl1(ads_mobile_sdk.tx0 tx0Var, int i, int i2, ads_mobile_sdk.zl1 zl1Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = tx0Var;
        this.b = i;
        this.c = i2;
        this.d = zl1Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.wl1(this.a, this.b, this.c, this.d, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ads_mobile_sdk.wl1 wl1VarCreate = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        wl1VarCreate.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.fs3 fs3Var = new ads_mobile_sdk.fs3(2, this.b, this.c, 8);
        ads_mobile_sdk.tx0 tx0Var = this.a;
        tx0Var.a(fs3Var);
        android.webkit.WebSettings settings = tx0Var.getSettings();
        ads_mobile_sdk.jr0 jr0Var = this.d.a;
        jr0Var.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ads_mobile_sdk.ao aoVar = ads_mobile_sdk.ao.a$11;
        settings.setUseWideViewPort(((java.lang.Boolean) jr0Var.a("gads:use_wide_viewport:enabled", bool, aoVar)).booleanValue());
        android.webkit.WebSettings settings2 = tx0Var.getSettings();
        jr0Var.getClass();
        settings2.setLoadWithOverviewMode(((java.lang.Boolean) jr0Var.a("gads:load_with_overview_mode:enabled", bool, aoVar)).booleanValue());
        return dev.epro.r0.O9245300239821758723.a;
    }
}
