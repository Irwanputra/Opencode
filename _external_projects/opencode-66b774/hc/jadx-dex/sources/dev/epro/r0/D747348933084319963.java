package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D747348933084319963 implements dev.epro.r0.W10067852399966859634 {
    public final /* synthetic */ dev.epro.r0.H8673207839164499646 a;

    public D747348933084319963(dev.epro.r0.H8673207839164499646 h8673207839164499646) {
        this.a = h8673207839164499646;
    }

    public final dev.epro.r0.H11646813293457574213 c(dev.epro.r0.I5164649337253478959 i5164649337253478959, java.util.List list, long j) {
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.List list2 = (java.util.List) arrayList.get(0);
        java.util.List list3 = (java.util.List) arrayList.get(1);
        java.util.List list4 = (java.util.List) arrayList.get(2);
        int i = dev.epro.r0.I16980768508151520658.i(j);
        int size = list2.size();
        dev.epro.r0.A8284336046188466534 a8284336046188466534 = new dev.epro.r0.A8284336046188466534();
        if (size > 0) {
            a8284336046188466534.a = i / size;
        }
        java.lang.Integer numValueOf = 0;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(((dev.epro.r0.G17613326942144185441) list2.get(i2)).f(a8284336046188466534.a), numValueOf.intValue()));
        }
        int iIntValue = numValueOf.intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            dev.epro.r0.A891803927997771281 a891803927997771281 = new dev.epro.r0.A891803927997771281(i5164649337253478959.M0(java.lang.Math.min(((dev.epro.r0.G17613326942144185441) list2.get(i3)).a0(iIntValue), a8284336046188466534.a)) - (dev.epro.r0.F9678537450618663970.b * 2.0f));
            dev.epro.r0.A891803927997771281 a8918039279977712812 = new dev.epro.r0.A891803927997771281(24.0f);
            if (a891803927997771281.compareTo(a8918039279977712812) < 0) {
                a891803927997771281 = a8918039279977712812;
            }
            arrayList2.add(new dev.epro.r0.L14897752529553991041(i5164649337253478959.M0(a8284336046188466534.a) * i3, i5164649337253478959.M0(a8284336046188466534.a), a891803927997771281.a));
        }
        this.a.a.setValue(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            dev.epro.r0.G17613326942144185441 g17613326942144185441 = (dev.epro.r0.G17613326942144185441) list2.get(i4);
            int i5 = a8284336046188466534.a;
            arrayList3.add(g17613326942144185441.d(dev.epro.r0.I16980768508151520658.a(i5, i5, iIntValue, iIntValue)));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(list3.size());
        int i6 = 0;
        for (int size4 = list3.size(); i6 < size4; size4 = size4) {
            arrayList4.add(((dev.epro.r0.G17613326942144185441) list3.get(i6)).d(dev.epro.r0.I16980768508151520658.b(j, 0, 0, 0, 0, 11)));
            i6++;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList(list4.size());
        int size5 = list4.size();
        for (int i7 = 0; i7 < size5; i7++) {
            dev.epro.r0.G17613326942144185441 g176133269421441854412 = (dev.epro.r0.G17613326942144185441) list4.get(i7);
            int i8 = a8284336046188466534.a;
            arrayList5.add(g176133269421441854412.d(dev.epro.r0.I16980768508151520658.a(i8, i8, 0, iIntValue)));
        }
        return i5164649337253478959.m(i, iIntValue, dev.epro.r0.X9852054718446117252.a, new dev.epro.r0.T1990675634290586024(arrayList3, arrayList4, arrayList5, a8284336046188466534, iIntValue));
    }
}
