package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L2357058196026577384 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2357058196026577384(S16869475527240117894 s16869475527240117894, String str, long j, F12478849263529740365 f12478849263529740365, L9852841107405549527 l9852841107405549527, R17143752899285419206 r17143752899285419206, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = s16869475527240117894;
        this.x = str;
        this.v = j;
        this.y = f12478849263529740365;
        this.z = l9852841107405549527;
        this.A = r17143752899285419206;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        switch (b) {
            case 0:
                L2357058196026577384 l2357058196026577384 = new L2357058196026577384((F2939855867946572554) obj5, (B3963145314223808202) obj4, (D9497773141868343380) obj3, this.v, (Q15035754882231748864) obj2, r4833348786910499294);
                l2357058196026577384.w = obj;
                return l2357058196026577384;
            default:
                return new L2357058196026577384((S16869475527240117894) this.w, (String) obj5, this.v, (F12478849263529740365) obj4, (L9852841107405549527) obj3, (R17143752899285419206) obj2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((L2357058196026577384) create((R4833348786910499294) obj2, (G3869673327990687150) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((L2357058196026577384) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        long j = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = this.z;
        Object obj4 = this.x;
        Object obj5 = this.A;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                D9497773141868343380 d9497773141868343380 = (D9497773141868343380) obj3;
                B3963145314223808202 b3963145314223808202 = (B3963145314223808202) obj2;
                F2939855867946572554 f2939855867946572554 = (F2939855867946572554) obj4;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    G3869673327990687150 g3869673327990687150 = (G3869673327990687150) this.w;
                    f2939855867946572554.e = b3963145314223808202.h1(d9497773141868343380, j);
                    C2148711509933735908 c2148711509933735908 = new C2148711509933735908(b3963145314223808202, f2939855867946572554, (Q15035754882231748864) obj5, g3869673327990687150);
                    A7716877927750495196 a7716877927750495196 = new A7716877927750495196(b3963145314223808202, f2939855867946572554, d9497773141868343380, (byte) 13);
                    this.u = true;
                    if (f2939855867946572554.a(c2148711509933735908, a7716877927750495196, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                R17143752899285419206 r17143752899285419206 = (R17143752899285419206) obj5;
                String str = (String) obj4;
                L9852841107405549527 l9852841107405549527 = (L9852841107405549527) obj3;
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    S16869475527240117894 s16869475527240117894 = (S16869475527240117894) this.w;
                    this.u = true;
                    obj = ((K1755082528704418605) s16869475527240117894).e(str, j, this);
                    if (obj == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                F12478849263529740365 f12478849263529740365 = (F12478849263529740365) obj;
                if (f12478849263529740365 != null) {
                    long j2 = f12478849263529740365.a;
                    long d = T1335862270807194835.d(r17143752899285419206.p((int) (j2 >> 32)), r17143752899285419206.p((int) (j2 & 4294967295L)));
                    if (!F12478849263529740365.b(d, (F12478849263529740365) obj2) && S10823041268949770285.t(l9852841107405549527.l().a.b, str) && r17143752899285419206 == l9852841107405549527.b) {
                        l9852841107405549527.c.invoke(L9852841107405549527.b(l9852841107405549527.l().a, d));
                        l9852841107405549527.w = new F12478849263529740365(d);
                    }
                }
                break;
        }
        return o9245300239821758723;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2357058196026577384(F2939855867946572554 f2939855867946572554, B3963145314223808202 b3963145314223808202, D9497773141868343380 d9497773141868343380, long j, Q15035754882231748864 q15035754882231748864, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = f2939855867946572554;
        this.y = b3963145314223808202;
        this.z = d9497773141868343380;
        this.v = j;
        this.A = q15035754882231748864;
    }
}
