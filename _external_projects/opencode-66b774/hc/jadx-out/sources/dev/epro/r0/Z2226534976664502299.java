package dev.epro.r0;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Z2226534976664502299 extends U1864172318023436692 implements ListIterator {
    public final int e;
    public int f;

    public Z2226534976664502299(int i, int i2) {
        super((byte) 0);
        U15853425786981391261.A(i2, i);
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

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
