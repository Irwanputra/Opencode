package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.E6758797890281795541;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class f03 extends K14749510448791472029 {
    public i03 a;
    public Object b;
    public H15186625828076266306 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i03 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f03(i03 i03Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = i03Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((Bundle) null, (Bundle) null, (E6758797890281795541) null, (String) null, (String) null, this);
    }
}
