package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 extends K14749510448791472029 {
    public pe2 a;
    public Object b;
    public Closeable c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pe2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd2(pe2 pe2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = pe2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return pe2.a(this.f, (qc2) null, false, (K14749510448791472029) this);
    }
}
