package dev.epro.r0;

import ads_mobile_sdk.x52;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W6980246436852868685 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public byte u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W6980246436852868685(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = obj;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new W6980246436852868685((W1460317453757127858) obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new W6980246436852868685((x52) obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                return new W6980246436852868685((L9852841107405549527) obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                W1460317453757127858 w1460317453757127858 = (W1460317453757127858) obj2;
                byte b2 = this.u;
                if (b2 != 0) {
                    if (b2 == 1) {
                        E17665849472693074628.k(obj);
                    } else if (b2 != 2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                        w1460317453757127858.u.t.setValue(Boolean.TRUE);
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    D2717688760023469083 d2717688760023469083 = w1460317453757127858.u;
                    this.u = (byte) 1;
                    d2717688760023469083.z();
                    if (o9245300239821758723 == z3437138737604933638) {
                    }
                }
                S16869475527240117894 s16869475527240117894 = w1460317453757127858.A;
                if (s16869475527240117894 != null) {
                    CharSequence charSequence = w1460317453757127858.u.a.d().c;
                    long j = w1460317453757127858.u.a.d().d;
                    this.u = (byte) 2;
                    Object objD = ((K1755082528704418605) s16869475527240117894).d(charSequence, j, this);
                    if (objD != z3437138737604933638) {
                        objD = o9245300239821758723;
                    }
                    if (objD == z3437138737604933638) {
                    }
                }
                w1460317453757127858.u.t.setValue(Boolean.TRUE);
                break;
            case 1:
                x52 x52Var = (x52) obj2;
                byte b3 = this.u;
                if (b3 != 0) {
                    if (b3 == 1) {
                        E17665849472693074628.k(obj);
                    } else if (b3 != 2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                        x52Var.i.f0();
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    this.u = (byte) 1;
                    if (A15222901130456174747.z(this) == z3437138737604933638) {
                    }
                }
                G8001132634698687269 g8001132634698687269 = x52Var.d;
                R16580349318584449994 r16580349318584449994 = new R16580349318584449994(x52Var, r4833348786910499294, (byte) 13);
                this.u = (byte) 2;
                if (R7033599853981556291.d0(g8001132634698687269, r16580349318584449994, this) == z3437138737604933638) {
                }
                x52Var.i.f0();
                break;
            default:
                L9852841107405549527 l9852841107405549527 = (L9852841107405549527) obj2;
                byte b4 = this.u;
                if (b4 != 0) {
                    if (b4 == 1) {
                        E17665849472693074628.k(obj);
                    } else if (b4 != 2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        E17665849472693074628.k(obj);
                        l9852841107405549527.B = true;
                    }
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    this.u = (byte) 1;
                    if (l9852841107405549527.t(this) == z3437138737604933638) {
                    }
                }
                H9390398899829886498 h9390398899829886498F = l9852841107405549527.f();
                if (h9390398899829886498F != null) {
                    String str = (String) h9390398899829886498F.a;
                    long j2 = ((F12478849263529740365) h9390398899829886498F.b).a;
                    S16869475527240117894 s168694755272401178942 = l9852841107405549527.j;
                    if (s168694755272401178942 != null) {
                        this.u = (byte) 2;
                        Object objD2 = ((K1755082528704418605) s168694755272401178942).d(str, j2, this);
                        if (objD2 != z3437138737604933638) {
                            objD2 = o9245300239821758723;
                        }
                        if (objD2 == z3437138737604933638) {
                        }
                    }
                }
                l9852841107405549527.B = true;
                break;
        }
        return o9245300239821758723;
    }
}
