package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F15810660954791379866 implements A10838822263452390785, K4412820318670641327 {
    public final A6527624962738679687 a;
    public final K1823399244298350623 b;

    public F15810660954791379866(A6527624962738679687 a6527624962738679687, K1823399244298350623 k1823399244298350623) {
        this.a = a6527624962738679687;
        this.b = k1823399244298350623;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iG0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i3);
            float fM = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            int iB0 = g17613326942144185441.b0(i);
            if (fM == 0.0f) {
                i2 += iB0;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iB0 / fM));
            }
        }
        return ((list.size() - 1) * iG0) + Math.round(iMax * f) + i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iG0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iG0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i2);
            float fM = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            if (fM == 0.0f) {
                int iMin2 = Math.min(g17613326942144185441.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, g17613326942144185441.V(iMin2));
            } else if (fM > 0.0f) {
                f += fM;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i3);
            float fM2 = Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854412));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, g176133269421441854412.V(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        return W7808703833045379622.E(this, I16980768508151520658.j(j), I16980768508151520658.k(j), I16980768508151520658.h(j), I16980768508151520658.i(j), i5164649337253478959.g0(this.a.a()), i5164649337253478959, list, new Z17471428274427141949[list.size()], 0, list.size(), null, 0);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iG0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iG0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i2);
            float fM = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            if (fM == 0.0f) {
                int iMin2 = Math.min(g17613326942144185441.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, g17613326942144185441.a0(iMin2));
            } else if (fM > 0.0f) {
                f += fM;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i3);
            float fM2 = Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854412));
            if (fM2 > 0.0f) {
                iMax = Math.max(iMax, g176133269421441854412.a0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fM2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        int iG0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i3);
            float fM = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            int iF = g17613326942144185441.f(i);
            if (fM == 0.0f) {
                i2 += iF;
            } else if (fM > 0.0f) {
                f += fM;
                iMax = Math.max(iMax, Math.round(iF / fM));
            }
        }
        return ((list.size() - 1) * iG0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F15810660954791379866)) {
            return false;
        }
        F15810660954791379866 f15810660954791379866 = (F15810660954791379866) obj;
        return this.a.equals(f15810660954791379866.a) && S10823041268949770285.t(this.b, f15810660954791379866.b);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int f(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.b;
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final void g(int i, int[] iArr, int[] iArr2, I5164649337253478959 i5164649337253478959) {
        this.a.o(i5164649337253478959, i, iArr, iArr2);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final long h(boolean z, int i, int i2, int i3) {
        return !z ? O15160157444238005800.a(0, i3, i, i2) : C12265524002282074474.Q(0, i3, i, i2);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int i(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.a;
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final H11646813293457574213 j(Z17471428274427141949[] z17471428274427141949Arr, I5164649337253478959 i5164649337253478959, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return i5164649337253478959.m(i3, i2, X9852054718446117252.a, new K11783138729487502794(z17471428274427141949Arr, this, i3, i, i5164649337253478959, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
