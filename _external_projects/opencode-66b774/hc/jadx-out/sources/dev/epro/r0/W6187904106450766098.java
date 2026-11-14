package dev.epro.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class W6187904106450766098 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ R3229391822211813842 v;
    public R3229391822211813842 w;
    public S7864201625552763331 x;
    public A8827556657263063407 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6187904106450766098(R3229391822211813842 r3229391822211813842, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = r3229391822211813842;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
