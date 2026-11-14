package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B11361677180658862244 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ I13087925019311684776 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B11361677180658862244(I13087925019311684776 i13087925019311684776, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = i13087925019311684776;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        I13087925019311684776 i13087925019311684776 = this.v;
        switch (b) {
            case 0:
                return new B11361677180658862244(i13087925019311684776, r4833348786910499294, (byte) 0);
            case 1:
                return new B11361677180658862244(i13087925019311684776, r4833348786910499294, (byte) 1);
            case 2:
                return new B11361677180658862244(i13087925019311684776, r4833348786910499294, (byte) 2);
            case 3:
                return new B11361677180658862244(i13087925019311684776, r4833348786910499294, (byte) 3);
            default:
                return new B11361677180658862244(i13087925019311684776, r4833348786910499294, (byte) 4);
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
        return ((B11361677180658862244) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        I13087925019311684776 i13087925019311684776 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = i13087925019311684776.q;
                    Float f = new Float(1.0f);
                    this.u = true;
                    if (u16834965109098959004.f(this, f) == z3437138737604933638) {
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
                    U16834965109098959004 u168349651090989590042 = i13087925019311684776.p;
                    Q2551293802323679034 q2551293802323679034 = new Q2551293802323679034(0L);
                    this.u = true;
                    if (u168349651090989590042.f(this, q2551293802323679034) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                i13087925019311684776.d(0L);
                i13087925019311684776.h.setValue(Boolean.FALSE);
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u168349651090989590043 = i13087925019311684776.p;
                    this.u = true;
                    if (u168349651090989590043.g(this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u168349651090989590044 = i13087925019311684776.q;
                    this.u = true;
                    if (u168349651090989590044.g(this) == z3437138737604933638) {
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
                    U16834965109098959004 u168349651090989590045 = i13087925019311684776.q;
                    this.u = true;
                    if (u168349651090989590045.g(this) == z3437138737604933638) {
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
