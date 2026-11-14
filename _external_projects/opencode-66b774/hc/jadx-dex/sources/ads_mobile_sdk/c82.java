package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c82 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.J12078565427869724451 {
    public /* synthetic */ ads_mobile_sdk.m6 a;
    public final /* synthetic */ ads_mobile_sdk.i82 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c82(ads_mobile_sdk.i82 i82Var, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.b = i82Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ads_mobile_sdk.c82 c82Var = new ads_mobile_sdk.c82(this.b, (dev.epro.r0.R4833348786910499294) obj3);
        c82Var.a = (ads_mobile_sdk.m6) obj2;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        c82Var.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.m6 m6Var = this.a;
        ads_mobile_sdk.i82 i82Var = this.b;
        java.util.List list = i82Var.n;
        list.getClass();
        dev.epro.r0.P17571903987102865660.s0(list);
        list.getClass();
        android.view.View view = (android.view.View) dev.epro.r0.R9411874267597469228.L0(list);
        if (view != null) {
            i82Var.f.a(m6Var, view);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
