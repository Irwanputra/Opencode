package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I18298706641790652058 extends Z13251062865217617579 {
    public float a;
    public float b;
    public float c;

    public I18298706641790652058(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final int b() {
        return 3;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final Z13251062865217617579 c() {
        return new I18298706641790652058(0.0f, 0.0f, 0.0f);
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof I18298706641790652058)) {
            return false;
        }
        I18298706641790652058 i18298706641790652058 = (I18298706641790652058) obj;
        return i18298706641790652058.a == this.a && i18298706641790652058.b == this.b && i18298706641790652058.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder k = G11450220448113054352.k("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        k.append(f3);
        return k.toString();
    }
}
