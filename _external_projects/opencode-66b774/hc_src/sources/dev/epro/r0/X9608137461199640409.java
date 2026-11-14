package dev.epro.r0;

import ads_mobile_sdk.b71;
import ads_mobile_sdk.dq2;
import ads_mobile_sdk.wo2;
import java.util.HashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X9608137461199640409 implements K6033805112333592087, P1576149285030538153 {
    public final /* synthetic */ byte a = 1;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public X9608137461199640409(H11725168162114556860 h11725168162114556860) {
        this.b = h11725168162114556860;
        G9139115986307242990 g9139115986307242990 = new G9139115986307242990();
        g9139115986307242990.d = -1;
        this.c = g9139115986307242990;
        I16141028645763443416 i16141028645763443416 = new I16141028645763443416(h11725168162114556860);
        this.d = i16141028645763443416;
        this.e = i16141028645763443416;
        E6101237837392211295 e6101237837392211295 = i16141028645763443416.c0;
        this.f = e6101237837392211295;
        this.g = e6101237837392211295;
        this.h = new U9803441765912152712();
    }

    public static R15896830329318850690 c(L8750838032724194107 l8750838032724194107, R15896830329318850690 r15896830329318850690) {
        R15896830329318850690 r158968303293188506902;
        if (l8750838032724194107 instanceof A8269341136279542501) {
            r158968303293188506902 = ((A8269341136279542501) l8750838032724194107).a();
            r158968303293188506902.c = L5069768235772837017.f(r158968303293188506902);
        } else {
            E16236172717107512059 e16236172717107512059 = new E16236172717107512059();
            e16236172717107512059.c = L5069768235772837017.d(l8750838032724194107);
            e16236172717107512059.f216o = l8750838032724194107;
            e16236172717107512059.q = new HashSet();
            r158968303293188506902 = e16236172717107512059;
        }
        if (r158968303293188506902.n) {
            P753981624812481271.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        r158968303293188506902.i = true;
        R15896830329318850690 r158968303293188506903 = r15896830329318850690.f;
        if (r158968303293188506903 != null) {
            r158968303293188506903.e = r158968303293188506902;
            r158968303293188506902.f = r158968303293188506903;
        }
        r15896830329318850690.f = r158968303293188506902;
        r158968303293188506902.e = r15896830329318850690;
        return r158968303293188506902;
    }

    public static R15896830329318850690 d(R15896830329318850690 r15896830329318850690) {
        boolean z = r15896830329318850690.n;
        if (z) {
            M8849337839148886240 m8849337839148886240 = L5069768235772837017.a;
            if (!z) {
                P753981624812481271.b("autoInvalidateRemovedNode called on unattached node");
            }
            L5069768235772837017.a(r15896830329318850690, -1, 2);
            r15896830329318850690.e1();
            r15896830329318850690.Y0();
        }
        R15896830329318850690 r158968303293188506902 = r15896830329318850690.f;
        R15896830329318850690 r158968303293188506903 = r15896830329318850690.e;
        if (r158968303293188506902 != null) {
            r158968303293188506902.e = r158968303293188506903;
            r15896830329318850690.f = null;
        }
        if (r158968303293188506903 != null) {
            r158968303293188506903.f = r158968303293188506902;
            r15896830329318850690.e = null;
        }
        r158968303293188506903.getClass();
        return r158968303293188506903;
    }

    public static void n(L8750838032724194107 l8750838032724194107, L8750838032724194107 l87508380327241941072, R15896830329318850690 r15896830329318850690) {
        if ((l8750838032724194107 instanceof A8269341136279542501) && (l87508380327241941072 instanceof A8269341136279542501)) {
            r15896830329318850690.getClass();
            ((A8269341136279542501) l87508380327241941072).c(r15896830329318850690);
            if (r15896830329318850690.n) {
                L5069768235772837017.c(r15896830329318850690);
                return;
            } else {
                r15896830329318850690.j = true;
                return;
            }
        }
        if (!(r15896830329318850690 instanceof E16236172717107512059)) {
            P753981624812481271.b("Unknown Modifier.Node type");
            return;
        }
        E16236172717107512059 e16236172717107512059 = (E16236172717107512059) r15896830329318850690;
        if (e16236172717107512059.n) {
            e16236172717107512059.i1();
        }
        e16236172717107512059.f216o = l87508380327241941072;
        e16236172717107512059.c = L5069768235772837017.d(l87508380327241941072);
        if (e16236172717107512059.n) {
            e16236172717107512059.h1(false);
        }
        if (r15896830329318850690.n) {
            L5069768235772837017.c(r15896830329318850690);
        } else {
            r15896830329318850690.j = true;
        }
    }

    @Override // dev.epro.r0.K6033805112333592087
    public wo2 a() {
        return (dq2) ((V2597580950516131749) this.k).get();
    }

    @Override // dev.epro.r0.K6033805112333592087
    public b71 b() {
        return (b71) ((V2597580950516131749) this.i).get();
    }

    @Override // dev.epro.r0.P1576149285030538153
    public int e() {
        return ((O3228356295430981133) this.c).e();
    }

    @Override // dev.epro.r0.P1576149285030538153
    public long f(long j) {
        return ((O3228356295430981133) this.b).f(j);
    }

    @Override // dev.epro.r0.P1576149285030538153
    public long g(long j) {
        return ((O3228356295430981133) this.b).g(j);
    }

    public void h(F4096073349764486348 f4096073349764486348) {
        O3228356295430981133 o3228356295430981133 = (O3228356295430981133) this.b;
        o3228356295430981133.a++;
        ((D389890677992184566) o3228356295430981133.d).b(f4096073349764486348);
        o3228356295430981133.h();
    }

    public boolean i(int i) {
        return (((R15896830329318850690) this.g).d & i) != 0;
    }

    public void j(R15896830329318850690 r15896830329318850690, Y4989033692226475498 y4989033692226475498) {
        for (R15896830329318850690 r158968303293188506902 = r15896830329318850690.e; r158968303293188506902 != null; r158968303293188506902 = r158968303293188506902.e) {
            if (r158968303293188506902 == ((G9139115986307242990) this.c)) {
                H11725168162114556860 u = ((H11725168162114556860) this.b).u();
                y4989033692226475498.w = u != null ? (I16141028645763443416) u.F.d : null;
                this.e = y4989033692226475498;
                return;
            } else {
                if ((r158968303293188506902.c & 2) != 0) {
                    return;
                }
                r158968303293188506902.g1(y4989033692226475498);
            }
        }
    }

    public void k() {
        for (R15896830329318850690 r15896830329318850690 = (R15896830329318850690) this.g; r15896830329318850690 != null; r15896830329318850690 = r15896830329318850690.f) {
            r15896830329318850690.d1();
            if (r15896830329318850690.i) {
                M8849337839148886240 m8849337839148886240 = L5069768235772837017.a;
                if (!r15896830329318850690.n) {
                    P753981624812481271.b("autoInvalidateInsertedNode called on unattached node");
                }
                L5069768235772837017.a(r15896830329318850690, -1, 1);
            }
            if (r15896830329318850690.j) {
                L5069768235772837017.c(r15896830329318850690);
            }
            r15896830329318850690.i = false;
            r15896830329318850690.j = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0194, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0199, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a5, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b3, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b5, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c0, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c4, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c6, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ca, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d2, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0267, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bc, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0197, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0190, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017e, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0171, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x017c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026d, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0157, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014d, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0153, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0155, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0159, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015a, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015e, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0160, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016e, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0173, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018b, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0192, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r32, dev.epro.r0.U9803441765912152712 r33, dev.epro.r0.U9803441765912152712 r34, dev.epro.r0.R15896830329318850690 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X9608137461199640409.l(int, dev.epro.r0.U9803441765912152712, dev.epro.r0.U9803441765912152712, dev.epro.r0.R15896830329318850690, boolean):void");
    }

    public void m() {
        K12961197752049417088 k12961197752049417088;
        H11725168162114556860 h11725168162114556860 = (H11725168162114556860) this.b;
        Y4989033692226475498 y4989033692226475498 = (I16141028645763443416) this.d;
        for (R15896830329318850690 r15896830329318850690 = ((E6101237837392211295) this.f).e; r15896830329318850690 != null; r15896830329318850690 = r15896830329318850690.e) {
            D10205225622993155321 k = R7033599853981556291.k(r15896830329318850690);
            if (k != null) {
                Y4989033692226475498 y49890336922264754982 = r15896830329318850690.h;
                if (y49890336922264754982 != null) {
                    K12961197752049417088 k129611977520494170882 = (K12961197752049417088) y49890336922264754982;
                    D10205225622993155321 d10205225622993155321 = k129611977520494170882.c0;
                    k129611977520494170882.I1(k);
                    k12961197752049417088 = k129611977520494170882;
                    if (d10205225622993155321 != r15896830329318850690) {
                        U18133900443301080740 u18133900443301080740 = k129611977520494170882.T;
                        k12961197752049417088 = k129611977520494170882;
                        if (u18133900443301080740 != null) {
                            ((R12643293538999642754) u18133900443301080740).c();
                            k12961197752049417088 = k129611977520494170882;
                        }
                    }
                } else {
                    K12961197752049417088 k129611977520494170883 = new K12961197752049417088(h11725168162114556860, k);
                    r15896830329318850690.g1(k129611977520494170883);
                    k12961197752049417088 = k129611977520494170883;
                }
                y4989033692226475498.w = k12961197752049417088;
                k12961197752049417088.v = y4989033692226475498;
                y4989033692226475498 = k12961197752049417088;
            } else {
                r15896830329318850690.g1(y4989033692226475498);
            }
        }
        H11725168162114556860 u = h11725168162114556860.u();
        y4989033692226475498.w = u != null ? (I16141028645763443416) u.F.d : null;
        this.e = y4989033692226475498;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                R15896830329318850690 r15896830329318850690 = (R15896830329318850690) this.g;
                E6101237837392211295 e6101237837392211295 = (E6101237837392211295) this.f;
                if (r15896830329318850690 == e6101237837392211295) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (r15896830329318850690 != null && r15896830329318850690 != e6101237837392211295) {
                            sb.append(String.valueOf(r15896830329318850690));
                            if (r15896830329318850690.f == e6101237837392211295) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                r15896830329318850690 = r15896830329318850690.f;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ X9608137461199640409() {
    }

    public X9608137461199640409(O3228356295430981133 o3228356295430981133, N1420218926656397722 n1420218926656397722, W8455343525638953052 w8455343525638953052, F4096073349764486348 f4096073349764486348, L16033300369903415380 l16033300369903415380, I12071840179596922896 i12071840179596922896, B13729205492206812220 b13729205492206812220, K1865709164992808030 k1865709164992808030, F4096073349764486348 f40960733497644863482) {
        this.c = o3228356295430981133;
        this.d = n1420218926656397722;
        this.e = w8455343525638953052;
        this.f = f4096073349764486348;
        this.h = l16033300369903415380;
        this.i = i12071840179596922896;
        this.j = b13729205492206812220;
        this.k = k1865709164992808030;
        this.g = f40960733497644863482;
        this.b = o3228356295430981133;
    }
}
