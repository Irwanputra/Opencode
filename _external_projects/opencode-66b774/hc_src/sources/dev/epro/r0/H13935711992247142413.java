package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final /* synthetic */ class H13935711992247142413 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;

    public /* synthetic */ H13935711992247142413(float f, long j, byte b) {
        this.a = b;
        this.b = f;
        this.c = j;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        float f = this.b;
        switch (b) {
            case 0:
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                float K = l17598299826319227431.K(f);
                float K2 = l17598299826319227431.K(f) / 2.0f;
                float intBitsToFloat = Float.intBitsToFloat((int) (l17598299826319227431.e() >> 32));
                float K3 = l17598299826319227431.K(f) / 2.0f;
                L17598299826319227431.o(l17598299826319227431, this.c, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(K2) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(K3)), K, 0, 496);
                break;
            default:
                L17598299826319227431 l175982998263192274312 = (L17598299826319227431) obj;
                float K4 = l175982998263192274312.K(f);
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(l175982998263192274312.K(f) / 2.0f) << 32);
                float K5 = l175982998263192274312.K(f) / 2.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (l175982998263192274312.e() & 4294967295L));
                L17598299826319227431.o(l175982998263192274312, this.c, floatToRawIntBits, (Float.floatToRawIntBits(K5) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), K4, 0, 496);
                break;
        }
        return o9245300239821758723;
    }
}
