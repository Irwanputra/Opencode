package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class S5282637534609503170 {
    public final G5298154673482189769 a;
    public final G5298154673482189769 b;
    public final G5298154673482189769 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public S5282637534609503170(G5298154673482189769 g5298154673482189769, G5298154673482189769 g52981546734821897692, int i) {
        G5298154673482189769 g5298154673482189769S = R7033599853981556291.v(g5298154673482189769.b, 12884901888L) ? A10225670138084435446.s(g5298154673482189769) : g5298154673482189769;
        G5298154673482189769 g5298154673482189769S2 = R7033599853981556291.v(g52981546734821897692.b, 12884901888L) ? A10225670138084435446.s(g52981546734821897692) : g52981546734821897692;
        float[] fArrA = C9869900372345142877.g;
        float[] fArr = null;
        if (i == 3) {
            boolean zV = R7033599853981556291.v(g5298154673482189769.b, 12884901888L);
            boolean zV2 = R7033599853981556291.v(g52981546734821897692.b, 12884901888L);
            if ((!zV || !zV2) && (zV || zV2)) {
                Q9435736031653407531 q9435736031653407531 = ((H8745424616867554108) (zV ? g5298154673482189769 : g52981546734821897692)).d;
                float[] fArrA2 = zV ? q9435736031653407531.a() : fArrA;
                fArrA = zV2 ? q9435736031653407531.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            }
        }
        this(g52981546734821897692, g5298154673482189769S, g5298154673482189769S2, fArr);
    }

    public long a(long j) {
        float fG = U10174709222559481877.g(j);
        float f = U10174709222559481877.f(j);
        float fD = U10174709222559481877.d(j);
        float fC = U10174709222559481877.c(j);
        G5298154673482189769 g5298154673482189769 = this.b;
        long jD = g5298154673482189769.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = g5298154673482189769.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public S5282637534609503170(G5298154673482189769 g5298154673482189769, G5298154673482189769 g52981546734821897692, G5298154673482189769 g52981546734821897693, float[] fArr) {
        this.a = g5298154673482189769;
        this.b = g52981546734821897692;
        this.c = g52981546734821897693;
        this.d = fArr;
    }
}
