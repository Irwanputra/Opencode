package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mh2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ java.lang.Object a;
    public final /* synthetic */ ads_mobile_sdk.z03 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh2(ads_mobile_sdk.z03 z03Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = z03Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.z03 z03Var = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.mh2 mh2Var = new ads_mobile_sdk.mh2(z03Var, r4833348786910499294, (byte) 0);
                mh2Var.a = obj;
                return mh2Var;
            default:
                ads_mobile_sdk.mh2 mh2Var2 = new ads_mobile_sdk.mh2(z03Var, r4833348786910499294, (byte) 1);
                mh2Var2.a = obj;
                return mh2Var2;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.z03 z03Var = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.mh2 mh2Var = new ads_mobile_sdk.mh2(z03Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0);
                mh2Var.a = (ads_mobile_sdk.tx0) obj;
                mh2Var.invokeSuspend(o9245300239821758723);
                break;
            default:
                ads_mobile_sdk.mh2 mh2Var2 = new ads_mobile_sdk.mh2(z03Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1);
                mh2Var2.a = (ads_mobile_sdk.tx0) obj;
                mh2Var2.invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                ((ads_mobile_sdk.tx0) this.a).b().u = this.b;
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.tx0 tx0Var = (ads_mobile_sdk.tx0) this.a;
                tx0Var.b().u = this.b;
                tx0Var.setOnClickListener(new dev.epro.r0.X5670102799181443745(this.b, (byte) 1));
                tx0Var.setOnTouchListener(new dev.epro.r0.N12300934049512334304(this.b));
                break;
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
