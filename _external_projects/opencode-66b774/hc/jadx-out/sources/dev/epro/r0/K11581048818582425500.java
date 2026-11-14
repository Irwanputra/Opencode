package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K11581048818582425500 extends M458157582077333589 {
    public final float c;
    public final float d;

    public K11581048818582425500(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K11581048818582425500)) {
            return false;
        }
        K11581048818582425500 k11581048818582425500 = (K11581048818582425500) obj;
        return Float.compare(this.c, k11581048818582425500.c) == 0 && Float.compare(this.d, k11581048818582425500.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "MoveTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
