package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.W15082408677311432558;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class l32 extends K14749510448791472029 {
    public Object a;
    public Object b;
    public Closeable c;
    public P3477296814990354048 d;
    public th3 e;
    public th3 f;
    public W15082408677311432558 g;
    public long h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ p32 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l32(p32 p32Var, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.k = p32Var;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return p32.b(this.k, this);
    }
}
