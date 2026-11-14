package dev.epro.r0;

import ads_mobile_sdk.lo2;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J10413379891765758296 extends R14062301455140331524 implements J12078565427869724451 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J10413379891765758296(Object obj, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(3, r4833348786910499294);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return new J10413379891765758296((H9049518308677093740) this.v, (O12152244488187446230) this.w, (R4833348786910499294) obj3, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new J10413379891765758296((G8001132634698687269) this.v, (V16504496955554646429) this.w, (R4833348786910499294) obj3, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                J10413379891765758296 j10413379891765758296 = new J10413379891765758296(3, (R4833348786910499294) obj3);
                j10413379891765758296.v = (S7864201625552763331) obj;
                j10413379891765758296.w = (Object[]) obj2;
                return j10413379891765758296.invokeSuspend(o9245300239821758723);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        G11493083415162978130 g11493083415162978130;
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        byte b2 = 1;
        G11493083415162978130 g114930834151629781302 = null;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    Q17583663005036435799 q17583663005036435799 = ((H9049518308677093740) this.v).a;
                    O12152244488187446230 o12152244488187446230 = (O12152244488187446230) this.w;
                    this.u = true;
                    if (o12152244488187446230.invoke(q17583663005036435799, this) == z3437138737604933638) {
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
                    G8001132634698687269 g8001132634698687269 = (G8001132634698687269) this.v;
                    lo2 lo2Var = new lo2((V16504496955554646429) this.w, objArr == true ? 1 : 0, b2);
                    this.u = true;
                    if (R7033599853981556291.d0(g8001132634698687269, lo2Var, this) == z3437138737604933638) {
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
                    S7864201625552763331 s7864201625552763331 = (S7864201625552763331) this.v;
                    G11493083415162978130[] g11493083415162978130Arr = (G11493083415162978130[]) ((Object[]) this.w);
                    int length = g11493083415162978130Arr.length;
                    int i = 0;
                    while (true) {
                        g11493083415162978130 = P3556858185158226376.a;
                        if (i < length) {
                            G11493083415162978130 g114930834151629781303 = g11493083415162978130Arr[i];
                            if (S10823041268949770285.t(g114930834151629781303, g11493083415162978130)) {
                                i++;
                            } else {
                                g114930834151629781302 = g114930834151629781303;
                            }
                        }
                    }
                    if (g114930834151629781302 != null) {
                        g11493083415162978130 = g114930834151629781302;
                    }
                    this.u = true;
                    if (s7864201625552763331.emit(g11493083415162978130, this) == z3437138737604933638) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J10413379891765758296(int i, R4833348786910499294 r4833348786910499294) {
        super(i, r4833348786910499294);
        this.t = (byte) 2;
    }
}
