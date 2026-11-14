package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B282338272063391593 extends K14749510448791472029 {
    public A8827556657263063407 t;
    public /* synthetic */ Object u;
    public final /* synthetic */ G6219617120344415229 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B282338272063391593(G6219617120344415229 g6219617120344415229, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = g6219617120344415229;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
