package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K12289864322804942936 implements A10838822263452390785 {
    public final K3983185380106045713 a;
    public final float b;

    public K12289864322804942936(K3983185380106045713 k3983185380106045713, float f) {
        this.a = k3983185380106045713;
        this.b = f;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int a(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        int g0 = j4720286603213127984.g0(this.b);
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).b0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).b0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(g0, valueOf != null ? valueOf.intValue() : 0);
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int b(J4720286603213127984 j4720286603213127984, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((G17613326942144185441) list.get(i3)).V(i);
        }
        return i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(final I5164649337253478959 i5164649337253478959, List list, final long j) {
        int i;
        final K12289864322804942936 k12289864322804942936 = this;
        int size = list.size();
        final int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            G17613326942144185441 g17613326942144185441 = (G17613326942144185441) list.get(i3);
            if (S10823041268949770285.t(V1475975160983963926.y(g17613326942144185441), "navigationIcon")) {
                final Z17471428274427141949 d = g17613326942144185441.d(I16980768508151520658.b(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i4 = 0;
                while (i4 < size2) {
                    G17613326942144185441 g176133269421441854412 = (G17613326942144185441) list.get(i4);
                    if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854412), "actionIcons")) {
                        final Z17471428274427141949 d2 = g176133269421441854412.d(I16980768508151520658.b(j, 0, 0, 0, 0, 14));
                        if (I16980768508151520658.i(j) == Integer.MAX_VALUE) {
                            i = I16980768508151520658.i(j);
                        } else {
                            i = (I16980768508151520658.i(j) - d.a) - d2.a;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            G17613326942144185441 g176133269421441854413 = (G17613326942144185441) list.get(i6);
                            if (S10823041268949770285.t(V1475975160983963926.y(g176133269421441854413), "title")) {
                                final Z17471428274427141949 d3 = g176133269421441854413.d(I16980768508151520658.b(j, 0, i5, 0, 0, 12));
                                F7206147944927503893 f7206147944927503893 = I4888842196829845669.b;
                                final int c0 = d3.c0(f7206147944927503893) != Integer.MIN_VALUE ? d3.c0(f7206147944927503893) : 0;
                                float invoke = k12289864322804942936.a.invoke();
                                int Z = Float.isNaN(invoke) ? 0 : T18016951143603335921.Z(invoke);
                                final int max = Math.max(i5164649337253478959.g0(k12289864322804942936.b), d3.b);
                                if (I16980768508151520658.h(j) == Integer.MAX_VALUE) {
                                    i2 = max;
                                } else {
                                    int i7 = Z + max;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                return i5164649337253478959.m(I16980768508151520658.i(j), i2, X9852054718446117252.a, new F4096073349764486348(i2, d3, d2, j, i5164649337253478959, k12289864322804942936, c0, max) { // from class: dev.epro.r0.R6963825411377593685
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ Z17471428274427141949 c;
                                    public final /* synthetic */ Z17471428274427141949 d;
                                    public final /* synthetic */ long e;
                                    public final /* synthetic */ I5164649337253478959 f;

                                    @Override // dev.epro.r0.F4096073349764486348
                                    public final Object invoke(Object obj) {
                                        int i8;
                                        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                                        Z17471428274427141949 z17471428274427141949 = Z17471428274427141949.this;
                                        int i9 = z17471428274427141949.b;
                                        int i10 = this.b;
                                        Y2066038017114788875.j(y2066038017114788875, z17471428274427141949, 0, (i10 - i9) / 2);
                                        int max2 = Math.max(this.f.g0(P10583659487713330077.c), z17471428274427141949.a);
                                        Z17471428274427141949 z174714282744271419492 = this.d;
                                        int i11 = z174714282744271419492.a;
                                        Z17471428274427141949 z174714282744271419493 = this.c;
                                        int i12 = z174714282744271419493.a;
                                        long j2 = this.e;
                                        int round = Math.round((1.0f - 1.0f) * ((I16980768508151520658.i(j2) - i12) / 2.0f));
                                        if (round >= max2) {
                                            if (z174714282744271419493.a + round > I16980768508151520658.i(j2) - i11) {
                                                i8 = (I16980768508151520658.i(j2) - i11) - (z174714282744271419493.a + round);
                                            }
                                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419493, round, (i10 - z174714282744271419493.b) / 2);
                                            Y2066038017114788875.j(y2066038017114788875, z174714282744271419492, I16980768508151520658.i(j2) - z174714282744271419492.a, (i10 - z174714282744271419492.b) / 2);
                                            return O9245300239821758723.a;
                                        }
                                        i8 = max2 - round;
                                        round += i8;
                                        Y2066038017114788875.j(y2066038017114788875, z174714282744271419493, round, (i10 - z174714282744271419493.b) / 2);
                                        Y2066038017114788875.j(y2066038017114788875, z174714282744271419492, I16980768508151520658.i(j2) - z174714282744271419492.a, (i10 - z174714282744271419492.b) / 2);
                                        return O9245300239821758723.a;
                                    }
                                });
                            }
                            i6++;
                            k12289864322804942936 = this;
                        }
                        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
                    }
                    i4++;
                    k12289864322804942936 = this;
                }
                throw L11610354117192841236.z("Collection contains no element matching the predicate.");
            }
            i3++;
            k12289864322804942936 = this;
        }
        throw L11610354117192841236.z("Collection contains no element matching the predicate.");
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int d(J4720286603213127984 j4720286603213127984, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((G17613326942144185441) list.get(i3)).a0(i);
        }
        return i2;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final int e(J4720286603213127984 j4720286603213127984, List list, int i) {
        Integer valueOf;
        int g0 = j4720286603213127984.g0(this.b);
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((G17613326942144185441) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((G17613326942144185441) list.get(i2)).f(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(g0, valueOf != null ? valueOf.intValue() : 0);
    }
}
