package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I6314982785989584584 implements M7586588299491030525, Iterable, D14639766352081121636 {
    public final E1092155023341394263 a;
    public final int b;
    public final int c;

    public I6314982785989584584(E1092155023341394263 e1092155023341394263, int i, int i2) {
        this.a = e1092155023341394263;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I6314982785989584584)) {
            return false;
        }
        I6314982785989584584 i6314982785989584584 = (I6314982785989584584) obj;
        return i6314982785989584584.b == this.b && i6314982785989584584.c == this.c && i6314982785989584584.a == this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        E1092155023341394263 e1092155023341394263 = this.a;
        if (e1092155023341394263.h != this.c) {
            S13318420980680640021.e();
        }
        int i = this.b;
        e1092155023341394263.m(i);
        return new I16462844543477289135(e1092155023341394263, i + 1, e1092155023341394263.a[(i * 5) + 3] + i);
    }
}
