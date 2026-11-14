package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E8725686959797322599 implements A10838822263452390785 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ E8725686959797322599(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        H9390398899829886498 h9390398899829886498;
        byte b = this.a;
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((O10311700946806650263) obj).setParentLayoutDirection((F10342546226345611902) obj2);
                return i5164649337253478959.m(0, 0, x9852054718446117252, new M14716691558468128220((byte) 21));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = list.get(i3);
                    if (!(((G17613326942144185441) obj3).k() instanceof Z9252984664652542715)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((B13729205492206812220) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        S6349823729575121924 s6349823729575121924 = (S6349823729575121924) list2.get(i4);
                        if (s6349823729575121924 != null) {
                            float f = s6349823729575121924.b;
                            float f2 = s6349823729575121924.a;
                            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) arrayList2.get(i4);
                            int iFloor = (int) Math.floor(s6349823729575121924.c - f2);
                            float f3 = s6349823729575121924.d - f;
                            i = size2;
                            i2 = i4;
                            h9390398899829886498 = new H9390398899829886498(g17613326942144185441.d(O15160157444238005800.b(0, iFloor, 0, (int) Math.floor(f3), 5)), new Q2551293802323679034((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            i = size2;
                            i2 = i4;
                            h9390398899829886498 = null;
                        }
                        if (h9390398899829886498 != null) {
                            arrayList3.add(h9390398899829886498);
                        }
                        i4 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Object obj4 = list.get(i5);
                    if (((G17613326942144185441) obj4).k() instanceof Z9252984664652542715) {
                        arrayList4.add(obj4);
                    }
                }
                return i5164649337253478959.m(I16980768508151520658.i(j), I16980768508151520658.h(j), x9852054718446117252, new Y14986451238933639207(arrayList, B5998207562248239613.B(arrayList4, (B13729205492206812220) obj), (byte) 2));
        }
    }
}
