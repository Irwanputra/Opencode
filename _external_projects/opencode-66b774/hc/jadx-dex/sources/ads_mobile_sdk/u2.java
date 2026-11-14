package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class u2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ java.lang.Object a;
    public final /* synthetic */ ads_mobile_sdk.y2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(ads_mobile_sdk.y2 y2Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = y2Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.y2 y2Var = this.b;
        switch (b) {
            case 0:
                ads_mobile_sdk.u2 u2Var = new ads_mobile_sdk.u2(y2Var, r4833348786910499294, (byte) 0);
                u2Var.a = obj;
                return u2Var;
            default:
                ads_mobile_sdk.u2 u2Var2 = new ads_mobile_sdk.u2(y2Var, r4833348786910499294, (byte) 1);
                u2Var2.a = obj;
                return u2Var2;
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
                ads_mobile_sdk.u2 u2Var = new ads_mobile_sdk.u2(this.b, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1);
                u2Var.a = (ads_mobile_sdk.tx0) obj;
                u2Var.invokeSuspend(o9245300239821758723);
                break;
        }
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.y2 y2Var = this.b;
        switch (b) {
            case 0:
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) this.a;
                for (java.util.Map.Entry entry : ((java.util.Map) ((dev.epro.r0.R4239627874707364917) y2Var).b).entrySet()) {
                    ads_mobile_sdk.ha haVar = new ads_mobile_sdk.ha((java.lang.String) entry.getKey(), entry.getValue(), null, (byte) 22);
                    w5797197595347441198.getClass();
                    dev.epro.r0.R7033599853981556291.E(w5797197595347441198, dev.epro.r0.I3826119971291161142.a, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(haVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                }
                break;
            default:
                dev.epro.r0.E17665849472693074628.k(obj);
                ads_mobile_sdk.iy0 iy0VarB = ((ads_mobile_sdk.tx0) this.a).b();
                iy0VarB.p.setValue(iy0VarB, ads_mobile_sdk.iy0.w[4], y2Var);
                break;
        }
        return o9245300239821758723;
    }
}
