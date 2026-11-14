package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class x01 extends K14749510448791472029 {
    public Object a;
    public Object b;
    public /* synthetic */ Object d;
    public final /* synthetic */ h11 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(h11 h11Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = h11Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((URL) null, (bn0) null, this);
    }
}
