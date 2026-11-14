package dev.epro.r0;

/* loaded from: classes3.dex */
public final class P1791821864769442584 extends K14749510448791472029 {
    public Z10733167746954993267 t;
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ Z10733167746954993267 w;
    public Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1791821864769442584(Z10733167746954993267 z10733167746954993267, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.w = z10733167746954993267;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.emit(null, this);
    }
}
