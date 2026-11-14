package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16462844543477289135 implements Iterator, D14639766352081121636 {
    public final E1092155023341394263 a;
    public final int b;
    public int c;
    public final int d;

    public I16462844543477289135(E1092155023341394263 e1092155023341394263, int i, int i2) {
        this.a = e1092155023341394263;
        this.b = i2;
        this.c = i;
        this.d = e1092155023341394263.h;
        if (e1092155023341394263.g) {
            S13318420980680640021.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        E1092155023341394263 e1092155023341394263 = this.a;
        int i = e1092155023341394263.h;
        int i2 = this.d;
        if (i != i2) {
            S13318420980680640021.e();
        }
        int i3 = this.c;
        this.c = e1092155023341394263.a[(i3 * 5) + 3] + i3;
        return new I6314982785989584584(e1092155023341394263, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
