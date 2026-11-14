package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M16184408391440927034;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class me3 extends K14749510448791472029 {
    public qe3 a;
    public M16184408391440927034 b;
    public Iterator c;
    public String d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ qe3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(qe3 qe3Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.g = qe3Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((ArrayList) null, false, (K14749510448791472029) this);
    }
}
