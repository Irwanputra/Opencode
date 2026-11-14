package dev.epro.r0;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N985323811900954496 extends U1864172318023436692 implements ListIterator {
    public final int e;
    public int f;
    public final J13319129656433893658 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N985323811900954496(J13319129656433893658 j13319129656433893658, int i) {
        super((byte) 4);
        int size = j13319129656433893658.size();
        P1789376955961125859.n(i, size);
        this.e = size;
        this.f = i;
        this.g = j13319129656433893658;
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
