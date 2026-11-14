package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class aq1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.tx0 b;
    public final /* synthetic */ dev.epro.r0.I16631908410500040363 c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq1(ads_mobile_sdk.tx0 tx0Var, dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = tx0Var;
        this.c = i16631908410500040363;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.c;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, r4833348786910499294, (byte) 2);
            default:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, r4833348786910499294, (byte) 3);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.c;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.aq1(tx0Var, i16631908410500040363, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.c;
        ads_mobile_sdk.tx0 tx0Var = this.b;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (tx0Var.a(i16631908410500040363, "onScreenInfoChanged", this) == z3437138737604933638) {
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
                    if (tx0Var.a(i16631908410500040363, "onAdVisibilityChanged", this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.a;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (tx0Var.a(i16631908410500040363, "onshow", this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z4 = this.a;
                if (!z4) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (tx0Var.b(i16631908410500040363, "google.afma.nativeAds.renderVideo", this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
