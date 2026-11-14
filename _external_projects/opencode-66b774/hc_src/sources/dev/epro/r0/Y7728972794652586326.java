package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y7728972794652586326 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ D5961215468735357278 v;
    public final /* synthetic */ R5670552972627103399 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y7728972794652586326(D5961215468735357278 d5961215468735357278, R5670552972627103399 r5670552972627103399, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = d5961215468735357278;
        this.w = r5670552972627103399;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new Y7728972794652586326(this.v, this.w, r4833348786910499294, (byte) 0);
            case 1:
                return new Y7728972794652586326(this.v, this.w, r4833348786910499294, (byte) 1);
            default:
                return new Y7728972794652586326(this.v, this.w, r4833348786910499294, (byte) 2);
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
        return ((Y7728972794652586326) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R5670552972627103399 r5670552972627103399 = this.w;
        D5961215468735357278 d5961215468735357278 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    J12043550928838212009 a = d5961215468735357278.a();
                    Z13933381327704657732 z13933381327704657732 = new Z13933381327704657732(r5670552972627103399, (byte) 0);
                    this.u = true;
                    if (a.collect(z13933381327704657732, this) == z3437138737604933638) {
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
                    J12043550928838212009 a2 = d5961215468735357278.a();
                    Z13933381327704657732 z139333813277046577322 = new Z13933381327704657732(r5670552972627103399, (byte) 1);
                    this.u = true;
                    if (a2.collect(z139333813277046577322, this) == z3437138737604933638) {
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
                    J12043550928838212009 a3 = d5961215468735357278.a();
                    Z13933381327704657732 z139333813277046577323 = new Z13933381327704657732(r5670552972627103399, (byte) 2);
                    this.u = true;
                    if (a3.collect(z139333813277046577323, this) == z3437138737604933638) {
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
}
