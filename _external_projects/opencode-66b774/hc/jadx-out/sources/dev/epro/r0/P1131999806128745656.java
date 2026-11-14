package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P1131999806128745656 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ G16768067413993841943 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P1131999806128745656(G16768067413993841943 g16768067413993841943, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = g16768067413993841943;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        G16768067413993841943 g16768067413993841943 = this.v;
        switch (b) {
            case 0:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 0);
            case 1:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 1);
            default:
                return new P1131999806128745656(g16768067413993841943, r4833348786910499294, (byte) 2);
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
        return ((P1131999806128745656) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object objF2;
        byte b = this.t;
        G16768067413993841943 g16768067413993841943 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (z) {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    N3336634644320470588 n3336634644320470588 = g16768067413993841943.d;
                    this.u = true;
                    Z5398859297832919716 z5398859297832919716 = G14082206658910936320.a;
                    if (((P6024466796603310388) n3336634644320470588.c).g() - 1 < 0 || (objF = g16768067413993841943.f(((P6024466796603310388) n3336634644320470588.c).g() - 1, O4077903568229246.Q(0.0f, 0.0f, null, 7), this)) != z3437138737604933638) {
                        objF = o9245300239821758723;
                    }
                    if (objF == z3437138737604933638) {
                    }
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (z2) {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    N3336634644320470588 n33366346443204705882 = g16768067413993841943.d;
                    this.u = true;
                    Z5398859297832919716 z53988592978329197162 = G14082206658910936320.a;
                    if (((P6024466796603310388) n33366346443204705882.c).g() + 1 >= g16768067413993841943.l() || (objF2 = g16768067413993841943.f(((P6024466796603310388) n33366346443204705882.c).g() + 1, O4077903568229246.Q(0.0f, 0.0f, null, 7), this)) != z3437138737604933638) {
                        objF2 = o9245300239821758723;
                    }
                    if (objF2 == z3437138737604933638) {
                    }
                }
                break;
            default:
                boolean z3 = this.u;
                if (z3) {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    byte b2 = 2;
                    Object objQ = X16625187937554653603.q(g16768067413993841943, D6414970586266598845.a, new N1485544172264925150(b2, r4833348786910499294, b2), this);
                    if (objQ != z3437138737604933638) {
                        objQ = o9245300239821758723;
                    }
                    if (objQ == z3437138737604933638) {
                    }
                }
                break;
        }
        return o9245300239821758723;
    }
}
