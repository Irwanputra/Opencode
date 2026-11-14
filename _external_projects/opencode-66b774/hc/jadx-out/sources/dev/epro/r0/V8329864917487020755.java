package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V8329864917487020755 implements Iterator, D14639766352081121636 {
    public final Iterator a;
    public final /* synthetic */ B2664082256516729321 b;

    public V8329864917487020755(B2664082256516729321 b2664082256516729321) {
        this.b = b2664082256516729321;
        this.a = ((U16443665883761795894) b2664082256516729321.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.b.c.invoke(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
