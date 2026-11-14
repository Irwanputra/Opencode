package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U679519544199163004 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ Z10733167746954993267 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U679519544199163004(Z10733167746954993267 z10733167746954993267, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = z10733167746954993267;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
