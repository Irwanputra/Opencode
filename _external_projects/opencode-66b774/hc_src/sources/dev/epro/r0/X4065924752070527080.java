package dev.epro.r0;

import ads_mobile_sdk.pe2;
import ads_mobile_sdk.ue2;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X4065924752070527080 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ boolean v;
    public Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4065924752070527080(U16834965109098959004 u16834965109098959004, boolean z, M7102034154292440921 m7102034154292440921, B13729205492206812220 b13729205492206812220, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = u16834965109098959004;
        this.v = z;
        this.x = m7102034154292440921;
        this.y = b13729205492206812220;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                return new X4065924752070527080((U16834965109098959004) this.w, this.v, (M7102034154292440921) obj3, (B13729205492206812220) obj2, r4833348786910499294);
            case 1:
                return new X4065924752070527080(this.v, (A7209497065939201693) this.w, (pe2) obj3, (ue2) obj2, r4833348786910499294);
            default:
                return new X4065924752070527080((W1972671267364756056) obj3, this.v, (S9385204271696540760) obj2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((X4065924752070527080) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((X4065924752070527080) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((X4065924752070527080) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.y;
        boolean z = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj3 = this.x;
        switch (b) {
            case 0:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = (U16834965109098959004) this.w;
                    float f = z ? 1.0f : 0.0f;
                    this.u = true;
                    if (U16834965109098959004.a(u16834965109098959004, new Float(f), (M7102034154292440921) obj3, null, this, 12) == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                ((B13729205492206812220) obj2).invoke();
                break;
            case 1:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    if (z || ((A7209497065939201693) this.w).a == null) {
                        this.u = true;
                        obj = pe2.b((pe2) obj3, (ue2) obj2, this);
                        if (obj == z3437138737604933638) {
                            break;
                        }
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) obj3;
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    L11334185135933894276 l11334185135933894276 = (L11334185135933894276) w1972671267364756056.getValue();
                    if (l11334185135933894276 != null) {
                        S9385204271696540760 s9385204271696540760 = (S9385204271696540760) obj2;
                        C3125267566254703773 a9134307198683833790 = z ? new A9134307198683833790(l11334185135933894276) : new D10175313246177059481(l11334185135933894276);
                        if (s9385204271696540760 != null) {
                            this.w = w1972671267364756056;
                            this.u = true;
                            if (s9385204271696540760.b(a9134307198683833790, this) == z3437138737604933638) {
                                break;
                            }
                        }
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    w1972671267364756056 = (W1972671267364756056) this.w;
                    E17665849472693074628.k(obj);
                }
                w1972671267364756056.setValue(null);
                break;
        }
        return o9245300239821758723;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4065924752070527080(W1972671267364756056 w1972671267364756056, boolean z, S9385204271696540760 s9385204271696540760, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = w1972671267364756056;
        this.v = z;
        this.y = s9385204271696540760;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4065924752070527080(boolean z, A7209497065939201693 a7209497065939201693, pe2 pe2Var, ue2 ue2Var, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = z;
        this.w = a7209497065939201693;
        this.x = pe2Var;
        this.y = ue2Var;
    }
}
