package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xj1 extends K14749510448791472029 {
    public List a;
    public Executor b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zj1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(zj1 zj1Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.d = zj1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((List) null, (Executor) null, this);
    }
}
