package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class t20 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ads_mobile_sdk.w20 c;
    public final /* synthetic */ ads_mobile_sdk.y11 d;
    public final /* synthetic */ org.chromium.net.CronetEngine e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(long j, ads_mobile_sdk.w20 w20Var, ads_mobile_sdk.y11 y11Var, org.chromium.net.CronetEngine cronetEngine, boolean z, boolean z2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = j;
        this.c = w20Var;
        this.d = y11Var;
        this.e = cronetEngine;
        this.f = z;
        this.g = z2;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.t20(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                dev.epro.r0.E17665849472693074628.k(obj);
                return obj;
            }
            dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dev.epro.r0.E17665849472693074628.k(obj);
        dev.epro.r0.B16233345865283492429 b16233345865283492429 = new dev.epro.r0.B16233345865283492429(this.c, this.d, this.e, this.f, this.g, (dev.epro.r0.R4833348786910499294) null);
        this.a = true;
        java.lang.Object objQ = dev.epro.r0.V16504496955554646429.q(this.b, b16233345865283492429, this);
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        return objQ == z3437138737604933638 ? z3437138737604933638 : objQ;
    }
}
