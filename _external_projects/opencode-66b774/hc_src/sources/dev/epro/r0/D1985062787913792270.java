package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D1985062787913792270 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ R8029976778412248429 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ M15459437176959963354 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1985062787913792270(R8029976778412248429 r8029976778412248429, float f, M15459437176959963354 m15459437176959963354, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = r8029976778412248429;
        this.w = f;
        this.x = m15459437176959963354;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj;
        switch (b) {
            case 0:
                return new D1985062787913792270(this.v, this.w, (M7102034154292440921) this.x, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new D1985062787913792270(this.v, this.w, this.x, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        float f = this.w;
        R8029976778412248429 r8029976778412248429 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = r8029976778412248429.f;
                    Float f2 = new Float(f);
                    M7102034154292440921 m7102034154292440921 = (M7102034154292440921) this.x;
                    this.u = true;
                    Object a = U16834965109098959004.a(u16834965109098959004, f2, m7102034154292440921, null, this, 12);
                    if (a == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u168349651090989590042 = r8029976778412248429.f;
                    Float f3 = new Float(f);
                    this.u = true;
                    Object a2 = U16834965109098959004.a(u168349651090989590042, f3, this.x, null, this, 12);
                    if (a2 == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }
}
