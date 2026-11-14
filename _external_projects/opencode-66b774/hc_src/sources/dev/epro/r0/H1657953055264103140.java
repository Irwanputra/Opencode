package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H1657953055264103140 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ W1857259450685235819 v;
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H1657953055264103140(W1857259450685235819 w1857259450685235819, float f, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = w1857259450685235819;
        this.w = f;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        float f = this.w;
        W1857259450685235819 w1857259450685235819 = this.v;
        switch (b) {
            case 0:
                return new H1657953055264103140(w1857259450685235819, f, r4833348786910499294, (byte) 0);
            default:
                return new H1657953055264103140(w1857259450685235819, f, r4833348786910499294, (byte) 1);
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
        return ((H1657953055264103140) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        float f = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        W1857259450685235819 w1857259450685235819 = this.v;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = w1857259450685235819.t;
                    if (u16834965109098959004 != null) {
                        Float f2 = new Float(f);
                        M15459437176959963354 m15459437176959963354 = w1857259450685235819.r ? M17943801045207241871.f : w1857259450685235819.q;
                        this.u = true;
                        obj = U16834965109098959004.a(u16834965109098959004, f2, m15459437176959963354, null, this, 12);
                        if (obj == z3437138737604933638) {
                            break;
                        }
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u168349651090989590042 = w1857259450685235819.s;
                    if (u168349651090989590042 != null) {
                        Float f3 = new Float(f);
                        M15459437176959963354 m154594371769599633542 = w1857259450685235819.r ? M17943801045207241871.f : w1857259450685235819.q;
                        this.u = true;
                        obj = U16834965109098959004.a(u168349651090989590042, f3, m154594371769599633542, null, this, 12);
                        if (obj == z3437138737604933638) {
                            break;
                        }
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }
}
