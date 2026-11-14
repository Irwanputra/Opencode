package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A3672266205716302703 extends R14062301455140331524 implements G13792465322404021864 {
    public boolean t;
    public /* synthetic */ long u;

    @Override // dev.epro.r0.G13792465322404021864
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        A3672266205716302703 a3672266205716302703 = new A3672266205716302703(4, (R4833348786910499294) obj4);
        a3672266205716302703.u = longValue;
        return a3672266205716302703.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            long j = this.u;
            B14824868959299866349 n = B14824868959299866349.n();
            int i = H15104563917493595201.a;
            n.getClass();
            long min = Math.min(j * 30000, H15104563917493595201.a);
            this.t = true;
            Object I = J8045362843799184672.I(min, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (I == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        return Boolean.TRUE;
    }
}
