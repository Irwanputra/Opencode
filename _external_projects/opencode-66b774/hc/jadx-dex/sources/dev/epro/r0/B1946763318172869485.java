package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B1946763318172869485 implements dev.epro.r0.T12706830675561353559, java.lang.Iterable, dev.epro.r0.D14639766352081121636 {
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

    public final java.lang.Comparable a() {
        return java.lang.Long.valueOf(this.a);
    }

    public final java.lang.Comparable b() {
        return java.lang.Long.valueOf(this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.B1946763318172869485)) {
            return false;
        }
        if (isEmpty() && ((dev.epro.r0.B1946763318172869485) obj).isEmpty()) {
            return true;
        }
        dev.epro.r0.B1946763318172869485 b1946763318172869485 = (dev.epro.r0.B1946763318172869485) obj;
        return this.a == b1946763318172869485.a && this.b == b1946763318172869485.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return java.lang.Long.hashCode(this.b) + (java.lang.Long.hashCode(this.a) * 31);
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dev.epro.r0.M15721570175176789799(this.a, this.b);
    }

    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
