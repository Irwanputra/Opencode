package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O15325915191532773338 extends K14749510448791472029 {
    public /* synthetic */ Object t;
    public final /* synthetic */ H17686692708284905246 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O15325915191532773338(H17686692708284905246 h17686692708284905246, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.u = h17686692708284905246;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objG = H17686692708284905246.G(this.u, this);
        return objG == Z3437138737604933638.a ? objG : new M7349931961628075932(objG);
    }
}
