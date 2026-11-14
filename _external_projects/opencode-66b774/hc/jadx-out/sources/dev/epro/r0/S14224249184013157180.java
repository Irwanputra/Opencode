package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S14224249184013157180 implements A10838822263452390785 {
    public final /* synthetic */ float a;

    public S14224249184013157180(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, final long j) {
        Z1827359056605568080 z1827359056605568080;
        Z1827359056605568080 z18273590566055680802;
        Object obj;
        Object obj2;
        final float fH = I16980768508151520658.h(j) * this.a;
        int i = 0;
        long jB = I16980768508151520658.b(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (true) {
            z1827359056605568080 = Z1827359056605568080.b;
            z18273590566055680802 = Z1827359056605568080.a;
            if (i2 >= size) {
                break;
            }
            Object obj3 = list.get(i2);
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) obj3;
            if (V1475975160983963926.y(g17613326942144185441) != z18273590566055680802 && V1475975160983963926.y(g17613326942144185441) != z1827359056605568080) {
                arrayList.add(obj3);
            }
            i2++;
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(((G17613326942144185441) arrayList.get(i3)).d(jB));
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (V1475975160983963926.y((G17613326942144185441) obj) == z18273590566055680802) {
                break;
            }
            i4++;
        }
        G17613326942144185441 g176133269421441854412 = (G17613326942144185441) obj;
        int size4 = list.size();
        while (true) {
            if (i >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i);
            if (V1475975160983963926.y((G17613326942144185441) obj2) == z1827359056605568080) {
                break;
            }
            i++;
        }
        G17613326942144185441 g176133269421441854413 = (G17613326942144185441) obj2;
        final float size5 = 6.2831855f / arrayList2.size();
        Z17471428274427141949 z17471428274427141949D = g176133269421441854412 != null ? g176133269421441854412.d(jB) : null;
        final Z17471428274427141949 z17471428274427141949D2 = g176133269421441854413 != null ? g176133269421441854413.d(jB) : null;
        final Z17471428274427141949 z17471428274427141949 = z17471428274427141949D;
        return i5164649337253478959.m(I16980768508151520658.k(j), I16980768508151520658.j(j), X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.P13895690693396866773
            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj4) {
                long j2;
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj4;
                int i5 = 0;
                Z17471428274427141949 z174714282744271419492 = z17471428274427141949;
                if (z174714282744271419492 != null) {
                    y2066038017114788875.g(z174714282744271419492, 0, 0, 0.0f);
                }
                ArrayList arrayList3 = arrayList2;
                int size6 = arrayList3.size();
                while (true) {
                    j2 = j;
                    if (i5 >= size6) {
                        break;
                    }
                    Z17471428274427141949 z174714282744271419493 = (Z17471428274427141949) arrayList3.get(i5);
                    int i6 = (I16980768508151520658.i(j2) / 2) - (z174714282744271419493.a / 2);
                    int iH = (I16980768508151520658.h(j2) / 2) - (z174714282744271419493.b / 2);
                    double d = fH;
                    double d2 = ((double) (size5 * i5)) - 1.5707963267948966d;
                    y2066038017114788875.g(z174714282744271419493, T18016951143603335921.Y((Math.cos(d2) * d) + ((double) i6)), T18016951143603335921.Y((Math.sin(d2) * d) + ((double) iH)), 0.0f);
                    i5++;
                    arrayList3 = arrayList3;
                }
                Z17471428274427141949 z174714282744271419494 = z17471428274427141949D2;
                if (z174714282744271419494 != null) {
                    y2066038017114788875.g(z174714282744271419494, (I16980768508151520658.k(j2) - z174714282744271419494.a) / 2, (I16980768508151520658.j(j2) - z174714282744271419494.b) / 2, 0.0f);
                }
                return O9245300239821758723.a;
            }
        });
    }
}
