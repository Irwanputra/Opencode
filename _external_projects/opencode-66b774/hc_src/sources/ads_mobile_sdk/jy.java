package ads_mobile_sdk;

import dev.epro.r0.K14749510448791472029;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jy extends K14749510448791472029 {
    public Exception a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy(fz fzVar, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.c = fzVar;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((Exception) null, this);
    }
}
