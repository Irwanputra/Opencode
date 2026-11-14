package dev.epro.r0;

/* loaded from: classes2.dex */
public final class J1981871723778616356 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ X3403606470472657543 v;
    public Object w;
    public S7864201625552763331 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1981871723778616356(X3403606470472657543 x3403606470472657543, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = x3403606470472657543;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.collect(null, this);
    }
}
