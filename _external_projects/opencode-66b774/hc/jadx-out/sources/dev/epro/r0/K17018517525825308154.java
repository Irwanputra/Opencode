package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17018517525825308154 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ E17523205116624666034 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K17018517525825308154(E17523205116624666034 e17523205116624666034, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = e17523205116624666034;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        E17523205116624666034 e17523205116624666034 = this.v;
        switch (b) {
            case 0:
                return new K17018517525825308154(e17523205116624666034, r4833348786910499294, (byte) 0);
            case 1:
                return new K17018517525825308154(e17523205116624666034, r4833348786910499294, (byte) 1);
            default:
                return new K17018517525825308154(e17523205116624666034, r4833348786910499294, (byte) 2);
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
        return ((K17018517525825308154) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = O9245300239821758723.a;
        E17523205116624666034 e17523205116624666034 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        R4833348786910499294 r4833348786910499294 = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.u;
                try {
                    if (!z) {
                        E17665849472693074628.k(obj);
                        int iG = e17523205116624666034.e.b.g() + 1;
                        this.u = true;
                        if (e17523205116624666034.f(iG, this) == z3437138737604933638) {
                            obj2 = z3437138737604933638;
                        }
                    } else {
                        if (!z) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    return obj2;
                } catch (IllegalArgumentException unused) {
                    return obj2;
                }
            case 1:
                boolean z2 = this.u;
                try {
                    if (!z2) {
                        E17665849472693074628.k(obj);
                        int iG2 = e17523205116624666034.e.b.g() - 1;
                        this.u = true;
                        if (e17523205116624666034.f(iG2, this) == z3437138737604933638) {
                            obj2 = z3437138737604933638;
                        }
                    } else {
                        if (!z2) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    return obj2;
                } catch (IllegalArgumentException unused2) {
                    return obj2;
                }
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    N1485544172264925150 n1485544172264925150 = new N1485544172264925150(2, r4833348786910499294, b2);
                    this.u = true;
                    return e17523205116624666034.e(D6414970586266598845.a, n1485544172264925150, this) == z3437138737604933638 ? z3437138737604933638 : obj2;
                }
                if (z3) {
                    E17665849472693074628.k(obj);
                    return obj2;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
