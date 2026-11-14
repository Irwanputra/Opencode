package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F8959376622598630503 implements A10838822263452390785 {
    public final /* synthetic */ K1246821697113442187 a;
    public final /* synthetic */ W1972671267364756056 b;
    public final /* synthetic */ L13471809889507924345 c;

    public F8959376622598630503(K1246821697113442187 k1246821697113442187, W1972671267364756056 w1972671267364756056, L13471809889507924345 l13471809889507924345) {
        this.a = k1246821697113442187;
        this.b = w1972671267364756056;
        this.c = l13471809889507924345;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        Integer numValueOf;
        long jB = I16980768508151520658.b(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((G17613326942144185441) list.get(i)).d(jB));
        }
        Integer num = null;
        int i2 = 1;
        if (arrayList.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((Z17471428274427141949) arrayList.get(0)).a);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i3 = 1;
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((Z17471428274427141949) arrayList.get(i3)).a);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i3 == size2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (!arrayList.isEmpty()) {
            Integer numValueOf3 = Integer.valueOf(((Z17471428274427141949) arrayList.get(0)).b);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((Z17471428274427141949) arrayList.get(i2)).b);
                    if (numValueOf4.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf4;
                    }
                    if (i2 == size3) {
                        break;
                    }
                    i2++;
                }
            }
            num = numValueOf3;
        }
        return i5164649337253478959.m(iIntValue, num != null ? num.intValue() : 0, X9852054718446117252.a, new T1990675634290586024(this.a, iIntValue, arrayList, this.b, this.c, (byte) 2));
    }
}
