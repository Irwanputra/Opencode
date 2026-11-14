package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1985062787913792270 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.R8029976778412248429 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ dev.epro.r0.M15459437176959963354 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D1985062787913792270(dev.epro.r0.R8029976778412248429 r8029976778412248429, float f, dev.epro.r0.M15459437176959963354 m15459437176959963354, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = r8029976778412248429;
        this.w = f;
        this.x = m15459437176959963354;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.R4833348786910499294 r4833348786910499294 = (dev.epro.r0.R4833348786910499294) obj;
        switch (b) {
            case 0:
                return new dev.epro.r0.D1985062787913792270(this.v, this.w, this.x, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new dev.epro.r0.D1985062787913792270(this.v, this.w, this.x, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte b = this.t;
        float f = this.w;
        dev.epro.r0.R8029976778412248429 r8029976778412248429 = this.v;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.U16834965109098959004 u16834965109098959004 = r8029976778412248429.f;
                    java.lang.Float f2 = new java.lang.Float(f);
                    dev.epro.r0.M7102034154292440921 m7102034154292440921 = this.x;
                    this.u = true;
                    java.lang.Object objA = dev.epro.r0.U16834965109098959004.a(u16834965109098959004, f2, m7102034154292440921, (dev.epro.r0.F4096073349764486348) null, this, 12);
                    if (objA == z3437138737604933638) {
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
                    dev.epro.r0.U16834965109098959004 u168349651090989590042 = r8029976778412248429.f;
                    java.lang.Float f3 = new java.lang.Float(f);
                    this.u = true;
                    java.lang.Object objA2 = dev.epro.r0.U16834965109098959004.a(u168349651090989590042, f3, this.x, (dev.epro.r0.F4096073349764486348) null, this, 12);
                    if (objA2 == z3437138737604933638) {
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
