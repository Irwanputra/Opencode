package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B13067121461607380805 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ E17523205116624666034 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B13067121461607380805(E17523205116624666034 e17523205116624666034, int i, int i2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = e17523205116624666034;
        this.u = i;
        this.v = i2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new B13067121461607380805(this.t, this.u, this.v, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        B13067121461607380805 b13067121461607380805 = (B13067121461607380805) create((R4833348786910499294) obj2, (A7868207189447841291) obj);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        b13067121461607380805.invokeSuspend(o9245300239821758723);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        E17665849472693074628.k(obj);
        this.t.l(this.u, this.v, true);
        return O9245300239821758723.a;
    }
}
