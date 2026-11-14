package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8740992020078509815 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.L7100317404093621994 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A8740992020078509815(dev.epro.r0.L7100317404093621994 l7100317404093621994, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = l7100317404093621994;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.L7100317404093621994 l7100317404093621994 = this.v;
        switch (b) {
            case 0:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 0);
            case 1:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 1);
            case 2:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 2);
            case 3:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 3);
            case 4:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 4);
            case 5:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 5);
            case 6:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 6);
            default:
                return new dev.epro.r0.A8740992020078509815(l7100317404093621994, r4833348786910499294, (byte) 7);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) obj;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj2;
        switch (b) {
        }
        return create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.L7100317404093621994 l7100317404093621994 = this.v;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.e(this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.c(this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.f(this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.c(this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.u;
                if (!z5) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.b(this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 5:
                boolean z6 = this.u;
                if (!z6) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.f(this) == z3437138737604933638) {
                    }
                } else if (!z6) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 6:
                boolean z7 = this.u;
                if (!z7) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.b(this) == z3437138737604933638) {
                    }
                } else if (!z7) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z8 = this.u;
                if (!z8) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l7100317404093621994.e(this) == z3437138737604933638) {
                    }
                } else if (!z8) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
