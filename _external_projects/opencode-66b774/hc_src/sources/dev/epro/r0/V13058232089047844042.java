package dev.epro.r0;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        U18133900443301080740 u18133900443301080740 = y4989033692226475498.T;
                        if (u18133900443301080740 != null) {
                            R12643293538999642754 r12643293538999642754 = (R12643293538999642754) u18133900443301080740;
                            float[] b = r12643293538999642754.b();
                            if (!r12643293538999642754.s) {
                                j = N9580590882934638229.b(j, b);
                            }
                        }
                        j = V1475975160983963926.M(j, y4989033692226475498.F);
                        break;
                    default:
                        L5844152868342410893 c1 = y4989033692226475498.c1();
                        c1.getClass();
                        long j2 = c1.v;
                        j = L2216691091636065972.f((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                y4989033692226475498 = y4989033692226475498.w;
                y4989033692226475498.getClass();
                if (y4989033692226475498.equals(this.a.p())) {
                    int round = Math.round(p777117574205674816 instanceof F7206147944927503893 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    HashMap hashMap = this.i;
                    if (hashMap.containsKey(p777117574205674816)) {
                        int intValue = ((Number) E4951175994894594588.t0(p777117574205674816, hashMap)).intValue();
                        F7206147944927503893 f7206147944927503893 = I4888842196829845669.a;
                        round = ((Number) p777117574205674816.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(p777117574205674816, Integer.valueOf(round));
                    return;
                }
            } while (!b(y4989033692226475498).containsKey(p777117574205674816));
            float c = c(y4989033692226475498, p777117574205674816);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(Y4989033692226475498 y4989033692226475498) {
        switch (this.j) {
            case 0:
                return y4989033692226475498.H0().a();
            default:
                L5844152868342410893 c1 = y4989033692226475498.c1();
                c1.getClass();
                return c1.H0().a();
        }
    }

    public final int c(Y4989033692226475498 y4989033692226475498, P777117574205674816 p777117574205674816) {
        switch (this.j) {
            case 0:
                return y4989033692226475498.c0(p777117574205674816);
            default:
                L5844152868342410893 c1 = y4989033692226475498.c1();
                c1.getClass();
                return c1.c0(p777117574205674816);
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
        P10552808509296666343 v = p10552808509296666343.v();
        if (v == null) {
            return;
        }
        if (this.c) {
            v.Z();
        } else if (this.e || this.d) {
            v.requestLayout();
        }
        if (this.f) {
            p10552808509296666343.Z();
        }
        if (this.g) {
            p10552808509296666343.requestLayout();
        }
        v.a().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        A6662317080022852970 a6662317080022852970 = new A6662317080022852970(this, (byte) 5);
        P10552808509296666343 p10552808509296666343 = this.a;
        p10552808509296666343.F(a6662317080022852970);
        hashMap.putAll(b(p10552808509296666343.p()));
        this.b = false;
    }

    public final void h() {
        V13058232089047844042 a;
        V13058232089047844042 a2;
        boolean d = d();
        P10552808509296666343 p10552808509296666343 = this.a;
        if (!d) {
            P10552808509296666343 v = p10552808509296666343.v();
            if (v == null) {
                return;
            }
            p10552808509296666343 = v.a().h;
            if (p10552808509296666343 == null || !p10552808509296666343.a().d()) {
                P10552808509296666343 p105528085092966663432 = this.h;
                if (p105528085092966663432 == null || p105528085092966663432.a().d()) {
                    return;
                }
                P10552808509296666343 v2 = p105528085092966663432.v();
                if (v2 != null && (a2 = v2.a()) != null) {
                    a2.h();
                }
                P10552808509296666343 v3 = p105528085092966663432.v();
                p10552808509296666343 = (v3 == null || (a = v3.a()) == null) ? null : a.h;
            }
        }
        this.h = p10552808509296666343;
    }
}
