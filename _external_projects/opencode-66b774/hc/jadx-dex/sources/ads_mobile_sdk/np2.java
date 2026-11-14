package ads_mobile_sdk;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class np2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ ads_mobile_sdk.dq2 a;
    public final /* synthetic */ byte t;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np2(ads_mobile_sdk.dq2 dq2Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.a = dq2Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.dq2 dq2Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.np2(dq2Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.np2(dq2Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.dq2 dq2Var = this.a;
        switch (b) {
            case 0:
                new ads_mobile_sdk.np2(dq2Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
                break;
            default:
                new ads_mobile_sdk.np2(dq2Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final native java.lang.Object invokeSuspend(java.lang.Object obj);
}
