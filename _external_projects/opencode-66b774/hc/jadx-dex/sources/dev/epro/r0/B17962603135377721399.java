package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B17962603135377721399 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.F4096073349764486348 {
    public byte t;
    public final /* synthetic */ dev.epro.r0.P5204863746366580363 u;
    public final /* synthetic */ dev.epro.r0.H10430515288632824348 v;
    public final /* synthetic */ dev.epro.r0.D6414970586266598845 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B17962603135377721399(dev.epro.r0.P5204863746366580363 p5204863746366580363, dev.epro.r0.H10430515288632824348 h10430515288632824348, dev.epro.r0.D6414970586266598845 d6414970586266598845, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.u = p5204863746366580363;
        this.v = h10430515288632824348;
        this.w = d6414970586266598845;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        dev.epro.r0.H10430515288632824348 h10430515288632824348 = this.v;
        dev.epro.r0.D6414970586266598845 d6414970586266598845 = this.w;
        return new dev.epro.r0.B17962603135377721399(this.u, h10430515288632824348, d6414970586266598845, (dev.epro.r0.R4833348786910499294) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.H10430515288632824348 h10430515288632824348 = this.v;
        byte b = this.t;
        dev.epro.r0.D6414970586266598845 d6414970586266598845 = dev.epro.r0.D6414970586266598845.c;
        dev.epro.r0.D6414970586266598845 d64149705862665988452 = this.w;
        dev.epro.r0.P5204863746366580363 p5204863746366580363 = this.u;
        try {
            if (b == 0) {
                dev.epro.r0.E17665849472693074628.k(obj);
                dev.epro.r0.G16212247282630895364 g16212247282630895364 = new dev.epro.r0.G16212247282630895364(h10430515288632824348, (dev.epro.r0.R4833348786910499294) null, (byte) 21);
                this.t = (byte) 2;
                java.lang.Object objQ = dev.epro.r0.V16504496955554646429.q(1500L, g16212247282630895364, this);
                dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
                if (objQ == z3437138737604933638) {
                    return z3437138737604933638;
                }
            } else {
                if (b != 1 && b != 2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dev.epro.r0.E17665849472693074628.k(obj);
            }
            if (d64149705862665988452 != d6414970586266598845) {
                p5204863746366580363.a();
            }
            return dev.epro.r0.O9245300239821758723.a;
        } catch (java.lang.Throwable th) {
            if (d64149705862665988452 != d6414970586266598845) {
                p5204863746366580363.a();
            }
            throw th;
        }
    }
}
