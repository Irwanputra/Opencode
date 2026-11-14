package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O12043144740933444288;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends K14749510448791472029 {
    public Object a;
    public Closeable b;
    public Object c;
    public Object d;
    public O12043144740933444288 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rf0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(rf0 rf0Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.h = rf0Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
