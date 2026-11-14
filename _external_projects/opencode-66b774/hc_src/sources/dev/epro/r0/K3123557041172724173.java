package dev.epro.r0;

import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K3123557041172724173 extends U1864172318023436692 implements ListIterator {
    public final int e;
    public int f;
    public final Z8594524026390833435 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3123557041172724173(Z8594524026390833435 z8594524026390833435, int i) {
        super((byte) 3);
        int size = z8594524026390833435.size();
        if (i < 0 || i > size) {
            W4415201450379021245.a(E10717724117948616506.s(i, size, "index"));
            throw null;
        }
        this.e = size;
        this.f = i;
        this.g = z8594524026390833435;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.g.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f > 0;
    }

    @Override // dev.epro.r0.U1864172318023436692, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.f;
        this.f = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            Z3383101362411723454.u();
            return null;
        }
        int i = this.f - 1;
        this.f = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
