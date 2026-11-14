package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D9734197463427655843 {
    public final dev.epro.r0.L12639328004344855510 a;
    public final /* synthetic */ byte b;

    public D9734197463427655843(dev.epro.r0.L12639328004344855510 l12639328004344855510, byte b) {
        this.b = b;
        this.a = l12639328004344855510;
    }

    public final float a(float f, dev.epro.r0.B1029012102904255937 b1029012102904255937, dev.epro.r0.B1029012102904255937 b10290121029042559372) {
        switch (this.b) {
            case 0:
                return java.lang.Float.intBitsToFloat((int) (b10290121029042559372.r(b1029012102904255937, (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(((int) (b1029012102904255937.N() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return java.lang.Float.intBitsToFloat((int) (b10290121029042559372.r(b1029012102904255937, (((long) java.lang.Float.floatToRawIntBits(((int) (b1029012102904255937.N() & 4294967295L)) / 2.0f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
