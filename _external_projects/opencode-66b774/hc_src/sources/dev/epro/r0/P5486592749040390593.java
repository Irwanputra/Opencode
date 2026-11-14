package dev.epro.r0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P5486592749040390593 implements U16443665883761795894 {
    public final AtomicReference a;

    public P5486592749040390593(U16443665883761795894 u16443665883761795894) {
        this.a = new AtomicReference(u16443665883761795894);
    }

    @Override // dev.epro.r0.U16443665883761795894
    public final Iterator iterator() {
        U16443665883761795894 u16443665883761795894 = (U16443665883761795894) this.a.getAndSet(null);
        if (u16443665883761795894 != null) {
            return u16443665883761795894.iterator();
        }
        S10973172697741180971.m("This sequence can be consumed only once.");
        return null;
    }
}
