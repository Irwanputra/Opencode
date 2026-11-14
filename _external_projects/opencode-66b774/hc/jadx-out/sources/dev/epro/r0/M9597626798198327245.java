package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M9597626798198327245 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ N17102349568798422850 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M9597626798198327245(N17102349568798422850 n17102349568798422850, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = n17102349568798422850;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        N17102349568798422850 n17102349568798422850 = this.v;
        switch (b) {
            case 0:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 0);
            case 1:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 1);
            case 2:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 2);
            case 3:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 3);
            case 4:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 4);
            default:
                return new M9597626798198327245(n17102349568798422850, r4833348786910499294, (byte) 5);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
            case 0:
                return ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
            case 3:
                return ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
            case 4:
                return ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
            default:
                ((M9597626798198327245) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
                return Z3437138737604933638.a;
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        N17102349568798422850 n17102349568798422850 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    D2717688760023469083 d2717688760023469083 = n17102349568798422850.s;
                    this.u = true;
                    d2717688760023469083.c(true, this);
                    if (o9245300239821758723 == z3437138737604933638) {
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
                    D2717688760023469083 d27176887600234690832 = n17102349568798422850.s;
                    this.u = true;
                    d27176887600234690832.d(this);
                    if (o9245300239821758723 == z3437138737604933638) {
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
                    D2717688760023469083 d27176887600234690833 = n17102349568798422850.s;
                    this.u = true;
                    if (d27176887600234690833.s(false, this) == z3437138737604933638) {
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
                    this.u = true;
                    Object objCollect = new G6219617120344415229(new B14841931160204392628(J10256772239794345968.p(new X11739465584883262539(n17102349568798422850, (byte) 7)), (byte) 0), (byte) 4).collect(new S8632326146848653013(n17102349568798422850, (byte) 6), this);
                    if (objCollect != z3437138737604933638) {
                        objCollect = o9245300239821758723;
                    }
                    if (objCollect == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    D2717688760023469083 d27176887600234690834 = n17102349568798422850.s;
                    this.u = true;
                    if (d27176887600234690834.y(this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    G5547415528770645763 g5547415528770645763 = new G5547415528770645763((Object) n17102349568798422850, r4833348786910499294, (byte) 12);
                    this.u = true;
                    X1704867333829930057.a(n17102349568798422850, g5547415528770645763, this);
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                    Z3383101362411723454.n();
                }
                break;
        }
        return z3437138737604933638;
    }
}
