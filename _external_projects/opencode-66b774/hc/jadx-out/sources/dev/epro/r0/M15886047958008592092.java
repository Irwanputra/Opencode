package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M15886047958008592092 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public float v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M15886047958008592092(Object obj, float f, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = f;
        this.x = obj2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                return new M15886047958008592092((H17052510251737830620) this.w, this.v, (W1972671267364756056) obj2, r4833348786910499294, (byte) 0);
            case 1:
                return new M15886047958008592092((A6478343232691943615) this.w, this.v, (M15459437176959963354) obj2, r4833348786910499294, (byte) 1);
            default:
                M15886047958008592092 m15886047958008592092 = new M15886047958008592092((W3656598099029166611) obj2, r4833348786910499294);
                m15886047958008592092.w = obj;
                return m15886047958008592092;
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
        return ((M15886047958008592092) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        float fD;
        W5797197595347441198 w5797197595347441198;
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.x;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) obj2;
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    if (((List) w1972671267364756056.getValue()).size() > 1) {
                        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) ((List) w1972671267364756056.getValue()).get(((List) w1972671267364756056.getValue()).size() - 2);
                        H17052510251737830620 h17052510251737830620 = (H17052510251737830620) this.w;
                        float f = this.v;
                        this.u = true;
                        if (h17052510251737830620.u(f, r14289894334981469490, this) == z3437138737604933638) {
                        }
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
                    this.u = true;
                    if (U16834965109098959004.a((U16834965109098959004) ((A6478343232691943615) this.w).c, new Float(this.v), (M15459437176959963354) obj2, null, this, 12) == z3437138737604933638) {
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
                    W5797197595347441198 w57971975953474411982 = (W5797197595347441198) this.w;
                    fD = M17147082063200071302.D(w57971975953474411982.h());
                    w5797197595347441198 = w57971975953474411982;
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fD = this.v;
                    w5797197595347441198 = (W5797197595347441198) this.w;
                    E17665849472693074628.k(obj);
                }
                while (O8620973563946607355.M(w5797197595347441198)) {
                    L9747039536223884423 l9747039536223884423 = new L9747039536223884423((W3656598099029166611) obj2, fD, (byte) 2);
                    this.w = w5797197595347441198;
                    this.v = fD;
                    this.u = true;
                    if (U15853425786981391261.M(getContext()).a(l9747039536223884423, this) == z3437138737604933638) {
                        break;
                    }
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M15886047958008592092(W3656598099029166611 w3656598099029166611, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 2;
        this.x = w3656598099029166611;
    }
}
