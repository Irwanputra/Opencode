package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M1571316991398644467 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ L12639328004344855510 w;
    public final /* synthetic */ W1972671267364756056 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M1571316991398644467(L12639328004344855510 l12639328004344855510, W1972671267364756056 w1972671267364756056, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = l12639328004344855510;
        this.x = w1972671267364756056;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                M1571316991398644467 m1571316991398644467 = new M1571316991398644467(this.w, this.x, r4833348786910499294, (byte) 0);
                m1571316991398644467.v = obj;
                return m1571316991398644467;
            case 1:
                M1571316991398644467 m15713169913986444672 = new M1571316991398644467(this.w, this.x, r4833348786910499294, (byte) 1);
                m15713169913986444672.v = obj;
                return m15713169913986444672;
            case 2:
                M1571316991398644467 m15713169913986444673 = new M1571316991398644467(this.w, this.x, r4833348786910499294, (byte) 2);
                m15713169913986444673.v = obj;
                return m15713169913986444673;
            default:
                M1571316991398644467 m15713169913986444674 = new M1571316991398644467(this.w, this.x, r4833348786910499294, (byte) 3);
                m15713169913986444674.v = obj;
                return m15713169913986444674;
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
        return ((M1571316991398644467) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W1972671267364756056 w1972671267364756056 = this.x;
        L12639328004344855510 l12639328004344855510 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    N14028163092316284073 n14028163092316284073 = new N14028163092316284073(w1972671267364756056, ((W5797197595347441198) this.v).h());
                    this.u = true;
                    if (l12639328004344855510.invoke(n14028163092316284073, this) == z3437138737604933638) {
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
                    N14028163092316284073 n140281630923162840732 = new N14028163092316284073(w1972671267364756056, ((W5797197595347441198) this.v).h());
                    this.u = true;
                    if (l12639328004344855510.invoke(n140281630923162840732, this) == z3437138737604933638) {
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
                    N14028163092316284073 n140281630923162840733 = new N14028163092316284073(w1972671267364756056, ((W5797197595347441198) this.v).h());
                    this.u = true;
                    if (l12639328004344855510.invoke(n140281630923162840733, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    N14028163092316284073 n140281630923162840734 = new N14028163092316284073(w1972671267364756056, ((W5797197595347441198) this.v).h());
                    this.u = true;
                    if (l12639328004344855510.invoke(n140281630923162840734, this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
