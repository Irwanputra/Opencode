package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.V3131360009326842010;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class n00 extends K14749510448791472029 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(k00 k00Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.b = k00Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a((V3131360009326842010) null, this);
    }
}
