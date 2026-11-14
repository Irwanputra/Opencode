package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O9245300239821758723;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class y70 extends K14749510448791472029 {
    public /* synthetic */ Object b;
    public final /* synthetic */ e80 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(e80 e80Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = e80Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        e80.a(this.c, this);
        return O9245300239821758723.a;
    }
}
