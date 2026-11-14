package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O11737420808161199786 {

    @O7462376509978667369("is_charging")
    public boolean a;

    @O7462376509978667369("battery_level")
    public double b;

    public O11737420808161199786(int i) {
        this.a = false;
        this.b = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O11737420808161199786)) {
            return false;
        }
        O11737420808161199786 o11737420808161199786 = (O11737420808161199786) obj;
        return this.a == o11737420808161199786.a && Double.compare(this.b, o11737420808161199786.b) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Double.hashCode(this.b) + (r0 * 31);
    }

    public final String toString() {
        return "BatterySignals(isCharging=" + this.a + ", batteryLevel=" + this.b + ")";
    }

    public O11737420808161199786() {
        this(0);
    }
}
