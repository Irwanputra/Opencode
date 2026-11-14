package dev.epro.r0;

import ads_mobile_sdk.rr1;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W6362393430097503357 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W6362393430097503357(Object obj, boolean z, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = z;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        boolean z = this.v;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new W6362393430097503357((L9852841107405549527) obj2, z, r4833348786910499294, (byte) 0);
            default:
                return new W6362393430097503357((rr1) obj2, z, r4833348786910499294, (byte) 1);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((W6362393430097503357) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return new W6362393430097503357((rr1) this.w, this.v, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        L3957284589981577691 l3957284589981577691;
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        boolean z = this.v;
        Object obj2 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        M11181104712105445833 m11181104712105445833J = null;
        switch (b) {
            case 0:
                L9852841107405549527 l9852841107405549527 = (L9852841107405549527) obj2;
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    if (!F12478849263529740365.d(l9852841107405549527.l().b) && !(l9852841107405549527.f instanceof R11196590524698945668)) {
                        m11181104712105445833J = E15826830759497041750.j(l9852841107405549527.l());
                        if (z) {
                            int iF = F12478849263529740365.f(l9852841107405549527.l().b);
                            l9852841107405549527.c.invoke(L9852841107405549527.b(l9852841107405549527.l().a, T1335862270807194835.d(iF, iF)));
                            l9852841107405549527.r(I3645473568512758926.a);
                        }
                    }
                    if (m11181104712105445833J != null && (l3957284589981577691 = l9852841107405549527.h) != null) {
                        P444548812388912419 p444548812388912419D0 = O5354877807466160604.d0(m11181104712105445833J);
                        this.u = true;
                        ((T2834513763987957608) l3957284589981577691).b(p444548812388912419D0);
                        if (o9245300239821758723 == z3437138737604933638) {
                        }
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (rr1.a((rr1) obj2, z, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
