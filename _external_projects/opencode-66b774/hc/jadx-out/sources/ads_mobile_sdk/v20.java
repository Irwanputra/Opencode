package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class v20 extends K14749510448791472029 {
    public w20 a;
    public CronetEngine.Builder b;
    public Long c;
    public CronetEngine.Builder d;
    public /* synthetic */ Object e;
    public final /* synthetic */ w20 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(w20 w20Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = w20Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return w20.a(this.f, (CronetEngine.Builder) null, (Long) null, this);
    }
}
