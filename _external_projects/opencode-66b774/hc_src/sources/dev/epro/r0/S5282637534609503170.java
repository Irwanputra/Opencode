package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class S5282637534609503170 {
    public final G5298154673482189769 a;
    public final G5298154673482189769 b;
    public final G5298154673482189769 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public S5282637534609503170(dev.epro.r0.G5298154673482189769 r10, dev.epro.r0.G5298154673482189769 r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = dev.epro.r0.R7033599853981556291.v(r0, r2)
            if (r0 == 0) goto L12
            dev.epro.r0.G5298154673482189769 r0 = dev.epro.r0.A10225670138084435446.s(r10)
            goto L13
        L12:
            r0 = r10
        L13:
            long r4 = r11.b
            boolean r1 = dev.epro.r0.R7033599853981556291.v(r4, r2)
            if (r1 == 0) goto L20
            dev.epro.r0.G5298154673482189769 r1 = dev.epro.r0.A10225670138084435446.s(r11)
            goto L21
        L20:
            r1 = r11
        L21:
            float[] r4 = dev.epro.r0.C9869900372345142877.g
            r5 = 3
            r6 = 0
            if (r12 != r5) goto L6d
            long r7 = r10.b
            boolean r12 = dev.epro.r0.R7033599853981556291.v(r7, r2)
            long r7 = r11.b
            boolean r2 = dev.epro.r0.R7033599853981556291.v(r7, r2)
            if (r12 == 0) goto L38
            if (r2 == 0) goto L38
            goto L6d
        L38:
            if (r12 != 0) goto L3c
            if (r2 == 0) goto L6d
        L3c:
            if (r12 == 0) goto L3f
            goto L40
        L3f:
            r10 = r11
        L40:
            dev.epro.r0.H8745424616867554108 r10 = (dev.epro.r0.H8745424616867554108) r10
            dev.epro.r0.Q9435736031653407531 r10 = r10.d
            if (r12 == 0) goto L4b
            float[] r12 = r10.a()
            goto L4c
        L4b:
            r12 = r4
        L4c:
            if (r2 == 0) goto L52
            float[] r4 = r10.a()
        L52:
            r10 = 0
            r2 = r12[r10]
            r3 = r4[r10]
            float r2 = r2 / r3
            r3 = 1
            r6 = r12[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r12 = r12[r7]
            r4 = r4[r7]
            float r12 = r12 / r4
            float[] r4 = new float[r5]
            r4[r10] = r2
            r4[r3] = r6
            r4[r7] = r12
            r6 = r4
        L6d:
            r9.<init>(r11, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S5282637534609503170.<init>(dev.epro.r0.G5298154673482189769, dev.epro.r0.G5298154673482189769, int):void");
    }

    public long a(long j) {
        float g = U10174709222559481877.g(j);
        float f = U10174709222559481877.f(j);
        float d = U10174709222559481877.d(j);
        float c = U10174709222559481877.c(j);
        G5298154673482189769 g5298154673482189769 = this.b;
        long d2 = g5298154673482189769.d(g, f, d);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e = g5298154673482189769.e(g, f, d);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e, c, this.a);
    }

    public S5282637534609503170(G5298154673482189769 g5298154673482189769, G5298154673482189769 g52981546734821897692, G5298154673482189769 g52981546734821897693, float[] fArr) {
        this.a = g5298154673482189769;
        this.b = g52981546734821897692;
        this.c = g52981546734821897693;
        this.d = fArr;
    }
}
