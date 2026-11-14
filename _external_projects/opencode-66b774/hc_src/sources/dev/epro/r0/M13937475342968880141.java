package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M13937475342968880141 {
    public final float a;
    public final float b;

    public M13937475342968880141(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M13937475342968880141)) {
            return false;
        }
        M13937475342968880141 m13937475342968880141 = (M13937475342968880141) obj;
        return Float.compare(this.a, m13937475342968880141.a) == 0 && Float.compare(this.b, m13937475342968880141.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ")";
    }
}
