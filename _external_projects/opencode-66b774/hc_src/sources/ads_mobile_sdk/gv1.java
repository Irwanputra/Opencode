package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class gv1 extends K14749510448791472029 {
    public iv1 a;
    public zu1 b;
    public H15186625828076266306 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iv1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv1(iv1 iv1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = iv1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this, false);
    }
}
