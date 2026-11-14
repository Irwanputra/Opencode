package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class h92 extends K14749510448791472029 {
    public m92 a;
    public Object b;
    public Closeable c;
    public Closeable d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ m92 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h92(m92 m92Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.h = m92Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a((Map) null, false, false, (tx0) null, (K14749510448791472029) this);
    }
}
