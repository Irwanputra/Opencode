package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a02 extends K14749510448791472029 {
    public b02 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b02 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a02(b02 b02Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = b02Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return b02.b(this.c, this);
    }
}
