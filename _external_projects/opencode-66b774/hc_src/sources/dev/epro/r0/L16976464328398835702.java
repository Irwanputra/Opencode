package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L16976464328398835702 extends R14062301455140331524 implements J12078565427869724451 {
    public boolean t;
    public /* synthetic */ H16689892403409870979 u;
    public /* synthetic */ long v;
    public final /* synthetic */ W5797197595347441198 w;
    public final /* synthetic */ W1972671267364756056 x;
    public final /* synthetic */ S9385204271696540760 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L16976464328398835702(W5797197595347441198 w5797197595347441198, W1972671267364756056 w1972671267364756056, S9385204271696540760 s9385204271696540760, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.w = w5797197595347441198;
        this.x = w1972671267364756056;
        this.y = s9385204271696540760;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((L2216691091636065972) obj2).a;
        W1972671267364756056 w1972671267364756056 = this.x;
        S9385204271696540760 s9385204271696540760 = this.y;
        L16976464328398835702 l16976464328398835702 = new L16976464328398835702(this.w, w1972671267364756056, s9385204271696540760, (R4833348786910499294) obj3);
        l16976464328398835702.u = (H16689892403409870979) obj;
        l16976464328398835702.v = j;
        return l16976464328398835702.invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        W5797197595347441198 w5797197595347441198 = this.w;
        if (!z) {
            E17665849472693074628.k(obj);
            H16689892403409870979 h16689892403409870979 = this.u;
            R7033599853981556291.E(w5797197595347441198, null, null, new F3485194578516100457(this.x, this.v, this.y, (R4833348786910499294) null, (byte) 5), 3);
            this.t = true;
            obj = h16689892403409870979.f(this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (obj == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        R7033599853981556291.E(w5797197595347441198, null, null, new X4065924752070527080(this.x, ((Boolean) obj).booleanValue(), this.y, null), 3);
        return O9245300239821758723.a;
    }
}
