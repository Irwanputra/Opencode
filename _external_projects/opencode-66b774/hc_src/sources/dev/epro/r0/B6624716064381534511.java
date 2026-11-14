package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B6624716064381534511 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ S9385204271696540760 v;
    public final /* synthetic */ L11334185135933894276 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B6624716064381534511(L11334185135933894276 l11334185135933894276, S9385204271696540760 s9385204271696540760, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.w = l11334185135933894276;
        this.v = s9385204271696540760;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        L11334185135933894276 l11334185135933894276 = this.w;
        S9385204271696540760 s9385204271696540760 = this.v;
        switch (b) {
            case 0:
                return new B6624716064381534511(l11334185135933894276, s9385204271696540760, r4833348786910499294);
            case 1:
                return new B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 1);
            default:
                return new B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 2);
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
        return ((B6624716064381534511) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L11334185135933894276 l11334185135933894276 = this.w;
        S9385204271696540760 s9385204271696540760 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    A9134307198683833790 a9134307198683833790 = new A9134307198683833790(l11334185135933894276);
                    this.u = true;
                    if (s9385204271696540760.b(a9134307198683833790, this) == z3437138737604933638) {
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
                    if (s9385204271696540760.b(l11334185135933894276, this) == z3437138737604933638) {
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
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (s9385204271696540760.b(l11334185135933894276, this) == z3437138737604933638) {
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
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B6624716064381534511(S9385204271696540760 s9385204271696540760, L11334185135933894276 l11334185135933894276, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = s9385204271696540760;
        this.w = l11334185135933894276;
    }
}
