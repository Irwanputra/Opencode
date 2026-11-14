package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P421968919732646895 extends R14062301455140331524 implements J12078565427869724451 {
    public /* synthetic */ float t;
    public final /* synthetic */ F4096073349764486348 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P421968919732646895(F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.u = f4096073349764486348;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        P421968919732646895 p421968919732646895 = new P421968919732646895(this.u, (R4833348786910499294) obj3);
        p421968919732646895.t = fFloatValue;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        p421968919732646895.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        this.u.invoke(new Float(this.t));
        return O9245300239821758723.a;
    }
}
