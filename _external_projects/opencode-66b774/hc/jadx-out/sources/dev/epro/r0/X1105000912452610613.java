package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X1105000912452610613 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ K14640285359526119410 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X1105000912452610613(K14640285359526119410 k14640285359526119410, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = k14640285359526119410;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        K14640285359526119410 k14640285359526119410 = this.v;
        switch (b) {
            case 0:
                return new X1105000912452610613(k14640285359526119410, r4833348786910499294, (byte) 0);
            default:
                return new X1105000912452610613(k14640285359526119410, r4833348786910499294, (byte) 1);
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
        return ((X1105000912452610613) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        K14640285359526119410 k14640285359526119410 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    S11237161986419267460 s11237161986419267460 = k14640285359526119410.t;
                    float f = k14640285359526119410.q ? 1.0f : 0.0f;
                    this.u = true;
                    Object objF = s11237161986419267460.a.f(this, new Float(f));
                    if (objF != z3437138737604933638) {
                        objF = o9245300239821758723;
                    }
                    if (objF == z3437138737604933638) {
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
                    if (!k14640285359526119410.t.a.e()) {
                        S11237161986419267460 s112371619864192674602 = k14640285359526119410.t;
                        float fG = k14640285359526119410.w.g() / k14640285359526119410.n1();
                        this.u = true;
                        Object objF2 = s112371619864192674602.a.f(this, new Float(fG));
                        if (objF2 != z3437138737604933638) {
                            objF2 = o9245300239821758723;
                        }
                        if (objF2 == z3437138737604933638) {
                        }
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }
}
