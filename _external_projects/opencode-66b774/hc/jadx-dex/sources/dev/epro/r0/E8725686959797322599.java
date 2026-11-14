package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E8725686959797322599 implements dev.epro.r0.A10838822263452390785 {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public /* synthetic */ E8725686959797322599(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final dev.epro.r0.H11646813293457574213 c(dev.epro.r0.I5164649337253478959 i5164649337253478959, java.util.List list, long j) {
        java.util.ArrayList arrayList;
        int i;
        int i2;
        dev.epro.r0.H9390398899829886498 h9390398899829886498;
        byte b = this.a;
        dev.epro.r0.X9852054718446117252 x9852054718446117252 = dev.epro.r0.X9852054718446117252.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        switch (b) {
            case 0:
                ((dev.epro.r0.O10311700946806650263) obj).setParentLayoutDirection((dev.epro.r0.F10342546226345611902) obj2);
                return i5164649337253478959.m(0, 0, x9852054718446117252, new dev.epro.r0.M14716691558468128220((byte) 21));
            default:
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Object obj3 = list.get(i3);
                    if (!(((dev.epro.r0.G17613326942144185441) obj3).k() instanceof dev.epro.r0.Z9252984664652542715)) {
                        arrayList2.add(obj3);
                    }
                }
                java.util.List list2 = (java.util.List) ((dev.epro.r0.B13729205492206812220) obj2).invoke();
                if (list2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
                    int size2 = list2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        dev.epro.r0.S6349823729575121924 s6349823729575121924 = (dev.epro.r0.S6349823729575121924) list2.get(i4);
                        if (s6349823729575121924 != null) {
                            float f = s6349823729575121924.b;
                            float f2 = s6349823729575121924.a;
                            dev.epro.r0.G17613326942144185441 g17613326942144185441 = (dev.epro.r0.G17613326942144185441) arrayList2.get(i4);
                            int iFloor = (int) java.lang.Math.floor(s6349823729575121924.c - f2);
                            float f3 = s6349823729575121924.d - f;
                            i = size2;
                            i2 = i4;
                            h9390398899829886498 = new dev.epro.r0.H9390398899829886498(g17613326942144185441.d(dev.epro.r0.O15160157444238005800.b(0, iFloor, 0, (int) java.lang.Math.floor(f3), 5)), new dev.epro.r0.Q2551293802323679034((((long) java.lang.Math.round(f)) & 4294967295L) | (((long) java.lang.Math.round(f2)) << 32)));
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
                java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    java.lang.Object obj4 = list.get(i5);
                    if (((dev.epro.r0.G17613326942144185441) obj4).k() instanceof dev.epro.r0.Z9252984664652542715) {
                        arrayList4.add(obj4);
                    }
                }
                return i5164649337253478959.m(dev.epro.r0.I16980768508151520658.i(j), dev.epro.r0.I16980768508151520658.h(j), x9852054718446117252, new dev.epro.r0.Y14986451238933639207(arrayList, dev.epro.r0.B5998207562248239613.B(arrayList4, (dev.epro.r0.B13729205492206812220) obj), (byte) 2));
        }
    }
}
