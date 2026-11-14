package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S15344532811487669861 extends R14062301455140331524 implements J12078565427869724451 {
    public /* synthetic */ long t;
    public final /* synthetic */ E18104834745338047524 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S15344532811487669861(E18104834745338047524 e18104834745338047524, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.u = e18104834745338047524;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((L2216691091636065972) obj2).a;
        S15344532811487669861 s15344532811487669861 = new S15344532811487669861(this.u, (R4833348786910499294) obj3);
        s15344532811487669861.t = j;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        s15344532811487669861.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        long j = this.t;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        E18104834745338047524 e18104834745338047524 = this.u;
        e18104834745338047524.u = intBitsToFloat;
        e18104834745338047524.v = Float.intBitsToFloat((int) (j & 4294967295L));
        return O9245300239821758723.a;
    }
}
