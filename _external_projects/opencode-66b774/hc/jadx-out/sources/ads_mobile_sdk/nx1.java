package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R4833348786910499294;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends K14749510448791472029 {
    public ox1 a;
    public Map b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ox1 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(ox1 ox1Var, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.d = ox1Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
