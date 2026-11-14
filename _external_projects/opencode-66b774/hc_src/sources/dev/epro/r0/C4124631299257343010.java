package dev.epro.r0;

/* loaded from: classes.dex */
public final class C4124631299257343010 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ K12650811430861268746 v;
    public K12650811430861268746 w;
    public S7864201625552763331 x;
    public Throwable y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4124631299257343010(K12650811430861268746 k12650811430861268746, R4833348786910499294 r4833348786910499294) {
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
