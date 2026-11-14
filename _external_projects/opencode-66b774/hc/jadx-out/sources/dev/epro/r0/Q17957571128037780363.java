package dev.epro.r0;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        float fH = 0.0f;
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
            fH = i181508555912182302592.h + (i181508555912182302592.l != null ? i181508555912182302592.h(i) - r1.ascent : i181508555912182302592.f.getLineBaseline(i)) + 0.0f + z2489793023059154243.f;
        }
        this.e = fH;
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
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.k(i);
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int iD = z2489793023059154243.d(i);
        CharSequence charSequence = r8360857824092671497.e;
        if (iD < 0 || iD >= charSequence.length()) {
            T12055643479535528558.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        int iF = i18150855591218230259.f(iD);
        float fH = i18150855591218230259.h(iF);
        float fD = i18150855591218230259.d(iF);
        Layout layout = i18150855591218230259.f;
        boolean z = layout.getParagraphDirection(iF) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = i18150855591218230259.j(iD, false);
                fI2 = i18150855591218230259.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = i18150855591218230259.i(iD, false);
                fI2 = i18150855591218230259.i(iD + 1, true);
            } else {
                fJ = i18150855591218230259.j(iD, false);
                fJ2 = i18150855591218230259.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = i18150855591218230259.i(iD, false);
            fJ2 = i18150855591218230259.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fD);
        return z2489793023059154243.a(new S6349823729575121924(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final S6349823729575121924 c(int i) {
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int iD = z2489793023059154243.d(i);
        CharSequence charSequence = r8360857824092671497.e;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        if (iD < 0 || iD > charSequence.length()) {
            T12055643479535528558.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fI = i18150855591218230259.i(iD, false);
        int iF = i18150855591218230259.f(iD);
        return z2489793023059154243.a(new S6349823729575121924(fI, i18150855591218230259.h(iF) + 0.0f, fI, i18150855591218230259.d(iF) + 0.0f));
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
        int iD = z2489793023059154243.d(i);
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return z ? i18150855591218230259.i(iD, false) : i18150855591218230259.j(iD, false);
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
        int iD = z2489793023059154243.d(i);
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        return i18150855591218230259.f.getParagraphDirection(i18150855591218230259.f(iD)) == 1 ? O16392062884302746898.a : O16392062884302746898.b;
    }

    public final B1061516154492673368 j(int i, int i2) {
        V11538895333762958192 v11538895333762958192 = this.b;
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) v11538895333762958192.a.a;
        if (i < 0 || i > i2 || i2 > m11181104712105445833.b.length()) {
            int length = m11181104712105445833.b.length();
            StringBuilder sbP = E12098517352909843120.p(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbP.append(length);
            sbP.append("), or start > end!");
            T12055643479535528558.a(sbP.toString());
        }
        if (i == i2) {
            return W7346099082318612118.a();
        }
        B1061516154492673368 b1061516154492673368A = W7346099082318612118.a();
        O5354877807466160604.N(v11538895333762958192.h, T1335862270807194835.d(i, i2), new G3380524581901889884((Object) b1061516154492673368A, i, i2, (byte) 3));
        return b1061516154492673368A;
    }

    public final long k(int i) {
        int iM;
        int iJ;
        int iJ2;
        V11538895333762958192 v11538895333762958192 = this.b;
        v11538895333762958192.l(i);
        int length = ((M11181104712105445833) v11538895333762958192.a.a).b.length();
        ArrayList arrayList = v11538895333762958192.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i == length ? arrayList.size() - 1 : O5354877807466160604.K(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int iD = z2489793023059154243.d(i);
        I15162792415829416729 i15162792415829416729K = r8360857824092671497.d.k();
        if (i15162792415829416729K.i(i15162792415829416729K.m(iD))) {
            i15162792415829416729K.b(iD);
            iM = iD;
            while (iM != -1 && (!i15162792415829416729K.i(iM) || i15162792415829416729K.e(iM))) {
                iM = i15162792415829416729K.m(iM);
            }
        } else {
            i15162792415829416729K.b(iD);
            iM = i15162792415829416729K.h(iD) ? (!i15162792415829416729K.f(iD) || i15162792415829416729K.d(iD)) ? i15162792415829416729K.m(iD) : iD : i15162792415829416729K.d(iD) ? i15162792415829416729K.m(iD) : -1;
        }
        if (iM == -1) {
            iM = iD;
        }
        if (i15162792415829416729K.e(i15162792415829416729K.j(iD))) {
            i15162792415829416729K.b(iD);
            iJ = iD;
            while (iJ != -1 && (i15162792415829416729K.i(iJ) || !i15162792415829416729K.e(iJ))) {
                iJ = i15162792415829416729K.j(iJ);
            }
        } else {
            i15162792415829416729K.b(iD);
            if (i15162792415829416729K.d(iD)) {
                if (!i15162792415829416729K.f(iD) || i15162792415829416729K.h(iD)) {
                    iJ2 = i15162792415829416729K.j(iD);
                    iJ = iJ2;
                } else {
                    iJ = iD;
                }
            } else if (i15162792415829416729K.h(iD)) {
                iJ2 = i15162792415829416729K.j(iD);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iD = iJ;
        }
        return z2489793023059154243.b(T1335862270807194835.d(iM, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + Q13254524308163418711.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
