package dev.epro.r0;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class B14764642315028140130 extends K10678596132709730734 {
    public static final B14764642315028140130 a = new B14764642315028140130();

    private B14764642315028140130() {
    }

    public static K15572083692188606544 d(int i, D13396727227989475489 d13396727227989475489) {
        int A = L11610354117192841236.A(i);
        if (A == 5) {
            return new D16457379462628768197(d13396727227989475489.F());
        }
        if (A == 6) {
            return new D16457379462628768197(new H1162839155067368006(d13396727227989475489.F()));
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
    public final Object b(D13396727227989475489 d13396727227989475489) {
        K15572083692188606544 p16422848101170923038;
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
            return d(H, d13396727227989475489);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (d13396727227989475489.p()) {
                String B = p16422848101170923038 instanceof I16631908410500040363 ? d13396727227989475489.B() : null;
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
                    p164228481011709230382 = d(H2, d13396727227989475489);
                }
                if (p16422848101170923038 instanceof P16422848101170923038) {
                    ((P16422848101170923038) p16422848101170923038).q(p164228481011709230382);
                } else {
                    ((I16631908410500040363) p16422848101170923038).q(B, p164228481011709230382);
                }
                if (z) {
                    arrayDeque.addLast(p16422848101170923038);
                    p16422848101170923038 = p164228481011709230382;
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

    @Override // dev.epro.r0.K10678596132709730734
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void c(K15572083692188606544 k15572083692188606544, Y14132333989764804283 y14132333989764804283) {
        if (k15572083692188606544 == null || (k15572083692188606544 instanceof Y12917327898100101934)) {
            y14132333989764804283.p();
            return;
        }
        if (k15572083692188606544 instanceof D16457379462628768197) {
            D16457379462628768197 m = k15572083692188606544.m();
            Serializable serializable = m.a;
            if (serializable instanceof Number) {
                y14132333989764804283.C(m.o());
                return;
            } else if (serializable instanceof Boolean) {
                y14132333989764804283.E(m.b());
                return;
            } else {
                y14132333989764804283.D(m.p());
                return;
            }
        }
        if (k15572083692188606544 instanceof P16422848101170923038) {
            y14132333989764804283.c();
            ArrayList arrayList = k15572083692188606544.k().a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c((K15572083692188606544) obj, y14132333989764804283);
            }
            y14132333989764804283.g();
            return;
        }
        if (!(k15572083692188606544 instanceof I16631908410500040363)) {
            Z3383101362411723454.p("Couldn't write ", k15572083692188606544.getClass());
            return;
        }
        y14132333989764804283.d();
        Iterator it = ((S11564727846197427291) k15572083692188606544.l().a.entrySet()).iterator();
        while (((L622219180424329983) it).hasNext()) {
            S8064361206571326475 a2 = ((L622219180424329983) it).a();
            y14132333989764804283.j((String) a2.getKey());
            c((K15572083692188606544) a2.getValue(), y14132333989764804283);
        }
        y14132333989764804283.h();
    }
}
