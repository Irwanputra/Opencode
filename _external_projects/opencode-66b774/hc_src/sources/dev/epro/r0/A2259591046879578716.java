package dev.epro.r0;

import android.text.Layout;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class A2259591046879578716 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ A2259591046879578716(long j, float[] fArr, A8284336046188466534 a8284336046188466534, A81664135048468380 a81664135048468380) {
        this.a = (byte) 1;
        this.b = j;
        this.c = fArr;
        this.d = a8284336046188466534;
        this.e = a81664135048468380;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        long j;
        boolean z;
        float a;
        float a2;
        Q7316561721656982910 q7316561721656982910;
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                S6349823729575121924 s6349823729575121924 = (S6349823729575121924) obj4;
                A7209497065939201693 a7209497065939201693 = (A7209497065939201693) obj3;
                long j2 = this.b;
                R3103059035698929241 r3103059035698929241 = (R3103059035698929241) obj2;
                N17396598995248644478 n17396598995248644478 = (N17396598995248644478) obj;
                n17396598995248644478.a();
                float f = s6349823729575121924.a;
                float f2 = s6349823729575121924.b;
                N16536369055082677148 n16536369055082677148 = n17396598995248644478.a;
                ((H12843822278061842084) n16536369055082677148.b.b).I(f, f2);
                try {
                    L17598299826319227431.k0(n17396598995248644478, (F2238012860950049442) a7209497065939201693.a, j2, 0L, 0.0f, r3103059035698929241, 0, 890);
                    return o9245300239821758723;
                } finally {
                    ((H12843822278061842084) n16536369055082677148.b.b).I(-f, -f2);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                A8284336046188466534 a8284336046188466534 = (A8284336046188466534) obj3;
                A81664135048468380 a81664135048468380 = (A81664135048468380) obj2;
                Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) obj;
                int i = z2489793023059154243.b;
                R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
                int i2 = z2489793023059154243.c;
                long j3 = this.b;
                int g = i > F12478849263529740365.g(j3) ? z2489793023059154243.b : F12478849263529740365.g(j3);
                if (i2 >= F12478849263529740365.f(j3)) {
                    i2 = F12478849263529740365.f(j3);
                }
                long d = T1335862270807194835.d(z2489793023059154243.d(g), z2489793023059154243.d(i2));
                int i3 = a8284336046188466534.a;
                I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
                int g2 = F12478849263529740365.g(d);
                int f3 = F12478849263529740365.f(d);
                Layout layout = i18150855591218230259.f;
                int length = layout.getText().length();
                if (g2 < 0) {
                    T12055643479535528558.a("startOffset must be > 0");
                }
                if (g2 >= length) {
                    T12055643479535528558.a("startOffset must be less than text length");
                }
                if (f3 <= g2) {
                    T12055643479535528558.a("endOffset must be greater than startOffset");
                }
                if (f3 > length) {
                    T12055643479535528558.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i3 < (f3 - g2) * 4) {
                    T12055643479535528558.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int f4 = i18150855591218230259.f(g2);
                int f5 = i18150855591218230259.f(f3 - 1);
                R13382989801010358705 r13382989801010358705 = new R13382989801010358705(i18150855591218230259);
                if (f4 <= f5) {
                    while (true) {
                        int lineStart = layout.getLineStart(f4);
                        int e = i18150855591218230259.e(f4);
                        int max = Math.max(g2, lineStart);
                        int min = Math.min(f3, e);
                        float h = i18150855591218230259.h(f4);
                        float d2 = i18150855591218230259.d(f4);
                        j = d;
                        int i4 = i3;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(f4) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z3 || isRtlCharAt) {
                                if (z3 && isRtlCharAt) {
                                    z2 = false;
                                    float a3 = r13382989801010358705.a(max, false, false, false);
                                    z = z3;
                                    a = r13382989801010358705.a(max + 1, true, true, false);
                                    a2 = a3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !isRtlCharAt) {
                                        a = r13382989801010358705.a(max, false, false, false);
                                        a2 = r13382989801010358705.a(max + 1, true, true, false);
                                    } else {
                                        a2 = r13382989801010358705.a(max, false, false, true);
                                        a = r13382989801010358705.a(max + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = a;
                                fArr[i4 + 1] = h;
                                fArr[i4 + 2] = a2;
                                fArr[i4 + 3] = d2;
                                i4 += 4;
                                max++;
                                z3 = z;
                            } else {
                                a = r13382989801010358705.a(max, z2, z2, true);
                                z = z3;
                                a2 = r13382989801010358705.a(max + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i4] = a;
                            fArr[i4 + 1] = h;
                            fArr[i4 + 2] = a2;
                            fArr[i4 + 3] = d2;
                            i4 += 4;
                            max++;
                            z3 = z;
                        }
                        if (f4 != f5) {
                            f4++;
                            d = j;
                            i3 = i4;
                        }
                    }
                } else {
                    j = d;
                }
                int e2 = (F12478849263529740365.e(j) * 4) + a8284336046188466534.a;
                for (int i5 = a8284336046188466534.a; i5 < e2; i5 += 4) {
                    int i6 = i5 + 1;
                    float f6 = fArr[i6];
                    float f7 = a81664135048468380.a;
                    fArr[i6] = f6 + f7;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f7;
                }
                a8284336046188466534.a = e2;
                a81664135048468380.a += r8360857824092671497.f;
                return o9245300239821758723;
            default:
                long j4 = this.b;
                B1061516154492673368 b1061516154492673368 = (B1061516154492673368) obj2;
                L17598299826319227431 l17598299826319227431 = (L17598299826319227431) obj;
                float invoke = ((K3983185380106045713) obj4).invoke();
                float max2 = (Math.max(Math.min(1.0f, invoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float p = W7808703833045379622.p(Math.abs(invoke) - 1.0f, 0.0f, 2.0f);
                float pow = (((0.4f * max2) - 0.25f) + (p - (((float) Math.pow(p, 2.0d)) / 4.0f))) * 0.5f;
                float f8 = pow * 360.0f;
                float f9 = ((0.8f * max2) + pow) * 360.0f;
                float min2 = Math.min(1.0f, max2);
                J12368838350359828847 j12368838350359828847 = new J12368838350359828847();
                j12368838350359828847.a = f9;
                j12368838350359828847.b = min2;
                float floatValue = ((Number) ((L13148442655056575112) obj3).getValue()).floatValue();
                long m0 = l17598299826319227431.m0();
                Q7316561721656982910 R = l17598299826319227431.R();
                long F = R.F();
                R.A().l();
                try {
                    ((H12843822278061842084) R.b).G(pow, m0);
                    float K = (l17598299826319227431.K(2.5f) / 2.0f) + l17598299826319227431.K(5.5f);
                    long m = S12227320117525376577.m(l17598299826319227431.e());
                    int i8 = (int) (m >> 32);
                    int i9 = (int) (m & 4294967295L);
                    S6349823729575121924 s63498237295751219242 = new S6349823729575121924(Float.intBitsToFloat(i8) - K, Float.intBitsToFloat(i9) - K, Float.intBitsToFloat(i8) + K, Float.intBitsToFloat(i9) + K);
                    q7316561721656982910 = R;
                    try {
                        L17598299826319227431.T(l17598299826319227431, j4, f8, f9 - f8, s63498237295751219242.f(), s63498237295751219242.e(), floatValue, new I1470541803076273897(l17598299826319227431.K(2.5f), 0.0f, 0, 0, 26), 768);
                        M14643676963617488237.h(l17598299826319227431, b1061516154492673368, s63498237295751219242, j4, floatValue, j12368838350359828847);
                        L11610354117192841236.w(q7316561721656982910, F);
                        return o9245300239821758723;
                    } catch (Throwable th) {
                        th = th;
                        L11610354117192841236.w(q7316561721656982910, F);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    q7316561721656982910 = R;
                }
        }
    }

    public /* synthetic */ A2259591046879578716(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
