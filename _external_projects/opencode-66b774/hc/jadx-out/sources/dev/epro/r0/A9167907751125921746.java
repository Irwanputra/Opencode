package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A9167907751125921746 implements A10838822263452390785 {
    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).b0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int size = list.size();
        int iV = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iV += ((G17613326942144185441) list.get(i2)).V(i);
        }
        return iV;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        Object obj;
        long j2;
        Z17471428274427141949 z17471428274427141949D;
        Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        G17613326942144185441 g17613326942144185441 = (G17613326942144185441) obj;
        if (g17613326942144185441 != null) {
            j2 = j;
            z17471428274427141949D = g17613326942144185441.d(I16980768508151520658.b(j2, 0, 0, 0, 0, 10));
        } else {
            j2 = j;
            z17471428274427141949D = null;
        }
        int i2 = z17471428274427141949D != null ? z17471428274427141949D.a : 0;
        int i3 = z17471428274427141949D != null ? z17471428274427141949D.b : 0;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (S10823041268949770285.t(V1475975160983963926.y((G17613326942144185441) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        G17613326942144185441 g176133269421441854412 = (G17613326942144185441) obj2;
        final Z17471428274427141949 z17471428274427141949D2 = g176133269421441854412 != null ? g176133269421441854412.d(I16980768508151520658.b(j2, 0, 0, 0, 0, 10)) : null;
        int i5 = z17471428274427141949D2 != null ? z17471428274427141949D2.a : 0;
        final int i6 = z17471428274427141949D2 != null ? z17471428274427141949D2.b : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            G17613326942144185441 g176133269421441854413 = (G17613326942144185441) list.get(i7);
            if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854413), "label")) {
                final Z17471428274427141949 z17471428274427141949D3 = g176133269421441854413.d(O15160157444238005800.j(-(i2 + i5), 0, 2, j2));
                int i8 = z17471428274427141949D3.a + i2 + i5;
                final int iMax = Math.max(i3, Math.max(z17471428274427141949D3.b, i6));
                final Z17471428274427141949 z17471428274427141949 = z17471428274427141949D;
                final int i9 = i2;
                final int i10 = i3;
                return i5164649337253478959.m(i8, iMax, X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.N10577853939454473736
                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj3) {
                        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj3;
                        Z17471428274427141949 z174714282744271419492 = z17471428274427141949;
                        int i11 = iMax;
                        if (z174714282744271419492 != null) {
                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419492, 0, Math.round(((i11 - i10) / 2.0f) * 1.0f));
                        }
                        Z17471428274427141949 z174714282744271419493 = z17471428274427141949D3;
                        int i12 = i9;
                        Y2066038017114788875.j(y2066038017114788875, z174714282744271419493, i12, 0);
                        Z17471428274427141949 z174714282744271419494 = z17471428274427141949D2;
                        if (z174714282744271419494 != null) {
                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419494, i12 + z174714282744271419493.a, Math.round(((i11 - i6) / 2.0f) * 1.0f));
                        }
                        return O9245300239821758723.a;
                    }
                });
            }
        }
        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += ((G17613326942144185441) list.get(i2)).a0(i);
        }
        return iA0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
