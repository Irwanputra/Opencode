package dev.epro.r0;

import ads_mobile_sdk.qw2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Z14316276734425062790 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;

    static {
        izmyclvb.qgayjvbiagej2(268);
    }

    public Z14316276734425062790() {
        new ConcurrentHashMap();
    }

    public static final native void a(int i, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, Integer num);

    public static final native void b(A9686630263571354636 a9686630263571354636, M3727281027331139839 m3727281027331139839, int i);

    public static final int c(qw2 qw2Var) {
        qw2Var.getClass();
        switch (qw2Var.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 6;
            case 2:
                return 2;
            case 3:
                return 8;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 9;
            default:
                Z3383101362411723454.g();
                return 0;
        }
    }

    public static void d(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void e(Object obj) {
        if (obj != null) {
            return;
        }
        Z3383101362411723454.k("Cannot return null from a non- @Provides method");
    }

    public static final long f(int i, int i2, N1420218926656397722 n1420218926656397722) {
        Z4949026731585863708 z4949026731585863708;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        B4739506393801054036 b4739506393801054036 = n1420218926656397722.c;
        B3798966058357121240 b3798966058357121240 = (b4739506393801054036 == null || (z4949026731585863708 = (Z4949026731585863708) b4739506393801054036.getValue()) == null) ? null : z4949026731585863708.b;
        long jA = b3798966058357121240 != null ? b3798966058357121240.a(i, false) : T1335862270807194835.d(i, i);
        long jF = n1420218926656397722.f(jA);
        int iOrdinal = ((F12478849263529740365.d(jA) && F12478849263529740365.d(jF)) ? R7405804063266277749.a : (F12478849263529740365.d(jA) || F12478849263529740365.d(jF)) ? (!F12478849263529740365.d(jA) || F12478849263529740365.d(jF)) ? R7405804063266277749.d : R7405804063266277749.b : R7405804063266277749.c).ordinal();
        R7332211110819204002 r7332211110819204002 = R7332211110819204002.b;
        R7332211110819204002 r73322111108192040022 = R7332211110819204002.a;
        if (iOrdinal == 0) {
            if (z) {
                r7332211110819204002 = r73322111108192040022;
            }
            return C775827382551829194.D(i, r7332211110819204002);
        }
        if (iOrdinal == 1) {
            return z ? i == ((int) (jF >> 32)) ? C775827382551829194.D(i, r73322111108192040022) : C775827382551829194.D((int) (jF & 4294967295L), r7332211110819204002) : i == ((int) (jF & 4294967295L)) ? C775827382551829194.D(i, r7332211110819204002) : C775827382551829194.D((int) (jF >> 32), r73322111108192040022);
        }
        if (iOrdinal == 2) {
            return z ? C775827382551829194.D((int) (jF & 4294967295L), r73322111108192040022) : C775827382551829194.D((int) (jF >> 32), r7332211110819204002);
        }
        if (iOrdinal == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        Z3383101362411723454.g();
        return 0L;
    }

    public static final native boolean g(String str, String str2);

    public static J18236984568855953541 l(J18236984568855953541[] j18236984568855953541Arr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        J18236984568855953541 j18236984568855953541 = null;
        int i3 = Integer.MAX_VALUE;
        for (J18236984568855953541 j182369845688559535412 : j18236984568855953541Arr) {
            int iAbs = (Math.abs(j182369845688559535412.c - i2) * 2) + (j182369845688559535412.d == z ? 0 : 1);
            if (j18236984568855953541 == null || i3 > iAbs) {
                j18236984568855953541 = j182369845688559535412;
                i3 = iAbs;
            }
        }
        return j18236984568855953541;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dev.epro.r0.Q7316561721656982910, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m(int r11, java.lang.String r12) {
        /*
            dev.epro.r0.D3638978315442423989 r0 = o()
            r1 = 0
            if (r0 == 0) goto L79
            int r2 = r0.c()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L10
            goto L11
        L10:
            r4 = r3
        L11:
            if (r4 == 0) goto L73
            java.lang.String r2 = "charSequence cannot be null"
            dev.epro.r0.K5751602218013079365.x(r2, r12)
            dev.epro.r0.N16333696292855081967 r0 = r0.e
            dev.epro.r0.Q7316561721656982910 r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L28
            int r2 = r12.length()
            if (r11 < r2) goto L2a
        L28:
            r5 = r12
            goto L69
        L2a:
            boolean r2 = r12 instanceof android.text.Spanned
            if (r2 == 0) goto L46
            r2 = r12
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r5 = r11 + 1
            java.lang.Class<dev.epro.r0.A7769137806217985202> r6 = dev.epro.r0.A7769137806217985202.class
            java.lang.Object[] r5 = r2.getSpans(r11, r5, r6)
            dev.epro.r0.A7769137806217985202[] r5 = (dev.epro.r0.A7769137806217985202[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L46
            r3 = r5[r3]
            int r2 = r2.getSpanEnd(r3)
            r5 = r12
            goto L6a
        L46:
            int r2 = r11 + (-16)
            int r6 = java.lang.Math.max(r3, r2)
            int r2 = r12.length()
            int r3 = r11 + 16
            int r7 = java.lang.Math.min(r2, r3)
            dev.epro.r0.U17123917892906321416 r10 = new dev.epro.r0.U17123917892906321416
            r10.<init>(r11)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r12
            java.lang.Object r12 = r4.J(r5, r6, r7, r8, r9, r10)
            dev.epro.r0.U17123917892906321416 r12 = (dev.epro.r0.U17123917892906321416) r12
            int r2 = r12.c
            goto L6a
        L69:
            r2 = r0
        L6a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L71
            goto L7a
        L71:
            r1 = r12
            goto L7a
        L73:
            java.lang.String r11 = "Not initialized yet"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r3
        L79:
            r5 = r12
        L7a:
            if (r1 == 0) goto L81
            int r11 = r1.intValue()
            return r11
        L81:
            java.text.BreakIterator r12 = java.text.BreakIterator.getCharacterInstance()
            r12.setText(r5)
            int r11 = r12.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Z14316276734425062790.m(int, java.lang.String):int");
    }

    public static final int n(int i, String str) {
        D3638978315442423989 d3638978315442423989O = o();
        Integer num = null;
        if (d3638978315442423989O != null) {
            Integer numValueOf = Integer.valueOf(d3638978315442423989O.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final D3638978315442423989 o() {
        if (!D3638978315442423989.d()) {
            return null;
        }
        D3638978315442423989 d3638978315442423989A = D3638978315442423989.a();
        if (d3638978315442423989A.c() == 1) {
            return d3638978315442423989A;
        }
        return null;
    }

    public static final Z7022156542152740569 p() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(6.0f, 13.0f);
        v14323974914327418545D.e(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
        v14323974914327418545D.h(6.34f, 7.34f);
        v14323974914327418545D.d(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
        v14323974914327418545D.e(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        v14323974914327418545D.s(-2.02f);
        v14323974914327418545D.d(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(20.0f, 13.0f);
        v14323974914327418545D.e(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        v14323974914327418545D.e(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        v14323974914327418545D.i(1.09f, -1.09f);
        v14323974914327418545D.h(11.5f, 2.5f);
        v14323974914327418545D.h(8.0f, 6.0f);
        v14323974914327418545D.i(3.5f, 3.5f);
        v14323974914327418545D.i(1.41f, -1.41f);
        v14323974914327418545D.i(-1.08f, -1.08f);
        v14323974914327418545D.d(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
        v14323974914327418545D.e(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        v14323974914327418545D.e(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        v14323974914327418545D.s(2.02f);
        v14323974914327418545D.d(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final native List q(A12041196496600152831 a12041196496600152831);

    public static final native String r(String str);

    public static final native G16047348585543571419 s(String str);

    public static final void t(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final native A12041196496600152831 u(F4096073349764486348 f4096073349764486348);

    public static final native void v(A12041196496600152831 a12041196496600152831, L12639328004344855510 l12639328004344855510);

    public abstract Typeface h(Context context, L933758655888641216 l933758655888641216, Resources resources, int i);

    public abstract Typeface i(Context context, J18236984568855953541[] j18236984568855953541Arr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i2) {
        File fileL = T1335862270807194835.l(context);
        if (fileL == null) {
            return null;
        }
        try {
            if (T1335862270807194835.j(fileL, resources, i)) {
                return Typeface.createFromFile(fileL.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileL.delete();
        }
    }
}
