package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xl1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ android.view.WindowManager a;
    public final /* synthetic */ ads_mobile_sdk.tx0 b;
    public final /* synthetic */ android.view.WindowManager.LayoutParams c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl1(android.view.WindowManager windowManager, ads_mobile_sdk.tx0 tx0Var, android.view.WindowManager.LayoutParams layoutParams, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = windowManager;
        this.b = tx0Var;
        this.c = layoutParams;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.xl1(this.a, this.b, this.c, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.xl1(this.a, this.b, this.c, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
            default:
                create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        android.view.WindowManager.LayoutParams layoutParams = this.c;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        android.view.WindowManager windowManager = this.a;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                windowManager.updateViewLayout(tx0Var, layoutParams);
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                windowManager.updateViewLayout(tx0Var, layoutParams);
                break;
        }
        return o9245300239821758723;
    }
}
