package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 extends K14749510448791472029 {
    public tx0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xy1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(xy1 xy1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = xy1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return xy1.a(this.c, null, this);
    }
}
