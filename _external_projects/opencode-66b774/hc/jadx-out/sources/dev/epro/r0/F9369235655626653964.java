package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F9369235655626653964 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ A16333291076997953260 v;
    public final /* synthetic */ N7102107663372104177 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F9369235655626653964(A16333291076997953260 a16333291076997953260, N7102107663372104177 n7102107663372104177, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = a16333291076997953260;
        this.w = n7102107663372104177;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        N7102107663372104177 n7102107663372104177 = this.w;
        A16333291076997953260 a16333291076997953260 = this.v;
        switch (b) {
            case 0:
                return new F9369235655626653964(a16333291076997953260, n7102107663372104177, r4833348786910499294, (byte) 0);
            default:
                return new F9369235655626653964(a16333291076997953260, n7102107663372104177, r4833348786910499294, (byte) 1);
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
        return ((F9369235655626653964) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        N7102107663372104177 n7102107663372104177 = this.w;
        A16333291076997953260 a16333291076997953260 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = a16333291076997953260.Z;
                    Float f = new Float(K378131842873880746.a.c(n7102107663372104177.c));
                    this.u = true;
                    if (u16834965109098959004.f(this, f) == z3437138737604933638) {
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
                    U16834965109098959004 u168349651090989590042 = a16333291076997953260.Z;
                    Float f2 = new Float(K378131842873880746.a.c(n7102107663372104177.c));
                    this.u = true;
                    if (u168349651090989590042.f(this, f2) == z3437138737604933638) {
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
