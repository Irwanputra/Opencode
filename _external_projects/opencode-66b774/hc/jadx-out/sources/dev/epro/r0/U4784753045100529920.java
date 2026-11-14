package dev.epro.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class U4784753045100529920 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ K12650811430861268746 v;
    public Z10733167746954993267 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4784753045100529920(K12650811430861268746 k12650811430861268746, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = k12650811430861268746;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
