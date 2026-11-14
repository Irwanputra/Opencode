package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends K14749510448791472029 {
    public fl2 a;
    public Object b;
    public Closeable c;
    public /* synthetic */ Object h;
    public final /* synthetic */ fl2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj2(fl2 fl2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.i = fl2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b((List) null, this);
    }
}
