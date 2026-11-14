package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class vj extends K14749510448791472029 {
    public wj a;
    public H15186625828076266306 b;
    public /* synthetic */ Object d;
    public final /* synthetic */ wj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(wj wjVar, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = wjVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return wj.a(this.e, this);
    }
}
