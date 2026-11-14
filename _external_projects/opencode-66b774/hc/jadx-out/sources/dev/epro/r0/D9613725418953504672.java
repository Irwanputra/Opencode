package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D9613725418953504672 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ U16834965109098959004 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Q2935940014188319606 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D9613725418953504672(U16834965109098959004 u16834965109098959004, float f, Q2935940014188319606 q2935940014188319606, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = u16834965109098959004;
        this.w = f;
        this.x = q2935940014188319606;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new D9613725418953504672(this.v, this.w, this.x, r4833348786910499294, (byte) 0);
            default:
                return new D9613725418953504672(this.v, this.w, this.x, r4833348786910499294, (byte) 1);
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
        return ((D9613725418953504672) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Q2935940014188319606 q2935940014188319606 = this.x;
        float f = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    A891803927997771281 a891803927997771281 = new A891803927997771281(f);
                    M7102034154292440921 m7102034154292440921 = q2935940014188319606.q;
                    this.u = true;
                    if (U16834965109098959004.a(this.v, a891803927997771281, m7102034154292440921, null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    A891803927997771281 a8918039279977712812 = new A891803927997771281(f);
                    M7102034154292440921 m71020341542924409212 = q2935940014188319606.q;
                    this.u = true;
                    if (U16834965109098959004.a(this.v, a8918039279977712812, m71020341542924409212, null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
