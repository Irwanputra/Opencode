package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class A2259591046879578716 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ A2259591046879578716(long j, float[] fArr, dev.epro.r0.A8284336046188466534 a8284336046188466534, dev.epro.r0.A81664135048468380 a81664135048468380) {
        this.a = (byte) 1;
        this.b = j;
        this.c = fArr;
        this.d = a8284336046188466534;
        this.e = a81664135048468380;
    }

    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
        long j;
        boolean z;
        float fA;
        float fA2;
        dev.epro.r0.Q7316561721656982910 q7316561721656982910;
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        java.lang.Object obj2 = this.e;
        java.lang.Object obj3 = this.d;
        java.lang.Object obj4 = this.c;
        switch (b) {
            case 0:
                dev.epro.r0.S6349823729575121924 s6349823729575121924 = (dev.epro.r0.S6349823729575121924) obj4;
                dev.epro.r0.A7209497065939201693 a7209497065939201693 = (dev.epro.r0.A7209497065939201693) obj3;
                long j2 = this.b;
                dev.epro.r0.R3103059035698929241 r3103059035698929241 = (dev.epro.r0.R3103059035698929241) obj2;
                dev.epro.r0.N17396598995248644478 n17396598995248644478 = (dev.epro.r0.N17396598995248644478) obj;
                n17396598995248644478.a();
                float f = s6349823729575121924.a;
                float f2 = s6349823729575121924.b;
                dev.epro.r0.N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
                ((dev.epro.r0.H12843822278061842084) n16536369055082677148.b.b).I(f, f2);
                try {
                    dev.epro.r0.L17598299826319227431.k0(n17396598995248644478, (dev.epro.r0.F2238012860950049442) a7209497065939201693.a, j2, 0L, 0.0f, r3103059035698929241, 0, 890);
                    return o9245300239821758723;
                } finally {
                    ((dev.epro.r0.H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                dev.epro.r0.A8284336046188466534 a8284336046188466534 = (dev.epro.r0.A8284336046188466534) obj3;
                dev.epro.r0.A81664135048468380 a81664135048468380 = (dev.epro.r0.A81664135048468380) obj2;
                dev.epro.r0.Z2489793023059154243 z2489793023059154243 = (dev.epro.r0.Z2489793023059154243) obj;
                int i = z2489793023059154243.b;
                dev.epro.r0.R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
                int iF = z2489793023059154243.c;
                long j3 = this.b;
                int iG = i > dev.epro.r0.F12478849263529740365.g(j3) ? z2489793023059154243.b : dev.epro.r0.F12478849263529740365.g(j3);
                if (iF >= dev.epro.r0.F12478849263529740365.f(j3)) {
                    iF = dev.epro.r0.F12478849263529740365.f(j3);
                }
                long jD = dev.epro.r0.T1335862270807194835.d(z2489793023059154243.d(iG), z2489793023059154243.d(iF));
                int i2 = a8284336046188466534.a;
                dev.epro.r0.I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
                int iG2 = dev.epro.r0.F12478849263529740365.g(jD);
                int iF2 = dev.epro.r0.F12478849263529740365.f(jD);
                android.text.Layout layout = i18150855591218230259.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    dev.epro.r0.T12055643479535528558.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    dev.epro.r0.T12055643479535528558.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    dev.epro.r0.T12055643479535528558.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    dev.epro.r0.T12055643479535528558.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i2 < (iF2 - iG2) * 4) {
                    dev.epro.r0.T12055643479535528558.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iF3 = i18150855591218230259.f(iG2);
                int iF4 = i18150855591218230259.f(iF2 - 1);
                dev.epro.r0.R13382989801010358705 r13382989801010358705 = new dev.epro.r0.R13382989801010358705(i18150855591218230259);
                if (iF3 <= iF4) {
                    while (true) {
                        int lineStart = layout.getLineStart(iF3);
                        int iE = i18150855591218230259.e(iF3);
                        int iMax = java.lang.Math.max(iG2, lineStart);
                        int iMin = java.lang.Math.min(iF2, iE);
                        float fH = i18150855591218230259.h(iF3);
                        float fD = i18150855591218230259.d(iF3);
                        j = jD;
                        int i3 = i2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(iF3) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z3 || zIsRtlCharAt) {
                                if (z3 && zIsRtlCharAt) {
                                    z2 = false;
                                    float fA3 = r13382989801010358705.a(iMax, false, false, false);
                                    z = z3;
                                    fA = r13382989801010358705.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !zIsRtlCharAt) {
                                        fA = r13382989801010358705.a(iMax, false, false, false);
                                        fA2 = r13382989801010358705.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = r13382989801010358705.a(iMax, false, false, true);
                                        fA = r13382989801010358705.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i3] = fA;
                                fArr[i3 + 1] = fH;
                                fArr[i3 + 2] = fA2;
                                fArr[i3 + 3] = fD;
                                i3 += 4;
                                iMax++;
                                z3 = z;
                            } else {
                                fA = r13382989801010358705.a(iMax, z2, z2, true);
                                z = z3;
                                fA2 = r13382989801010358705.a(iMax + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i3] = fA;
                            fArr[i3 + 1] = fH;
                            fArr[i3 + 2] = fA2;
                            fArr[i3 + 3] = fD;
                            i3 += 4;
                            iMax++;
                            z3 = z;
                        }
                        if (iF3 != iF4) {
                            iF3++;
                            jD = j;
                            i2 = i3;
                        }
                    }
                } else {
                    j = jD;
                }
                int iE2 = (dev.epro.r0.F12478849263529740365.e(j) * 4) + a8284336046188466534.a;
                for (int i4 = a8284336046188466534.a; i4 < iE2; i4 += 4) {
                    int i5 = i4 + 1;
                    float f3 = fArr[i5];
                    float f4 = a81664135048468380.a;
                    fArr[i5] = f3 + f4;
                    int i6 = i4 + 3;
                    fArr[i6] = fArr[i6] + f4;
                }
                a8284336046188466534.a = iE2;
                a81664135048468380.a += r8360857824092671497.f;
                return o9245300239821758723;
            default:
                long j4 = this.b;
                dev.epro.r0.B1061516154492673368 b1061516154492673368 = (dev.epro.r0.B1061516154492673368) obj2;
                dev.epro.r0.L17598299826319227431 l17598299826319227431 = (dev.epro.r0.L17598299826319227431) obj;
                float fInvoke = ((dev.epro.r0.K3983185380106045713) obj4).invoke();
                float fMax = (java.lang.Math.max(java.lang.Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float fP = dev.epro.r0.W7808703833045379622.p(java.lang.Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fP - (((float) java.lang.Math.pow(fP, 2.0d)) / 4.0f))) * 0.5f;
                float f5 = fPow * 360.0f;
                float f6 = ((0.8f * fMax) + fPow) * 360.0f;
                float fMin = java.lang.Math.min(1.0f, fMax);
                dev.epro.r0.J12368838350359828847 j12368838350359828847 = new dev.epro.r0.J12368838350359828847();
                j12368838350359828847.a = f6;
                j12368838350359828847.b = fMin;
                float fFloatValue = ((java.lang.Number) ((dev.epro.r0.L13148442655056575112) obj3).getValue()).floatValue();
                long jM0 = l17598299826319227431.m0();
                dev.epro.r0.Q7316561721656982910 q7316561721656982910R = l17598299826319227431.R();
                long jF = q7316561721656982910R.F();
                q7316561721656982910R.A().l();
                try {
                    ((dev.epro.r0.H12843822278061842084) q7316561721656982910R.b).G(fPow, jM0);
                    float fK = (l17598299826319227431.K(2.5f) / 2.0f) + l17598299826319227431.K(5.5f);
                    long jM = dev.epro.r0.S12227320117525376577.m(l17598299826319227431.e());
                    int i7 = (int) (jM >> 32);
                    int i8 = (int) (jM & 4294967295L);
                    dev.epro.r0.S6349823729575121924 s63498237295751219242 = new dev.epro.r0.S6349823729575121924(java.lang.Float.intBitsToFloat(i7) - fK, java.lang.Float.intBitsToFloat(i8) - fK, java.lang.Float.intBitsToFloat(i7) + fK, java.lang.Float.intBitsToFloat(i8) + fK);
                    q7316561721656982910 = q7316561721656982910R;
                    try {
                        dev.epro.r0.L17598299826319227431.T(l17598299826319227431, j4, f5, f6 - f5, s63498237295751219242.f(), s63498237295751219242.e(), fFloatValue, new dev.epro.r0.I1470541803076273897(l17598299826319227431.K(2.5f), 0.0f, 0, 0, 26), 768);
                        dev.epro.r0.M14643676963617488237.h(l17598299826319227431, b1061516154492673368, s63498237295751219242, j4, fFloatValue, j12368838350359828847);
                        dev.epro.r0.L11610354117192841236.w(q7316561721656982910, jF);
                        return o9245300239821758723;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        dev.epro.r0.L11610354117192841236.w(q7316561721656982910, jF);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    q7316561721656982910 = q7316561721656982910R;
                }
                break;
        }
    }

    public /* synthetic */ A2259591046879578716(java.lang.Object obj, java.lang.Object obj2, long j, java.lang.Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
