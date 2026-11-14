package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class r62 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ ads_mobile_sdk.w62 a;
    public final /* synthetic */ ads_mobile_sdk.m6 b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r62(ads_mobile_sdk.w62 w62Var, ads_mobile_sdk.m6 m6Var, android.view.View view, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.a = w62Var;
        this.b = m6Var;
        this.c = view;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                android.view.View view = this.c;
                new ads_mobile_sdk.r62(this.a, this.b, view, (dev.epro.r0.R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
                return o9245300239821758723;
            default:
                android.view.View view2 = this.c;
                return new ads_mobile_sdk.r62(this.a, this.b, view2, (dev.epro.r0.R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        android.view.View view = this.c;
        ads_mobile_sdk.m6 m6Var = this.b;
        ads_mobile_sdk.w62 w62Var = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                w62Var.e.a(m6Var, view);
                return dev.epro.r0.O9245300239821758723.a;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                return w62Var.e.a(m6Var, view);
        }
    }
}
