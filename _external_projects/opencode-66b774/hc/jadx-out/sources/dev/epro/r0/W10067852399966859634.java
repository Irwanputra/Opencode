package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public interface W10067852399966859634 {
    default int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new D677275267896868264((G17613326942144185441) list2.get(i3), U3140718508945414721.a, F18165080265757059636.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new O8104569155564870270(j4720286603213127984, j4720286603213127984.getLayoutDirection()), arrayList2, O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }

    default int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new D677275267896868264((G17613326942144185441) list2.get(i3), U3140718508945414721.a, F18165080265757059636.a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new O8104569155564870270(j4720286603213127984, j4720286603213127984.getLayoutDirection()), arrayList2, O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j);

    default int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new D677275267896868264((G17613326942144185441) list2.get(i3), U3140718508945414721.b, F18165080265757059636.a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new O8104569155564870270(j4720286603213127984, j4720286603213127984.getLayoutDirection()), arrayList2, O15160157444238005800.b(0, 0, 0, i, 7)).g();
    }

    default int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new D677275267896868264((G17613326942144185441) list2.get(i3), U3140718508945414721.b, F18165080265757059636.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new O8104569155564870270(j4720286603213127984, j4720286603213127984.getLayoutDirection()), arrayList2, O15160157444238005800.b(0, i, 0, 0, 13)).d();
    }
}
