package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class lp2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.dq2 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp2(ads_mobile_sdk.dq2 dq2Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = dq2Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.lp2(dq2Var, r4833348786910499294, (byte) 0);
            default:
                return new ads_mobile_sdk.lp2(dq2Var, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.dq2 dq2Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.lp2(dq2Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.lp2(dq2Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.dq2 dq2Var = this.b;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.lu2 lu2Var = dq2Var.r;
                    this.a = true;
                    if (lu2Var.c(this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                ((ads_mobile_sdk.od1) dq2Var.u.a("The backing field has not yet been initialized.")).destroy();
                return o9245300239821758723;
            default:
                boolean z2 = this.a;
                if (z2) {
                    if (z2) {
                        dev.epro.r0.E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.G8001132634698687269 g8001132634698687269 = dq2Var.f27o;
                ads_mobile_sdk.np2 np2Var = new ads_mobile_sdk.np2(dq2Var, r4833348786910499294, (byte) 0);
                this.a = true;
                return dev.epro.r0.R7033599853981556291.d0(g8001132634698687269, np2Var, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
        }
    }
}
