package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class e72 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ ads_mobile_sdk.m72 a;
    public final /* synthetic */ ads_mobile_sdk.dj1 b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ ads_mobile_sdk.xr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e72(ads_mobile_sdk.m72 m72Var, ads_mobile_sdk.dj1 dj1Var, android.view.View view, ads_mobile_sdk.xr0 xr0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.a = m72Var;
        this.b = dj1Var;
        this.c = view;
        this.d = xr0Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = this.c;
        ads_mobile_sdk.xr0 xr0Var = this.d;
        return new ads_mobile_sdk.e72(this.a, this.b, view, xr0Var, (dev.epro.r0.R4833348786910499294) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.x52 x52Var = this.a.c;
        x52Var.getClass();
        ads_mobile_sdk.dj1 dj1Var = this.b;
        dj1Var.getClass();
        android.view.View view = this.c;
        view.getClass();
        ads_mobile_sdk.xr0 xr0Var = this.d;
        xr0Var.getClass();
        ads_mobile_sdk.ci3 ci3Var = x52Var.f;
        ads_mobile_sdk.f52 f52Var = new ads_mobile_sdk.f52(dj1Var, view, xr0Var, (byte) 1);
        ci3Var.getClass();
        try {
            f52Var.invoke();
            return dev.epro.r0.O9245300239821758723.a;
        } catch (java.lang.Exception e) {
            ci3Var.a("AddFriendlyObstructionToJavaScriptSessionService", (java.lang.Throwable) e);
            return null;
        }
    }
}
