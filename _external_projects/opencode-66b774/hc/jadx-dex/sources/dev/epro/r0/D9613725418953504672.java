package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D9613725418953504672 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.U16834965109098959004 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ dev.epro.r0.Q2935940014188319606 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D9613725418953504672(dev.epro.r0.U16834965109098959004 u16834965109098959004, float f, dev.epro.r0.Q2935940014188319606 q2935940014188319606, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = u16834965109098959004;
        this.w = f;
        this.x = q2935940014188319606;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new dev.epro.r0.D9613725418953504672(this.v, this.w, this.x, r4833348786910499294, (byte) 0);
            default:
                return new dev.epro.r0.D9613725418953504672(this.v, this.w, this.x, r4833348786910499294, (byte) 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) obj;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj2;
        switch (b) {
        }
        return create(r4833348786910499294, w5797197595347441198).invokeSuspend(o9245300239821758723);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.Q2935940014188319606 q2935940014188319606 = this.x;
        float f = this.w;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.A891803927997771281 a891803927997771281 = new dev.epro.r0.A891803927997771281(f);
                    dev.epro.r0.M7102034154292440921 m7102034154292440921 = q2935940014188319606.q;
                    this.u = true;
                    if (dev.epro.r0.U16834965109098959004.a(this.v, a891803927997771281, m7102034154292440921, (dev.epro.r0.F4096073349764486348) null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.A891803927997771281 a8918039279977712812 = new dev.epro.r0.A891803927997771281(f);
                    dev.epro.r0.M7102034154292440921 m71020341542924409212 = q2935940014188319606.q;
                    this.u = true;
                    if (dev.epro.r0.U16834965109098959004.a(this.v, a8918039279977712812, m71020341542924409212, (dev.epro.r0.F4096073349764486348) null, this, 12) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
