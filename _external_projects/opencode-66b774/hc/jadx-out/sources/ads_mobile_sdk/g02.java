package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class g02 extends K14749510448791472029 {
    public Object a;
    public Closeable b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h02 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(h02 h02Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = h02Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return h02.a(this.e, this);
    }
}
