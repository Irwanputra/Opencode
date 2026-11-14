package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G8839996886126338788 implements A10838822263452390785, K4412820318670641327 {
    public final B13906740428466697912 a;
    public final O15869581661108952313 b;

    public G8839996886126338788(B13906740428466697912 b13906740428466697912, O15869581661108952313 o15869581661108952313) {
        this.a = b13906740428466697912;
        this.b = o15869581661108952313;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        int g0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * g0, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i3);
            float m = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            if (m == 0.0f) {
                int min2 = Math.min(g17613326942144185441.a0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g17613326942144185441.b0(min2));
            } else if (m > 0.0f) {
                f += m;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i4);
            float m2 = Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854412));
            if (m2 > 0.0f) {
                i2 = Math.max(i2, g176133269421441854412.b0(round != Integer.MAX_VALUE ? Math.round(round * m2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int g0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i4);
            float m = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            int V = g17613326942144185441.V(i);
            if (m == 0.0f) {
                i3 += V;
            } else if (m > 0.0f) {
                f += m;
                i2 = Math.max(i2, Math.round(V / m));
            }
        }
        return ((list.size() - 1) * g0) + Math.round(i2 * f) + i3;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        return W7808703833045379622.E(this, I16980768508151520658.k(j), I16980768508151520658.j(j), I16980768508151520658.i(j), I16980768508151520658.h(j), i5164649337253478959.g0(this.a.a()), i5164649337253478959, list, new Z17471428274427141949[list.size()], 0, list.size(), null, 0);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        int g0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i4);
            float m = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            int a0 = g17613326942144185441.a0(i);
            if (m == 0.0f) {
                i3 += a0;
            } else if (m > 0.0f) {
                f += m;
                i2 = Math.max(i2, Math.round(a0 / m));
            }
        }
        return ((list.size() - 1) * g0) + Math.round(i2 * f) + i3;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        int g0 = j4720286603213127984.g0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * g0, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i3);
            float m = Q9282725956684299602.m(Q9282725956684299602.l(g17613326942144185441));
            if (m == 0.0f) {
                int min2 = Math.min(g17613326942144185441.a0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, g17613326942144185441.f(min2));
            } else if (m > 0.0f) {
                f += m;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i4);
            float m2 = Q9282725956684299602.m(Q9282725956684299602.l(g176133269421441854412));
            if (m2 > 0.0f) {
                i2 = Math.max(i2, g176133269421441854412.f(round != Integer.MAX_VALUE ? Math.round(round * m2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8839996886126338788)) {
            return false;
        }
        G8839996886126338788 g8839996886126338788 = (G8839996886126338788) obj;
        return this.a.equals(g8839996886126338788.a) && S10823041268949770285.t(this.b, g8839996886126338788.b);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int f(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.a;
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final void g(int i, int[] iArr, int[] iArr2, I5164649337253478959 i5164649337253478959) {
        this.a.f(i5164649337253478959, i, iArr, i5164649337253478959.getLayoutDirection(), iArr2);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final long h(boolean z, int i, int i2, int i3) {
        return !z ? O15160157444238005800.a(i, i2, 0, i3) : C12265524002282074474.R(i, i2, 0, i3);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final int i(Z17471428274427141949 z17471428274427141949) {
        return z17471428274427141949.b;
    }

    @Override // dev.epro.r0.K4412820318670641327
    public final H11646813293457574213 j(Z17471428274427141949[] z17471428274427141949Arr, I5164649337253478959 i5164649337253478959, int i, int[] iArr, int i2, int i3, int[] iArr2, int i4, int i5, int i6) {
        return i5164649337253478959.m(i2, i3, X9852054718446117252.a, new C16681219320011406040(z17471428274427141949Arr, this, i3, i, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
