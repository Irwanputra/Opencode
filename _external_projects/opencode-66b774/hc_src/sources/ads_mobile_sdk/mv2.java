package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mv2 extends K14749510448791472029 {
    public qv2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qv2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv2(qv2 qv2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = qv2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
