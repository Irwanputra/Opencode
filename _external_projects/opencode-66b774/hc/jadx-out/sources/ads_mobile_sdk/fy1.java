package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.R6320827706769103704;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 extends K14749510448791472029 {
    public R6320827706769103704 a;
    public th3 b;
    public Closeable c;
    public tx0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ R6320827706769103704 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy1(R6320827706769103704 r6320827706769103704, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = r6320827706769103704;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return R6320827706769103704.a(this.f, null, this);
    }
}
