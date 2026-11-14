package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q6916963574401962805 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean t;
    public /* synthetic */ H16689892403409870979 u;
    public /* synthetic */ long v;
    public final /* synthetic */ S9385204271696540760 w;
    public final /* synthetic */ D2717688760023469083 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6916963574401962805(S9385204271696540760 s9385204271696540760, D2717688760023469083 d2717688760023469083, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.w = s9385204271696540760;
        this.x = d2717688760023469083;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((L2216691091636065972) obj2).a;
        Q6916963574401962805 q6916963574401962805 = new Q6916963574401962805(this.w, this.x, (R4833348786910499294) obj3);
        q6916963574401962805.u = (H16689892403409870979) obj;
        q6916963574401962805.v = j;
        return q6916963574401962805.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            H16689892403409870979 h16689892403409870979 = this.u;
            long j = this.v;
            S9385204271696540760 s9385204271696540760 = this.w;
            if (s9385204271696540760 != null) {
                K17935692801815850892 k17935692801815850892 = new K17935692801815850892(h16689892403409870979, this.x, j, s9385204271696540760, null);
                this.t = true;
                Object objB = O8620973563946607355.B(k17935692801815850892, this);
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                if (objB == z3437138737604933638) {
                    return z3437138737604933638;
                }
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
