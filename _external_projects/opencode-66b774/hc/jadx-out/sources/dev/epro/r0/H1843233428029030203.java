package dev.epro.r0;

import ads_mobile_sdk.iv1;
import ads_mobile_sdk.q22;
import ads_mobile_sdk.w20;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H1843233428029030203 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ long v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H1843233428029030203(byte b, long j, R4833348786910499294 r4833348786910499294, Object obj) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new H1843233428029030203((byte) 0, this.v, r4833348786910499294, (N5230833122018532994) obj2);
            case 1:
                return new H1843233428029030203((byte) 1, this.v, r4833348786910499294, (w20) obj2);
            case 2:
                return new H1843233428029030203((byte) 2, this.v, r4833348786910499294, (q22) obj2);
            case 3:
                return new H1843233428029030203((byte) 3, this.v, r4833348786910499294, (G6575252167976303972) obj2);
            case 4:
                return new H1843233428029030203((byte) 4, this.v, r4833348786910499294, (U16834965109098959004) obj2);
            default:
                return new H1843233428029030203((byte) 5, this.v, r4833348786910499294, (B7140096597697748749) obj2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.w;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((H1843233428029030203) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new H1843233428029030203((byte) 1, this.v, (R4833348786910499294) obj2, (w20) obj3).invokeSuspend(o9245300239821758723);
            case 2:
                return new H1843233428029030203((byte) 2, this.v, (R4833348786910499294) obj2, (q22) obj3).invokeSuspend(o9245300239821758723);
            case 3:
                return new H1843233428029030203((byte) 3, this.v, (R4833348786910499294) obj2, (G6575252167976303972) obj3).invokeSuspend(o9245300239821758723);
            case 4:
                return ((H1843233428029030203) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((H1843233428029030203) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        long j = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    P13832034982779129365 p13832034982779129365 = ((N5230833122018532994) obj2).a;
                    this.u = true;
                    if (p13832034982779129365.b(j, this) == z3437138737604933638) {
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
                    w20 w20Var = (w20) obj2;
                    AtomicReference atomicReference = w20Var.m;
                    R5692663580087387669 r5692663580087387669 = w20Var.f119o;
                    Long l = new Long(j);
                    this.u = true;
                    if (w20Var.a(atomicReference, r5692663580087387669, l, this) == z3437138737604933638) {
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
                    if (((q22) obj2).a(this.v, null, null, false, this) == z3437138737604933638) {
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
                    iv1 iv1Var = (iv1) ((G6575252167976303972) obj2).d;
                    this.u = true;
                    if (iv1Var.e(j, this) == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 4:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = (U16834965109098959004) obj2;
                    L2216691091636065972 l2216691091636065972 = new L2216691091636065972(j);
                    M7102034154292440921 m7102034154292440921 = K12992568251249708449.d;
                    this.u = true;
                    if (U16834965109098959004.a(u16834965109098959004, l2216691091636065972, m7102034154292440921, null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z6 = this.u;
                if (!z6) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u168349651090989590042 = ((B7140096597697748749) obj2).v;
                    L2216691091636065972 l22166910916360659722 = new L2216691091636065972(j);
                    M7102034154292440921 m71020341542924409212 = K12992568251249708449.d;
                    this.u = true;
                    if (U16834965109098959004.a(u168349651090989590042, l22166910916360659722, m71020341542924409212, null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z6) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
