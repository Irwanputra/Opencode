package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T10255414283460940890 {
    public static final T10255414283460940890 c = new T10255414283460940890(1.0f, 0.0f);
    public final float a;
    public final float b;

    public T10255414283460940890(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T10255414283460940890)) {
            return false;
        }
        T10255414283460940890 t10255414283460940890 = (T10255414283460940890) obj;
        return this.a == t10255414283460940890.a && this.b == t10255414283460940890.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ")";
    }
}
