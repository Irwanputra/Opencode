package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y1830879653856637248 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ S11418606654027965372 w;
    public final /* synthetic */ S7864201625552763331 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1830879653856637248(S11418606654027965372 s11418606654027965372, S7864201625552763331 s7864201625552763331, Object obj, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = s11418606654027965372;
        this.x = s7864201625552763331;
        this.v = obj;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        S7864201625552763331 s7864201625552763331 = this.x;
        S11418606654027965372 s11418606654027965372 = this.w;
        switch (b) {
            case 0:
                return new Y1830879653856637248(s11418606654027965372, s7864201625552763331, this.v, r4833348786910499294);
            default:
                Y1830879653856637248 y1830879653856637248 = new Y1830879653856637248(s11418606654027965372, s7864201625552763331, r4833348786910499294);
                y1830879653856637248.v = obj;
                return y1830879653856637248;
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
        return ((Y1830879653856637248) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    J12078565427869724451 j12078565427869724451 = this.w.e;
                    Object obj2 = this.v;
                    this.u = true;
                    if (j12078565427869724451.invoke(this.x, obj2, this) == z3437138737604933638) {
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
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.v;
                    A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
                    S11418606654027965372 s11418606654027965372 = this.w;
                    J12043550928838212009 j12043550928838212009 = s11418606654027965372.d;
                    X4402509989587129033 x4402509989587129033 = new X4402509989587129033(a7209497065939201693, w5797197595347441198, s11418606654027965372, this.x, (byte) 0);
                    this.u = true;
                    if (j12043550928838212009.collect(x4402509989587129033, this) == z3437138737604933638) {
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
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1830879653856637248(S11418606654027965372 s11418606654027965372, S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = s11418606654027965372;
        this.x = s7864201625552763331;
    }
}
