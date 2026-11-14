package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qo2 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.J12078565427869724451 {
    public boolean a;
    public /* synthetic */ java.lang.Throwable b;
    public final /* synthetic */ ads_mobile_sdk.wo2 c;
    public final /* synthetic */ dev.epro.r0.G8001132634698687269 d;
    public final /* synthetic */ dev.epro.r0.V16504496955554646429 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo2(ads_mobile_sdk.wo2 wo2Var, dev.epro.r0.G8001132634698687269 g8001132634698687269, dev.epro.r0.V16504496955554646429 v16504496955554646429, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.c = wo2Var;
        this.d = g8001132634698687269;
        this.e = v16504496955554646429;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dev.epro.r0.G8001132634698687269 g8001132634698687269 = this.d;
        dev.epro.r0.V16504496955554646429 v16504496955554646429 = this.e;
        ads_mobile_sdk.qo2 qo2Var = new ads_mobile_sdk.qo2(this.c, g8001132634698687269, v16504496955554646429, (dev.epro.r0.R4833348786910499294) obj3);
        qo2Var.b = (java.lang.Throwable) obj2;
        return qo2Var.invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.a;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            ads_mobile_sdk.qu0 qu0Var = new ads_mobile_sdk.qu0(this.b, 0, null, 6);
            this.c.getClass();
            ads_mobile_sdk.oo2 oo2Var = new ads_mobile_sdk.oo2(new dev.epro.r0.D16573472668995260995(dev.epro.r0.X2485016533998461232._a(qu0Var.d), dev.epro.r0.Q3791352212346016950.d(qu0Var), null), this.e, null, (byte) 1);
            this.a = true;
            java.lang.Object objD0 = dev.epro.r0.R7033599853981556291.d0(this.d, oo2Var, this);
            dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
            if (objD0 == z3437138737604933638) {
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
