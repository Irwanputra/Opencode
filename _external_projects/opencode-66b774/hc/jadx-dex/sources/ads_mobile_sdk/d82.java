package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class d82 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.J12078565427869724451 {
    public boolean a;
    public /* synthetic */ ads_mobile_sdk.tx0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d82(int i, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(i, r4833348786910499294);
        this.t = b;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        int i = 3;
        switch (b) {
            case 0:
                ads_mobile_sdk.d82 d82Var = new ads_mobile_sdk.d82(i, (dev.epro.r0.R4833348786910499294) obj3, (byte) 0);
                d82Var.b = (ads_mobile_sdk.tx0) obj;
                return d82Var.invokeSuspend(o9245300239821758723);
            default:
                ads_mobile_sdk.d82 d82Var2 = new ads_mobile_sdk.d82(i, (dev.epro.r0.R4833348786910499294) obj3, (byte) 1);
                d82Var2.b = (ads_mobile_sdk.tx0) obj;
                return d82Var2.invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var = this.b;
                    dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
                    this.a = true;
                    if (tx0Var.a(i16631908410500040363, "onSdkAdUserInteractionClick", this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.a;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0Var2 = this.b;
                    dev.epro.r0.I16631908410500040363 i166319084105000403632 = new dev.epro.r0.I16631908410500040363();
                    this.a = true;
                    if (tx0Var2.a(i166319084105000403632, "onSdkImpression", this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
