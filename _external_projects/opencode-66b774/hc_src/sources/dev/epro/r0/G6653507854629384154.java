package dev.epro.r0;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G6653507854629384154 extends K10678596132709730734 {
    public /* synthetic */ G6653507854629384154(int i) {
        this();
    }

    public static K15572083692188606544 e(int i, D13396727227989475489 d13396727227989475489) {
        int A = L11610354117192841236.A(i);
        if (A == 5) {
            String F = d13396727227989475489.F();
            if (P1853490117004660039.a(F)) {
                return new D16457379462628768197(F);
            }
            Q11088980322693754445.h("illegal characters in string");
            return null;
        }
        if (A == 6) {
            return new D16457379462628768197(new H5899666700909189688(d13396727227989475489.F()));
        }
        if (A == 7) {
            return new D16457379462628768197(Boolean.valueOf(d13396727227989475489.u()));
        }
        if (A == 8) {
            d13396727227989475489.D();
            return Y12917327898100101934.a;
        }
        S10973172697741180971.m("Unexpected token: ".concat(G11450220448113054352.x(i)));
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        throw new UnsupportedOperationException("write is not supported");
    }

    @Override // dev.epro.r0.K10678596132709730734
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final K15572083692188606544 b(D13396727227989475489 d13396727227989475489) {
        K15572083692188606544 p16422848101170923038;
        String str;
        K15572083692188606544 p164228481011709230382;
        int H = d13396727227989475489.H();
        int A = L11610354117192841236.A(H);
        if (A == 0) {
            d13396727227989475489.b();
            p16422848101170923038 = new P16422848101170923038();
        } else if (A != 2) {
            p16422848101170923038 = null;
        } else {
            d13396727227989475489.c();
            p16422848101170923038 = new I16631908410500040363();
        }
        if (p16422848101170923038 == null) {
            return e(H, d13396727227989475489);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (d13396727227989475489.p()) {
                if (p16422848101170923038 instanceof I16631908410500040363) {
                    str = d13396727227989475489.B();
                    if (!P1853490117004660039.a(str)) {
                        Q11088980322693754445.h("illegal characters in string");
                        return null;
                    }
                } else {
                    str = null;
                }
                int H2 = d13396727227989475489.H();
                int A2 = L11610354117192841236.A(H2);
                if (A2 == 0) {
                    d13396727227989475489.b();
                    p164228481011709230382 = new P16422848101170923038();
                } else if (A2 != 2) {
                    p164228481011709230382 = null;
                } else {
                    d13396727227989475489.c();
                    p164228481011709230382 = new I16631908410500040363();
                }
                boolean z = p164228481011709230382 != null;
                if (p164228481011709230382 == null) {
                    p164228481011709230382 = e(H2, d13396727227989475489);
                }
                if (p16422848101170923038 instanceof P16422848101170923038) {
                    ((P16422848101170923038) p16422848101170923038).q(p164228481011709230382);
                } else {
                    I16631908410500040363 i16631908410500040363 = (I16631908410500040363) p16422848101170923038;
                    if (i16631908410500040363.a.containsKey(str)) {
                        Q11088980322693754445.h(G6547577305291411977.C("duplicate key: ", str));
                        return null;
                    }
                    i16631908410500040363.q(str, p164228481011709230382);
                }
                if (z) {
                    arrayDeque.addLast(p16422848101170923038);
                    if (arrayDeque.size() > 100) {
                        Q11088980322693754445.h("too many recursions");
                        return null;
                    }
                    p16422848101170923038 = p164228481011709230382;
                } else {
                    continue;
                }
            } else {
                if (p16422848101170923038 instanceof P16422848101170923038) {
                    d13396727227989475489.g();
                } else {
                    d13396727227989475489.h();
                }
                if (arrayDeque.isEmpty()) {
                    return p16422848101170923038;
                }
                p16422848101170923038 = (K15572083692188606544) arrayDeque.removeLast();
            }
        }
    }

    private G6653507854629384154() {
    }
}
