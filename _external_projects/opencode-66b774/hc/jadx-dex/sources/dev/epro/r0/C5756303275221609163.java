package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C5756303275221609163 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ dev.epro.r0.Q10422068430669049930 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5756303275221609163(dev.epro.r0.Q10422068430669049930 q10422068430669049930, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = q10422068430669049930;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        byte b = this.t;
        dev.epro.r0.Q10422068430669049930 q10422068430669049930 = this.v;
        switch (b) {
            case 0:
                return new dev.epro.r0.C5756303275221609163(q10422068430669049930, r4833348786910499294, (byte) 0);
            case 1:
                return new dev.epro.r0.C5756303275221609163(q10422068430669049930, r4833348786910499294, (byte) 1);
            default:
                return new dev.epro.r0.C5756303275221609163(q10422068430669049930, r4833348786910499294, (byte) 2);
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
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.Q10422068430669049930 q10422068430669049930 = this.v;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    long jC = ((dev.epro.r0.K1865709164992808030) dev.epro.r0.B11964701839924937722.o(q10422068430669049930, dev.epro.r0.Y238707362170117896.t)).c();
                    this.u = true;
                    if (dev.epro.r0.J8045362843799184672.I(jC, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                dev.epro.r0.B13729205492206812220 b13729205492206812220 = q10422068430669049930.K;
                if (b13729205492206812220 != null) {
                    b13729205492206812220.invoke();
                }
                if (q10422068430669049930.L) {
                    ((dev.epro.r0.D1743966822371805936) ((dev.epro.r0.I16162375839174538453) dev.epro.r0.B11964701839924937722.o(q10422068430669049930, dev.epro.r0.Y238707362170117896.l))).a(0);
                }
                q10422068430669049930.S = true;
                dev.epro.r0.X7175349259954592591 x7175349259954592591 = q10422068430669049930.Q;
                if (x7175349259954592591 != null) {
                    x7175349259954592591.c((java.util.concurrent.CancellationException) null);
                }
                q10422068430669049930.Q = null;
                q10422068430669049930.P = null;
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    long jC2 = ((dev.epro.r0.K1865709164992808030) dev.epro.r0.B11964701839924937722.o(q10422068430669049930, dev.epro.r0.Y238707362170117896.t)).c();
                    this.u = true;
                    if (dev.epro.r0.J8045362843799184672.I(jC2, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                dev.epro.r0.B13729205492206812220 b137292054922068122202 = q10422068430669049930.K;
                if (b137292054922068122202 != null) {
                    b137292054922068122202.invoke();
                }
                if (q10422068430669049930.L) {
                    ((dev.epro.r0.D1743966822371805936) ((dev.epro.r0.I16162375839174538453) dev.epro.r0.B11964701839924937722.o(q10422068430669049930, dev.epro.r0.Y238707362170117896.l))).a(0);
                }
                q10422068430669049930.Z = true;
                dev.epro.r0.X7175349259954592591 x71753492599545925912 = q10422068430669049930.X;
                if (x71753492599545925912 != null) {
                    x71753492599545925912.c((java.util.concurrent.CancellationException) null);
                }
                q10422068430669049930.X = null;
                q10422068430669049930.W = null;
                break;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    long jC3 = ((dev.epro.r0.K1865709164992808030) dev.epro.r0.B11964701839924937722.o(q10422068430669049930, dev.epro.r0.Y238707362170117896.t)).c();
                    this.u = true;
                    if (dev.epro.r0.J8045362843799184672.I(jC3, this) == z3437138737604933638) {
                    }
                } else if (!z3) {
                    dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    dev.epro.r0.E17665849472693074628.k(obj);
                }
                dev.epro.r0.B13729205492206812220 b137292054922068122203 = q10422068430669049930.K;
                if (b137292054922068122203 != null) {
                    b137292054922068122203.invoke();
                }
                break;
        }
        return o9245300239821758723;
    }
}
