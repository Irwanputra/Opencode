package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f82 extends K14749510448791472029 {
    public i82 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i82 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f82(i82 i82Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = i82Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return i82.d(this.c, this);
    }
}
