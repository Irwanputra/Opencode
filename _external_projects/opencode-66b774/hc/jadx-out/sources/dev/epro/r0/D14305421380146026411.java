package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D14305421380146026411 implements T12706830675561353559, Iterable, D14639766352081121636 {
    public final char a;
    public final char b;

    static {
        new D14305421380146026411((char) 1, (char) 0);
    }

    public D14305421380146026411(char c, char c2) {
        this.a = c;
        this.b = (char) T18016951143603335921.P(c, c2, 1);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable a() {
        return Character.valueOf(this.a);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable b() {
        return Character.valueOf(this.b);
    }

    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D14305421380146026411)) {
            return false;
        }
        if (isEmpty() && ((D14305421380146026411) obj).isEmpty()) {
            return true;
        }
        D14305421380146026411 d14305421380146026411 = (D14305421380146026411) obj;
        return this.a == d14305421380146026411.a && this.b == d14305421380146026411.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new B18200714887958713206(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
