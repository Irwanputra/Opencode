package dev.epro.r0;

import java.util.List;
import o.bwmna.gdrqkg.izmyclvb;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O15974643038957598625 implements A10838822263452390785 {
    public final G15527156457921655762 a;
    public final boolean b;

    public O15974643038957598625(G15527156457921655762 g15527156457921655762, boolean z) {
        this.a = g15527156457921655762;
        this.b = z;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(final I5164649337253478959 i5164649337253478959, final List list, long j) {
        int k;
        int j2;
        Z17471428274427141949 d;
        boolean isEmpty = list.isEmpty();
        X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
        if (isEmpty) {
            return i5164649337253478959.m(I16980768508151520658.k(j), I16980768508151520658.j(j), x9852054718446117252, new F17594658268783405200((byte) 12));
        }
        long j3 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(0);
            Object k2 = g17613326942144185441.k();
            F16495874760089114025 f16495874760089114025 = k2 instanceof F16495874760089114025 ? (F16495874760089114025) k2 : null;
            if (f16495874760089114025 != null ? f16495874760089114025.p : false) {
                k = I16980768508151520658.k(j);
                j2 = I16980768508151520658.j(j);
                int k3 = I16980768508151520658.k(j);
                int j4 = I16980768508151520658.j(j);
                if (!((j4 >= 0) & (k3 >= 0))) {
                    N17315172036749737048.a("width and height must be >= 0");
                }
                d = g17613326942144185441.d(O15160157444238005800.h(k3, k3, j4, j4));
            } else {
                d = g17613326942144185441.d(j3);
                k = Math.max(I16980768508151520658.k(j), d.a);
                j2 = Math.max(I16980768508151520658.j(j), d.b);
            }
            int i = j2;
            int i2 = k;
            return i5164649337253478959.m(i2, i, x9852054718446117252, new K11783138729487502794(d, g17613326942144185441, i5164649337253478959, i2, i, this));
        }
        final Z17471428274427141949[] z17471428274427141949Arr = new Z17471428274427141949[list.size()];
        final A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        a8284336046188466534.a = I16980768508151520658.k(j);
        final A8284336046188466534 a82843360461884665342 = new A8284336046188466534();
        a82843360461884665342.a = I16980768508151520658.j(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i3);
            Object k4 = g176133269421441854412.k();
            F16495874760089114025 f164958747600891140252 = k4 instanceof F16495874760089114025 ? (F16495874760089114025) k4 : null;
            if (f164958747600891140252 != null ? f164958747600891140252.p : false) {
                z = true;
            } else {
                Z17471428274427141949 d2 = g176133269421441854412.d(j3);
                z17471428274427141949Arr[i3] = d2;
                a8284336046188466534.a = Math.max(a8284336046188466534.a, d2.a);
                a82843360461884665342.a = Math.max(a82843360461884665342.a, d2.b);
            }
        }
        if (z) {
            int i4 = a8284336046188466534.a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = a82843360461884665342.a;
            long a = O15160157444238005800.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                G17613326942144185441 g176133269421441854413 = (G17613326942144185441) list.get(i7);
                Object k5 = g176133269421441854413.k();
                F16495874760089114025 f164958747600891140253 = k5 instanceof F16495874760089114025 ? (F16495874760089114025) k5 : null;
                if (f164958747600891140253 != null ? f164958747600891140253.p : false) {
                    z17471428274427141949Arr[i7] = g176133269421441854413.d(a);
                }
            }
        }
        final byte b = 0;
        return i5164649337253478959.m(a8284336046188466534.a, a82843360461884665342.a, x9852054718446117252, new F4096073349764486348() { // from class: dev.epro.r0.Z1223649175049348642
            static {
                izmyclvb.qgayjvbiagej2(265);
            }

            @Override // dev.epro.r0.F4096073349764486348
            public final native Object invoke(Object obj);
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O15974643038957598625)) {
            return false;
        }
        O15974643038957598625 o15974643038957598625 = (O15974643038957598625) obj;
        return S10823041268949770285.t(this.a, o15974643038957598625.a) && this.b == o15974643038957598625.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
