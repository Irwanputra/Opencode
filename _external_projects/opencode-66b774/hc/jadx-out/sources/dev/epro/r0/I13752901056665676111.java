package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I13752901056665676111 extends Z13251062865217617579 {
    public float a;

    public I13752901056665676111(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void d() {
        this.a = 0.0f;
    }

    @Override // dev.epro.r0.Z13251062865217617579
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof I13752901056665676111) && ((I13752901056665676111) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
