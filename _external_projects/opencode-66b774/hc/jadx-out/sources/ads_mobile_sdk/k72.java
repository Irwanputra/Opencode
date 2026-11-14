package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class k72 extends K14749510448791472029 {
    public m72 a;
    public Object b;
    public Object c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ m72 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k72(m72 m72Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = m72Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return m72.a(this.f, (tx0) null, false, (K14749510448791472029) this);
    }
}
