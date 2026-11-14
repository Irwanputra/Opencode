package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A9167907751125921746 implements dev.epro.r0.A10838822263452390785 {
    @Override // dev.epro.r0.A10838822263452390785
    public final int a(dev.epro.r0.J4720286603213127984 j4720286603213127984, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = java.lang.Integer.valueOf(((dev.epro.r0.G17613326942144185441) list.get(0)).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((dev.epro.r0.G17613326942144185441) list.get(i2)).b0(i));
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
    public final int b(dev.epro.r0.J4720286603213127984 j4720286603213127984, java.util.List list, int i) {
        int size = list.size();
        int iV = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iV += ((dev.epro.r0.G17613326942144185441) list.get(i2)).V(i);
        }
        return iV;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.M8821877208104636290 */
    @Override // dev.epro.r0.A10838822263452390785
    public final dev.epro.r0.H11646813293457574213 c(dev.epro.r0.I5164649337253478959 i5164649337253478959, java.util.List list, long j) throws dev.epro.r0.M8821877208104636290 {
        java.lang.Object obj;
        long j2;
        dev.epro.r0.Z17471428274427141949 z17471428274427141949D;
        java.lang.Object obj2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (dev.epro.r0.S10823041268949770285.t(dev.epro.r0.V1475975160983963926.y((dev.epro.r0.G17613326942144185441) obj), "leadingIcon")) {
                break;
            }
            i++;
        }
        dev.epro.r0.G17613326942144185441 g17613326942144185441 = (dev.epro.r0.G17613326942144185441) obj;
        if (g17613326942144185441 != null) {
            j2 = j;
            z17471428274427141949D = g17613326942144185441.d(dev.epro.r0.I16980768508151520658.b(j2, 0, 0, 0, 0, 10));
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
            if (dev.epro.r0.S10823041268949770285.t(dev.epro.r0.V1475975160983963926.y((dev.epro.r0.G17613326942144185441) obj2), "trailingIcon")) {
                break;
            }
            i4++;
        }
        dev.epro.r0.G17613326942144185441 g176133269421441854412 = (dev.epro.r0.G17613326942144185441) obj2;
        dev.epro.r0.Z17471428274427141949 z17471428274427141949D2 = g176133269421441854412 != null ? g176133269421441854412.d(dev.epro.r0.I16980768508151520658.b(j2, 0, 0, 0, 0, 10)) : null;
        int i5 = z17471428274427141949D2 != null ? z17471428274427141949D2.a : 0;
        int i6 = z17471428274427141949D2 != null ? z17471428274427141949D2.b : 0;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            dev.epro.r0.G17613326942144185441 g176133269421441854413 = (dev.epro.r0.G17613326942144185441) list.get(i7);
            if (dev.epro.r0.S10823041268949770285.t(dev.epro.r0.V1475975160983963926.y(g176133269421441854413), "label")) {
                dev.epro.r0.Z17471428274427141949 z17471428274427141949D3 = g176133269421441854413.d(dev.epro.r0.O15160157444238005800.j(-(i2 + i5), 0, 2, j2));
                int i8 = z17471428274427141949D3.a + i2 + i5;
                int iMax = java.lang.Math.max(i3, java.lang.Math.max(z17471428274427141949D3.b, i6));
                return i5164649337253478959.m(i8, iMax, dev.epro.r0.X9852054718446117252.a, new dev.epro.r0.N10577853939454473736(z17471428274427141949D, i3, iMax, z17471428274427141949D3, i2, z17471428274427141949D2, i6));
            }
        }
        throw dev.epro.r0.L11610354117192841236.z("Collection contains no element matching the predicate.");
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(dev.epro.r0.J4720286603213127984 j4720286603213127984, java.util.List list, int i) {
        int size = list.size();
        int iA0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA0 += ((dev.epro.r0.G17613326942144185441) list.get(i2)).a0(i);
        }
        return iA0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(dev.epro.r0.J4720286603213127984 j4720286603213127984, java.util.List list, int i) {
        java.lang.Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = java.lang.Integer.valueOf(((dev.epro.r0.G17613326942144185441) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((dev.epro.r0.G17613326942144185441) list.get(i2)).f(i));
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
