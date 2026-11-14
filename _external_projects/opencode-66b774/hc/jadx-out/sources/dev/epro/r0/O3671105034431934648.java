package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O3671105034431934648 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ D2717688760023469083 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O3671105034431934648(D2717688760023469083 d2717688760023469083, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = d2717688760023469083;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D2717688760023469083 d2717688760023469083 = this.v;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj;
        switch (b) {
            case 0:
                return new O3671105034431934648(d2717688760023469083, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
            case 1:
                return new O3671105034431934648(d2717688760023469083, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
            default:
                return new O3671105034431934648(d2717688760023469083, r4833348786910499294, (byte) 2).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        D2717688760023469083 d2717688760023469083 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    d2717688760023469083.d(this);
                    if (o9245300239821758723 == z3437138737604933638) {
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
                    boolean zBooleanValue = ((Boolean) d2717688760023469083.t.getValue()).booleanValue();
                    this.u = true;
                    d2717688760023469083.c(zBooleanValue, this);
                    if (o9245300239821758723 == z3437138737604933638) {
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
                    if (d2717688760023469083.s(false, this) == z3437138737604933638) {
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
