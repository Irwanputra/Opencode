package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A9167907751125921746 implements A10838822263452390785 {
    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).b0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((G17613326942144185441) list.get(i3)).V(i);
        }
        return i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        Object obj;
        long j2;
        Z17471428274427141949 z17471428274427141949;
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
            z17471428274427141949 = g17613326942144185441.d(I16980768508151520658.b(j2, 0, 0, 0, 0, 10));
        } else {
            j2 = j;
            z17471428274427141949 = null;
        }
        int i2 = z17471428274427141949 != null ? z17471428274427141949.a : 0;
        int i3 = z17471428274427141949 != null ? z17471428274427141949.b : 0;
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
        final Z17471428274427141949 d = g176133269421441854412 != null ? g176133269421441854412.d(I16980768508151520658.b(j2, 0, 0, 0, 0, 10)) : null;
        int i5 = d != null ? d.a : 0;
        final int i6 = d != null ? d.b : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            G17613326942144185441 g176133269421441854413 = (G17613326942144185441) list.get(i7);
            if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854413), "label")) {
                final Z17471428274427141949 d2 = g176133269421441854413.d(O15160157444238005800.j(-(i2 + i5), 0, 2, j2));
                int i8 = d2.a + i2 + i5;
                final int max = Math.max(i3, Math.max(d2.b, i6));
                final Z17471428274427141949 z174714282744271419492 = z17471428274427141949;
                final int i9 = i2;
                final int i10 = i3;
                return i5164649337253478959.m(i8, max, X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.N10577853939454473736
                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj3) {
                        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj3;
                        Z17471428274427141949 z174714282744271419493 = Z17471428274427141949.this;
                        int i11 = max;
                        if (z174714282744271419493 != null) {
                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419493, 0, Math.round(((i11 - i10) / 2.0f) * 1.0f));
                        }
                        Z17471428274427141949 z174714282744271419494 = d2;
                        int i12 = i9;
                        Y2066038017114788875.j(y2066038017114788875, z174714282744271419494, i12, 0);
                        Z17471428274427141949 z174714282744271419495 = d;
                        if (z174714282744271419495 != null) {
                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419495, i12 + z174714282744271419494.a, Math.round(((i11 - i6) / 2.0f) * 1.0f));
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
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((G17613326942144185441) list.get(i3)).a0(i);
        }
        return i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).f(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
