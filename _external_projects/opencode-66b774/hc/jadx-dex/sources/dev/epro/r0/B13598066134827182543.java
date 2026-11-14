package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13598066134827182543 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.L12639328004344855510 v;
    public final /* synthetic */ java.lang.Object w;
    public final /* synthetic */ dev.epro.r0.W5797197595347441198 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B13598066134827182543(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj, dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = l12639328004344855510;
        this.w = obj;
        this.x = w5797197595347441198;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                return new dev.epro.r0.B13598066134827182543(this.v, this.w, this.x, r4833348786910499294, (byte) 0);
            default:
                return new dev.epro.r0.B13598066134827182543(this.v, this.w, this.x, r4833348786910499294, (byte) 1);
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
        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.x;
        java.lang.Object obj2 = this.w;
        dev.epro.r0.L12639328004344855510 l12639328004344855510 = this.v;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l12639328004344855510.invoke(obj2, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                dev.epro.r0.O8620973563946607355.s(w5797197595347441198, new dev.epro.r0.K10842305532776019095());
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    this.u = true;
                    if (l12639328004344855510.invoke(obj2, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                dev.epro.r0.O8620973563946607355.s(w5797197595347441198, new dev.epro.r0.T6443995776615006365());
                break;
        }
        return o9245300239821758723;
    }
}
