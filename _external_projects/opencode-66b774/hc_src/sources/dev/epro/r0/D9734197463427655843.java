package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D9734197463427655843 {
    public final L12639328004344855510 a;
    public final /* synthetic */ byte b;

    public D9734197463427655843(L12639328004344855510 l12639328004344855510, byte b) {
        this.b = b;
        this.a = l12639328004344855510;
    }

    public final float a(float f, B1029012102904255937 b1029012102904255937, B1029012102904255937 b10290121029042559372) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat((int) (b10290121029042559372.r(b1029012102904255937, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(((int) (b1029012102904255937.N() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                float N = ((int) (b1029012102904255937.N() & 4294967295L)) / 2.0f;
                return Float.intBitsToFloat((int) (b10290121029042559372.r(b1029012102904255937, (Float.floatToRawIntBits(N) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
