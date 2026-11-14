package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I14575309304694854612 implements V15138624659649446319 {
    public final float a;

    public I14575309304694854612(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.V15138624659649446319
    public final float a(float f) {
        return f / this.a;
    }

    @Override // dev.epro.r0.V15138624659649446319
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I14575309304694854612) && Float.compare(this.a, ((I14575309304694854612) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}
