package dev.epro.r0;

import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E17816138915091423919 extends Z1085125311131623997 implements ListIterator {
    public final /* synthetic */ L17338558938414325155 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E17816138915091423919(L17338558938414325155 l17338558938414325155, int i) {
        super(l17338558938414325155, (byte) 0);
        this.d = l17338558938414325155;
        int a = l17338558938414325155.a();
        if (i < 0 || i > a) {
            W4415201450379021245.a(E12098517352909843120.l("index: ", i, a, ", size: "));
            throw null;
        }
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
