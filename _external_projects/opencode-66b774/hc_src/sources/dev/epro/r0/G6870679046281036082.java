package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G6870679046281036082 implements Iterator {
    public final Iterator a;
    public final Iterator b;

    public G6870679046281036082(Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.a;
        return it.hasNext() ? it.next() : this.b.next();
    }
}
