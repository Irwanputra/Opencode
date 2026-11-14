package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class og2 extends K14749510448791472029 {
    public rg2 a;
    public H15186625828076266306 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ rg2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(rg2 rg2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.d = rg2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return rg2.a(this.d, this);
    }
}
