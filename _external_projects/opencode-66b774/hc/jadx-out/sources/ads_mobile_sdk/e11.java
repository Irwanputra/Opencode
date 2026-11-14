package ads_mobile_sdk;

import dev.epro.r0.G842859980338292746;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5458285210510848811;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class e11 extends K14749510448791472029 {
    public h11 a;
    public Object b;
    public Object c;
    public Object d;
    public UUID e;
    public boolean f;
    public boolean g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ h11 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e11(h11 h11Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.j = h11Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a((G842859980338292746) null, (K5458285210510848811) null, false, (y11) null, false, (K14749510448791472029) this);
    }
}
