package ads_mobile_sdk;

import dev.epro.r0.I1581330382723795749;
import dev.epro.r0.K14749510448791472029;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class w01 extends K14749510448791472029 {
    public h11 a;
    public I1581330382723795749 b;
    public I1581330382723795749 c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ h11 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(h11 h11Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = h11Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a((String) null, (Map) null, this);
    }
}
