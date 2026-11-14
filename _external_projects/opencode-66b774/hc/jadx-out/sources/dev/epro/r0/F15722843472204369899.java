package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F15722843472204369899 {
    public final float a;
    public final float b;
    public final long c;

    public F15722843472204369899(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F15722843472204369899)) {
            return false;
        }
        F15722843472204369899 f15722843472204369899 = (F15722843472204369899) obj;
        return Float.compare(this.a, f15722843472204369899.a) == 0 && Float.compare(this.b, f15722843472204369899.b) == 0 && this.c == f15722843472204369899.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return L11610354117192841236.p(this.c, ")", G11450220448113054352.k("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration="));
    }
}
