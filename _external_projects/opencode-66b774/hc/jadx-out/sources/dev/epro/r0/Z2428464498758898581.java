package dev.epro.r0;

import ads_mobile_sdk.qu0;
import ads_mobile_sdk.wo2;
import ads_mobile_sdk.xo2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z2428464498758898581 extends R14062301455140331524 implements J12078565427869724451 {
    public final /* synthetic */ byte t;
    public byte u;
    public /* synthetic */ S7864201625552763331 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z2428464498758898581(R4833348786910499294 r4833348786910499294, S8977162183056139880 s8977162183056139880, byte b) {
        super(3, r4833348786910499294);
        this.t = b;
        this.x = s8977162183056139880;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj4 = this.x;
        switch (b) {
            case 0:
                Z2428464498758898581 z2428464498758898581 = new Z2428464498758898581(obj4, (R4833348786910499294) obj3, (byte) 0);
                z2428464498758898581.v = (S7864201625552763331) obj;
                z2428464498758898581.w = obj2;
                return z2428464498758898581.invokeSuspend(o9245300239821758723);
            case 1:
                Z2428464498758898581 z24284644987588985812 = new Z2428464498758898581(obj4, (R4833348786910499294) obj3, (byte) 1);
                z24284644987588985812.v = (S7864201625552763331) obj;
                z24284644987588985812.w = (Throwable) obj2;
                return z24284644987588985812.invokeSuspend(o9245300239821758723);
            case 2:
                Z2428464498758898581 z24284644987588985813 = new Z2428464498758898581((R4833348786910499294) obj3, (S8977162183056139880) obj4, (byte) 2);
                z24284644987588985813.v = (S7864201625552763331) obj;
                z24284644987588985813.w = (Object[]) obj2;
                return z24284644987588985813.invokeSuspend(o9245300239821758723);
            case 3:
                Z2428464498758898581 z24284644987588985814 = new Z2428464498758898581((R4833348786910499294) obj3, (S8977162183056139880) obj4, (byte) 3);
                z24284644987588985814.v = (S7864201625552763331) obj;
                z24284644987588985814.w = (Object[]) obj2;
                return z24284644987588985814.invokeSuspend(o9245300239821758723);
            case 4:
                Z2428464498758898581 z24284644987588985815 = new Z2428464498758898581((R4833348786910499294) obj3, (S8977162183056139880) obj4, (byte) 4);
                z24284644987588985815.v = (S7864201625552763331) obj;
                z24284644987588985815.w = (Object[]) obj2;
                return z24284644987588985815.invokeSuspend(o9245300239821758723);
            default:
                Z2428464498758898581 z24284644987588985816 = new Z2428464498758898581(obj4, (R4833348786910499294) obj3, (byte) 5);
                z24284644987588985816.v = (S7864201625552763331) obj;
                z24284644987588985816.w = (Object[]) obj2;
                return z24284644987588985816.invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        S7864201625552763331 s7864201625552763331;
        Object objInvoke;
        S7864201625552763331 s78642016255527633312;
        Throwable th;
        S7864201625552763331 s78642016255527633313;
        Object objI;
        S7864201625552763331 s78642016255527633314;
        Object objC;
        S7864201625552763331 s78642016255527633315;
        Object objA;
        S7864201625552763331 s78642016255527633316;
        Object objInvoke2;
        byte b = this.t;
        int i = 0;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.x;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        String str = null;
        switch (b) {
            case 0:
                byte b2 = this.u;
                if (b2 == 0) {
                    E17665849472693074628.k(obj);
                    s7864201625552763331 = this.v;
                    Object obj3 = this.w;
                    this.v = s7864201625552763331;
                    this.u = (byte) 1;
                    objInvoke = ((L12639328004344855510) obj2).invoke(obj3, this);
                    if (objInvoke != z3437138737604933638) {
                    }
                } else if (b2 == 1) {
                    s7864201625552763331 = this.v;
                    E17665849472693074628.k(obj);
                    objInvoke = obj;
                } else if (b2 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                this.v = null;
                this.u = (byte) 2;
                if (s7864201625552763331.emit(objInvoke, this) != z3437138737604933638) {
                }
                break;
            case 1:
                wo2 wo2Var = (wo2) obj2;
                byte b3 = this.u;
                if (b3 == 0) {
                    E17665849472693074628.k(obj);
                    s78642016255527633312 = this.v;
                    th = (Throwable) this.w;
                    this.v = s78642016255527633312;
                    this.w = th;
                    this.u = (byte) 1;
                    if (wo2Var.c(this) != z3437138737604933638) {
                    }
                } else if (b3 == 1) {
                    th = (Throwable) this.w;
                    s78642016255527633312 = this.v;
                    E17665849472693074628.k(obj);
                } else if (b3 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                qu0 qu0Var = new qu0(th, i, str, 6);
                wo2Var.getClass();
                xo2 xo2Var = new xo2(new D16573472668995260995(X2485016533998461232._a(qu0Var.d), Q3791352212346016950.d(qu0Var), null));
                this.v = null;
                this.w = null;
                this.u = (byte) 2;
                if (s78642016255527633312.emit(xo2Var, this) != z3437138737604933638) {
                }
                break;
            case 2:
                byte b4 = this.u;
                if (b4 == 0) {
                    E17665849472693074628.k(obj);
                    s78642016255527633313 = this.v;
                    Object[] objArr = (Object[]) this.w;
                    Object obj4 = objArr[0];
                    Object obj5 = objArr[1];
                    Object obj6 = objArr[2];
                    this.v = s78642016255527633313;
                    this.u = (byte) 1;
                    objI = ((G13792465322404021864) obj2).i(obj4, obj5, obj6, this);
                    if (objI != z3437138737604933638) {
                    }
                } else if (b4 == 1) {
                    s78642016255527633313 = this.v;
                    E17665849472693074628.k(obj);
                    objI = obj;
                } else if (b4 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                this.v = null;
                this.u = (byte) 2;
                if (s78642016255527633313.emit(objI, this) != z3437138737604933638) {
                }
                break;
            case 3:
                byte b5 = this.u;
                if (b5 == 0) {
                    E17665849472693074628.k(obj);
                    s78642016255527633314 = this.v;
                    Object[] objArr2 = (Object[]) this.w;
                    X9973786505953245660 x9973786505953245660 = (X9973786505953245660) obj2;
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    Object obj9 = objArr2[2];
                    Object obj10 = objArr2[3];
                    this.v = s78642016255527633314;
                    this.u = (byte) 1;
                    objC = x9973786505953245660.c(obj7, obj8, obj9, obj10, this);
                    if (objC != z3437138737604933638) {
                    }
                } else if (b5 == 1) {
                    S7864201625552763331 s78642016255527633317 = this.v;
                    E17665849472693074628.k(obj);
                    s78642016255527633314 = s78642016255527633317;
                    objC = obj;
                } else if (b5 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                this.v = null;
                this.u = (byte) 2;
                if (s78642016255527633314.emit(objC, this) != z3437138737604933638) {
                }
                break;
            case 4:
                byte b6 = this.u;
                if (b6 == 0) {
                    E17665849472693074628.k(obj);
                    s78642016255527633315 = this.v;
                    Object[] objArr3 = (Object[]) this.w;
                    V9261584529168786349 v9261584529168786349 = (V9261584529168786349) obj2;
                    Object obj11 = objArr3[0];
                    Object obj12 = objArr3[1];
                    Object obj13 = objArr3[2];
                    Object obj14 = objArr3[3];
                    Object obj15 = objArr3[4];
                    this.v = s78642016255527633315;
                    this.u = (byte) 1;
                    objA = v9261584529168786349.a(obj11, obj12, obj13, obj14, obj15, this);
                    if (objA != z3437138737604933638) {
                    }
                } else if (b6 == 1) {
                    S7864201625552763331 s78642016255527633318 = this.v;
                    E17665849472693074628.k(obj);
                    s78642016255527633315 = s78642016255527633318;
                    objA = obj;
                } else if (b6 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                this.v = null;
                this.u = (byte) 2;
                if (s78642016255527633315.emit(objA, this) != z3437138737604933638) {
                }
                break;
            default:
                byte b7 = this.u;
                if (b7 == 0) {
                    E17665849472693074628.k(obj);
                    s78642016255527633316 = this.v;
                    Object[] objArr4 = (Object[]) this.w;
                    Object obj16 = objArr4[0];
                    Object obj17 = objArr4[1];
                    this.v = s78642016255527633316;
                    this.u = (byte) 1;
                    objInvoke2 = ((J12078565427869724451) obj2).invoke(obj16, obj17, this);
                    if (objInvoke2 != z3437138737604933638) {
                    }
                } else if (b7 == 1) {
                    s78642016255527633316 = this.v;
                    E17665849472693074628.k(obj);
                    objInvoke2 = obj;
                } else if (b7 != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                this.v = null;
                this.u = (byte) 2;
                if (s78642016255527633316.emit(objInvoke2, this) != z3437138737604933638) {
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z2428464498758898581(Object obj, R4833348786910499294 r4833348786910499294, byte b) {
        super(3, r4833348786910499294);
        this.t = b;
        this.x = obj;
    }
}
