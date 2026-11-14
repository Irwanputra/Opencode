package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H8745424616867554108 extends G5298154673482189769 {
    public static final K2042933864045806308 r = new K2042933864045806308(0);
    public final Q9435736031653407531 d;
    public final float e;
    public final float f;
    public final P4785861829097979576 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final Q12717119941057887287 k;
    public final D8340673431449205037 l;
    public final F12101231409752321762 m;
    public final Q12717119941057887287 n;

    /* renamed from: o, reason: collision with root package name */
    public final D8340673431449205037 f278o;
    public final F12101231409752321762 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01df, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H8745424616867554108(java.lang.String r36, float[] r37, dev.epro.r0.Q9435736031653407531 r38, float[] r39, dev.epro.r0.Q12717119941057887287 r40, dev.epro.r0.Q12717119941057887287 r41, float r42, float r43, dev.epro.r0.P4785861829097979576 r44, int r45) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H8745424616867554108.<init>(java.lang.String, float[], dev.epro.r0.Q9435736031653407531, float[], dev.epro.r0.Q12717119941057887287, dev.epro.r0.Q12717119941057887287, float, float, dev.epro.r0.P4785861829097979576, int):void");
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float a(int i) {
        return this.f;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float b(int i) {
        return this.e;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final boolean c() {
        return this.q;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final long d(float f, float f2, float f3) {
        double d = f;
        F12101231409752321762 f12101231409752321762 = this.p;
        float g = (float) f12101231409752321762.g(d);
        float g2 = (float) f12101231409752321762.g(f2);
        float g3 = (float) f12101231409752321762.g(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * g3) + (fArr[3] * g2) + (fArr[0] * g);
        float f5 = (fArr[7] * g3) + (fArr[4] * g2) + (fArr[1] * g);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final float e(float f, float f2, float f3) {
        double d = f;
        F12101231409752321762 f12101231409752321762 = this.p;
        float g = (float) f12101231409752321762.g(d);
        float g2 = (float) f12101231409752321762.g(f2);
        float g3 = (float) f12101231409752321762.g(f3);
        float[] fArr = this.i;
        return (fArr[8] * g3) + (fArr[5] * g2) + (fArr[2] * g);
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H8745424616867554108.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        H8745424616867554108 h8745424616867554108 = (H8745424616867554108) obj;
        if (Float.compare(h8745424616867554108.e, this.e) != 0 || Float.compare(h8745424616867554108.f, this.f) != 0 || !S10823041268949770285.t(this.d, h8745424616867554108.d) || !Arrays.equals(this.h, h8745424616867554108.h)) {
            return false;
        }
        P4785861829097979576 p4785861829097979576 = h8745424616867554108.g;
        P4785861829097979576 p47858618290979795762 = this.g;
        if (p47858618290979795762 != null) {
            return S10823041268949770285.t(p47858618290979795762, p4785861829097979576);
        }
        if (p4785861829097979576 == null) {
            return true;
        }
        if (S10823041268949770285.t(this.k, h8745424616867554108.k)) {
            return S10823041268949770285.t(this.n, h8745424616867554108.n);
        }
        return false;
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final long f(float f, float f2, float f3, float f4, G5298154673482189769 g5298154673482189769) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        F12101231409752321762 f12101231409752321762 = this.m;
        return J8045362843799184672.d((float) f12101231409752321762.g(f5), (float) f12101231409752321762.g(f6), (float) f12101231409752321762.g(f7), f4, g5298154673482189769);
    }

    @Override // dev.epro.r0.G5298154673482189769
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        P4785861829097979576 p4785861829097979576 = this.g;
        int hashCode2 = floatToIntBits2 + (p4785861829097979576 != null ? p4785861829097979576.hashCode() : 0);
        if (p4785861829097979576 != null) {
            return hashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H8745424616867554108(java.lang.String r19, float[] r20, dev.epro.r0.Q9435736031653407531 r21, final dev.epro.r0.P4785861829097979576 r22, int r23) {
        /*
            r18 = this;
            r9 = r22
            double r0 = r9.a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Le
            r4 = r6
            goto Lf
        Le:
            r4 = r5
        Lf:
            double r7 = r9.g
            double r10 = r9.f
            r12 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r14 = 0
            if (r4 == 0) goto L22
            dev.epro.r0.E2786872315728851449 r4 = new dev.epro.r0.E2786872315728851449
            r16 = r2
            r2 = 4
            r4.<init>()
            goto L44
        L22:
            r16 = r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L2f
            dev.epro.r0.E2786872315728851449 r4 = new dev.epro.r0.E2786872315728851449
            r2 = 5
            r4.<init>()
            goto L44
        L2f:
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            dev.epro.r0.E2786872315728851449 r4 = new dev.epro.r0.E2786872315728851449
            r2 = 6
            r4.<init>()
            goto L44
        L3e:
            dev.epro.r0.E2786872315728851449 r4 = new dev.epro.r0.E2786872315728851449
            r2 = 7
            r4.<init>()
        L44:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L4f
            dev.epro.r0.E2786872315728851449 r0 = new dev.epro.r0.E2786872315728851449
            r0.<init>()
        L4d:
            r6 = r0
            goto L6f
        L4f:
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L59
            dev.epro.r0.E2786872315728851449 r0 = new dev.epro.r0.E2786872315728851449
            r0.<init>()
            goto L4d
        L59:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            dev.epro.r0.E2786872315728851449 r0 = new dev.epro.r0.E2786872315728851449
            r1 = 2
            r0.<init>()
            goto L4d
        L68:
            dev.epro.r0.E2786872315728851449 r0 = new dev.epro.r0.E2786872315728851449
            r1 = 3
            r0.<init>()
            goto L4d
        L6f:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H8745424616867554108.<init>(java.lang.String, float[], dev.epro.r0.Q9435736031653407531, dev.epro.r0.P4785861829097979576, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H8745424616867554108(java.lang.String r18, float[] r19, dev.epro.r0.Q9435736031653407531 r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            dev.epro.r0.K2042933864045806308 r3 = dev.epro.r0.H8745424616867554108.r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            dev.epro.r0.T4148991409988489332 r4 = new dev.epro.r0.T4148991409988489332
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            dev.epro.r0.T4148991409988489332 r3 = new dev.epro.r0.T4148991409988489332
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            dev.epro.r0.P4785861829097979576 r15 = new dev.epro.r0.P4785861829097979576
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H8745424616867554108.<init>(java.lang.String, float[], dev.epro.r0.Q9435736031653407531, double, float, float, int):void");
    }
}
