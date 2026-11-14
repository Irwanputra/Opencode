package dev.epro.r0;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P8408614107071943981 extends K14749510448791472029 {
    public Serializable t;
    public Iterator u;
    public /* synthetic */ Object v;
    public final /* synthetic */ M10846389789027735899 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P8408614107071943981(M10846389789027735899 m10846389789027735899, K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.w = m10846389789027735899;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.m(null, null, this);
    }
}
