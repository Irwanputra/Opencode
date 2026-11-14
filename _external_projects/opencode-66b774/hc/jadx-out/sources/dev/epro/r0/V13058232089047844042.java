package dev.epro.r0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V13058232089047844042 {
    public final P10552808509296666343 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public P10552808509296666343 h;
    public final /* synthetic */ byte j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public V13058232089047844042(P10552808509296666343 p10552808509296666343, byte b) {
        this.j = b;
        this.a = p10552808509296666343;
    }

    public final void a(P777117574205674816 p777117574205674816, int i, Y4989033692226475498 y4989033692226475498) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        U18133900443301080740 u18133900443301080740 = y4989033692226475498.T;
                        if (u18133900443301080740 != null) {
                            R12643293538999642754 r12643293538999642754 = (R12643293538999642754) u18133900443301080740;
                            float[] fArrB = r12643293538999642754.b();
                            if (!r12643293538999642754.s) {
                                jM = N9580590882934638229.b(jM, fArrB);
                            }
                        }
                        jM = V1475975160983963926.M(jM, y4989033692226475498.F);
                        break;
                    default:
                        L5844152868342410893 l5844152868342410893C1 = y4989033692226475498.c1();
                        l5844152868342410893C1.getClass();
                        long j = l5844152868342410893C1.v;
                        jM = L2216691091636065972.f((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM);
                        break;
                }
                y4989033692226475498 = y4989033692226475498.w;
                y4989033692226475498.getClass();
                if (y4989033692226475498.equals(this.a.p())) {
                    int iRound = Math.round(p777117574205674816 instanceof F7206147944927503893 ? Float.intBitsToFloat((int) (jM & 4294967295L)) : Float.intBitsToFloat((int) (jM >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(p777117574205674816)) {
                        int iIntValue = ((Number) E4951175994894594588.t0(p777117574205674816, map)).intValue();
                        F7206147944927503893 f7206147944927503893 = I4888842196829845669.a;
                        iRound = ((Number) p777117574205674816.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(p777117574205674816, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(y4989033692226475498).containsKey(p777117574205674816));
            float fC = c(y4989033692226475498, p777117574205674816);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(Y4989033692226475498 y4989033692226475498) {
        switch (this.j) {
            case 0:
                return y4989033692226475498.H0().a();
            default:
                L5844152868342410893 l5844152868342410893C1 = y4989033692226475498.c1();
                l5844152868342410893C1.getClass();
                return l5844152868342410893C1.H0().a();
        }
    }

    public final int c(Y4989033692226475498 y4989033692226475498, P777117574205674816 p777117574205674816) {
        switch (this.j) {
            case 0:
                return y4989033692226475498.c0(p777117574205674816);
            default:
                L5844152868342410893 l5844152868342410893C1 = y4989033692226475498.c1();
                l5844152868342410893C1.getClass();
                return l5844152868342410893C1.c0(p777117574205674816);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        P10552808509296666343 p10552808509296666343 = this.a;
        P10552808509296666343 p10552808509296666343V = p10552808509296666343.v();
        if (p10552808509296666343V == null) {
            return;
        }
        if (this.c) {
            p10552808509296666343V.Z();
        } else if (this.e || this.d) {
            p10552808509296666343V.requestLayout();
        }
        if (this.f) {
            p10552808509296666343.Z();
        }
        if (this.g) {
            p10552808509296666343.requestLayout();
        }
        p10552808509296666343V.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        A6662317080022852970 a6662317080022852970 = new A6662317080022852970(this, (byte) 5);
        P10552808509296666343 p10552808509296666343 = this.a;
        p10552808509296666343.F(a6662317080022852970);
        map.putAll(b(p10552808509296666343.p()));
        this.b = false;
    }

    public final void h() {
        V13058232089047844042 v13058232089047844042A;
        V13058232089047844042 v13058232089047844042A2;
        boolean zD = d();
        P10552808509296666343 p10552808509296666343 = this.a;
        if (!zD) {
            P10552808509296666343 p10552808509296666343V = p10552808509296666343.v();
            if (p10552808509296666343V == null) {
                return;
            }
            p10552808509296666343 = p10552808509296666343V.a().h;
            if (p10552808509296666343 == null || !p10552808509296666343.a().d()) {
                P10552808509296666343 p105528085092966663432 = this.h;
                if (p105528085092966663432 == null || p105528085092966663432.a().d()) {
                    return;
                }
                P10552808509296666343 p10552808509296666343V2 = p105528085092966663432.v();
                if (p10552808509296666343V2 != null && (v13058232089047844042A2 = p10552808509296666343V2.a()) != null) {
                    v13058232089047844042A2.h();
                }
                P10552808509296666343 p10552808509296666343V3 = p105528085092966663432.v();
                p10552808509296666343 = (p10552808509296666343V3 == null || (v13058232089047844042A = p10552808509296666343V3.a()) == null) ? null : v13058232089047844042A.h;
            }
        }
        this.h = p10552808509296666343;
    }
}
