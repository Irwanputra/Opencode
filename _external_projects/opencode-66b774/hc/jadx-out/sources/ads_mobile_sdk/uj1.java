package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 extends K14749510448791472029 {
    public zj1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zj1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj1(zj1 zj1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = zj1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return zj1.a(this.c, (String) null, this);
    }
}
