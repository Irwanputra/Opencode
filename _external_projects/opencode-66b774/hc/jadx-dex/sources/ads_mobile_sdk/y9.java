package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class y9 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ ads_mobile_sdk.qo3 e;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(java.lang.String str, java.lang.Object obj, dev.epro.r0.R4833348786910499294 r4833348786910499294, ads_mobile_sdk.qo3 qo3Var, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.c = str;
        this.d = obj;
        this.e = qo3Var;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new ads_mobile_sdk.y9(this.c, this.d, r4833348786910499294, this.e, (byte) 0);
            default:
                return new ads_mobile_sdk.y9(this.c, this.d, r4833348786910499294, this.e, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        switch (b) {
            case 0:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
            default:
                return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        ads_mobile_sdk.qo3 qo3Var = this.e;
        java.lang.Object obj2 = this.d;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.a;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.a = true;
                    if (((dev.epro.r0.G16562784700295586616) obj2).a(qo3Var, this) == z3437138737604933638) {
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
                    this.a = true;
                    if (((dev.epro.r0.G10308367458345557237) obj2).b(qo3Var, this) == z3437138737604933638) {
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
