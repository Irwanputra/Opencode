package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class s62 extends K14749510448791472029 {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w62 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s62(w62 w62Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.d = w62Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return w62.d(this.d, this);
    }
}
