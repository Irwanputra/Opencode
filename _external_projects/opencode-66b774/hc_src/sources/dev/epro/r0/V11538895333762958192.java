package dev.epro.r0;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V11538895333762958192 {
    public final I1581330382723795749 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public V11538895333762958192(I1581330382723795749 i1581330382723795749, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int h;
        int i5;
        this.a = i1581330382723795749;
        this.b = i;
        if (I16980768508151520658.k(j) != 0 || I16980768508151520658.j(j) != 0) {
            T12055643479535528558.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) i1581330382723795749.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            U18170924438753170978 u18170924438753170978 = (U18170924438753170978) arrayList2.get(i6);
            D417720124633959953 d417720124633959953 = u18170924438753170978.a;
            int i8 = I16980768508151520658.i(j);
            if (I16980768508151520658.d(j)) {
                i4 = i6;
                h = I16980768508151520658.h(j) - ((int) Math.ceil(f));
                if (h < 0) {
                    h = 0;
                }
            } else {
                i4 = i6;
                h = I16980768508151520658.h(j);
            }
            i3 = 0;
            R8360857824092671497 r8360857824092671497 = new R8360857824092671497(d417720124633959953, this.b - i7, i2, O15160157444238005800.b(0, i8, 0, h, 5));
            float f2 = r8360857824092671497.f + f;
            I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
            int i9 = i7 + i18150855591218230259.g;
            arrayList.add(new Z2489793023059154243(r8360857824092671497, u18170924438753170978.b, u18170924438753170978.c, i7, i9, f, f2));
            if (!i18150855591218230259.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != K5751602218013079365.N((ArrayList) this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = f2;
            }
            z = true;
            i7 = i9;
            f = f2;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = I16980768508151520658.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i10);
            List list = z2489793023059154243.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                S6349823729575121924 s6349823729575121924 = (S6349823729575121924) list.get(i11);
                arrayList4.add(s6349823729575121924 != null ? z2489793023059154243.a(s6349823729575121924) : null);
            }
            P17571903987102865660.n0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = R9411874267597469228.O0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(V11538895333762958192 v11538895333762958192, V1715405128288489768 v1715405128288489768, long j, H7281108764511748709 h7281108764511748709, W7621125212597703960 w7621125212597703960, Q15653065705375360223 q15653065705375360223) {
        v1715405128288489768.l();
        ArrayList arrayList = v11538895333762958192.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i);
            z2489793023059154243.a.e(v1715405128288489768, j, h7281108764511748709, w7621125212597703960, q15653065705375360223);
            v1715405128288489768.i(0.0f, z2489793023059154243.a.f);
        }
        v1715405128288489768.j();
    }

    public static void j(V11538895333762958192 v11538895333762958192, V1715405128288489768 v1715405128288489768, D14208870094104617988 d14208870094104617988, float f, H7281108764511748709 h7281108764511748709, W7621125212597703960 w7621125212597703960, Q15653065705375360223 q15653065705375360223) {
        v1715405128288489768.l();
        ArrayList arrayList = v11538895333762958192.h;
        if (arrayList.size() <= 1) {
            S10823041268949770285.F(v11538895333762958192, v1715405128288489768, d14208870094104617988, f, h7281108764511748709, w7621125212597703960, q15653065705375360223);
        } else if (d14208870094104617988 instanceof H10765568533039107979) {
            S10823041268949770285.F(v11538895333762958192, v1715405128288489768, d14208870094104617988, f, h7281108764511748709, w7621125212597703960, q15653065705375360223);
        } else {
            if (!(d14208870094104617988 instanceof G2555456398299437723)) {
                Z3383101362411723454.g();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                R8360857824092671497 r8360857824092671497 = ((Z2489793023059154243) arrayList.get(i)).a;
                f3 += r8360857824092671497.f;
                f2 = Math.max(f2, r8360857824092671497.c());
            }
            Shader b = ((G2555456398299437723) d14208870094104617988).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                R8360857824092671497 r83608578240926714972 = ((Z2489793023059154243) arrayList.get(i2)).a;
                r83608578240926714972.f(v1715405128288489768, new U4826819032005087528(b), f, h7281108764511748709, w7621125212597703960, q15653065705375360223);
                v1715405128288489768.i(0.0f, r83608578240926714972.f);
                matrix.setTranslate(0.0f, -r83608578240926714972.f);
                b.setLocalMatrix(matrix);
            }
        }
        v1715405128288489768.j();
    }

    public final void a(long j, float[] fArr) {
        k(F12478849263529740365.g(j));
        l(F12478849263529740365.f(j));
        A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        a8284336046188466534.a = 0;
        O5354877807466160604.N(this.h, j, new A2259591046879578716(j, fArr, a8284336046188466534, new A81664135048468380()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        return r8360857824092671497.d.d(i - z2489793023059154243.d) + z2489793023059154243.f;
    }

    public final int c(int i, boolean z) {
        int e;
        m(i);
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        int i2 = i - z2489793023059154243.d;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        if (z) {
            Layout layout = i18150855591218230259.f;
            ThreadLocal threadLocal = Y3398285834625198673.a;
            if (layout.getEllipsisCount(i2) <= 0 || i18150855591218230259.b != TextUtils.TruncateAt.END) {
                I1581330382723795749 c = i18150855591218230259.c();
                Layout layout2 = (Layout) c.a;
                e = c.m(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                e = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            e = i18150855591218230259.e(i2);
        }
        return e + z2489793023059154243.b;
    }

    public final int d(int i) {
        int length = ((M11181104712105445833) this.a.a).b.length();
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i >= length ? arrayList.size() - 1 : i < 0 ? 0 : O5354877807466160604.K(i, arrayList));
        return z2489793023059154243.a.d.f(z2489793023059154243.d(i)) + z2489793023059154243.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.M(arrayList, f));
        int i = z2489793023059154243.c - z2489793023059154243.b;
        int i2 = z2489793023059154243.d;
        if (i == 0) {
            return i2;
        }
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        float f2 = f - z2489793023059154243.f;
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = i18150855591218230259.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = i18150855591218230259.f.getLineForVertical(i3 - i18150855591218230259.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.L(i, arrayList));
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        return r8360857824092671497.d.h(i - z2489793023059154243.d) + z2489793023059154243.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(O5354877807466160604.M(arrayList, intBitsToFloat));
        int i2 = z2489793023059154243.c;
        int i3 = z2489793023059154243.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        R8360857824092671497 r8360857824092671497 = z2489793023059154243.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - z2489793023059154243.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        I18150855591218230259 i18150855591218230259 = r8360857824092671497.d;
        int intBitsToFloat4 = (int) (Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits)) - 0.0f);
        Layout layout = i18150855591218230259.f;
        int lineForVertical = layout.getLineForVertical(intBitsToFloat4 - i18150855591218230259.h);
        if (lineForVertical >= i18150855591218230259.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (i18150855591218230259.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(S6349823729575121924 s6349823729575121924, int i, K2042933864045806308 k2042933864045806308) {
        long j;
        long j2;
        float f = s6349823729575121924.b;
        ArrayList arrayList = this.h;
        int M = O5354877807466160604.M(arrayList, f);
        float f2 = ((Z2489793023059154243) arrayList.get(M)).g;
        float f3 = s6349823729575121924.d;
        if (f2 >= f3 || M == arrayList.size() - 1) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(M);
            return z2489793023059154243.b(z2489793023059154243.a.b(z2489793023059154243.c(s6349823729575121924), i, k2042933864045806308), true);
        }
        int M2 = O5354877807466160604.M(arrayList, f3);
        long j3 = F12478849263529740365.b;
        while (true) {
            j = F12478849263529740365.b;
            if (!F12478849263529740365.c(j3, j) || M > M2) {
                break;
            }
            Z2489793023059154243 z24897930230591542432 = (Z2489793023059154243) arrayList.get(M);
            j3 = z24897930230591542432.b(z24897930230591542432.a.b(z24897930230591542432.c(s6349823729575121924), i, k2042933864045806308), true);
            M++;
        }
        if (F12478849263529740365.c(j3, j)) {
            return j;
        }
        while (true) {
            j2 = F12478849263529740365.b;
            if (!F12478849263529740365.c(j, j2) || M > M2) {
                break;
            }
            Z2489793023059154243 z24897930230591542433 = (Z2489793023059154243) arrayList.get(M2);
            j = z24897930230591542433.b(z24897930230591542433.a.b(z24897930230591542433.c(s6349823729575121924), i, k2042933864045806308), true);
            M2--;
        }
        return F12478849263529740365.c(j, j2) ? j3 : T1335862270807194835.d((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void k(int i) {
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) this.a.a;
        if (i < 0 || i >= m11181104712105445833.b.length()) {
            T12055643479535528558.a("offset(" + i + ") is out of bounds [0, " + m11181104712105445833.b.length() + ")");
        }
    }

    public final void l(int i) {
        M11181104712105445833 m11181104712105445833 = (M11181104712105445833) this.a.a;
        if (i < 0 || i > m11181104712105445833.b.length()) {
            T12055643479535528558.a("offset(" + i + ") is out of bounds [0, " + m11181104712105445833.b.length() + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        T12055643479535528558.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
