package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P8646985343900033725 extends I12982432556619280823 implements T12706830675561353559 {
    public static final P8646985343900033725 d = new P8646985343900033725(1, 0, 1);

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable a() {
        return Integer.valueOf(this.a);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable b() {
        return Integer.valueOf(this.b);
    }

    public final boolean c(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // dev.epro.r0.I12982432556619280823
    public final boolean equals(Object obj) {
        if (!(obj instanceof P8646985343900033725)) {
            return false;
        }
        if (isEmpty() && ((P8646985343900033725) obj).isEmpty()) {
            return true;
        }
        P8646985343900033725 p8646985343900033725 = (P8646985343900033725) obj;
        return this.a == p8646985343900033725.a && this.b == p8646985343900033725.b;
    }

    @Override // dev.epro.r0.I12982432556619280823
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // dev.epro.r0.I12982432556619280823, dev.epro.r0.T12706830675561353559
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // dev.epro.r0.I12982432556619280823
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
