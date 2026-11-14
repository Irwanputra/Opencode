package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O17327376626839343554 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Q13503443104809512531 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O17327376626839343554(Q13503443104809512531 q13503443104809512531, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = q13503443104809512531;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Q13503443104809512531 q13503443104809512531 = this.v;
        switch (b) {
            case 0:
                return new O17327376626839343554(q13503443104809512531, r4833348786910499294, (byte) 0);
            default:
                return new O17327376626839343554(q13503443104809512531, r4833348786910499294, (byte) 1);
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
        return ((O17327376626839343554) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Q13503443104809512531 q13503443104809512531 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (q13503443104809512531.h1(this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (q13503443104809512531.i1(this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
