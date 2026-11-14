package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
        int iB0 = ((G17613326942144185441) list.get(0)).b0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iB02 = ((G17613326942144185441) list.get(i2)).b0(i);
                if (iB02 > iB0) {
                    iB0 = iB02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iB0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iV = ((G17613326942144185441) list.get(0)).V(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iV2 = ((G17613326942144185441) list.get(i2)).V(i);
                if (iV2 > iV) {
                    iV = iV2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iV;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        V697849047308847220 v697849047308847220 = this.a.a;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            Z17471428274427141949 z17471428274427141949D = ((G17613326942144185441) list.get(i)).d(j);
            iMax = Math.max(iMax, z17471428274427141949D.a);
            iMax2 = Math.max(iMax2, z17471428274427141949D.b);
            arrayList.add(z17471428274427141949D);
        }
        if (i5164649337253478959.A()) {
            this.b = true;
            v697849047308847220.setValue(new Q13254524308163418711((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            v697849047308847220.setValue(new Q13254524308163418711((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return i5164649337253478959.m(iMax, iMax2, X9852054718446117252.a, new J3227772737003951788(arrayList, (byte) 7));
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((G17613326942144185441) list.get(0)).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA02 = ((G17613326942144185441) list.get(i2)).a0(i);
                if (iA02 > iA0) {
                    iA0 = iA02;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((G17613326942144185441) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iF2 = ((G17613326942144185441) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }
}
