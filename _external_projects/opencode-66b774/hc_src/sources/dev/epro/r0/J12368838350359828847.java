package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J12368838350359828847 implements X6460762560403092052 {
    public float a;
    public float b;

    public F15722843472204369899 a(float f) {
        double b = b(f);
        double d = K2580088116821959803.a;
        double d2 = d - 1.0d;
        return new F15722843472204369899(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = L7481895516004165363.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    @Override // dev.epro.r0.X6460762560403092052
    public long g(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float h() {
        return this.a;
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float i(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float j(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // dev.epro.r0.X6460762560403092052
    public float k(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }
}
