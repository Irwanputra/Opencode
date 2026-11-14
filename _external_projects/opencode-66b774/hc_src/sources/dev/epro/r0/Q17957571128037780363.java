package dev.epro.r0;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q17957571128037780363 {
    public final K10916014851776401112 a;
    public final V11538895333762958192 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public Q17957571128037780363(K10916014851776401112 k10916014851776401112, V11538895333762958192 v11538895333762958192, long j) {
        float lineBaseline;
        this.a = k10916014851776401112;
        this.b = v11538895333762958192;
        this.c = j;
        ArrayList arrayList = v11538895333762958192.h;
        float f = 0.0f;
        if (arrayList.isEmpty()) {
            lineBaseline = 0.0f;
        } else {
            I18150855591218230259 i18150855591218230259 = ((Z2489793023059154243) arrayList.get(0)).a.d;
            lineBaseline = i18150855591218230259.h + ((i18150855591218230259.g + (-1) != 0 || i18150855591218230259.l == null) ? i18150855591218230259.f.getLineBaseline(0) : i18150855591218230259.h(0) - r1.ascent) + 0.0f;
        }
        this.d = lineBaseline;
        if (!arrayList.isEmpty()) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) R9411874267597469228.K0(arrayList);
            I18150855591218230259 i181508555912182302592 = z2489793023059154243.a.d;
            int i = i181508555912182302592.g - 1;
            f = i181508555912182302592.h + (i181508555912182302592.l != null ? i181508555912182302592.h(i) - r1.ascent : i181508555912182302592.f.getLineBaseline(i)) + 0.0f + z2489793023059154243.f;
        }
        this.e = f;
        this.f = v11538895333762958192.g;
    }

    public final O16392062884302746898 a(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        return z2489793023059154243.a.d.f.isRtlCharAt(z2489793023059154243.d(i)) ? O16392062884302746898.b : O16392062884302746898.a;
    }

    public final S6349823729575121924 b(int i) {
        float j;
        float j2;
        float i2;
        float i3;
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.k(i);
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int d = z2489793023059154243.d(i);
        CharSequence charSequence = r8360857824092671497.e;
        if (d < 0 || d >= charSequence.length()) {
            T12055643479535528558.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + ")");
        }
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        int f = i18150855591218230259.f(d);
        float h = i18150855591218230259.h(f);
        float d2 = i18150855591218230259.d(f);
        Layout layout = i18150855591218230259.f;
        boolean z = layout.getParagraphDirection(f) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                i2 = i18150855591218230259.j(d, false);
                i3 = i18150855591218230259.j(d + 1, true);
            } else if (isRtlCharAt) {
                i2 = i18150855591218230259.i(d, false);
                i3 = i18150855591218230259.i(d + 1, true);
            } else {
                j = i18150855591218230259.j(d, false);
                j2 = i18150855591218230259.j(d + 1, true);
            }
            float f2 = i2;
            j = i3;
            j2 = f2;
        } else {
            j = i18150855591218230259.i(d, false);
            j2 = i18150855591218230259.i(d + 1, true);
        }
        RectF rectF = new RectF(j, h, j2, d2);
        return z2489793023059154243.a(new S6349823729575121924(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final S6349823729575121924 c(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int d = z2489793023059154243.d(i);
        CharSequence charSequence = r8360857824092671497.e;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        if (d < 0 || d > charSequence.length()) {
            T12055643479535528558.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float i2 = i18150855591218230259.i(d, false);
        int f = i18150855591218230259.f(d);
        return z2489793023059154243.a(new S6349823729575121924(i2, i18150855591218230259.h(f) + 0.0f, i2, i18150855591218230259.d(f) + 0.0f));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        V11538895333762958192 v11538895333762958192 = this.b;
        return f < v11538895333762958192.d || v11538895333762958192.c || ((float) ((int) (j & 4294967295L))) < v11538895333762958192.e;
    }

    public final float e(int i, boolean z) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int d = z2489793023059154243.d(i);
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return z ? i18150855591218230259.i(d, false) : i18150855591218230259.j(d, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Q17957571128037780363) {
            Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) obj;
            if (this.a.equals(q17957571128037780363.a) && this.b == q17957571128037780363.b && Q13254524308163418711.a(this.c, q17957571128037780363.c) && this.d == q17957571128037780363.d && this.e == q17957571128037780363.e && this.f.equals(q17957571128037780363.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.m(i);
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int i2 = i - z2489793023059154243.d;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return i18150855591218230259.f.getLineLeft(i2) + (i2 == i18150855591218230259.g + (-1) ? i18150855591218230259.j : 0.0f);
    }

    public final float g(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.m(i);
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int i2 = i - z2489793023059154243.d;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return i18150855591218230259.f.getLineRight(i2) + (i2 == i18150855591218230259.g + (-1) ? i18150855591218230259.k : 0.0f);
    }

    public final int h(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.m(i);
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        return r8360857824092671497.d.f.getLineStart(i - z2489793023059154243.d) + z2489793023059154243.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + E12098517352909843120.e(this.e, E12098517352909843120.e(this.d, G6547577305291411977.j((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), 31);
    }

    public final O16392062884302746898 i(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int d = z2489793023059154243.d(i);
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return i18150855591218230259.f.getParagraphDirection(i18150855591218230259.f(d)) == 1 ? O16392062884302746898.a : O16392062884302746898.b;
    }

    public final B1061516154492673368 j(int i, int i2) {
        V11538895333762958192 v11538895333762958192 = this.b;
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) v11538895333762958192.a.a;
        if (i < 0 || i > i2 || i2 > m11181104712105445833.b.length()) {
            int length = m11181104712105445833.b.length();
            StringBuilder p = E12098517352909843120.p(i, i2, "Start(", ") or End(", ") is out of range [0..");
            p.append(length);
            p.append("), or start > end!");
            T12055643479535528558.a(p.toString());
        }
        if (i == i2) {
            return W7346099082318612118.a();
        }
        B1061516154492673368 a = W7346099082318612118.a();
        O5354877807466160604.N(v11538895333762958192.h, T1335862270807194835.d(i, i2), new G3380524581901889884((Object) a, i, i2, (byte) 3));
        return a;
    }

    public final long k(int i) {
        int m;
        int i2;
        int j;
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int d = z2489793023059154243.d(i);
        I15162792415829416729 k = r8360857824092671497.d.k();
        if (k.i(k.m(d))) {
            k.b(d);
            m = d;
            while (m != -1 && (!k.i(m) || k.e(m))) {
                m = k.m(m);
            }
        } else {
            k.b(d);
            m = k.h(d) ? (!k.f(d) || k.d(d)) ? k.m(d) : d : k.d(d) ? k.m(d) : -1;
        }
        if (m == -1) {
            m = d;
        }
        if (k.e(k.j(d))) {
            k.b(d);
            i2 = d;
            while (i2 != -1 && (k.i(i2) || !k.e(i2))) {
                i2 = k.j(i2);
            }
        } else {
            k.b(d);
            if (k.d(d)) {
                if (!k.f(d) || k.h(d)) {
                    j = k.j(d);
                    i2 = j;
                } else {
                    i2 = d;
                }
            } else if (k.h(d)) {
                j = k.j(d);
                i2 = j;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return z2489793023059154243.b(T1335862270807194835.d(m, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + Q13254524308163418711.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
