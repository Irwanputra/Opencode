package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class vq1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ ads_mobile_sdk.zq1 b;
    public final /* synthetic */ ads_mobile_sdk.tx0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(ads_mobile_sdk.zq1 zq1Var, ads_mobile_sdk.tx0 tx0Var, boolean z, boolean z2, boolean z3, boolean z4, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = zq1Var;
        this.c = tx0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.vq1(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.W5797197595347441198) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        if (z) {
            if (z) {
                dev.epro.r0.E17665849472693074628.k(obj);
                return o9245300239821758723;
            }
            dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dev.epro.r0.E17665849472693074628.k(obj);
        ads_mobile_sdk.bq1 bq1Var = this.b.c;
        this.a = true;
        bq1Var.getClass();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = new dev.epro.r0.I16631908410500040363();
        i16631908410500040363.r("sms", java.lang.Boolean.valueOf(this.d));
        i16631908410500040363.r("tel", java.lang.Boolean.valueOf(this.e));
        i16631908410500040363.r("calendar", java.lang.Boolean.valueOf(this.f));
        i16631908410500040363.r("storePicture", java.lang.Boolean.valueOf(this.g));
        i16631908410500040363.r("inlineVideo", java.lang.Boolean.TRUE);
        java.lang.Object objA = this.c.a(i16631908410500040363, "onDeviceFeaturesReceived", this);
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        if (objA != z3437138737604933638) {
            objA = o9245300239821758723;
        }
        return objA == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
    }
}
