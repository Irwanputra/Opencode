package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wm extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.dr0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm(ads_mobile_sdk.dr0 dr0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = dr0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.dr0 dr0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.wm(dr0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.wm(dr0Var, r4833348786910499294, (byte) 1);
            default:
                return new ads_mobile_sdk.wm(dr0Var, r4833348786910499294, (byte) 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.dr0 dr0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.wm(dr0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.wm(dr0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.wm(dr0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.dr0 dr0Var = this.b;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.qq0 qq0Var = dr0Var.c;
                    this.a = true;
                    if (((dev.epro.r0.A5401921815192175371) qq0Var.a.get()).a(new dev.epro.r0.R15192661853924864744(2, (dev.epro.r0.R4833348786910499294) null, (byte) 2), this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (dr0Var.a((ads_mobile_sdk.a70) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z3 = this.a;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (dr0Var.a((ads_mobile_sdk.a70) null, (dev.epro.r0.K14749510448791472029) this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
