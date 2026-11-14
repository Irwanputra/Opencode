package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D6392886337358301635 implements A10838822263452390785 {
    public final boolean a;
    public final O8448855611469183895 b;
    public final V1146169337721842405 c;
    public final T1241271073913685060 d;
    public final float e;

    public D6392886337358301635(boolean z, O8448855611469183895 o8448855611469183895, V1146169337721842405 v1146169337721842405, T1241271073913685060 t1241271073913685060, float f) {
        this.a = z;
        this.b = o8448855611469183895;
        this.c = v1146169337721842405;
        this.d = t1241271073913685060;
        this.e = f;
    }

    public static int h(List list, int i, L12639328004344855510 l12639328004344855510) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj7), "TextField")) {
                int intValue = ((Number) l12639328004344855510.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                G17613326942144185441 g17613326942144185441 = (G17613326942144185441) obj2;
                int intValue2 = g17613326942144185441 != null ? ((Number) l12639328004344855510.invoke(g17613326942144185441, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                G17613326942144185441 g176133269421441854412 = (G17613326942144185441) obj3;
                int intValue3 = g176133269421441854412 != null ? ((Number) l12639328004344855510.invoke(g176133269421441854412, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                G17613326942144185441 g176133269421441854413 = (G17613326942144185441) obj4;
                int intValue4 = g176133269421441854413 != null ? ((Number) l12639328004344855510.invoke(g176133269421441854413, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                G17613326942144185441 g176133269421441854414 = (G17613326942144185441) obj5;
                int intValue5 = g176133269421441854414 != null ? ((Number) l12639328004344855510.invoke(g176133269421441854414, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                G17613326942144185441 g176133269421441854415 = (G17613326942144185441) obj6;
                int intValue6 = g176133269421441854415 != null ? ((Number) l12639328004344855510.invoke(g176133269421441854415, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                G17613326942144185441 g176133269421441854416 = (G17613326942144185441) obj;
                int i9 = intValue4 + intValue5;
                return O15160157444238005800.g(Math.max(intValue + i9, Math.max((g176133269421441854416 != null ? ((Number) l12639328004344855510.invoke(g176133269421441854416, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, O15160157444238005800.b(0, 0, 0, 0, 15));
            }
        }
        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
    }

    public static final int i(D6392886337358301635 d6392886337358301635, int i, int i2, Z17471428274427141949 z17471428274427141949) {
        return d6392886337358301635.a ? Math.round(((i - z17471428274427141949.b) / 2.0f) * 1.0f) : i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        return g(j4720286603213127984, list, i, new R15397193384711361242((byte) 23));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        return h(list, i, new R15397193384711361242((byte) 21));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(final I5164649337253478959 i5164649337253478959, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Z17471428274427141949 z17471428274427141949;
        Object obj4;
        int i2;
        Z17471428274427141949 z174714282744271419492;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        Z17471428274427141949 z174714282744271419493;
        int i4;
        int i5;
        int i6;
        int i7;
        Z17471428274427141949 z174714282744271419494;
        int i8;
        Z17471428274427141949 z174714282744271419495;
        int i9;
        Z17471428274427141949 z174714282744271419496;
        int i10;
        float f;
        Z17471428274427141949 z174714282744271419497;
        A7209497065939201693 a7209497065939201693;
        int i11;
        Z17471428274427141949 z174714282744271419498;
        Z17471428274427141949 z174714282744271419499;
        int i12;
        int i13;
        D6392886337358301635 d6392886337358301635;
        int i14;
        float invoke = this.c.invoke();
        T1241271073913685060 t1241271073913685060 = this.d;
        final int g0 = i5164649337253478959.g0(t1241271073913685060.b());
        int g02 = i5164649337253478959.g0(t1241271073913685060.a());
        long b = I16980768508151520658.b(j, 0, 0, 0, 0, 10);
        int size = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i15);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj), "Leading")) {
                break;
            }
            i15++;
        }
        G17613326942144185441 g17613326942144185441 = (G17613326942144185441) obj;
        Z17471428274427141949 d = g17613326942144185441 != null ? g17613326942144185441.d(b) : null;
        int i16 = d != null ? d.a : 0;
        int max = Math.max(0, d != null ? d.b : 0);
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i17);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj2), "Trailing")) {
                break;
            }
            i17++;
        }
        G17613326942144185441 g176133269421441854412 = (G17613326942144185441) obj2;
        Z17471428274427141949 d2 = g176133269421441854412 != null ? g176133269421441854412.d(O15160157444238005800.j(-i16, 0, 2, b)) : null;
        int i18 = i16 + (d2 != null ? d2.a : 0);
        int max2 = Math.max(max, d2 != null ? d2.b : 0);
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i19);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj3), "Prefix")) {
                break;
            }
            i19++;
        }
        G17613326942144185441 g176133269421441854413 = (G17613326942144185441) obj3;
        if (g176133269421441854413 != null) {
            i = i18;
            z17471428274427141949 = g176133269421441854413.d(O15160157444238005800.j(-i18, 0, 2, b));
        } else {
            i = i18;
            z17471428274427141949 = null;
        }
        int i20 = (z17471428274427141949 != null ? z17471428274427141949.a : 0) + i;
        int max3 = Math.max(max2, z17471428274427141949 != null ? z17471428274427141949.b : 0);
        int size4 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i21);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj4), "Suffix")) {
                break;
            }
            i21++;
        }
        G17613326942144185441 g176133269421441854414 = (G17613326942144185441) obj4;
        if (g176133269421441854414 != null) {
            i2 = i20;
            z174714282744271419492 = g176133269421441854414.d(O15160157444238005800.j(-i20, 0, 2, b));
        } else {
            i2 = i20;
            z174714282744271419492 = null;
        }
        int i22 = i2 + (z174714282744271419492 != null ? z174714282744271419492.a : 0);
        int max4 = Math.max(max3, z174714282744271419492 != null ? z174714282744271419492.b : 0);
        int size5 = list.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i23);
            int i24 = size5;
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj5), "Label")) {
                break;
            }
            i23++;
            size5 = i24;
        }
        G17613326942144185441 g176133269421441854415 = (G17613326942144185441) obj5;
        A7209497065939201693 a72094970659392016932 = new A7209497065939201693();
        int i25 = -i22;
        a72094970659392016932.a = g176133269421441854415 != null ? g176133269421441854415.d(O15160157444238005800.i(i25, b, -g02)) : null;
        int size6 = list.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i3 = g02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i26);
            i3 = g02;
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj6), "Supporting")) {
                break;
            }
            i26++;
            g02 = i3;
        }
        G17613326942144185441 g176133269421441854416 = (G17613326942144185441) obj6;
        int b0 = g176133269421441854416 != null ? g176133269421441854416.b0(I16980768508151520658.k(j)) : 0;
        Z17471428274427141949 z1747142827442714194910 = (Z17471428274427141949) a72094970659392016932.a;
        int i27 = g0 + (z1747142827442714194910 != null ? z1747142827442714194910.b : 0);
        long i28 = O15160157444238005800.i(i25, I16980768508151520658.b(j, 0, 0, 0, 0, 11), ((-i27) - i3) - b0);
        int size7 = list.size();
        int i29 = 0;
        while (i29 < size7) {
            int i30 = i27;
            G17613326942144185441 g176133269421441854417 = (G17613326942144185441) list.get(i29);
            int i31 = size7;
            float f2 = invoke;
            if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854417), "TextField")) {
                Z17471428274427141949 d3 = g176133269421441854417.d(i28);
                long b2 = I16980768508151520658.b(i28, 0, 0, 0, 0, 14);
                int size8 = list.size();
                int i32 = 0;
                while (true) {
                    if (i32 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i32);
                    int i33 = size8;
                    int i34 = i32;
                    if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj7), "Hint")) {
                        break;
                    }
                    i32 = i34 + 1;
                    size8 = i33;
                }
                G17613326942144185441 g176133269421441854418 = (G17613326942144185441) obj7;
                Z17471428274427141949 d4 = g176133269421441854418 != null ? g176133269421441854418.d(b2) : null;
                int max5 = Math.max(max4, Math.max(d3.b, d4 != null ? d4.b : 0) + i30 + i3);
                int i35 = d != null ? d.a : 0;
                int i36 = d2 != null ? d2.a : 0;
                int i37 = z17471428274427141949 != null ? z17471428274427141949.a : 0;
                int i38 = z174714282744271419492 != null ? z174714282744271419492.a : 0;
                int i39 = i36;
                int i40 = d3.a;
                Z17471428274427141949 z1747142827442714194911 = (Z17471428274427141949) a72094970659392016932.a;
                int i41 = i37 + i38;
                int g = O15160157444238005800.g(Math.max(i40 + i41, Math.max((d4 != null ? d4.a : 0) + i41, z1747142827442714194911 != null ? z1747142827442714194911.a : 0)) + i35 + i39, j);
                Z17471428274427141949 d5 = g176133269421441854416 != null ? g176133269421441854416.d(I16980768508151520658.b(O15160157444238005800.j(0, -max5, 1, b), 0, g, 0, 0, 9)) : null;
                int i42 = d5 != null ? d5.b : 0;
                int i43 = d3.b;
                Z17471428274427141949 z1747142827442714194912 = (Z17471428274427141949) a72094970659392016932.a;
                int i44 = z1747142827442714194912 != null ? z1747142827442714194912.b : 0;
                int i45 = d != null ? d.b : 0;
                if (d2 != null) {
                    z174714282744271419493 = d;
                    i4 = i44;
                    i5 = d2.b;
                } else {
                    z174714282744271419493 = d;
                    i4 = i44;
                    i5 = 0;
                }
                if (z17471428274427141949 != null) {
                    i6 = i45;
                    i7 = z17471428274427141949.b;
                } else {
                    i6 = i45;
                    i7 = 0;
                }
                final Z17471428274427141949 z1747142827442714194913 = d2;
                if (z174714282744271419492 != null) {
                    z174714282744271419494 = z17471428274427141949;
                    i8 = z174714282744271419492.b;
                } else {
                    z174714282744271419494 = z17471428274427141949;
                    i8 = 0;
                }
                if (d4 != null) {
                    Z17471428274427141949 z1747142827442714194914 = z174714282744271419493;
                    i9 = d4.b;
                    z174714282744271419495 = z1747142827442714194914;
                } else {
                    z174714282744271419495 = z174714282744271419493;
                    i9 = 0;
                }
                if (d5 != null) {
                    z174714282744271419497 = z174714282744271419495;
                    z174714282744271419496 = z174714282744271419492;
                    i10 = i6;
                    f = f2;
                    a7209497065939201693 = a72094970659392016932;
                    i11 = d5.b;
                    z174714282744271419498 = d4;
                    z174714282744271419499 = d5;
                    i12 = g;
                    i13 = 0;
                    i14 = i43;
                    d6392886337358301635 = this;
                } else {
                    z174714282744271419496 = z174714282744271419492;
                    i10 = i6;
                    f = f2;
                    z174714282744271419497 = z174714282744271419495;
                    a7209497065939201693 = a72094970659392016932;
                    i11 = 0;
                    z174714282744271419498 = d4;
                    z174714282744271419499 = d5;
                    i12 = g;
                    i13 = 0;
                    d6392886337358301635 = this;
                    i14 = i43;
                }
                final int f3 = d6392886337358301635.f(i5164649337253478959, i14, i4, i10, i5, i7, i8, i9, i11, j, f);
                final int i46 = f3 - i42;
                int size9 = list.size();
                int i47 = i13;
                while (i47 < size9) {
                    G17613326942144185441 g176133269421441854419 = (G17613326942144185441) list.get(i47);
                    if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854419), "Container")) {
                        final Z17471428274427141949 d6 = g176133269421441854419.d(O15160157444238005800.a(i12 != Integer.MAX_VALUE ? i12 : i13, i12, i46 != Integer.MAX_VALUE ? i46 : i13, i46));
                        final int i48 = i12;
                        final float f4 = f;
                        final Z17471428274427141949 z1747142827442714194915 = d3;
                        final Z17471428274427141949 z1747142827442714194916 = z174714282744271419497;
                        final Z17471428274427141949 z1747142827442714194917 = z174714282744271419496;
                        final A7209497065939201693 a72094970659392016933 = a7209497065939201693;
                        final Z17471428274427141949 z1747142827442714194918 = z174714282744271419494;
                        final Z17471428274427141949 z1747142827442714194919 = z174714282744271419498;
                        final Z17471428274427141949 z1747142827442714194920 = z174714282744271419499;
                        return i5164649337253478959.m(i48, f3, X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.G16205657897799805699
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
                            @Override // dev.epro.r0.F4096073349764486348
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r23) {
                                /*
                                    Method dump skipped, instructions count: 499
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G16205657897799805699.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                    i47++;
                    i46 = i46;
                    d3 = d3;
                }
                throw L11610354117192841236.z("Collection contains no element matching the predicate.");
            }
            invoke = f2;
            i29++;
            d = d;
            size7 = i31;
            i27 = i30;
        }
        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        return h(list, i, new R15397193384711361242((byte) 22));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        return g(j4720286603213127984, list, i, new R15397193384711361242((byte) 24));
    }

    public final int f(R8540738700654750557 r8540738700654750557, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        T1241271073913685060 t1241271073913685060 = this.d;
        int g0 = r8540738700654750557.g0(t1241271073913685060.a() + t1241271073913685060.b());
        int[] iArr = {i7, i5, i6, V933048422416352811.y(f, i2, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return O15160157444238005800.f(Math.max(i3, Math.max(i4, g0 + (i2 > 0 ? Math.max(r8540738700654750557.g0(this.e * 2.0f), V933048422416352811.y(R16184552786947960713.a.c(f), 0, i2)) : 0) + i)) + i8, j);
    }

    public final int g(J4720286603213127984 j4720286603213127984, List list, int i, L12639328004344855510 l12639328004344855510) {
        Object obj;
        int i2;
        int i3;
        int i4;
        Object obj2;
        int i5;
        Object obj3;
        Object obj4;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj), "Leading")) {
                break;
            }
            i8++;
        }
        G17613326942144185441 g17613326942144185441 = (G17613326942144185441) obj;
        if (g17613326942144185441 != null) {
            i2 = i;
            i4 = B5998207562248239613.N(i2, g17613326942144185441.a0(Integer.MAX_VALUE));
            i3 = ((Number) l12639328004344855510.invoke(g17613326942144185441, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = 0;
            i4 = i2;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        G17613326942144185441 g176133269421441854412 = (G17613326942144185441) obj2;
        if (g176133269421441854412 != null) {
            i4 = B5998207562248239613.N(i4, g176133269421441854412.a0(Integer.MAX_VALUE));
            i5 = ((Number) l12639328004344855510.invoke(g176133269421441854412, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (G17613326942144185441) obj3;
        int intValue = obj8 != null ? ((Number) l12639328004344855510.invoke(obj8, Integer.valueOf(i4))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        G17613326942144185441 g176133269421441854413 = (G17613326942144185441) obj4;
        if (g176133269421441854413 != null) {
            int intValue2 = ((Number) l12639328004344855510.invoke(g176133269421441854413, Integer.valueOf(i4))).intValue();
            i4 = B5998207562248239613.N(i4, g176133269421441854413.a0(Integer.MAX_VALUE));
            i6 = intValue2;
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        G17613326942144185441 g176133269421441854414 = (G17613326942144185441) obj5;
        if (g176133269421441854414 != null) {
            int intValue3 = ((Number) l12639328004344855510.invoke(g176133269421441854414, Integer.valueOf(i4))).intValue();
            i4 = B5998207562248239613.N(i4, g176133269421441854414.a0(Integer.MAX_VALUE));
            i7 = intValue3;
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        for (int i13 = 0; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj9), "TextField")) {
                int intValue4 = ((Number) l12639328004344855510.invoke(obj9, Integer.valueOf(i4))).intValue();
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (G17613326942144185441) obj6;
                int intValue5 = obj10 != null ? ((Number) l12639328004344855510.invoke(obj10, Integer.valueOf(i4))).intValue() : 0;
                int size8 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (S10823041268949770285.t(B5998207562248239613.u((G17613326942144185441) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (G17613326942144185441) obj7;
                return f(j4720286603213127984, intValue4, intValue, i3, i5, i6, i7, intValue5, obj11 != null ? ((Number) l12639328004344855510.invoke(obj11, Integer.valueOf(i2))).intValue() : 0, O15160157444238005800.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
    }
}
