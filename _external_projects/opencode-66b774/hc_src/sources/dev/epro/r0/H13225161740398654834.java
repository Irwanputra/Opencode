package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H13225161740398654834 implements A10838822263452390785 {
    public final W15770782626803742669 a;
    public boolean b;

    public H13225161740398654834(W15770782626803742669 w15770782626803742669) {
        this.a = w15770782626803742669;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int b0 = ((G17613326942144185441) list.get(0)).b0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int b02 = ((G17613326942144185441) list.get(i2)).b0(i);
                if (b02 > b0) {
                    b0 = b02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return b0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int V = ((G17613326942144185441) list.get(0)).V(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int V2 = ((G17613326942144185441) list.get(i2)).V(i);
                if (V2 > V) {
                    V = V2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return V;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        V697849047308847220 v697849047308847220 = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Z17471428274427141949 d = ((G17613326942144185441) list.get(i3)).d(j);
            i = Math.max(i, d.a);
            i2 = Math.max(i2, d.b);
            arrayList.add(d);
        }
        if (i5164649337253478959.A()) {
            this.b = true;
            v697849047308847220.setValue(new Q13254524308163418711((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            v697849047308847220.setValue(new Q13254524308163418711((i2 & 4294967295L) | (i << 32)));
        }
        return i5164649337253478959.m(i, i2, X9852054718446117252.a, new J3227772737003951788(arrayList, (byte) 7));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int a0 = ((G17613326942144185441) list.get(0)).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int a02 = ((G17613326942144185441) list.get(i2)).a0(i);
                if (a02 > a0) {
                    a0 = a02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return a0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int f = ((G17613326942144185441) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int f2 = ((G17613326942144185441) list.get(i2)).f(i);
                if (f2 > f) {
                    f = f2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return f;
    }
}
