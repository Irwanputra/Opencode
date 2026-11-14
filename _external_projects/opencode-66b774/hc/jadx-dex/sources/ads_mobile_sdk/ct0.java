package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ct0 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.et0 b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct0(ads_mobile_sdk.et0 et0Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.b = et0Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        ads_mobile_sdk.et0 et0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 0);
            case 1:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 1);
            case 2:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 2);
            case 3:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 3);
            case 4:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 4);
            default:
                return new ads_mobile_sdk.ct0(et0Var, r4833348786910499294, (byte) 5);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.et0 et0Var = this.b;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            case 4:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 4).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.ct0(et0Var, (dev.epro.r0.R4833348786910499294) obj2, (byte) 5).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.et0 et0Var = this.b;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (et0Var.c(this) == z3437138737604933638) {
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
                    ads_mobile_sdk.tx0 tx0VarJ = et0Var.j();
                    this.a = true;
                    if (et0Var.b(tx0VarJ, this) == z3437138737604933638) {
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
                    if (et0Var.b(this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.a;
                if (!z4) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    ads_mobile_sdk.tx0 tx0VarJ2 = et0Var.j();
                    dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
                    this.a = true;
                    if (tx0VarJ2.a(i16631908410500040363, "onbackblocked", this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.a;
                if (!z5) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.T913357428039952817 t913357428039952817 = new dev.epro.r0.T913357428039952817(1, "Internal error attempting to show fullscreen content.");
                    this.a = true;
                    if (et0Var.a(t913357428039952817, (dev.epro.r0.R4833348786910499294) this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z6 = this.a;
                if (!z6) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.T913357428039952817 t9133574280399528172 = new dev.epro.r0.T913357428039952817(1, "Internal error attempting to show fullscreen content.");
                    this.a = true;
                    if (et0Var.a(t9133574280399528172, (dev.epro.r0.R4833348786910499294) this) == z3437138737604933638) {
                    }
                } else if (!z6) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
