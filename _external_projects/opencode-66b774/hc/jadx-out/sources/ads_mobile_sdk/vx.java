package ads_mobile_sdk;

import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.K14749510448791472029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vx extends K14749510448791472029 {
    public fz a;
    public H15186625828076266306 b;
    public F14240031463097426304 c;
    public F14240031463097426304 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fz f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(fz fzVar, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = fzVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return fz.d(this.f, this);
    }
}
