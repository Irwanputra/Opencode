package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r72 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.J12078565427869724451 {
    public /* synthetic */ ads_mobile_sdk.m6 a;
    public final /* synthetic */ ads_mobile_sdk.i82 b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ ads_mobile_sdk.xr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r72(ads_mobile_sdk.i82 i82Var, android.view.View view, ads_mobile_sdk.xr0 xr0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.b = i82Var;
        this.c = view;
        this.d = xr0Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = this.c;
        ads_mobile_sdk.xr0 xr0Var = this.d;
        ads_mobile_sdk.r72 r72Var = new ads_mobile_sdk.r72(this.b, view, xr0Var, (dev.epro.r0.R4833348786910499294) obj3);
        r72Var.a = (ads_mobile_sdk.m6) obj2;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        r72Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.m6 m6Var = this.a;
        ads_mobile_sdk.x52 x52Var = this.b.f;
        x52Var.getClass();
        m6Var.getClass();
        android.view.View view = this.c;
        view.getClass();
        ads_mobile_sdk.ci3 ci3Var = x52Var.f;
        ads_mobile_sdk.f52 f52Var = new ads_mobile_sdk.f52(m6Var, view, this.d, (byte) 0);
        ci3Var.getClass();
        try {
            f52Var.invoke();
        } catch (java.lang.Exception e) {
            ci3Var.a("AddFriendlyObstructionToAdsession", (java.lang.Throwable) e);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
