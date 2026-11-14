package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A3516453186657372457 {
    public final V16530418555304444393 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public A3516453186657372457(V16530418555304444393 v16530418555304444393) {
        this.a = v16530418555304444393;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new I392368374593829352(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = O2161699089510411363.a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    public final T17032536773975598836 b(int i) {
        List list;
        int i2 = this.i;
        int i3 = i * i2;
        int iD = d() - i3;
        if (i2 > iD) {
            i2 = iD;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.h.size()) {
            list = this.h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new V5869213482710242667(1L));
            }
            this.h = arrayList;
            list = arrayList;
        }
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.a = i3;
        t17032536773975598836.b = list;
        return t17032536773975598836;
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            Y16081827717826519461.a("ItemIndex > total count");
        }
        return i / this.i;
    }

    public final int d() {
        return this.a.k.b;
    }

    public final int e(int i) {
        D2029916669724210805 d2029916669724210805G = this.a.k.g(i);
        int i2 = i - d2029916669724210805G.a;
        return (int) ((V5869213482710242667) ((L13421819325995458414) d2029916669724210805G.c).b.invoke(Q776483977265795891.a, Integer.valueOf(i2))).a;
    }
}
