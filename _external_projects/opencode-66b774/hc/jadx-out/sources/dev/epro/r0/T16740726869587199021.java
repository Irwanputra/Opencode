package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class T16740726869587199021 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ D2717688760023469083 v;
    public final /* synthetic */ S14157914735975478504 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T16740726869587199021(S14157914735975478504 s14157914735975478504, D2717688760023469083 d2717688760023469083, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 3;
        this.w = s14157914735975478504;
        this.v = d2717688760023469083;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        S14157914735975478504 s14157914735975478504 = this.w;
        D2717688760023469083 d2717688760023469083 = this.v;
        switch (b) {
            case 0:
                return new T16740726869587199021(d2717688760023469083, s14157914735975478504, r4833348786910499294, (byte) 0);
            case 1:
                return new T16740726869587199021(d2717688760023469083, s14157914735975478504, r4833348786910499294, (byte) 1);
            case 2:
                return new T16740726869587199021(d2717688760023469083, s14157914735975478504, r4833348786910499294, (byte) 2);
            case 3:
                return new T16740726869587199021(s14157914735975478504, d2717688760023469083, r4833348786910499294);
            default:
                return new T16740726869587199021(d2717688760023469083, s14157914735975478504, r4833348786910499294, (byte) 4);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((T16740726869587199021) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        S14157914735975478504 s14157914735975478504 = this.w;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D2717688760023469083 d2717688760023469083 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (d2717688760023469083.i(s14157914735975478504, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (d2717688760023469083.i(s14157914735975478504, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (d2717688760023469083.e(s14157914735975478504, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    J5135661035767234880 j5135661035767234880 = new J5135661035767234880(d2717688760023469083, (byte) 1);
                    this.u = true;
                    if (U2645994142831146282.e(this.w, null, null, j5135661035767234880, this, 7) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (d2717688760023469083.i(s14157914735975478504, this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T16740726869587199021(D2717688760023469083 d2717688760023469083, S14157914735975478504 s14157914735975478504, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = d2717688760023469083;
        this.w = s14157914735975478504;
    }
}
