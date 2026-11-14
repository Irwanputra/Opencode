package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A8740992020078509815 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ L7100317404093621994 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A8740992020078509815(L7100317404093621994 l7100317404093621994, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = l7100317404093621994;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        L7100317404093621994 l7100317404093621994 = this.v;
        switch (b) {
            case 0:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 0);
            case 1:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 1);
            case 2:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 2);
            case 3:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 3);
            case 4:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 4);
            case 5:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 5);
            case 6:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 6);
            default:
                return new A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 7);
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
        return ((A8740992020078509815) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L7100317404093621994 l7100317404093621994 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.e(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.c(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.f(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.c(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 4:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.b(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 5:
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.f(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            case 6:
                boolean z7 = this.u;
                if (!z7) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.b(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z7) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                boolean z8 = this.u;
                if (!z8) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.e(this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z8) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }
}
