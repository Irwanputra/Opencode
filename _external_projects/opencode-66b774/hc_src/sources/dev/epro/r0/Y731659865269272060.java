package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y731659865269272060 extends R14062301455140331524 implements L12639328004344855510 {
    public /* synthetic */ int t;

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        Y731659865269272060 y731659865269272060 = new Y731659865269272060(2, r4833348786910499294);
        y731659865269272060.t = ((Number) obj).intValue();
        return y731659865269272060;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((Y731659865269272060) create((R4833348786910499294) obj2, Integer.valueOf(((Number) obj).intValue()))).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        return Boolean.valueOf(this.t > 0);
    }
}
