package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class st2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public dev.epro.r0.H15186625828076266306 a;
    public ads_mobile_sdk.lu2 b;
    public boolean c;
    public final /* synthetic */ ads_mobile_sdk.lu2 d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st2(ads_mobile_sdk.lu2 lu2Var, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.d = lu2Var;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.lu2 lu2Var = this.d;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.st2(lu2Var, (dev.epro.r0.R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new ads_mobile_sdk.st2(lu2Var, (dev.epro.r0.R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.H15186625828076266306 h15186625828076266306;
        dev.epro.r0.H15186625828076266306 h151866258280762663062;
        byte b = this.t;
        ads_mobile_sdk.lu2 lu2Var = this.d;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.H15186625828076266306 h151866258280762663063 = lu2Var.e;
                    this.a = h151866258280762663063;
                    this.b = lu2Var;
                    this.c = true;
                    if (h151866258280762663063.c(this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    h15186625828076266306 = h151866258280762663063;
                } else {
                    if (!z) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lu2Var = this.b;
                    h15186625828076266306 = this.a;
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                try {
                    return new dev.epro.r0.E17093345031926825464(lu2Var.m);
                } finally {
                }
            default:
                boolean z2 = this.c;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.H15186625828076266306 h151866258280762663064 = lu2Var.e;
                    this.a = h151866258280762663064;
                    this.b = lu2Var;
                    this.c = true;
                    if (h151866258280762663064.c(this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                    h151866258280762663062 = h151866258280762663064;
                } else {
                    if (!z2) {
                        dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lu2Var = this.b;
                    h151866258280762663062 = this.a;
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                try {
                    return new dev.epro.r0.E17093345031926825464(lu2Var.n);
                } finally {
                }
        }
    }
}
