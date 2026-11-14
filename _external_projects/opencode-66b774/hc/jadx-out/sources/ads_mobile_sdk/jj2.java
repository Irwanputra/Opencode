package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 extends K14749510448791472029 {
    public Object a;
    public Object b;
    public Closeable c;
    public cc2 d;
    public ArrayList e;
    public fl2 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ fl2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj2(fl2 fl2Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.h = fl2Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.r(this);
    }
}
