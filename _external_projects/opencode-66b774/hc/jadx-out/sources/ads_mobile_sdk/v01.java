package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.P10917817599008460069;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v01 extends K14749510448791472029 {
    public h11 a;
    public P10917817599008460069 b;
    public UUID c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v01(h11 h11Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = h11Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((P10917817599008460069) null, (UUID) null, this);
    }
}
