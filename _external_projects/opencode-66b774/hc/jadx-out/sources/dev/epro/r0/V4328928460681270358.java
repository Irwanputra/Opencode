package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V4328928460681270358 implements I5573661370475160895 {
    public static final V4328928460681270358 b = new V4328928460681270358(0);
    public static final V4328928460681270358 c = new V4328928460681270358(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ V4328928460681270358(byte b2) {
        this.a = b2;
    }

    @Override // dev.epro.r0.I5573661370475160895
    public final J8045362843799184672 a(long j, F10342546226345611902 f10342546226345611902, R8540738700654750557 r8540738700654750557) {
        switch (this.a) {
            case 0:
                float fG0 = r8540738700654750557.g0(30.0f);
                return new K10859651572364480586(new S6349823729575121924(0.0f, -fG0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fG0));
            case 1:
                float fG02 = r8540738700654750557.g0(30.0f);
                return new K10859651572364480586(new S6349823729575121924(-fG02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fG02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new K10859651572364480586(E2166724654553415323.a(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
