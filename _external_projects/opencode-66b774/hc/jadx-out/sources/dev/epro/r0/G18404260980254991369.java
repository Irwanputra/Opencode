package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G18404260980254991369 extends Z13251062865217617579 {
    public float a;
    public float b;

    public G18404260980254991369(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final int b() {
        return 2;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final Z13251062865217617579 c() {
        return new G18404260980254991369(0.0f, 0.0f);
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G18404260980254991369)) {
            return false;
        }
        G18404260980254991369 g18404260980254991369 = (G18404260980254991369) obj;
        return g18404260980254991369.a == this.a && g18404260980254991369.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
