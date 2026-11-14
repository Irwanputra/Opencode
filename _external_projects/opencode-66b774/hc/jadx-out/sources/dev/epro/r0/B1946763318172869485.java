package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B1946763318172869485 implements T12706830675561353559, Iterable, D14639766352081121636 {
    public final long a;
    public final long b;

    public B1946763318172869485(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable a() {
        return Long.valueOf(this.a);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable b() {
        return Long.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B1946763318172869485)) {
            return false;
        }
        if (isEmpty() && ((B1946763318172869485) obj).isEmpty()) {
            return true;
        }
        B1946763318172869485 b1946763318172869485 = (B1946763318172869485) obj;
        return this.a == b1946763318172869485.a && this.b == b1946763318172869485.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M15721570175176789799(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
