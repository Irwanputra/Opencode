package dev.epro.r0;

import ads_mobile_sdk.d3;
import ads_mobile_sdk.fz;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H10430515288632824348 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H10430515288632824348(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
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
                return new H10430515288632824348((U7325339214157685715) obj2, (R4833348786910499294) obj, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new H10430515288632824348((d3) obj2, (R4833348786910499294) obj, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new H10430515288632824348((O11899788901879362309) obj2, (R4833348786910499294) obj, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new H10430515288632824348((A15234621907337682254) obj2, (R4833348786910499294) obj, (byte) 3).invokeSuspend(o9245300239821758723);
            default:
                return new H10430515288632824348((P5204863746366580363) obj2, (R4833348786910499294) obj, (byte) 4).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object objInvoke = ((U7325339214157685715) obj2).invoke(this);
                    if (objInvoke == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    fz fzVar = ((d3) obj2).l;
                    this.u = true;
                    Object objW = fzVar.w(this);
                    if (objW == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object objY = ((O11899788901879362309) obj2).y(this);
                    if (objY == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                A15234621907337682254 a15234621907337682254 = (A15234621907337682254) obj2;
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    H9390398899829886498 h9390398899829886498G = a15234621907337682254.g();
                    if (h9390398899829886498G != null) {
                        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) h9390398899829886498G.a;
                        long j = ((F12478849263529740365) h9390398899829886498G.b).a;
                        S16869475527240117894 s16869475527240117894 = a15234621907337682254.u;
                        if (s16869475527240117894 != null) {
                            this.u = true;
                            Object objD = ((K1755082528704418605) s16869475527240117894).d(m11181104712105445833, j, this);
                            if (objD != z3437138737604933638) {
                                objD = o9245300239821758723;
                            }
                            if (objD == z3437138737604933638) {
                            }
                        }
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    P5204863746366580363 p5204863746366580363 = (P5204863746366580363) obj2;
                    this.u = true;
                    H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(this));
                    h7219028874700587498.t();
                    D7996823394324996916 d7996823394324996916 = p5204863746366580363.b;
                    d7996823394324996916.c.setValue(Boolean.TRUE);
                    p5204863746366580363.c = h7219028874700587498;
                    if (h7219028874700587498.r() == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
