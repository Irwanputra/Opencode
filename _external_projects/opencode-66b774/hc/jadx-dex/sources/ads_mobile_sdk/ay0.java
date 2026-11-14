package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ay0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.iy0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay0(ads_mobile_sdk.iy0 iy0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = iy0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ay0(iy0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.ay0(iy0Var, r4833348786910499294, (byte) 1);
            default:
                return new ads_mobile_sdk.ay0(iy0Var, r4833348786910499294, (byte) 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.iy0 iy0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ay0(iy0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.ay0(iy0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.ay0(iy0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.iy0 iy0Var = this.b;
        dev.epro.r0.O9245300239821758723 o92453002398217587232 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var = iy0Var.b;
                    this.a = true;
                    if (tx0Var.a((dev.epro.r0.R4833348786910499294) this) == o92453002398217587232) {
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
                    ads_mobile_sdk.tx0 tx0Var2 = iy0Var.b;
                    this.a = true;
                    java.lang.Object objD0 = dev.epro.r0.R7033599853981556291.d0(tx0Var2.a, new ads_mobile_sdk.ex0(tx0Var2, null, (byte) 1), this);
                    if (objD0 != o92453002398217587232) {
                        objD0 = o9245300239821758723;
                    }
                    if (objD0 == o92453002398217587232) {
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
                    ads_mobile_sdk.et0 et0Var = iy0Var.b.f113o;
                    if (et0Var != null) {
                        this.a = true;
                        if (et0Var.a((dev.epro.r0.K14749510448791472029) this) == o92453002398217587232) {
                        }
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return o92453002398217587232;
    }
}
