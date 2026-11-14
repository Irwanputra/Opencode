package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class a23 extends K14749510448791472029 {
    public e23 a;
    public H15186625828076266306 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e23 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a23(e23 e23Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.d = e23Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return e23.a(this.d, this);
    }
}
