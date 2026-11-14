package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class B14764642315028140130 extends dev.epro.r0.K10678596132709730734 {
    public static final dev.epro.r0.B14764642315028140130 a = new dev.epro.r0.B14764642315028140130();

    private B14764642315028140130() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public static dev.epro.r0.K15572083692188606544 d(int i, dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        int iA = dev.epro.r0.L11610354117192841236.A(i);
        if (iA == 5) {
            return new dev.epro.r0.D16457379462628768197(d13396727227989475489.F());
        }
        if (iA == 6) {
            return new dev.epro.r0.D16457379462628768197((java.lang.Number) new dev.epro.r0.H1162839155067368006(d13396727227989475489.F()));
        }
        if (iA == 7) {
            return new dev.epro.r0.D16457379462628768197(java.lang.Boolean.valueOf(d13396727227989475489.u()));
        }
        if (iA == 8) {
            d13396727227989475489.D();
            return dev.epro.r0.Y12917327898100101934.a;
        }
        dev.epro.r0.S10973172697741180971.m("Unexpected token: ".concat(dev.epro.r0.G11450220448113054352.x(i)));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException {
        dev.epro.r0.I16631908410500040363 p16422848101170923038;
        dev.epro.r0.I16631908410500040363 p164228481011709230382;
        int iH = d13396727227989475489.H();
        int iA = dev.epro.r0.L11610354117192841236.A(iH);
        if (iA == 0) {
            d13396727227989475489.b();
            p16422848101170923038 = new dev.epro.r0.P16422848101170923038();
        } else if (iA != 2) {
            p16422848101170923038 = null;
        } else {
            d13396727227989475489.c();
            p16422848101170923038 = new dev.epro.r0.I16631908410500040363();
        }
        if (p16422848101170923038 == null) {
            return d(iH, d13396727227989475489);
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        while (true) {
            if (d13396727227989475489.p()) {
                java.lang.String strB = p16422848101170923038 instanceof dev.epro.r0.I16631908410500040363 ? d13396727227989475489.B() : null;
                int iH2 = d13396727227989475489.H();
                int iA2 = dev.epro.r0.L11610354117192841236.A(iH2);
                if (iA2 == 0) {
                    d13396727227989475489.b();
                    p164228481011709230382 = new dev.epro.r0.P16422848101170923038();
                } else if (iA2 != 2) {
                    p164228481011709230382 = null;
                } else {
                    d13396727227989475489.c();
                    p164228481011709230382 = new dev.epro.r0.I16631908410500040363();
                }
                boolean z = p164228481011709230382 != null;
                if (p164228481011709230382 == null) {
                    p164228481011709230382 = d(iH2, d13396727227989475489);
                }
                if (p16422848101170923038 instanceof dev.epro.r0.P16422848101170923038) {
                    ((dev.epro.r0.P16422848101170923038) p16422848101170923038).q(p164228481011709230382);
                } else {
                    p16422848101170923038.q(strB, p164228481011709230382);
                }
                if (z) {
                    arrayDeque.addLast(p16422848101170923038);
                    p16422848101170923038 = p164228481011709230382;
                }
            } else {
                if (p16422848101170923038 instanceof dev.epro.r0.P16422848101170923038) {
                    d13396727227989475489.g();
                } else {
                    d13396727227989475489.h();
                }
                if (arrayDeque.isEmpty()) {
                    return p16422848101170923038;
                }
                p16422848101170923038 = (dev.epro.r0.K15572083692188606544) arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void c(dev.epro.r0.K15572083692188606544 k15572083692188606544, dev.epro.r0.Y14132333989764804283 y14132333989764804283) {
        if (k15572083692188606544 == null || (k15572083692188606544 instanceof dev.epro.r0.Y12917327898100101934)) {
            y14132333989764804283.p();
            return;
        }
        if (k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197) {
            dev.epro.r0.D16457379462628768197 d16457379462628768197M = k15572083692188606544.m();
            java.io.Serializable serializable = d16457379462628768197M.a;
            if (serializable instanceof java.lang.Number) {
                y14132333989764804283.C(d16457379462628768197M.o());
                return;
            } else if (serializable instanceof java.lang.Boolean) {
                y14132333989764804283.E(d16457379462628768197M.b());
                return;
            } else {
                y14132333989764804283.D(d16457379462628768197M.p());
                return;
            }
        }
        if (k15572083692188606544 instanceof dev.epro.r0.P16422848101170923038) {
            y14132333989764804283.c();
            java.util.ArrayList arrayList = k15572083692188606544.k().a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList.get(i);
                i++;
                c((dev.epro.r0.K15572083692188606544) obj, y14132333989764804283);
            }
            y14132333989764804283.g();
            return;
        }
        if (!(k15572083692188606544 instanceof dev.epro.r0.I16631908410500040363)) {
            dev.epro.r0.Z3383101362411723454.p("Couldn't write ", k15572083692188606544.getClass());
            return;
        }
        y14132333989764804283.d();
        dev.epro.r0.L622219180424329983 it = k15572083692188606544.l().a.entrySet().iterator();
        while (it.hasNext()) {
            dev.epro.r0.S8064361206571326475 s8064361206571326475A = it.a();
            y14132333989764804283.j((java.lang.String) s8064361206571326475A.getKey());
            c((dev.epro.r0.K15572083692188606544) s8064361206571326475A.getValue(), y14132333989764804283);
        }
        y14132333989764804283.h();
    }
}
