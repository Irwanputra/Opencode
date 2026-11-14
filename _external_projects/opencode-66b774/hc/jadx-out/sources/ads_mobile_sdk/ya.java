package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends K14749510448791472029 {
    public sb a;
    public H15186625828076266306 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sb d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(sb sbVar, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.d = sbVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return sb.a$1(this.d, this);
    }
}
