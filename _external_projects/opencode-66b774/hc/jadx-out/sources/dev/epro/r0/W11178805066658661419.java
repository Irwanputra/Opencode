package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W11178805066658661419 implements T12706830675561353559 {
    public final float a;

    public W11178805066658661419(float f) {
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable a() {
        return Float.valueOf(0.0f);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final Comparable b() {
        return Float.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof W11178805066658661419) {
            return (isEmpty() && ((W11178805066658661419) obj).isEmpty()) || this.a == ((W11178805066658661419) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.a) + (Float.hashCode(0.0f) * 31);
    }

    @Override // dev.epro.r0.T12706830675561353559
    public final boolean isEmpty() {
        return 0.0f > this.a;
    }

    public final String toString() {
        return "0.0.." + this.a;
    }
}
