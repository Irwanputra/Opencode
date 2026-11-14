package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A18107078866102800328 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public /* synthetic */ java.lang.Object t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A18107078866102800328(long j, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = j;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        dev.epro.r0.A18107078866102800328 a18107078866102800328 = new dev.epro.r0.A18107078866102800328(this.u, r4833348786910499294);
        a18107078866102800328.t = obj;
        return a18107078866102800328;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dev.epro.r0.A18107078866102800328 a18107078866102800328Create = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.G3869673327990687150) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        a18107078866102800328Create.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        dev.epro.r0.V5142773592757085764 v5142773592757085764 = ((dev.epro.r0.G3869673327990687150) this.t).a;
        v5142773592757085764.d(v5142773592757085764.k, this.u, 1);
        return dev.epro.r0.O9245300239821758723.a;
    }
}
