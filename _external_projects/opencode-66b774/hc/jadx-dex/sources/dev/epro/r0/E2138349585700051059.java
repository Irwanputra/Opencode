package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E2138349585700051059 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ java.lang.Object v;
    public final /* synthetic */ dev.epro.r0.B13729205492206812220 w;
    public final /* synthetic */ dev.epro.r0.L12639328004344855510 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E2138349585700051059(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = b13729205492206812220;
        this.x = l12639328004344855510;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        switch (this.t) {
            case 0:
                dev.epro.r0.E2138349585700051059 e2138349585700051059 = new dev.epro.r0.E2138349585700051059(this.w, this.x, r4833348786910499294, (byte) 0);
                e2138349585700051059.v = obj;
                return e2138349585700051059;
            default:
                dev.epro.r0.E2138349585700051059 e21383495857000510592 = new dev.epro.r0.E2138349585700051059(this.w, this.x, r4833348786910499294, (byte) 1);
                e21383495857000510592.v = obj;
                return e21383495857000510592;
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
        dev.epro.r0.L12639328004344855510 l12639328004344855510 = this.x;
        dev.epro.r0.B13729205492206812220 b13729205492206812220 = this.w;
        dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    dev.epro.r0.E17665849472693074628.k(obj);
                    dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) this.v;
                    dev.epro.r0.A7209497065939201693 a7209497065939201693 = new dev.epro.r0.A7209497065939201693();
                    dev.epro.r0.G6219617120344415229 g6219617120344415229P = dev.epro.r0.J10256772239794345968.p(b13729205492206812220);
                    dev.epro.r0.R13526995929154542742 r13526995929154542742 = new dev.epro.r0.R13526995929154542742(a7209497065939201693, w5797197595347441198, l12639328004344855510, (byte) 0);
                    this.u = true;
                    if (g6219617120344415229P.collect(r13526995929154542742, this) == z3437138737604933638) {
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
                    dev.epro.r0.W5797197595347441198 w57971975953474411982 = (dev.epro.r0.W5797197595347441198) this.v;
                    dev.epro.r0.A7209497065939201693 a72094970659392016932 = new dev.epro.r0.A7209497065939201693();
                    dev.epro.r0.G6219617120344415229 g6219617120344415229P2 = dev.epro.r0.J10256772239794345968.p(b13729205492206812220);
                    dev.epro.r0.R13526995929154542742 r135269959291545427422 = new dev.epro.r0.R13526995929154542742(a72094970659392016932, w57971975953474411982, l12639328004344855510, (byte) 1);
                    this.u = true;
                    if (g6219617120344415229P2.collect(r135269959291545427422, this) == z3437138737604933638) {
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
