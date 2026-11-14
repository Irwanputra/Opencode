package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.R8015591507171738907;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends K14749510448791472029 {
    public fb2 a;
    public z1 b;
    public M16184408391440927034 c;
    public R8015591507171738907 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fb2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb2(fb2 fb2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = fb2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return fb2.a(this.f, this);
    }
}
