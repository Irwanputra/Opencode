package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K2139607335583824538 {
    public short a;
    public short b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        if (j < this.e) {
            return 0.0f;
        }
        long j2 = this.g;
        if (j2 < 0 || j < j2) {
            return V17114972836633323622.b((j - r0) / this.a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (V17114972836633323622.b((j - j2) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
