package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D14305421380146026411 implements dev.epro.r0.T12706830675561353559, java.lang.Iterable, dev.epro.r0.D14639766352081121636 {
    public final char a;
    public final char b;

    static {
        new dev.epro.r0.D14305421380146026411((char) 1, (char) 0);
    }

    public D14305421380146026411(char c, char c2) {
        this.a = c;
        this.b = (char) dev.epro.r0.T18016951143603335921.P(c, c2, 1);
    }

    public final java.lang.Comparable a() {
        return java.lang.Character.valueOf(this.a);
    }

    public final java.lang.Comparable b() {
        return java.lang.Character.valueOf(this.b);
    }

    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.D14305421380146026411)) {
            return false;
        }
        if (isEmpty() && ((dev.epro.r0.D14305421380146026411) obj).isEmpty()) {
            return true;
        }
        dev.epro.r0.D14305421380146026411 d14305421380146026411 = (dev.epro.r0.D14305421380146026411) obj;
        return this.a == d14305421380146026411.a && this.b == d14305421380146026411.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dev.epro.r0.B18200714887958713206(this.a, this.b);
    }

    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
