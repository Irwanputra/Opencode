package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D747348933084319963 implements W10067852399966859634 {
    public final /* synthetic */ H8673207839164499646 a;

    public D747348933084319963(H8673207839164499646 h8673207839164499646) {
        this.a = h8673207839164499646;
    }

    @Override // dev.epro.r0.W10067852399966859634
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        int i = I16980768508151520658.i(j);
        int size = list2.size();
        A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        if (size > 0) {
            a8284336046188466534.a = i / size;
        }
        Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(((G17613326942144185441) list2.get(i2)).f(a8284336046188466534.a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            A891803927997771281 a891803927997771281 = new A891803927997771281(i5164649337253478959.M0(Math.min(((G17613326942144185441) list2.get(i3)).a0(iIntValue), a8284336046188466534.a)) - (F9678537450618663970.b * 2.0f));
            A891803927997771281 a8918039279977712812 = new A891803927997771281(24.0f);
            if (a891803927997771281.compareTo(a8918039279977712812) < 0) {
                a891803927997771281 = a8918039279977712812;
            }
            arrayList2.add(new L14897752529553991041(i5164649337253478959.M0(a8284336046188466534.a) * i3, i5164649337253478959.M0(a8284336046188466534.a), a891803927997771281.a));
        }
        this.a.a.setValue(arrayList2);
        ArrayList arrayList3 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list2.get(i4);
            int i5 = a8284336046188466534.a;
            arrayList3.add(g17613326942144185441.d(I16980768508151520658.a(i5, i5, iIntValue, iIntValue)));
        }
        ArrayList arrayList4 = new ArrayList(list3.size());
        int i6 = 0;
        for (int size4 = list3.size(); i6 < size4; size4 = size4) {
            arrayList4.add(((G17613326942144185441) list3.get(i6)).d(I16980768508151520658.b(j, 0, 0, 0, 0, 11)));
            i6++;
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list4.get(i7);
            int i8 = a8284336046188466534.a;
            arrayList5.add(g176133269421441854412.d(I16980768508151520658.a(i8, i8, 0, iIntValue)));
        }
        return i5164649337253478959.m(i, iIntValue, X9852054718446117252.a, new T1990675634290586024(arrayList3, arrayList4, arrayList5, a8284336046188466534, iIntValue));
    }
}
