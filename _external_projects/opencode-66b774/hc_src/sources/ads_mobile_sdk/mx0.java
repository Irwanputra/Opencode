package ads_mobile_sdk;

import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mx0 extends K14749510448791472029 {
    public Object a;
    public Closeable b;
    public Object c;
    public A18119328133183277592 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tx0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx0(tx0 tx0Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = tx0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
