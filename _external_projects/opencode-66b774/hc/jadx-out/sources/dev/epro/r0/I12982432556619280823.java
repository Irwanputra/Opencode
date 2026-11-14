package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class I12982432556619280823 implements Iterable, D14639766352081121636 {
    public final int a;
    public final int b;
    public final int c;

    public I12982432556619280823(int i, int i2, int i3) {
        if (i3 == 0) {
            S10973172697741180971.j("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            S10973172697741180971.j("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.a = i;
        this.b = T18016951143603335921.P(i, i2, i3);
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof I12982432556619280823)) {
            return false;
        }
        if (isEmpty() && ((I12982432556619280823) obj).isEmpty()) {
            return true;
        }
        I12982432556619280823 i12982432556619280823 = (I12982432556619280823) obj;
        return this.a == i12982432556619280823.a && this.b == i12982432556619280823.b && this.c == i12982432556619280823.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M18282718993909554674(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.a;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
