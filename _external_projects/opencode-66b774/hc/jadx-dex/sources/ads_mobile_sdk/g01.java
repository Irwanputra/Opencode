package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g01 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.j01 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.util.Map e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01(ads_mobile_sdk.j01 j01Var, java.lang.String str, java.lang.String str2, java.util.Map map, boolean z, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = j01Var;
        this.c = str;
        this.d = str2;
        this.e = map;
        this.f = z;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.g01(this.b, this.c, this.d, this.e, this.f, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        boolean z = this.a;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            ads_mobile_sdk.j01 j01Var = this.b;
            java.lang.String str = this.c;
            java.lang.String str2 = this.d;
            java.util.Map map = this.e;
            boolean z2 = this.f;
            this.a = true;
            dev.epro.r0.H7219028874700587498 h7219028874700587498 = new dev.epro.r0.H7219028874700587498(1, dev.epro.r0.E18444280280170001567.H(this));
            h7219028874700587498.t();
            ads_mobile_sdk.f01 f01Var = new ads_mobile_sdk.f01(new java.util.concurrent.atomic.AtomicBoolean(false), h7219028874700587498);
            synchronized (((dev.epro.r0.K8888766238980911980) j01Var.c.getValue())) {
                ((dev.epro.r0.K8888766238980911980) j01Var.c.getValue()).b(str, str2, f01Var, map, z2);
            }
            if (h7219028874700587498.r() == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dev.epro.r0.E17665849472693074628.k(obj);
        }
        return dev.epro.r0.O9245300239821758723.a;
    }
}
