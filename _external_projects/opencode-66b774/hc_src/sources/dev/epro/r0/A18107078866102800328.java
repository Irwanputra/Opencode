package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A18107078866102800328 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A18107078866102800328(long j, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        A18107078866102800328 a18107078866102800328 = new A18107078866102800328(this.u, r4833348786910499294);
        a18107078866102800328.t = obj;
        return a18107078866102800328;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        A18107078866102800328 a18107078866102800328 = (A18107078866102800328) create((R4833348786910499294) obj2, (G3869673327990687150) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        a18107078866102800328.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        V5142773592757085764 v5142773592757085764 = ((G3869673327990687150) this.t).a;
        v5142773592757085764.d(v5142773592757085764.k, this.u, 1);
        return O9245300239821758723.a;
    }
}
