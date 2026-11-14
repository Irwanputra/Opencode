package dev.epro.r0;

/* loaded from: classes.dex */
public final class E512419302172066294 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ T3328134245249980208 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E512419302172066294(T3328134245249980208 t3328134245249980208, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = t3328134245249980208;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.u |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
