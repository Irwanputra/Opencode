package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class fv1 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(long j, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.a = j;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new ads_mobile_sdk.fv1(this.a, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new ads_mobile_sdk.fv1(this.a, (dev.epro.r0.R4833348786910499294) obj2).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        dev.epro.r0.T16895755319777707412 t16895755319777707412R = ads_mobile_sdk.zu1.r();
        t16895755319777707412R.getClass();
        t16895755319777707412R.b();
        ((ads_mobile_sdk.zu1) t16895755319777707412R.b).appVersionCode_ = this.a;
        return (ads_mobile_sdk.zu1) t16895755319777707412R.a();
    }
}
