package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S11833130751855926073 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ Object t;
    public final /* synthetic */ A81664135048468380 u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S11833130751855926073(A81664135048468380 a81664135048468380, float f, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = a81664135048468380;
        this.v = f;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        S11833130751855926073 s11833130751855926073 = new S11833130751855926073(this.u, this.v, r4833348786910499294);
        s11833130751855926073.t = obj;
        return s11833130751855926073;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        S11833130751855926073 s11833130751855926073 = (S11833130751855926073) create((R4833348786910499294) obj2, (A7868207189447841291) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        s11833130751855926073.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        this.u.a = ((A7868207189447841291) this.t).a(this.v);
        return O9245300239821758723.a;
    }
}
