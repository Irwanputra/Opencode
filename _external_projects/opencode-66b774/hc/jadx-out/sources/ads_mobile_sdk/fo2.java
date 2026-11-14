package ads_mobile_sdk;

import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M16184408391440927034;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S7864201625552763331;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fo2 extends K14749510448791472029 {
    public /* synthetic */ Object a;
    public int b;
    public S7864201625552763331 c;
    public final /* synthetic */ go2 d;
    public Object e;
    public M16184408391440927034 f;
    public F11004654978627682545 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo2(go2 go2Var, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.d = go2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
