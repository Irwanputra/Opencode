package dev.epro.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class O10369511636065966101 extends K14749510448791472029 {
    public W7810234419356846461 t;
    public /* synthetic */ Object u;
    public int v;
    public final /* synthetic */ W7810234419356846461 w;
    public Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O10369511636065966101(W7810234419356846461 w7810234419356846461, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.w = w7810234419356846461;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.v |= Integer.MIN_VALUE;
        return this.w.emit(null, this);
    }
}
