package dev.epro.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class U15449479119970716863 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public int u;
    public final /* synthetic */ T3328134245249980208 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U15449479119970716863(T3328134245249980208 t3328134245249980208, R4833348786910499294 r4833348786910499294) {
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
