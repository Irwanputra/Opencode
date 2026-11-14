package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B13067121461607380805 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ dev.epro.r0.E17523205116624666034 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B13067121461607380805(dev.epro.r0.E17523205116624666034 e17523205116624666034, int i, int i2, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = e17523205116624666034;
        this.u = i;
        this.v = i2;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        return new dev.epro.r0.B13067121461607380805(this.t, this.u, this.v, r4833348786910499294);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dev.epro.r0.B13067121461607380805 b13067121461607380805Create = create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.A7868207189447841291) obj);
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        b13067121461607380805Create.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.E17665849472693074628.k(obj);
        this.t.l(this.u, this.v, true);
        return dev.epro.r0.O9245300239821758723.a;
    }
}
