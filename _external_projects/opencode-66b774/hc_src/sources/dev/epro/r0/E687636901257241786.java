package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E687636901257241786 extends Z13251062865217617579 {
    public float a;
    public float b;
    public float c;
    public float d;

    public E687636901257241786(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final int b() {
        return 4;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final Z13251062865217617579 c() {
        return new E687636901257241786(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E687636901257241786)) {
            return false;
        }
        E687636901257241786 e687636901257241786 = (E687636901257241786) obj;
        return e687636901257241786.a == this.a && e687636901257241786.b == this.b && e687636901257241786.c == this.c && e687636901257241786.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + E12098517352909843120.e(this.c, E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder k = G11450220448113054352.k("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        k.append(f3);
        k.append(", v4 = ");
        k.append(f4);
        return k.toString();
    }
}
