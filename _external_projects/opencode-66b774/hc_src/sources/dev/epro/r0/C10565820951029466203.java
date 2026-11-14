package dev.epro.r0;

/* loaded from: classes.dex */
public final class C10565820951029466203 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ Z10733167746954993267 v;
    public Object w;
    public S7864201625552763331 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10565820951029466203(Z10733167746954993267 z10733167746954993267, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = z10733167746954993267;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
