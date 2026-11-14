package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R8015591507171738907;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 extends K14749510448791472029 {
    public rr1 a;
    public R8015591507171738907 b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rr1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr1(rr1 rr1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = rr1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return rr1.a(this.e, false, (K14749510448791472029) this);
    }
}
