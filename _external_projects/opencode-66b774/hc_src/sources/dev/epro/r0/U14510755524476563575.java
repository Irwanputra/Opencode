package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U14510755524476563575 implements W10067852399966859634, K4412820318670641327 {
    public final B13906740428466697912 a;
    public final A6527624962738679687 b;
    public final float c;
    public final J12579087053762208099 d;
    public final float e;
    public final R16085073546103879032 f;

    public U14510755524476563575(B13906740428466697912 b13906740428466697912, A6527624962738679687 a6527624962738679687, float f, J12579087053762208099 j12579087053762208099, float f2, R16085073546103879032 r16085073546103879032) {
        this.a = b13906740428466697912;
        this.b = a6527624962738679687;
        this.c = f;
        this.d = j12579087053762208099;
        this.e = f2;
        this.f = r16085073546103879032;
    }

    public static int k(List list, int i, int i2, int i3, R16085073546103879032 r16085073546103879032) {
        boolean z;
        boolean z2;
        long a = B5288020592368727841.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            D15735805680132151670 d15735805680132151670 = new D15735805680132151670(r16085073546103879032, O15160157444238005800.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) R9411874267597469228.E0(0, list);
            int b0 = g17613326942144185441 != null ? g17613326942144185441.b0(i) : 0;
            int V = g17613326942144185441 != null ? g17613326942144185441.V(b0) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (d15735805680132151670.b(z3, 0, B5288020592368727841.a(i, Integer.MAX_VALUE), g17613326942144185441 == null ? null : new B5288020592368727841(B5288020592368727841.a(V, b0)), 0, 0, 0, false, false).c) {
                r16085073546103879032.getClass();
                a = a;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - V;
                    int i13 = i9 + 1;
                    int max = Math.max(i8, b0);
                    G17613326942144185441 g176133269421441854412 = (G17613326942144185441) R9411874267597469228.E0(i13, list);
                    b0 = g176133269421441854412 != null ? g176133269421441854412.b0(i) : 0;
                    int V2 = g176133269421441854412 != null ? g176133269421441854412.V(b0) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = V2;
                    L18233974379278055712 b = d15735805680132151670.b(z2, i14, B5288020592368727841.a(i12, i4), g176133269421441854412 == null ? null : new B5288020592368727841(B5288020592368727841.a(V2, b0)), i15, i5, max, false, false);
                    if (b.b) {
                        int i17 = max + i3 + i5;
                        d15735805680132151670.a(b, g176133269421441854412 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (b.c) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        V = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        V = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = max;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                a = B5288020592368727841.a(i5 - i3, i10);
            }
        }
        return (int) (a >> 32);
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        List list2 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list2 != null ? (G17613326942144185441) R9411874267597469228.D0(list2) : null;
        List list3 = (List) R9411874267597469228.E0(2, list);
        G17613326942144185441 g176133269421441854412 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
        long b = O15160157444238005800.b(0, i, 0, 0, 13);
        R16085073546103879032 r16085073546103879032 = this.f;
        r16085073546103879032.a(g17613326942144185441, g176133269421441854412, b);
        List list4 = (List) R9411874267597469228.D0(list);
        if (list4 == null) {
            list4 = O2161699089510411363.a;
        }
        return k(list4, i, j4720286603213127984.g0(this.c), j4720286603213127984.g0(this.e), r16085073546103879032);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.W10067852399966859634
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int i2;
        int[] iArr;
        R16085073546103879032 r16085073546103879032;
        int[] iArr2;
        B5288020592368727841 b5288020592368727841;
        List list2;
        long a;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = 1;
        List list3 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
        char c = 2;
        List list4 = (List) R9411874267597469228.E0(2, list);
        this.f.a(g17613326942144185441, list4 != null ? (G17613326942144185441) R9411874267597469228.D0(list4) : null, O15160157444238005800.b(0, 0, 0, i6, 7));
        List list5 = (List) R9411874267597469228.D0(list);
        if (list5 == null) {
            list5 = O2161699089510411363.a;
        }
        int g0 = j4720286603213127984.g0(this.c);
        int g02 = j4720286603213127984.g0(this.e);
        long a2 = B5288020592368727841.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr3 = new int[size];
        int size2 = list5.size();
        int[] iArr4 = new int[size2];
        int size3 = list5.size();
        int i8 = 0;
        while (i8 < size3) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list5.get(i8);
            char c2 = c;
            int V = g176133269421441854412.V(i6);
            iArr3[i8] = V;
            iArr4[i8] = g176133269421441854412.b0(V);
            i8++;
            c = c2;
        }
        int size4 = list5.size();
        R16085073546103879032 r160850735461038790322 = this.f;
        if (Integer.MAX_VALUE < size4) {
            r160850735461038790322.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            r160850735461038790322.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr3[i10];
        }
        int size5 = ((list5.size() - 1) * g0) + i9;
        if (size2 == 0) {
            Z3383101362411723454.u();
            return 0;
        }
        int i11 = iArr4[0];
        int i12 = size2 - 1;
        if (1 <= i12) {
            int i13 = 1;
            i2 = 0;
            while (true) {
                int i14 = iArr4[i13];
                if (i11 < i14) {
                    i11 = i14;
                }
                if (i13 == i12) {
                    break;
                }
                i13++;
            }
        } else {
            i2 = 0;
        }
        if (size == 0) {
            Z3383101362411723454.u();
            return 0;
        }
        int i15 = iArr3[i2];
        int i16 = size - 1;
        if (1 <= i16) {
            int i17 = 1;
            while (true) {
                int i18 = iArr3[i17];
                if (i15 < i18) {
                    i15 = i18;
                }
                if (i17 == i16) {
                    break;
                }
                i17++;
            }
        }
        int i19 = size5;
        while (i15 <= i19 && i11 != i6) {
            int i20 = (i15 + i19) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr3;
                a = a2;
                iArr = iArr4;
                r16085073546103879032 = r160850735461038790322;
            } else {
                int i21 = i2;
                iArr = iArr4;
                r16085073546103879032 = r160850735461038790322;
                D15735805680132151670 d15735805680132151670 = new D15735805680132151670(r16085073546103879032, O15160157444238005800.a(i21, i20, i21, Integer.MAX_VALUE), g0, g02);
                G17613326942144185441 g176133269421441854413 = (G17613326942144185441) R9411874267597469228.E0(i21, list5);
                int i22 = g176133269421441854413 != null ? iArr[i21] : i21;
                int i23 = g176133269421441854413 != null ? iArr3[i21] : 0;
                boolean z = list5.size() > i7 ? i7 : 0;
                long a3 = B5288020592368727841.a(i20, Integer.MAX_VALUE);
                if (g176133269421441854413 == null) {
                    iArr2 = iArr3;
                    b5288020592368727841 = null;
                } else {
                    iArr2 = iArr3;
                    b5288020592368727841 = new B5288020592368727841(B5288020592368727841.a(i23, i22));
                }
                int i24 = 0;
                if (d15735805680132151670.b(z, 0, a3, b5288020592368727841, 0, 0, 0, false, false).c) {
                    r16085073546103879032.getClass();
                    list2 = list5;
                    a = a2;
                } else {
                    int size6 = list5.size();
                    int i25 = i20;
                    int i26 = i23;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = i22;
                    int i32 = 0;
                    while (true) {
                        if (i30 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i33 = i25 - i26;
                        int i34 = size6;
                        int i35 = i30 + 1;
                        int max = Math.max(i28, i31);
                        G17613326942144185441 g176133269421441854414 = (G17613326942144185441) R9411874267597469228.E0(i35, list5);
                        i31 = g176133269421441854414 != null ? iArr[i35] : 0;
                        if (g176133269421441854414 != null) {
                            i3 = i35;
                            i4 = iArr2[i35] + g0;
                        } else {
                            i3 = i35;
                            i4 = 0;
                        }
                        list2 = list5;
                        int i36 = i3 - i29;
                        int i37 = i27;
                        L18233974379278055712 b = d15735805680132151670.b(i30 + 2 < list2.size(), i36, B5288020592368727841.a(i33, Integer.MAX_VALUE), g176133269421441854414 == null ? null : new B5288020592368727841(B5288020592368727841.a(i4, i31)), i37, i24, max, false, false);
                        if (b.b) {
                            int i38 = max + g02 + i24;
                            d15735805680132151670.a(b, g176133269421441854414 != null, i37, i38, i33, i36);
                            int i39 = i4 - g0;
                            i27 = i37 + 1;
                            if (b.c) {
                                i24 = i38;
                                i32 = i3;
                                break;
                            }
                            i26 = i39;
                            i25 = i20;
                            i24 = i38;
                            i5 = i3;
                            i28 = 0;
                        } else {
                            i26 = i4;
                            i25 = i33;
                            i27 = i37;
                            i28 = max;
                            i5 = i29;
                        }
                        i29 = i5;
                        size6 = i34;
                        i30 = i3;
                        i32 = i30;
                        list5 = list2;
                    }
                    a = B5288020592368727841.a(i24 - g02, i32);
                }
            }
            i11 = (int) (a >> 32);
            int i40 = (int) (a & 4294967295L);
            i6 = i;
            if (i11 > i6 || i40 < min) {
                i15 = i20 + 1;
                if (i15 > i19) {
                    return i15;
                }
            } else {
                if (i11 >= i6) {
                    return i20;
                }
                i19 = i20 - 1;
            }
            size5 = i20;
            iArr3 = iArr2;
            r160850735461038790322 = r16085073546103879032;
            iArr4 = iArr;
            list5 = list2;
            i7 = 1;
            i2 = 0;
        }
        return size5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ac A[LOOP:1: B:104:0x03aa->B:105:0x03ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // dev.epro.r0.W10067852399966859634
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.H11646813293457574213 c(dev.epro.r0.I5164649337253478959 r52, java.util.List r53, long r54) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U14510755524476563575.c(dev.epro.r0.I5164649337253478959, java.util.List, long):dev.epro.r0.H11646813293457574213");
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        List list2 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list2 != null ? (G17613326942144185441) R9411874267597469228.D0(list2) : null;
        List list3 = (List) R9411874267597469228.E0(2, list);
        this.f.a(g17613326942144185441, list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null, O15160157444238005800.b(0, 0, 0, i, 7));
        List list4 = (List) R9411874267597469228.D0(list);
        if (list4 == null) {
            list4 = O2161699089510411363.a;
        }
        int g0 = j4720286603213127984.g0(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int a0 = ((G17613326942144185441) list4.get(i2)).a0(i) + g0;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + a0) - g0);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += a0;
            }
            i2 = i6;
        }
        return i3;
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        List list2 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list2 != null ? (G17613326942144185441) R9411874267597469228.D0(list2) : null;
        List list3 = (List) R9411874267597469228.E0(2, list);
        G17613326942144185441 g176133269421441854412 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
        long b = O15160157444238005800.b(0, i, 0, 0, 13);
        R16085073546103879032 r16085073546103879032 = this.f;
        r16085073546103879032.a(g17613326942144185441, g176133269421441854412, b);
        List list4 = (List) R9411874267597469228.D0(list);
        if (list4 == null) {
            list4 = O2161699089510411363.a;
        }
        return k(list4, i, j4720286603213127984.g0(this.c), j4720286603213127984.g0(this.e), r16085073546103879032);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U14510755524476563575)) {
            return false;
        }
        U14510755524476563575 u14510755524476563575 = (U14510755524476563575) obj;
        return this.a.equals(u14510755524476563575.a) && this.b.equals(u14510755524476563575.b) && A891803927997771281.b(this.c, u14510755524476563575.c) && this.d.equals(u14510755524476563575.d) && A891803927997771281.b(this.e, u14510755524476563575.e) && S10823041268949770285.t(this.f, u14510755524476563575.f);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int f(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.j0();
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final void g(int i, int[] iArr, int[] iArr2, I5164649337253478959 i5164649337253478959) {
        this.a.f(i5164649337253478959, i, iArr, i5164649337253478959.getLayoutDirection(), iArr2);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final long h(boolean z, int i, int i2, int i3) {
        G8839996886126338788 g8839996886126338788 = N12246959866253683127.a;
        return !z ? O15160157444238005800.a(i, i2, 0, i3) : C12265524002282074474.R(i, i2, 0, i3);
    }

    public final int hashCode() {
        return this.f.hashCode() + X2485016533998461232.f(Integer.MAX_VALUE, X2485016533998461232.f(Integer.MAX_VALUE, E12098517352909843120.e(this.e, (this.d.y.hashCode() + E12098517352909843120.e(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int i(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.d0();
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final H11646813293457574213 j(final Z17471428274427141949[] z17471428274427141949Arr, I5164649337253478959 i5164649337253478959, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final F10342546226345611902 f10342546226345611902 = F10342546226345611902.a;
        return i5164649337253478959.m(i2, i3, X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.H12171909894801451152
            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj) {
                B5998207562248239613 b5998207562248239613;
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    Z17471428274427141949 z17471428274427141949 = z17471428274427141949Arr[i9];
                    z17471428274427141949.getClass();
                    Object k = z17471428274427141949.k();
                    X1840570513157370182 x1840570513157370182 = k instanceof X1840570513157370182 ? (X1840570513157370182) k : null;
                    if (x1840570513157370182 == null || (b5998207562248239613 = x1840570513157370182.c) == null) {
                        b5998207562248239613 = this.d;
                    }
                    y2066038017114788875.g(z17471428274427141949, iArr[i9 - i8], b5998207562248239613.h(i3, z17471428274427141949.d0(), f10342546226345611902, z17471428274427141949, i) + i7, 0.0f);
                }
                return O9245300239821758723.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + A891803927997771281.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + A891803927997771281.c(this.e) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ")";
    }
}
