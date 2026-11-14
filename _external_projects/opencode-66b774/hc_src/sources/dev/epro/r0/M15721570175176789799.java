package dev.epro.r0;

import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M15721570175176789799 implements Iterator, D14639766352081121636 {
    public final long a;
    public boolean b;
    public long c;

    public M15721570175176789799(long j, long j2) {
        this.a = j2;
        boolean z = j <= j2;
        this.b = z;
        this.c = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.c;
        if (j != this.a) {
            this.c = 1 + j;
        } else {
            if (!this.b) {
                Z3383101362411723454.u();
                return null;
            }
            this.b = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
