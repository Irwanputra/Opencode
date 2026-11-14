package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        long jA = B5288020592368727841.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            D15735805680132151670 d15735805680132151670 = new D15735805680132151670(r16085073546103879032, O15160157444238005800.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) R9411874267597469228.E0(0, list);
            int iB0 = g17613326942144185441 != null ? g17613326942144185441.b0(i) : 0;
            int iV = g17613326942144185441 != null ? g17613326942144185441.V(iB0) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (d15735805680132151670.b(z3, 0, B5288020592368727841.a(i, Integer.MAX_VALUE), g17613326942144185441 == null ? null : new B5288020592368727841(B5288020592368727841.a(iV, iB0)), 0, 0, 0, false, false).c) {
                r16085073546103879032.getClass();
                jA = jA;
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
                    int i12 = i6 - iV;
                    int i13 = i9 + 1;
                    int iMax = Math.max(i8, iB0);
                    G17613326942144185441 g176133269421441854412 = (G17613326942144185441) R9411874267597469228.E0(i13, list);
                    iB0 = g176133269421441854412 != null ? g176133269421441854412.b0(i) : 0;
                    int iV2 = g176133269421441854412 != null ? g176133269421441854412.V(iB0) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = iV2;
                    L18233974379278055712 l18233974379278055712B = d15735805680132151670.b(z2, i14, B5288020592368727841.a(i12, i4), g176133269421441854412 == null ? null : new B5288020592368727841(B5288020592368727841.a(iV2, iB0)), i15, i5, iMax, false, false);
                    if (l18233974379278055712B.b) {
                        int i17 = iMax + i3 + i5;
                        d15735805680132151670.a(l18233974379278055712B, g176133269421441854412 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (l18233974379278055712B.c) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iV = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        iV = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jA = B5288020592368727841.a(i5 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        List list2 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list2 != null ? (G17613326942144185441) R9411874267597469228.D0(list2) : null;
        List list3 = (List) R9411874267597469228.E0(2, list);
        G17613326942144185441 g176133269421441854412 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
        long jB = O15160157444238005800.b(0, i, 0, 0, 13);
        R16085073546103879032 r16085073546103879032 = this.f;
        r16085073546103879032.a(g17613326942144185441, g176133269421441854412, jB);
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
        long jA;
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
        int iG0 = j4720286603213127984.g0(this.c);
        int iG02 = j4720286603213127984.g0(this.e);
        long jA2 = B5288020592368727841.a(0, 0);
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
            int iV = g176133269421441854412.V(i6);
            iArr3[i8] = iV;
            iArr4[i8] = g176133269421441854412.b0(iV);
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
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += iArr3[i10];
        }
        int size5 = ((list5.size() - 1) * iG0) + i9;
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
                jA = jA2;
                iArr = iArr4;
                r16085073546103879032 = r160850735461038790322;
            } else {
                int i21 = i2;
                iArr = iArr4;
                r16085073546103879032 = r160850735461038790322;
                D15735805680132151670 d15735805680132151670 = new D15735805680132151670(r16085073546103879032, O15160157444238005800.a(i21, i20, i21, Integer.MAX_VALUE), iG0, iG02);
                G17613326942144185441 g176133269421441854413 = (G17613326942144185441) R9411874267597469228.E0(i21, list5);
                int i22 = g176133269421441854413 != null ? iArr[i21] : i21;
                int i23 = g176133269421441854413 != null ? iArr3[i21] : 0;
                boolean z = list5.size() > i7 ? i7 : 0;
                long jA3 = B5288020592368727841.a(i20, Integer.MAX_VALUE);
                if (g176133269421441854413 == null) {
                    iArr2 = iArr3;
                    b5288020592368727841 = null;
                } else {
                    iArr2 = iArr3;
                    b5288020592368727841 = new B5288020592368727841(B5288020592368727841.a(i23, i22));
                }
                int i24 = 0;
                if (d15735805680132151670.b(z, 0, jA3, b5288020592368727841, 0, 0, 0, false, false).c) {
                    r16085073546103879032.getClass();
                    list2 = list5;
                    jA = jA2;
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
                        int iMax = Math.max(i28, i31);
                        G17613326942144185441 g176133269421441854414 = (G17613326942144185441) R9411874267597469228.E0(i35, list5);
                        i31 = g176133269421441854414 != null ? iArr[i35] : 0;
                        if (g176133269421441854414 != null) {
                            i3 = i35;
                            i4 = iArr2[i35] + iG0;
                        } else {
                            i3 = i35;
                            i4 = 0;
                        }
                        list2 = list5;
                        int i36 = i3 - i29;
                        int i37 = i27;
                        L18233974379278055712 l18233974379278055712B = d15735805680132151670.b(i30 + 2 < list2.size(), i36, B5288020592368727841.a(i33, Integer.MAX_VALUE), g176133269421441854414 == null ? null : new B5288020592368727841(B5288020592368727841.a(i4, i31)), i37, i24, iMax, false, false);
                        if (l18233974379278055712B.b) {
                            int i38 = iMax + iG02 + i24;
                            d15735805680132151670.a(l18233974379278055712B, g176133269421441854414 != null, i37, i38, i33, i36);
                            int i39 = i4 - iG0;
                            i27 = i37 + 1;
                            if (l18233974379278055712B.c) {
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
                            i28 = iMax;
                            i5 = i29;
                        }
                        i29 = i5;
                        size6 = i34;
                        i30 = i3;
                        i32 = i30;
                        list5 = list2;
                    }
                    jA = B5288020592368727841.a(i24 - iG02, i32);
                }
            }
            i11 = (int) (jA >> 32);
            int i40 = (int) (jA & 4294967295L);
            i6 = i;
            if (i11 > i6 || i40 < iMin) {
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
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v7, types: [dev.epro.r0.Z17471428274427141949[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [dev.epro.r0.Z17471428274427141949[]] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // dev.epro.r0.W10067852399966859634
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        G17613326942144185441 g17613326942144185441;
        Iterator it;
        D389890677992184566 d389890677992184566;
        Z17471428274427141949 z17471428274427141949;
        B5288020592368727841 b5288020592368727841;
        L18233974379278055712 l18233974379278055712;
        int i;
        int i2;
        char c;
        ?? r8;
        G17613326942144185441 g176133269421441854412;
        G17613326942144185441 g176133269421441854413;
        G17613326942144185441 g176133269421441854414;
        B5288020592368727841 b52880205923687278412;
        Z17471428274427141949 z174714282744271419492;
        int i3;
        B5288020592368727841 b52880205923687278413;
        B5288020592368727841 b52880205923687278414;
        L18233974379278055712 l182339743792780557122;
        Integer numValueOf;
        long jA;
        long jA2;
        Z17471428274427141949 z17471428274427141949D;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (!zIsEmpty) {
            int iH = I16980768508151520658.h(j);
            R16085073546103879032 r16085073546103879032 = this.f;
            if (iH != 0) {
                List list2 = (List) R9411874267597469228.B0(list);
                if (list2.isEmpty()) {
                    return i5164649337253478959.m(0, 0, x9852054718446117252, new V10450421848591554621((byte) 26));
                }
                List list3 = (List) R9411874267597469228.E0(1, list);
                G17613326942144185441 g176133269421441854415 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
                List list4 = (List) R9411874267597469228.E0(2, list);
                G17613326942144185441 g176133269421441854416 = list4 != null ? (G17613326942144185441) R9411874267597469228.D0(list4) : null;
                list2.size();
                r16085073546103879032.getClass();
                T2980169321753815924 t2980169321753815924 = T2980169321753815924.a;
                long jH0 = K5751602218013079365.h0(K5751602218013079365.E(10, K5751602218013079365.D(j, t2980169321753815924)));
                if (g176133269421441854415 != null) {
                    if (Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854415)) == 0.0f) {
                        Q9282725956684299602.l(g176133269421441854415);
                        Z17471428274427141949 z17471428274427141949D2 = g176133269421441854415.d(jH0);
                        z17471428274427141949D2.j0();
                        z17471428274427141949D2.d0();
                        z17471428274427141949D2.j0();
                        z17471428274427141949D2.d0();
                    } else {
                        g176133269421441854415.b0(g176133269421441854415.V(Integer.MAX_VALUE));
                    }
                }
                if (g176133269421441854416 != null) {
                    if (Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854416)) == 0.0f) {
                        Q9282725956684299602.l(g176133269421441854416);
                        Z17471428274427141949 z17471428274427141949D3 = g176133269421441854416.d(jH0);
                        z17471428274427141949D3.j0();
                        z17471428274427141949D3.d0();
                        z17471428274427141949D3.j0();
                        z17471428274427141949D3.d0();
                    } else {
                        g176133269421441854416.b0(g176133269421441854416.V(Integer.MAX_VALUE));
                    }
                }
                Iterator it2 = list2.iterator();
                long jD = K5751602218013079365.D(j, t2980169321753815924);
                D389890677992184566 d3898906779921845662 = new D389890677992184566(0, new H11646813293457574213[16]);
                int i4 = I16980768508151520658.i(jD);
                int iK = I16980768508151520658.k(jD);
                int iH2 = I16980768508151520658.h(jD);
                Q9908018528090167751 q9908018528090167751 = C4240022152304578596.a;
                Q9908018528090167751 q99080185280901677512 = new Q9908018528090167751();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(i5164649337253478959.K(this.c));
                int iCeil2 = (int) Math.ceil(i5164649337253478959.K(this.e));
                long jA3 = O15160157444238005800.a(0, i4, 0, iH2);
                long jH02 = K5751602218013079365.h0(K5751602218013079365.E(14, jA3));
                if (it2.hasNext()) {
                    try {
                        g17613326942144185441 = (G17613326942144185441) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        g17613326942144185441 = null;
                    }
                } else {
                    g17613326942144185441 = null;
                }
                if (g17613326942144185441 != null) {
                    if (Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441)) == 0.0f) {
                        Q9282725956684299602.l(g17613326942144185441);
                        z17471428274427141949D = g17613326942144185441.d(jH02);
                        it = it2;
                        jA2 = B5288020592368727841.a(z17471428274427141949D.j0(), z17471428274427141949D.d0());
                    } else {
                        it = it2;
                        int iV = g17613326942144185441.V(Integer.MAX_VALUE);
                        G17613326942144185441 g176133269421441854417 = g17613326942144185441;
                        jA2 = B5288020592368727841.a(iV, g176133269421441854417.b0(iV));
                        g17613326942144185441 = g176133269421441854417;
                        z17471428274427141949D = null;
                    }
                    d389890677992184566 = d3898906779921845662;
                    b5288020592368727841 = new B5288020592368727841(jA2);
                    z17471428274427141949 = z17471428274427141949D;
                } else {
                    it = it2;
                    d389890677992184566 = d3898906779921845662;
                    z17471428274427141949 = null;
                    b5288020592368727841 = null;
                }
                Z17471428274427141949 z174714282744271419493 = z17471428274427141949;
                Integer numValueOf2 = b5288020592368727841 != null ? Integer.valueOf((int) (b5288020592368727841.a >> 32)) : null;
                Integer numValueOf3 = b5288020592368727841 != null ? Integer.valueOf((int) (b5288020592368727841.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                G17613326942144185441 g176133269421441854418 = g17613326942144185441;
                P12475571966978616537 p12475571966978616537 = new P12475571966978616537();
                R16085073546103879032 r160850735461038790322 = this.f;
                D15735805680132151670 d15735805680132151670 = new D15735805680132151670(r160850735461038790322, jD, iCeil, iCeil2);
                B5288020592368727841 b52880205923687278415 = b5288020592368727841;
                L18233974379278055712 l18233974379278055712B = d15735805680132151670.b(it.hasNext(), 0, B5288020592368727841.a(i4, iH2), b52880205923687278415, 0, 0, 0, false, false);
                if (l18233974379278055712B.c) {
                    l18233974379278055712 = l18233974379278055712B;
                    d15735805680132151670.a(l18233974379278055712, b52880205923687278415 != null, -1, 0, i4, 0);
                } else {
                    l18233974379278055712 = l18233974379278055712B;
                }
                int i5 = iK;
                L18233974379278055712 l182339743792780557123 = l18233974379278055712;
                int[] iArrCopyOf = iArr2;
                int i6 = i4;
                P12475571966978616537 p124755719669786165372 = p12475571966978616537;
                Z17471428274427141949 z174714282744271419494 = z174714282744271419493;
                Integer num = numValueOf2;
                G17613326942144185441 g176133269421441854419 = g176133269421441854418;
                int[] iArrCopyOf2 = iArr;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = iH2;
                while (!l182339743792780557123.c && g176133269421441854419 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    numValueOf3.getClass();
                    int iIntValue2 = numValueOf3.intValue();
                    int i16 = i8;
                    int i17 = i9 + iIntValue;
                    int iMax = Math.max(i13, iIntValue2);
                    int i18 = i6 - iIntValue;
                    int i19 = i7 + 1;
                    r160850735461038790322.getClass();
                    arrayList.add(g176133269421441854419);
                    q99080185280901677512.i(i7, z174714282744271419494);
                    g176133269421441854419.k();
                    int i20 = i19 - i10;
                    if (it.hasNext()) {
                        try {
                            g176133269421441854412 = (G17613326942144185441) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            g176133269421441854412 = null;
                        }
                        g176133269421441854413 = g176133269421441854412;
                    } else {
                        g176133269421441854413 = null;
                    }
                    if (g176133269421441854413 != null) {
                        if (Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854413)) == 0.0f) {
                            Q9282725956684299602.l(g176133269421441854413);
                            Z17471428274427141949 z17471428274427141949D4 = g176133269421441854413.d(jH02);
                            jA = B5288020592368727841.a(z17471428274427141949D4.j0(), z17471428274427141949D4.d0());
                            z174714282744271419492 = z17471428274427141949D4;
                            i7 = i19;
                            g176133269421441854414 = g176133269421441854413;
                        } else {
                            int iV2 = g176133269421441854413.V(Integer.MAX_VALUE);
                            jA = B5288020592368727841.a(iV2, g176133269421441854413.b0(iV2));
                            z174714282744271419492 = null;
                            g176133269421441854414 = g176133269421441854413;
                            i7 = i19;
                        }
                        b52880205923687278412 = new B5288020592368727841(jA);
                    } else {
                        g176133269421441854414 = g176133269421441854413;
                        i7 = i19;
                        b52880205923687278412 = null;
                        z174714282744271419492 = null;
                    }
                    Integer numValueOf4 = b52880205923687278412 != null ? Integer.valueOf(((int) (b52880205923687278412.a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = b52880205923687278412 != null ? Integer.valueOf((int) (b52880205923687278412.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i21 = i11;
                    long jA4 = B5288020592368727841.a(i18, i15);
                    if (b52880205923687278412 == null) {
                        i3 = i18;
                        b52880205923687278413 = b52880205923687278412;
                        b52880205923687278414 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue3 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        i3 = i18;
                        b52880205923687278413 = b52880205923687278412;
                        b52880205923687278414 = new B5288020592368727841(B5288020592368727841.a(iIntValue3, numValueOf5.intValue()));
                    }
                    L18233974379278055712 l18233974379278055712B2 = d15735805680132151670.b(zHasNext, i20, jA4, b52880205923687278414, i21, i12, iMax, false, false);
                    if (l18233974379278055712B2.b) {
                        int iMin = Math.min(Math.max(i5, i17), i4);
                        int i22 = i12 + iMax;
                        l182339743792780557122 = l18233974379278055712B2;
                        d15735805680132151670.a(l182339743792780557122, b52880205923687278413 != null, i21, i22, i3, i20);
                        int i23 = i16 + 1;
                        if (iArrCopyOf.length < i23) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i23, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i16] = iMax;
                        i8 = i16 + 1;
                        i15 = (iH2 - i22) - iCeil2;
                        int i24 = i14 + 1;
                        if (iArrCopyOf2.length < i24) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i24, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i14] = i7;
                        i14++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i11 = i21 + 1;
                        i12 = i22 + iCeil2;
                        i5 = iMin;
                        i3 = i4;
                        i10 = i7;
                        i13 = 0;
                        i9 = 0;
                    } else {
                        l182339743792780557122 = l18233974379278055712B2;
                        numValueOf = numValueOf4;
                        i11 = i21;
                        i13 = iMax;
                        i9 = i17;
                        i8 = i16;
                    }
                    numValueOf3 = numValueOf5;
                    g176133269421441854419 = g176133269421441854414;
                    z174714282744271419494 = z174714282744271419492;
                    i6 = i3;
                    num = numValueOf;
                    l182339743792780557123 = l182339743792780557122;
                }
                int i25 = i8;
                int size = arrayList.size();
                ?? r2 = new Z17471428274427141949[size];
                for (int i26 = 0; i26 < size; i26++) {
                    r2[i26] = q99080185280901677512.b(i26);
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int iMax2 = i5;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                ?? r22 = r2;
                while (i27 < i14) {
                    int i30 = iArrCopyOf2[i27];
                    if (i27 < 0 || i27 >= (i2 = i25)) {
                        W4415201450379021245.a("Index must be between 0 and size");
                        return null;
                    }
                    int iH3 = iArrCopyOf[i27];
                    P12475571966978616537 p124755719669786165373 = p124755719669786165372;
                    if (p124755719669786165373.c(i27)) {
                        r8 = r22;
                        c = 65535;
                    } else {
                        if (I16980768508151520658.h(jA3) == Integer.MAX_VALUE) {
                            iH3 = Integer.MAX_VALUE;
                            c = 65535;
                        } else {
                            iH3 = I16980768508151520658.h(jA3) - i29;
                            c = 65535;
                        }
                        r8 = r22;
                    }
                    int[] iArr5 = iArrCopyOf2;
                    p124755719669786165372 = p124755719669786165373;
                    int i31 = i14;
                    int i32 = i27;
                    H11646813293457574213 h11646813293457574213E = W7808703833045379622.E(this, iMax2, I16980768508151520658.j(jA3), I16980768508151520658.i(jA3), iH3, iCeil, i5164649337253478959, arrayList, r8, i28, i30, iArr3, i32);
                    int iG = h11646813293457574213E.g();
                    int iD = h11646813293457574213E.d();
                    iArr4[i32] = iD;
                    iMax2 = Math.max(iMax2, iG);
                    d389890677992184566.b(h11646813293457574213E);
                    int i33 = i32 + 1;
                    i28 = i30;
                    i25 = i2;
                    i14 = i31;
                    iArrCopyOf = iArrCopyOf;
                    iArrCopyOf2 = iArr5;
                    i29 += iD;
                    i27 = i33;
                    r22 = r8;
                }
                int i34 = i29;
                D389890677992184566 d3898906779921845663 = d389890677992184566;
                if (d3898906779921845663.c == 0) {
                    iMax2 = 0;
                    i = 0;
                } else {
                    i = i34;
                }
                A6527624962738679687 a6527624962738679687 = this.b;
                int iG0 = ((d3898906779921845663.c - 1) * i5164649337253478959.g0(a6527624962738679687.a())) + i;
                int iJ = I16980768508151520658.j(jD);
                int iH4 = I16980768508151520658.h(jD);
                if (iG0 < iJ) {
                    iG0 = iJ;
                }
                if (iG0 <= iH4) {
                    iH4 = iG0;
                }
                a6527624962738679687.o(i5164649337253478959, iH4, iArr4, iArr3);
                int iK2 = I16980768508151520658.k(jD);
                int i35 = I16980768508151520658.i(jD);
                if (iMax2 < iK2) {
                    iMax2 = iK2;
                }
                if (iMax2 <= i35) {
                    i35 = iMax2;
                }
                return i5164649337253478959.m(i35, iH4, x9852054718446117252, new S16262227471297796850(d3898906779921845663, (byte) 0));
            }
            r16085073546103879032.getClass();
        }
        return i5164649337253478959.m(0, 0, x9852054718446117252, new V10450421848591554621((byte) 25));
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
        int iG0 = j4720286603213127984.g0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iA0 = ((G17613326942144185441) list4.get(i2)).a0(i) + iG0;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iA0) - iG0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iA0;
            }
            i2 = i5;
        }
        return iMax;
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        List list2 = (List) R9411874267597469228.E0(1, list);
        G17613326942144185441 g17613326942144185441 = list2 != null ? (G17613326942144185441) R9411874267597469228.D0(list2) : null;
        List list3 = (List) R9411874267597469228.E0(2, list);
        G17613326942144185441 g176133269421441854412 = list3 != null ? (G17613326942144185441) R9411874267597469228.D0(list3) : null;
        long jB = O15160157444238005800.b(0, i, 0, 0, 13);
        R16085073546103879032 r16085073546103879032 = this.f;
        r16085073546103879032.a(g17613326942144185441, g176133269421441854412, jB);
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
                    Object objK = z17471428274427141949.k();
                    X1840570513157370182 x1840570513157370182 = objK instanceof X1840570513157370182 ? (X1840570513157370182) objK : null;
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
