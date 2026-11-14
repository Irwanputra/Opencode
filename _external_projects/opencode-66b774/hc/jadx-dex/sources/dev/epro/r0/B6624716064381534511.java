package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6624716064381534511 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.S9385204271696540760 v;
    public final /* synthetic */ dev.epro.r0.L11334185135933894276 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B6624716064381534511(dev.epro.r0.L11334185135933894276 l11334185135933894276, dev.epro.r0.S9385204271696540760 s9385204271696540760, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.w = l11334185135933894276;
        this.v = s9385204271696540760;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.L11334185135933894276 l11334185135933894276 = this.w;
        dev.epro.r0.S9385204271696540760 s9385204271696540760 = this.v;
        switch (b) {
            case 0:
                return new dev.epro.r0.B6624716064381534511(l11334185135933894276, s9385204271696540760, r4833348786910499294);
            case 1:
                return new dev.epro.r0.B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 1);
            default:
                return new dev.epro.r0.B6624716064381534511(s9385204271696540760, l11334185135933894276, r4833348786910499294, (byte) 2);
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
        dev.epro.r0.L11334185135933894276 l11334185135933894276 = this.w;
        dev.epro.r0.S9385204271696540760 s9385204271696540760 = this.v;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.V1670068795916328108 a9134307198683833790 = new dev.epro.r0.A9134307198683833790(l11334185135933894276);
                    this.u = true;
                    if (s9385204271696540760.b(a9134307198683833790, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (s9385204271696540760.b(l11334185135933894276, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (s9385204271696540760.b(l11334185135933894276, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B6624716064381534511(dev.epro.r0.S9385204271696540760 s9385204271696540760, dev.epro.r0.L11334185135933894276 l11334185135933894276, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = s9385204271696540760;
        this.w = l11334185135933894276;
    }
}
