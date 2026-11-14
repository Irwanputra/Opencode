package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V7931860346224571473 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean t;
    public /* synthetic */ F18142507606280211225 u;
    public final /* synthetic */ O12152244488187446230 v;
    public final /* synthetic */ L18111935460025096722 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7931860346224571473(O12152244488187446230 o12152244488187446230, L18111935460025096722 l18111935460025096722, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.v = o12152244488187446230;
        this.w = l18111935460025096722;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        V7931860346224571473 v7931860346224571473 = new V7931860346224571473(this.v, this.w, (R4833348786910499294) obj3);
        v7931860346224571473.u = (F18142507606280211225) obj;
        return v7931860346224571473.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            J7403353095371830496 j7403353095371830496 = new J7403353095371830496(this.w, this.u, (byte) 3);
            this.t = true;
            Object objInvoke = this.v.invoke(j7403353095371830496, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objInvoke == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        return O9245300239821758723.a;
    }
}
