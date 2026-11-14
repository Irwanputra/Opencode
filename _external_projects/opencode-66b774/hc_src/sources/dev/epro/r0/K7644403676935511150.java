package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K7644403676935511150 implements D9497773141868343380 {
    public final G16768067413993841943 b;
    public final D9497773141868343380 c;
    public final F10342546226345611902 d;

    public K7644403676935511150(G16768067413993841943 g16768067413993841943, D9497773141868343380 d9497773141868343380, F10342546226345611902 f10342546226345611902) {
        this.b = g16768067413993841943;
        this.c = d9497773141868343380;
        this.d = f10342546226345611902;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if ((r12 + r13) > r14) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x001f, code lost:
    
        if (r12 <= 1.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r5 = true;
     */
    @Override // dev.epro.r0.D9497773141868343380
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r12, float r13, float r14) {
        /*
            r11 = this;
            dev.epro.r0.G16768067413993841943 r0 = r11.b
            dev.epro.r0.V697849047308847220 r1 = r0.D
            dev.epro.r0.D9497773141868343380 r2 = r11.c
            float r2 = r2.a(r12, r13, r14)
            r3 = 0
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 <= 0) goto L18
            float r12 = r12 + r13
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L22
        L16:
            r5 = r6
            goto L22
        L18:
            float r12 = r12 + r13
            java.util.Map r13 = dev.epro.r0.I12271177246410047083.a
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 > 0) goto L22
            goto L16
        L22:
            float r12 = java.lang.Math.abs(r2)
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            dev.epro.r0.F10342546226345611902 r13 = dev.epro.r0.F10342546226345611902.b
            dev.epro.r0.R7000310675073492254 r4 = dev.epro.r0.R7000310675073492254.b
            dev.epro.r0.F10342546226345611902 r11 = r11.d
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 != 0) goto L33
            goto L6b
        L33:
            if (r5 == 0) goto L6b
            if (r11 != r13) goto L48
            dev.epro.r0.Z10384052377193817149 r11 = r0.k()
            dev.epro.r0.R7000310675073492254 r11 = r11.e
            if (r11 != r4) goto L48
            int r11 = r0.f
            int r11 = -r11
            int r12 = r0.n()
            int r12 = r12 + r11
            goto L4a
        L48:
            int r12 = r0.f
        L4a:
            float r11 = (float) r12
            float r11 = r11 * r6
        L4c:
            int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r12 <= 0) goto L5b
            int r12 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r12 >= 0) goto L5b
            int r12 = r0.n()
            float r12 = (float) r12
            float r11 = r11 + r12
            goto L4c
        L5b:
            int r12 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r12 >= 0) goto L6a
            int r12 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r12 <= 0) goto L6a
            int r12 = r0.n()
            float r12 = (float) r12
            float r11 = r11 - r12
            goto L5b
        L6a:
            return r11
        L6b:
            int r12 = r0.f
            int r12 = java.lang.Math.abs(r12)
            double r7 = (double) r12
            r9 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 >= 0) goto L7c
            return r3
        L7c:
            if (r11 != r13) goto L8f
            dev.epro.r0.Z10384052377193817149 r12 = r0.k()
            dev.epro.r0.R7000310675073492254 r12 = r12.e
            if (r12 != r4) goto L8f
            int r12 = r0.f
            int r12 = -r12
            int r2 = r0.n()
            int r2 = r2 + r12
            goto L91
        L8f:
            int r2 = r0.f
        L91:
            float r12 = (float) r2
            float r12 = r12 * r6
            if (r11 != r13) goto Lb1
            dev.epro.r0.Z10384052377193817149 r11 = r0.k()
            dev.epro.r0.R7000310675073492254 r11 = r11.e
            if (r11 != r4) goto Lb1
            java.lang.Object r11 = r1.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Laa
            goto Lc2
        Laa:
            int r11 = r0.n()
        Lae:
            float r11 = (float) r11
            float r12 = r12 + r11
            goto Lc2
        Lb1:
            java.lang.Object r11 = r1.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lc2
            int r11 = r0.n()
            goto Lae
        Lc2:
            float r11 = -r14
            float r11 = dev.epro.r0.W7808703833045379622.p(r12, r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K7644403676935511150.a(float, float, float):float");
    }
}
